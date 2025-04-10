package calculator.operation.unary;

import calculator.*;
import calculator.operation.BuildUnaryOperationFunction;
import calculator.operation.Operation;

import java.util.List;

/**
 * Class used to implement unary operations.
 */
public abstract class UnaryOperation extends Operation {

    /**
     * The default constructor of the {@link UnaryOperation} class.
     * @param argument The argument to pass to the operation.
     * @param notation The notation to display the operation.
     * @param notation The notation to display the operation.
     * @throws IllegalConstruction
     */
    public UnaryOperation(Expression argument, Notation notation) throws IllegalConstruction {
        super(List.of(argument), notation);
    }

    public MyNumber op(MyNumber a) {
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

    public abstract MyNumber op(MyInteger i);

    public abstract MyNumber op(MyReal r);

    public abstract MyNumber op(MyRational r);

    public abstract MyNumber op(MyComplex c);

    /**
     * Creates and calls an operation on the given arguments.
     * This method is useful in case one wishes not to deal with {@link IllegalConstruction} errors.
     * Instead, if an error is thrown it will be stored inside a {@link MyErrorNumber} instance.
     * @param arg The argument to pass to the unary operator.
     * @param builder A functional interface used to create the needed operation.
     * @return The result of the computation. Will return a {@link MyErrorNumber} instance if something went wrong.
     * @param <T> The {@link UnaryOperation} to create.
     */
    public static <T extends UnaryOperation> MyNumber op(MyNumber arg, BuildUnaryOperationFunction<T> builder)
    {
        UnaryOperation u;
        try {
            u = builder.build(arg);
        } catch (IllegalConstruction e) {
            return new MyErrorNumber(null, e.getMessage());
        }
        return u.op(arg);
    }
}
