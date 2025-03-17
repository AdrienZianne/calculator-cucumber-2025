package calculator;

import io.Shell;
import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;
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
	public static void main(String[] args) throws IllegalConstruction, ExecutionControl.NotImplementedException {

		Expression e;
		Calculator c = new Calculator();

		try {
			Shell shell = new Shell();
			shell.loop(c);
		}
		catch (IOException ex) {
				throw new RuntimeException(ex);
		}
		catch(Exception exception) {
			System.out.println("cannot create operations without parameters: " + exception.getMessage());
		}
    }

}
