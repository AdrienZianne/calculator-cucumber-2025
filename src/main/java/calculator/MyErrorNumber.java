package calculator;

import calculator.operation.Operation;

/**
 * Represents the error state of a number or an operation.
 */
public class MyErrorNumber extends MyNumber{
    Operation operation;
    String message;

    /**
     * The default constructor of the {@link MyErrorNumber} class.
     * @param message The message to display to the user in order to explain what caused the creation of this instance.
     */
    public MyErrorNumber(Operation operation, String message){
        this.operation = operation;
        this.message = message;
    }

    /**
     * Gets the message to display to the user in order to explain what caused the creation of this instance.
     * @return the message of the error.
     */
    public String getMessage() {
        return message;
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
        return 0;
    }

    @Override
    public String toString() {
        return "<error | " + "op : "+ operation + " | context : " + message + ">";
    }
}
