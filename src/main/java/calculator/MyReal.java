package calculator;

import visitor.Visitor;

import java.math.BigDecimal;

public class MyReal extends MyNumber {
    private final BigDecimal value;

    public MyReal(double value) {
        this.value = BigDecimal.valueOf(value);
    }
    public MyReal(String value) {
        this.value = new BigDecimal(value);
    }
    public MyReal(BigDecimal value) {
        this.value = value;
    }

    @Override
    public Object getObjectValue() {
        return getValue();
    }

    public BigDecimal getValue() { return value; }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
