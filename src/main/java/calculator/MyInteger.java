package calculator;

public class MyInteger extends MyNumber
{
    private final int value;

    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    public MyInteger(int v) {
        this.type = Type.INTEGER; 
        this.value = v;
    }

    public MyInteger plus(MyInteger other) {
        return new MyInteger(this.value + other.value);
    }

    public MyInteger minus(MyInteger other) {
        return new MyInteger(this.value - other.value);
    }

    public MyInteger times(MyInteger other) {
        return new MyInteger(this.value * other.value);
    }

    public MyInteger divides(MyInteger other) {
        return new MyInteger(this.value / other.value);
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
