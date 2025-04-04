package visitor;

import calculator.*;
import calculator.operation.Operation;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

/** Evaluation is a concrete visitor that serves to
 * compute and evaluate the results of arithmetic expressions.
 */
public class Counter extends Visitor {

    /**
     * Default constructor of the class. Does not initialise anything.
     */
    public Counter() {}

    /** The result of the evaluation will be stored in this private variable */
    private int depth;
    private int ops;
    private int nbs;

    /** getter method to obtain the depth of operations
     *
     * @return an Integer object containing the result of the evaluation
     */
    public Integer getDepth() { return depth; }

    /** getter method to obtain the number of operation
     *
     * @return an Integer object containing the result of the evaluation
     */
    public Integer getOps() { return ops; }

    /** getter method to obtain the number of number
     *
     * @return an Integer object containing the result of the evaluation
     */
    public Integer getNbs() { return nbs; }

    /** Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    public void visit(MyNumber n) {
        depth = 0;
        ops = 0;
        nbs = 1;
    }

    @Override
    public void visit(Operation o) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        ArrayList<Integer> argsDepth = new ArrayList<>();
        ArrayList<Integer> argsOps = new ArrayList<>();
        ArrayList<Integer> argsNbs = new ArrayList<>();

        //first loop to recursively evaluate each subexpression
        for(Expression a:o.getArgs()) {
            a.accept(this);
            argsDepth.add(depth);
            argsOps.add(ops);
            argsNbs.add(nbs);
        }

        //second loop to accumulate all the evaluated subresults

        // store the accumulated result
        depth = 1 + argsDepth.stream().max(Integer::compare).get();
        ops = 1 + argsOps.stream().reduce(0, Integer::sum);
        nbs = argsNbs.stream().reduce(0, Integer::sum);
    }


}
