package calculator.operation;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Notation;

public class Tangent extends TrigonometricFunction {
    public Tangent(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }
    public Tangent(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::tan);
        this.symbol = "tan";
    }


}
