package calculator;

import java.util.List;

/// Classed used to represents a commutative operation, meaning if we have the following operation `a op b` then there is no need to also define `b op a`
public abstract class CommutativeOperation extends Operation
{

    public CommutativeOperation(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r) {
        return op(r,l);
    }

    @Override
    public MyNumber op(MyInteger l, ComplexNumber r) {
        return op(r, l);
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {
        return op(r,l);
    }

    @Override
    public MyNumber op(MyReal l, ComplexNumber r) {
        return op(r,l);
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) {
        return op(r,l);
    }

    @Override
    public MyNumber op(ComplexNumber l, MyRational r) {
        return op(r,l);
    }


}
