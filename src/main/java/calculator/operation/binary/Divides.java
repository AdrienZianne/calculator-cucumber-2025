package calculator.operation.binary;

import calculator.*;
import calculator.operation.unary.Negation;
import calculator.operation.unary.UnaryOperation;

import java.util.List;

/**
 * This class represents the arithmetic division operation "/".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * 
 * @see BinaryOperation
 * @see Minus
 * @see Times
 * @see Plus
 */
public final class Divides extends BinaryOperation {

    /**
     * Class constructor specifying a number of Expressions to divide.
     *
     * @param elist The list of Expressions to divide
     * @throws IllegalConstruction If an empty list of expressions if passed as
     *                             parameter
     */
    public /* constructor */ Divides(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to divide,
     * as well as the notation used to represent the operation.
     *
     * @param elist The list of Expressions to divide
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as
     *                             parameter
     */
    public Divides(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "/";
        neutral = 1;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) {
        MyNumber err = isUndefined(l, r);
        if (err != null) {return err;}

        return MyRational.create(l.getValue(), r.getValue());
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r) {
        MyNumber err = isUndefinedOrInf(l, r);
        if (err != null) {return err;}
        MyNumber rRatio = MyRational.toRational(r);
        return op(l, rRatio);
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) {
        return divByComplex(l, r);
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) {
        return divByComplex(l, r);
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {

        return MyRational.create(l.getValue().multiply(r.getNumDenomPair().b.getValue()),
                r.getNumDenomPair().a.getValue());
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        MyNumber err = isUndefinedOrInf(l, r);
        if (err != null) {return err;}
        // To not lose any information we just divide them as rationals and integers
        MyNumber lRatio = MyRational.toRational(l);
        return op(lRatio, r);
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        MyNumber err = isUndefinedOrInf(l, r);
        if (err != null) {return err;}

        // To not lose any information we just divide them as rationals
        MyNumber lRatio = MyRational.toRational(l);
        MyNumber rRatio = MyRational.toRational(r);
        return op(lRatio, rRatio);
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) {
        MyNumber lRatio = MyRational.toRational(l);
        return op(lRatio, r);
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) {
        MyNumber err = isUndefined(l, r);
        if (err != null) {return err;}
        return MyComplex.create(op(l.getRealImaginaryPair().a, r), op(l.getRealImaginaryPair().b, r));
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) {
        MyNumber err = isUndefined(l, r);
        if (err != null) {return err;}
        return MyComplex.create(op(l.getRealImaginaryPair().a, r), op(l.getRealImaginaryPair().b, r));
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) {
        // Denominator : c^2 + d^2
        MyNumber denom = BinaryOperation.op(
                BinaryOperation.op(r.getRealImaginaryPair().a, MyInteger.valueOf(2), Exponent::new),
                BinaryOperation.op(r.getRealImaginaryPair().b, MyInteger.valueOf(2), Exponent::new),
                Plus::new);

        // Real part: ac + bd
        MyNumber real = BinaryOperation.op(
                BinaryOperation.op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().a, Times::new),
                BinaryOperation.op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().b, Times::new), Plus::new);

        // Imaginary part: - ad + bc = bc - ad
        MyNumber imaginary = BinaryOperation.op(
                BinaryOperation.op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().a, Times::new),
                BinaryOperation.op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().b, Times::new), Minus::new);

        return MyComplex.create(op(real, denom), op(imaginary, denom));
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) {
        // (a+bi) / (c/d) = (ad + bdi) / c
        // Real part : ad
        MyNumber real = BinaryOperation.op(l.getRealImaginaryPair().a, r.getNumDenomPair().b, Times::new);
        // Imaginary part : bd
        MyNumber imaginary = BinaryOperation.op(l.getRealImaginaryPair().b, r.getNumDenomPair().b, Times::new);
        // (ad/c) + (db/c i)
        return MyComplex.create(op(real, r.getNumDenomPair().a), op(imaginary, r.getNumDenomPair().a));
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        MyNumber err = isUndefinedOrInf(l, r);
        if (err != null) {return err;}
        return MyRational.create(l.getNumDenomPair().a,
                MyInteger.valueOf(l.getNumDenomPair().b.getValue().multiply(r.getValue())));
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        MyNumber rRatio = MyRational.toRational(r);
        return op(l, rRatio);
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) {
        return divByComplex(l, r);
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        return MyRational.create(l.getNumDenomPair().a.getValue().multiply(r.getNumDenomPair().b.getValue()),
                l.getNumDenomPair().b.getValue().multiply(r.getNumDenomPair().a.getValue()));
    }

    @Override
    public MyNumber op(MyInteger l, MyInfinity r) {
        return MyInteger.valueOf(0);
    }

    @Override
    public MyNumber op(MyReal l, MyInfinity r) {
        return MyInteger.valueOf(0);
    }

    @Override
    public MyNumber op(MyComplex l, MyInfinity r) {
        return MyInteger.valueOf(0);
    }

    @Override
    public MyNumber op(MyRational l, MyInfinity r) {
        return MyInteger.valueOf(0);
    }

    @Override
    public MyNumber op(MyInfinity l, MyInteger r) {
        return divInfinity(l, r);
    }

    @Override
    public MyNumber op(MyInfinity l, MyReal r) {
        return divInfinity(l, r);
    }

    @Override
    public MyNumber op(MyInfinity l, MyComplex r) {
        return new MyErrorNumber(this, "Division of infinite by complex number is not supported");
    }

    @Override
    public MyNumber op(MyInfinity l, MyRational r) {
        return divInfinity(l, r);
    }

    @Override
    public MyNumber op(MyInfinity l, MyInfinity r) {
        return new MyUndefinedNumber(this);
    }

    private MyNumber divInfinity(MyInfinity l, MyNumber r) {
        MyNumber err = isUndefined(l, r);
        if (err != null) {return err;}
        // 1 0 = 0
        // 0 1 = 0
        // 0 0 = 1
        // 1 1 = 1
        return new MyInfinity(l.isPositive() == (r.getSign() > 0));
    }

    public MyNumber divByComplex(MyNumber l, MyComplex r) {
        // c / (a + bi) = (ac - bci) / (a^2 + b^2)
        // numerator :
        MyNumber ac = BinaryOperation.op(l, r.getRealImaginaryPair().a, Times::new);
        MyNumber minusBc = UnaryOperation.op(BinaryOperation.op(l, r.getRealImaginaryPair().b, Times::new),
                                Negation::new);

        // Denominator :
        MyNumber aTimes2PlusbTimes2 = BinaryOperation.op(BinaryOperation.op(r.getRealImaginaryPair().a, MyInteger.valueOf(2), Exponent::new),
                                                         BinaryOperation.op(r.getRealImaginaryPair().b, MyInteger.valueOf(2), Exponent::new),
                                                         Plus::new);

        return MyComplex.create(op(ac, aTimes2PlusbTimes2), op(minusBc, aTimes2PlusbTimes2));
    }

    private MyNumber isUndefined(MyNumber num, MyNumber denom) {
        if (num.isZero() && denom.isZero()) return new MyUndefinedNumber(this);
        if (denom.isZero()) return new MyErrorNumber(this, "Division by zero error");
        return null;
    }
    private MyNumber isUndefinedOrInf(MyNumber l, MyNumber r) {
        if (l.isZero() && r.isZero()) return new MyUndefinedNumber(this);

        if (r.equals(MyReal.valueOf(0)))
            return new MyInfinity(l.getSign() > 0);

        return null;
    }
}
