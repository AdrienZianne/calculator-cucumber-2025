package calculator.operation.binary;

import calculator.*;
import calculator.operation.BuildOperationFunction;
import calculator.operation.Operation;
import calculator.operation.unary.Negation;
import calculator.operation.unary.UnaryOperation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;



/**
 * A class used to represent the exponentiation of a number.
 * Let {@code x} be our expression and {@code n} be the value of the exponent, the operation will result in {@code x^n}.
 * Note that the value of an integer exponent must be contained between {@code 0} and {@code 999999999}.
 */
public final class Exponent extends BinaryOperation {

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
        if (l.isZero() && r.isZero()) return new MyUndefinedNumber(this);

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
        // 999999999 because this is the max value of the pow function from BigInteger
        if (!r.isInt() || r.getValue().compareTo(BigInteger.valueOf(999999999)) > 0)
                return new MyErrorNumber(this,"The absolute value of an exponent must be " +
                        "contained between : " + 0 + " and " + 999999999 + ", inclusive");
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
        if (r.equals(MyInteger.valueOf(2))) {
            return complexSquared(l);
        }
        else if (r.equals(MyInteger.valueOf(3))) {
            return complexCube(l);
        }
        return complexPower(l, r);
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

    @Override
    public MyNumber op(MyInteger l, MyInfinity r) {
        if (l.equals(ConstantNumber.ONE)) return new MyUndefinedNumber(this);

        if (l.isZero())
        {
            if (r.isPositive()) return MyInteger.valueOf(0);
            else return new MyUndefinedNumber(this);
        }
        if (l.isZero() && r.isPositive()) return MyInteger.valueOf(0);
        if (l.getSign() <= 0 && r.isPositive()) return new MyUndefinedNumber(this);
        if (r.isPositive()) return new MyInfinity(l.getSign() > 0);

        return new MyInteger(0);
    }

    @Override
    public MyNumber op(MyReal l, MyInfinity r) {
        if (l.equals(MyReal.valueOf(1))) return new MyUndefinedNumber(this);
        if (l.equals(MyReal.valueOf(0))) return MyInteger.valueOf(0);

        return op(MyRational.toRational(l), r);
    }

    @Override
    public MyNumber op(MyComplex l, MyInfinity r) {
        if (!r.isPositive()) return MyInteger.valueOf(0);

        return new MyUndefinedNumber(this);
    }

    @Override
    public MyNumber op(MyRational l, MyInfinity r) {
        MyInteger num = l.getNumDenomPair().a;
        MyInteger denom = l.getNumDenomPair().b;

        // if the rational is contained btw -1 and 1
        if (num.getValue().abs().compareTo(denom.getValue().abs()) < 0) {
            if (l.getSign() > 0) {
                if (r.isPositive()) return MyInteger.valueOf(0);
                return new MyInfinity(true);
            }
            if (r.isPositive()) return MyInteger.valueOf(0);
            return new MyUndefinedNumber(this);
        }
        if (l.getSign() > 0) {
            if (r.isPositive()) return new MyInfinity(true);
            return MyInteger.valueOf(0);
        }
        if (r.isPositive()) return new MyUndefinedNumber(this);
        return new MyInteger(0);
    }

    @Override
    public MyNumber op(MyInfinity l, MyInteger r) {
        return infiniteValue(l, r);
    }

    @Override
    public MyNumber op(MyInfinity l, MyReal r) {
        return infiniteValue(l, r);
    }

    @Override
    public MyNumber op(MyInfinity l, MyComplex r) {
        return new MyUndefinedNumber(this);
    }

    @Override
    public MyNumber op(MyInfinity l, MyRational r) {
        return infiniteValue(l, r);
    }

    @Override
    public MyNumber op(MyInfinity l, MyInfinity r) {
        return new MyUndefinedNumber(this);
    }

    private MyNumber infiniteValue(MyInfinity l, MyNumber r) {
        if (r.equals(ConstantNumber.ZERO)) return new MyUndefinedNumber(this);
        if (r.getSign() < 0) return MyInteger.valueOf(0);
        // If, r is even always return positive infinity
        if (BinaryOperation.op(r, MyInteger.valueOf(2), Modulus::new).equals(ConstantNumber.ZERO)) {
            return new MyInfinity(true);
        }
        // otherwise return the infinity with the same symbol
        return new MyInfinity(l.isPositive());

        // (-2)^(5/4)

        // (-2)^(3/2)
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
        if (x.isZero() && r.isZero()) return new MyUndefinedNumber(this);
        // Check if r is negative
        if (r.getSign() < 0)
            return inversePower(x,r);
        // l^(a/b) = root(x^a, b)
        MyNumber lPowerA = op(x, r.getNumDenomPair().a);
        return BinaryOperation.op(lPowerA, r.getNumDenomPair().b, NthRoot::new);
    }


