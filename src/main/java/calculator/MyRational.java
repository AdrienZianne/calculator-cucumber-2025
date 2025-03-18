package calculator;

import java.math.BigInteger;

/**
 * Represents a rational number.
 */
public class MyRational extends MyNumber {

    Pair<MyInteger, MyInteger> numDenomPair;

    /**
     * The default constructor of the {@link MyRational} class.
     * @param numerator The numerator of the rational number.
     * @param denominator The denominator of the rational number.
     */
    public MyRational(Integer numerator, Integer denominator)
    {
        this.numDenomPair = simplifyNumDenom(numerator, denominator);
    }

    public MyRational(MyInteger numerator, MyInteger denominator)
    {
        this(numerator.getValue(), denominator.getValue());
    }
    public MyRational(BigInteger numerator, BigInteger denominator)
    {
        this.numDenomPair = simplifyNumDenom(numerator, denominator);
    }

    /**
     * Constructs a rational with a denominator set to 1.
     * @param number The numerator of the rational number.
     */
    public MyRational(Integer number) {this.numDenomPair = new Pair<>(new MyInteger(number), new MyInteger(1));}


    public static MyRational toRational(MyReal real)
    {
        int denom = (int) Math.pow(10, real.getValue().scale());
        int num = (int) (real.getValue().doubleValue() * denom);
        return new MyRational(num, denom);
    }


    @Override
    public Object getObjectValue() {
        return getNumDenomPair();
    }

    /**
     * Gets the enumerator and denominator of the rational number.
     * @return An instance of a {@link Pair} that stores the enumerator as the value {@code a} and the denominator as the value {@code b}
     */
    public Pair<MyInteger, MyInteger> getNumDenomPair() { return numDenomPair; }


    /**
     * Simplifies this {@link MyRational} instance.
     * @return The simplified number.
     * Either another instance of {@link MyRational}.
     * Or if the new denominator is equal to 1, then it returns an {@link MyInteger} instance.
     */
    public MyNumber simplify() {
        Pair<MyInteger, MyInteger> newNumDenom = simplifyNumDenom(this.getNumDenomPair().a.getValue(), this.getNumDenomPair().b.getValue());

        return ! newNumDenom.b.getValue().equals(BigInteger.ONE) ? new MyRational(newNumDenom.a.getValue(), newNumDenom.b.getValue()) : new MyInteger(newNumDenom.a.getValue());
    }

    /**
     * Simplifies the given enumerator and denominator.
     * @return The simplified enumerator and denominator.
     */
    public static Pair<MyInteger, MyInteger> simplifyNumDenom(int a, int b) {
        return simplifyNumDenom(BigInteger.valueOf(a), BigInteger.valueOf(b));
    }
    public static Pair<MyInteger, MyInteger> simplifyNumDenom(BigInteger a, BigInteger b) {
        BigInteger gcd = a.gcd(b);
        BigInteger newNum = a.divide(gcd);
        BigInteger newDenom = b.divide(gcd);
        if (newDenom.signum() < 0)  {newNum = newNum.negate();newDenom = newDenom.negate(); }
        return new Pair<>(new MyInteger(newNum), new MyInteger(newDenom));
    }


        /**
         * Finds the greatest common divisor of {@code a} and {@code b}.
         * @param a An integer.
         * @param b An integer.
         * @return The greatest common divisor of {@code a} and {@code b}.
         */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numDenomPair.a + "/" + numDenomPair.b;
    }
}
