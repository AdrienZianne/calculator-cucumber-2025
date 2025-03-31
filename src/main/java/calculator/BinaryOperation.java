package calculator;

import calculator.operations.Operation;
import jdk.jshell.spi.ExecutionControl;
import visitor.Formatter;
import visitor.Visitor;

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
     * @throws ExecutionControl.NotImplementedException if the operation between the two MyNumber subclasses wasn't taken into account.
     */
    public MyNumber op(MyNumber a, MyNumber b) throws ExecutionControl.NotImplementedException, IllegalConstruction
    {
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
        // Error : Not implemented
        throw new ExecutionControl.NotImplementedException("The given operation is not implemented yet for the " +
                                                            "given MyNumber subclasses pair: " + a.getClass() + " and " + b.getClass());
    }

    public abstract MyNumber op(MyInteger l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyInteger l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyInteger l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyInteger l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction;

    public abstract MyNumber op(MyReal l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyReal l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyReal l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyReal l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction;

    public abstract MyNumber op(MyComplex l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyComplex l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyComplex l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyComplex l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction;

    public abstract MyNumber op(MyRational l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyRational l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyRational l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction;
    public abstract MyNumber op(MyRational l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction;


    // the operation itself is specified in the subclasses

    /**
     * Add more parameters to the existing list of parameters
     *
     * @param params The list of parameters to be added
     */
    public void addMoreParams(List<Expression> params) {
        args.addAll(params);
    }

}
