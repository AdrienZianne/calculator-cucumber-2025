package calculator.operation.binary;

import calculator.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class TestNthRoot extends TestBinaryOperation {
    static MyUnknown other;

    @BeforeAll
     static void setUp() {
        Configuration.setRealPrecision(5);
        Configuration.setUsesComplexDomainDefault(false);

        other = (MyUnknown) MyUnknown.create(List.of(
                        new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
                        new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
                ),
                MyInteger.valueOf(8));

    }

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
        res = op(MyInteger.valueOf(-2), MyInteger.valueOf(5));
        assertEquals(MyErrorNumber.class, res.getClass());
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

    @Test
    @Override
    public void TestMyIntegerMyInfinity() {
        MyNumber res = op(MyInteger.valueOf(51), new MyInfinity(true));
        assertEquals(ConstantNumber.ONE, res);
        res = op(MyInteger.valueOf(51), new MyInfinity(false));
        assertEquals(ConstantNumber.ONE, res);
        res = op(MyInteger.valueOf(0), new MyInfinity(true));
        assertEquals(MyUndefinedNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyIntegerMyUnknown() {
        assertEquals(MyErrorNumber.class, op(MyInteger.valueOf(3), other).getClass());
    }

    @Test
    @Override
    public void TestMyRealMyInfinity() {
        MyNumber res = op(MyReal.valueOf(511.12), new MyInfinity(true));
        assertEquals(ConstantNumber.ONE, res);
        res = op(MyReal.valueOf(511.12), new MyInfinity(false));
        assertEquals(ConstantNumber.ONE, res);
        res = op(MyReal.valueOf(0), new MyInfinity(true));
        assertEquals(MyUndefinedNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRealMyUnknown() {
        assertEquals(MyErrorNumber.class, op(MyReal.valueOf(3), other).getClass());

    }


    @Test
    @Override
    public void TestMyComplexMyInfinity() {
        MyNumber res = op(MyComplex.create(0, 1), new MyInfinity(true));
        assertEquals(ConstantNumber.ONE, res);
        res = op(MyComplex.create(0, 1), new MyInfinity(false));
        assertEquals(ConstantNumber.ONE, res);
    }

    @Test
    @Override
    public void TestMyComplexMyUnknown() {
        assertEquals(MyErrorNumber.class, op(MyComplex.create(3, 2), other).getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyInfinity() {
        MyNumber res = op(MyRational.create(1, 2), new MyInfinity(true));
        assertEquals(ConstantNumber.ONE, res);
        res = op(MyRational.create(1, 2), new MyInfinity(false));
        assertEquals(ConstantNumber.ONE, res);
    }

    @Test
    @Override
    public void TestMyRationalMyUnknown() {
        assertEquals(MyErrorNumber.class, op(MyRational.create(3, 6), other).getClass());
    }

    @Test
    @Override
    public void TestMyInfinityMyInteger() {
        MyNumber res = op(new MyInfinity(true), MyInteger.valueOf(5));
        assertEquals(new MyInfinity(true), res);
        res = op(new MyInfinity(true), MyInteger.valueOf(-5));
        assertEquals(new MyInfinity(true), res);
        res = op(new MyInfinity(false), MyInteger.valueOf(4));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyInfinityMyReal() {
        MyNumber res = op(new MyInfinity(true), MyReal.valueOf(5.5));
        assertEquals(new MyInfinity(true), res);
        res = op(new MyInfinity(true), MyReal.valueOf(-5.5));
        assertEquals(new MyInfinity(true), res);
        res = op(new MyInfinity(false), MyReal.valueOf(4.5));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyInfinityMyComplex() {
        MyNumber res = op(new MyInfinity(true), MyComplex.create(5, 2));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyInfinityMyRational() {
        MyNumber res = op(new MyInfinity(true), MyRational.create(-5, 3));
        assertEquals(new MyInfinity(true), res);
        res = op(new MyInfinity(true), MyRational.create(5, 3));
        assertEquals(new MyInfinity(true), res);
        res = op(new MyInfinity(false), MyRational.create(5, 3));
        assertEquals(MyErrorNumber.class, res.getClass());
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
    @Override
    public void TestMyInfinityMyUnknown() {
        assertEquals(MyErrorNumber.class, op(new MyInfinity(true), other).getClass());
        assertEquals(MyErrorNumber.class, op(new MyInfinity(false), other).getClass());
    }

    @Test
    @Override
    public void TestMyUnknownMyInteger() {
        assertEquals(MyErrorNumber.class, op(other, MyInteger.valueOf(2)).getClass());
    }

    @Test
    @Override
    public void TestMyUnknownMyReal() {
        assertEquals(MyErrorNumber.class, op(other, MyReal.valueOf(2.5)).getClass());
    }

    @Test
    @Override
    public void TestMyUnknownMyComplex() {
        assertEquals(MyErrorNumber.class, op(other, MyComplex.create(2, 3)).getClass());
    }

    @Test
    @Override
    public void TestMyUnknownMyRational() {
        assertEquals(MyErrorNumber.class, op(other, MyRational.create(2, 3)).getClass());
    }

    @Test
    @Override
    public void TestMyUnknownMyInfinity() {
        assertEquals(MyErrorNumber.class, op(other, new MyInfinity(true)).getClass());
        assertEquals(MyErrorNumber.class, op(other, new MyInfinity(false)).getClass());
    }

    @Test
    @Override
    public void TestMyUnknownMyUnknown() {
        assertEquals(MyErrorNumber.class, op(other, other).getClass());

    }

    private MyNumber op(MyNumber a, MyNumber b) {
        return BinaryOperation.op(a, b, NthRoot::new);
    }

}
