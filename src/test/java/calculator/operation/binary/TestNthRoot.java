package calculator.operation.binary;

import calculator.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
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
        MyNumber res = op(MyInteger.valueOf(2), MyReal.valueOf(5));
        assertEquals(MyReal.valueOf(1.1487), res);
        // we don't support rational/ non integer number as indexes
        res = op(MyInteger.valueOf(2), MyReal.valueOf(5.5));
        assertEquals(MyErrorNumber.class, res.getClass());
    }
    @Test
    @Override
    public void TestMyIntegerMyComplex() {
        MyNumber res = op(MyInteger.valueOf(2), MyComplex.create(1,1));
        assertEquals(MyErrorNumber.class, res.getClass());
    }
    @Test
    @Override
    public void TestMyIntegerMyRational() {
        MyNumber res = op(MyInteger.valueOf(2), MyRational.create(1,2));
        assertEquals(MyErrorNumber.class, res.getClass());

    }

    @Test
    @Override
    public void TestMyRealMyInteger() {
        MyNumber res = op(MyReal.valueOf(2.5), MyInteger.valueOf(0));
        assertEquals(MyErrorNumber.class, res.getClass());
        res = op(MyReal.valueOf(2.5), MyInteger.valueOf(1));
        assertEquals(MyErrorNumber.class, res.getClass());
        res = op(MyReal.valueOf(2.5), MyInteger.valueOf(-5));
        assertEquals(MyErrorNumber.class, res.getClass());

        res = op(MyReal.valueOf(5.5), MyInteger.valueOf(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE)));
        assertEquals(MyErrorNumber.class, res.getClass());
        res = op(MyReal.valueOf(5.5), MyInteger.valueOf(BigInteger.valueOf(Long.MAX_VALUE)));
        assertNotEquals(MyErrorNumber.class, res.getClass());

        res = op(new MyReal(BigDecimal.valueOf(Double.MAX_VALUE)), MyInteger.valueOf(BigInteger.valueOf(Long.MAX_VALUE)));
        assertNotEquals(MyErrorNumber.class, res.getClass());

        res = op(MyReal.valueOf(8.5), MyInteger.valueOf(5));
        assertEquals(MyReal.valueOf(1.53421), res);
    }

    @Test
    @Override
    public void TestMyRealMyReal() {
        MyNumber res = op(MyReal.valueOf(2.5), MyReal.valueOf(5));
        assertEquals(MyReal.valueOf(1.20112), res);
        // we don't support rational/ non integer number as indexes
        res = op(MyReal.valueOf(2.5), MyReal.valueOf(5.5));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRealMyComplex() {
        MyNumber res = op(MyReal.valueOf(2), MyComplex.create(1,1));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRealMyRational() {
        MyNumber res = op(MyReal.valueOf(2), MyRational.create(1,2));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyComplexMyInteger() {
        MyNumber res = op(MyComplex.create(1,1), MyInteger.valueOf(1));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyComplexMyReal() {
        MyNumber res = op(MyComplex.create(1,1), MyReal.valueOf(1));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyComplexMyComplex() {
        MyNumber res = op(MyComplex.create(1,1), MyComplex.create(1,1));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyComplexMyRational() {
        MyNumber res = op(MyComplex.create(1,1), MyRational.create(1,2));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyInteger() {
        MyNumber res = op(MyRational.create(1,2), MyInteger.valueOf(5));
        assertEquals(MyReal.valueOf(0.870551), res);

        res = op(MyRational.create(1,2), MyInteger.valueOf(0));
        assertEquals(MyErrorNumber.class, res.getClass());
        res = op(MyRational.create(1,2), MyInteger.valueOf(1));
        assertEquals(MyErrorNumber.class, res.getClass());

        res = op(MyRational.create(1,2), MyInteger.valueOf(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE)));
        assertEquals(MyErrorNumber.class, res.getClass());
        res = op(MyRational.create(1,2), MyInteger.valueOf(BigInteger.valueOf(Long.MAX_VALUE)));
        assertNotEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyReal() {
        MyNumber res = op(MyRational.toRational(MyReal.valueOf(2.5)), MyReal.valueOf(5));
        assertEquals(MyReal.valueOf(1.20112), res);
        // we don't support rational/ non integer number as indexes
        res = op(MyRational.toRational(MyReal.valueOf(2.5)), MyReal.valueOf(5.5));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyComplex() {
        MyNumber res = op(MyRational.create(1,2), MyComplex.create(1,1));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyRational() {
        MyNumber res = op(MyRational.create(1,2), MyRational.create(1,2));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Override
    public void TestMyIntegerMyInfinity() {

    }

    @Override
    public void TestMyRealMyInfinity() {

    }

    @Override
    public void TestMyComplexMyInfinity() {

    }

    @Override
    public void TestMyRationalMyInfinity() {

    }

    @Override
    public void TestMyInfinityMyInteger() {

    }

    @Override
    public void TestMyInfinityMyReal() {

    }

    @Override
    public void TestMyInfinityMyComplex() {

    }

    @Override
    public void TestMyInfinityMyRational() {

    }

    @Override
    public void TestMyInfinityMyInfinity() {

    }

    private MyNumber op(MyNumber a, MyNumber b) {
        return BinaryOperation.op(a, b, NthRoot::new);
    }

}
