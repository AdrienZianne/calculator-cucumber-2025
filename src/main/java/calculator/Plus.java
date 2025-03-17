package calculator;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * This class represents the arithmetic sum operation "+".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Minus
 * @see Times
 * @see Divides
 */
public final class Plus extends CommutativeOperation {

    /**
     * Class constructor specifying a number of Expressions to add.
     *
     * @param elist The list of Expressions to add
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Plus(List<Expression>,Notation)
     */
    public /*constructor*/ Plus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to add,
     * as well as the Notation used to represent the operation.
     *
     * @param elist The list of Expressions to add
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Plus(List<Expression>)
     * @see Operation#Operation(List<Expression>,Notation)
     */
    public Plus(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "+";
        neutral = 0;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) {
        return new MyInteger(l.getValue() + r.getValue());
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(l.getValue() + (double) r.getValue());
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        return new MyReal(l.getValue() + r.getValue());
    }

    @Override
    public MyNumber op(MyComplexNumber l, MyInteger r) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        return new MyComplexNumber(op(l.getRealImaginaryPair().a, r), l.getRealImaginaryPair().b);
    }

    @Override
    public MyNumber op(MyComplexNumber l, MyReal r) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        return new MyComplexNumber(op(l.getRealImaginaryPair().a, r), l.getRealImaginaryPair().b);
    }

    @Override
    public MyNumber op(MyComplexNumber l, MyComplexNumber r) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        return new MyComplexNumber(op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().a),
                                 op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().b));
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        return new MyRational(l.getNumDenomPair().a + (r.getValue()) * l.getNumDenomPair().b, l.getNumDenomPair().b).simplify();
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        MyReal lReal = new MyReal(l.applyDenominator());
        return op(lReal, r);
    }

    @Override
    public MyNumber op(MyRational l, MyComplexNumber r) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        return new MyComplexNumber(op(l, r.getRealImaginaryPair().a), r.getRealImaginaryPair().b);
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        int lNum = l.getNumDenomPair().a * r.getNumDenomPair().b;
        int rNum = r.getNumDenomPair().a * l.getNumDenomPair().b;

        return new MyRational(lNum + rNum, l.getNumDenomPair().b * r.getNumDenomPair().b).simplify();
    }


}
