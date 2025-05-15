package calculator.operation.binary;

//Import Junit5 libraries for unit testing:

import calculator.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestPlus extends TestBinaryOperation {

	private final int value1 = 8;
	private final int value2 = 6;
	private Plus op;
	private List<Expression> params;

	@BeforeEach
	void setUp() {
		  params = new ArrayList<>(Arrays.asList(new MyInteger(value1),new MyInteger(value2)));
		  try { op = new Plus(params); }
		  catch(IllegalConstruction _) { fail(); }
	}

	@Test
	void testConstructor1() {
		// It should not be possible to create a Plus expression without null parameter list
		assertThrows(IllegalConstruction.class, () -> op = new Plus(null));
	}

	@SuppressWarnings("AssertBetweenInconvertibleTypes")
	@Test
	void testConstructor2() {
		// A Times expression should not be the same as a Plus expression
		try {
			assertNotSame(new Times(new ArrayList<>()), op);
		} catch (IllegalConstruction _) {
			fail();
		}
	}

	@Test
	void testEquals() {
		// Two similar expressions, constructed separately (and using different constructors) should be equal
		ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyInteger(value1), new MyInteger(value2)));
		try {
			Plus e = new Plus(p, Notation.INFIX);
			assertEquals(op, e);
			assertEquals(e, e);
			assertNotEquals(e, new Plus(new ArrayList<>(Arrays.asList(new MyInteger(5), new MyInteger(4))), Notation.INFIX));
		}
		catch(IllegalConstruction _) { fail(); }
	}

	@SuppressWarnings("ConstantConditions")
	@Test
	void testNull() {
			assertDoesNotThrow(() -> op==null); // Direct way to test if the null case is handled.
	}

	@Test
	void testHashCode() {
		// Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
		ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyInteger(value1), new MyInteger(value2)));
		try {
			Plus e = new Plus(p, Notation.INFIX);
			assertEquals(e.hashCode(), op.hashCode());
		}
		catch(IllegalConstruction _) { fail(); }
	}

	@Test
	void testNullParamList() {
		params = null;
		assertThrows(IllegalConstruction.class, () -> op = new Plus(params));
	}

	@Test
	@Override
	public void TestMyIntegerMyInteger() {
		assertEquals(MyInteger.valueOf(1),
				op(MyInteger.valueOf(2), MyInteger.valueOf(-1)));
	}

	@Test
	@Override
	public void TestMyIntegerMyReal() {
		assertEquals(MyReal.valueOf(15.5),
				op(MyInteger.valueOf(10), MyReal.valueOf(5.5)));
	}

	@Test
	@Override
	public void TestMyIntegerMyComplex() {
		assertEquals(MyComplex.create(15, 10),
				op(MyInteger.valueOf(10), MyComplex.create(5, 10)));
	}

	@Test
	@Override
	public void TestMyIntegerMyRational() {
		assertEquals(MyRational.create(3, 2),
				op(MyInteger.valueOf(1), MyRational.create(1, 2)));
	}

	@Test
	@Override
	public void TestMyIntegerMyInfinity() {
		assertEquals(new MyInfinity(true),
				op(MyInteger.valueOf(1), new MyInfinity(true)));

		assertEquals(new MyInfinity(false),
				op(MyInteger.valueOf(1), new MyInfinity(false)));
	}

	@Test
	@Override
	public void TestMyIntegerMyUnknown() {
		assertEquals(MyUnknown.create(List.of(
								new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
								new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
						),
						MyInteger.valueOf(13)),
				op(MyInteger.valueOf(5),
						MyUnknown.create(List.of(
								new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
								new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
						),
						MyInteger.valueOf(8))));
	}

	@Test
	@Override
	public void TestMyRealMyInteger() {
		assertEquals(MyReal.valueOf(1.5),
				op(MyReal.valueOf(2.5), MyInteger.valueOf(-1)));
	}

	@Test
	@Override
	public void TestMyRealMyReal() {
		assertEquals(MyReal.valueOf(7.5),
				op(MyReal.valueOf(2), MyReal.valueOf(5.5)));
	}

	@Test
	@Override
	public void TestMyRealMyComplex() {
		assertEquals(MyComplex.create(MyReal.valueOf(15.5), MyReal.valueOf(-10)),
				op(MyReal.valueOf(10.5), MyComplex.create(5, -10)));

	}

	@Test
	@Override
	public void TestMyRealMyRational() {
		assertEquals(MyReal.valueOf(2.5),
				op(MyReal.valueOf(2), MyRational.create(1, 2)));
	}

	@Test
	@Override
	public void TestMyRealMyInfinity() {
		assertEquals(new MyInfinity(true),
				op(MyReal.valueOf(1.2), new MyInfinity(true)));

		assertEquals(new MyInfinity(false),
				op(MyReal.valueOf(1.2), new MyInfinity(false)));

	}

	@Test
	@Override
	public void TestMyRealMyUnknown() {
		assertEquals(MyUnknown.create(List.of(
								new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
								new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
						),
						MyReal.valueOf(13.5)),
				op(MyInteger.valueOf(5), MyUnknown.create(List.of(
								new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
								new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
						),
						MyReal.valueOf(8.5))));
	}

	@Test
	@Override
	public void TestMyComplexMyInteger() {
		assertEquals(MyComplex.create(3, 2),
				op(MyComplex.create(2, 2), MyInteger.valueOf(1)));
	}

	@Test
	@Override
	public void TestMyComplexMyReal() {
		assertEquals(MyComplex.create(MyReal.valueOf(3.5), MyInteger.valueOf(2)),
				op(MyComplex.create(2, 2), MyReal.valueOf(1.5)));
	}

	@Test
	@Override
	public void TestMyComplexMyComplex() {
		assertEquals(MyComplex.create(MyReal.valueOf(4), MyReal.valueOf(5)),
				op(MyComplex.create(2, 2), MyComplex.create(2, 3)));
	}

	@Test
	@Override
	public void TestMyComplexMyRational() {
		assertEquals(MyComplex.create(MyRational.create(5, 2), MyInteger.valueOf(2)),
				op(MyComplex.create(2, 2), MyRational.create(1, 2)));
	}

	@Test
	@Override
	public void TestMyComplexMyInfinity() {
		assertEquals(new MyInfinity(true),
				op(MyComplex.create(2, 2), new MyInfinity(true)));
		assertEquals(new MyInfinity(false),
				op(MyComplex.create(2, 2), new MyInfinity(false)));
	}

	@Test
	@Override
	public void TestMyComplexMyUnknown() {
		assertEquals(MyUnknown.create(List.of(
								new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
								new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
						),
						MyComplex.create(9, 2)),
				op(MyComplex.create(1, 2), MyUnknown.create(List.of(
								new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
								new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
						),
						MyReal.valueOf(8))));
	}

	@Test
	@Override
	public void TestMyRationalMyInteger() {
		assertEquals(MyRational.create(5, 2),
				op(MyRational.create(3, 2), MyInteger.valueOf(1)));
	}

	@Test
	@Override
	public void TestMyRationalMyReal() {
		assertEquals(MyRational.create(4, 2),
				op(MyRational.create(3, 2), MyReal.valueOf(0.5)));
	}

	@Test
	@Override
	public void TestMyRationalMyComplex() {
		assertEquals(MyComplex.create(MyReal.valueOf(1.5), MyInteger.valueOf(1)),
				op(MyRational.create(1, 2), MyComplex.create(1, 1)));
	}

	@Test
	@Override
	public void TestMyRationalMyRational() {
		assertEquals(MyRational.create(7, 6),
				op(MyRational.create(1, 2), MyRational.create(2, 3)));
	}

	@Test
	@Override
	public void TestMyRationalMyInfinity() {
		assertEquals(new MyInfinity(true),
				op(MyRational.create(1, 2), new MyInfinity(true)));
		assertEquals(new MyInfinity(false),
				op(MyRational.create(1, 2), new MyInfinity(false)));
	}

	@Test
	@Override
	public void TestMyRationalMyUnknown() {
		assertEquals(MyUnknown.create(List.of(
								new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
								new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
						),
						MyReal.valueOf(2)),
				op(
						MyRational.create(1, 2),
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyRational.create(3, 2))));
	}

	@Test
	@Override
	public void TestMyInfinityMyInteger() {
		assertEquals(new MyInfinity(true),
				op(new MyInfinity(true), MyInteger.valueOf(1)));
		assertEquals(new MyInfinity(false),
				op(new MyInfinity(false), MyInteger.valueOf(1)));
	}

	@Test
	@Override
	public void TestMyInfinityMyReal() {
		assertEquals(new MyInfinity(true),
				op(new MyInfinity(true), MyReal.valueOf(1)));
		assertEquals(new MyInfinity(false),
				op(new MyInfinity(false), MyReal.valueOf(1)));
	}

	@Test
	@Override
	public void TestMyInfinityMyComplex() {
		assertEquals(new MyInfinity(true),
				op(new MyInfinity(true), MyComplex.create(1, 2)));
		assertEquals(new MyInfinity(false),
				op(new MyInfinity(false), MyComplex.create(1, 2)));
	}

	@Test
	@Override
	public void TestMyInfinityMyRational() {
		assertEquals(new MyInfinity(true),
				op(new MyInfinity(true), MyRational.create(1, 2)));
		assertEquals(new MyInfinity(false),
				op(new MyInfinity(false), MyRational.create(1, 2)));
	}

	@Test
	@Override
	public void TestMyInfinityMyInfinity() {
		assertEquals(new MyInfinity(false),
				op(new MyInfinity(false), new MyInfinity(false)));
		assertEquals(new MyInfinity(false),
				op(new MyInfinity(false), new MyInfinity(false)));

		assertEquals(MyUndefinedNumber.class,
				op(new MyInfinity(false), new MyInfinity(true)).getClass());

		assertEquals(MyUndefinedNumber.class,
				op(new MyInfinity(true), new MyInfinity(false)).getClass());
	}

	@Test
	@Override
	public void TestMyInfinityMyUnknown() {
		assertEquals(MyUnknown.create(List.of(
								new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
								new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
						),
						new MyInfinity(true)),
				op(
						new MyInfinity(true),
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyRational.create(4, 5))));

		assertEquals(MyUnknown.create(List.of(
								new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
								new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
						),
						new MyInfinity(false)),
				op(
						new MyInfinity(false),
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyRational.create(4, 5))));

		assertEquals(MyUndefinedNumber.class,
				op(
						new MyInfinity(false),
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								new MyInfinity(true))).getClass());
	}

	@Test
	@Override
	public void TestMyUnknownMyInteger() {
		assertEquals(MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				), MyInteger.valueOf(4)),
				op(
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyInteger.valueOf(2)),
						new MyInteger(2)));

	}

	@Test
	@Override
	public void TestMyUnknownMyReal() {
		assertEquals(MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				), MyReal.valueOf(4.5)),
				op(
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyInteger.valueOf(2)),
						new MyReal(2.5)));
	}

	@Test
	@Override
	public void TestMyUnknownMyComplex() {
		assertEquals(MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				), MyComplex.create(3, 6)),
				op(
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyInteger.valueOf(2)),
						MyComplex.create(1, 6)));

	}

	@Test
	@Override
	public void TestMyUnknownMyRational() {
		assertEquals(MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				), MyRational.create(5, 2)),
				op(
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyInteger.valueOf(2)),
						MyRational.create(1,2)));
	}

	@Test
	@Override
	public void TestMyUnknownMyInfinity() {
		assertEquals(MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				), new MyInfinity(false)),
				op(
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyInteger.valueOf(2)),
						new MyInfinity(false)));

		assertEquals(MyUnknown.create(List.of(
						new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
						new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
				), new MyInfinity(true)),
				op(
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyInteger.valueOf(2)),
						new MyInfinity(true)));

		assertEquals(MyUndefinedNumber.class,
				op(
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								new MyInfinity(true)),
						new MyInfinity(false)).getClass());

	}

	@Test
	@Override
	public void TestMyUnknownMyUnknown() {

		assertEquals(MyUnknown.create(List.of(
								new Pair<>(MyInteger.valueOf(3), MyInteger.valueOf(3)),
								new Pair<>(MyInteger.valueOf(12), MyInteger.valueOf(20))),
						MyInteger.valueOf(3)),
				op(
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyInteger.valueOf(2)),
						MyUnknown.create(List.of(
										new Pair<>(MyInteger.valueOf(1), MyInteger.valueOf(3)),
										new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))),
								MyInteger.valueOf(1))));

	}

	private MyNumber op(MyNumber a, MyNumber b) {
		return BinaryOperation.op(a, b, Plus::new);
	}
}
