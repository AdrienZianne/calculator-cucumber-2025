package calculator.operation.unary;

import calculator.*;
import jdk.jshell.spi.ExecutionControl;

/**
 * A class used to represent the logarithmic value of an expression.
 * Let {@code x} be our expression, the operation will result in {@code log(x)}.
 * Will throw an {@link IllegalConstruction} when applying a logarithm operation
 * on a number that is zero.
 */
public class Logarithm extends UnaryOperation {

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
     * A constructor of the {@link Negation} class.
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
    public MyNumber op(MyInteger i) throws IllegalConstruction {
        return op(MyReal.valueOf(i.getValue().doubleValue()));
    }

    @Override
    public MyNumber op(MyReal r) throws IllegalConstruction {
        MyErrorNumber check = checkValidity(r);
        if (check != null)
            return check;
        // Will make us lose some information
        MyReal res = MyReal.valueOf(Math.log(r.getValue().doubleValue()));
        return MyRational.toRational(res);
    }

    @Override
    public MyNumber op(MyRational r) throws IllegalConstruction {
        // Will make us lose some information
        return op(MyReal.toReal(r));
    }

    @Override
    public MyNumber op(MyComplex c) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        MyErrorNumber check = checkValidity(c);
        if (check != null)
            return check;
        return new MyErrorNumber(this, "Tried to apply the log operation on the following complex value: " + c);
    }

    private MyErrorNumber checkValidity(MyNumber nb) {
        if (nb.isZero())
            return new MyErrorNumber(this,
                    "Tried to apply the log operation on an expression that resulted in : " + nb);
        if (nb.getSign() < 0) {
            return new MyErrorNumber(this,
                    "Tried to apply the log operation on an expression that resulted in the following negative value : "
                            + nb);
        }
        return null;
    }
}
