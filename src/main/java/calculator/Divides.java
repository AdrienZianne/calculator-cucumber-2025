package calculator;

import jdk.jshell.spi.ExecutionControl;

import java.math.BigDecimal;
import java.util.List;

/**
 * This class represents the arithmetic division operation "/".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * 
 * @see Operation
 * @see Minus
 * @see Times
 * @see Plus
 */
public final class Divides extends Operation {

    /**
     * Class constructor specifying a number of Expressions to divide.
     *
     * @param elist The list of Expressions to divide
     * @throws IllegalConstruction If an empty list of expressions if passed as
     *                             parameter
     * @see #Divides(List<Expression>,Notation)
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
     * @see #Divides(List<Expression>)
     * @see Operation#Operation(List<Expression>,Notation)
     */
    public Divides(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "/";
        neutral = 1;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyRational(l.getValue(), r.getValue()).simplify();
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        MyRational rRatio = MyRational.toRational(r);
        return op(l, rRatio);
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return divByComplex(l, r);
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return divByComplex(l, r);
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyRational(l.getValue().multiply(r.getNumDenomPair().b.getValue()), r.getNumDenomPair().a.getValue())
                .simplify();
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        // To not lose any information we just divide them as rationals and integers
        MyRational lRatio = MyRational.toRational(l);
        return op(lRatio, r);
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        // To not lose any information we just divide them as rationals
        MyRational lRatio = MyRational.toRational(l);
        MyRational rRatio = MyRational.toRational(r);
        return op(lRatio, rRatio);
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        MyRational lRatio = MyRational.toRational(l);
        return op(lRatio, r);
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyComplex(op(l.getRealImaginaryPair().a, r), op(l.getRealImaginaryPair().b, r));
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyComplex(op(l.getRealImaginaryPair().a, r), op(l.getRealImaginaryPair().b, r));
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null; // TODO
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null; // TODO
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyRational(l.getNumDenomPair().a.getValue().multiply(r.getValue()),
                l.getNumDenomPair().b.getValue()).simplify();
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        MyRational rRatio = MyRational.toRational(r);
        return op(l, rRatio);
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return divByComplex(l, r);
    }

    @Override
    public MyNumber op(MyRational l, MyRational r)
            throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyRational(l.getNumDenomPair().a.getValue().multiply(r.getNumDenomPair().b.getValue()),
                l.getNumDenomPair().b.getValue().multiply(r.getNumDenomPair().a.getValue())).simplify();
    }

    // FIXME try with : 1 / ((5/9) + 8/6i)
    public MyNumber divByComplex(MyNumber l, MyComplex r)
            throws IllegalConstruction, ExecutionControl.NotImplementedException {
        // c / (a + bi) = (ac - bci) / (a^2 + b^2)
        // numerator :
        Times times = new Times(List.of());
        Plus plus = new Plus(List.of());
        Minus minus = new Minus(List.of());

        MyNumber ac = times.op(l, r.getRealImaginaryPair().a);
        MyNumber minusBc = minus.op(new MyInteger(0), times.op(l, r.getRealImaginaryPair().b)); // FIXME this IS
                                                                                                // TEMPORARY, because we
                                                                                                // need unary operators
                                                                                                // !

        // Denominator :
        MyNumber aTimes2PlusbTimes2 = plus.op(times.op(r.getRealImaginaryPair().a, r.getRealImaginaryPair().a),
                times.op(r.getRealImaginaryPair().b, r.getRealImaginaryPair().b)); // FIXME we should be using pow
                                                                                   // operations !
        return new MyComplex(op(ac, aTimes2PlusbTimes2), op(minusBc, aTimes2PlusbTimes2));
    }
}
