package calculator;

public class MyComplex extends MyNumber
{
    public final double real;
    public final double imaginary;

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

    public MyNumber plus(MyNumber other) {
        return new MyComplex(0, 0);
    }

    public MyNumber minus(MyNumber other) {
        return new MyComplex(0, 0);
    }

    public MyNumber times(MyNumber other) {
        return new MyComplex(0, 0);
    }

    public MyNumber divides(MyNumber other) {
        return new MyComplex(0, 0);
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
