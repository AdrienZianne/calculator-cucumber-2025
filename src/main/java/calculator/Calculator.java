package calculator;

import jdk.jshell.spi.ExecutionControl;
import visitor.Counter;
import visitor.Evaluator;
import visitor.Formatter;

/**
 * This class represents the core logic of a Calculator.
 * It can be used to print and evaluate artihmetic expressions.
 *
 * @author tommens
 */
public class Calculator {
    
    /*
     For the moment the calculator only contains a print method and an eval method
     It would be useful to complete this with a read method, so that we would be able
     to implement a full REPL cycle (Read-Eval-Print loop) such as in Scheme, Python, R and other languages.
     To do so would require to implement a method with the following signature, converting an input string
     into an arithmetic expression:
     public Expression read(String s)
    */

    /**
     * Prints an arithmetic expression provided as input parameter.
     * @param e the arithmetic Expression to be printed
     * @see #printExpressionDetails(Expression) 
     */
    public void print(Expression e) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        Formatter s = new Formatter(Notation.PREFIX);
        e.accept(s);
        System.out.println("The result of evaluating expression " + s.getResult());
        System.out.println("is: " + eval(e) + ".");
        System.out.println();
    }

    /**
     * Prints verbose details of an arithmetic expression provided as input parameter.
     * @param e the arithmetic Expression to be printed
     * @see #print(Expression)
     */
    public void printExpressionDetails(Expression e) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        print(e);
        Counter c = new Counter();
        e.accept(c);
        System.out.print("It contains " + c.getDepth() + " levels of nested expressions, ");
        System.out.print(c.getOps() + " operations");
        System.out.println(" and " + c.getNbs() + " numbers.");
        System.out.println();
    }

    /**
     * Evaluates an arithmetic expression and returns its result
     * @param e the arithmetic Expression to be evaluated
     * @return The result of the evaluation
     */
    public MyNumber eval(Expression e) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        // create a new visitor to evaluate expressions
        Evaluator v = new Evaluator();
        // and ask the expression to accept this visitor to start the evaluation process
        e.accept(v);
        // and return the result of the evaluation at the end of the process
        return v.getResult();
    }

    /*
     We could also have other methods, e.g. to verify whether an expression is syntactically correct
     public Boolean validate(Expression e)
     or to simplify some expression
     public Expression simplify(Expression e)
    */
}
