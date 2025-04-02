package calculator.operation;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Notation;

public class Cosinus extends TrigonometricFunction {
    public Cosinus(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }
    public Cosinus(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::cos);
        this.symbol = "cos";
    }


}
