package calculator.operation.unary;

import calculator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestAbsolute extends TestUnaryOperation {

    @Test
    @Override
    public void testInteger() {
        MyNumber res = op(MyInteger.valueOf(2));
        assertEquals(MyInteger.valueOf(2), res);
        res = op(MyInteger.valueOf(-2));
        assertEquals(MyInteger.valueOf(2), res);
    }

    @Test
    @Override
    public void testMyReal() {
        MyNumber res = op(MyReal.valueOf(2.5));
        assertEquals(MyReal.valueOf(2.5), res);
        res = op(MyReal.valueOf(-2.5));
        assertEquals(MyReal.valueOf(2.5), res);
    }

    @Test
    @Override
    public void testMyRational() throws Exception {
        MyNumber res = op(MyRational.create(-2, 3));
        assertEquals(MyRational.create(2, 3), res);
        res = op(MyRational.create(2, -3));
        assertEquals(MyRational.create(2, 3), res);
        res = op(MyRational.create(2, 3));
        assertEquals(MyRational.create(2, 3), res);
    }

    @Test
    @Override
    public void testMyComplex() {
        MyNumber res = op(MyComplex.create(8, 3));
        assertEquals(MyReal.valueOf(8.544), res);
        res = op(MyComplex.create(-8, 3));
        assertEquals(MyReal.valueOf(8.544), res);
        res = op(MyComplex.create(8, -3));
        assertEquals(MyReal.valueOf(8.544), res);

        res = op(MyComplex.create(MyReal.valueOf(4.5), MyReal.valueOf(8.5)));
        assertEquals(MyReal.valueOf(9.61769), res);
    }

    @Test
    @Override
    public void testMyInfinity() {
        MyNumber res = op(new MyInfinity(true));
        assertEquals(new MyInfinity(true), res);
        res = op(new MyInfinity(false));
        assertEquals(new MyInfinity(true), res);
    }

    @Test
    @Override
    public void testMyUnknown() throws Exception {
        MyNumber res = op(MyUnknown.create(ConstantNumber.ONE, ConstantNumber.ONE));
        assertEquals(MyErrorNumber.class, res.getClass());
    }

    private MyNumber op(MyNumber a) {
        return UnaryOperation.op(a, Absolute::new);
    }
}
