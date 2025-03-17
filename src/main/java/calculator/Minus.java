package calculator;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/** This class represents the arithmetic operation "-".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Plus
 * @see Times
 * @see Divides
 */
public final class Minus extends CommutativeOperation
 {

  /**
   * Class constructor specifying a number of Expressions to subtract.
   *
   * @param elist The list of Expressions to subtract
   * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
   * @see #Minus(List<Expression>,Notation)
   */
  public /*constructor*/ Minus(List<Expression> elist) throws IllegalConstruction {
  	this(elist, null);
  }

  /**
   * Class constructor specifying a number of Expressions to subtract,
   * as well as the Notation used to represent the operation.
   *
   * @param elist The list of Expressions to subtract
   * @param n The Notation to be used to represent the operation
   * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
   * @see #Minus(List<Expression>)
   * @see Operation#Operation(List<Expression>,Notation)
   */
  public Minus(List<Expression> elist, Notation n) throws IllegalConstruction {
  	super(elist,n);
  	symbol = "-";
  	neutral = 0;
  }

     @Override
     public MyNumber op(MyInteger l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
         return new MyInteger(l.getValue() - r.getValue());
     }

     @Override
     public MyNumber op(MyReal l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
         return new MyReal(l.getValue() - r.getValue());
     }

     @Override
     public MyNumber op(MyReal l, MyReal r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
         return new MyReal(l.getValue() - r.getValue());
     }

     @Override
     public MyNumber op(MyComplexNumber l, MyInteger r) throws ExecutionControl.NotImplementedException, IllegalConstruction {
         return new MyComplexNumber(op(l.getRealImaginaryPair().a, r), l.getRealImaginaryPair().b);
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
