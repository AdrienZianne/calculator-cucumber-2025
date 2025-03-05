package calculator;

public class MyRational extends MyNumber
{
    private final int numerator;
    private final int denominator;

    /**
     * Constructor method
     *
     * @param num Integer value of the numerator to be contained in object
     * @param den Integer value of the denominator to be contained in object
     */
    public /*constructor*/ MyRational(int num, int den) {
        if (den == 0) throw new ArithmeticException("The denominator cannot be zero.");
        this.type = Type.RATIONAL;
        this.numerator = num;
        this.denominator = den;
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
