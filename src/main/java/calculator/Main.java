package calculator;

import calculator.parser.CalculatorParser;

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

		Expression exp = CalculatorParser.parseString("(4 + )");
		c.printExpressionDetails(exp);
	}

	catch(Exception exception) {
		System.out.println("cannot create operations without parameters: " + exception.getMessage());
		}
 	}

}
