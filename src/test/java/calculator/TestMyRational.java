package calculator;

//Import Junit5 libraries for unit testing:

import calculator.operation.binary.Times;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TestMyRational {

    private final int numerator = 3;
    private final int denominator = 7;
    private MyRational number;

    @BeforeEach
    void setUp() {
        number = (MyRational) MyRational.create(new MyInteger(numerator), new MyInteger(denominator));
    }

    @Test
    void testEquals() {
        // Two distinct MyRational, constructed separately (using a different
        // constructor) but containing the same value should be equal
        assertEquals(MyRational.create(new MyInteger(numerator), new MyInteger(denominator)), number);
        // Two MyRationals containing a distinct value should not be equal:
        int otherNumerator = 7;
        int otherDenominator = 9;
        assertNotEquals(MyRational.create(new MyInteger(otherNumerator), new MyInteger(otherDenominator)), number);
        assertEquals(number, number); // Identity check (for coverage, as this should always be true)
        assertNotEquals(number, numerator / denominator); // number is of type MyRational, while value is of type int,
                                                          // so not equal
        try {
            assertNotEquals(new Times(new ArrayList<>()), number);
        } catch (IllegalConstruction _) {
            fail();
        }
    }

    @Test
    void testToString() {
        assertEquals(numerator + "/" + denominator, number.toString());
    }

    @Test
    void testIsZero() {
        MyNumber r = MyRational.create(0, 1);
        assertTrue(r.isZero());
    }

    @Test
    void testSimplify() {
        // Integer simplification
        MyNumber r = MyRational.create(4, 2);
        assertEquals(new MyInteger(2), r);
        // Rational simplification
        MyNumber r2 = MyRational.create(6, 4);
        assertEquals(MyRational.create(3, 2), r2);
        // Integer zero simplification
        MyNumber r3 = MyRational.create(0, 6);
        assertEquals(MyInteger.valueOf(0), r3);
    }

    @Test
    void testCreate() {
        // Test that when trying to give a denominator of 0, an error is returned
        MyNumber r = MyRational.create(2, 0);
        assertEquals(MyErrorNumber.class, r.getClass());

        r = MyRational.create(MyInteger.valueOf(2), MyInteger.valueOf(0));
        assertEquals(MyErrorNumber.class, r.getClass());

        r = MyRational.create(BigInteger.valueOf(2), BigInteger.valueOf(0));
        assertEquals(MyErrorNumber.class, r.getClass());

        r = MyRational.create(MyReal.valueOf(2), MyReal.valueOf(2));
        assertEquals(MyInteger.valueOf(1), r);

        r = MyRational.create(MyReal.valueOf(2), MyReal.valueOf(3));
        assertEquals(MyRational.class, r.getClass());
        MyRational rr = (MyRational) r;
        assertEquals(new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)), rr.getNumDenomPair());
    }

    @Test
    void testToRational() {
        MyNumber r = MyRational.toRational(MyReal.valueOf(0.333));
        assertEquals(MyRational.create(333, 1000), r);

        r = MyRational.toRational(MyReal.valueOf(3));
        assertEquals(MyInteger.valueOf(3), r);

        r = MyRational.toRational(MyReal.valueOf(0.5));
        assertEquals(MyRational.create(4, 8), r);
    }

    @Test
    void testGetSign() {
        MyRational r = (MyRational) MyRational.create(2, 3);

        assertEquals(1, r.getSign());
        r = (MyRational) MyRational.create(-2, 3);

        assertEquals(-1, r.getSign());
        r = (MyRational) MyRational.create(2, -3);

        assertEquals(-1, r.getSign());
    }

    @Test
    void testErrorNumbers() {
        MyNumber r = MyRational.create(2, 0);
        assertEquals(MyErrorNumber.class, r.getClass());

        r = MyRational.create(MyInteger.valueOf(2), MyInteger.valueOf(0));
        assertEquals(MyErrorNumber.class, r.getClass());

        r = MyRational.create(BigInteger.valueOf(2), BigInteger.valueOf(0));
        assertEquals(MyErrorNumber.class, r.getClass());

        r = MyRational.toRational(MyReal.valueOf(0.5));
        assertEquals(MyRational.create(4, 8), r);
    }
}
