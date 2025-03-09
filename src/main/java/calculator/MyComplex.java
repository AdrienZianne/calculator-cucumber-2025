package calculator;

public class MyComplex extends MyNumber
{
    public final double real;
    public final double imag;

    /**
     * Constructor method
     *
     * @param real Double value of the real part to be contained in object
     * @param imaginary Double value of the imaginary part to be contained in object
     */
    public /*constructor*/ MyComplex(double real, double imag) {
        this.type = Type.COMPLEX;
        this.real = real;
        this.imag = imag;
    }

    public MyNumber plus(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> new MyComplex(((MyInteger) other).value + this.real, this.imag);
            case REAL -> new MyComplex(((MyReal) other).value + this.real, this.imag);
            case RATIONAL -> {
                double new_value = (((MyRational) other).num / ((MyRational) other).den) + this.real;
                MyComplex myComplexe = new MyComplex(new_value, this.imag);
                yield myComplexe;
            }
            case COMPLEX -> new MyComplex(this.real + ((MyComplex) other).real, this.imag + ((MyComplex) other).imag);
            default -> this;//TODO maybe thow an error
        };
    }

    public MyNumber minus(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> new MyComplex(this.real - ((MyInteger) other).value, this.imag);
            case REAL -> new MyComplex(this.real - ((MyReal) other).value, this.imag);
            case RATIONAL -> {
                double new_value = this.real - (((MyRational) other).num / ((MyRational) other).den);
                MyComplex myComplexe = new MyComplex(new_value, this.imag);
                yield myComplexe;
            }
            case COMPLEX -> new MyComplex(this.real - ((MyComplex) other).real, this.imag - ((MyComplex) other).imag);
            default -> this;//TODO maybe thow an error
        };
    }

    public MyNumber times(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> new MyComplex(this.real * ((MyInteger) other).value, this.imag * ((MyInteger) other).value);
            case REAL -> new MyComplex(this.real * ((MyReal) other).value, this.imag * ((MyReal) other).value);
            case RATIONAL -> {
                double new_value1 = this.real * (((MyRational) other).num / ((MyRational) other).den);
                double new_value2 = this.imag * (((MyRational) other).num / ((MyRational) other).den);
                MyComplex myComplexe = new MyComplex(new_value1, new_value2);
                yield myComplexe;
            }
            case COMPLEX -> {
                double new_value1 = this.real * ((MyComplex) other).real - this.imag * ((MyComplex) other).imag;
                double new_value2 = this.real * ((MyComplex) other).imag + this.imag * ((MyComplex) other).real;
                MyComplex myComplexe = new MyComplex(new_value1, new_value2);
                yield myComplexe;
            }
            default -> this;//TODO maybe thow an error
        };
    }

    //TODO protect division by zero and 
    public MyNumber divides(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> new MyComplex(this.real / ((MyInteger) other).value, this.imag / ((MyInteger) other).value);
            case REAL -> new MyComplex(this.real / ((MyReal) other).value, this.imag / ((MyReal) other).value);
            case RATIONAL -> {
                double new_value1 = this.real / (((MyRational) other).num / ((MyRational) other).den);
                double new_value2 = this.imag / (((MyRational) other).num / ((MyRational) other).den);
                MyComplex myComplexe = new MyComplex(new_value1, new_value2);
                yield myComplexe;
            }
            case COMPLEX -> {
                double den = ((MyComplex) other).real * ((MyComplex) other).real + ((MyComplex) other).imag * ((MyComplex) other).imag;
                double new_value1 = (this.real * ((MyComplex) other).real + this.imag * ((MyComplex) other).imag) / den;
                double new_value2 = (this.imag * ((MyComplex) other).real - this.real * ((MyComplex) other).imag) / den;
                MyComplex myComplexe = new MyComplex(new_value1, new_value2);
                yield myComplexe;
            }
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

        return this.real == ((MyComplex)o).real && this.imag == ((MyComplex)o).imag;
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
        return (int) (real * imag);
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
}
