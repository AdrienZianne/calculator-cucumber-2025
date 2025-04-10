package calculator.operation;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.operation.unary.UnaryOperation;


/**
 * An interface designed to make it easy to pass a unary operation as the result of a lambda function.
 * @param <O> A class extending an {@link UnaryOperation}.
 */
@FunctionalInterface
public interface BuildUnaryOperationFunction<O extends UnaryOperation> {
    /**
     * Creates an operation
     * @return The created operation
     * @throws IllegalConstruction If the operation causes an exception during it's creation
     */
    O build(Expression expression) throws IllegalConstruction;
}

