package calculator.operation.unary;

import calculator.*;

/**
 * A class used to represent the logarithmic value of an expression.
 * Let {@code x} be our expression, the operation will result in {@code log(x)}.
 */
public final class Logarithm extends UnaryOperation {

    /**
     * The default constructor of the {@link Logarithm} class.
     * 
     * @param expression An expression to apply the logarithm to.
     * @throws IllegalConstruction
     */
    public Logarithm(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }

    /**
     * A constructor of the {@link Logarithm} class.
     * 
     * @param argument The argument to apply the logarithm operation to.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public Logarithm(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation);
        symbol = "log";
    }

    @Override
    public MyNumber op(MyInteger i) {
        return op(MyReal.valueOf(i.getValue().doubleValue()));
    }

    @Override
    public MyNumber op(MyReal r) {
        MyErrorNumber check = checkValidity(r);
        if (check != null)
            return check;
        MyReal res = MyReal.valueOf(Math.log(r.getValue().doubleValue()));
        return MyRational.toRational(res);
    }

    @Override
    public MyNumber op(MyRational r) {
        // Will make us lose some information
        return op(MyReal.toReal(r));
    }

    @Override
    public MyNumber op(MyComplex c) {
        MyErrorNumber check = checkValidity(c);
        if (check != null)
            return check;
        return new MyErrorNumber(this, "Tried to apply the log operation on the following complex value: " + c);
    }

    @Override
    public MyNumber op(MyUnknown x) {
        return new MyErrorNumber(this, "Expression with unknown factors are not supported by the logarithm operation");
    }

    @Override
    public MyNumber op(MyInfinity i) {
        MyErrorNumber check = checkValidity(i);
        if (check != null)
            return check;
        return new MyInfinity(true);
    }

    private MyErrorNumber checkValidity(MyNumber nb) {
        if (nb.isZero())
            return new MyErrorNumber(this,
                    "Tried to apply the log operation on an expression that resulted in zero");
        if (nb.getSign() < 0) {
            return new MyErrorNumber(this,
                    "Tried to apply the log operation on an expression that resulted in a negative value");
        }
        if (nb instanceof MyReal r && !r.isDouble()) return new MyErrorNumber(this, "The given real number cannot be converted to a double");

        return null;
    }
}
