package calculator.operation.unary;

import calculator.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSquareRoot extends TestUnaryOperation {

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
        assertEquals(MyReal.valueOf(2.569), calculator.eval(root));

        root = new SquareRoot(MyReal.valueOf(-3.4));
        assertEquals(MyComplex.create(ConstantNumber.ZERO, MyReal.valueOf(1.8439)), calculator.eval(root));

    }

    @Test
    @Override
    public void testMyRational() throws Exception {
        SquareRoot root = new SquareRoot(MyRational.toRational(MyReal.valueOf(6.6)));
        assertEquals(MyRational.toRational(MyReal.valueOf(2.569)), calculator.eval(root));

        root = new SquareRoot(MyRational.toRational(MyReal.valueOf(-6.6)));
        assertEquals(MyComplex.create(ConstantNumber.ZERO, MyRational.toRational(MyReal.valueOf(2.569))), calculator.eval(root));

    }

    @Test
    @Override
    public void testMyComplex() throws Exception {
        SquareRoot root = new SquareRoot(MyComplex.create(1,1));
        assertEquals(MyErrorNumber.class, calculator.eval(root).getClass());
    }
}
