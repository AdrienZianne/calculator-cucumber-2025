package calculator.operation.unary;

import calculator.*;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Exponent;
import calculator.operation.binary.Plus;

/**
 * A class used to represent the absolute operation for an expression.
 * Let {@code x} be our expression, the operation will result in {@code |x|} or written like {@code abs(x)}.
 */
public final class Absolute extends UnaryOperation {
    /**
     * The default constructor of the {@link Absolute} class.
     *
     * @param arg The argument to apply the inverse operation to.
     * @throws IllegalConstruction
     */
    public Absolute(Expression arg) throws IllegalConstruction {
        this(arg, null);
    }

    /**
     * A constructor of the {@link Absolute} class.
     *
     * @param arg      The argument to apply the inverse operation to.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public Absolute(Expression arg, Notation notation) throws IllegalConstruction {
        super(arg, notation);
        symbol = "abs";
    }

    @Override
    public MyNumber op(MyInteger i) {
        return MyInteger.valueOf(i.getValue().abs());
    }

    @Override
    public MyNumber op(MyReal r) {
        return new MyReal(r.getValue().abs());
    }

    @Override
    public MyNumber op(MyRational r) {
        return MyRational.create(MyInteger.valueOf(r.getNumDenomPair().a.getValue().abs()),
                MyInteger.valueOf(r.getNumDenomPair().b.getValue().abs()));
    }

    @Override
    public MyNumber op(MyComplex c) {
        // |a+bi| = sqrt(a^2 + b^i)
        MyNumber aSquared = BinaryOperation.op(c.getRealImaginaryPair().a, MyInteger.valueOf(2), Exponent::new);
        MyNumber bSquared = BinaryOperation.op(c.getRealImaginaryPair().b, MyInteger.valueOf(2), Exponent::new);
        MyNumber sum = BinaryOperation.op(aSquared, bSquared, Plus::new);
        return UnaryOperation.op(sum, SquareRoot::new);
    }

    @Override
    public MyNumber op(MyUnknown x) {
        return new MyErrorNumber(this, "Expression with unknown factors are not supported by the absolute operation");
    }

    @Override
    public MyNumber op(MyInfinity i) {
        return new MyInfinity(true);
    }
}
