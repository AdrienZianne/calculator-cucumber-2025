package calculator;

import calculator.parser.*;
import org.antlr.v4.runtime.*;

public class CalculatorParser {
    public static Expression parseString(String input) {

        // Read input as stream
        CharStream inp = CharStreams.fromString(input);

        LabeledExprLexer lexer = new LabeledExprLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);

        ExpressionParser eval = new ExpressionParser();
        return eval.visit(parser.expr());

    }
}
