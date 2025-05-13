package calculator.parser;

import calculator.Equation;
import calculator.Expression;
import calculator.MyNumber;
import calculator.MyUnknown;
import calculator.parser.antlr.LabeledExprBaseVisitor;
import calculator.parser.antlr.LabeledExprParser;
import org.antlr.v4.runtime.ParserRuleContext;
import visitor.Evaluator;

public class EquationParser extends LabeledExprBaseVisitor<Equation> {
    @Override
    public Equation visitExpr(LabeledExprParser.ExprContext ctx) {
        return visit(ctx.getChild(0));
    }


    @Override
    public Equation visitEquationInfix(LabeledExprParser.EquationInfixContext ctx) {
        return solveEquation(ctx);
    }

    @Override
    public Equation visitEquationPrefix(LabeledExprParser.EquationPrefixContext ctx) {
        return solveEquation(ctx);
    }

    @Override
    public Equation visitEquationPostfix(LabeledExprParser.EquationPostfixContext ctx) {
        return solveEquation(ctx);
    }


    private <E extends ParserRuleContext> Equation solveEquation(E ctx) {

        ExpressionParser expressionParser = new ExpressionParser();

        // Compute left part of the equation
        Evaluator v = new Evaluator();
        expressionParser.visit(ctx.getChild(0)).accept(v);
        MyNumber left = v.getResult();
        // Compute right part of the equation
        v = new Evaluator();
        expressionParser.visit(ctx.getChild(2)).accept(v);
        MyNumber right = v.getResult();

        System.out.println(new Equation(left, right).printResults());
        return new Equation(left, right);
    }
}
