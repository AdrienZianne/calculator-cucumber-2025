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
    /** getter method to obtain the value contained in the object
     *
     * @return The integer number contained in the object
     */
  public abstract Object getObjectValue();

    /**
     * Constructor method
     *
     */
    public /*constructor*/ MyNumber() {}




    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
  @Override
  public abstract String toString();

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
