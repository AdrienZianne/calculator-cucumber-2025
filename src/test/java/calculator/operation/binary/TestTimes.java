package calculator.operation.binary;

//Import Junit5 libraries for unit testing:

import calculator.*;
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
		  catch(IllegalConstruction _) { fail(); }
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
		} catch (IllegalConstruction _) {
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
		catch(IllegalConstruction _) { fail(); }
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
		catch(IllegalConstruction _) { fail(); }
	}

	@Test
	void testNullParamList() {
		params = null;
		assertThrows(IllegalConstruction.class, () -> op = new Times(params));
	}

	@Test
	@Override
	public void TestMyIntegerMyInteger() {
		MyNumber exp = op(MyInteger.valueOf(1), MyInteger.valueOf(2));
		assertEquals(MyInteger.valueOf(2), exp);

		exp = op(MyInteger.valueOf(0), MyInteger.valueOf(0));
		assertEquals(MyInteger.valueOf(0), exp);

		exp = op(MyInteger.valueOf(1), MyInteger.valueOf(0));
		assertEquals(MyInteger.valueOf(0), exp);
		exp = op(MyInteger.valueOf(-1), MyInteger.valueOf(0));
		assertEquals(MyInteger.valueOf(0), exp);
	}

	@Test
	@Override
	public void TestMyIntegerMyReal() {
		MyNumber exp = op(MyInteger.valueOf(0), MyReal.valueOf(0));
		assertEquals(MyInteger.valueOf(0), exp);

		exp = op(MyInteger.valueOf(5), MyReal.valueOf(3.5));
		assertEquals(MyReal.valueOf(17.5), exp);
	}

	@Test
	@Override
	public void TestMyIntegerMyComplex() {
		MyNumber exp = op(MyInteger.valueOf(3), MyComplex.create(1,2));
		assertEquals(MyComplex.create(MyReal.valueOf(3), MyReal.valueOf(6)), exp);

		exp = op(MyInteger.valueOf(0), MyComplex.create(1,2));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyIntegerMyRational() {
		MyNumber exp = op(MyInteger.valueOf(3), MyRational.create(1,2));
		assertEquals(MyReal.valueOf(1.5), exp);
	}

	@Test
	@Override
	public void TestMyIntegerMyInfinity() {
		MyNumber exp = op(MyInteger.valueOf(3), new MyInfinity(true));
		assertEquals(new MyInfinity(true), exp);

		exp = op(MyInteger.valueOf(3), new MyInfinity(false));
		assertEquals(new MyInfinity(false), exp);
	}

	@Test
	@Override
	public void TestMyIntegerMyUnknown() {
		MyNumber exp = op(MyInteger.valueOf(3), MyUnknown.create(MyInteger.valueOf(1), MyInteger.valueOf(2)));
		assertEquals(MyUnknown.create(MyInteger.valueOf(3), MyInteger.valueOf(6)), exp);
	}

	@Test
	@Override
	public void TestMyRealMyInteger() {
		MyNumber exp = op(MyReal.valueOf(1.53), MyInteger.valueOf(9));
		assertEquals(MyReal.valueOf(13.77), exp);

		exp = op(MyReal.valueOf(0), MyInteger.valueOf(0));
		assertEquals(MyReal.valueOf(0), exp);

		exp = op(MyReal.valueOf(6), MyInteger.valueOf(0));
		assertEquals(MyReal.valueOf(0), exp);
		exp = op(MyReal.valueOf(-9), MyInteger.valueOf(0));
		assertEquals(MyReal.valueOf(0), exp);
	}

	@Test
	@Override
	public void TestMyRealMyReal() {
		MyNumber exp = op(MyReal.valueOf(1.53), MyReal.valueOf(12.4));
		assertEquals(MyReal.valueOf(18.972), exp);

		exp = op(MyReal.valueOf(0), MyReal.valueOf(0));
		assertEquals(MyReal.valueOf(0), exp);

		exp = op(MyReal.valueOf(2), MyReal.valueOf(0));
		assertEquals(MyReal.valueOf(0), exp);
		exp = op(MyReal.valueOf(-2), MyReal.valueOf(0));
		assertEquals(MyReal.valueOf(0), exp);
	}

	@Test
	@Override
	public void TestMyRealMyComplex() {
		MyNumber exp = op(MyReal.valueOf(3.5), MyComplex.create(1,2));
		assertEquals(MyComplex.create(MyReal.valueOf(3.5), MyReal.valueOf(7)), exp);

		exp = op(MyInteger.valueOf(0), MyComplex.create(1,2));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyRealMyRational() {
		MyNumber exp = op(MyReal.valueOf(3.5), MyRational.create(1,2));
		assertEquals(MyRational.create(7, 4), exp);
		exp = op(MyReal.valueOf(-3.5), MyRational.create(1,2));
		assertEquals(MyRational.create(7, -4), exp);
	}

	@Test
	@Override
	public void TestMyRealMyInfinity() {
		MyNumber exp = op(MyReal.valueOf(3.12), new MyInfinity(true));
		assertEquals(new MyInfinity(true), exp);

		exp = op(MyReal.valueOf(-19.12), new MyInfinity(false));
		assertEquals(new MyInfinity(true), exp);
	}

	@Test
	@Override
	public void TestMyRealMyUnknown() {
		MyNumber exp = op(MyReal.valueOf(3.5), MyUnknown.create(MyInteger.valueOf(1), MyInteger.valueOf(2)));
		assertEquals( MyUnknown.create(MyReal.valueOf(3.5), MyReal.valueOf(7)), exp);
	}

	@Test
	@Override
	public void TestMyComplexMyInteger() {
		MyNumber exp = op(MyComplex.create(1, 2), MyInteger.valueOf(2));
		assertEquals(MyComplex.create(MyReal.valueOf(2), MyReal.valueOf(4)), exp);

		exp = op(MyComplex.create(1, 2), MyInteger.valueOf(0));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyComplexMyReal() {
		MyNumber exp = op(MyComplex.create(1, 2), MyReal.valueOf(2.8));
		assertEquals(MyComplex.create(MyReal.valueOf(2.8), MyReal.valueOf(2.8 * 2)), exp);

		exp = op(MyComplex.create(1, 2), MyReal.valueOf(0));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyComplexMyComplex() {
		MyNumber exp = op(MyComplex.create(1, 2), MyComplex.create(5, 8));
		assertEquals(MyComplex.create(MyReal.valueOf(-11), MyReal.valueOf(18)), exp);
	}

	@Test
	@Override
	public void TestMyComplexMyRational() {
		MyNumber exp = op(MyComplex.create(1, 2), MyRational.create(2, 3));
		assertEquals(MyComplex.create(MyRational.create(2, 3), MyRational.create(4, 3)), exp);
	}

	@Test
	@Override
	public void TestMyComplexMyInfinity() {
		MyNumber exp = op(MyComplex.create(1, 2), new MyInfinity(true));
		assertEquals(new MyInfinity(true), exp);

		exp = op(MyComplex.create(1, 2), new MyInfinity(false));
		assertEquals(new MyInfinity(false), exp);
	}

	@Test
	@Override
	public void TestMyComplexMyUnknown() {
		MyNumber exp = op(MyComplex.create(3, 2), MyUnknown.create(MyInteger.valueOf(1), MyInteger.valueOf(2)));
		assertEquals(MyUnknown.create(MyComplex.create(3, 2),
						MyComplex.create(6, 4)),
				exp);
	}

	@Test
	@Override
	public void TestMyRationalMyInteger() {
		MyNumber exp = op(MyRational.create(3, 4), MyInteger.valueOf(8));
		assertEquals(MyRational.create(8 * 3, 4), exp);

		exp = op(MyRational.create(1, 2), MyInteger.valueOf(0));
		assertEquals(ConstantNumber.ZERO, exp);
		exp = op(MyRational.create(-1, 2), MyInteger.valueOf(0));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyRationalMyReal() {
		MyNumber exp = op(MyRational.create(3, 4), MyReal.valueOf(2.5));
		assertEquals(MyRational.create(15, 8), exp);

		exp = op(MyRational.create(1, 2), MyReal.valueOf(0));
		assertEquals(ConstantNumber.ZERO, exp);
		exp = op(MyRational.create(-1, 2), MyReal.valueOf(0));
		assertEquals(ConstantNumber.ZERO, exp);
	}

	@Test
	@Override
	public void TestMyRationalMyComplex() {
		MyNumber exp = op(MyRational.create(3, 4), MyComplex.create(1, 2));
		assertEquals(MyComplex.create(MyReal.valueOf(0.75), MyRational.create(3, 2)), exp);
	}

	@Test
	@Override
	public void TestMyRationalMyRational() {
		MyNumber exp = op(MyRational.create(3, 4), MyRational.create(7, 8));
		assertEquals(MyRational.create(21, 32), exp);
	}

	@Test
	@Override
	public void TestMyRationalMyInfinity() {
		MyNumber exp = op(MyRational.create(1,2), new MyInfinity(true));
		assertEquals(new MyInfinity(true), exp);

		exp = op(MyRational.create(1,2), new MyInfinity(false));
		assertEquals(new MyInfinity(false), exp);
	}

	@Test
	@Override
	public void TestMyRationalMyUnknown() {
		MyNumber exp = op(MyRational.create(1, 2), MyUnknown.create(MyInteger.valueOf(5), MyInteger.valueOf(2)));
		assertEquals( MyUnknown.create(MyReal.valueOf(2.5), MyReal.valueOf(1)), exp);
	}

	@Test
	@Override
	public void TestMyInfinityMyInteger() {
		MyNumber exp = op(new MyInfinity(true), MyInteger.valueOf(2));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyInteger.valueOf(-2));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyInteger.valueOf(0));
		assertEquals(MyUndefinedNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyInfinityMyReal() {
		MyNumber exp = op(new MyInfinity(true), MyReal.valueOf(2.5));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyReal.valueOf(-2.5));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyInteger.valueOf(0));
		assertEquals(MyUndefinedNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyInfinityMyComplex() {
		MyNumber exp = op(new MyInfinity(false), MyComplex.create(1, 2));
		assertEquals(new MyInfinity(false), exp);

	}

	@Test
	@Override
	public void TestMyInfinityMyRational() {
		MyNumber exp = op(new MyInfinity(true), MyRational.create(3, 4));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyRational.create(-1, 2));
		assertEquals(new MyInfinity(true), exp);

		exp = op(new MyInfinity(false), MyInteger.valueOf(0));
		assertEquals(MyUndefinedNumber.class, exp.getClass());
	}

	@Test
	@Override
	public void TestMyInfinityMyInfinity() {
		MyNumber exp = op(new MyInfinity(true), new MyInfinity(true));
		assertEquals(new MyInfinity(true), exp);
		exp = op(new MyInfinity(true), new MyInfinity(false));
		assertEquals(new MyInfinity(false), exp);
		exp = op(new MyInfinity(false), new MyInfinity(false));
		assertEquals(new MyInfinity(true), exp);
		exp = op(new MyInfinity(false), new MyInfinity(true));
		assertEquals(new MyInfinity(false), exp);
	}

	@Test
	@Override
	public void TestMyInfinityMyUnknown() {
		MyNumber exp = op(new MyInfinity(true), MyUnknown.create(MyInteger.valueOf(5), MyInteger.valueOf(2)));
		assertEquals(MyUnknown.create(new MyInfinity(true), new MyInfinity( true)), exp);
		exp = op(new MyInfinity(false), MyUnknown.create(MyInteger.valueOf(5), MyInteger.valueOf(2)));
		assertEquals(MyUnknown.create(new MyInfinity(false), new MyInfinity( false)), exp);
	}

	@Test
	@Override
	public void TestMyUnknownMyInteger() {
		MyUnknown val = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2*2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6*2), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8*2));

		MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8));

		assertEquals(val, op(other, MyInteger.valueOf(2)));

		assertEquals(MyInteger.valueOf(0), op(other, MyInteger.valueOf(0)));
	}

	@Test
	@Override
	public void TestMyUnknownMyReal() {
		MyUnknown val = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyReal.valueOf(2*2.5), MyInteger.valueOf(3)),
						new Pair<>(MyReal.valueOf(6*2.5), MyInteger.valueOf(20))
				),
				MyReal.valueOf(8*2.5));

		MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8));

		assertEquals(val, op(other, MyReal.valueOf(2.5)));
	}

	@Test
	@Override
	public void TestMyUnknownMyComplex() {
		MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8));

		assertEquals(MyUnknown.create(List.of(
						new Pair<>(MyComplex.create(8, 4), MyInteger.valueOf(3)),
						new Pair<>(MyComplex.create(24, 12), MyInteger.valueOf(20))
					),
					MyComplex.create(32, 16)),
				op(other, MyComplex.create(4,2)));
	}

	@Test
	@Override
	public void TestMyUnknownMyRational() {
		MyUnknown val = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyReal.valueOf(2*0.5), MyInteger.valueOf(3)),
						new Pair<>(MyReal.valueOf(6*0.5), MyInteger.valueOf(20))
				),
				MyReal.valueOf(8*0.5));

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

		assertEquals(MyUnknown.create(List.of(
						new Pair<>(new MyInfinity(true), MyInteger.valueOf(3)),
						new Pair<>(new MyInfinity(true), MyInteger.valueOf(20))
				),
				new MyInfinity(true)), op(other, new MyInfinity(true)));
	}

	@Test
	@Override
	public void TestMyUnknownMyUnknown() {
		MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				),
				MyInteger.valueOf(8));

		assertEquals(MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(36), MyInteger.valueOf(40)),
						new Pair<>(MyInteger.valueOf(24), MyInteger.valueOf(23)),
						new Pair<>(MyInteger.valueOf(96), MyInteger.valueOf(20)),
						new Pair<>(MyInteger.valueOf(4), MyInteger.valueOf(6)),
						new Pair<>(MyInteger.valueOf(32), MyInteger.valueOf(3))
				),
				MyInteger.valueOf(64)), op(other, other));
	}


	private MyNumber op(MyNumber a, MyNumber b) {
		return BinaryOperation.op(a, b, Times::new);
	}
}
