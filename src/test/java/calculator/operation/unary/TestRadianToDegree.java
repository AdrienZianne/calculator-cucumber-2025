package calculator.operation.unary;

import calculator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRadianToDegree extends TestUnaryOperation{

    @Test
    @Override
    public void testInteger() throws Exception {
        Configuration.setRealPrecision(5);

        RadianToDegree op = new RadianToDegree(new MyInteger(1));
        assertEquals(MyReal.valueOf(57.29578), calculator.eval(op));

        op = new RadianToDegree(new MyInteger(2));
        assertEquals(MyReal.valueOf(114.59156), calculator.eval(op));
    }

    @Test
    @Override
    public void testMyReal() throws Exception {
        Configuration.setRealPrecision(5);

        RadianToDegree op = new RadianToDegree(new MyReal(10.2));
        assertEquals(MyReal.valueOf(584.41695), calculator.eval(op));

        op = new RadianToDegree(new MyReal(-5.2));
        assertEquals(MyReal.valueOf(-297.93805), calculator.eval(op));
    }

    @Test
    @Override
    public void testMyRational() throws Exception {
        Configuration.setRealPrecision(5);

        RadianToDegree op = new RadianToDegree(MyRational.create(10, 3));
        assertEquals(MyReal.valueOf(190.98593), calculator.eval(op));
    }

    @Test
    @Override
    public void testMyComplex() throws Exception {
        RadianToDegree op = new RadianToDegree(MyComplex.create(1,1));
        assertEquals(MyErrorNumber.class, calculator.eval(op).getClass());
    }
}