    private MyNumber complexPower(MyComplex val, MyInteger n) {
        BigInteger[] decompositions = new BigInteger[3];

        // Number
        decompositions[0] = n.getValue().divide(BigInteger.valueOf(3));
        decompositions[1] = n.getValue().subtract(decompositions[0].multiply(BigInteger.valueOf(3)))
                                    .divide(BigInteger.valueOf(2));
        decompositions[2] = n.getValue().subtract(decompositions[0].multiply(BigInteger.valueOf(3)))
                                        .subtract(decompositions[1].multiply(BigInteger.TWO)); // the rest


        MyNumber total = ConstantNumber.ONE;

        // Cubed :
        BigInteger count = BigInteger.valueOf(0);
        if (decompositions[0].compareTo(BigInteger.ZERO) > 0)  {
            MyNumber complexCube = complexCube(val);
            while (count.compareTo(decompositions[0]) < 0)
            {
                total = BinaryOperation.op(total, complexCube, Times::new);
                count = count.add(BigInteger.ONE);
            }
        }

        // Squared :

        if (decompositions[0].compareTo(BigInteger.ZERO) > 0) {
            count = BigInteger.valueOf(0);
            MyNumber complexSquare = complexSquared(val);
            while (count.compareTo(decompositions[1]) < 0) {
                total = BinaryOperation.op(total, complexSquare, Times::new);
                count = count.add(BigInteger.ONE);
            }
        }

        // Rest :
        if (decompositions[2].compareTo(BigInteger.ZERO) > 0)
        {
            total = BinaryOperation.op(total, val, Times::new);
        }

        return total;
    }


    private MyNumber complexSquared(MyComplex nb) {
        // (a+bi)^2 = a^2 + 2abi - b^2 = (a^2 - b^2) + 2abi

        MyNumber a = nb.getRealImaginaryPair().a;
        MyNumber b = nb.getRealImaginaryPair().b;

        MyNumber aSquared = op(a, MyInteger.valueOf(2));
        MyNumber bSquared = op(b, MyInteger.valueOf(2));

        MyNumber ab = BinaryOperation.op(a, b, Times::new);
        MyNumber abTimes2 = BinaryOperation.op(ab, MyInteger.valueOf(2), Times::new);

        return MyComplex.create(
                BinaryOperation.op(aSquared, bSquared, Minus::new), // (a^2 - b^2)
                abTimes2);  // + 2abi
    }
    private MyNumber complexCube(MyComplex nb) {
        // (a+bi)^3 = a^3 + 3a^2 bi - 3 a b^2 - b^3 i
        // (a^3 - 3ab^2) + (3a^2 b - b^3) i
        MyNumber a = nb.getRealImaginaryPair().a;
        MyNumber b = nb.getRealImaginaryPair().b;

        // 2ab^2
        MyNumber twoABSquared = tripleTimes(b, a);
        // a^3 - 2ab^2
        MyNumber aCubed = op(a, MyInteger.valueOf(3));
        MyNumber aCubedMinus2ABSquared = BinaryOperation.op(aCubed, twoABSquared, Minus::new);

        // 3a^2b
        MyNumber threeASquaredB = tripleTimes(a, b);
        // 3a^2b - b^3
        MyNumber bCubed = op(b, MyInteger.valueOf(3));
        MyNumber threeASquaredBMinusBCubed = BinaryOperation.op(threeASquaredB, bCubed, Minus::new);

        return MyComplex.create(aCubedMinus2ABSquared, threeASquaredBMinusBCubed);
    }

    /**
     * Given {@code x} and {@code x}, returns {@code 2xy²}
     * @param x The number {@code x}
     * @param y The number {@code y}
     * @return {@code 2ab²}
     */
    private MyNumber tripleTimes(MyNumber x, MyNumber y)
    {
        MyNumber squared = op(x, MyInteger.valueOf(2));
        return BinaryOperation.op(MyInteger.valueOf(3),
                BinaryOperation.op(squared, y, Times::new),
                Times::new);
    }

}
