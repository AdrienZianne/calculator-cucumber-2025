package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * TestProgrammer
 * Class for testing the operation of values in different databases and the
 * operations performed on them.
 * 
 * {@link Programmer}
 * {@link ProgrammerOperation}
 */
public class TestProgrammer {

    /**
     * Method for testing different value constructors.
     */
    @Test
    void testCreateProgrammer() {
        Programmer p = new Programmer("1010", 2);
        assertEquals(p.getNum(), "1010");
        assertEquals(p.getBase(), 2);
        assertEquals(p.toString(), "1010_2");
        p = new Programmer("1010_2");
        assertEquals(p.toString(), "1010_2");
    }

    /**
     * A method for testing the truth values of the different symbols of a number.
     */
    @Test
    void testLogicValue() {
        Programmer p = new Programmer("1010", 2);
        assertTrue(!p.logicValue(0));
        assertTrue(p.logicValue(1));
        assertTrue(!p.logicValue(2));
        assertTrue(p.logicValue(3));
        assertTrue(!p.logicValue(4));
    }

    /**
     * Method for testing the creation of the negation of a value.
     */
    @Test
    void testNegation() {
        Programmer p = new Programmer("1010_2");
        assertEquals(p.negation(), "0101_2");
    }

    /**
     * Method for testing the creation of value truncation.
     */
    @Test
    void testTrunk() {
        Programmer p = new Programmer("111010_2");
        assertEquals(p.trunk(2).toString(), "1010_2");
        assertEquals(p.trunk(6).toString(), "_2");
        assertEquals(p.trunk(-3).toString(), "111010_2");
    }

    /**
     * Method for testing the size of a value.
     */
    @Test
    void testLength() {
        Programmer p = new Programmer("1010_2");
        assertEquals(p.length(), "1010_2".length());
    }

    /**
     * Method for testing the comparison between two values.
     */
    @Test
    void testEquals() {
        Programmer p1 = new Programmer("1010", 2);
        Programmer p2 = new Programmer("1010_2");
        Programmer p3 = new Programmer("0110100", 2);
        assertTrue(p1.equals(p2));
        assertTrue(!p1.equals(p3));
    }

    /**
     * Method for testing various logical operations on values.
     */
    @Test
    void testOperations() {
        Programmer p1 = new Programmer("0001010_2");
        Programmer p2 = new Programmer("1011100_2");
        assertEquals(ProgrammerOperation.and(p1, p2).toString(), "0001000_2");
        assertEquals(ProgrammerOperation.or(p1, p2).toString(), "1011110_2");
        assertEquals(ProgrammerOperation.nand(p1, p2).toString(), "1110111_2");
        assertEquals(ProgrammerOperation.nor(p1, p2).toString(), "0100001_2");
        assertEquals(ProgrammerOperation.implication(p1, p2).toString(), "1111101_2");
        assertEquals(ProgrammerOperation.and(p1, p2).toString(), "0101001_2");
        assertEquals(ProgrammerOperation.shiftLeft(p1, 2).toString(), "0101000_2");
        assertEquals(ProgrammerOperation.shiftLeft(p2, 2).toString(), "1110000_2");
        assertEquals(ProgrammerOperation.shiftRight(p1, 2).toString(), "0000010_2");
        assertEquals(ProgrammerOperation.shiftRight(p2, 2).toString(), "0010111_2");
    }
}
