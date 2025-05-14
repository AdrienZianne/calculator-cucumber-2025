package calculator.operation.unary.trigonometry;

import calculator.*;

import java.math.BigDecimal;

/**
 * A class used to represent the arc cosine operation on a number.
 * Let {@code x} be our expression, the operation will result in {@code acos(x)}.
 */
public final class Arccosine extends TrigonometricFunction {
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


    @Override
    public MyNumber isNotInBound(MyReal nb) {
        if (nb.getValue().abs().compareTo(BigDecimal.valueOf(1)) > 0)
            return new MyErrorNumber(this, "The argument must be between -1 and 1 inclusive.");
        return null;
    }
}