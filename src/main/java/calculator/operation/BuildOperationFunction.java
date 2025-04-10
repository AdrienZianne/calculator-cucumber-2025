package calculator.operation;

import calculator.Expression;
import calculator.IllegalConstruction;

import java.util.ArrayList;

/**
 * An interface designed to make it easy to pass an operation as the result of a lambda function.
 * @param <O> A class extending an operation
 */
@FunctionalInterface
public interface BuildOperationFunction<O extends Operation> {
    /**
     * Creates an operation
     * @return The created operation
     * @throws IllegalConstruction If the operation causes an exception during it's creation
     */
    O build(ArrayList<Expression> expressions) throws IllegalConstruction;
}
