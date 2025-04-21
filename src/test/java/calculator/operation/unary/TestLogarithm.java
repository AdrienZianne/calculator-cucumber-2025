package calculator.operation.unary;

import calculator.*;
import calculator.operation.TestUnaryOperation;
import io.cucumber.java.eo.Do;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class TestLogarithm extends TestUnaryOperation {
    private final Calculator calculator = new Calculator();

    @BeforeEach
    void setup()
    {
        Configuration.setRealPrecision(5);
    }

    @Test
    @Override
    public void testInteger() throws Exception {
        Logarithm inv = new Logarithm(ConstantNumber.ONE);
        assertEquals(ConstantNumber.ZERO, calculator.eval(inv));

        inv = new Logarithm(MyInteger.valueOf(3));
        assertEquals(MyReal.valueOf(1.098612), calculator.eval(inv));

        inv = new Logarithm(ConstantNumber.ZERO);
        assertEquals(MyErrorNumber.class, calculator.eval(inv).getClass());

        inv = new Logarithm(MyInteger.valueOf(-4));
        assertEquals(MyErrorNumber.class, calculator.eval(inv).getClass());

        inv = new Logarithm(MyInteger.valueOf(Integer.MAX_VALUE));
        assertNotEquals(MyErrorNumber.class, calculator.eval(inv).getClass());
    }

    @Test
    @Override
    public void testMyReal() throws Exception {
        Logarithm inv = new Logarithm(ConstantNumber.ONE);
        assertEquals(ConstantNumber.ZERO, calculator.eval(inv));

        inv = new Logarithm(MyReal.valueOf(3.5));
        assertEquals(MyReal.valueOf(1.25276), calculator.eval(inv));

        inv = new Logarithm(MyReal.valueOf(-4.5));
        assertEquals(MyErrorNumber.class, calculator.eval(inv).getClass());

        inv = new Logarithm(MyReal.valueOf(Double.MAX_VALUE));
        assertNotEquals(MyErrorNumber.class, calculator.eval(inv).getClass());

        inv = new Logarithm(new MyReal(BigDecimal.valueOf(Double.MAX_VALUE).add(BigDecimal.valueOf(Double.MAX_VALUE))));

        assertEquals(MyErrorNumber.class, calculator.eval(inv).getClass());
    }

    @Test
    @Override
    public void testMyRational() throws Exception {

        Logarithm inv = new Logarithm(MyRational.toRational(MyReal.valueOf(3.5)));
        assertEquals(MyReal.valueOf(1.25276), calculator.eval(inv));

        inv = new Logarithm(MyRational.toRational(MyReal.valueOf(-4.5)));
        assertEquals(MyErrorNumber.class, calculator.eval(inv).getClass());
    }

    @Test
    @Override
    public void testMyComplex() throws Exception {
        Logarithm inv = new Logarithm(MyComplex.create(1, 2));
        assertEquals(MyErrorNumber.class, calculator.eval(inv).getClass());
    }
}
