package calculator.operation.binary;

import calculator.*;

import java.math.MathContext;
import java.util.List;

public class NthRoot extends BinaryOperation {
    public NthRoot(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    public NthRoot(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "root";
        neutral = 1;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) {
        return nthroot(MyReal.toReal(l), r.getValue().intValue());
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r) {return null;}

    @Override
    public MyNumber op(MyInteger l, MyComplex r) {
        return null;
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) {
        return null;
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) {
        return null;
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) {
        return null;
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) {
        return null;
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        return null;
    }


    public static MyReal nthroot(MyReal r, int root) {
        return MyReal.valueOf(Math.pow(r.getValue().doubleValue(), 1./root));
    }
}
