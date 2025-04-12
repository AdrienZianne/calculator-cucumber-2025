package calculator.operation.unary;

import calculator.*;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Divides;
import calculator.operation.binary.Times;

import java.math.MathContext;

public class SquareRoot extends UnaryOperation {
    public SquareRoot(Expression e) throws IllegalConstruction {
        this(e, null);
    }

    public SquareRoot(Expression e, Notation n) throws IllegalConstruction {
        super(e, n);
        symbol = "sqrt";
    }

    @Override
    public MyNumber op(MyInteger i) {
        return op(MyReal.valueOf(i.getValue().doubleValue()));
    }

    @Override
    public MyNumber op(MyReal r) {
        return new MyReal(r.getValue().sqrt(new MathContext(MyReal.PRECISION)));
    }

    @Override
    public MyNumber op(MyRational r) {
        // sqrt(a/b) = sqrt(a*b) / b
        MyNumber num = op(BinaryOperation.op(r.getNumDenomPair().a, r.getNumDenomPair().b, Times::new));
        return BinaryOperation.op(
                num,
                r.getNumDenomPair().b, Divides::new);
    }

    @Override
    public MyNumber op(MyComplex c) {
        return new MyErrorNumber(this, "Complex operations are not supported by the square root operation.");
    }
}
