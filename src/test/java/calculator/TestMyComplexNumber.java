package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

class TestMyComplexNumber {

    private final int imaginary = 3;
    private final int real = 7;
    private MyComplexNumber number;

    @BeforeEach
    void setUp() {
        number = new MyComplexNumber(new MyInteger(imaginary), new MyInteger(real));
    }

    @Test
    void testEquals() {
        // Two distinct MyComplex, constructed separately (using a different constructor) but containing the same value should be equal
        assertEquals(new MyComplexNumber(new MyInteger(imaginary), new MyInteger(real)), number);
        // Two MyComplex containing a distinct value should not be equal:
        int otherImaginary = 7;
        int otherReal = 9;
        assertNotEquals(new MyComplexNumber(new MyInteger(otherImaginary), new MyInteger(otherReal)),number);
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

}
