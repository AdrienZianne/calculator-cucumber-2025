package calculator.operation.binary;

import calculator.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExponent extends TestBinaryOperation{
    @BeforeEach
    public void beforeEach() {
        Configuration.setRealPrecision(5);
    }

    @Test
    @Override
    public void TestMyIntegerMyInteger() {
        MyNumber exp = op(MyInteger.valueOf(1), MyInteger.valueOf(2));
        assertEquals(ConstantNumber.ONE, exp);

        exp = op(MyInteger.valueOf(10), MyInteger.valueOf(0));
        assertEquals(ConstantNumber.ONE, exp);

        exp = op(MyInteger.valueOf(0), MyInteger.valueOf(0));
        assertEquals(MyUndefinedNumber.class, exp.getClass());

        exp = op(MyInteger.valueOf(2), MyInteger.valueOf(10));
        assertEquals(MyInteger.valueOf(1024), exp);

        exp = op(MyInteger.valueOf(2), MyInteger.valueOf(-4));
        assertEquals(MyRational.create(1,16), exp);

        exp = op(MyInteger.valueOf(2), MyInteger.valueOf(Integer.MAX_VALUE));
        assertEquals(MyErrorNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyIntegerMyReal() {

        MyNumber exp = op(MyInteger.valueOf(1), MyReal.valueOf(2.5));
        assertEquals(ConstantNumber.ONE, exp);
        exp = op(MyInteger.valueOf(1), MyReal.valueOf(0.));
        assertEquals(ConstantNumber.ONE, exp);

        exp = op(MyInteger.valueOf(5), MyReal.valueOf(2.5));
        assertEquals(MyReal.valueOf(55.9017), exp);
        exp = op(MyInteger.valueOf(2), MyReal.valueOf(-2.5));
        assertEquals(MyReal.valueOf(0.17678), exp);
    }

    @Test
    @Override
    public void TestMyIntegerMyComplex() {
        MyNumber exp = op(MyInteger.valueOf(2), MyComplex.create(1, 1));
        assertEquals(MyErrorNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyIntegerMyRational() {
        MyNumber exp = op(MyInteger.valueOf(2), MyRational.toRational(MyReal.valueOf(-2.5)));
        assertEquals(MyReal.valueOf(0.17678), exp);
        exp = op(MyInteger.valueOf(5), MyRational.toRational(MyReal.valueOf(2.5)));
        assertEquals(MyReal.valueOf(55.9017), exp);

        exp = op(MyInteger.valueOf(5), MyRational.toRational(MyReal.valueOf(2.5)));
        assertEquals(MyReal.valueOf(55.9017), exp);
    }

    @Test
    @Override
    public void TestMyRealMyInteger() {
        MyNumber exp = op(MyReal.valueOf(0.5), MyInteger.valueOf(2));
        assertEquals(MyReal.valueOf(0.25), exp);

        exp = op(MyReal.valueOf(0.5), MyInteger.valueOf(-2));
        assertEquals(MyReal.valueOf(4), exp);

        exp = op(MyReal.valueOf(0.5), MyInteger.valueOf(0));
        assertEquals(MyReal.valueOf(1), exp);

        exp = op(MyReal.valueOf(0.5), MyInteger.valueOf(1));
        assertEquals(MyReal.valueOf(0.5), exp);

        exp = op(MyReal.valueOf(2.5), MyInteger.valueOf(9999999999999L));
        assertEquals(MyErrorNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyRealMyReal() {
        MyNumber exp = op(MyReal.valueOf(2.5), MyReal.valueOf(2.5));
        assertEquals(MyReal.valueOf(9.88212), exp);

        exp = op(MyReal.valueOf(2.5), MyReal.valueOf(-2.5));
        assertEquals(MyReal.valueOf(0.101193), exp);

        exp = op(MyReal.valueOf(2.5), MyReal.valueOf(Integer.MAX_VALUE));
        assertEquals(MyErrorNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyRealMyComplex() {
        MyNumber exp = op(MyReal.valueOf(2), MyComplex.create(1, 1));
        assertEquals(MyErrorNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyRealMyRational() {
        MyNumber exp = op(MyReal.valueOf(2.5), MyRational.create(2,4));
        assertEquals(MyReal.valueOf(1.58114), exp);

        exp = op(MyReal.valueOf(2.5), MyRational.create(-2,4));
        assertEquals(MyReal.valueOf(0.632456), exp);
        exp = op(MyReal.valueOf(-2.5), MyRational.create(-2,4));
        assertEquals(MyComplex.create(ConstantNumber.ZERO,MyReal.valueOf(-0.632456)), exp);

    }

    @Test
    @Override
    public void TestMyComplexMyInteger() {
        MyNumber exp = op(MyComplex.create(5, 2), MyInteger.valueOf(2));
        assertEquals(MyComplex.create(21, 20), exp);

        exp = op(MyComplex.create(5, 2), MyInteger.valueOf(3));
        assertEquals(MyComplex.create(65, 142), exp);

        exp = op(MyComplex.create(5, 2), MyInteger.valueOf(7));
        assertEquals(MyComplex.create(-116615, 60422), exp);

        exp = op(MyComplex.create(5, 2), MyInteger.valueOf(11));
        assertEquals(MyComplex.create(-55535695, -95479298), exp);

        exp = op(MyComplex.create(5, 2), MyInteger.valueOf(-3));
        assertEquals(MyComplex.create(MyReal.valueOf(0.00267), MyReal.valueOf(-0.00582)), exp);
    }

    @Test
    @Override
    public void TestMyComplexMyReal() {
        MyNumber exp = op(MyComplex.create(2,1), MyReal.valueOf(2.5));
        assertEquals(MyErrorNumber.class, exp.getClass());

        exp = op(MyComplex.create(5, 2), MyReal.valueOf(7));
        assertEquals(MyComplex.create(-116615, 60422), exp);

        exp = op(MyComplex.create(5, 2), MyReal.valueOf(-3));
        assertEquals(MyComplex.create(MyReal.valueOf(0.00267), MyReal.valueOf(-0.00582)), exp);
    }

    @Test
    @Override
    public void TestMyComplexMyComplex() {
        MyNumber exp = op(MyComplex.create(2,1), MyComplex.create(1,2));
        assertEquals(MyErrorNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyComplexMyRational() {
        MyNumber exp = op(MyComplex.create(2,1), MyRational.create(1,2));
        assertEquals(MyErrorNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyInteger() {
        MyNumber exp = op(MyRational.create(1,2), MyInteger.valueOf(2));
        assertEquals(MyRational.create(1,4), exp);

        exp = op(MyRational.create(2,3), MyInteger.valueOf(2));
        assertEquals(MyRational.create(4,9), exp);

        exp = op(MyRational.create(-2,3), MyInteger.valueOf(2));
        assertEquals(MyRational.create(4,9), exp);

        exp = op(MyRational.create(2,-3), MyInteger.valueOf(2));
        assertEquals(MyRational.create(4,9), exp);
    }

    @Test
    @Override
    public void TestMyRationalMyReal() {
        MyNumber exp = op(MyRational.create(1,2), MyReal.valueOf(2));
        assertEquals(MyRational.create(1,4), exp);

        exp = op(MyRational.create(1,2), MyReal.valueOf(2.5));
        assertEquals(MyReal.valueOf(0.176777), exp);
        exp = op(MyRational.create(1,2), MyReal.valueOf(-2.5));
        assertEquals(MyReal.valueOf(5.65685), exp);
    }

    @Test
    @Override
    public void TestMyRationalMyComplex() {
        MyNumber exp = op(MyRational.create(1,2), MyComplex.create(1,2));
        assertEquals(MyErrorNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyRational() {
        Configuration.setRealPrecision(4);
        MyNumber exp = op(MyRational.create(10,3), MyRational.create(21,5));
        assertEquals(MyReal.valueOf(157.06909), exp);
    }

    @Test
    @Override
    public void TestMyIntegerMyInfinity() {
        MyNumber exp = op(MyInteger.valueOf(2), new MyInfinity(true));
        assertEquals(new MyInfinity(true), exp);

        exp = op(MyInteger.valueOf(2), new MyInfinity(false));
        assertEquals(ConstantNumber.ZERO, exp);

        exp = op(MyInteger.valueOf(-2), new MyInfinity(true));
        assertEquals(MyUndefinedNumber.class, exp.getClass());

        exp = op(MyInteger.valueOf(-2), new MyInfinity(false));
        assertEquals(ConstantNumber.ZERO, exp);
    }

    @Test
    @Override
    public void TestMyRealMyInfinity() {
        MyNumber exp = op(MyReal.valueOf(0.5), new MyInfinity(true));
        assertEquals(ConstantNumber.ZERO, exp);

        exp = op(MyReal.valueOf(0.5), new MyInfinity(false));
        assertEquals(new MyInfinity(true), exp);

        exp = op(MyReal.valueOf(-0.5), new MyInfinity(true));
        assertEquals(ConstantNumber.ZERO, exp);

        exp = op(MyReal.valueOf(-0.5), new MyInfinity(false));
        assertEquals(MyUndefinedNumber.class, exp.getClass());

        // _____

        exp = op(MyReal.valueOf(1.5), new MyInfinity(true));
        assertEquals(new MyInfinity(true), exp);

        exp = op(MyReal.valueOf(1.5), new MyInfinity(false));
        assertEquals(ConstantNumber.ZERO, exp);

        exp = op(MyReal.valueOf(-1.5), new MyInfinity(true));
        assertEquals(MyUndefinedNumber.class, exp.getClass());

        exp = op(MyReal.valueOf(-1.5), new MyInfinity(false));
        assertEquals(ConstantNumber.ZERO, exp);
    }

    @Test
    @Override
    public void TestMyComplexMyInfinity() {
        MyNumber exp = op(MyComplex.create(1,1), new MyInfinity(true));
        assertEquals(MyUndefinedNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyInfinity() {
        MyNumber exp = op(MyRational.create(1,2), new MyInfinity(true));
        assertEquals(ConstantNumber.ZERO, exp);

        exp = op(MyRational.create(1,2), new MyInfinity(false));
        assertEquals(new MyInfinity(true), exp);

        exp = op(MyRational.create(-1,2), new MyInfinity(true));
        assertEquals(ConstantNumber.ZERO, exp);

        exp = op(MyRational.create(-1,2), new MyInfinity(false));
        assertEquals(MyUndefinedNumber.class, exp.getClass());

        // _____

        exp = op(MyRational.create(3,2), new MyInfinity(true));
        assertEquals(new MyInfinity(true), exp);

        exp = op(MyRational.create(3,2), new MyInfinity(false));
        assertEquals(ConstantNumber.ZERO, exp);

        exp = op(MyRational.create(-3,2), new MyInfinity(true));
        assertEquals(MyUndefinedNumber.class, exp.getClass());

        exp = op(MyRational.create(-3,2), new MyInfinity(false));
        assertEquals(ConstantNumber.ZERO, exp);
    }

    @Test
    @Override
    public void TestMyInfinityMyInteger() {
        MyNumber exp = op(new MyInfinity(true), MyInteger.valueOf(3));
        assertEquals(new MyInfinity(true), exp);

        exp = op(new MyInfinity(false), MyInteger.valueOf(1));
        assertEquals(new MyInfinity(false), exp);

        exp = op(new MyInfinity(false), MyInteger.valueOf(4));
        assertEquals(new MyInfinity(true), exp);

        exp = op(new MyInfinity(false), MyInteger.valueOf(-4));
        assertEquals(MyInteger.valueOf(0), exp);
    }

    @Test
    @Override
    public void TestMyInfinityMyReal() {
        MyNumber exp = op(new MyInfinity(true), MyReal.valueOf(2));
        assertEquals(new MyInfinity(true), exp);

        exp = op(new MyInfinity(false), MyReal.valueOf(1));
        assertEquals(new MyInfinity(false), exp);

        exp = op(new MyInfinity(false), MyReal.valueOf(4));
        assertEquals(new MyInfinity(true), exp);

        exp = op(new MyInfinity(false), MyReal.valueOf(1.5));
        assertEquals(new MyInfinity(false), exp);
        exp = op(new MyInfinity(true), MyReal.valueOf(-1.5));
        assertEquals(MyInteger.valueOf(0), exp);

    }

    @Test
    @Override
    public void TestMyInfinityMyComplex() {
        MyNumber exp = op(new MyInfinity(true), MyComplex.create(1,2));
        assertEquals(MyUndefinedNumber.class, exp.getClass());

        exp = op(new MyInfinity(false), MyComplex.create(1,2));
        assertEquals(MyUndefinedNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyInfinityMyRational() {
        MyNumber exp = op(new MyInfinity(true), MyRational.create(2,3));
        assertEquals(new MyInfinity(true), exp);

        exp = op(new MyInfinity(false), MyRational.create(1, 2));
        assertEquals(new MyInfinity(false), exp);
    }

    @Test
    @Override
    public void TestMyInfinityMyInfinity() {
        MyNumber res = op(new MyInfinity(true), new MyInfinity(true));
        assertEquals(MyUndefinedNumber.class, res.getClass());
        res = op(new MyInfinity(true), new MyInfinity(false));
        assertEquals(MyUndefinedNumber.class, res.getClass());
        res = op(new MyInfinity(false), new MyInfinity(true));
        assertEquals(MyUndefinedNumber.class, res.getClass());
        res = op(new MyInfinity(false), new MyInfinity(false));
        assertEquals(MyUndefinedNumber.class, res.getClass());
    }



    @Test
    public void test() {
        MyNumber res = op(new MyReal(-2), new MyInfinity(true));
        assertEquals(MyUndefinedNumber.class, res.getClass());
    }

    private MyNumber op(MyNumber a, MyNumber b) {
        return BinaryOperation.op(a, b, Exponent::new);
    }
}
