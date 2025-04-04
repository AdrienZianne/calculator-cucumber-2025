package calculator.operation.unary.trigonometry;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Notation;

/**
 * A class used to represent the tangent operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code tan(x)}.
 */
public class Tangent extends TrigonometricFunction {
    /**
     * A constructor of the {@link Tangent} class.     
     * @param expression An expression to apply the tan operation to.
     * @throws IllegalConstruction
     */
    public Tangent(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }

    /**
     * A constructor of the {@link Tangent} class.     
     * @param argument An expression to apply the tan operation.
     * @param notation The notation to display this operation with
     * @throws IllegalConstruction
     */
    public Tangent(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::tan);
        this.symbol = "tan";
    }


}
