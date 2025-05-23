package calculator.operation.unary;


import calculator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInverse extends TestUnaryOperation {

    @Test
    @Override
    public void testInteger() throws Exception {
        Inverse inv = new Inverse(ConstantNumber.ONE);
        assertEquals(ConstantNumber.ONE, calculator.eval(inv));
        inv = new Inverse(MyInteger.valueOf(2));
        assertEquals(MyRational.create(1,2), calculator.eval(inv));
    }

    @Test
    @Override
    public void testMyReal() throws Exception {
        Inverse inv = new Inverse(MyReal.valueOf(1.5));
        assertEquals(MyRational.create(2,3), calculator.eval(inv));

        inv = new Inverse(MyReal.valueOf(0.5));
        assertEquals(MyInteger.valueOf(2), calculator.eval(inv));
    }

    @Test
    @Override
    public void testMyRational() throws Exception {
        Inverse inv = new Inverse(MyRational.create(4, 3));
        assertEquals(MyRational.create(3,4), calculator.eval(inv));
    }

    @Test
    @Override
    public void testMyComplex() throws Exception {
        Inverse inv = new Inverse(MyComplex.create(MyInteger.valueOf(5), MyInteger.valueOf(8)));
        assertEquals(MyComplex.create(MyRational.create(5, 89), MyRational.create(-8, 89)), calculator.eval(inv));
        // Inverse of a complex is different by nature

    }

    @Test
    @Override
    public void testMyInfinity() throws Exception {
        Inverse op = new Inverse(new MyInfinity(true));
        assertEquals(MyUndefinedNumber.class, calculator.eval(op).getClass());
        op = new Inverse(new MyInfinity(false));
        assertEquals(MyUndefinedNumber.class, calculator.eval(op).getClass());
    }

    @Test
    @Override
    public void testMyUnknown() throws Exception {
        MyNumber res = op(MyUnknown.create(ConstantNumber.ONE, ConstantNumber.ONE));
        assertEquals(MyErrorNumber.class, res.getClass());
    }


    private MyNumber op(MyNumber a) {
        return UnaryOperation.op(a, Inverse::new);
    }

}
