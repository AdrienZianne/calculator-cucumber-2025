package calculator;

public class MyInteger extends MyNumber
{
    public final int value;

    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    public MyInteger(int v) {
        this.type = Type.INTEGER; 
        this.value = v;
    }

    public MyNumber plus(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> new MyInteger(this.value + ((MyInteger) other).value);
            case REAL -> new MyReal(this.value + ((MyReal) other).value);
            case RATIONAL -> {
                int new_value = this.value * ((MyRational) other).denominator;
                MyRational myRational = new MyRational(new_value + ((MyRational) other).numerator, ((MyRational) other).denominator);
                yield myRational;
            }
            case COMPLEX -> new MyComplex(this.value + ((MyComplex) other).real, ((MyComplex) other).imaginary);
            default -> this;//TODO maybe thow an error
        };
    }

    public MyNumber minus(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> new MyInteger(this.value - ((MyInteger) other).value);
            case REAL -> new MyReal(this.value - ((MyReal) other).value);
            case RATIONAL -> {
                int new_value = this.value * ((MyRational) other).denominator;
                MyRational myRational = new MyRational(new_value - ((MyRational) other).numerator, ((MyRational) other).denominator);
                yield myRational;
            }
            case COMPLEX -> new MyComplex(this.value - ((MyComplex) other).real, ((MyComplex) other).imaginary);
            default -> this;//TODO maybe thow an error
        };
    }

    public MyNumber times(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> new MyInteger(this.value * ((MyInteger) other).value);
            case REAL -> new MyReal(this.value * ((MyReal) other).value);
            case RATIONAL -> new MyRational(this.value * ((MyRational) other).numerator, ((MyRational) other).denominator);
            case COMPLEX -> new MyComplex(this.value * ((MyComplex) other).real, this.value * ((MyComplex) other).imaginary);
            default -> this;//TODO maybe thow an error
        };
    }

    //TODO protect division by zero
    public MyNumber divides(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> new MyInteger(this.value / ((MyInteger) other).value);
            case REAL -> new MyReal(this.value / ((MyReal) other).value);
            case RATIONAL -> new MyRational(this.value * ((MyRational) other).denominator, ((MyRational) other).numerator);
            case COMPLEX -> new MyComplex(this.value / ((MyComplex) other).real, this.value / ((MyComplex) other).imaginary);
            default -> this;//TODO maybe thow an error
        };
    }

    /** Two MyNumber expressions are equal if the values they contain are equal
     *
     * @param o The object to compare to
     * @return A boolean representing the result of the equality test
     */
    @Override
    public boolean equals(Object o) {
        // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
        if (o == null) return false;

        // If the object is compared to itself then return true
        if (o == this) {
            return true;
        }

        // If the object is of another type then return false
        if (!(o instanceof MyInteger)) {
            return false;
        }

        return this.value == ((MyInteger)o).value;
        // Used == since the contained value is a primitive value
        // If it had been a Java object, .equals() would be needed
    }

    /** The method hashCode needs to be overridden it the equals method is overridden;
     * 	otherwise there may be problems when you use your object in hashed collections
     * 	such as HashMap, HashSet, LinkedHashSet.
     *
     * @return	The result of computing the hash.
     */
    @Override
    public int hashCode() {
        return value;
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
