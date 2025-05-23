package calculator.operation.binary;

import calculator.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestModulus extends TestBinaryOperation {
    static MyUnknown other;

    @BeforeAll
    static void setUp() {
        Configuration.setRealPrecision(5);

        other = (MyUnknown) MyUnknown.create(List.of(
                        new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
                        new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(20))
                ),
                MyInteger.valueOf(8));

    }

    @Test
    @Override
    public void TestMyIntegerMyInteger() {
        MyNumber res = op(MyInteger.valueOf(3), MyInteger.valueOf(4));
        assertEquals(MyInteger.valueOf(3), res);

        res = op(MyInteger.valueOf(10), MyInteger.valueOf(4));
        assertEquals(MyInteger.valueOf(2), res);

        res = op(MyInteger.valueOf(10), MyInteger.valueOf(-4));
        assertEquals(MyInteger.valueOf(2), res);

        res = op(MyInteger.valueOf(10), MyInteger.valueOf(0));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyIntegerMyReal() {
        MyNumber res = op(MyInteger.valueOf(10), MyReal.valueOf(0));
        assertEquals(MyErrorNumber.class, res.getClass());

        res = op(MyInteger.valueOf(10), MyReal.valueOf(2.4));
        assertEquals(MyReal.valueOf(0.4), res);

        res = op(MyInteger.valueOf(10), MyReal.valueOf(-2.4));
        assertEquals(MyReal.valueOf(0.4), res);
    }

    @Test
    @Override
    public void TestMyIntegerMyComplex() {
        MyNumber res = op(MyInteger.valueOf(10), MyComplex.create(1, 1));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyIntegerMyRational() {
        MyNumber res = op(MyInteger.valueOf(10), MyRational.create(7,10));
        assertEquals(MyReal.valueOf(0.2), res);
    }

    @Test
    @Override
    public void TestMyIntegerMyInfinity() {
        MyNumber res = op(MyInteger.valueOf(10), new MyInfinity(true));
        assertEquals(MyInteger.valueOf(10), res);

        res = op(MyInteger.valueOf(10), new MyInfinity(false));
        assertEquals(MyInteger.valueOf(10), res);
    }

    @Test
    @Override
    public void TestMyIntegerMyUnknown() {
        assertEquals(MyErrorNumber.class, op(MyInteger.valueOf(3), other).getClass());
    }

    @Test
    @Override
    public void TestMyRealMyInteger() {
        MyNumber res = op(MyReal.valueOf(2.5), MyInteger.valueOf(2));
        assertEquals(MyReal.valueOf(0.5), res);

        res = op(MyReal.valueOf(2.5), MyInteger.valueOf(0));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRealMyReal() {
        MyNumber res = op(MyReal.valueOf(2.5), MyReal.valueOf(1.2));
        assertEquals(MyReal.valueOf(0.1), res);

        res = op(MyReal.valueOf(2.5), MyReal.valueOf(0));
        assertEquals(MyErrorNumber.class, res.getClass());

    }

    @Test
    @Override
    public void TestMyRealMyComplex() {
        MyNumber res = op(MyReal.valueOf(10.4), MyComplex.create(1, 1));
        assertEquals(MyErrorNumber.class, res.getClass());

    }

    @Test
    @Override
    public void TestMyRealMyRational() {
        MyNumber res = op(MyReal.valueOf(2.5), MyRational.create(6,5));
        assertEquals(MyReal.valueOf(0.1), res);

    }

    @Test
    @Override
    public void TestMyRealMyInfinity() {
        MyNumber res = op(MyReal.valueOf(10.25), new MyInfinity(true));
        assertEquals(MyReal.valueOf(10.25), res);

        res = op(MyReal.valueOf(10.25), new MyInfinity(false));
        assertEquals(MyReal.valueOf(10.25), res);
    }

    @Test
    @Override
    public void TestMyRealMyUnknown() {
        assertEquals(MyErrorNumber.class, op(MyReal.valueOf(3), other).getClass());

    }

    @Test
    @Override
    public void TestMyComplexMyInteger() {
        MyNumber res = op(MyComplex.create(1,1), MyInteger.valueOf(2));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyComplexMyReal() {
        MyNumber res = op(MyComplex.create(1,1), MyReal.valueOf(2.5));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyComplexMyComplex() {
        MyNumber res = op(MyComplex.create(1,1), MyComplex.create(2,2));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyComplexMyRational() {
        MyNumber res = op(MyComplex.create(1,1), MyRational.create(2,2));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyComplexMyInfinity() {
        MyNumber res = op(MyComplex.create(1,1), new MyInfinity(true));
        assertEquals(MyComplex.create(1,1), res);
        res = op(MyComplex.create(1,1), new MyInfinity(false));
        assertEquals(MyComplex.create(1,1), res);
    }

    @Test
    @Override
    public void TestMyComplexMyUnknown() {
        assertEquals(MyErrorNumber.class, op(MyComplex.create(3, 2), other).getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyInteger() {
        MyNumber res = op(MyRational.create(323,212), MyInteger.valueOf(1));
        assertEquals(MyReal.valueOf(0.52358), res);

        res = op(MyRational.create(2, 5), MyInteger.valueOf(0));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyReal() {
        MyNumber res = op(MyRational.create(323,212), MyReal.valueOf(0.5));
        assertEquals(MyReal.valueOf(0.02358), res);

        res = op(MyRational.create(2, 5), MyReal.valueOf(0));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyComplex() {
        MyNumber res = op(MyRational.create(1,2), MyComplex.create(2,2));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyRationalMyRational() {
        MyNumber res = op(MyRational.create(1,2), MyRational.create(3,7));
        assertEquals(MyReal.valueOf(0.071428), res);


    }

    @Test
    @Override
    public void TestMyRationalMyInfinity() {
        MyNumber res = op(MyRational.create(1, 2), new MyInfinity(true));
        assertEquals(MyRational.create(1, 2), res);

        res = op(MyRational.create(1, 2), new MyInfinity(false));
        assertEquals(MyRational.create(1, 2), res);
    }

    @Test
    @Override
    public void TestMyRationalMyUnknown() {
        assertEquals(MyErrorNumber.class, op(MyRational.create(3, 6), other).getClass());
    }

    @Test
    @Override
    public void TestMyInfinityMyInteger() {
        MyNumber res = op(new MyInfinity(true), MyInteger.valueOf(2));
        assertEquals(MyUndefinedNumber.class, res.getClass());
        res = op(new MyInfinity(false), MyInteger.valueOf(2));
        assertEquals(MyUndefinedNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyInfinityMyReal() {
        MyNumber res = op(new MyInfinity(true), MyReal.valueOf(2.5));
        assertEquals(MyUndefinedNumber.class, res.getClass());
        res = op(new MyInfinity(false), MyReal.valueOf(2.5));
        assertEquals(MyUndefinedNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyInfinityMyComplex() {
        MyNumber res = op(new MyInfinity(true), MyComplex.create(1, 2));
        assertEquals(MyErrorNumber.class, res.getClass());
        res = op(new MyInfinity(false), MyComplex.create(1, 2));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    @Test
    @Override
    public void TestMyInfinityMyRational() {
        MyNumber res = op(new MyInfinity(true), MyRational.create(1, 2));
        assertEquals(MyUndefinedNumber.class, res.getClass());
        res = op(new MyInfinity(false), MyRational.create(1, 2));
        assertEquals(MyUndefinedNumber.class, res.getClass());
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
        return BinaryOperation.op(a, b, Modulus::new);
    }
}
