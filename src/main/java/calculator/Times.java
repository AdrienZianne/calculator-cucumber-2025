package calculator;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

/** This class represents the arithmetic multiplication operation "*".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Minus
 * @see Plus
 * @see Divides
 */
public final class Times extends CommutativeOperation
 {
  /**
   * Class constructor specifying a number of Expressions to multiply.
   *
   * @param elist The list of Expressions to multiply
   * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
   * @see #Times(List<Expression>,Notation)
   */
  public /*constructor*/ Times(List<Expression> elist) throws IllegalConstruction {
  	this(elist, null);
  }

  /**
   * Class constructor specifying a number of Expressions to multiply,
   * as well as the Notation used to represent the operation.
   *
   * @param elist The list of Expressions to multiply
   * @param n The Notation to be used to represent the operation
   * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
   * @see #Times(List<Expression>)
   * @see Operation#Operation(List<Expression>,Notation)
   */
  public Times(List<Expression> elist, Notation n) throws IllegalConstruction {
  	super(elist,n);
  	symbol = "*";
  	neutral = 1;
  }

  /**
   * The actual computation of the (binary) arithmetic multiplication of two integers
   *
   * @param l The first integer
   * @param r The second integer that should be multiplied with the first
   * @return The integer that is the result of the multiplication
   */
  public MyNumber op(MyNumber l, MyNumber r)
    {
        return null;
        //return (l*r);
    }

     @Override
     public MyNumber op(MyInteger l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
         return new MyInteger(l.getValue() * r.getValue());
     }

     @Override
     public MyNumber op(MyReal l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
         return new MyReal(l.getValue() * (double) r.getValue());
     }

     @Override
     public MyNumber op(MyReal l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
         return new MyReal(l.getValue() * r.getValue());
     }

     @Override
     public MyNumber op(MyComplexNumber l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
         // (a + b*i) * c = (c*a) + (c*b*i)
         return new MyComplexNumber(op(l.getRealImaginaryPair().a, r), op(l.getRealImaginaryPair().b, r));
     }

     @Override
     public MyNumber op(MyComplexNumber l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
         return new MyComplexNumber(op(l.getRealImaginaryPair().a, r), op(l.getRealImaginaryPair().b, r));
     }

     @Override
     public MyNumber op(MyComplexNumber l, MyComplexNumber r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
       MyNumber real = new Plus(new ArrayList<>()).op( op(l.getRealImaginaryPair().a, r.getRealImaginaryPair().a),
                                                      op(l.getRealImaginaryPair().b, r.getRealImaginaryPair().a));

       MyNumber imaginary = new Plus(new ArrayList<>()).op(op(r.getRealImaginaryPair().a, r.getRealImaginaryPair().b),
                                                            op(r.getRealImaginaryPair().b, r.getRealImaginaryPair().b));
       return new MyComplexNumber(real, imaginary);
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
