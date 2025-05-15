package calculator.parser;

import calculator.Equation;
import calculator.Expression;
import calculator.Programmer;
import calculator.parser.antlr.*;
import io.Memory;
import io.Shell;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * CalculatorParser
 * Class used to launch the parser on different grammars.
 */
public class CalculatorParser {
    /**
     * Method used to launch the parser on parameters.
     * 
     * @param input User input.
     * @param shell Connect to the shell to call methods from the parser.
     * @param memo  instance to interact with logs and favorites.
     */
    public static void parseSettings(String input, Shell shell, Memory memo) {
        // Read input as stream
        CharStream inp = CharStreams.fromString(input);

        LabeledSettingsLexer lexer = new LabeledSettingsLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledSettingsParser parser = new LabeledSettingsParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());

        SettingsParser eval = new SettingsParser(shell, memo);
        try {
            eval.visit(parser.setting());
        } catch (ParserError e) {
            System.out.println("Parsing error caught for Settings: " + e.getMessage());
        }
    }

    /**
     * Method for launching the parser in arithmetic mode.
     * 
     * @param input User input.
     * @return The result of the arithmetic expression.
     */
    public static Expression parseArithmetic(String input) {
        // Read input as stream
        CharStream inp = CharStreams.fromString(input);

        LabeledExprLexer lexer = new LabeledExprLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());

        ExpressionParser eval = new ExpressionParser();
        try {
            return eval.visit(parser.expr());
        } catch (ParserError e) {
            System.out.println("Parsing error caught for Arithmetic: " + e.getMessage());
            return null;
        }
    }

    public static Equation parseArithmeticEquation(String input) {
        // Read input as stream
        CharStream inp = CharStreams.fromString(input);

        LabeledExprLexer lexer = new LabeledExprLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());

        EquationParser eval = new EquationParser();
        try {
            return eval.visit(parser.expr());
        } catch (ParserError e) {
            System.out.println("Parsing error caught for Arithmetic expression: " + e.getMessage());
            return null;
        }
    }

    /**
     * Method for launching the parser in programmer mode.
     * 
     * @param input User input.
     * @return The result of the programmer's expression.
     */
    public static Programmer parseProgrammer(String input) {
        // Read input as stream
        CharStream inp = CharStreams.fromString(input);

        LabeledProgrammerLexer lexer = new LabeledProgrammerLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledProgrammerParser parser = new LabeledProgrammerParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ThrowingErrorListener());

        ProgrammerParser eval = new ProgrammerParser();
        try {
            return eval.visit(parser.operation());
        } catch (ParserError e) {
            System.out.println("Parsing error caught for Programmer: " + e.getMessage());
            return null;
        }
    }
}
