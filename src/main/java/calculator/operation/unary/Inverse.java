package calculator.operation.unary;

import calculator.*;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Divides;
import calculator.operation.binary.Times;
import calculator.operation.binary.Plus;

import java.util.List;

/**
 * A class used to represent the inversion of an expression.
 * Let {@code x} be our expression, the operation will result in {@code 1/x}.
 */
public class Inverse extends UnaryOperation {
    /**
     * The default constructor of the {@link Inverse} class.
     * 
     * @param arg The argument to apply the inverse operation to.
     * @throws IllegalConstruction
     */
    public Inverse(Expression arg) throws IllegalConstruction {
        this(arg, null);
    }

    /**
     * A constructor of the {@link Inverse} class.
     * 
     * @param arg      The argument to apply the inverse operation to.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public Inverse(Expression arg, Notation notation) throws IllegalConstruction {
        super(arg, notation);
        symbol = "1/";
    }

    @Override
    public MyNumber op(MyInteger i) {
        return MyRational.create(MyInteger.valueOf(1), MyInteger.valueOf(i.getValue()));
    }

    @Override
    public MyNumber op(MyReal r) {
        MyNumber rational = MyRational.toRational(r);
        return op(rational);
    }

    @Override
    public MyNumber op(MyRational r) {
        return MyRational.create(r.getNumDenomPair().b, r.getNumDenomPair().a);
    }

    @Override
    public MyNumber op(MyComplex c) {
        // Denom : a^2 + b^2
        MyNumber denom = BinaryOperation.op(BinaryOperation.op(c.getRealImaginaryPair().a, c.getRealImaginaryPair().a, Times::new),
                                            BinaryOperation.op(c.getRealImaginaryPair().b, c.getRealImaginaryPair().b, Times::new),
                                            Plus::new);

        return MyComplex.create(BinaryOperation.op(c.getRealImaginaryPair().a, denom, Divides::new),
                UnaryOperation.op(BinaryOperation.op(c.getRealImaginaryPair().b, denom, Divides::new), Negation::new));
    }
}
