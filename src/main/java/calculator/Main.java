package calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A very simple calculator in Java
 * University of Mons - UMONS
 * Software Engineering Lab
 * Faculty of Sciences
 *
 * @author tommens
 */
public class Main {

	/**
	 * This is the main method of the application.
	 * It provides examples of how to use it to construct and evaluate arithmetic expressions.
	 *
	 * @param args	Command-line parameters are not used in this version
	 */
	public static void main(String[] args) {
  	Expression e;
  	Calculator c = new Calculator();

	try{
		e = new MyInteger(1);
		c.print(e);
		c.eval(e);

		e = new MyReal(1);
		c.print(e);
		c.eval(e);

		e = new MyRational(1, 2);
		c.print(e);
		c.eval(e);

		e = new MyComplex(1, 2);
		c.print(e);
		c.eval(e);

		List<Expression> params = new ArrayList<>();
		Collections.addAll(params, new MyInteger(3), new MyInteger(5));
		e = new Operation(params, Operation.Type.PLUS);
		c.printExpressionDetails(e);
		c.eval(e);

		params = new ArrayList<>();
		Collections.addAll(params, new MyInteger(3), new MyReal(5));
		e = new Operation(params, Operation.Type.PLUS);
		c.printExpressionDetails(e);
		c.eval(e);

		params = new ArrayList<>();
		Collections.addAll(params, new MyInteger(3), new MyRational(2, 5));
		e = new Operation(params, Operation.Type.PLUS);
		c.printExpressionDetails(e);
		c.eval(e);

		params = new ArrayList<>();
		Collections.addAll(params, new MyInteger(3), new MyComplex(2, 5));
		e = new Operation(params, Operation.Type.PLUS);
		c.printExpressionDetails(e);
		c.eval(e);

		/*
		// Function but is not interesting
	    List<Expression> params = new ArrayList<>();
	    Collections.addAll(params, new MyInteger(3), new MyInteger(4), new MyInteger(5));
	    e = new Operation(params,Notation.PREFIX, Operation.Type.PLUS);
		c.printExpressionDetails(e);
		c.eval(e);

		List<Expression> params2 = new ArrayList<>();
		Collections.addAll(params2, new MyInteger(5), new MyInteger(3));
		e = new Operation(params2, Notation.INFIX, Operation.Type.MINUS);
		c.print(e);
		c.eval(e);

		List<Expression> params3 = new ArrayList<>();
		Collections.addAll(params3, new Operation(params, Operation.Type.PLUS), new Operation(params2, Operation.Type.MINUS));
		e = new Operation(params3, Operation.Type.TIMES);
		c.printExpressionDetails(e);
		c.eval(e);

		List<Expression> params4 = new ArrayList<>();
		Collections.addAll(params4, new Operation(params, Operation.Type.PLUS), new Operation(params2, Operation.Type.MINUS), new MyInteger(5));
		e = new Operation(params4,Notation.POSTFIX, Operation.Type.DIVIDES);
		c.print(e);
		c.eval(e);
		 */
	}

	catch(IllegalConstruction exception) {
		System.out.println("cannot create operations without parameters");
		}
 	}
}
