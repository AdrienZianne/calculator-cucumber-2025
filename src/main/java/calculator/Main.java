package calculator;

import io.Shell;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import calculator.parser.CalculatorParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * A very simple calculator in Java
 * University of Mons - UMONS
 * Software Engineering Lab
 * Faculty of Sciences
 *
 * @author tommens
 */
@SpringBootApplication(scanBasePackages = "io")
@ComponentScan({"io"})
@EntityScan({"io"})
public class Main {

	/**
	 * This is the main method of the application.
	 * It provides examples of how to use it to construct and evaluate arithmetic expressions.
	 *
	 * @param args	Command-line parameters are not used in this version
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Main.class);

		Expression e;
		Calculator c = new Calculator();

		try {

			Shell shell = new Shell(ctx);
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
