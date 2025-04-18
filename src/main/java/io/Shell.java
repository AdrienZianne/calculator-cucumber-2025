package io;

import calculator.Calculator;
import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.parser.CalculatorParser;
import jdk.jshell.spi.ExecutionControl;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.reader.impl.LineReaderImpl;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

/**
 * Implement CLI and REPL with command and error
 */
public class Shell {

    private boolean interrupted = false;
    private final Terminal terminal;
    private LineReader reader;
    private ConfigurableApplicationContext ctx;

    public Shell(ConfigurableApplicationContext ctx) throws IOException {
        terminal = TerminalBuilder.terminal();
        reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .completer(new StringsCompleter(/* add completion string list here */))
                .option(LineReader.Option.DISABLE_EVENT_EXPANSION, true)
                .build();
        this.ctx = ctx;
    }

    /**
     * Print error in the console
     * @param err   The error message sent to the user
     */
    private void printError(String err) {
        terminal.writer().println("\033[31m" + "ERROR : " + err + "\033[0m");
    }

    /**
     * Loop of the REPL, making the application interactive
     */
    public void loop(Calculator c) {

        while (!interrupted) {

            try {
                String line = reader.readLine(">> ");

                switch (line) {
                    case "!q":
                        exit();
                        break;
                    case "!h":
                        displayHelp();
                        break;
                    case "!c":
                        clear();
                        break;
                    default:
                        try {
                            Expression exp = CalculatorParser.parseString(line);
                            terminal.writer().println(c.eval(exp));
                        } catch (IllegalArgumentException e) {
                            printError(e.getMessage());
                            e.printStackTrace(terminal.writer());
                        } catch (IllegalConstruction e) {
                            throw new RuntimeException(e);
                        } catch (ExecutionControl.NotImplementedException e) {
                            throw new RuntimeException(e);
                        }
                }

                reader.getHistory().add(line);
            }
            catch (UserInterruptException e) {
                exit();
            }
        }
    }

    /**
     * Clear the screen
     */
    private void clear() {
        ((LineReaderImpl) reader).clearScreen();
    }

    /**
     * Print help message to help user use the interactive console
     */
    private void displayHelp() {
        terminal.writer().println("""
                \033[1mCalculator Cucumber 2025\033[0m
                
                \t!h : Display this message
                \t!c : Clear the screen
                \t!q : Quit the application
                """
        );
    }

    private void exit() {
        terminal.writer().println("Exiting !");
        terminal.flush();
        interrupted = true;
        ctx.close();
    }
}
