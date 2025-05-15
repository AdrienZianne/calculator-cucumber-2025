package calculator.operation.unary.trigonometry;

import calculator.*;

import java.math.BigDecimal;

/**
 * A class used to represent the arc sinus operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code asin(x)}.
 */
public final class Arcsine extends TrigonometricFunction {
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

    @Override
    public MyNumber isNotInBound(MyReal nb) {
        if (nb.getValue().abs().compareTo(BigDecimal.valueOf(1)) > 0)
            return new MyErrorNumber(this, "The argument must be between -1 and 1 inclusive.");
        return null;
    }
}
