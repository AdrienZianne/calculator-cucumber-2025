package calculator.operation.unary;

import calculator.*;

/**
 * A class used to represent the negation of an expression.
 * Let {@code x} be our expression, the operation will result in {@code -x}.
 */
public class Negation extends UnaryOperation {
    /**
     * The default constructor of the {@link Negation} class.
     * 
     * @param expression An expression to apply the negation to.
     * @throws IllegalConstruction
     */
    public Negation(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }

    /**
     * A constructor of the {@link Negation} class.
     * 
     * @param argument The argument to apply the negation operation.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public Negation(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation);
        symbol = "-";
    }

    @Override
    public MyNumber op(MyInteger i) {
        return MyInteger.valueOf(i.getValue().negate());
    }

    @Override
    public MyNumber op(MyReal r) {
        return new MyReal(r.getValue().negate());
    }

    @Override
    public MyNumber op(MyRational r) {
        return MyRational.create(MyInteger.valueOf(r.getNumDenomPair().a.getValue().negate()),
                r.getNumDenomPair().b);
    }

    @Override
    public MyNumber op(MyComplex c) {
        return MyComplex.create(op(c.getRealImaginaryPair().a), op(c.getRealImaginaryPair().b));
    }
}
