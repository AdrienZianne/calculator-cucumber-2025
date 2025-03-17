package calculator;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/** This class represents the arithmetic division operation "/".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Minus
 * @see Times
 * @see Plus
 */
public final class Divides extends Operation
{

  /**
   * Class constructor specifying a number of Expressions to divide.
   *
   * @param elist The list of Expressions to divide
   * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
   * @see #Divides(List<Expression>,Notation)
   */
  public /*constructor*/ Divides(List<Expression> elist) throws IllegalConstruction {
	this(elist, null);
  }

    /**
     * Class constructor specifying a number of Expressions to divide,
     * as well as the notation used to represent the operation.
     *
     * @param elist The list of Expressions to divide
     * @param n The Notation to be used to represent the operation
     * @throws IllegalConstruction  If an empty list of expressions if passed as parameter
     * @see #Divides(List<Expression>)
     * @see Operation#Operation(List<Expression>,Notation)
     */
  public Divides(List<Expression> elist, Notation n) throws IllegalConstruction {
	super(elist,n);
	symbol = "/";
	neutral = 1;
  }

    /**
     * The actual computation of the (binary) arithmetic division of two integers
     *
     * @param l The first integer
     * @param r The second integer that should divide the first
     * @return The integer that is the result of the division
     */
    public MyNumber op(MyNumber l, MyNumber r)
    {
        return null;
        //try {
        //    return (l/r);
        //}
        //catch (ArithmeticException error) {
        //    if (l >= 0) {
        //        return Integer.MAX_VALUE;
        //    }
        //    return Integer.MIN_VALUE;
        //    /* TO DO LATER
        //    else if (l < 0) {
        //        return Integer.MIN_VALUE;
        //    }
        //    else {
        //        return Double.NaN;
        //    }
        //     */
        //}
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyInteger l, MyComplexNumber r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyComplexNumber r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyComplexNumber l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyComplexNumber l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyComplexNumber l, MyComplexNumber r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyComplexNumber l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyComplexNumber r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        return null;
    }
}
