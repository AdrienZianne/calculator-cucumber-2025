package calculator.operation.unary.trigonometry;

import calculator.*;

/**
 * A class used to represent the sinus operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code sin(x)}.
 */
public class Sinus extends TrigonometricFunction {
    /**
     * A constructor of the {@link Sinus} class.     
     * @param expression An expression to apply the sinus operation to.
     * @throws IllegalConstruction
     */
    public Sinus(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }
    

    /**
     * A constructor of the {@link Sinus} class.     
     * @param argument An expression to apply the sinus operation.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public Sinus(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::sin);
        this.symbol = "sin";
    }


}
