package io;

import calculator.Calculator;
import calculator.Expression;
import calculator.Programmer;
import calculator.Configuration;
import calculator.Configuration.Mode;
import calculator.parser.CalculatorParser;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.reader.impl.LineReaderImpl;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

/**
 * Implement CLI and REPL with command and error
 */
public class Shell {
    /**
     * Attribute used to determine whether or not to stop the program.
     */
    private boolean interrupted = false;

    /**
     * Attribute containing the object used to manage the command line interface in
     * the terminal.
     */
    private final Terminal terminal;

    /**
     * Attribute containing the object used to retrieve user input via the terminal.
     */
    private LineReader reader;

    /**
     * Attribute containing the object that keeps the application context. It is
     * used to close the application.
     */
    private ConfigurableApplicationContext ctx;

    /**
     * Class constructor. It initializes everything required for the CLI to function
     * correctly.
     * 
     * @param ctx Application context.
     * @throws IOException This error is thrown if the terminal could not be built.
     */
    public Shell(ConfigurableApplicationContext ctx) throws IOException {
        terminal = TerminalBuilder.terminal();

        List<String> completionStrings = Arrays.asList("mode", "real_precision", "real_rounding_mode",
                "use_real_notation", "use_scientific_notation", "sc_notation_max_left", "sc_notation_max_right",
                "use_degrees", "seed", "reset_seed", "base_notation_convention", "logical_symbol", "true", "false",
                "ceiling", "down", "floor", "half_down", "half_even", "half_up", "unnecessary", "up");

        reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .completer(new StringsCompleter(completionStrings))
                .option(LineReader.Option.DISABLE_EVENT_EXPANSION, true)
                .build();
        this.ctx = ctx;
    }

    /**
     * Print error in the console
     * 
     * @param err The error message sent to the user
     */
    private void printError(String err) {
        terminal.writer().println("\033[31m" + "ERROR : " + err + "\033[0m");
    }

    /**
     * Loop of the REPL, making the application interactive
     * 
     * @param c The calculator.
     *          {@link Calculator}
     */
    public void loop(Calculator c) {
        while (!interrupted) {

            try {
                String line = reader.readLine(">> ").trim();

                if (!line.isEmpty() && line.charAt(0) == '$') {
                    modeSettings(line.substring(1));
                } else {
                    if (Configuration.getMode() == Mode.ARITHMETIC) {
                        modeArithmetic(c, line);

                    } else {
                        modeProgrammer(line);
                    }
                }

                reader.getHistory().add(line);
            } catch (UserInterruptException e) {
                exit();
            }
        }
    }

    /**
     * Method used to call the parser for application parameters.
     * 
     * @param line User input
     */
    private void modeSettings(String line) {
        try {
            CalculatorParser.parseSettings(line, this);
        } catch (IllegalArgumentException e) {
            printError(e.getMessage());
            e.printStackTrace(terminal.writer());
        }
    }

    /**
     * Method for calling the parser for arithmetic calculations.
     * 
     * @param c    The calculator.
     * @param line User input
     *             {@link Calculator}
     */
    private void modeArithmetic(Calculator c, String line) {
        try {
            Expression exp = CalculatorParser.parseArithmetic(line);
            if (exp == null)
                System.out.println("[DEBUG] : Result was null, returning");
            else
                terminal.writer().println(c.eval(exp));
        } catch (IllegalArgumentException e) {
            printError(e.getMessage());
            e.printStackTrace(terminal.writer());
        }
    }

    /**
     * Method for calling the parser for logic and computer calculations.
     * 
     * @param line User input
     */
    private void modeProgrammer(String line) {
        try {
            Programmer exp = CalculatorParser.parseProgrammer(line);
            if (exp == null)
                System.out.println("[DEBUG] : Result was null, returning");
            else
                terminal.writer().println(exp);
        } catch (IllegalArgumentException e) {
            printError(e.getMessage());
            e.printStackTrace(terminal.writer());
        }
    }

    /**
     * Method for cleanly closing the client and application.
     */
    public void exit() {
        terminal.writer().println("Exiting !");
        terminal.flush();
        interrupted = true;
        ctx.close();
    }

    /**
     * Print help message to help user use the interactive console
     */
    public void displayHelp() {
        terminal.writer().println("""
                \033[1mCalculator Cucumber\033[0m

                \t$<help|h>           : Display this message
                \t$<clear|c>          : Clear the screen
                \t$<quit|q>           : Quit the application
                \t$<list|l>           : List options
                \t$<info|i> <option>  : Displays information about an option
                \t$<reset_seed>       : Disables seed
                \t$<option> = <value> : Setting an option value
                """);
    }

    /**
     * Method for displaying the list of options.
     */
    public void displayOptions() {
        terminal.writer().println("""
                \033[1mList Options:\033[0m

                \tmode = [arithmetic|programmer]
                \treal_precision = int
                \treal_rounding_mode = roundingmode (see info)
                \tuse_real_notation = bool
                \tuse_scientific_notation = bool
                \tsc_notation_max_left = int
                \tsc_notation_max_right = int
                \tuse_degrees = bool
                \tseed = int
                \tbase_notation_convention = bool
                \tlogical_symbol = bool
                """);
    }

