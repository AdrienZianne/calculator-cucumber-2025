package calculator;

import calculator.operation.binary.BinaryOperation;
import visitor.Visitor;

/**
 * MyNumber is a concrete class that represents arithmetic numbers,
 * which are a special kind of Expressions, just like operations are.
 *
 * @see Expression
 * @see BinaryOperation
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
   * Checks if the value stored can be considered as a zero.
   * @return true if the value is zero, false otherwise.
   */
  public abstract boolean isZero();

  /**
   * Gets the sign of the number.
   * @return A number bigger than 0 if the number is positive, 0 if the number is equal to zero and a number less than 0 otherwise.
   */
  public abstract int getSign();


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
