package calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
        return value.toString();
    }

    @Override
    public boolean isZero() {
        return this.value.equals(BigDecimal.ZERO.setScale(PRECISION, ROUNDING_MODE));
    }
}
