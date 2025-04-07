package calculator.operation.binary;

import calculator.*;
import jdk.jshell.spi.ExecutionControl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * This class represents the arithmetic operation "-".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * 
 * @see BinaryOperation
 * @see Plus
 * @see Times
 * @see Divides
 */
public final class Minus extends BinaryOperation {

    /**
     * Class constructor specifying a number of Expressions to subtract.
     *
     * @param elist The list of Expressions to subtract
     * @throws IllegalConstruction If an empty list of expressions if passed as
     *                             parameter
     * @see #Minus(List< Expression >, Notation )
     */
    public /* constructor */ Minus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to subtract,
     * as well as the Notation used to represent the operation.
     *
     * @param elist The list of Expressions to subtract
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as
     *                             parameter
     * @see #Minus(List<Expression>)
     * @see BinaryOperation(List<Expression>,Notation)
     */
    public Minus(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "-";
        neutral = 0;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) {
        return new MyInteger(l.getValue().subtract(r.getValue()));
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(l.getValue().subtract(new BigDecimal(r.getValue())));
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        return new MyReal(l.getValue().subtract(r.getValue()));
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) {
        return new MyComplex(op(l.getRealImaginaryPair().a, r), l.getRealImaginaryPair().b).simplify();
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) {
        return new MyComplex(op(l.getRealImaginaryPair().a, r), l.getRealImaginaryPair().b).simplify();
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) {
        return new MyComplex(op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().a),
                op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().b)).simplify();
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        // a/b - c = (a-(c*b)) / b
        return MyRational.create(
                l.getNumDenomPair().a.getValue().subtract(r.getValue().multiply(l.getNumDenomPair().b.getValue())),
                l.getNumDenomPair().b.getValue());
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        MyNumber rRatio = MyRational.toRational(r);
        return op(l, rRatio);
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) {
        return diffByComplex(l, r);
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        BigInteger lNum = l.getNumDenomPair().a.getValue().multiply(r.getNumDenomPair().b.getValue());
        BigInteger rNum = r.getNumDenomPair().a.getValue().multiply(l.getNumDenomPair().b.getValue());

        return MyRational.create(lNum.subtract(rNum),
                l.getNumDenomPair().b.getValue().multiply(r.getNumDenomPair().b.getValue()));
    }

    // Redefine some "non commutative" expressions

    @Override
    public MyNumber op(MyInteger l, MyReal r) {
        return new MyReal(new BigDecimal(l.getValue()).subtract(r.getValue()));
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {
        return MyRational.create(
                l.getValue().multiply(r.getNumDenomPair().b.getValue()).subtract(r.getNumDenomPair().a.getValue()),
                r.getNumDenomPair().b.getValue());
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) {
        MyNumber lRatio = MyRational.toRational(l);
        return op(lRatio, r);
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) {
        return new MyComplex(op(l.getRealImaginaryPair().a, r),
                op(new MyInteger(0), l.getRealImaginaryPair().b)).simplify();
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) {
        return diffByComplex(l, r);
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) {
        return diffByComplex(l, r);
    }

    public MyNumber diffByComplex(MyNumber l, MyComplex r) {
        return new MyComplex(op(l, r.getRealImaginaryPair().a),
                op(new MyInteger(0), r.getRealImaginaryPair().b)).simplify(); // This should be negated !!
    }

}
