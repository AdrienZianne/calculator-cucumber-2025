package calculator.operation.binary;

import calculator.MyNumber;
import org.junit.jupiter.api.Test;

public class TestModulus extends TestBinaryOperation {
    @Test
    @Override
    public void TestMyIntegerMyInteger() {

    }

    @Test
    @Override
    public void TestMyIntegerMyReal() {

    }

    @Test
    @Override
    public void TestMyIntegerMyComplex() {

    }

    @Test
    @Override
    public void TestMyIntegerMyRational() {

    }

    @Test
    @Override
    public void TestMyIntegerMyInfinity() {

    }

    @Test
    @Override
    public void TestMyRealMyInteger() {

    }

    @Test
    @Override
    public void TestMyRealMyReal() {

    }

    @Test
    @Override
    public void TestMyRealMyComplex() {

    }

    @Test
    @Override
    public void TestMyRealMyRational() {

    }

    @Test
    @Override
    public void TestMyRealMyInfinity() {

    }

    @Test
    @Override
    public void TestMyComplexMyInteger() {

    }

    @Test
    @Override
    public void TestMyComplexMyReal() {

    }

    @Test
    @Override
    public void TestMyComplexMyComplex() {

    }

    @Test
    @Override
    public void TestMyComplexMyRational() {

    }

    @Test
    @Override
    public void TestMyComplexMyInfinity() {

    }

    @Test
    @Override
    public void TestMyRationalMyInteger() {

    }

    @Test
    @Override
    public void TestMyRationalMyReal() {

    }

    @Test
    @Override
    public void TestMyRationalMyComplex() {

    }

    @Test
    @Override
    public void TestMyRationalMyRational() {

    }

    @Test
    @Override
    public void TestMyRationalMyInfinity() {

    }

    @Test
    @Override
    public void TestMyInfinityMyInteger() {

    }

    @Test
    @Override
    public void TestMyInfinityMyReal() {

    }

    @Test
    @Override
    public void TestMyInfinityMyComplex() {

    }

    @Test
    @Override
    public void TestMyInfinityMyRational() {

    }

    @Test
    @Override
    public void TestMyInfinityMyInfinity() {

    }

    private MyNumber op(MyNumber a, MyNumber b) {
        return BinaryOperation.op(a, b, Modulus::new);
    }
}
