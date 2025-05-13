package calculator.operation.binary;

//Import Junit5 libraries for unit testing:

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.MyInteger;
import calculator.Notation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestTimes extends TestBinaryOperation {

	private final int value1 = 8;
	private final int value2 = 6;
	private Times op;
	private List<Expression> params;

	@BeforeEach
	void setUp() {
		  params = Arrays.asList(new MyInteger(value1),new MyInteger(value2));
		  try { op = new Times(params); }
		  catch(IllegalConstruction e) { fail(); }
	}

	@Test
	void testConstructor1() {
		// It should not be possible to create an expression without null parameter list
		assertThrows(IllegalConstruction.class, () -> op = new Times(null));
	}

	@Test
	void testConstructor2() {
		// A Plus expression should not be the same as a Times expression
		try {
			assertNotSame(op, new Plus(new ArrayList<>()));
		} catch (IllegalConstruction e) {
			fail();
		}
	}

	@Test
	void testEquals() {
		// Two similar expressions, constructed separately (and using different constructors) should not be equal
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			Times e = new Times(p, Notation.INFIX);
			assertEquals(op, e);
		}
		catch(IllegalConstruction e) { fail(); }
	}

	@Test
	void testNull() {
		assertDoesNotThrow(() -> op==null); // Direct way to test if the null case is handled.
	}

	@Test
	void testHashCode() {
		// Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			Times e = new Times(p, Notation.INFIX);
			assertEquals(e.hashCode(), op.hashCode());
		}
		catch(IllegalConstruction e) { fail(); }
	}

	@Test
	void testNullParamList() {
		params = null;
		assertThrows(IllegalConstruction.class, () -> op = new Times(params));
	}

	@Test
    @Override
	public void TestMyIntegerMyInteger() {

	}

	@Test
    @Override
	public void TestMyIntegerMyReal() {

	}

	@Test
    @Override
	public void TestMyIntegerMyComplex() {

	}

	@Test
    @Override
	public void TestMyIntegerMyRational() {

	}

	@Test
    @Override
	public void TestMyIntegerMyInfinity() {

	}

	@Test
    @Override
	public void TestMyIntegerMyUnknown() {

	}

	@Test
    @Override
	public void TestMyRealMyInteger() {

	}

	@Test
    @Override
	public void TestMyRealMyReal() {

	}

	@Test
    @Override
	public void TestMyRealMyComplex() {

	}

	@Test
    @Override
	public void TestMyRealMyRational() {

	}

	@Test
    @Override
	public void TestMyRealMyInfinity() {

	}

	@Test
    @Override
	public void TestMyRealMyUnknown() {

	}

	@Test
    @Override
	public void TestMyComplexMyInteger() {

	}

	@Test
    @Override
	public void TestMyComplexMyReal() {

	}

	@Test
    @Override
	public void TestMyComplexMyComplex() {

	}

	@Test
    @Override
	public void TestMyComplexMyRational() {

	}

	@Test
    @Override
	public void TestMyComplexMyInfinity() {

	}

	@Test
    @Override
	public void TestMyComplexMyUnknown() {

	}

	@Test
    @Override
	public void TestMyRationalMyInteger() {

	}

	@Test
    @Override
	public void TestMyRationalMyReal() {

	}

	@Test
    @Override
	public void TestMyRationalMyComplex() {

	}

	@Test
    @Override
	public void TestMyRationalMyRational() {

	}

	@Test
    @Override
	public void TestMyRationalMyInfinity() {

	}

	@Test
    @Override
	public void TestMyRationalMyUnknown() {

	}

	@Test
    @Override
	public void TestMyInfinityMyInteger() {

	}

	@Test
    @Override
	public void TestMyInfinityMyReal() {

	}

	@Test
    @Override
	public void TestMyInfinityMyComplex() {

	}

	@Test
    @Override
	public void TestMyInfinityMyRational() {

	}

	@Test
    @Override
	public void TestMyInfinityMyInfinity() {

	}

	@Test
    @Override
	public void TestMyInfinityMyUnknown() {

	}

	@Test
    @Override
	public void TestMyUnknownMyInteger() {

	}

	@Test
    @Override
	public void TestMyUnknownMyReal() {

	}

	@Test
    @Override
	public void TestMyUnknownMyComplex() {

	}

	@Test
    @Override
	public void TestMyUnknownMyRational() {

	}

	@Test
    @Override
	public void TestMyUnknownMyInfinity() {

	}

	@Test
    @Override
	public void TestMyUnknownMyUnknown() {

	}
}
