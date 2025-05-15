package calculator.operation.binary;

//Import Junit5 libraries for unit testing:

import calculator.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestDivides extends TestBinaryOperation {

	private final int value1 = 8;
	private final int value2 = 6;
	private Divides op;
	private List<Expression> params;

	@BeforeEach
	void setUp() {
		Configuration.setRealPrecision(5);
		params = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			op = new Divides(params);
			op.notation = Notation.INFIX; // reset the notation to infix (which is the default) before each test
		} catch (IllegalConstruction _) {
			fail();
		}
	}

	@Test
	void testConstructor1() {
		// It should not be possible to create an expression without null parameter list
		assertThrows(IllegalConstruction.class, () -> op = new Divides(null));
	}

	@SuppressWarnings("AssertBetweenInconvertibleTypes")
	@Test
	void testConstructor2() {
		// A Times expression should not be the same as a Divides expression
		try {
			assertNotSame(op, new Times(new ArrayList<>()));
		} catch (IllegalConstruction _) {
			fail();
		}
	}

	@Test
	void testEquals() {
		// Two similar expressions, constructed separately (and using different
		// constructors) should be equal
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			Divides d = new Divides(p, Notation.INFIX);
			assertEquals(op, d);
		} catch (IllegalConstruction _) {
			fail();
		}
	}

	@SuppressWarnings("ConstantConditions")
	@Test
	void testNull() {
		assertDoesNotThrow(() -> op == null); // Direct way to to test if the null case is handled.
	}

	@Test
	void testHashCode() {
		// Two similar expressions, constructed separately (and using different
		// constructors) should have the same hashcode
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			Divides e = new Divides(p, Notation.INFIX);
			assertEquals(e.hashCode(), op.hashCode());
		} catch (IllegalConstruction _) {
			fail();
		}
	}

	@Test
	void testNullParamList() {
		params = null;
		assertThrows(IllegalConstruction.class, () -> op = new Divides(params));
	}


	@Test
	@Override
	public void TestMyIntegerMyInteger() {
		MyNumber exp = op(MyInteger.valueOf(1), MyInteger.valueOf(2));
		assertEquals(MyReal.valueOf(0.5), exp);

		exp = op(MyInteger.valueOf(0), MyInteger.valueOf(0));
		assertEquals(MyUndefinedNumber.class, exp.getClass());

		exp = op(MyInteger.valueOf(1), MyInteger.valueOf(0));
		assertEquals(MyErrorNumber.class, exp.getClass());
		exp = op(MyInteger.valueOf(-1), MyInteger.valueOf(0));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyIntegerMyReal() {
		MyNumber exp = op(MyInteger.valueOf(0), MyReal.valueOf(0));
		assertEquals(MyUndefinedNumber.class, exp.getClass());

		exp = op(MyInteger.valueOf(5), MyReal.valueOf(3.5));
		assertEquals(MyReal.valueOf(1.42857), exp);

		exp = op(MyInteger.valueOf(1), MyReal.valueOf(0));
		assertEquals(new MyInfinity(true), exp);
		exp = op(MyInteger.valueOf(-1), MyReal.valueOf(0));
		assertEquals(new MyInfinity(false), exp);
	}

	@Test
	@Override
	public void TestMyIntegerMyComplex() {
		MyNumber exp = op(MyInteger.valueOf(3), MyComplex.create(1,2));
		assertEquals(MyComplex.create(MyReal.valueOf(0.6), MyReal.valueOf(-1.2)), exp);

		exp = op(MyInteger.valueOf(0), MyComplex.create(1,2));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyIntegerMyRational() {
		MyNumber exp = op(MyInteger.valueOf(3), MyRational.create(1,2));
		assertEquals(MyReal.valueOf(6), exp);
	}

	@Test
	@Override
	public void TestMyIntegerMyInfinity() {
		MyNumber exp = op(MyInteger.valueOf(3), new MyInfinity(true));
		assertEquals(ConstantNumber.ZERO, exp);

		exp = op(MyInteger.valueOf(3), new MyInfinity(false));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyIntegerMyUnknown() {
		MyNumber exp = op(MyInteger.valueOf(3), MyUnknown.create(MyInteger.valueOf(1), MyInteger.valueOf(2)));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyRealMyInteger() {
		MyNumber exp = op(MyReal.valueOf(1.53), MyInteger.valueOf(9));
		assertEquals(MyReal.valueOf(0.17), exp);

		exp = op(MyReal.valueOf(0), MyInteger.valueOf(0));
		assertEquals(MyUndefinedNumber.class, exp.getClass());

		exp = op(MyReal.valueOf(6), MyInteger.valueOf(0));
		assertEquals(new MyInfinity(true), exp);
		exp = op(MyReal.valueOf(-9), MyInteger.valueOf(0));
		assertEquals(new MyInfinity(false), exp);
	}

	@Test
	@Override
	public void TestMyRealMyReal() {
		MyNumber exp = op(MyReal.valueOf(1.53), MyReal.valueOf(12.4));
		assertEquals(MyReal.valueOf(0.123387), exp);

		exp = op(MyReal.valueOf(0), MyReal.valueOf(0));
		assertEquals(MyUndefinedNumber.class, exp.getClass());

		exp = op(MyReal.valueOf(2), MyReal.valueOf(0));
		assertEquals(new MyInfinity(true), exp);
		exp = op(MyReal.valueOf(-2), MyReal.valueOf(0));
		assertEquals(new MyInfinity(false), exp);
	}

	@Test
	@Override
	public void TestMyRealMyComplex() {
		MyNumber exp = op(MyReal.valueOf(3.5), MyComplex.create(1,2));
		assertEquals(MyComplex.create(MyReal.valueOf(0.7), MyReal.valueOf(-1.4)), exp);

		exp = op(MyInteger.valueOf(0), MyComplex.create(1,2));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyRealMyRational() {
		MyNumber exp = op(MyReal.valueOf(3.5), MyRational.create(1,2));
		assertEquals(MyInteger.valueOf(7), exp);
		exp = op(MyReal.valueOf(-3.5), MyRational.create(1,2));
		assertEquals(MyInteger.valueOf(-7), exp);

	}

	@Test
	@Override
	public void TestMyRealMyInfinity() {
		MyNumber exp = op(MyReal.valueOf(3.12), new MyInfinity(true));
		assertEquals(ConstantNumber.ZERO, exp);

		exp = op(MyReal.valueOf(-19.12), new MyInfinity(false));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyRealMyUnknown() {
		MyNumber exp = op(MyReal.valueOf(3.5), MyUnknown.create(MyInteger.valueOf(1), MyInteger.valueOf(2)));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyComplexMyInteger() {
		MyNumber exp = op(MyComplex.create(1, 2), MyInteger.valueOf(2));
		assertEquals(MyComplex.create(MyReal.valueOf(0.5), ConstantNumber.ONE), exp);

		exp = op(MyComplex.create(1, 2), MyInteger.valueOf(0));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyComplexMyReal() {
		MyNumber exp = op(MyComplex.create(1, 2), MyReal.valueOf(2.8));
		assertEquals(MyComplex.create(MyReal.valueOf(0.35714), MyReal.valueOf(0.71429)), exp);

		exp = op(MyComplex.create(1, 2), MyReal.valueOf(0));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyComplexMyComplex() {
		MyNumber exp = op(MyComplex.create(1, 2), MyComplex.create(5, 8));
		assertEquals(MyComplex.create(MyReal.valueOf(0.235955), MyReal.valueOf(0.022471)), exp);
	}

	@Test
	@Override
	public void TestMyComplexMyRational() {
		MyNumber exp = op(MyComplex.create(1, 2), MyRational.create(2, 3));
		assertEquals(MyComplex.create(MyReal.valueOf(1.5), MyReal.valueOf(3)), exp);
	}

	@Test
	@Override
	public void TestMyComplexMyInfinity() {
		MyNumber exp = op(MyComplex.create(1, 2), new MyInfinity(true));
		assertEquals(ConstantNumber.ZERO, exp);

		exp = op(MyComplex.create(1, 2), new MyInfinity(false));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyComplexMyUnknown() {
		MyNumber exp = op(MyComplex.create(3, 2), MyUnknown.create(MyInteger.valueOf(1), MyInteger.valueOf(2)));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyRationalMyInteger() {
		MyNumber exp = op(MyRational.create(3, 4), MyInteger.valueOf(8));
		assertEquals(MyRational.create(3, 32), exp);

		exp = op(MyRational.create(1, 2), MyInteger.valueOf(0));
		assertEquals(new MyInfinity(true), exp);
		exp = op(MyRational.create(-1, 2), MyInteger.valueOf(0));
		assertEquals(new MyInfinity(false), exp);
	}

	@Test
	@Override
	public void TestMyRationalMyReal() {
		MyNumber exp = op(MyRational.create(3, 4), MyReal.valueOf(2.5));
		assertEquals(MyReal.valueOf(0.3), exp);

		exp = op(MyRational.create(1, 2), MyReal.valueOf(0));
		assertEquals(new MyInfinity(true), exp);
		exp = op(MyRational.create(-1, 2), MyReal.valueOf(0));
		assertEquals(new MyInfinity(false), exp);
	}

	@Test
	@Override
	public void TestMyRationalMyComplex() {
		MyNumber exp = op(MyRational.create(3, 4), MyComplex.create(1, 2));
		assertEquals(MyComplex.create(MyReal.valueOf(0.15), MyReal.valueOf(-0.3)), exp);
	}

	@Test
	@Override
	public void TestMyRationalMyRational() {
		MyNumber exp = op(MyRational.create(3, 4), MyRational.create(7, 8));
		assertEquals(MyReal.valueOf(0.85714), exp);
	}

	@Test
	@Override
	public void TestMyRationalMyInfinity() {
		MyNumber exp = op(MyRational.create(1,2), new MyInfinity(true));
		assertEquals(ConstantNumber.ZERO, exp);

		exp = op(MyRational.create(1,2), new MyInfinity(false));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyRationalMyUnknown() {
		MyNumber exp = op(MyRational.create(1, 2), MyUnknown.create(MyInteger.valueOf(5), MyInteger.valueOf(2)));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyInfinityMyInteger() {
		MyNumber exp = op(new MyInfinity(true), MyInteger.valueOf(2));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyInteger.valueOf(-2));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyInteger.valueOf(0));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyInfinityMyReal() {
		MyNumber exp = op(new MyInfinity(true), MyReal.valueOf(2.5));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyReal.valueOf(-2.5));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyInteger.valueOf(0));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyInfinityMyComplex() {
		MyNumber exp = op(new MyInfinity(false), MyComplex.create(1, 2));
		assertEquals(MyErrorNumber.class, exp.getClass());

	}

	@Test
	@Override
	public void TestMyInfinityMyRational() {
		MyNumber exp = op(new MyInfinity(true), MyRational.create(3, 4));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyRational.create(-1, 2));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyInteger.valueOf(0));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyInfinityMyInfinity() {
		MyNumber exp = op(new MyInfinity(true), new MyInfinity(true));
		assertEquals(MyUndefinedNumber.class, exp.getClass());
		exp = op(new MyInfinity(true), new MyInfinity(false));
		assertEquals(MyUndefinedNumber.class, exp.getClass());
		exp = op(new MyInfinity(false), new MyInfinity(false));
		assertEquals(MyUndefinedNumber.class, exp.getClass());
		exp = op(new MyInfinity(false), new MyInfinity(false));
		assertEquals(MyUndefinedNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyInfinityMyUnknown() {
		MyNumber exp = op(new MyInfinity(true), MyUnknown.create(MyInteger.valueOf(5), MyInteger.valueOf(2)));
		assertEquals(MyErrorNumber.class, exp.getClass());
		exp = op(new MyInfinity(false), MyUnknown.create(MyInteger.valueOf(5), MyInteger.valueOf(2)));
		assertEquals(MyErrorNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyUnknownMyInteger() {
		MyUnknown val = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2/2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6/2), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8/2));

		MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8));

		assertEquals(val, op(other, MyInteger.valueOf(2)));

		assertEquals(MyErrorNumber.class, op(other, MyInteger.valueOf(0)).getClass());
	}

	@Test
	@Override
	public void TestMyUnknownMyReal() {
		MyUnknown val = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyReal.valueOf(2/2.5), MyInteger.valueOf(3)),
						new Pair<>(MyReal.valueOf(6/2.5), MyInteger.valueOf(20))
				),
				MyReal.valueOf(8/2.5));

		MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8));

		assertEquals(val, op(other, MyReal.valueOf(2.5)));
		assertEquals(val.getClass(), op(other, MyReal.valueOf(0)).getClass());
	}

	@Test
	@Override
	public void TestMyUnknownMyComplex() {
		MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8));

		assertEquals(MyErrorNumber.class, op(other, MyComplex.create(4,2)).getClass());
	}

	@Test
	@Override
	public void TestMyUnknownMyRational() {
		MyUnknown val = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyReal.valueOf(2/0.5), MyInteger.valueOf(3)),
						new Pair<>(MyReal.valueOf(6/0.5), MyInteger.valueOf(20))
				),
				MyReal.valueOf(8/0.5));

		MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyReal.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyReal.valueOf(6), MyInteger.valueOf(20))
				),
				MyReal.valueOf(8));

		assertEquals(val, op(other, MyRational.create(1,2)));
	}

	@Test
	@Override
	public void TestMyUnknownMyInfinity() {
		MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8));

		assertEquals(ConstantNumber.ZERO, op(other, new MyInfinity(true)));
	}

	@Test
	@Override
	public void TestMyUnknownMyUnknown() {
		MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8));

		assertEquals(MyErrorNumber.class, op(other, other).getClass());
	}

	private MyNumber op(MyNumber a, MyNumber b) {
		return BinaryOperation.op(a, b, Divides::new);
	}
}
