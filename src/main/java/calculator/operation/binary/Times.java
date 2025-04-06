package calculator.operation.binary;

import calculator.*;
import jdk.jshell.spi.ExecutionControl;

import java.math.BigDecimal;
import java.util.ArrayList;
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
     * @see #Times(List< Expression >, Notation )
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
     * @see #Times(List<Expression>)
     * @see BinaryOperation#BinaryOperation(List<Expression>,Notation)
     */
    public Times(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "*";
        neutral = 1;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyInteger(l.getValue().multiply(r.getValue()));
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyReal(l.getValue().multiply(new BigDecimal(r.getValue())));
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyReal(l.getValue().multiply(r.getValue()));
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        // (a + b*i) * c = (c*a) + (c*b*i)
        return new MyComplex(op(l.getRealImaginaryPair().a, r), op(l.getRealImaginaryPair().b, r)).simplify();
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyComplex(op(l.getRealImaginaryPair().a, r), op(l.getRealImaginaryPair().b, r)).simplify();
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        MyNumber real = new Minus(new ArrayList<>()).op(op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().a),
                op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().b));

        MyNumber imaginary = new Plus(new ArrayList<>()).op(op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().b),
                op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().a));
        return new MyComplex(real, imaginary).simplify();
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return MyRational.create(l.getNumDenomPair().a.getValue().multiply(r.getValue()),
                l.getNumDenomPair().b.getValue());
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        MyNumber rReal = MyRational.toRational(r);
        return op(l, rReal);
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return new MyComplex(op(l, r.getRealImaginaryPair().a), op(l, r.getRealImaginaryPair().b)).simplify();
    }

    @Override
    public MyNumber op(MyRational l, MyRational r)
            throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return MyRational.create(l.getNumDenomPair().a.getValue().multiply(r.getNumDenomPair().a.getValue()),
                l.getNumDenomPair().b.getValue().multiply(r.getNumDenomPair().b.getValue()));
    }
}
