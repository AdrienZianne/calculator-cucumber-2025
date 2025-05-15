package calculator.operation.binary;

import calculator.*;
import calculator.operation.BuildBinaryOperationFunction;
import calculator.operation.Operation;
import visitor.Evaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        if (a instanceof MyUndefinedNumber nan)
        {
            return new MyErrorNumber(this, "Tried to use an operation on NaN: " + nan);
        }

        // We obligated to "duplicate" these lines, because they are all calling different functions with different
        // parameters, even if they wear the same name. (Using a generic method with the switch inside will only cause
        // an infinite recursion.
        if (a instanceof MyInteger l)
        {
            switch (b) {
                case MyReal r -> { return op(l, r); }
                case MyInteger r -> { return op(l, r); }
                case MyComplex r -> { return op(l, r); }
                case MyRational r -> { return op(l, r); }
                case MyInfinity r -> { return op(l,r); }
                case MyUnknown r -> { return op(l,r); }
                default -> {
                    // The default case is taken care after all switches.
                }
            }
        }
        if (a instanceof MyReal l)
        {
            switch (b) {
                case MyReal r -> { return op(l, r); }
                case MyInteger r -> { return op(l, r); }
                case MyComplex r -> { return op(l, r); }
                case MyRational r -> { return op(l, r); }
                case MyInfinity r -> { return op(l,r); }
                case MyUnknown r -> { return op(l,r); }
                default -> {
                    // The default case is taken care after all switches.
                }
            }
        }
        if (a instanceof MyRational l)
        {
            switch (b)
            {
                case MyReal r -> { return op(l, r); }
                case MyInteger r -> { return op(l, r); }
                case MyComplex r -> { return op(l, r); }
                case MyRational r -> { return op(l, r); }
                case MyInfinity r -> { return op(l,r); }
                case MyUnknown r -> { return op(l,r); }
                default -> {
                    // The default case is taken care after all switches.
                }
            }
        }
        if (a instanceof MyComplex l)
        {
            switch (b)
            {
                case MyReal r -> { return op(l, r); }
                case MyInteger r -> { return op(l, r); }
                case MyComplex r -> { return op(l, r); }
                case MyRational r -> { return op(l, r); }
                case MyInfinity r -> { return op(l,r); }
                case MyUnknown r -> { return op(l,r); }
                default -> {
                    // The default case is taken care after all switches.
                }
            }
        }
        if (a instanceof MyInfinity l)
        {
            switch (b)
            {
                case MyReal r -> { return op(l, r); }
                case MyInteger r -> { return op(l, r); }
                case MyComplex r -> { return op(l, r); }
                case MyRational r -> { return op(l, r); }
                case MyInfinity r -> { return op(l,r); }
                case MyUnknown r -> { return op(l,r); }
                default -> {
                    // The default case is taken care after all switches.
                }
            }
        }
        if (a instanceof MyUnknown l)
        {
            switch (b)
            {
                case MyReal r -> { return op(l, r); }
                case MyInteger r -> { return op(l, r); }
                case MyComplex r -> { return op(l, r); }
                case MyRational r -> { return op(l, r); }
                case MyInfinity r -> { return op(l,r); }
                case MyUnknown r -> { return op(l,r); }
                default -> {
                    // The default case is taken care after all switches.
                }
            }
        }
        // Error : Not implemented
        return new MyErrorNumber(this,"The given operation is not implemented yet for the " +
                "given MyNumber subclasses pair: " + a.getClass() + " and " + b.getClass());
    }


    public abstract MyNumber op(MyInteger l, MyInteger r);
    public abstract MyNumber op(MyInteger l, MyReal r);
    public abstract MyNumber op(MyInteger l, MyComplex r);
    public abstract MyNumber op(MyInteger l, MyRational r);
    public abstract MyNumber op(MyInteger l, MyInfinity r);
    public abstract MyNumber op(MyInteger l, MyUnknown r);

    public abstract MyNumber op(MyReal l, MyInteger r);
    public abstract MyNumber op(MyReal l, MyReal r);
    public abstract MyNumber op(MyReal l, MyComplex r);
    public abstract MyNumber op(MyReal l, MyRational r);
    public abstract MyNumber op(MyReal l, MyInfinity r);
    public abstract MyNumber op(MyReal l, MyUnknown r);

    public abstract MyNumber op(MyComplex l, MyInteger r);
    public abstract MyNumber op(MyComplex l, MyReal r);
    public abstract MyNumber op(MyComplex l, MyComplex r);
    public abstract MyNumber op(MyComplex l, MyRational r);
    public abstract MyNumber op(MyComplex l, MyInfinity r);
    public abstract MyNumber op(MyComplex l, MyUnknown r);

    public abstract MyNumber op(MyRational l, MyInteger r);
    public abstract MyNumber op(MyRational l, MyReal r);
    public abstract MyNumber op(MyRational l, MyComplex r);
    public abstract MyNumber op(MyRational l, MyRational r);
    public abstract MyNumber op(MyRational l, MyInfinity r);
    public abstract MyNumber op(MyRational l, MyUnknown r);

    public abstract MyNumber op(MyInfinity l, MyInteger r);
    public abstract MyNumber op(MyInfinity l, MyReal r);
    public abstract MyNumber op(MyInfinity l, MyComplex r);
    public abstract MyNumber op(MyInfinity l, MyRational r);
    public abstract MyNumber op(MyInfinity l, MyInfinity r);
    public abstract MyNumber op(MyInfinity l, MyUnknown r);

    public abstract MyNumber op(MyUnknown l, MyInteger r);
    public abstract MyNumber op(MyUnknown l, MyReal r);
    public abstract MyNumber op(MyUnknown l, MyComplex r);
    public abstract MyNumber op(MyUnknown l, MyRational r);
    public abstract MyNumber op(MyUnknown l, MyInfinity r);
    public abstract MyNumber op(MyUnknown l, MyUnknown r);



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
    public static <T extends BinaryOperation> MyNumber op(MyNumber arg1, MyNumber arg2, BuildBinaryOperationFunction<T> builder)
    {
        BinaryOperation u;
        try {
            ArrayList<Expression> argList = new ArrayList<>();
            argList.add(arg1);
            argList.add(arg2);
            u = builder.build(argList);
        } catch (IllegalConstruction e) {
            return new MyErrorNumber(null, e.getMessage());
        }
        return u.op(arg1, arg2);
    }
    /**
     * Creates and calls an operation on the given arguments.
     * This method is useful in case one wishes not to deal with {@link IllegalConstruction} errors.
     * Instead, if an error is thrown it will be stored inside a {@link MyErrorNumber} instance.
     * @param eval An evaluator to use to compute the operation.
     * @param args The arguments to pass to the binary operator.
     * @param builder A functional interface used to create the needed operation.
     * @return The result of the computation. Will return a {@link MyErrorNumber} instance if something went wrong.
     * @param <T> The {@link BinaryOperation} to create.
     */
    public static <T extends BinaryOperation> MyNumber op(Evaluator eval, ArrayList<Expression> args, BuildBinaryOperationFunction<T> builder)
    {
        BinaryOperation u;
        MyNumber result;

        try {
            u = builder.build(args);
            u.accept(eval);
            result = eval.getResult();
        } catch (IllegalConstruction e) {
            return new MyErrorNumber(null, e.getMessage());
        }
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), neutral);
    }
}
