package calculator.operation.unary.trigonometry;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Notation;

/**
 * A class used to represent the arc sinus operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code asin(x)}.
 */
public class Arcsine extends TrigonometricFunction {
    /**
     * A constructor of the {@link Arcsine} class.
     * @param expression An expression to apply the arc sin operation to.
     * @throws IllegalConstruction
     */
    public Arcsine(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }


    /**
     * A constructor of the {@link Arcsine} class.
     * @param argument An expression to apply the arc sinus operation.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public Arcsine(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::asin);
        this.symbol = "asin";
    }

}
