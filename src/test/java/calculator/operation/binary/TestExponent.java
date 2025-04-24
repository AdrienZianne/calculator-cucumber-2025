package calculator.operation.binary;

import calculator.*;
import calculator.operation.unary.UnaryOperation;
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

    }

    @Test
    @Override
    public void TestMyRealMyReal() {

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

    private MyNumber op(MyNumber a, MyNumber b) {
        return BinaryOperation.op(a, b, Exponent::new);
    }
}
