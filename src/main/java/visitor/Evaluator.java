package visitor;

import calculator.*;
import calculator.operation.Operation;
import calculator.operation.UnaryOperation;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

/** Evaluation is a concrete visitor that serves to
 * compute and evaluate the results of arithmetic expressions.
 */
public class Evaluator extends Visitor {

    /**
     * Default constructor of the class. Does not initialise anything.
     */
    public Evaluator() {}

    /** The result of the evaluation will be stored in this private variable */
    private MyNumber computedValue;

    /** getter method to obtain the result of the evaluation
     *
     * @return an Integer object containing the result of the evaluation
     */
    public MyNumber getResult() { return computedValue; }

    /** Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    public void visit(MyNumber n) {
        computedValue = n;
    }

    /** Use the visitor design pattern to visit an operation
     *
     * @param o The operation being visited
     */
    @Override
    public void visit(Operation o) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        ArrayList<MyNumber> evaluatedArgs = new ArrayList<>();
        //first loop to recursively evaluate each subexpression
        for(Expression a:o.getArgs()) {
            a.accept(this);
            evaluatedArgs.add(computedValue);
        }
        //second loop to accumulate all the evaluated subresults
        switch (o)
        {
            // store the accumulated result
            case UnaryOperation u -> computedValue = computeOperation(u, evaluatedArgs);
            case BinaryOperation b -> computedValue = computeOperation(b, evaluatedArgs);
            default -> throw new IllegalStateException("Unexpected value: " + o);
        }
    }


    private MyNumber computeOperation(UnaryOperation op, ArrayList<MyNumber> evaluatedArgs) throws IllegalConstruction {
        // Checks if there is really one argument
        if (evaluatedArgs.size() != 1)
        {
            throw new IllegalStateException("There should be exactly one argument ("
                                        + evaluatedArgs +  ") to an unary operator : " + op );
        }
        return op.op(evaluatedArgs.getFirst());
    }
    private MyNumber computeOperation(BinaryOperation op, ArrayList<MyNumber> evaluatedArgs) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        MyNumber temp = evaluatedArgs.getFirst();
        for(int counter=1; counter<evaluatedArgs.size(); counter++) {
            temp = op.op(temp,evaluatedArgs.get(counter));
        }
        return temp;
    }

}
