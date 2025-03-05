package calculator;

public class MyComplex extends MyNumber
{
    private final double real;
    private final double imaginary;

    /**
     * Constructor method
     *
     * @param real Double value of the real part to be contained in object
     * @param imaginary Double value of the imaginary part to be contained in object
     */
    public /*constructor*/ MyComplex(double real, double imaginary) {
        this.type = Type.COMPLEX;
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
