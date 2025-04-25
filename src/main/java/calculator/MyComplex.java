package calculator;

import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Minus;
import calculator.operation.binary.Plus;
import calculator.operation.unary.Negation;
import calculator.operation.unary.UnaryOperation;

import java.util.Objects;

public class MyComplex extends MyNumber {

    Pair<MyNumber, MyNumber> realImaginaryPair;

    private MyComplex(MyNumber n1, MyNumber n2) {
        this.realImaginaryPair = new Pair<>(n1, n2);
    }


    /**
     * Shortcut function for the {@link #create(MyNumber, MyNumber)} method.
     * @param n1 The first argument to turn into a {@link MyInteger}.
     * @param n2 The second argument to turn into a {@link MyInteger}.
     * @return The result of the function with the two {@link MyInteger} instance.
     */
    public static MyNumber create(int n1, int n2) {return create(MyInteger.valueOf(n1), MyInteger.valueOf(n2));}
    /**
     * Create a complex number of the form : {@code (n1) + (n2)i}. <p></p>
     * And simplifies it if possible.
     * @param n1 An instance of the {@link MyNumber} class.
     * @param n2 An instance of the {@link MyNumber} class.
     * @return The class of the returned instance heavily depends on the provided arguments :
     * <ul>
     *   <li>An instance of the {@link MyErrorNumber} class if either {@code n1} and {@code n2} is also an instance of this class.</li>
     *   <li>Returns {@code n1} if {@code n2} is evaluated as zero.</li>
     *   <li>An instance of the {@link MyComplex} class otherwise. </li>
     * </ul>
     */
    public static MyNumber create(MyNumber n1, MyNumber n2)
    {
        // Checks that the user didn't try to create a complex value using an error
        if (n1 instanceof MyErrorNumber e) return e;
        if (n2 instanceof MyErrorNumber e) return e;
        if (n1 instanceof MyComplex c1)
        {
            // (a+bi) + (c + di) * i =  = (a+bi) + (-d + ci)
            if (n2 instanceof MyComplex c2)
            {
                // Second complex : -d + ci
                MyNumber c3 = MyComplex.create(UnaryOperation.op(c2.realImaginaryPair.b, Negation::new),
                                                c2.realImaginaryPair.a);
                return BinaryOperation.op(c1, c3, Plus::new);

            }
            // (a+bi) + ci  = a + (c + d) i
            return MyComplex.create(c1.realImaginaryPair.a,
                                 BinaryOperation.op(n2,
                                                    c1.realImaginaryPair.b,
                                                    Plus::new));
        }
        // a + (b + ci) * i =  (a-c) + bi
        if (n2 instanceof MyComplex c1)
        {
            return MyComplex.create(BinaryOperation.op(n1, c1.realImaginaryPair.b, Minus::new),
                                                        c1.realImaginaryPair.a);
        }
        return new MyComplex(n1, n2).simplify();
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
     * @return The {@link MyNumber} given for the real part if the imaginary part is equal to zero.
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

    @Override
    public int getSign() {
        return 0; // TODO: will need to add this after adding the absolute unary operator !
    }
}