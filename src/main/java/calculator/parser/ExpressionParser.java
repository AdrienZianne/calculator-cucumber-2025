package calculator.parser;

import calculator.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that maps the generated parser to the calculator custom classes.
 * This class was not generated by ANTLR, and needs to be manually modified when the grammar changes.
 */
public class ExpressionParser extends LabeledExprBaseVisitor<Expression>
{
    @Override
    public Expression visitExpr(LabeledExprParser.ExprContext ctx) {
        return visit(ctx.getChild(0));
    }

    /* _________________________________ INFIX _________________________________ */
    @Override
    public Expression visitSumInfixAdd(LabeledExprParser.SumInfixAddContext ctx) {
        return parseToOperator(ctx,expressions -> new Plus(expressions, Notation.INFIX));
    }

    @Override
    public Expression visitSumInfixDiff(LabeledExprParser.SumInfixDiffContext ctx) {
        return parseToOperator(ctx, expressions -> new Minus(expressions, Notation.INFIX));
    }

    @Override
    public Expression visitProductInfixMult(LabeledExprParser.ProductInfixMultContext ctx) {
        return parseToOperator(ctx, expressions -> new Times(expressions, Notation.INFIX));
    }

    @Override
    public Expression visitProductInfixDiv(LabeledExprParser.ProductInfixDivContext ctx) {
        return parseToOperator(ctx, expressions -> new Divides(expressions, Notation.INFIX));
    }


    @Override
    public Expression visitAtomInfixSum(LabeledExprParser.AtomInfixSumContext ctx) {
        // We only need to visit the second child, since the first and third ones are parentheses.
        return ctx.getChild(1).accept(this);
    }

    /* _________________________________ PREFIX _________________________________ */

    @Override
    public Expression visitSumPrefixSum(LabeledExprParser.SumPrefixSumContext ctx) {
        return parseToOperator(ctx, expressions -> new Plus(expressions, Notation.PREFIX));
    }

    @Override
    public Expression visitSumPrefixDiff(LabeledExprParser.SumPrefixDiffContext ctx) {
        return parseToOperator(ctx, expressions -> new Minus(expressions, Notation.PREFIX));
    }

    @Override
    public Expression visitProductPrefixMult(LabeledExprParser.ProductPrefixMultContext ctx) {
        return parseToOperator(ctx, expressions -> new Times(expressions, Notation.PREFIX));
    }

    @Override
    public Expression visitProductPrefixDiv(LabeledExprParser.ProductPrefixDivContext ctx) {
        return parseToOperator(ctx, expressions -> new Divides(expressions, Notation.PREFIX));
    }
    /* _________________________________ POSTFIX _________________________________ */

    @Override
    public Expression visitSumPostfixSum(LabeledExprParser.SumPostfixSumContext ctx) {
        return parseToOperator(ctx, expressions -> new Plus(expressions, Notation.POSTFIX));
    }

    @Override
    public Expression visitSumPostfixDiff(LabeledExprParser.SumPostfixDiffContext ctx) {
        return parseToOperator(ctx, expressions -> new Minus(expressions, Notation.POSTFIX));
    }

    @Override
    public Expression visitProductPostfixMult(LabeledExprParser.ProductPostfixMultContext ctx) {
        return parseToOperator(ctx, expressions -> new Times(expressions, Notation.POSTFIX));
    }

    @Override
    public Expression visitProductPostfixDiv(LabeledExprParser.ProductPostfixDivContext ctx) {
        return parseToOperator(ctx, expressions -> new Divides(expressions, Notation.POSTFIX));
    }

    /* __________________________________ NUMBER _______________________________ */

    @Override
    public Expression visitNumberInt(LabeledExprParser.NumberIntContext ctx) {
        return new MyNumber(Integer.parseInt(ctx.getText()));
    }

    //__________________________________Static Functions__________________________


    /**
     * Parses the given context as expressions and feeds them to an operation.
     * @param ctx       The context to parse
     * @param operation The operation to build and to give the parsed expressions as parameters.
     * @return The created operation
     * @param <E>   The current parser rule context
     * @param <O>   The type of operation to build
     */
    public <E extends ParserRuleContext, O extends Operation> O parseToOperator(E ctx, BuildOperationFunction<O> operation) {
        ArrayList<Expression> expressions = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            // Checks if the node is a token without any interesting values
            if (! (ctx.getChild(i) instanceof TerminalNode)) {
                expressions.add(visit(ctx.getChild(i)));
            }
        }
        O res = null;
        try {
            res = operation.build(expressions);
        } catch (IllegalConstruction e) {
            throw new RuntimeException(e);
        }
        return res;
    }


}
