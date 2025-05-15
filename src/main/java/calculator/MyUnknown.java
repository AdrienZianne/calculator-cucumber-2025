package calculator;


import calculator.operation.BuildBinaryOperationFunction;
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

    private MyUnknown(HashMap<MyNumber, MyNumber> operands, MyNumber rest) {
        this.operands = operands;
        this.rest = rest;
    }

    /**
     * A constructor for the {@link MyUnknown} class. Used to represent an instance of the following formula : {@code a_0x^{n_0} + ... + a_i x^{n_i} + rest}.
     * @param operands The map of values representing : {@code {(n_0 : a_0), ..., (n_i : a_i)}}.
     *                 Note that for each pair, the key represents {@code n} and the value {@code a}.
     *                 <p>If one of the {@code n_i} is equal to zero, then the value of {@code a_i} will be added to the {@code rest}.</p>
     * @param rest The value of {@code rest}.
     * @return
     * <p>
     * <ul>
     *     <li>{@code rest} if all {@code a_i} (or all {@code n_i}) are equivalent to zero.</li>
     *     <li>
     *         an instance of the {@link MyUndefinedNumber} class if any of the parameters is also undefined
     *          (it return the undefined parameter)
     *      </li>
     *     <li> an instance of a {@link MyErrorNumber} if provided with :
     *          <ul>
     *              <li>A {@code null} argument</li>
     *              <li>Another instance of the {@link MyErrorNumber} class (in this case it simply returns the given error).</li>
     *              <li>Another instance of the {@link MyUnknown} class.</li>
     *          </ul>
     *     </li>
     *     <li>an instance of the {@link MyUnknown} class of the form : {@code ax^n + b}.</li>
     * </ul>
     */
    public static MyNumber create(Map<MyNumber, MyNumber> operands, MyNumber rest) {
        ArrayList<Pair<MyNumber, MyNumber>> operandList = new ArrayList<>();

        for (Map.Entry<MyNumber, MyNumber> entry : operands.entrySet()) {
            operandList.add(new Pair<>(entry.getValue(), entry.getKey()));
        }
        // We do this in order to check that everything is correct
        return create(operandList, rest);
    }

    /**
     * A constructor for the {@link MyUnknown} class. Used to represent an instance of the following formula : {@code a_0x^{n_0} + ... + a_i x^{n_i} + rest}.
     * @param operands The list of values representing : {@code [(a_0,n_0), ..., (a_i,n_i)]}. Note that for each pair, the first value represent {@code a} and the second {@code n}.
     *                 <p>If one of the {@code n_i} is equal to zero, then the value of {@code a_i} will be added to the {@code rest}.</p>
     * @param rest The value of {@code rest}.
     * @return
     * <p>
     * <ul>
     *     <li>{@code rest} if all {@code a_i} (or all {@code n_i}) are equivalent to zero.</li>
     *     <li>
     *         an instance of the {@link MyUndefinedNumber} class if any of the parameters is also undefined
     *          (it return the undefined parameter)
     *      </li>
     *     <li> an instance of a {@link MyErrorNumber} if provided with :
     *          <ul>
     *              <li>A {@code null} argument</li>
     *              <li>Another instance of the {@link MyErrorNumber} class (in this case it simply returns the given error).</li>
     *              <li>Another instance of the {@link MyUnknown} class.</li>
     *          </ul>
     *     </li>
     *     <li>an instance of the {@link MyUnknown} class of the form : {@code ax^n + b}.</li>
     * </ul>
     */
    public static MyNumber create(List<Pair<MyNumber, MyNumber>> operands, MyNumber rest) {
        if (rest == null || operands == null || operands.isEmpty()) {
            return new MyErrorNumber(null, "Tried to create an unknown number null parameter or emptys list");
        }
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
            if (operand.b.isZero()) totalRest = BinaryOperation.op(totalRest, operand.a, Plus::new);
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
     * @param n The value of {@code n}.
     * @param b The value of {@code b}.
     * @return
     * <p>
     * <ul>
     *     <li>{@code b} if {@code a} is equivalent to zero.</li>
     *     <li>{@code a+b} if {@code n} is equivalent to zero.</li>
     *     <li>
     *         an instance of the {@link MyUndefinedNumber} class if any of the parameters is also undefined
     *          (it return the undefined parameter)
     *      </li>
     *     <li> an instance of a {@link MyErrorNumber} if provided with :
     *          <ul>
     *              <li>A {@code null} argument</li>
     *              <li>Another instance of the {@link MyErrorNumber} class (in this case it simply returns the given error).</li>
     *              <li>Another instance of the {@link MyUnknown} class.</li>
     *          </ul>
     *     </li>
     *     <li>an instance of the {@link MyUnknown} class of the form : {@code ax^n + b}.</li>
     * </ul>
     */
    public static MyNumber create(MyNumber a, MyNumber n, MyNumber b) {
        return create(List.of(new Pair<>(a, n)), b);
    }

    /**
     * A constructor for the {@link MyUnknown} class. Used to represent an instance of the following formula : {@code ax + b}
     * @param a The value of {@code a}.
     * @param b The value of {@code b}.
     * @return
     * <p>
     * <ul>
     *     <li>{@code b} if {@code a} is equivalent to zero.</li>
     *     <li>
     *         an instance of the {@link MyUndefinedNumber} class if any of the parameters is also undefined
     *          (it return the undefined parameter)
     *      </li>
     *     <li> an instance of a {@link MyErrorNumber} if provided with :
     *     <ul>
     *         <li>A {@code null} argument</li>
     *         <li>Another instance of the {@link MyErrorNumber} class (in this case it simply returns the given error).</li>
     *         <li>Another instance of the {@link MyUnknown} class.</li>
     *     </ul>
     *     </li>
     *     <li>an instance of the {@link MyUnknown} class of the form : {@code ax + b}.</li>
     * </ul>
    */
    public static MyNumber create(MyNumber a, MyNumber b) {
        return create(List.of(new Pair<>(a, ConstantNumber.ONE)), b);
    }



    @Override
    public Object getObjectValue() {
        return operands;
    }

    @Override
    public boolean isZero() {
        return false;
    }

    @Override
    public int getSign() {
        return 1;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        for (MyNumber exp : operands.keySet()) {
            res.append(termAsString(operands.get(exp), exp));
            res.append(" ");
        }

        return res + (rest.isZero() ? "" : termAsString(rest, false)) ;
    }

    private String termAsString(MyNumber factor, boolean hideOne) {
        String res = "+";
        if (factor.getSign() < 0) {
            res = "-";
            factor = UnaryOperation.op(factor, Negation::new);
        }
        String middlePart =  (hideOne && factor.equals(ConstantNumber.ONE) ? "" : factor.toString());
        if (factor instanceof MyComplex)
            return "(" + res + " " + middlePart + ")";
        else
            return res + " " + middlePart;
    }

    private String termAsString(MyNumber factor, MyNumber exp) {
        String res = termAsString(factor, true) + "x";

        if (!exp.equals(ConstantNumber.ONE)) {
            return res +"^" + exp;
        }
        return res;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operands, rest);
    }

    /**
     * Gets an instance of a {@link Map}, containing multiple pairs of keys and values.
     * <p>
     *     Each of these pairs represents a unique term of the form : {@code a_i x^{n_i}}.
     * </p>
     * <p>
     *      With :
     *      <p>
     *     <ul>
     *         <li>
     *             Each key representing {@code n_i}
     *         </li>
     *         <li>
     *             Each value representing {@code a_i}
     *         </li>
     *     </ul>
     *
     * Please note that the rest of the equation is not part of this instance.
     * @return Each operand, except the rest.
     */
    public Map<MyNumber, MyNumber> getOperands() {
        return operands;
    }

    /**
     * Gets the rest of the expression that has no unknown values.
     * @return The rest of the expression.
     */
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

    /**
     * Applies the given <b>binary</b> operation to each term, including the rest and return the resulting expression.
     * @param l The original expression, which is going to be passed as the first argument to the binary operation.
     * @param val The value that is going to be passed as the second argument to the binary operation.
     * @param fn The constructor of the binary operation.
     * @return The resulting expression.
     * @param <T> The class of the binary operation to execute.
     */
    public static <T extends BinaryOperation> MyNumber applyToAllOperators(MyUnknown l, MyNumber val, BuildBinaryOperationFunction<T> fn)
    {
        HashMap<MyNumber, MyNumber> newOperands = new HashMap<>();
        for (MyNumber key : l.getOperands().keySet())
        {
            newOperands.put(key, BinaryOperation.op(l.getOperands().get(key), val, fn));
        }

        return MyUnknown.create(newOperands, BinaryOperation.op(l.getRest(), val, fn));
    }

    /**
     * Applies the given <b>unary</b> operation to each term, including the rest and return the resulting expression.
     * @param l The original expression, which is going to be passed as the argument to the unary operation.
     * @param fn The constructor of the unary operation.
     * @return The resulting expression
     * @param <T> The class of the unary operation to execute.
     */
    public static <T extends UnaryOperation> MyNumber applyToAllOperators(MyUnknown l, BuildUnaryOperationFunction<T> fn)
    {
        HashMap<MyNumber, MyNumber> newOperands = new HashMap<>();
        for (MyNumber key : l.getOperands().keySet())
        {
            newOperands.put(key, UnaryOperation.op(l.getOperands().get(key), fn));
        }

        return MyUnknown.create(newOperands, UnaryOperation.op(l.getRest(), fn));
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyUnknown myUnknown = (MyUnknown) o;
        return Objects.equals(operands, myUnknown.operands) && Objects.equals(rest, myUnknown.rest);
    }


    /**
     * Checks if this instance is an expression of the first degree.
     * <p>
     *    i.e. an expression of the form : {@code ax^n + b}.
     * </p>
     * @return true if it's of the first degree, false otherwise.
     */
    public boolean isFirstDegree() {
        for (MyNumber key : operands.keySet()) {
            if (!key.equals(ConstantNumber.ONE)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if this instance is an expression of the second degree.
     * <p>
     *    i.e. an expression of the form : {@code ax^2 + bx^1 + c}. With {@code a} different from zero.
     * </p>
     * @return true if it's of the second degree, false otherwise.
     */
    public boolean isSecondDegree() {
        boolean flag = false;
        for (MyNumber key : operands.keySet()) {
            if (key.equals(MyInteger.valueOf(2)))
                flag = true;
            else if (!key.equals(ConstantNumber.ONE)) {
                return false;
            }
        }
        return flag;
    }
}
