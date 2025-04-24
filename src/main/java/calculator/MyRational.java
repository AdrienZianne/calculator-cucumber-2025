package calculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import java.util.ArrayList;

import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Divides;
import calculator.operation.binary.Times;

/**
 * Represents a rational number.
 */
public class MyRational extends MyNumber {

    Pair<MyInteger, MyInteger> numDenomPair;

    /**
     * The default constructor of the {@link MyRational} class.
     * 
     * @param numerator   The numerator of the rational number.
     * @param denominator The denominator of the rational number.
     */
    private MyRational(Integer numerator, Integer denominator) {
        this.numDenomPair = simplifyNumDenom(numerator, denominator);
    }



    /**
     * The constructor of the {@link MyRational} class.
     * 
     * @param numerator   The numerator of the rational number.
     * @param denominator The denominator of the rational number.
     */
    private MyRational(MyInteger numerator, MyInteger denominator) {
        this(numerator.getValue(), denominator.getValue());
    }

    /**
     * The constructor of the {@link MyRational} class.
     * 
     * @param numerator   The numerator of the rational number.
     * @param denominator The denominator of the rational number.
     */
    private MyRational(BigInteger numerator, BigInteger denominator) {
        this.numDenomPair = simplifyNumDenom(numerator, denominator);
    }

    /**
     * Method used to create a MyErrorNumber object because the rational cannot be
     * created.
     *
     * @param numerator
     * @param denominator
     *
     * @return An error number containing an explanation of the problem.
     */
    private static MyNumber createErrorNumber(MyInteger numerator, MyInteger denominator) {
        ArrayList<Expression> params = new ArrayList<>();
        params.add(numerator);
        params.add(denominator);
        try {
            return new MyErrorNumber(new Divides(params), "A rational cannot have a denominator of 0");
        } catch (IllegalConstruction e) {
            return new MyErrorNumber(null, "A rational cannot have a denominator of 0");
        }
    }

    /**
     * Method for creating a MyRational object using denominator checks.
     * 
     * @param numerator
     * @param denominator
     *
     * @return A rational if it could be created correctly or an error number
     *         because the rational could not be created.
     */
    public static MyNumber create(Integer numerator, Integer denominator) {
        if (denominator == 0) {
            return createErrorNumber(new MyInteger(numerator), new MyInteger(denominator));
        }
        return new MyRational(numerator, denominator).simplify();
    }

    /**
     * Method for creating a MyRational object using denominator checks.
     * 
     * @param numerator
     * @param denominator
     *
     * @return A rational if it could be created correctly or an error number
     *         because the rational could not be created.
     */
    public static MyNumber create(MyInteger numerator, MyInteger denominator) {
        if (denominator.isZero()) {
            return createErrorNumber(numerator, denominator);
        }
        return new MyRational(numerator, denominator).simplify();
    }

    /**
     * Method for creating a MyRational object using denominator checks.
     * 
     * @param numerator
     * @param denominator
     *
     * @return A rational if it could be created correctly or an error number
     *         because the rational could not be created.
     */
    public static MyNumber create(BigInteger numerator, BigInteger denominator) {
        return create(new MyInteger(numerator), new MyInteger(denominator));
    }

    /**
     * Method for creating a MyRational object using denominator checks.
     *
     * @param numerator
     * @param denominator
     *
     * @return A rational if it could be created correctly or an error number
     *         because the rational could not be created.
     */
    public static MyNumber create(MyReal numerator, MyReal denominator) {
        return BinaryOperation.op(numerator, denominator, Divides::new);
    }

    public static MyNumber toRational(MyReal real) {
        BigInteger denom = BigInteger.TEN.pow(real.getValue().scale());
        BigInteger num = real.getValue().multiply(new BigDecimal(denom)).toBigInteger();
        return new MyRational(num, denom).simplify();
    }

    @Override
    public Object getObjectValue() {
        return getNumDenomPair();
    }

    /**
     * Gets the enumerator and denominator of the rational number.
     * 
     * @return An instance of a {@link Pair} that stores the enumerator as the value
     *         {@code a} and the denominator as the value {@code b}
     */
    public Pair<MyInteger, MyInteger> getNumDenomPair() {
        return numDenomPair;
    }

    /**
     * Simplifies this {@link MyRational} instance.
     * 
     * @return The simplified number.
     *         Either another instance of {@link MyRational}.
     *         Or if the new denominator is equal to 1 or the enumerator is equal to
     *         0, then it returns an {@link MyInteger} instance.
     */
    private MyNumber simplify() {
        Pair<MyInteger, MyInteger> newNumDenom = simplifyNumDenom(this.getNumDenomPair().a.getValue(),
                this.getNumDenomPair().b.getValue());
        if (newNumDenom.b.getValue().equals(BigInteger.ONE) || newNumDenom.b.isZero()) {
            return new MyInteger(newNumDenom.a.getValue());
        }
        return new MyRational(newNumDenom.a.getValue(), newNumDenom.b.getValue());
    }

    /**
     * Simplifies the given enumerator and denominator.
     * 
     * @return The simplified enumerator and denominator.
     */
    public static Pair<MyInteger, MyInteger> simplifyNumDenom(int a, int b) {
        return simplifyNumDenom(BigInteger.valueOf(a), BigInteger.valueOf(b));
    }

    public static Pair<MyInteger, MyInteger> simplifyNumDenom(BigInteger a, BigInteger b) {
        BigInteger gcd = a.gcd(b);
        BigInteger newNum = a.divide(gcd);
        BigInteger newDenom = b.divide(gcd);
        if (newDenom.signum() < 0) {
            newNum = newNum.negate();
            newDenom = newDenom.negate();
        }
        return new Pair<>(new MyInteger(newNum), new MyInteger(newDenom));
    }

    @Override
    public String toString() {
        return numDenomPair.a + "/" + numDenomPair.b;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass() && (o instanceof MyComplex))
            return false;

        MyRational that = (MyRational) switch (o)
        {
            case MyReal r : yield MyRational.toRational(r);
            case MyRational r : yield r;
            case MyInteger i : yield new MyRational(i, i);
            default: yield  null;
        };

        if (that == null) return false;
        return Objects.equals(numDenomPair, that.numDenomPair);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numDenomPair);
    }

    @Override
    public boolean isZero() {
        return this.numDenomPair.a.isZero();
    }

    @Override
    public int getSign() {
        return this.numDenomPair.a.getSign() * this.numDenomPair.b.getSign();
    }
}