    /**
     * Method for displaying multiple information about an option. Namely, its name,
     * current value, value type and description.
     * 
     * @param o The option you want to know more about.
     */
    public void infoOption(Options o) {
        terminal.writer()
                .println("\033[1mOption : " + infoOptions.get(o)[0] + "\033[0m\n\t Current value : "
                        + getValueConfiguration(o)
                        + "\n\t Value type : "
                        + infoOptions.get(o)[1] + "\n\t Description : " + infoOptions.get(o)[2]);
    }

    /**
     * Method used to recover the current value of an option.
     * 
     * @param o The option whose current value is to be retrieved.
     * @return The current value of the option. It is of type String to manage
     *         different types of configuration.
     *         {@link Configuration}
     */
    private String getValueConfiguration(Options o) {
        switch (o) {
            case Options.MODE:
                return ("" + Configuration.getMode()).toLowerCase();
            case Options.REAL_PRECISION:
                return "" + Configuration.getRealPrecision();
            case Options.REAL_ROUNDING_MODE:
                return "" + Configuration.getRealRoundingMode();
            case Options.USE_REAL_NOTATION:
                return "" + Configuration.isUsingRealNotation();
            case Options.USE_SCIENTIFIC_NOTATION:
                return "" + Configuration.usesScientificNotation();
            case Options.SC_NOTATION_MAX_LEFT:
                return "" + Configuration.getScNotationMaxLeft();
            case Options.SC_NOTATION_MAX_RIGHT:
                return "" + Configuration.getScNotationMaxRight();
            case Options.USE_DEGREES:
                return "" + Configuration.isUsingDegrees();
            case Options.SEED:
                if (Configuration.getSeed() == null) {
                    return "disabled";
                }
                return "" + Configuration.getSeed();
            case Options.BASE_NOTATION_CONVENTION:
                return "" + Configuration.getBaseNotationConvention();
            case Options.LOGICAL_SYMBOL:
                return "" + Configuration.getLogicalSymbol();
        }

        return "";
    }

    /**
     * Clear the screen
     */
    public void clear() {
        ((LineReaderImpl) reader).clearScreen();
    }

    /**
     * Options
     * Enumeration listing all possible application options.
     * {@link Configuration}
     */
    public enum Options {
        MODE, REAL_PRECISION, REAL_ROUNDING_MODE,
        USE_REAL_NOTATION, USE_SCIENTIFIC_NOTATION,
        SC_NOTATION_MAX_LEFT, SC_NOTATION_MAX_RIGHT,
        USE_DEGREES, SEED,
        BASE_NOTATION_CONVENTION, LOGICAL_SYMBOL
    }

    /**
     * Attribute that stores the various information to be displayed for each
     * option.
     * See infoOption method.
     */
    private final HashMap<Options, String[]> infoOptions = new HashMap<Options, String[]>() {
        {
            put(Options.MODE, new String[] { "mode", "[arithmetic|programmer]",
                    "Selects the calculator mode." });
            put(Options.REAL_PRECISION, new String[] { "real_precision", "An positive integer value",
                    "Selects the precision of real numbers, i.e. how many digits will be used after the dot." });
            put(Options.REAL_ROUNDING_MODE, new String[] { "real_rounding_mode", "roundingmode (See description)",
                    """
                            Selects the rounding method for real numbers.The possible values are as follows:
                            \tceiling : Rounding mode to round towards positive infinity.
                            \tdown : Rounding mode to round towards zero.
                            \tfloor : Rounding mode to round towards negative infinity.
                            \thalf_down : Rounding mode to round towards 'nearest neighbor' unless both neighbors are equidistant, in which case round down.
                            \thalf_even : Rounding mode to round towards the 'nearest neighbor' unless both neighbors are equidistant, in which case, round towards the even neighbor.
                            \thalf_up : Rounding mode to round towards 'nearest neighbor' unless both neighbors are equidistant, in which case round up.
                            \tunnecessary : Rounding mode to assert that the requested operation has an exact result, hence no rounding is necessary.
                            \tup : Rounding mode to round away from zero.
                            """ });
            put(Options.USE_REAL_NOTATION, new String[] { "use_real_notation", "[true|false]",
                    "Sets whether or not rationals should be displayed as an approximation of their values as reals." });
            put(Options.USE_SCIENTIFIC_NOTATION, new String[] { "use_scientific_notation", "[true|false]",
                    "Sets wether or not the scientific notation should be used." });
            put(Options.SC_NOTATION_MAX_LEFT, new String[] { "sc_notation_max_left", "An positive integer value",
                    "The maximum number of digits that can be displayed in the integer part of a number." });
            put(Options.SC_NOTATION_MAX_RIGHT, new String[] { "sc_notation_max_right", "An positive integer value",
                    "The maximum number of digits that can be displayed in the decimal part of a number." });
            put(Options.USE_DEGREES,
                    new String[] { "use_degrees", "[true|false]", "Select whether to work in degrees or radians." });
            put(Options.SEED, new String[] { "seed", "An integer value",
                    "Selects the seed value. Numbers will then be generated according to this value." });
            put(Options.BASE_NOTATION_CONVENTION, new String[] { "base_notation_convention", "[true|false]",
                    "Select whether to display known bases according to their convention. For example, base 2 will be written 0b<value> instead of <value>_2." });
            put(Options.LOGICAL_SYMBOL, new String[] { "logical_symbol", "[true|false]",
                    "Selects whether to display the logic symbols T and F for true and false instead of 1 and 0." });
        }
    };
}
