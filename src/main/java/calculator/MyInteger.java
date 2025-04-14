package calculator;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;

public class MyInteger extends MyNumber
{
    private final BigInteger value;

    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    public MyInteger(int v) {
        this.value = BigInteger.valueOf(v);
    }

    public MyInteger(BigInteger v) {
        this.value = v;
    }

    public static MyInteger valueOf(BigInteger v) {return new MyInteger(v);}
    public static MyInteger valueOf(Integer v) {return new MyInteger(v);}

    @Override
    public Object getObjectValue() {
        return getValue();
    }

    public BigInteger getValue()
    {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return value.equals(myInteger.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        // Change this with settings !!!!
        if (true)
        {
            return value.toString();
        }
        NumberFormat scf = new DecimalFormat("0.######E0");
        return scf.format(value);
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
     * @return true if the value is between {@code Integer.MIN_VALUE} and {@code Integer.MAX_VALUE}. false otherwise.
     */
    public boolean isInt() {
        return value.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0
                && value.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0;
    }
}
