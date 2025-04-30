package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import calculator.Programmer.ProgrammerException;

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
    @ParameterizedTest
    @CsvSource({
            "00000, 1, 101, 00000_1",
            "1010, 2, 1010, 0b1010",
            "123, 5, 100110, 123_5",
            "1464, 8, 1100110100, 0o1464",
            "123, 10, 1111011, 123",
            "1A45E, 16, 11010010001011110, 0x1A45E",
    })
    void testCreateProgrammer(String num, int base, String binaryNum, String string) throws ProgrammerException {
        Programmer p = new Programmer(num, base);
        assertEquals(p.realNum, num);
        assertEquals(p.base, base);
        assertEquals(p.binaryNum, binaryNum);
        assertEquals(p.toString(), string);
    }

    /**
     * Method used to test whether an error is triggered when an unauthorized number
     * is created.
     * There are two possible errors: either the number uses symbols not authorized
     * by the database, or the database is invalid.
     */
    @ParameterizedTest
    @CsvSource({
            "101010, 1",
            "123, 2",
            "123456, 0",
            "123456, 100",
    })
    void testCreateError(String num, int base) {
        assertThrows(ProgrammerException.class, () -> {
            new Programmer(num, base);
        });
    }

    /**
     * A method for testing the truth values of the different symbols of a number.
     */
    @ParameterizedTest
    @CsvSource({
            "1010, 2",
            "12, 8",
            "10, 10",
            "A, 16",
    })
    void testLogicValue(String num, int base) throws ProgrammerException {
        Programmer p = new Programmer(num, base);
        assertTrue(!p.logicValue(0));
        assertTrue(p.logicValue(1));
        assertTrue(!p.logicValue(2));
        assertTrue(p.logicValue(3));
        assertTrue(!p.logicValue(4));
    }

    /**
     * Method for testing the size of a value.
     */
    @ParameterizedTest
    @CsvSource({
            "1010, 2",
            "12, 8",
            "10, 10",
            "A, 16",
    })
    void testLength(String num, int base) throws ProgrammerException {
        Programmer p = new Programmer(num, base);
        assertEquals(p.length(), 4);
    }

    /**
     * Method for testing the comparison between two values.
     */
    @ParameterizedTest
    @CsvSource({
            "1010, 2, 12, 8",
            "10, 10, A, 16",
    })
    void testEquals(String num1, int base1, String num2, int base2) throws ProgrammerException {
        Programmer p1 = new Programmer(num1, base1);
        Programmer p2 = new Programmer(num2, base2);
        Programmer p3 = new Programmer(num1 + "00", base1);
        assertTrue(p1.equals(p2));
        assertTrue(!p1.equals(p3));
    }

    /**
     * Method for testing whether the conversion between different databases works.
     */
    @ParameterizedTest
    @CsvSource({
            "0000000000, 1, 1010, 2",
            "1010, 2, 1010, 2",
            "1010, 2, 12, 8",
            "1010, 2, 10, 10",
            "1010, 2, A, 16",
            "12, 8, 10, 10",
            "12, 8, A, 16",
            "10, 10, A, 16"
    })
    void testConversion(String num1, int base1, String num2, int base2) throws ProgrammerException {
        Programmer p = new Programmer(num1, base1);
        assertTrue(p.newBase(base2).equals(new Programmer(num2, base2)));
        p = new Programmer(num2, base2);
        assertTrue(p.newBase(base1).equals(new Programmer(num1, base1)));
    }

    /**
     * Method for testing various logical operations on values.
     */
    @Test
    void testOperations() throws ProgrammerException {
        Programmer p1 = new Programmer("0001010", 2);
        Programmer p2 = new Programmer("134", 8);
        assertEquals(ProgrammerOperation.and(p1, p2).toString(), "0o10");
        assertEquals(ProgrammerOperation.or(p1, p2).toString(), "0o136");
        assertEquals(ProgrammerOperation.xor(p1, p2).toString(), "0o126");
        assertEquals(ProgrammerOperation.nand(p1, p2).toString(), "0o167");
        assertEquals(ProgrammerOperation.nor(p1, p2).toString(), "0o41");
        assertEquals(ProgrammerOperation.implication(p1, p2).toString(), "0o175");
        assertEquals(ProgrammerOperation.equivalence(p1, p2).toString(), "0o51");
        assertEquals(ProgrammerOperation.shiftLeft(p1, 2).toString(), "0b0101000");
        assertEquals(ProgrammerOperation.shiftLeft(p2, 2).toString(), "0o160");
        assertEquals(ProgrammerOperation.shiftRight(p1, 2).toString(), "0b0000010");
        assertEquals(ProgrammerOperation.shiftRight(p2, 2).toString(), "0o27");
        assertEquals(ProgrammerOperation.not(p1).toString(), "0b1110101");
        assertEquals(ProgrammerOperation.trunk(p1, 4).toString(), "0b1010");
        assertEquals(ProgrammerOperation.trunk(p1, 10).toString(), "0b");
        assertEquals(ProgrammerOperation.trunk(p1, -3).toString(), "0b0001010");
    }
}
