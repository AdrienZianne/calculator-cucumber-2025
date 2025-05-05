package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.operation.binary.Times;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

class TestMyInteger {
	@FunctionalInterface
	interface TestIsFunction{
		boolean isValue(MyInteger r);
	}

	private final int value =8;
	private MyInteger number;
	
	@BeforeEach
	void setUp() {
		number = new MyInteger(value);
	}

	@Test
	void testEquals() {
		// Two distinct MyInteger, constructed separately (using a different constructor) but containing the same value should be equal
		assertEquals(new MyInteger(value), number);
		// Two MyIntegers containing a distinct value should not be equal:
		int otherValue = 7;
		assertNotEquals(new MyInteger(otherValue),number);
		assertEquals(number, number); // Identity check (for coverage, as this should always be true)
		assertNotEquals(number, value); // number is of type MyInteger, while value is of type int, so not equal
		try {
			assertNotEquals(new Times(new ArrayList<>()), number);
		}
		catch (IllegalConstruction e) {fail();}
	}


	@Test
	void testValueOf() {
		assertEquals(new MyInteger(2), MyInteger.valueOf(2));
		assertEquals(new MyInteger(3), MyInteger.valueOf(BigInteger.valueOf(3)));
	}

	@Test
	void testToString() {
		assertEquals(Integer.toString(value), number.toString());
	}

	@Test
	void testIsZero()
	{
		MyInteger i = MyInteger.valueOf(0);
		assertTrue(i.isZero());

		i = MyInteger.valueOf(1);
		assertFalse(i.isZero());
	}

	@Test
	void testGetSign()
	{
		MyInteger i = MyInteger.valueOf(0);
		assertEquals(0, i.getSign());

		i = MyInteger.valueOf(2);
		assertEquals(1, i.getSign());

		i = MyInteger.valueOf(-2);
		assertEquals(-1, i.getSign());
	}


	@Test
	void testIsInt()
	{
		MyInteger i = new MyInteger(BigInteger.valueOf(1));
		assertTrue(i.isInt());
		i = new MyInteger(BigInteger.valueOf(-1));
		assertTrue(i.isInt());

		maxMinValue(BigInteger.valueOf(Integer.MAX_VALUE),
				BigInteger.valueOf(Integer.MIN_VALUE),
				MyInteger::isInt);
	}

	void maxMinValue(BigInteger max, BigInteger min, TestIsFunction fn)
	{
		MyInteger i = new MyInteger(max);
		assertTrue(fn.isValue(i));

		i = new MyInteger(min);
		assertTrue(fn.isValue(i));

		i = new MyInteger(max.add(BigInteger.ONE));
		assertFalse(fn.isValue(i));

		i = new MyInteger(min.subtract(BigInteger.ONE));
		assertFalse(fn.isValue(i));
	}



}
