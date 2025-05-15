package calculator;

//Import Junit5 libraries for unit testing:

import calculator.operation.binary.Times;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TestMyReal {
    @FunctionalInterface
    interface TestIsFunction{
        boolean isValue(MyReal r);
    }
     @BeforeEach
     void setup() {
        Configuration.setRealPrecision(5);
     }

    private final double value =8.5;
    private MyReal number;

    @BeforeEach
    void setUp() {
        number = new MyReal(value);
    }

    @Test
    void testEquals() {
        // Two distinct MyReal, constructed separately (using a different constructor) but containing the same value should be equal
        assertEquals(new MyReal(value), number);
        // Two MyReals containing a distinct value should not be equal:
        double otherValue = 7.5;
        assertNotEquals(new MyReal(otherValue),number);
        assertEquals(number, number); // Identity check (for coverage, as this should always be true)
        assertNotEquals(number, value); // number is of type MyReal, while value is of type int, so not equal
        try {
            assertNotEquals(new Times(new ArrayList<>()), number);
        }
        catch (IllegalConstruction _) {fail();}
    }

    @Test
    void testIsZero()
    {
        MyReal r = new MyReal(BigDecimal.valueOf(0));
        assertTrue(r.isZero());
    }

    @Test
    void testIsInt()
    {
        MyReal r = new MyReal(BigDecimal.valueOf(1));
        assertTrue(r.isInt());
        r = new MyReal(BigDecimal.valueOf(-1));
        assertTrue(r.isInt());

        maxMinValue(BigDecimal.valueOf(Integer.MAX_VALUE),
                    BigDecimal.valueOf(Integer.MIN_VALUE),
                    MyReal::isInt);
    }

    @Test
    void testIsLong()
    {
        MyReal r = new MyReal(BigDecimal.valueOf(1));
        assertTrue(r.isLong());

        r = new MyReal(BigDecimal.valueOf(1.1));
        assertFalse(r.isLong());

        maxMinValue(BigDecimal.valueOf(Long.MAX_VALUE),
                    BigDecimal.valueOf(Long.MIN_VALUE),
                    MyReal::isLong);
    }

    @Test
    void testIsDouble()
    {
        Configuration.setRealPrecision(3);
        MyReal r = new MyReal(BigDecimal.valueOf(0.01));
        assertTrue(r.isDouble());

        r = new MyReal(BigDecimal.valueOf(Double.MAX_VALUE));
        assertTrue(r.isDouble());

        r = new MyReal(BigDecimal.valueOf(Double.MAX_VALUE).add(BigDecimal.ONE));
        assertFalse(r.isDouble());

    }

    @Test
    void testConfigPrecision()
    {
        Configuration.setRealPrecision(1);
        MyReal r = new MyReal(BigDecimal.valueOf(0.1));
        assertEquals(BigDecimal.valueOf(0.1), r.getValue());

        Configuration.setRealPrecision(2);
        r = new MyReal(BigDecimal.valueOf(0.01));
        assertEquals(BigDecimal.valueOf(0.01), r.getValue());

        r = new MyReal(BigDecimal.valueOf(0.001));
        assertEquals(BigDecimal.valueOf(0.0).setScale(Configuration.getRealPrecision(),
                        Configuration.getRealRoundingMode()),
                r.getValue());

        r = new MyReal(BigDecimal.valueOf(0.005));
        assertEquals(BigDecimal.valueOf(0.01).setScale(Configuration.getRealPrecision(),
                        Configuration.getRealRoundingMode()),
                r.getValue());

        r = new MyReal(BigDecimal.valueOf(0.004));
        assertEquals(BigDecimal.valueOf(0.00).setScale(Configuration.getRealPrecision(),
                        Configuration.getRealRoundingMode()),
                r.getValue());
    }

    void maxMinValue(BigDecimal max, BigDecimal min, TestIsFunction fn)
    {
        MyReal r = new MyReal(max);
        assertTrue(fn.isValue(r));

        r = new MyReal(min);
        assertTrue(fn.isValue(r));

        r = new MyReal(max.add(BigDecimal.ONE));
        assertFalse(fn.isValue(r));

        r = new MyReal(min.subtract(BigDecimal.ONE));
        assertFalse(fn.isValue(r));
    }

    @Test
    void testGetSign()
    {
        MyReal r = new MyReal(BigDecimal.valueOf(1));
        assertEquals(1, r.getSign());

        r = new MyReal(BigDecimal.valueOf(-1));

        assertEquals(-1, r.getSign());

        r = new MyReal(BigDecimal.valueOf(0));

        assertEquals(0, r.getSign());
    }

    @Test
    void testValueOf()
    {
        assertEquals(new MyInteger(2), MyInteger.valueOf(2));
    }

    @Test
    void testToReal()
    {
        MyReal r = MyReal.toReal(MyInteger.valueOf(1));
        assertEquals(MyReal.valueOf(1), r);

        Configuration.setRealPrecision(3);
        r = MyReal.toReal((MyRational) MyRational.create(MyInteger.valueOf(1),MyInteger.valueOf(3)));
        assertEquals(MyReal.valueOf(0.333), r);

        r = MyReal.toReal((MyRational) MyRational.create(MyInteger.valueOf(2),MyInteger.valueOf(3)));
        assertEquals(MyReal.valueOf(0.6667), r);
    }

    @Test
    void testToString() {
        assertEquals(BigDecimal.valueOf(value).setScale(Configuration.getRealPrecision(), Configuration.getRealRoundingMode()).stripTrailingZeros().toString(),
                    number.toString());
    }

}
