package calculator;

import calculator.operation.binary.BinaryOperation;
import visitor.Visitor;

/**
 * Expression is an abstract class that represents arithmetic expressions.
 * It has two concrete subclasses Operation and MyNumber.
 *
 * @see BinaryOperation
 * @see MyNumber
 */
public interface Expression {

   /**
    * accept is a method needed to implement the visitor design pattern
    *
    * @param v The visitor object being passed as a parameter
    */
   void accept(Visitor v);
}
