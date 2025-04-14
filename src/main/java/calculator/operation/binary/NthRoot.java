package calculator.operation.binary;

import calculator.*;
import calculator.operation.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A class used to represent the nth-root operation on a number.
 * Let {@code x} be our expression and {@code n} be the value of the index, the operation will result in {@code n√(x)}.
 */
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
        // Checks if the index can be turned into an enumerator.
        if (!r.isInt())
            return new MyErrorNumber(this,"The value of the index must be " +
                "an integer contained between : " + Integer.MAX_VALUE + " and " + Integer.MIN_VALUE);

        return nthRoot(MyReal.toReal(l), r.getValue().intValue());
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r)
    {
        // Checks if r can be translated as an int
        if (r.isInt())
        {
            return op(l, MyInteger.valueOf(r.getValue().intValue()));
        }
        // if not, then this is not possible.
        return getErrorText("real");
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) {
        return getErrorText("complex");
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {
        return getErrorText("rational");
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


    private static MyReal nthRoot(MyReal r, int root) {
        return MyReal.valueOf(Math.pow(r.getValue().doubleValue(), 1./root));
    }

    private MyErrorNumber getErrorText(String numberType) {
        return new MyErrorNumber(this, "A \"" + numberType + "\" number is not a valid index for the root operation");
    }


    // We override the toString method because of this functions uniqueness
    @Override
    public String toString() {
        String res = "";

        switch (notation) {
            case PREFIX, POSTFIX -> res = super.toString();
            case INFIX -> {
                // we know there is at least two args
                res = asFunction(this.args.getFirst().toString(), this.args.get(1));

                for (Expression e : this.args.subList(2, this.args.size()))
                {
                    res = asFunction(res, e);
                }
            }
        }
        return res;
    }

    private String asFunction(String expr, Expression n) {
        return symbol + "(" + expr + ", " + n + ")";
    }
}
