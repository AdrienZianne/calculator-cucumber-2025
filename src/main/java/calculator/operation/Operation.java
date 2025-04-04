package calculator.operation;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.Notation;
import jdk.jshell.spi.ExecutionControl;
import visitor.Formatter;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Operation implements Expression {
    /**
     * The list of expressions passed as an argument to this operation
     */
    protected List<Expression> args;

    /**
     * The symbol/name of the operation
     */
    protected String symbol;

    /**
     * The notation used to render operations as strings.
     * By default, the infix notation will be used.
     */
    public Notation notation = Notation.INFIX;


    protected Operation(List<Expression> arg) throws IllegalConstruction {
        this(arg, null);
    }

    /**
     * To construct an operation with a list of expressions as arguments,
     * as well as the Notation used to represent the operation.
     *
     * @param elist The list of expressions passed as argument to the arithmetic operation
     * @param n     The notation to be used to represent the operation
     * @throws IllegalConstruction Exception thrown if a null list of expressions is passed as argument
     */
    protected /*constructor*/ Operation(List<Expression> elist, Notation n)
            throws IllegalConstruction {
        if (elist == null) {
            throw new IllegalConstruction();
        } else {
            args = new ArrayList<>(elist);
        }
        if (n != null) notation = n;
    }



    /**
     * Accept method to implement the visitor design pattern to traverse arithmetic expressions.
     * Each operation will delegate the visitor to each of its arguments expressions,
     * and will then pass itself to the visitor object to get processed by the visitor object.
     *
     * @param v The visitor object
     */
    public void accept(Visitor v) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        for (Expression a : args) {
            a.accept(v);
        }
        v.visit(this);
    }


    @Override
    public String toString() {
        try {
            return toString(this.notation);
        } catch (IllegalConstruction e) {
            throw new RuntimeException(e);
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Convert the arithmetic operation into a String to allow it to be printed,
     * using the notation n (prefix, infix or postfix) that is specified as a parameter.
     *
     * @param n The notation to be used for representing the operation (prefix, infix or postfix)
     * @return The String that is the result of the conversion.
     */
    public final String toString(Notation n) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        Formatter formatter = new Formatter(n);
        formatter.visit(this);
        return formatter.getResult();
    }
    /**
     * Two operation objects are equal if their list of arguments is equal and they correspond to the same operation.
     *
     * @param o The object to compare with
     * @return The result of the equality comparison
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) return false; // No object should be equal to null

        if (this == o) return true; // If it's the same object, they're obviously equal

        if (getClass() != o.getClass())
            return false; // getClass() instead of instanceof() because an addition is not the same as a multiplication

        Operation other = (Operation) o;
        return this.args.equals(other.args);
    }

    /**
     * The method hashCode needs to be overridden it the equals method is overridden;
     * otherwise there may be problems when you use your object in hashed collections
     * such as HashMap, HashSet, LinkedHashSet.
     *
     * @return The result of computing the hash.
     */
    @Override
    public int hashCode() {
        int result = 5;
        int prime = 31;
        //result = prime * result + neutral;
        result = prime * result + symbol.hashCode();
        result = prime * result + args.hashCode();
        return result;
    }

    /**
     * getter method to return the symbol of the operation
     *
     * @return
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * getter method to return the number of arguments of an arithmetic operation.
     *
     * @return The number of arguments of the arithmetic operation.
     */
    public List<Expression> getArgs() {
        return args;
    }

}
