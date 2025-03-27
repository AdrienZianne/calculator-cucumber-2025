package calculator;

import jdk.jshell.spi.ExecutionControl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * This class represents the arithmetic operation "-".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * 
 * @see Operation
 * @see Plus
 * @see Times
 * @see Divides
 */
public final class Minus extends Operation {

    /**
     * Class constructor specifying a number of Expressions to subtract.
     *
     * @param elist The list of Expressions to subtract
     * @throws IllegalConstruction If an empty list of expressions if passed as
     *                             parameter
     * @see #Minus(List<Expression>,Notation)
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
     * @see Operation#Operation(List<Expression>,Notation)
     */
    public Minus(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "-";
        neutral = 0;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyInteger(l.getValue().subtract(r.getValue()));
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyReal(l.getValue().subtract(new BigDecimal(r.getValue())));
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyReal(l.getValue().subtract(r.getValue()));
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyComplex(op(l.getRealImaginaryPair().a, r), l.getRealImaginaryPair().b);
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyComplex(op(l.getRealImaginaryPair().a, r), l.getRealImaginaryPair().b);
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyComplex(op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().a),
                op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().b));
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        // a/b - c = (a-(c*b)) / b
        return new MyRational(
                l.getNumDenomPair().a.getValue().subtract(r.getValue().multiply(l.getNumDenomPair().b.getValue())),
                l.getNumDenomPair().b.getValue()).simplify();
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        MyRational rRatio = MyRational.toRational(r);
        return op(l, rRatio);
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return diffByComplex(l, r);
    }

    @Override
    public MyNumber op(MyRational l, MyRational r)
            throws ExecutionControl.NotImplementedException, IllegalConstruction {
        BigInteger lNum = l.getNumDenomPair().a.getValue().multiply(r.getNumDenomPair().b.getValue());
        BigInteger rNum = r.getNumDenomPair().a.getValue().multiply(l.getNumDenomPair().b.getValue());

        return new MyRational(lNum.subtract(rNum),
                l.getNumDenomPair().b.getValue().multiply(r.getNumDenomPair().b.getValue()))
                .simplify();
    }

    // Redefine some "non commutative" expressions

    @Override
    public MyNumber op(MyInteger l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyReal(new BigDecimal(l.getValue()).subtract(r.getValue()));
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyRational(
                l.getValue().multiply(r.getNumDenomPair().b.getValue()).subtract(r.getNumDenomPair().a.getValue()),
                r.getNumDenomPair().b.getValue()).simplify();
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        MyRational lRatio = MyRational.toRational(l);
        return op(lRatio, r);
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyComplex(op(l.getRealImaginaryPair().a, r),
                op(new MyInteger(0), l.getRealImaginaryPair().b));
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return diffByComplex(l, r);
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return diffByComplex(l, r);
    }

    public MyNumber diffByComplex(MyNumber l, MyComplex r)
            throws IllegalConstruction, ExecutionControl.NotImplementedException {
        return new MyComplex(op(l, r.getRealImaginaryPair().a),
                op(new MyInteger(0), r.getRealImaginaryPair().b)); // This should be negated !!
    }

}
