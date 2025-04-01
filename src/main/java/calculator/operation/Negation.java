package calculator.operation;

import calculator.*;

public class Negation extends UnaryOperation {
    public Negation(Expression arg) throws IllegalConstruction {
        this(arg, null);
    }

    public Negation(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation);
        symbol = "-";
    }

    @Override
    public MyNumber op(MyInteger i) throws IllegalConstruction {
        return MyInteger.valueOf(i.getValue().negate());
    }

    @Override
    public MyNumber op(MyReal r) throws IllegalConstruction {
        return new MyReal(r.getValue().negate());
    }

    @Override
    public MyNumber op(MyRational r) throws IllegalConstruction {
        return new MyRational(MyInteger.valueOf(r.getNumDenomPair().a.getValue().negate()),
                            r.getNumDenomPair().b).simplify();
    }

    @Override
    public MyNumber op(MyComplex c) throws IllegalConstruction {
        return new MyComplex(op(c.getRealImaginaryPair().a), op(c.getRealImaginaryPair().b));
    }
}
