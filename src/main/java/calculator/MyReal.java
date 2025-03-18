package calculator;

import visitor.Visitor;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    public BigDecimal getValue() { return value; }
}
