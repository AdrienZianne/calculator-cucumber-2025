package calculator;

import java.util.Objects;

public class MyComplex extends MyNumber {

    Pair<MyNumber, MyNumber> realImaginaryPair;

    public MyComplex(MyNumber n1, MyNumber n2) {
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


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex that = (MyComplex) o;
        return Objects.equals(realImaginaryPair, that.realImaginaryPair);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(realImaginaryPair);
    }
}