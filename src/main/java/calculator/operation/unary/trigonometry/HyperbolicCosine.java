package calculator.operation.unary.trigonometry;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Notation;

/**
 * A class used to represent the hyperbolic cosine operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code cosh(x)}.
 */
public class HyperbolicCosine  extends TrigonometricFunction{
    /**
     * A constructor of the {@link HyperbolicCosine} class.
     * @param expression An expression to apply the cosh operation to.
     * @throws IllegalConstruction
     */
    public HyperbolicCosine(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }


    /**
     * A constructor of the {@link HyperbolicCosine} class.
     * @param argument An expression to apply the cosh operation.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public HyperbolicCosine(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::cosh);
        this.symbol = "cosh";
    }
}
