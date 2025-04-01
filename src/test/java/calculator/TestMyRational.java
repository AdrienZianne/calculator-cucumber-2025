package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.operation.Times;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

class TestMyRational {

    private final int numerator = 3;
    private final int denominator = 7;
    private MyRational number;

    @BeforeEach
    void setUp() {
        number = new MyRational(new MyInteger(numerator), new MyInteger(denominator));
    }

    @Test
    void testEquals() {
        // Two distinct MyRational, constructed separately (using a different constructor) but containing the same value should be equal
        assertEquals(new MyRational(new MyInteger(numerator), new MyInteger(denominator)), number);
        // Two MyRationals containing a distinct value should not be equal:
        int otherNumerator = 7;
        int otherDenominator = 9;
        assertNotEquals(new MyRational(new MyInteger(otherNumerator), new MyInteger(otherDenominator)),number);
        assertEquals(number, number); // Identity check (for coverage, as this should always be true)
        assertNotEquals(number, numerator/denominator); // number is of type MyRational, while value is of type int, so not equal
        try {
            assertNotEquals(new Times(new ArrayList<>()), number);
        }
        catch (IllegalConstruction e) {fail();}
    }

    @Test
    void testToString() {
        assertEquals(numerator + "/" + denominator, number.toString());
    }

    @Test
    void testIsZero()
    {
        MyRational r = new MyRational(0, 1);
        assertTrue(r.isZero());
    }

    @Test
    void testSimplify() {
        // Integer simplification
        MyNumber r = new MyRational(4, 2).simplify();
        assertEquals(new MyInteger(2), r);
        // Rational simplification
        MyNumber r2 = new MyRational(6, 4).simplify();
        assertEquals(new MyRational(3, 2), r2);
        // Integer zero simplification
        MyNumber r3 = new MyRational(0, 6).simplify();
        assertEquals(MyInteger.valueOf(0), r3);
    }
}
