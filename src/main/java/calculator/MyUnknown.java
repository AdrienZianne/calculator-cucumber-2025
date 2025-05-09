package calculator;


import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Plus;
import calculator.operation.unary.Negation;
import calculator.operation.unary.UnaryOperation;

import java.util.Objects;

/**
 * Represents the term {@code ax^n + b} where {@code x} is an unknown value,
 * {@code n} the exponentiation of {@code x},
 * while {@code a} and {@code b} represent numbers.
 */
public final class MyUnknown extends MyNumber {
    private final MyNumber exponent;
    private final MyNumber a;
    private final MyNumber b;

    private MyUnknown(MyNumber a, MyNumber b, MyNumber exponent) {
        this.exponent = exponent;
        this.a = a;
        this.b = b;
    }


    /**
     * A constructor for the {@link MyUnknown} class.
     * @param a The value of {@code a}.
     * @param b The value of {@code b}.
     * @param n The value of {@code n}.
     * @return
     * <ul>
     *     <li>{@code b} if {@code a} is equivalent to zero.</li>
     *     <li>{@code a+b} if {@code n} is equivalent to zero.</li>
     *     <li>
     *         an instance of the {@link MyUndefinedNumber} class if any of the parameters is also undefined
     *          (it return the undefined parameter)
     *      </li>
     *     <li> an instance of a {@link MyErrorNumber} if provided with :</li>
     *     <ul>
     *         <li>A {@code null} argument</li>
     *         <li>Another instance of the {@link MyErrorNumber} class (in this case it simply returns the given error).</li>
     *         <li>Another instance of the {@link MyUnknown} class.</li>
     *     </ul>
     *     <li>an instance of the {@link MyUnknown} class of the form : {@code ax^n + b}.</li>
     * </ul>
     */
    public static MyNumber create(MyNumber a, MyNumber b, MyNumber n) {
        if (a == null || b == null || n == null) { return new MyErrorNumber(null, "Tried to create an unknown" +
                " number using a null argument"); }
        if (a.isZero())
            return b;
        if (n.isZero())
            return BinaryOperation.op(a, b, Plus::new);

        if (a instanceof MyErrorNumber ea)
            return ea;
        if (b instanceof MyErrorNumber eb)
            return eb;
        if (n instanceof MyErrorNumber nb)
            return nb;

        if (a instanceof MyUndefinedNumber ea)
            return ea;
        if (b instanceof MyUndefinedNumber eb)
            return eb;
        if (n instanceof MyUndefinedNumber nb)
            return nb;


        if (a instanceof MyUnknown aU)
            return new MyErrorNumber(null, "Tried to pass another unknown number as argument to create another unknown number: " + aU);

        if (b instanceof MyUnknown bU)
            return new MyErrorNumber(null, "Tried to pass another unknown number as argument to create another unknown number: " + bU);

        return new MyUnknown(a, b, n);
    }

    /**
     * A constructor for the {@link MyUnknown} class.
     * @param a The value of {@code a}.
     * @param b The value of {@code b}.
     * @return
     * <ul>
     *     <li>{@code b} if {@code a} is equivalent to zero.</li>
     *     <li>
     *         an instance of the {@link MyUndefinedNumber} class if any of the parameters is also undefined
     *          (it return the undefined parameter)
     *      </li>
     *     <li> an instance of a {@link MyErrorNumber} if provided with :</li>
     *     <ul>
     *         <li>A {@code null} argument</li>
     *         <li>Another instance of the {@link MyErrorNumber} class (in this case it simply returns the given error).</li>
     *         <li>Another instance of the {@link MyUnknown} class.</li>
     *     </ul>
     *     <li>an instance of the {@link MyUnknown} class of the form : {@code ax^1 + b}.</li>
     * </ul>
    */
    public static MyNumber create(MyNumber a, MyNumber b) {
        return new MyUnknown(a, b, ConstantNumber.ONE);
    }



    @Override
    public Object getObjectValue() {
        return new Pair<>(a, b);
    }

    @Override
    public boolean isZero() {
        return a.isZero() && b.isZero();
    }

    @Override
    public int getSign() {
        // (2x + 3) is *positive*
        // (2x - 3) is *positive*
        // (-2x + 3) is *positive*
        // (-2x - 3) = - (2x + 3) is *negative*
        return (a.getSign() < 0 && b.getSign() < 0) ? -1 : 1;
    }

    @Override
    public String toString() {
        char opSymbol = '+';
        MyNumber notUnknownPart = b;
        if (notUnknownPart.getSign() < 0) {
            opSymbol = '-';
            notUnknownPart = UnaryOperation.op(notUnknownPart, Negation::new);
        }
        String notUnknownString;
        if (notUnknownPart.equals(ConstantNumber.ZERO)){
            notUnknownString = "";
        }else {
            notUnknownString = notUnknownPart.toString();
        }

        return a.toString() + 'x' + (exponent.equals(ConstantNumber.ONE) ? "" : "^" + exponent)
                + (!b.isZero() ?
                    " " + opSymbol + " " + notUnknownString : "");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyUnknown myUnknown = (MyUnknown) o;
        return Objects.equals(exponent, myUnknown.exponent) && Objects.equals(a, myUnknown.a) && Objects.equals(b, myUnknown.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exponent, a, b);
    }

    public MyNumber getA() {
        return a;
    }

    public MyNumber getB() {
        return b;
    }
}
