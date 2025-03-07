package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestDivides {

	private final int value1 = 8;
	private final int value2 = 6;
	private Operation op;
	private List<Expression> params;

	@BeforeEach
	void setUp() {
		  params = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		  try {
		  	op = new Operation(params, Operation.Type.DIVIDES);
			op.notation = Notation.INFIX; // reset the notation to infix (which is the default) before each test
		  }
		  catch(IllegalConstruction e) { fail(); }
	}

	@Test
	void testConstructor1() {
		// It should not be possible to create an expression without null parameter list
		assertThrows(IllegalConstruction.class, () -> op = new Operation(null, Operation.Type.DIVIDES));
	}

	@SuppressWarnings("AssertBetweenInconvertibleTypes")
	@Test
	void testConstructor2() {
		// A Times expression should not be the same as a Divides expression
		try {
			assertNotSame(op, new Operation(new ArrayList<>(), Operation.Type.TIMES));
		} catch (IllegalConstruction e) {
			fail();
		}
	}

	@Test
	void testEquals() {
		// Two similar expressions, constructed separately (and using different constructors) should be equal
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			Operation d = new Operation(p, Notation.INFIX, Operation.Type.DIVIDES);
			assertEquals(op, d);
		}
		catch(IllegalConstruction e) { fail(); }
	}

	@SuppressWarnings("ConstantConditions")
	@Test
	void testNull() {
		assertDoesNotThrow(() -> op==null); // Direct way to to test if the null case is handled.
	}

	@Test
	void testHashCode() {
		// Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			Operation e = new Operation(p, Notation.INFIX, Operation.Type.DIVIDES);
			assertEquals(e.hashCode(), op.hashCode());
		}
		catch(IllegalConstruction e) { fail(); }
	}

	@Test
	void testNullParamList() {
		params = null;
		assertThrows(IllegalConstruction.class, () -> op = new Operation(params, Operation.Type.DIVIDES));
	}

	@Test
	void testDivisionByZeroError() throws IllegalConstruction {
		Operation op1 = new Operation(new ArrayList<>(), Operation.Type.DIVIDES);

		assertEquals(Integer.MAX_VALUE, op1.op(new MyInteger(5), new MyInteger(0)));
		assertEquals(Integer.MIN_VALUE, op1.op(new MyInteger(-5), new MyInteger(0)));
	}

}
