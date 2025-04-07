package calculator.operation.unary.trigonometry;

import calculator.*;
import calculator.operation.unary.UnaryOperation;
import jdk.jshell.spi.ExecutionControl;

/**
 * An abstract class representing all trigonometric functions such as sin, cos,
 * tan, atan,...
 */
public abstract class TrigonometricFunction extends UnaryOperation {
    /**
     * An interface used to store the function to call when applying a trigonometric
     * function.
     */
    public interface TrigonometricFuncExec {
        /**
         * Applies the trigonometric function to the given parameter. For example :
         * sin(x), cos(x),...
         * 
         * @param x The real value to feed to the trigonometric function.
         * @return The return value of the trigonometric function stored to {@code x}.
         */
        double apply(double x);
    }

    private final TrigonometricFuncExec functionExec;

    /**
     * Creates a new {@link TrigonometricFunction} instance
     * 
     * @param argument The argument to pass to the trigonometric function.
     * @param notation The notation to display to the trigonometric function.
     * @param funcExec The function to call with the {@code argument} in order to
     *                 apply the created trigonometric function.
     * @throws IllegalConstruction The given {@code argument} was not valid for the
     *                             trigonometric function.
     */
    public TrigonometricFunction(Expression argument, Notation notation, TrigonometricFuncExec funcExec)
            throws IllegalConstruction {
        super(argument, notation);
        this.functionExec = funcExec;
    }

    @Override
    public MyNumber op(MyInteger i) throws IllegalConstruction {
        return op(MyReal.valueOf(i.getValue().doubleValue()));
    }

    @Override
    public MyNumber op(MyRational r) throws IllegalConstruction {
        return op(MyReal.toReal(r));
    }

    @Override
    public MyNumber op(MyReal r) throws IllegalConstruction {
        // Will make us lose some information
        MyReal res = MyReal.valueOf(functionExec.apply(r.getValue().doubleValue()));
        return MyRational.toRational(res);
    }

    @Override
    public MyNumber op(MyComplex c) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        // It's impossible to apply a trigonometric function to a complex value
        // for now at least
        return new MyErrorNumber(this, "Tried to apply a trigonometric function on the following complex value: "
                + c + ". This has not been implemented yet.");
    }

}
