package calculator;

import visitor.Visitor;

public class MyComplexNumber extends MyNumber {

    Pair<MyNumber, MyNumber> realImaginaryPair;

    public MyComplexNumber(MyNumber n1, MyNumber n2) {
        this.realImaginaryPair = new Pair<>(n1, n2);
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