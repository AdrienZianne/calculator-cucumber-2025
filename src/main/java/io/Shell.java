package io;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.Console;
import java.io.IOException;

public class Shell {

    private boolean interrupted = false;
    private Terminal terminal;

    public Shell() throws IOException {
        terminal = TerminalBuilder.terminal();
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
    public void loop() throws IOException {


        LineReader reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .completer(new StringsCompleter(/*put here completion string*/))
                .build();

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
                    default:
                        try {
                            // call here the parser
                        } catch (IllegalArgumentException e) {
                            printError(e.getMessage());
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
     * Print help message to help user use the interactive console
     */
    private void displayHelp() {
        terminal.writer().println("""
                \033[1mCalculator Cucumber 2025\033[0m
                
                \t!h : Display this message
                \t!q : Quit the application
                """
        );
    }

    private void exit() {
        terminal.writer().println("Exiting !");
        terminal.flush();
        interrupted = true;
    }
}
