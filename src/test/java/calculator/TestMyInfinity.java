package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMyInfinity {

    @Test
    void testEquals() {
        assertEquals(new MyInfinity(true), new MyInfinity(true));
        assertEquals(new MyInfinity(false), new MyInfinity(false));
        assertNotEquals(new MyInfinity(false), new MyInfinity(true));
        assertNotEquals(new MyInfinity(true), new MyInfinity(false));
    }

    @Test
    void testIsZero() {
        assertFalse(new MyInfinity(true).isZero());
        assertFalse(new MyInfinity(false).isZero());
    }

    @Test
    void testGetSign() {
        assertTrue(new MyInfinity(true).getSign() > 0);
        assertTrue(new MyInfinity(false).getSign() < 0);
    }

    @Test
    void testIsPositive() {
        assertTrue(new MyInfinity(true).isPositive());
        assertFalse(new MyInfinity(false).isPositive());
    }
}
