package calculator;

public class MyRational extends MyNumber
{
    public final int numerator;
    public final int denominator;

    /**
     * Constructor method
     *
     * @param num Integer value of the numerator to be contained in object
     * @param den Integer value of the denominator to be contained in object
     */
    public /*constructor*/ MyRational(int num, int den) {
        if (den == 0) throw new ArithmeticException("The denominator cannot be zero.");
        this.type = Type.RATIONAL;
        //TODO Simplify the fraction
        this.numerator = num;
        this.denominator = den;
    }

    public MyNumber plus(MyNumber other) {
        return new MyRational(0, 0);
    }

    public MyNumber minus(MyNumber other) {
        return new MyRational(0, 0);
    }

    public MyNumber times(MyNumber other) {
        return new MyRational(0, 0);
    }

    public MyNumber divides(MyNumber other) {
        return new MyRational(0, 0);
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
