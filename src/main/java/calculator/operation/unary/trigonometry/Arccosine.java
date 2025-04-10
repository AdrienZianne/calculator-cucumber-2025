package calculator.operation.unary.trigonometry;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Notation;

/**
 * A class used to represent the arc cosine operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code acos(x)}.
 */
public class Arccosine extends TrigonometricFunction {
    /**
     * The default constructor of the {@link Arccosine} class.
     * @param expression An expression to apply the inverse cosine operation.
     * @throws IllegalConstruction
     */
    public Arccosine(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }
    /**
     * A constructor of the {@link Cosinus} class.
     * @param argument An expression to apply the inverse cosine operation.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public Arccosine(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::acos);
        this.symbol = "acos";
    }


}