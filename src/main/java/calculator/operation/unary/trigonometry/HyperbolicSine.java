package calculator.operation.unary.trigonometry;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Notation;

/**
 * A class used to represent the hyperbolic sine operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code sinh(x)}.
 */
public class HyperbolicSine extends TrigonometricFunction {
    /**
     * A constructor of the {@link HyperbolicSine} class.
     * @param expression An expression to apply the sinh operation to.
     * @throws IllegalConstruction
     */
    public HyperbolicSine(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }

    /**
     * A constructor of the {@link HyperbolicSine} class.
     * @param argument An expression to apply the sinh operation.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public HyperbolicSine(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::sinh);
        this.symbol = "sinh";
    }
}
