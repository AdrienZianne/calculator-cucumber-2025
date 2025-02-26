package calculator;

import calculator.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class Parser{
    public Expression ParseString(String input) throws IllegalConstruction {

        // Read input as stream
        CharStream inp = CharStreams.fromString(input);
        //
        LabeledExprLexer lexer = new LabeledExprLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);

        ExpressionParser eval = new ExpressionParser();
        Expression result = eval.visit(parser.expr());
        System.out.println(result);
        return result;

    }
}
