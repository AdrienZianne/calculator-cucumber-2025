package calculator.operation.binary;

import calculator.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class represents the arithmetic multiplication operation "*".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * 
 * @see BinaryOperation
 * @see Minus
 * @see Plus
 * @see Divides
 */
public final class Times extends CommutativeBinaryOperation {
    /**
     * Class constructor specifying a number of Expressions to multiply.
     *
     * @param elist The list of Expressions to multiply
     * @throws IllegalConstruction If an empty list of expressions if passed as
     *                             parameter
     */
    public /* constructor */ Times(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to multiply,
     * as well as the Notation used to represent the operation.
     *
     * @param elist The list of Expressions to multiply
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as
     *                             parameter
     */
    public Times(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "*";
        neutral = 1;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) {
        return new MyInteger(l.getValue().multiply(r.getValue()));
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(l.getValue().multiply(new BigDecimal(r.getValue())));
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        return new MyReal(l.getValue().multiply(r.getValue()));
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) {
        // (a + b*i) * c = (c*a) + (c*b*i)
        return MyComplex.create(op(l.getRealImaginaryPair().a, r), op(l.getRealImaginaryPair().b, r));
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) {
        return MyComplex.create(op(l.getRealImaginaryPair().a, r), op(l.getRealImaginaryPair().b, r));
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) {
        MyNumber real = BinaryOperation.op(op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().a),
                op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().b), Minus::new);

        MyNumber imaginary = BinaryOperation.op(op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().b),
                op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().a), Plus::new);
        return MyComplex.create(real, imaginary);
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        return MyRational.create(l.getNumDenomPair().a.getValue().multiply(r.getValue()),
                l.getNumDenomPair().b.getValue());
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        MyNumber rReal = MyRational.toRational(r);
        return op(l, rReal);
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) {
        return MyComplex.create(op(l, r.getRealImaginaryPair().a), op(l, r.getRealImaginaryPair().b));
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        return MyRational.create(l.getNumDenomPair().a.getValue().multiply(r.getNumDenomPair().a.getValue()),
                l.getNumDenomPair().b.getValue().multiply(r.getNumDenomPair().b.getValue()));
    }

    @Override
    public MyNumber op(MyInfinity l, MyInteger r) {
        return infinityTimesNumber(l,r);
    }

    @Override
    public MyNumber op(MyInfinity l, MyReal r) {
        return infinityTimesNumber(l,r);
    }

    @Override
    public MyNumber op(MyInfinity l, MyComplex r) {
        return null;
    }

    @Override
    public MyNumber op(MyInfinity l, MyRational r) {
        return infinityTimesNumber(l,r);
    }

    @Override
    public MyNumber op(MyInfinity l, MyInfinity r) {
        return new MyInfinity(l.isPositive() && r.isPositive());
    }

    @Override
    public MyNumber op(MyInfinity l, MyUnknown r) {
        return MyUnknown.applyToAllOperators(r, l, Times::new);
    }

    @Override
    public MyNumber op(MyUnknown l, MyInteger r) {
        return MyUnknown.applyToAllOperators(l,r, Times::new);
    }

    @Override
    public MyNumber op(MyUnknown l, MyReal r) {
        return MyUnknown.applyToAllOperators(l,r, Times::new);
    }

    @Override
    public MyNumber op(MyUnknown l, MyComplex r) {
        return MyUnknown.applyToAllOperators(l,r, Times::new);
    }

    @Override
    public MyNumber op(MyUnknown l, MyRational r) {
        return MyUnknown.applyToAllOperators(l,r, Times::new);
    }

    @Override
    public MyNumber op(MyUnknown l, MyUnknown r) {

        ArrayList<Pair<MyNumber, MyNumber>> newOperand = new ArrayList<>();

        MyNumber factor;
        for (MyNumber expR : r.getOperands().keySet()) {
            factor = r.getOperands().get(expR);
            // (factor * x^exp) * l
            for (MyNumber expL : l.getOperands().keySet()) {
                newOperand.add(new Pair<>(op(factor, l.getOperands().get(expL)), BinaryOperation.op(expR, expL, Plus::new)));
            }
            // add the rest
            newOperand.add(new Pair<>(op(l.getRest(), factor), expR));


        }
        // Associate every term
        MyNumber total = MyUnknown.create(newOperand, ConstantNumber.ZERO);

        // Add the rest
        return BinaryOperation.op(total, op(r.getRest(), l), Plus::new);
    }


    private MyNumber infinityTimesNumber(MyInfinity l, MyNumber r)
    {
        if (r.isZero()) return new MyUndefinedNumber(this);

        return new MyInfinity(l.isPositive() && (r.getSign() > 0));
    }
}
