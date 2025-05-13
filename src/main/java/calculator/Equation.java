package calculator;

import calculator.operation.binary.*;
import calculator.operation.unary.Negation;
import calculator.operation.unary.SquareRoot;
import calculator.operation.unary.UnaryOperation;

import java.util.Objects;

public class Equation {
    MyNumber left;

    String errorState;
    MyNumber x1;
    MyNumber x2;

    /**
     * Creates and resolves an equation of the form : {@code left = right}.
     * <p>In practice, equation will be rewritten as : {@code left - right = 0}.</p>
     * <p>Supported expression are :
     * <ul>
     *     <li>Expressions without any unknown terms.</li>
     *     <li>First degree expression.</li>
     *     <li>Second degree expression.</li>
     * </ul>
     * </p>
     * @param left A number or an expression (i.e. an instance of the {@link MyUnknown}).
     * @param right A number or an expression (i.e. an instance of the {@link MyUnknown}).
     */
    public Equation(MyNumber left, MyNumber right) {
        solveEquation(left, right);
    }

    private void solveEquation(MyNumber left, MyNumber right) {
        // Move everything to the left equation in order to get something of the form :
        // ax^n  + cx^{n-1} ... + dx + b = 0
        this.left = BinaryOperation.op(left, right, Minus::new);
        // If there are no unknown values anymore, we can simply check if the resulting value is equal
        // or not to zero.

        if (this.left instanceof MyUnknown l) {
            if (l.isFirstDegree())
            {
                this.x1 = solveFirstDegreeEq(l.getOperands().get(ConstantNumber.ONE), l.getRest());
            }
            else if (l.isSecondDegree()) {
                MyNumber a = l.getOperands().get(MyInteger.valueOf(2));
                MyNumber b = l.getOperands().get(MyInteger.valueOf(1));
                Pair<MyNumber, MyNumber> solutions = solveSecondDegree(a, Objects.requireNonNullElse(b, ConstantNumber.ZERO), l.getRest());
                if (solutions.a == null && solutions.b == null) {
                    return;
                }
                if (solutions.a == null) {
                    this.x1 = solutions.b;
                }
                else if (solutions.b == null) {
                    this.x1 = solutions.a;

                }
                else {
                    this.x1 = solutions.a;
                    this.x2 = solutions.b;
                }
            }
            else {
                this.errorState = "Equations with a degree superior to 2 are not supported";
            }
        }
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
    public String toString() {
        return left + " = " + 0;
    }

    public String printResults() {
        if (errorState != null) return errorState;

        if (x1 == null && x2 == null) return  Boolean.toString(left.equals(ConstantNumber.ZERO));

        if (x2 == null) return "x: " + x1;

        return "x1: " + x1 + " | x2: " + x2;
    }
}
