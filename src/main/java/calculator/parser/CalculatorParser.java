package calculator.parser;

import calculator.Expression;
import calculator.Programmer;
import calculator.parser.antlr.LabeledExprLexer;
import calculator.parser.antlr.LabeledExprParser;
import calculator.parser.antlr.LabeledProgrammerLexer;
import calculator.parser.antlr.LabeledProgrammerParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class CalculatorParser {
    public static Expression parseString(String input) {
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
            System.out.println("Parsing error caught: " + e.getMessage());
            return null;
        }
    }

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
            System.out.println("Parsing error caught: " + e.getMessage());
            return null;
        }
    }
}
