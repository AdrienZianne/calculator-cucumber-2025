package calculator.operation.unary;

import calculator.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSquareRoot extends TestUnaryOperation {
    @BeforeEach
    public void setup() {
        Configuration.setRealPrecision(5);
    }

    @Test
    @Override
    public void testInteger() throws Exception {
        SquareRoot root = new SquareRoot(MyInteger.valueOf(4));
        assertEquals(MyReal.valueOf(2), calculator.eval(root));

        root = new SquareRoot(MyInteger.valueOf(-4));
        assertEquals(MyComplex.create(ConstantNumber.ZERO, MyInteger.valueOf(2)), calculator.eval(root));
    }

    @Test
    @Override
    public void testMyReal() throws Exception {
        SquareRoot root = new SquareRoot(MyReal.valueOf(6.6));
        assertEquals(MyReal.valueOf(2.56905), calculator.eval(root));

        root = new SquareRoot(MyReal.valueOf(-3.4));
        assertEquals(MyComplex.create(ConstantNumber.ZERO, MyReal.valueOf(1.84391)), calculator.eval(root));

    }

    @Test
    @Override
    public void testMyRational() throws Exception {
        Configuration.setRealPrecision(5);
        SquareRoot root = new SquareRoot(MyRational.toRational(MyReal.valueOf(6.6)));
        assertEquals(MyRational.toRational(MyReal.valueOf(2.56904)), calculator.eval(root));

        root = new SquareRoot(MyRational.toRational(MyReal.valueOf(-6.6)));
        assertEquals(MyComplex.create(ConstantNumber.ZERO, MyRational.toRational(MyReal.valueOf(2.56904))), calculator.eval(root));

    }

    @Test
    @Override
    public void testMyComplex() throws Exception {
        SquareRoot root = new SquareRoot(MyComplex.create(1,1));
        assertEquals(MyErrorNumber.class, calculator.eval(root).getClass());
    }

    @Test
    @Override
    public void testMyInfinity() throws Exception {
        SquareRoot op = new SquareRoot(new MyInfinity(true));
        assertEquals(MyErrorNumber.class, calculator.eval(op).getClass());
        op = new SquareRoot(new MyInfinity(false));
        assertEquals(MyErrorNumber.class, calculator.eval(op).getClass());
    }
}
