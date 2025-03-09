package calculator;

public class MyRational extends MyNumber
{
    public final int num;
    public final int den;

    /**
     * Constructor method
     *
     * @param num Integer value of the num to be contained in object
     * @param den Integer value of the den to be contained in object
     */
    public /*constructor*/ MyRational(int num, int den) {
        if (den == 0) throw new ArithmeticException("The den cannot be zero.");
        this.type = Type.RATIONAL;
        //TODO Simplify the fraction
        this.num = num;
        this.den = den;
    }

    public MyNumber plus(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> {
                int new_value = this.den * ((MyInteger) other).value;
                MyRational myRational = new MyRational(new_value + this.num, this.den);
                yield myRational;
            }
            case REAL -> {
                double new_value = this.den * ((MyReal) other).value;
                MyRational myRational = new MyRational(((int) new_value) + this.num, this.den);
                yield myRational;
            }
            case RATIONAL -> {
                double new_value1 = this.num * ((MyRational) other).den;
                double new_value2 = this.den * ((MyRational) other).num;
                MyRational myRational = new MyRational(((int) new_value1) + ((int) new_value2), this.den * ((MyRational) other).den);
                yield myRational;
            }
            case COMPLEX -> {
                double new_value = (this.num / this.den) + ((MyComplex) other).real;
                MyComplex myComplexe = new MyComplex(new_value, ((MyComplex) other).imag);
                yield myComplexe;
            }
            default -> this;//TODO maybe thow an error
        };
    }

    public MyNumber minus(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> {
                int new_value = this.den * ((MyInteger) other).value;
                MyRational myRational = new MyRational(this.num - new_value, this.den);
                yield myRational;
            }
            case REAL -> {
                double new_value = this.den * ((MyReal) other).value;
                MyRational myRational = new MyRational(this.num - ((int) new_value), this.den);
                yield myRational;
            }
            case RATIONAL -> {
                double new_value1 = this.num * ((MyRational) other).den;
                double new_value2 = this.den * ((MyRational) other).num;
                MyRational myRational = new MyRational(((int) new_value1) - ((int) new_value2), this.den * ((MyRational) other).den);
                yield myRational;
            }
            case COMPLEX -> {
                double new_value = (this.num / this.den) - ((MyComplex) other).real;
                MyComplex myComplexe = new MyComplex(new_value, ((MyComplex) other).imag);
                yield myComplexe;
            }
            default -> this;//TODO maybe thow an error
        };
    }

    public MyNumber times(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> {
                MyRational myRational = new MyRational(((MyInteger) other).value + this.num, this.den);
                yield myRational;
            }
            case REAL -> {
                MyRational myRational = new MyRational(((int) ((MyReal) other).value) + this.num, this.den);
                yield myRational;
            }
            case RATIONAL -> {
                double new_value1 = this.num * ((MyRational) other).num;
                double new_value2 = this.den * ((MyRational) other).den;
                MyRational myRational = new MyRational(((int) new_value1), ((int) new_value2));
                yield myRational;
            }
            case COMPLEX -> {
                double new_value1 = (this.num / this.den) * ((MyComplex) other).real;
                double new_value2 = (this.num / this.den) * ((MyComplex) other).imag;
                MyComplex myComplexe = new MyComplex(new_value1, new_value2);
                yield myComplexe;
            }
            default -> this;//TODO maybe thow an error
        };
    }

    //TODO protect division by zero and 
    public MyNumber divides(MyNumber other) {
        return switch (other.type) {
            case INTEGER -> {
                MyRational myRational = new MyRational(this.num, this.den * ((MyInteger) other).value);
                yield myRational;
            }
            case REAL -> {
                MyRational myRational = new MyRational(this.num, ((int) this.den * ((MyInteger) other).value));
                yield myRational;
            }
            case RATIONAL -> {
                double new_value1 = this.num * ((MyRational) other).den;
                double new_value2 = this.den * ((MyRational) other).num;
                MyRational myRational = new MyRational(((int) new_value1), ((int) new_value2));
                yield myRational;
            }
            case COMPLEX -> {
                double real = ((MyComplex) other).real;
                double imag = ((MyComplex) other).imag;
                MyComplex new_value1 = (MyComplex) this.times(new MyComplex(real, -imag));
                double new_value2 = real * real + imag * imag;
                MyComplex myComplexe = new MyComplex(new_value1.real / new_value2, new_value1.imag / new_value2);
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

        return this.num == ((MyRational)o).num && this.den == ((MyRational)o).den;
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
        return num * den;
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        return num + "/" + den;
    }
}
