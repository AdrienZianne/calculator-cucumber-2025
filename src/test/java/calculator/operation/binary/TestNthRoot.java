package calculator.operation.binary;

import calculator.MyErrorNumber;
import calculator.MyInteger;
import calculator.MyNumber;
import calculator.MyReal;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class TestNthRoot extends TestBinaryOperation{
    @Test
    @Override
    public void TestMyIntegerMyInteger() {
        MyNumber res = op(MyInteger.valueOf(2), MyInteger.valueOf(0));
        assertEquals(MyErrorNumber.class, res.getClass());
        res = op(MyInteger.valueOf(2), MyInteger.valueOf(1));
        assertEquals(MyErrorNumber.class, res.getClass());
        res = op(MyInteger.valueOf(2), MyInteger.valueOf(-5));
        assertEquals(MyErrorNumber.class, res.getClass());

        res = op(MyInteger.valueOf(5), MyInteger.valueOf(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE)));
        assertEquals(MyErrorNumber.class, res.getClass());
        res = op(MyInteger.valueOf(5), MyInteger.valueOf(BigInteger.valueOf(Long.MAX_VALUE)));
        assertNotEquals(MyErrorNumber.class, res.getClass());

        res = op(MyInteger.valueOf(2), MyInteger.valueOf(5));
        assertEquals(MyReal.valueOf(1.1487), res);
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
        return BinaryOperation.op(a, b, NthRoot::new);
    }

}
