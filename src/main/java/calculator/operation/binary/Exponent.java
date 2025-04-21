package calculator.operation.binary;

import calculator.*;
import calculator.operation.unary.Negation;
import calculator.operation.unary.UnaryOperation;

import java.util.List;

public class Exponent extends BinaryOperation {

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
        if (r.getSign() < 0)
            return inversePower(l,r);
        if (!r.isInt())
            return new MyErrorNumber(this,"The value of the exponent must be " +
                "a value contained between : " + Integer.MAX_VALUE + " and " + Integer.MIN_VALUE);
        MyNumber res = null;
        try {
            res = MyInteger.valueOf(l.getValue().pow(r.getValue().intValue()));
        }
        catch (ArithmeticException e) {
            return new MyErrorNumber(this, "The resulting value would overflow the MyInteger supported range");
        }
        return res;
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r) {
        // l^r
        // Change r to rational : a/b
        // = l^(a/b)
        MyNumber rat = MyRational.toRational(r);
        return op(l, rat);
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) {
        return new MyErrorNumber(this, "Complex exponent are not yet implemented");
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {
        return rationalPower(l,r);
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        // Check if r is negative
        if (r.getSign() < 0)
            return inversePower(l,r);

        if (!r.isInt())
                return new MyErrorNumber(this,"The value of the exponent must be " +
                        "a value contained between : " + Integer.MAX_VALUE + " and " + Integer.MIN_VALUE);

        return new MyReal(l.getValue().pow(r.getValue().intValue()));
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        MyNumber rat = MyRational.toRational(r);
        return op(l, rat);
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) {
        return new MyErrorNumber(this, "The complex exponent are not implemented");
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) {
        return rationalPower(l, r);
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) {
        return new MyErrorNumber(this, "Exponentiation of complex operations are not implemented");
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) {
        return new MyErrorNumber(this, "Exponentiation of complex operations are not implemented");
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) {
        return new MyErrorNumber(this, "The complex exponent was not implemented");
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) {
        return new MyErrorNumber(this, "Exponentiation of complex operations are not implemented");
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        // (a/b)^c = (a^c)/(b^c)
        MyNumber num = op(l.getNumDenomPair().a, r);
        MyNumber denom = op(l.getNumDenomPair().b, r);
        return BinaryOperation.op(num, denom, Divides::new);
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        MyNumber rat = MyRational.toRational(r);
        return op(l, rat);
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) {
        return new MyErrorNumber(this, "The complex exponent are not implemented");
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        // (a/b)^(c/d) = (a^(c/d))/(b^(c/d))
        MyNumber num = op(l.getNumDenomPair().a, r);
        MyNumber denom = op(l.getNumDenomPair().b, r);
        return BinaryOperation.op(num, denom, Divides::new);
    }


    /**
     * Let the following equation {@code a^(-b)}. Then the following equation will be returned {@code 1/(a^b)}
     * @param a The number to power.
     * @param n The exponent of {@code a} that is negative. In the above example, {@code n = -b}.
     * @return The result of {@code a^n}.
     */
    private MyNumber inversePower(MyNumber a, MyNumber n) {
        // a^(-b) = 1/(a^b)
        MyNumber negationR = UnaryOperation.op(n, Negation::new);
        return BinaryOperation.op(ConstantNumber.ONE, op(a, negationR), Divides::new);
    }

    /**
     * Let the following equation be {@code x^(a/b)}. Then the following equation will be returned {@code root(x^a,b)}.
     * @param x The number to power.
     * @param r The exponent of {@code x} that is a rational. In the above example, {@code x = a/b}.
     * @return The result of {@code l^r}.
     */
    private MyNumber rationalPower(MyNumber x, MyRational r) {
        // Check if r is negative
        if (r.getSign() < 0)
            return inversePower(x,r);
        // l^(a/b) = root(x^a, b)
        MyNumber lPowerA = op(x, r.getNumDenomPair().a);
        return BinaryOperation.op(lPowerA, r.getNumDenomPair().b, NthRoot::new);
    }
}
