package calculator.operation.binary;

import calculator.*;
import calculator.operation.BuildOperationFunction;
import calculator.operation.BuildUnaryOperationFunction;
import calculator.operation.Operation;
import calculator.operation.unary.UnaryOperation;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

/**
 * Operation is an abstract class that represents arithmetic operations,
 * which are a special kind of Expressions, just like numbers are.
 *
 * @see Expression
 * @see MyNumber
 */
public abstract class BinaryOperation extends Operation {

    /**
     * The neutral element of the operation (e.g. 1 for *, 0 for +)
     */
    protected int neutral;

    /**
     * To construct an operation with a list of expressions as arguments,
     * as well as the Notation used to represent the operation.
     *
     * @param elist The list of expressions passed as argument to the arithmetic operation
     * @param n     The notation to be used to represent the operation
     * @throws IllegalConstruction Exception thrown if a null list of expressions is passed as argument
     */
    protected /*constructor*/ BinaryOperation(List<Expression> elist, Notation n)
            throws IllegalConstruction {
        super(elist, n);
    }

    /**
     * Applies an operation to two numbers and returns it's results.
     * @param a an instance of a {@link MyNumber} subclass
     * @param b an instance of a {@link MyNumber} subclass
     * @return A new instance of a {@link MyNumber} subclass, being the result of the operation on {@code a} and  {@code b}.
     */
    public MyNumber op(MyNumber a, MyNumber b) {
        if (a instanceof MyErrorNumber e) {
            return e; // Simply pass the error up
        }
        if (b instanceof MyErrorNumber e) {
            return e; // Simply pass the error upwards
        }
        if (a instanceof MyInteger l)
        {
            if (b instanceof MyInteger r) { return op(l,r); }
            if (b instanceof MyReal r) { return op(l,r); }
            if (b instanceof MyComplex r) { return op(l,r); }
            if (b instanceof MyRational r) { return op(l,r); }
        }
        if (a instanceof MyReal l)
        {
            if (b instanceof MyReal r) { return op(l,r); }
            if (b instanceof MyComplex r) { return op(l,r); }
            if (b instanceof MyInteger r) { return op(l,r); }
            if (b instanceof MyRational r) { return op(l,r); }
        }
        if (a instanceof MyRational l)
        {
            if (b instanceof MyRational r) { return op(l,r); }
            if (b instanceof MyComplex r) { return op(l,r); }
            if (b instanceof MyInteger r) { return op(l,r); }
            if (b instanceof MyReal r) { return op(l,r); }
        }
        if (a instanceof MyComplex l)
        {
            if (b instanceof MyComplex r) { return op(l,r); }
            if (b instanceof MyReal r) { return op(l,r); }
            if (b instanceof MyInteger r) { return op(l,r); }
            if (b instanceof MyRational r) { return op(l,r); }
        }
        return new MyErrorNumber(this,"The given operation is not implemented yet for the " +
                "given MyNumber subclasses pair: " + a.getClass() + " and " + b.getClass());
        // Error : Not implemented
    }

    public abstract MyNumber op(MyInteger l, MyInteger r);
    public abstract MyNumber op(MyInteger l, MyReal r);
    public abstract MyNumber op(MyInteger l, MyComplex r);
    public abstract MyNumber op(MyInteger l, MyRational r);

    public abstract MyNumber op(MyReal l, MyInteger r);
    public abstract MyNumber op(MyReal l, MyReal r);
    public abstract MyNumber op(MyReal l, MyComplex r);
    public abstract MyNumber op(MyReal l, MyRational r);

    public abstract MyNumber op(MyComplex l, MyInteger r);
    public abstract MyNumber op(MyComplex l, MyReal r);
    public abstract MyNumber op(MyComplex l, MyComplex r);
    public abstract MyNumber op(MyComplex l, MyRational r);

    public abstract MyNumber op(MyRational l, MyInteger r);
    public abstract MyNumber op(MyRational l, MyReal r);
    public abstract MyNumber op(MyRational l, MyComplex r);
    public abstract MyNumber op(MyRational l, MyRational r);


    // the operation itself is specified in the subclasses

    /**
     * Add more parameters to the existing list of parameters
     *
     * @param params The list of parameters to be added
     */
    public void addMoreParams(List<Expression> params) {
        args.addAll(params);
    }

    /**
     * Creates and calls an operation on the given arguments.
     * This method is useful in case one wishes not to deal with {@link IllegalConstruction} errors.
     * Instead, if an error is thrown it will be stored inside a {@link MyErrorNumber} instance.
     * @param arg1 The first argument to pass to the binary operator.
     * @param arg2 The second argument to pass to the binary operator.
     * @param builder A functional interface used to create the needed operation.
     * @return The result of the computation. Will return a {@link MyErrorNumber} instance if something went wrong.
     * @param <T> The {@link BinaryOperation} to create.
     */
    public static <T extends BinaryOperation> MyNumber op(MyNumber arg1, MyNumber arg2, BuildOperationFunction<T> builder)
    {
        BinaryOperation u;
        try {
            u = builder.build(new ArrayList<>());
        } catch (IllegalConstruction e) {
            return new MyErrorNumber(null, e.getMessage());
        }
        return u.op(arg1, arg2);
    }

}
