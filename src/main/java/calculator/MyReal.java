package calculator;

public class MyReal extends MyNumber
{
    public final double value;

    /**
     * Constructor method
     *
     * @param v The double value to be contained in the object
     */
    public /*constructor*/ MyReal(double v) {
        this.type = Type.REAL;
        this.value = v;
    }

    public MyNumber plus(MyNumber other) {
        return new MyReal(this.value + ((MyReal) other).value);
    }

    public MyNumber minus(MyNumber other) {
        return new MyReal(this.value - ((MyReal) other).value);
    }

    public MyNumber times(MyNumber other) {
        return new MyReal(this.value * ((MyReal) other).value);
    }

    public MyNumber divides(MyNumber other) {
        return new MyReal(this.value / ((MyReal) other).value);
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
