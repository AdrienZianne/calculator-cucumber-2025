package calculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;

public class MyReal extends MyNumber {

    public static int PRECISION = 5;
    public static RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;

    private final BigDecimal value;

    public MyReal(double value) {
        this.value = BigDecimal.valueOf(value).setScale(PRECISION, ROUNDING_MODE);
    }

    public MyReal(String value) {
        this.value = new BigDecimal(value).setScale(PRECISION, ROUNDING_MODE);
    }

    public static MyReal valueOf(double value) {
        return new MyReal(value);
    }
    public static MyReal toReal(MyRational r) {
        BigDecimal enumerator = new BigDecimal(r.getNumDenomPair().a.getValue());
        BigDecimal denom = new BigDecimal(r.getNumDenomPair().b.getValue());
        return new MyReal(enumerator.divide(denom, PRECISION, ROUNDING_MODE));
    }

    public static MyReal toReal(MyInteger i){
        return new MyReal(new BigDecimal(i.getValue()));
    }

    public MyReal(BigDecimal value) {
        this.value = value.setScale(PRECISION, ROUNDING_MODE);
    }

    @Override
    public Object getObjectValue() {
        return getValue();
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        MyReal myReal = (MyReal) o;
        return Objects.equals(value, myReal.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        // Change this with settings !
        if (true)
        {
            return value.toString();
        }
        NumberFormat scF = new DecimalFormat("0.###E0");
        return scF.format(value);
    }

    @Override
    public boolean isZero() {
        return this.value.equals(BigDecimal.ZERO.setScale(PRECISION, ROUNDING_MODE));
    }

    @Override
    public int getSign() {
        return value.signum();
    }

    /**
     * Checks if the value held can be stored inside a regular int value.
     * @return true if the two following condition are met :
     *  1. The decimal part displayed is only consisting of zeroes (be careful that this might be because of a low precision).
     *  2. The value is between {@code Integer.MIN_VALUE} and {@code Integer.MAX_VALUE}.
     *  false otherwise.
     */
    public boolean isInt() {
        return  value.stripTrailingZeros().scale() <= 0
                && withinBounds(BigDecimal.valueOf(Integer.MIN_VALUE), BigDecimal.valueOf(Integer.MAX_VALUE));
    }


    /**
     * Checks if the value held can be stored inside a regular long value.
     * @return true if the two following condition are met :
     *  1. The decimal part displayed is only consisting of zeroes (be careful that this might be because of a low precision).
     *  2. The value is between {@code Integer.MIN_VALUE} and {@code Integer.MAX_VALUE}.
     *  false otherwise.
     */
    public boolean isLong() {
        return  value.stripTrailingZeros().scale() <= 0
                && withinBounds(BigDecimal.valueOf(Long.MIN_VALUE), BigDecimal.valueOf(Long.MAX_VALUE));
    }

    /**
     * Checks if the value held can be stored inside a regular double value.
     * @return true if the following condition is met :
     *  * The value is between {@code Double.MIN_VALUE} and {@code Double.MAX_VALUE}.
     *  false otherwise.
     */
    public boolean isDouble() {
        return withinBounds(BigDecimal.valueOf(Double.MIN_VALUE), BigDecimal.valueOf(Double.MAX_VALUE));
    }


    private boolean withinBounds(BigDecimal min, BigDecimal max)
    {
        return value.compareTo(max) <= 0
                && value.compareTo(min) >= 0;
    }
}
