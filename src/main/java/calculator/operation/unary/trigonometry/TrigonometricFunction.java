package calculator.operation.unary.trigonometry;

import calculator.*;
import calculator.operation.unary.UnaryOperation;

import java.util.Objects;

/**
 * An abstract class representing all trigonometric functions such as sin, cos,
 * tan, atan,...
 */
public abstract class TrigonometricFunction extends UnaryOperation {
    /**
     * An interface used to store the function to call when applying a trigonometric
     * function.
     */
    @FunctionalInterface
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


    /**
     * Checks if the real value can be processed by the function.
     * @param nb The instance to check.
     * @return An instance of the {@link MyErrorNumber} class if the value is not supported. {@code null} otherwise.
     */
    public abstract MyNumber isNotInBound(MyReal nb);

    @Override
    public MyNumber op(MyInteger i) {
        return op(MyReal.valueOf(i.getValue().doubleValue()));
    }

    @Override
    public MyNumber op(MyRational r) {
        return op(MyReal.toReal(r));
    }

    @Override
    public MyNumber op(MyReal r) {
        // Check if the value can be applied.
        MyNumber err = isNotInBound(r);
        if (err != null) {return err;}

        if (!r.isDouble()) return new MyErrorNumber(this, "The given argument is not a valid double : " + r.getValue());

        Double resDouble = functionExec.apply(r.getValue().doubleValue());
        if (resDouble.equals(Double.POSITIVE_INFINITY) || resDouble.equals(Double.NEGATIVE_INFINITY)) {return new MyErrorNumber(this, "The given argument results in an infinite number ");}

        MyReal res = MyReal.valueOf(resDouble);
        return MyRational.toRational(res);
    }

    @Override
    public MyNumber op(MyComplex c) {
        // It's impossible to apply a trigonometric function to a complex value
        // for now at least
        return new MyErrorNumber(this, "Tried to apply a trigonometric function on the following complex value: "
                + c + ". This has not been implemented yet.");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrigonometricFunction that = (TrigonometricFunction) o;
        return Objects.equals(functionExec, that.functionExec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), functionExec);
    }
}
