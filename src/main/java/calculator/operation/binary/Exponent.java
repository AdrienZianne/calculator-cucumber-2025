package calculator.operation.binary;

import calculator.*;

import java.util.List;

public class Exponent extends BinaryOperation {
    static String SqrtNotImplementedMessage = "The sqrt operation was not yet implemented";

    public Exponent(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    public Exponent(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "^";
        neutral = 0;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) {
        return MyInteger.valueOf(l.getValue().pow(r.getValue().intValue()));
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r) {
        // TODO : add later after sqrt operation
        return new MyErrorNumber(this, SqrtNotImplementedMessage);
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) {
        return new MyErrorNumber(this, "Complex exponent are not yet implemented");
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {
        // TODO : add later after sqrt operation
        return new MyErrorNumber(this, SqrtNotImplementedMessage);
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(l.getValue().pow(r.getValue().intValue()));
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        // TODO : add later after sqrt operation
        return new MyErrorNumber(this, SqrtNotImplementedMessage);
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) {
        return new MyErrorNumber(this, "The complex exponent are not implemented");
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) {
        // TODO : add later after sqrt operation
        return new MyErrorNumber(this, SqrtNotImplementedMessage);
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) {
        return null;
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) {
        // TODO : add later after sqrt operation
        return new MyErrorNumber(this, SqrtNotImplementedMessage);
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) {
        // TODO : add later after sqrt operation
        return new MyErrorNumber(this, "The complex exponent was not implemented");
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) {
        // TODO : add later after sqrt operation
        return new MyErrorNumber(this, SqrtNotImplementedMessage);
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        MyNumber num = op(l.getNumDenomPair().a, r);
        MyNumber denom = op(l.getNumDenomPair().b, r);
        return BinaryOperation.op(num, denom, Divides::new);
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        // TODO : add later after sqrt operation
        return new MyErrorNumber(this, SqrtNotImplementedMessage);
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) {
        return new MyErrorNumber(this, "The complex exponent are not implemented");
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        // TODO : add later after sqrt operation
        return new MyErrorNumber(this, SqrtNotImplementedMessage);
    }
}
