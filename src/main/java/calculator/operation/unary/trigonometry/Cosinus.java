package calculator.operation.unary.trigonometry;

import calculator.*;

/**
 * A class used to represent the cosinus operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code cos(x)}.
 */
public class Cosinus extends TrigonometricFunction {
    /**
     * The default constructor of the {@link Cosinus} class.
     * @param expression An expression to apply the cosinus operation.
     * @throws IllegalConstruction
     */
    public Cosinus(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }
    /**
     * A constructor of the {@link Cosinus} class.     
     * @param argument An expression to apply the cosinus operation.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public Cosinus(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::cos);
        this.symbol = "cos";
    }


    @Override
    public MyNumber isNotInBound(MyReal nb) {
        return null; // all reals are accepted
    }
}
