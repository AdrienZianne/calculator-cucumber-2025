package calculator.operation.unary;

import calculator.MyInteger;
import calculator.MyReal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestRadianToDegree extends TestUnaryOperation{
    @Test
    @Override
    public void testInteger() throws Exception {
        RadianToDegree op = new RadianToDegree(new MyInteger(1));

        assertEquals(MyReal.valueOf(57.2958), calculator.eval(op));
    }

    @Test
    @Override
    public void testMyReal() throws Exception {

    }

    @Test
    @Override
    public void testMyRational() throws Exception {

    }

    @Test
    @Override
    public void testMyComplex() throws Exception {

    }
}
