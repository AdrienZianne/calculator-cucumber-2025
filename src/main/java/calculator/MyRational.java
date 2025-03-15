package calculator;

import visitor.Visitor;

public class MyRational extends MyNumber {

    Pair<MyInteger, MyInteger> numDenumPair;

    public MyRational(MyInteger num, MyInteger denum) { this.numDenumPair = new Pair<>(num, denum); }

    @Override
    public Object getObjectValue() {
        return getNumDenumPair();
    }

    public Pair<MyInteger, MyInteger> getNumDenumPair() { return numDenumPair; }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
