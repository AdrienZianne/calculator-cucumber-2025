package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.operation.binary.Times;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.ArrayList;

class TestMyReal {

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
        catch (IllegalConstruction e) {fail();}
    }

    @Test
    void testIsZero()
    {
        MyReal r = new MyReal(BigDecimal.valueOf(0));
        assertTrue(r.isZero());
    }

    @Test
    void testToString() {
        assertEquals(BigDecimal.valueOf(value).setScale(Configuration.getRealPrecision(), MyReal.ROUNDING_MODE).toString(),
                    number.toString());
    }

}
