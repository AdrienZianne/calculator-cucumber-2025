package calculator;

/**
 * Represents a rational number.
 */
public class MyRational extends MyNumber {

    Pair<Integer, Integer> numDenomPair;

    /**
     * The default constructor of the {@link MyRational} class.
     * @param numerator The numerator of the rational number.
     * @param denominator The denominator of the rational number.
     */
    public MyRational(Integer numerator, Integer denominator) { this.numDenomPair = new Pair<>(numerator, denominator); }

    /**
     * Constructs a rational with a denominator set to 1.
     * @param number The numerator of the rational number.
     */
    public MyRational(Integer number) {this.numDenomPair = new Pair<>(number, 1);}

    /**
     * Turns a rational number into a double by dividing the enumerator by the denominator.
     * @return The computed double.
     */
    public double applyDenominator() {
        return (double) this.numDenomPair.a / (double) this.numDenomPair.b;
    }

    @Override
    public Object getObjectValue() {
        return getNumDenomPair();
    }

    /**
     * Gets the enumerator and denominator of the rational number.
     * @return An instance of a {@link Pair} that stores the enumerator as the value {@code a} and the denominator as the value {@code b}
     */
    public Pair<Integer, Integer> getNumDenomPair() { return numDenomPair; }


    /**
     * Simplifies this {@link MyRational} instance.
     * @return The simplified number.
     * Either another instance of {@link MyRational}.
     * Or if the new denominator is equal to 1, then it returns an {@link MyInteger} instance.
     */
    public MyNumber simplify() {
        int gcd = gcd(this.numDenomPair.a, this.numDenomPair.b);
        int newNum = numDenomPair.a / gcd;
        int newDenom = numDenomPair.b / gcd;
        return newDenom != 1 ? new MyRational(newNum, newDenom) : new MyInteger(newNum);
    }

    /**
     * Finds the greatest common divisor of {@code a} and {@code b}.
     * @param a An integer.
     * @param b An integer.
     * @return The greatest common divisor of {@code a} and {@code b}.
     */
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numDenomPair.a + "/" + numDenomPair.b;
    }
}
