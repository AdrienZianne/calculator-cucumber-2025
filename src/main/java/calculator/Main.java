package calculator;

import io.cli.Shell;
import jdk.jshell.spi.ExecutionControl;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
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
@ComponentScan({ "io" })
@EntityScan({ "io" })
public class Main {

	/**
	 * This is the main method of the application.
	 * It provides examples of how to use it to construct and evaluate arithmetic
	 * expressions.
	 *
	 * @param args Command-line parameters are not used in this version
	 */
	public static void main(String[] args) throws IOException {
        if (args.length >= 1 && args[0].equals("web")) {
            SpringApplication.run(Main.class);
        } else {
            Calculator c = new Calculator();

            try {
                Shell shell = new Shell();
                shell.loop(c);
            } catch (IOException ex) {
                throw new IOException(ex);
            } catch (Exception exception) {
                System.out.println("cannot create operations without parameters: " + exception.getMessage());
            }
        }
	  }
}
