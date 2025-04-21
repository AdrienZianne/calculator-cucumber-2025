package calculator.operation.binary;

import calculator.*;
import calculator.operation.unary.UnaryOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExponent extends TestBinaryOperation{

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

    }

    @Test
    @Override
    public void TestMyIntegerMyRational() {

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
