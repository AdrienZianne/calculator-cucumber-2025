package calculator.operation.binary;

import calculator.*;
import calculator.operation.unary.SquareRoot;
import calculator.operation.unary.UnaryOperation;

import java.util.List;

/**
 * A class used to represent the nth-root operation on a number.
 * Let {@code x} be our expression and {@code n} be the value of the index, the operation will result in {@code n√(x)}.
 * Note that the symbol used for the {@link String} representation of this operation is simply {@code "root"}.
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
        return nthRoot(MyReal.toReal(l), r);
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
        return getIndexErrorText("real");
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) {
        return getIndexComplexErrorText();
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {
        return getIndexErrorText("rational");
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        return nthRoot(l, r);
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        // Checks if r can be translated as an int
        return nthRoot(l, r);
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) {
        return getIndexComplexErrorText();
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) {
        return getIndexErrorText("rational");
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) {
        return getComplexErrorText();
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) {
        return getComplexErrorText();
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) {
        return getComplexErrorText();
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) {
        return getComplexErrorText();
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        return nthRoot(MyReal.toReal(l), r);
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        return nthRoot(MyReal.toReal(l), r);
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) {
        return getIndexComplexErrorText();
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        return nthRoot(MyReal.toReal(l), MyReal.toReal(r));
    }


    private MyNumber nthRoot(MyReal r, MyInteger rootIndex) {
        return nthRoot(r, MyReal.toReal(rootIndex));
    }

    private MyNumber nthRoot(MyReal r, MyReal rootIndex) {
        // Checks if the root index is a valid index.
        if (rootIndex.getSign() < 0)
            return new MyErrorNumber(this, "The value of the index must be positive");
        if (!rootIndex.isLong())
            return new MyErrorNumber(this,"The value of the index must be " +
                    "an integer smaller than " + Long.MAX_VALUE);

        if (!r.isDouble())
            return new MyErrorNumber(this, "The value of the expression to apply the operation must be"
                    + "a real number contained between : " + Double.MAX_VALUE + " and " + Double.MIN_VALUE);

        long n = rootIndex.getValue().intValue();
        double x = r.getValue().doubleValue();
        if (n == 0 || n == 1) return new MyErrorNumber(this, "The value of n, cannot be 0 or 1");

        // If n == 2 then this is a square root operation
        if (n == 2) return UnaryOperation.op(r, SquareRoot::new);

        return MyReal.valueOf(Math.pow(x, 1./n));
    }

    private MyErrorNumber getIndexErrorText(String numberType) {
        return new MyErrorNumber(this, "A \"" + numberType + "\" number is not a valid index for the root operation");
    }
    private MyErrorNumber getIndexComplexErrorText() {
        return new MyErrorNumber(this, "A \"complex\" number is not a valid index for the root operation");
    }

    private MyErrorNumber getComplexErrorText() {
        return new MyErrorNumber(this, "A \"complex\" number is not supported by the root operation");
    }


    // We override the toString method because of this function uniqueness
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

    /**
     * Gets the expression as a string representing the function being applied.
     * @param expr The expression being passed to the root function.
     * @param n The value of the index of the root function.
     * @return The string : {@code "root(expr, n)"}.
     */
    private String asFunction(String expr, Expression n) {
        return symbol + "(" + expr + ", " + n + ")";
    }
}
