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
        MyNumber exp = op(MyComplex.create(2,1), MyInteger.valueOf(1));
        assertEquals(MyErrorNumber.class, exp.getClass());
    }

    @Test
    @Override
    public void TestMyComplexMyReal() {
        MyNumber exp = op(MyComplex.create(2,1), MyReal.valueOf(1));
        assertEquals(MyErrorNumber.class, exp.getClass());
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

    private MyNumber op(MyNumber a, MyNumber b) {
        return BinaryOperation.op(a, b, Exponent::new);
    }
}
