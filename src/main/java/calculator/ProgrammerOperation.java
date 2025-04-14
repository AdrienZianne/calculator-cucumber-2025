package calculator;

import java.util.Collections;

/**
 * LogicOperation
 * This functional interface allows you to use lambdas functions.
 */
@FunctionalInterface
interface LogicOperation {
    /**
     * Lambda function that applies a function to the two parameters to obtain a
     * value of truths.
     * 
     * @param l A binary symbol.
     * @param r A binary symbol.
     * @return A truth value.
     */
    boolean apply(boolean l, boolean r);
}

/**
 * ProgrammerOperation
 * A static class for performing logical operations on two numbers.
 * 
 * {@link Programmer}
 */
public class ProgrammerOperation {
    /**
     * Method for applying a logical operation to each of the symbols of the two
     * values.
     * 
     * @param l         A value.
     * @param r         A value.
     * @param operation A lambda operation returning a boolean
     * @return The value resulting from the operation on the two values passed in
     *         parameter.
     */
    private static Programmer applyLogicOperation(Programmer l, Programmer r, LogicOperation operation) {
        String res = "";
        for (int i = 0; i < Math.max(l.length(), r.length()); i++) {
            if (operation.apply(l.logicValue(i), r.logicValue(i))) {
                res += "1";
            } else {
                res += "0";
            }
        }
        return new Programmer(res, 2);
    }

    /**
     * Method used to create a new value from the logical AND operation between two
     * values.
     * 
     * @param l A value.
     * @param r A value.
     * @return The value resulting from the operation on the two values passed in
     *         parameter.
     */
    public static Programmer and(Programmer l, Programmer r) {
        return applyLogicOperation(l, r, (left, right) -> left && right);
    }

    /**
     * Method used to create a new value from the logical OR operation between two
     * values.
     * 
     * @param l A value.
     * @param r A value.
     * @return The value resulting from the operation on the two values passed in
     *         parameter.
     */
    public static Programmer or(Programmer l, Programmer r) {
        return applyLogicOperation(l, r, (left, right) -> left || right);
    }

    /**
     * Method used to create a new value from the logical NAND operation between two
     * values.
     * 
     * @param l A value.
     * @param r A value.
     * @return The value resulting from the operation on the two values passed in
     *         parameter.
     */
    public static Programmer nand(Programmer l, Programmer r) {
        return applyLogicOperation(l, r, (left, right) -> !left || !right);
    }

    /**
     * Method used to create a new value from the logical NOR operation between two
     * values.
     * 
     * @param l A value.
     * @param r A value.
     * @return The value resulting from the operation on the two values passed in
     *         parameter.
     */
    public static Programmer nor(Programmer l, Programmer r) {
        return applyLogicOperation(l, r, (left, right) -> !left && !right);
    }

    /**
     * Method used to create a new value from the logical implication between two
     * values.
     * 
     * @param l A value.
     * @param r A value.
     * @return The value resulting from the operation on the two values passed in
     *         parameter.
     */
    public static Programmer implication(Programmer l, Programmer r) {
        return applyLogicOperation(l, r, (left, right) -> !left || (left && right));
    }

    /**
     * Method used to create a new value from the logical equivalence between two
     * values.
     * 
     * @param l A value.
     * @param r A value.
     * @return The value resulting from the operation on the two values passed in
     *         parameter.
     */
    public static Programmer equivalence(Programmer l, Programmer r) {
        return applyLogicOperation(l, r, (left, right) -> left == right);
    }

    /**
     * Method used to create a new value by shifting the value passed in parameter
     * to the left.
     * 
     * @param n     The value on which to operate.
     * @param shift The offset to be performed.
     * @return A new value.
     */
    public static Programmer shiftLeft(Programmer n, int shift) {
        return new Programmer(n.getNum() + String.join("", Collections.nCopies(shift, "0")), 2).trunk(n.length());
    }

    /**
     * Method used to create a new value by shifting the value passed in parameter
     * to the right.
     * 
     * @param n     The value on which to operate.
     * @param shift The offset to be performed.
     * @return A new value.
     */
    public static Programmer shiftRight(Programmer n, int shift) {
        int length = n.length();
        String res = String.join("", Collections.nCopies(shift, "0")) + n.getNum();
        return new Programmer(res.substring(0, length), 2);
    }
}
