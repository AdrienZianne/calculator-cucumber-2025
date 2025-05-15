package calculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/**
 * Represent an integer value.
 */
public class MyInteger extends MyNumber {
    private final BigInteger value;

    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    public MyInteger(int v) {
        this.value = BigInteger.valueOf(v);
    }

    /**
     * Constructor method
     *
     * @param v The long value to be contained in the object
     */
    public MyInteger(long v) {
        this.value = BigInteger.valueOf(v);
    }

    /**
     * The default constructor of the {@link MyInteger} class
     * 
     * @param v The value to store in this instance.
     */
    public MyInteger(BigInteger v) {
        this.value = v;
    }

    /**
     * Creates a {@link MyInteger} using a {@link BigInteger} instance.
     * 
     * @param v The value to store in this instance
     * @return The created instance.
     */
    public static MyInteger valueOf(BigInteger v) {
        return new MyInteger(v);
    }

    /**
     * Creates a {@link MyInteger} using a simple integer.
     * 
     * @param v The value to store in this instance.
     * @return The created instance.
     */
    public static MyInteger valueOf(Integer v) {
        return new MyInteger(v);
    }

    /**
     * Creates a {@link MyInteger} using a simple long.
     * 
     * @param v The value to store in this instance.
     * @return The created instance.
     */
    public static MyInteger valueOf(Long v) {
        return new MyInteger(v);
    }


    public static MyInteger toMyInteger(MyRational r) {return toMyInteger(MyReal.toReal(r));}
    public static MyInteger toMyInteger(MyReal r) {
        // Round using the correct rounding mode
        return new MyInteger(r.getValue().setScale(0, Configuration.getRealRoundingMode()).toBigInteger());
    }

    @Override
    public Object getObjectValue() {
        return getValue();
    }

    /**
     * Gets the stored value.
     * 
     * @return The value stored in this instance.
     */
    public BigInteger getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || (getClass() != o.getClass() && !(o instanceof MyReal)))
            return false;

        if (o instanceof MyReal r) {
            return r.equals(MyReal.toReal(this));
        }
        MyInteger myInteger = (MyInteger) o;
        return value.equals(myInteger.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return Configuration.getNotation(new BigDecimal(value));
    }

    @Override
    public boolean isZero() {
        return this.value.equals(BigInteger.ZERO);
    }

    @Override
    public int getSign() {
        return value.signum();
    }

    /**
     * Checks if the value held can be stored inside a regular int value.
     * 
     * @return true if the value is between {@code Integer.MIN_VALUE} and
     *         {@code Integer.MAX_VALUE}. false otherwise.
     */
    public boolean isInt() {
        return value.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0
                && value.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0;
    }
}
