package calculator.parser;

import calculator.Expression;
import calculator.parser.antlr.ExpressionParser;
import calculator.parser.antlr.LabeledExprLexer;
import calculator.parser.antlr.LabeledExprParser;
import org.antlr.v4.runtime.*;

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

}
