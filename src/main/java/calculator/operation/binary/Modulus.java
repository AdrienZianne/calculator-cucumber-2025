package calculator.operation.binary;

import calculator.*;

import java.util.List;

public final class Modulus extends BinaryOperation {
    private static final String ERRORMESSAGE = "Parameter m must be different than zero";
    private static final String ERRORCOMPLEXMESSAGE = "The modulus operation doesn't not support complex numbers yet";
    public Modulus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    public Modulus(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "%";
        neutral = 0;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) {
        if (r.getSign() == 0) return new MyErrorNumber(this, ERRORMESSAGE);
        return MyInteger.valueOf(l.getValue().remainder(r.getValue()));
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r) {
        if (r.getSign() == 0) return new MyErrorNumber(this, ERRORMESSAGE);

        return op(MyReal.toReal(l), r);
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) {
        return new MyErrorNumber(this, ERRORCOMPLEXMESSAGE);
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {
        return op(MyReal.toReal(l), MyReal.toReal(r));
    }

    @Override
    public MyNumber op(MyInteger l, MyInfinity r) {
        return MyInteger.valueOf(l.getValue());
    }

    @Override
    public MyNumber op(MyInteger l, MyUnknown r) {
        return getUnknownErrorText();
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        return op(l, MyReal.toReal(r));
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        if (r.getSign() == 0) return new MyErrorNumber(this, ERRORMESSAGE);
        return new MyReal(l.getValue().remainder(r.getValue()));
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) {
        return new MyErrorNumber(this, ERRORCOMPLEXMESSAGE);
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) {
        return op(l, MyReal.toReal(r));
    }

    @Override
    public MyNumber op(MyReal l, MyInfinity r) {
        return new MyReal(l.getValue());
    }

    @Override
    public MyNumber op(MyReal l, MyUnknown r) {
        return getUnknownErrorText();
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) {
        return new MyErrorNumber(this, ERRORCOMPLEXMESSAGE);
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) {
        return new MyErrorNumber(this, ERRORCOMPLEXMESSAGE);
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) {
        return new MyErrorNumber(this, ERRORCOMPLEXMESSAGE);
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) {
        return new MyErrorNumber(this, ERRORCOMPLEXMESSAGE);
    }

    @Override
    public MyNumber op(MyComplex l, MyInfinity r) {
        return MyComplex.create(l.getRealImaginaryPair().a, l.getRealImaginaryPair().b);
    }

    @Override
    public MyNumber op(MyComplex l, MyUnknown r) {
        return getUnknownErrorText();
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        return op(MyReal.toReal(l), MyReal.toReal(r));
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        return op(MyReal.toReal(l), r);
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) {
        return new MyErrorNumber(this, ERRORCOMPLEXMESSAGE);
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        return op(MyReal.toReal(l), MyReal.toReal(r));
    }

    @Override
    public MyNumber op(MyRational l, MyInfinity r) {
        return MyRational.create(l.getNumDenomPair().a, l.getNumDenomPair().b);
    }

    @Override
    public MyNumber op(MyRational l, MyUnknown r) {
        return getUnknownErrorText();
    }

    @Override
    public MyNumber op(MyInfinity l, MyInteger r) {
        return new MyUndefinedNumber(this);
    }

    @Override
    public MyNumber op(MyInfinity l, MyReal r) {
        return new MyUndefinedNumber(this);
    }

    @Override
    public MyNumber op(MyInfinity l, MyComplex r) {
        return new MyErrorNumber(this, ERRORCOMPLEXMESSAGE);
    }

    @Override
    public MyNumber op(MyInfinity l, MyRational r) {
        return new MyUndefinedNumber(this);
    }

    @Override
    public MyNumber op(MyInfinity l, MyInfinity r) {
        return new MyUndefinedNumber(this);
    }

    @Override
    public MyNumber op(MyInfinity l, MyUnknown r) {
        return getUnknownErrorText();
    }

    @Override
    public MyNumber op(MyUnknown l, MyInteger r) {
        return getUnknownErrorText();
    }

    @Override
    public MyNumber op(MyUnknown l, MyReal r) {
        return getUnknownErrorText();
    }

    @Override
    public MyNumber op(MyUnknown l, MyComplex r) {
        return getUnknownErrorText();
    }

    @Override
    public MyNumber op(MyUnknown l, MyRational r) {
        return getUnknownErrorText();
    }

    @Override
    public MyNumber op(MyUnknown l, MyInfinity r) {
        return getUnknownErrorText();
    }

    @Override
    public MyNumber op(MyUnknown l, MyUnknown r) {
        return getUnknownErrorText();
    }

    private MyErrorNumber getUnknownErrorText() {
        return new MyErrorNumber(this, "Expression with unknown factors are not supported by the modulus operation");
    }

}
