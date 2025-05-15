package calculator;

import calculator.Programmer.ProgrammerException;

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
     * This constructor should never be used as this class is a utility class.
     */
    private ProgrammerOperation() {
        throw new IllegalStateException("Utility class");
    }

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
    private static Programmer applyLogicOperation(Programmer l, Programmer r, LogicOperation operation)
            throws ProgrammerException {
        StringBuilder newValue = new StringBuilder();
        for (int i = Math.max(l.length(), r.length()) - 1; i >= 0; i--) {
            if (operation.apply(l.logicValue(i), r.logicValue(i))) {
                newValue.append("1");
            } else {
                newValue.append("0");
            }
        }
        return (new Programmer(newValue.toString(), 2)).newBase(Math.max(l.base, r.base));
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
    public static Programmer and(Programmer l, Programmer r) throws ProgrammerException {
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
    public static Programmer or(Programmer l, Programmer r) throws ProgrammerException {
        return applyLogicOperation(l, r, (left, right) -> left || right);
    }

    /**
     * Method used to create a new value from the logical XOR operation between two
     * values.
     * 
     * @param l A value.
     * @param r A value.
     * @return The value resulting from the operation on the two values passed in
     *         parameter.
     */
    public static Programmer xor(Programmer l, Programmer r) throws ProgrammerException {
        return applyLogicOperation(l, r, (left, right) -> (left && !right) || (!left && right));
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
    public static Programmer nand(Programmer l, Programmer r) throws ProgrammerException {
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
    public static Programmer nor(Programmer l, Programmer r) throws ProgrammerException {
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
    public static Programmer implication(Programmer l, Programmer r) throws ProgrammerException {
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
    public static Programmer equivalence(Programmer l, Programmer r) throws ProgrammerException {
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
    public static Programmer shiftLeft(Programmer n, int shift) throws ProgrammerException {
        return ProgrammerOperation
                .trunk(new Programmer(n.binaryNum + String.join("", Collections.nCopies(shift, "0")), 2),
                        n.length())
                .newBase(n.base);
    }

    /**
     * Method used to create a new value by shifting the value passed in parameter
     * to the right.
     * 
     * @param n     The value on which to operate.
     * @param shift The offset to be performed.
     * @return A new value.
     */
    public static Programmer shiftRight(Programmer n, int shift) throws ProgrammerException {
        int length = n.length();
        String res = String.join("", Collections.nCopies(shift, "0")) + n.binaryNum;
        return new Programmer(res.substring(0, length), 2)
                .newBase(n.base);
    }

    /**
     * Create a value from not by inverting each of the values, 0->1 and 1->0.
     * 
     * @return The not of value.
     */
    public static Programmer not(Programmer n) throws ProgrammerException {
        StringBuilder newValue = new StringBuilder();
        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.logicValue(i)) {
                newValue.append("0");
            } else {
                newValue.append("1");
            }
        }

        return new Programmer(newValue.toString(), 2)
                .newBase(n.base);
    }

    /**
     * Method for creating a value from the current value by cutting off the
     * beginning of a certain size.
     * 
     * @param size The size of the remaining value. If the size is negative, the
     *             same number is returned.
     * @return The truncated value
     */
    public static Programmer trunk(Programmer n, int size) throws ProgrammerException {
        Programmer res = null;
        if (size >= n.length()) {
            res = new Programmer("", 2);
        } else if (size <= 0) {
            res = new Programmer(n.binaryNum, 2);
        } else {

            res = new Programmer(n.binaryNum.substring(n.length() - size), 2);
        }
        return res
                .newBase(n.base);
    }
}
