package calculator.operation;

import calculator.*;
import jdk.jshell.spi.ExecutionControl;

public class Sinus extends TrigonometricFunction {
    public Sinus(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }
    public Sinus(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation, Math::sin);
        this.symbol = "sin";
    }


}
