package calculator;

import visitor.Visitor;

public class ComplexNumber extends MyNumber {

    Pair<MyNumber, MyNumber> realImaginaryPair;

    public ComplexNumber(MyNumber n1, MyNumber n2) {
        this.realImaginaryPair = new Pair<>(n1, n2);
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
        return getRealImaginaryPair();
    }

    public Pair<MyNumber, MyNumber> getRealImaginaryPair()
    {
        return realImaginaryPair;
    }

    @Override
    public String toString() {
        return this.realImaginaryPair.a + " + " + this.realImaginaryPair.b + "i";
    }
}