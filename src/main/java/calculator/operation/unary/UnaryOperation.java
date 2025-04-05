package calculator.operation.unary;

import calculator.*;
import calculator.operation.Operation;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public abstract class UnaryOperation extends Operation {

    public UnaryOperation(Expression argument, Notation notation) throws IllegalConstruction {
        super(List.of(argument), notation);
    }

    public MyNumber op(MyNumber a) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        return switch (a) {
            case MyInteger i -> op(i);
            case MyReal r -> op(r);
            case MyRational rr -> op(rr);
            case MyComplex c -> op(c);
            case MyErrorNumber e -> e; // Simply pass the error up.
            default -> new MyErrorNumber(this, "The given operation is not implemented yet for the " +
                    "given MyNumber subclass: " + a.getClass());
        };
    }


    public abstract MyNumber op(MyInteger i) throws IllegalConstruction;
    public abstract MyNumber op(MyReal r) throws IllegalConstruction;
    public abstract MyNumber op(MyRational r) throws IllegalConstruction;
    public abstract MyNumber op(MyComplex c) throws IllegalConstruction, ExecutionControl.NotImplementedException;
}
