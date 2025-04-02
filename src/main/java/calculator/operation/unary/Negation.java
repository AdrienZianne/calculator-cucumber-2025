package calculator.operation.unary;

import calculator.*;
import jdk.jshell.spi.ExecutionControl;

/**
 * A class used to represent the negation of an expression.
 * Let {@code x} be our expression, the operation will result in {@code -x}.
 */
public class Negation extends UnaryOperation {
    /**
     * The default contructor of the {@link Negation} class.
     * @param expression An expression to apply the negation to.
     * @throws IllegalConstruction
     */
    public Negation(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }

    /**
     * A contructor of the {@link Negation} class.
     * @param argument The argument to apply to the negation operation.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public Negation(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation);
        symbol = "-";
    }

    @Override
    public MyNumber op(MyInteger i) throws IllegalConstruction {
        return MyInteger.valueOf(i.getValue().negate());
    }

    @Override
    public MyNumber op(MyReal r) throws IllegalConstruction {
        return new MyReal(r.getValue().negate());
    }

    @Override
    public MyNumber op(MyRational r) throws IllegalConstruction {
        return new MyRational(MyInteger.valueOf(r.getNumDenomPair().a.getValue().negate()),
                            r.getNumDenomPair().b).simplify();
    }

    @Override
    public MyNumber op(MyComplex c) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        return new MyComplex(op(c.getRealImaginaryPair().a), op(c.getRealImaginaryPair().b));
    }
}
