package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.operation.binary.Times;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

class TestMyComplex {

    private final int imaginary = 3;
    private final int real = 7;
    private MyComplex number;

    @BeforeEach
    void setUp() {
        number = new MyComplex(new MyInteger(imaginary), new MyInteger(real));
    }

    @Test
    void testEquals() {
        // Two distinct MyComplex, constructed separately (using a different constructor) but containing the same value should be equal
        assertEquals(new MyComplex(new MyInteger(imaginary), new MyInteger(real)), number);
        // Two MyComplex containing a distinct value should not be equal:
        int otherImaginary = 7;
        int otherReal = 9;
        assertNotEquals(new MyComplex(new MyInteger(otherImaginary), new MyInteger(otherReal)),number);
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
    }

    @Test
    void testIsZero()
    {
        MyComplex c = new MyComplex(MyInteger.valueOf(0), MyInteger.valueOf(0));
        assertTrue(c.isZero());
    }

    @Test
    void testSimplify()
    {
        MyNumber c = new MyComplex(new MyInteger(1), new MyInteger(0)).simplify();

        assertEquals(new MyInteger(1), c);
    }
}
