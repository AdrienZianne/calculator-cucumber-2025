package calculator.operation.unary;

import calculator.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestNegation extends TestUnaryOperation {

    @Test
    @Override
    public void testInteger() throws Exception {
        Negation neg = new Negation(ConstantNumber.ZERO);
        assertEquals(ConstantNumber.ZERO, calculator.eval(neg));

        neg = new Negation(ConstantNumber.ONE);
        assertEquals(MyInteger.valueOf(-1), calculator.eval(neg));
    }

    @Test
    @Override
    public void testMyReal() throws Exception {
        Negation neg = new Negation(MyReal.valueOf(2.5));
        assertEquals(MyReal.valueOf(-2.5), calculator.eval(neg));
    }

    @Test
    @Override
    public void testMyRational() throws Exception {
        Negation neg = new Negation(MyRational.create(2,3));
        assertEquals(MyRational.create(-2,3), calculator.eval(neg));
    }

    @Test
    @Override
    public void testMyComplex() throws Exception {
        Negation neg = new Negation(MyComplex.create(MyInteger.valueOf(-1), MyInteger.valueOf(2)));
        assertEquals(MyComplex.create(1, -2), calculator.eval(neg));
    }

    @Test
    @Override
    public void testMyInfinity() throws Exception {
        Negation neg = new Negation(new MyInfinity(true));
        assertEquals(new MyInfinity(false), calculator.eval(neg));
        neg = new Negation(new MyInfinity(false));
        assertEquals(new MyInfinity(true), calculator.eval(neg));
    }

    @Test
    @Override
    public void testMyUnknown() throws Exception {
        MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
                        new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
                        new Pair<>(MyInteger.valueOf(5), MyInteger.valueOf(3)),
                        new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(0)),
                        new Pair<>(MyInteger.valueOf(5), MyInteger.valueOf(20))
                ),
                MyInteger.valueOf(8));

        MyUnknown val = (MyUnknown) MyUnknown.create(List.of(
                        new Pair<>(MyInteger.valueOf(-2), MyInteger.valueOf(3)),
                        new Pair<>(MyInteger.valueOf(-5), MyInteger.valueOf(3)),
                        new Pair<>(MyInteger.valueOf(-2), MyInteger.valueOf(0)),
                        new Pair<>(MyInteger.valueOf(-5), MyInteger.valueOf(20))
                ),
                MyInteger.valueOf(-8));


        assertEquals(val, op(other));
    }

    private MyNumber op(MyNumber a) {
        return UnaryOperation.op(a, Negation::new);
    }
}
