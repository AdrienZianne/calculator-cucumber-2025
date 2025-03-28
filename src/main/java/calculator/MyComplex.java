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

    /**
     * Simplifies the given {@link MyComplex} instance to another number if possible.
     * @return An {@link MyInteger} with the value of the real part if the imaginary part is equal to zero.
     * Or an {@link MyInteger} with the value of zero if both the real part and the imaginary part are both equal to zero.
     * Or simply gives back this instance if no simplification was possible. 
     */
    public MyNumber simplify()
    {
        if (this.isZero()) {
            return MyInteger.valueOf(0);
        }
        if (this.realImaginaryPair.b.isZero()) {
            return realImaginaryPair.a;
        }
        return this;
    }

    @Override
    public String toString() {
        // important to let this display for debug reason since without it there would be no way to differentiate 
        // between complex value printed and non complex values.
        
        return (this.realImaginaryPair.a.isZero() ? "" : this.realImaginaryPair.a.toString() + " + ") + this.realImaginaryPair.b + " i";
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

    @Override
    public boolean isZero() {
        return this.realImaginaryPair.a.isZero() && this.realImaginaryPair.b.isZero();
    }
}