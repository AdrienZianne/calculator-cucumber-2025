package calculator.operation.unary;

import calculator.*;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Divides;
import calculator.operation.binary.Times;

import java.math.MathContext;

/**
 * A class used to represent the SquareRoot operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code sqrt(x)}.
 */
public final class SquareRoot extends UnaryOperation {
    /**
     * The default constructor of the {@link SquareRoot} class.
     * @param e An expression to apply the sqrt operation to.
     */
    public SquareRoot(Expression e) throws IllegalConstruction {
        this(e, null);
    }


    /**
     * A constructor of the {@link SquareRoot} class.
     * @param e An expression to apply the sqrt operation.
     * @param n The notation to display this operation with.
     */
    public SquareRoot(Expression e, Notation n) throws IllegalConstruction {
        super(e, n);
        symbol = "sqrt";
    }

    @Override
    public MyNumber op(MyInteger i) {
        MyReal iR = MyReal.toReal(i);
        return op(iR);
    }

    @Override
    public MyNumber op(MyReal r) {
        if (r.getSign() < 0)
        {
            if (!Configuration.usesComplexDomainDefault())
                return new MyErrorNumber(this, "Cannot apply the sqrt operation on negative number " +
                        "because the imaginary domain is not set to true by default");
            // sqrt(-a) = sqrt(a * i^2) = sqrt(a) * i
            return MyComplex.create(ConstantNumber.ZERO, op(UnaryOperation.op(r, Negation::new)));
        }
        MyNumber check = checkValidity(r);
        if (check != null)
        {
            return check;
        }
        return new MyReal(r.getValue().sqrt(new MathContext(Configuration.getRealPrecision()+1, Configuration.getRealRoundingMode())));
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
        return new MyErrorNumber(this, "Complex numbers are not supported by the sqrt operation.");
    }

    @Override
    public MyNumber op(MyUnknown x) {
        return new MyErrorNumber(this, "Expression with unknown factors are not supported by the sqrt operation");
    }


    @Override
    public MyNumber op(MyInfinity i) {
        return new MyErrorNumber(this, "Infinity numbers are not supported by the sqrt operation.");
    }

    private MyNumber checkValidity(MyReal num) {
        if (!num.isDouble()) return new MyErrorNumber(this, "The value stored, cannot be converted to a double.");
        return null;
    }
}
