package calculator;

public class MyReal extends MyNumber
{
    private final double value;

    /**
     * Constructor method
     *
     * @param v The double value to be contained in the object
     */
    public /*constructor*/ MyReal(double v) {
        this.type = Type.REAL;
        this.value = v;
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        return Double.toString(value);
    }
}
