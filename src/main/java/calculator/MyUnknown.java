package calculator;


import calculator.operation.BuildOperationFunction;
import calculator.operation.BuildUnaryOperationFunction;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Plus;
import calculator.operation.unary.Negation;
import calculator.operation.unary.UnaryOperation;

import java.util.*;

/**
 * Represents the expression {@code a_0x^{n_0} + ... + a_i x^{n_i} + b},
 * where {@code x} is an unknown value,
 * while {@code a}, {@code n} and {@code b} represent numbers.
 */
public final class MyUnknown extends MyNumber {
    private final HashMap<MyNumber, MyNumber> operands;

    private final MyNumber rest;

    private MyUnknown(MyNumber a, MyNumber b, MyNumber exponent) {
        this.operands = new HashMap<>();
        operands.put(exponent, a);

        this.rest = b;
    }

    private MyUnknown(HashMap<MyNumber, MyNumber> operands, MyNumber rest) {
        this.operands = operands;
        this.rest = rest;
    }

    public static MyNumber create(Map<MyNumber, MyNumber> operands, MyNumber rest) {
        return new MyUnknown((HashMap<MyNumber, MyNumber>) operands, rest);
    }

    /**
     * A constructor for the {@link MyUnknown} class. Used to represent an instance of the following formula : {@code a_0x^{n_0} + ... + a_i x^{n_i} + rest}.
     * @param operands The list of values representing : {@code [(a_0,n_0), ..., (a_i,n_i)]}. Note that for each pair, the first value represent {@code a} and the second {@code n}.
     *                 <p>If one of the {@code n_i} is equal to zero, then the value of {@code a_i} will be added to the {@code rest}.</p>
     * @param rest The value of {@code rest}.
     * @return
     * <ul>
     *     <li>{@code rest} if all {@code a_i} (or all {@code n_i}) are equivalent to zero.</li>
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
    public static MyNumber create(List<Pair<MyNumber, MyNumber>> operands, MyNumber rest) {

        MyNumber validity = checkOperandValidity(rest);
        if (validity != null) {return validity;}


        HashMap<MyNumber, MyNumber> newOperands = new HashMap<>();

        MyNumber totalRest = ConstantNumber.ZERO;
        MyNumber newVal;


        for (Pair<MyNumber, MyNumber> operand : operands) {

            validity = checkOperandValidity(operand.a);
            if (validity != null) {return validity;}

            validity = checkOperandValidity(operand.b);
            if (validity != null) {return validity;}


            if (operand.a.isZero()) continue;
            // if the exponent is zero then we can add 'a' to the rest.
            if (operand.b.isZero()) totalRest = BinaryOperation.op(totalRest, rest, Plus::new);
            // If the exponent doesn't already exist we add it
            else if (!newOperands.containsKey(operand.b)) {
                newOperands.put(operand.b, operand.a);
            }
            // else if a 'x' with the same exponent was already added we can add them together
            else {
                newVal = BinaryOperation.op(newOperands.get(operand.b), operand.a, Plus::new);
                // If the result is zero, then we can remove it from the operands list
                if (newVal.isZero()) {
                    newOperands.remove(operand.b);
                }else {
                    newOperands.replace(operand.b, newVal);
                }
            }
        }
        totalRest = BinaryOperation.op(totalRest, rest, Plus::new);

        return newOperands.isEmpty() ? totalRest : new MyUnknown(newOperands, totalRest);
    }



    /**
     * A constructor for the {@link MyUnknown} class. Used to represent an instance of the following formula : {@code ax^n + b}.
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
        return create(List.of(new Pair<>(a, n)), b);
    }

    /**
     * A constructor for the {@link MyUnknown} class. Used to represent an instance of the following formula : {@code ax + b}
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
     *     <li>an instance of the {@link MyUnknown} class of the form : {@code ax + b}.</li>
     * </ul>
    */
    public static MyNumber create(MyNumber a, MyNumber b) {
        return new MyUnknown(a, b, ConstantNumber.ONE);
    }



    @Override
    public Object getObjectValue() {
        return null;
    }

    @Override
    public boolean isZero() {
        boolean isZero = true;
        return isZero && rest.isZero();
    }

    @Override
    public int getSign() {
        // (2x + 3) is *positive*
        // (2x - 3) is *positive*
        // (-2x + 3) is *positive*
        // (-2x - 3) = - (2x + 3) is *negative*
        return 1;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        for (MyNumber exp : operands.keySet()) {
            res.append(termAsString(operands.get(exp), exp));
            res.append(" ");
        }

        return res + (rest.isZero() ? "" : termAsString(rest)) ;
    }

    private String termAsString(MyNumber factor) {
        String res = "+";
        if (factor.getSign() < 0) {
            res = "-";
            factor = UnaryOperation.op(factor, Negation::new);
        }
        return res + " " + factor;
    }

    private String termAsString(MyNumber factor, MyNumber exp) {
        String res = termAsString(factor) + "x";

        if (!exp.equals(ConstantNumber.ONE)) {
            return res +"^" + exp;
        }
        return res;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operands, rest);
    }

    public Map<MyNumber, MyNumber> getOperands() {
        return operands;
    }

    public MyNumber getRest() {
        return rest;
    }

    private static MyNumber checkOperandValidity(MyNumber operand) {
        switch (operand) {
            case null -> {
                return new MyErrorNumber(null, "Tried to create an unknown" +
                        " number using a null argument");
            }
            case MyErrorNumber eb -> {
                return eb;
            }
            case MyUndefinedNumber ea -> {
                return ea;
            }
            case MyUnknown _ -> {
                return new MyErrorNumber(null, "Tried to pass another unknown number as argument to create another unknown number");
            }
            default -> {
                return null;
            }
        }
    }

    public static <T extends BinaryOperation> MyNumber applyToAllOperators(MyUnknown l, MyNumber val, BuildOperationFunction<T> fn)
    {
        HashMap<MyNumber, MyNumber> newOperands = new HashMap<>();
        for (MyNumber key : l.getOperands().keySet())
        {
            newOperands.put(key, BinaryOperation.op(l.getOperands().get(key), val, fn));
        }

        return MyUnknown.create(newOperands, BinaryOperation.op(val, l.getRest(), fn));
    }

    public static <T extends UnaryOperation> MyNumber applyToAllOperators(MyUnknown l, BuildUnaryOperationFunction<T> fn)
    {
        HashMap<MyNumber, MyNumber> newOperands = new HashMap<>();
        for (MyNumber key : l.getOperands().keySet())
        {
            newOperands.put(key, UnaryOperation.op(l.getOperands().get(key), fn));
        }

        return MyUnknown.create(newOperands, UnaryOperation.op(l.getRest(), fn));
    }
}
