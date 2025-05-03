package calculator.operation.unary;

import calculator.Calculator;
import org.junit.jupiter.api.Test;

public abstract class TestUnaryOperation {

    public final Calculator calculator = new Calculator();

    @Test
    public abstract void testInteger() throws Exception;
    @Test
    public abstract void testMyReal() throws Exception;
    @Test
    public abstract void testMyRational() throws Exception;
    @Test
    public abstract void testMyComplex() throws Exception;
    @Test
    public abstract void testMyInfinity() throws Exception;

}
