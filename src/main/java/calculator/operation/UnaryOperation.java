package calculator.operation;

import calculator.*;
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
            default -> throw new IllegalStateException("The given operation is not implemented yet for the " +
                    "given MyNumber subclass: " + a.getClass());
        };
    }


    public abstract MyNumber op(MyInteger i) throws IllegalConstruction;
    public abstract MyNumber op(MyReal r) throws IllegalConstruction;
    public abstract MyNumber op(MyRational r) throws IllegalConstruction;
    public abstract MyNumber op(MyComplex c) throws IllegalConstruction, ExecutionControl.NotImplementedException;



}
