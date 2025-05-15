package calculator;

//Import Junit5 libraries for unit testing:

import calculator.operation.binary.Times;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TestMyComplex {

    private final int imaginary = 3;
    private final int real = 7;
    private MyComplex number;

    @BeforeEach
    void setUp() {
        number = (MyComplex) MyComplex.create(new MyInteger(imaginary), new MyInteger(real));
    }

    @Test
    void testEquals() {
        // Two distinct MyComplex, constructed separately (using a different constructor) but containing the same value should be equal
        assertEquals(MyComplex.create(new MyInteger(imaginary), new MyInteger(real)), number);
        // Two MyComplex containing a distinct value should not be equal:
        int otherImaginary = 7;
        int otherReal = 9;
        assertNotEquals(MyComplex.create(new MyInteger(otherImaginary), new MyInteger(otherReal)),number);
        assertEquals(number, number); // Identity check (for coverage, as this should always be true)
        assertNotEquals(number, imaginary/real); // number is of type MyComplex, while value is of type int, so not equal
        try {
            assertNotEquals(new Times(new ArrayList<>()), number);
        }
        catch (IllegalConstruction e) {fail();}
    }

    @Test
    void testToString() {
        assertEquals(imaginary + " + " + real + "i", number.toString());
        MyNumber nb = MyComplex.create(6, -1);
        assertEquals(6 + " - " + "i", nb.toString());
    }


    @Test
    void testCreate()
    {
        MyNumber c = MyComplex.create(MyInteger.valueOf(5), MyInteger.valueOf(0));
        assertEquals(new MyInteger(5), c);

        c = MyComplex.create(5,2);
        assertEquals(MyComplex.create(MyInteger.valueOf(5), MyInteger.valueOf(2)), c);

        c = MyComplex.create(new MyInteger(2), MyComplex.create(MyInteger.valueOf(1), MyInteger.valueOf(5)));
        assertEquals(MyComplex.create(MyInteger.valueOf(-3), MyInteger.valueOf(1)), c);

        c = MyComplex.create(MyComplex.create(MyInteger.valueOf(4), MyInteger.valueOf(2)), MyInteger.valueOf(5));
        assertEquals(MyComplex.create(MyInteger.valueOf(4), MyInteger.valueOf(7)), c);

        c = MyComplex.create(MyComplex.create(MyInteger.valueOf(1), MyInteger.valueOf(2)), MyComplex.create(MyInteger.valueOf(3), MyInteger.valueOf(4)));
        assertEquals(MyComplex.create(MyInteger.valueOf(-3), MyInteger.valueOf(5)), c);

        c = MyComplex.create(MyInteger.valueOf(1), MyInteger.valueOf(2));
        assertEquals(MyComplex.class, c.getClass());
        MyComplex cc = (MyComplex) c;
        assertEquals(MyInteger.valueOf(1), cc.getRealImaginaryPair().a);
        assertEquals(MyInteger.valueOf(2), cc.getRealImaginaryPair().b);
    }
}
