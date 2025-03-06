package calculator;

import visitor.Visitor;

/**
 * MyNumber is a concrete class that represents arithmetic numbers,
 * which are a special kind of Expressions, just like operations are.
 *
 * @see Expression
 * @see Operation
 */
public abstract class MyNumber implements Expression
{
    protected Type type;

    /**
     * Adding the different possible types
     */
    public enum Type {
         INTEGER, REAL, RATIONAL, COMPLEX
    }

    /** getter method to obtain the value contained in the object
     *
     * @return The number contained in the object
     */
    public MyNumber getValue() { return this; }


    /** getter method to obtain the type contained in the object
     *
     * @return The type contained in the object
     */
    public Type getType() { return type; }

    /**
     * accept method to implement the visitor design pattern to traverse arithmetic expressions.
     * Each number will pass itself to the visitor object to get processed by the visitor.
     *
     * @param v	The visitor object
     */
    public void accept(Visitor v) {
        v.visit(this);
    }

    public abstract MyNumber plus(MyNumber other);
    public abstract MyNumber minus(MyNumber other);
    public abstract MyNumber times(MyNumber other);
    public abstract MyNumber divides(MyNumber other);
}
