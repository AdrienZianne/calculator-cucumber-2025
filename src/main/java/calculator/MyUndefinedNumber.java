package calculator;


import calculator.operation.Operation;

/**
 * Represents the infinity number. Either positive or negative.
 */
public class MyUndefinedNumber extends MyNumber {
    private final Operation contextOperation;

    public MyUndefinedNumber(Operation contextOperation) {
        this.contextOperation = contextOperation;
    }


    @Override
    public Object getObjectValue() {
        return Double.NaN;
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
        return "NaN {context : " + contextOperation + "}";
    }
}
