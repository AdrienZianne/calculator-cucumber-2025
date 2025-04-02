package calculator.operation.unary.trigonometry;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Notation;

/**
 * A class used to represent the arc tangent operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code atan(x)}.
 */
public class Arctangent extends TrigonometricFunction {
    /**
     * A constructor of the {@link Arctangent} class.
     * @param expression An expression to apply the arc tan operation to.
     * @throws IllegalConstruction
     */
    public Arctangent(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }

    /**
     * A constructor of the {@link Arctangent} class.
     * @param argument An expression to apply the arc tan operation.
     * @param notation The notation to display this operation with
     * @throws IllegalConstruction
     */
    public Arctangent(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::atan);
        this.symbol = "atan";
    }
}
