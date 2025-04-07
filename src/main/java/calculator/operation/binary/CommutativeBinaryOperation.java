package calculator.operation.binary;

import calculator.*;

import java.util.List;

/// Classed used to represents a commutative operation, meaning if we have the following operation `a op b` then there is no need to also define `b op a`
public abstract class CommutativeBinaryOperation extends BinaryOperation
{

    public CommutativeBinaryOperation(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r) {
        return op(r,l);
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) {
        return op(r, l);
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {
        return op(r,l);
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) {
        return op(r,l);
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) {
        return op(r,l);
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) {
        return op(r,l);
    }


}
