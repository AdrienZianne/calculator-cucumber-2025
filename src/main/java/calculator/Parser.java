package calculator;

import calculator.parser.LabeledExprBaseVisitor;
import calculator.parser.LabeledExprLexer;
import calculator.parser.LabeledExprParser;
import calculator.parser.LabeledExprVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class Parser{
    public Expression ParseString(String input) throws IllegalConstruction {
        TestParser tp = new TestParser();

        // Read input as stream
        CharStream inp = CharStreams.fromString(input);
        //
        LabeledExprLexer lexer = new LabeledExprLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);

        //ParseTree tree = parser.prog(); // parse
        TestParser eval = new TestParser();
        Expression result = eval.visit(parser.expr());
        System.out.println(result);
        return result;

    }



    public class TestParser extends LabeledExprBaseVisitor<Expression> {

        @Override
        public Expression visitExprInfix(LabeledExprParser.ExprInfixContext ctx) {
            Expression res = ctx.getChild(0).accept(this);
            Calculator calculator = new Calculator();
            System.out.println("res: " + calculator.eval(res));
            return res;
        }


        @Override
        public Expression visitAtomInfixSum(LabeledExprParser.AtomInfixSumContext ctx) {
            return ctx.getChild(1).accept(this);
        }

        @Override
        public Expression visitSumInfixAdd(LabeledExprParser.SumInfixAddContext ctx) {
            System.out.println("ExprSumAdd: " + ctx.getText());
            Expression factor1 = ctx.getChild(0).accept(this);
            Expression factor2 = ctx.getChild(2).accept(this);

            try {
                return new Plus(List.of(factor1, factor2));
            } catch (IllegalConstruction e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public Expression visitAtomInfixInt(LabeledExprParser.AtomInfixIntContext ctx) {
            // We are at the end of the parse tree, we can simply parse the text as an int
            return new MyNumber(Integer.parseInt(ctx.getText()));
        }
    }
}
