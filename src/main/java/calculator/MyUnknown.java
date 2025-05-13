package calculator;


import calculator.operation.BuildOperationFunction;
import calculator.operation.BuildUnaryOperationFunction;
import calculator.operation.binary.*;
import calculator.operation.unary.Negation;
import calculator.operation.unary.SquareRoot;
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
    public static MyNumber create(MyNumber a, MyNumber n, MyNumber b) {
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
        return create(List.of(new Pair<>(a, ConstantNumber.ONE)), b);
    }



    @Override
    public Object getObjectValue() {
        return null;
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
        return res + " " + (hideOne && factor.equals(ConstantNumber.ONE) ? "" : factor.toString());
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
     *     <ul>
     *         <li>
     *             Each key representing {@code n_i}
     *         </li>
     *         <li>
     *             Each value representing {@code a_i}
     *         </li>
     *     </ul>
     * </p>
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
    public static <T extends BinaryOperation> MyNumber applyToAllOperators(MyUnknown l, MyNumber val, BuildOperationFunction<T> fn)
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


    public static String solveEquation(MyNumber left, MyNumber right) {
        // Move everything to the left equation in order to get something of the form :
        // ax^n  + cx^{n-1} ... + dx + b = 0
        left = BinaryOperation.op(left, right, Minus::new);
        // If there are no unknown values anymore, we can simply check if the resulting value is equal
        // or not to zero.

        if (left instanceof MyUnknown l) {
            if (l.isFirstDegree())
                return "x =" + solveFirstDegreeEq(l.getOperands().get(ConstantNumber.ONE), l.getRest()).toString();
            if (l.isSecondDegree()) {
                MyNumber a = l.getOperands().get(MyInteger.valueOf(2));
                MyNumber b = l.getOperands().get(MyInteger.valueOf(1));
                Pair<MyNumber, MyNumber> solutions = solveSecondDegree(a, Objects.requireNonNullElse(b, ConstantNumber.ZERO), l.getRest());
                if (solutions.a == null && solutions.b == null) {
                    return "No solutions in the real domain";
                }
                if (solutions.a == null) {
                    return "x = " + solutions.b;
                }
                if (solutions.b == null) {
                    return "x = " + solutions.a;
                }
                return "x_1 = " + solutions.a + " | x_2 =" + solutions.b;
            }
            return "Equation with a degree superior to 2 are not supported";
        }
        else
            return Boolean.toString(left.equals(ConstantNumber.ZERO));
    }


    private static MyNumber solveFirstDegreeEq(MyNumber a, MyNumber b) {
        // ax + b = 0
        // x = - b/a
        return BinaryOperation.op(
                UnaryOperation.op(b, Negation::new),
                a,
                Divides::new);
    }


    private static Pair<MyNumber, MyNumber> solveSecondDegree(MyNumber a, MyNumber b, MyNumber c) {
        // ax^2 + bx + c = 0
        // delta = b^2 - 4 ac
        MyNumber bSquared = BinaryOperation.op(b, MyInteger.valueOf(2), Exponent::new);
        MyNumber aTimesC = BinaryOperation.op(a, c, Times::new);
        MyNumber fourATimesC = BinaryOperation.op(MyInteger.valueOf(4), aTimesC, Times::new);

        MyNumber delta = BinaryOperation.op(bSquared, fourATimesC, Minus::new);

        if (delta.getSign() < 0 && !Configuration.usesComplexDomainDefault())
            return new Pair<>(null, null);


        // solution : x_1 = (-bx + c) / a^2

        // x_ 1  = (-b + sqrt(delta)) / 2a
        MyNumber negativeB = UnaryOperation.op(b,Negation::new);
        MyNumber sqrtDelta = UnaryOperation.op(delta, SquareRoot::new);
        MyNumber twoA = BinaryOperation.op(MyInteger.valueOf(2), a, Times::new);
        MyNumber x1 = BinaryOperation.op(
                BinaryOperation.op(negativeB,
                        sqrtDelta,
                        Plus::new),
                twoA,
                Divides::new);
        if (!delta.isZero()) {
            MyNumber x2 = BinaryOperation.op(
                    BinaryOperation.op(negativeB,
                            sqrtDelta,
                            Minus::new),
                    twoA,
                    Divides::new);

            return new Pair<>(x1, x2);
        } else {
            return new Pair<>(x1, null);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyUnknown myUnknown = (MyUnknown) o;
        return Objects.equals(operands, myUnknown.operands) && Objects.equals(rest, myUnknown.rest);
    }


    public boolean isFirstDegree() {
        for (MyNumber key : operands.keySet()) {
            if (!key.equals(ConstantNumber.ONE)) {
                return false;
            }
        }
        return true;
    }

    public boolean isSecondDegree() {
        for (MyNumber key : operands.keySet()) {
            if (!(key.equals(ConstantNumber.ONE) || key.equals(MyInteger.valueOf(2)))) {
                return false;
            }
        }
        return true;
    }
}
