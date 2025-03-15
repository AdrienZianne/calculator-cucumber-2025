package calculator;

import visitor.Visitor;

public class MyReal extends MyNumber {
    private double value;

    public MyReal(double value) { this.value = value; }

    @Override
    public Object getObjectValue() {
        return getValue();
    }

    public double getValue() { return value; }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
