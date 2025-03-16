package calculator;

import visitor.Visitor;

public class MyInteger extends MyNumber
{
    private final int value;

    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    public MyInteger(int v) {
        this.value = v;
    }

    /**
     * accept method to implement the visitor design pattern to traverse arithmetic expressions.
     * Each number will pass itself to the visitor object to get processed by the visitor.
     *
     * @param v	The visitor object
     */
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public Object getObjectValue() {
        return value;
    }

    public int getValue()
    {
        return value;
    }
}
