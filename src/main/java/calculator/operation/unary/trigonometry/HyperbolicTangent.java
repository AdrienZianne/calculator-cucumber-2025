package calculator.operation.unary.trigonometry;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Notation;

/**
 * A class used to represent the hyperbolic tangent operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code tanh(x)}.
 */
public class HyperbolicTangent extends TrigonometricFunction {
    /**
     * A constructor of the {@link HyperbolicTangent} class.
     * @param expression An expression to apply the tanh operation to.
     * @throws IllegalConstruction
     */
    public HyperbolicTangent(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }

    /**
     * A constructor of the {@link HyperbolicTangent} class.
     * @param argument An expression to apply the tanh operation.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public HyperbolicTangent(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::tanh);
        this.symbol = "tanh";
    }
}
