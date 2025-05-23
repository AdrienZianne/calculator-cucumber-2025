package calculator.operation.binary;

import calculator.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the arithmetic sum operation "+".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see BinaryOperation
 * @see Minus
 * @see Times
 * @see Divides
 */
public final class Plus extends CommutativeBinaryOperation {

    /**
     * Class constructor specifying a number of Expressions to add.
     *
     * @param elist The list of Expressions to add
     * @throws IllegalConstruction If an empty list of expressions if passed as
     *                             parameter
     */
    public /* constructor */ Plus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to add,
     * as well as the Notation used to represent the operation.
     *
     * @param elist The list of Expressions to add
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as
     *                             parameter
     */
    public Plus(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "+";
        neutral = 0;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) {
        return new MyInteger(l.getValue().add(r.getValue()));
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(l.getValue().add(new BigDecimal(r.getValue())));
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        return new MyReal(l.getValue().add(r.getValue()));
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) {
        return MyComplex.create(op(l.getRealImaginaryPair().a, r), l.getRealImaginaryPair().b);
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) {
        return MyComplex.create(op(l.getRealImaginaryPair().a, r), l.getRealImaginaryPair().b);
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) {
        return MyComplex.create(op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().a),
                op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().b));
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        return MyRational.create(
                MyInteger.valueOf(
                        l.getNumDenomPair().a.getValue().add(r.getValue().multiply(l.getNumDenomPair().b.getValue()))),
                MyInteger.valueOf(l.getNumDenomPair().b.getValue()));
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        return op(l, MyRational.toRational(r));
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) {
        return MyComplex.create(op(l, r.getRealImaginaryPair().a), r.getRealImaginaryPair().b);
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        BigInteger lNum = l.getNumDenomPair().a.getValue().multiply(r.getNumDenomPair().b.getValue());
        BigInteger rNum = r.getNumDenomPair().a.getValue().multiply(l.getNumDenomPair().b.getValue());

        return MyRational.create(lNum.add(rNum),
                l.getNumDenomPair().b.getValue().multiply(r.getNumDenomPair().b.getValue()));
    }

    @Override
    public MyNumber op(MyInfinity l, MyInteger r) {
        return new MyInfinity(l.isPositive());
    }

    @Override
    public MyNumber op(MyInfinity l, MyReal r) {
        return new MyInfinity(l.isPositive());
    }

    @Override
    public MyNumber op(MyInfinity l, MyComplex r) {
        return new MyInfinity(l.isPositive());
    }

    @Override
    public MyNumber op(MyInfinity l, MyRational r) {
        return new MyInfinity(l.isPositive());
    }

    @Override
    public MyNumber op(MyInfinity l, MyInfinity r) {
        if (l.isPositive() == r.isPositive()) {return new MyInfinity(l.isPositive());}
        return new MyUndefinedNumber(this);
    }

    @Override
    public MyNumber op(MyInfinity l, MyUnknown r) {
        return MyUnknown.create(r.getOperands(), op(l, r.getRest()));
    }

    @Override
    public MyNumber op(MyUnknown l, MyInteger r) {
        return MyUnknown.create(l.getOperands(), op(l.getRest(), r));
    }

    @Override
    public MyNumber op(MyUnknown l, MyReal r) {
        return MyUnknown.create(l.getOperands(), op(l.getRest(), r));
    }

    @Override
    public MyNumber op(MyUnknown l, MyComplex r) {
        return MyUnknown.create(l.getOperands(), op(l.getRest(), r));
    }

    @Override
    public MyNumber op(MyUnknown l, MyRational r) {
        return MyUnknown.create(l.getOperands(), op(l.getRest(), r));
    }

    @Override
    public MyNumber op(MyUnknown l, MyUnknown r) {
        // The create function already takes care of summing all similar operands.
        // Therefore, we can simply regroup all operands into one list and feed it to the function.
        ArrayList<Pair<MyNumber, MyNumber>> allOperands = new ArrayList<>();
        for (MyNumber operand : l.getOperands().keySet()) {
            allOperands.add(new Pair<>(l.getOperands().get(operand), operand));
        }
        for (MyNumber operand : r.getOperands().keySet()) {
            allOperands.add(new Pair<>(r.getOperands().get(operand), operand));
        }
        // And we can sum the rest.
        return MyUnknown.create(allOperands, op(l.getRest(), r.getRest()));
    }
}
