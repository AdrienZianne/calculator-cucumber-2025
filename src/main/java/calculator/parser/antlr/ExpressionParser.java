package calculator.parser.antlr;

import calculator.*;
import calculator.operation.BuildUnaryOperationFunction;
import calculator.operation.BuildOperationFunction;
import calculator.operation.binary.*;
import calculator.operation.unary.Logarithm;
import calculator.operation.unary.Negation;
import calculator.operation.unary.UnaryOperation;
import calculator.operation.unary.trigonometry.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import visitor.Evaluator;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * A class that maps the generated parser to the calculator custom classes.
 * This class was not generated by ANTLR, and needs to be manually modified when
 * the grammar changes.
 */
public class ExpressionParser extends LabeledExprBaseVisitor<Expression> {
    @Override
    public Expression visitExpr(LabeledExprParser.ExprContext ctx) {
        return visit(ctx.getChild(0));
    }

    /*
     * _________________________________ SETTINGS _________________________________
     */
    @Override
    public Expression visitSettingSetSeed(LabeledExprParser.SettingSetSeedContext ctx) {
        RandomGenerator.setSeed(Integer.parseInt(ctx.getChild(2).getText()));
        return null;
    }

    @Override
    public Expression visitSettingResetSeed(LabeledExprParser.SettingResetSeedContext ctx) {
        RandomGenerator.resetSeed();
        return null;
    }

    /* _________________________________ INFIX _________________________________ */
    @Override
    public Expression visitSumInfixAdd(LabeledExprParser.SumInfixAddContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Plus(expressions, Notation.INFIX));
    }

    @Override
    public Expression visitSumInfixDiff(LabeledExprParser.SumInfixDiffContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Minus(expressions, Notation.INFIX));
    }

    @Override
    public Expression visitProductInfixMult(LabeledExprParser.ProductInfixMultContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Times(expressions, Notation.INFIX));
    }

    @Override
    public Expression visitProductInfixDiv(LabeledExprParser.ProductInfixDivContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Divides(expressions, Notation.INFIX));
    }

    @Override
    public Expression visitUnaryInfixNegation(LabeledExprParser.UnaryInfixNegationContext ctx) {
        return parseToUnaryOperator(ctx, expressions -> new Negation(expressions, Notation.INFIX));
    }

    @Override
    public Expression visitTrigoInfixSin(LabeledExprParser.TrigoInfixSinContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Sinus(expression, Notation.INFIX));
    }

    @Override
    public Expression visitTrigoInfixCos(LabeledExprParser.TrigoInfixCosContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Cosinus(expression, Notation.INFIX));
    }

    @Override
    public Expression visitTrigoInfixTan(LabeledExprParser.TrigoInfixTanContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Tangent(expression, Notation.INFIX));
    }

    @Override
    public Expression visitTrigoInfixASin(LabeledExprParser.TrigoInfixASinContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Arcsine(expression, Notation.INFIX));
    }

    @Override
    public Expression visitTrigoInfixACos(LabeledExprParser.TrigoInfixACosContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Arccosine(expression, Notation.INFIX));
    }

    @Override
    public Expression visitTrigoInfixATan(LabeledExprParser.TrigoInfixATanContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Arctangent(expression, Notation.INFIX));
    }

    @Override
    public Expression visitTrigoInfixSinh(LabeledExprParser.TrigoInfixSinhContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new HyperbolicSine(expression, Notation.INFIX));
    }

    @Override
    public Expression visitTrigoInfixCosh(LabeledExprParser.TrigoInfixCoshContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new HyperbolicCosine(expression, Notation.INFIX));
    }

    @Override
    public Expression visitTrigoInfixTanh(LabeledExprParser.TrigoInfixTanhContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new HyperbolicTangent(expression, Notation.INFIX));
    }

    @Override
    public Expression visitUnaryInfixLog(LabeledExprParser.UnaryInfixLogContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Logarithm(expression, Notation.INFIX));
    }

    @Override
    public Expression visitAtomInfixSum(LabeledExprParser.AtomInfixSumContext ctx) {
        // We only need to visit the second child, since the first and third ones are
        // parentheses.
        return ctx.getChild(1).accept(this);
    }

    /* _________________________________ PREFIX _________________________________ */

    @Override
    public Expression visitSumPrefixSum(LabeledExprParser.SumPrefixSumContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Plus(expressions, Notation.PREFIX));
    }

    @Override
    public Expression visitSumPrefixDiff(LabeledExprParser.SumPrefixDiffContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Minus(expressions, Notation.PREFIX));
    }

    @Override
    public Expression visitProductPrefixMult(LabeledExprParser.ProductPrefixMultContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Times(expressions, Notation.PREFIX));
    }

    @Override
    public Expression visitProductPrefixDiv(LabeledExprParser.ProductPrefixDivContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Divides(expressions, Notation.PREFIX));
    }

    @Override
    public Expression visitTrigoPrefixSin(LabeledExprParser.TrigoPrefixSinContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Sinus(expression, Notation.PREFIX));
    }

    @Override
    public Expression visitTrigoPrefixCos(LabeledExprParser.TrigoPrefixCosContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Cosinus(expression, Notation.PREFIX));
    }

    @Override
    public Expression visitTrigoPrefixTan(LabeledExprParser.TrigoPrefixTanContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Tangent(expression, Notation.PREFIX));
    }

    @Override
    public Expression visitTrigoPrefixASin(LabeledExprParser.TrigoPrefixASinContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Arcsine(expression, Notation.PREFIX));
    }

    @Override
    public Expression visitTrigoPrefixACos(LabeledExprParser.TrigoPrefixACosContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Arccosine(expression, Notation.PREFIX));
    }

    @Override
    public Expression visitTrigoPrefixATan(LabeledExprParser.TrigoPrefixATanContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Arctangent(expression, Notation.PREFIX));
    }

    @Override
    public Expression visitTrigoPrefixSinh(LabeledExprParser.TrigoPrefixSinhContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new HyperbolicSine(expression, Notation.PREFIX));
    }

    @Override
    public Expression visitTrigoPrefixCosh(LabeledExprParser.TrigoPrefixCoshContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new HyperbolicCosine(expression, Notation.PREFIX));
    }

    @Override
    public Expression visitTrigoPrefixTanh(LabeledExprParser.TrigoPrefixTanhContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new HyperbolicTangent(expression, Notation.PREFIX));
    }

    @Override
    public Expression visitUnaryPrefixLog(LabeledExprParser.UnaryPrefixLogContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Logarithm(expression, Notation.PREFIX));
    }

    /*
     * _________________________________ POSTFIX _________________________________
     */

    @Override
    public Expression visitSumPostfixSum(LabeledExprParser.SumPostfixSumContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Plus(expressions, Notation.POSTFIX));
    }

    @Override
    public Expression visitSumPostfixDiff(LabeledExprParser.SumPostfixDiffContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Minus(expressions, Notation.POSTFIX));
    }

    @Override
    public Expression visitProductPostfixMult(LabeledExprParser.ProductPostfixMultContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Times(expressions, Notation.POSTFIX));
    }

    @Override
    public Expression visitProductPostfixDiv(LabeledExprParser.ProductPostfixDivContext ctx) {
        return parseToBinaryOperator(ctx, expressions -> new Divides(expressions, Notation.POSTFIX));
    }

    @Override
    public Expression visitTrigoPostfixSin(LabeledExprParser.TrigoPostfixSinContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Sinus(expression, Notation.POSTFIX));
    }

    @Override
    public Expression visitTrigoPostfixCos(LabeledExprParser.TrigoPostfixCosContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Cosinus(expression, Notation.POSTFIX));
    }

    @Override
    public Expression visitTrigoPostfixTan(LabeledExprParser.TrigoPostfixTanContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Tangent(expression, Notation.POSTFIX));
    }

    @Override
    public Expression visitTrigoPostfixASin(LabeledExprParser.TrigoPostfixASinContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Arcsine(expression, Notation.POSTFIX));
    }

    @Override
    public Expression visitTrigoPostfixACos(LabeledExprParser.TrigoPostfixACosContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Arccosine(expression, Notation.POSTFIX));
    }

    @Override
    public Expression visitTrigoPostfixATan(LabeledExprParser.TrigoPostfixATanContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Arctangent(expression, Notation.POSTFIX));
    }

    @Override
    public Expression visitTrigoPostfixSinh(LabeledExprParser.TrigoPostfixSinhContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new HyperbolicSine(expression, Notation.POSTFIX));
    }

    @Override
    public Expression visitTrigoPostfixCosh(LabeledExprParser.TrigoPostfixCoshContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new HyperbolicCosine(expression, Notation.POSTFIX));
    }

    @Override
    public Expression visitTrigoPostfixTanh(LabeledExprParser.TrigoPostfixTanhContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new HyperbolicTangent(expression, Notation.POSTFIX));
    }

    @Override
    public Expression visitUnaryPostfixLog(LabeledExprParser.UnaryPostfixLogContext ctx) {
        return parseToUnaryOperator(ctx, expression -> new Logarithm(expression, Notation.POSTFIX));
    }

    /* __________________________________ NUMBER _______________________________ */

    @Override
    public Expression visitNumberInt(LabeledExprParser.NumberIntContext ctx) {
        return new MyInteger(new BigInteger(ctx.INT().getText()));
    }

    @Override
    public Expression visitNumberReal(LabeledExprParser.NumberRealContext ctx) {
        return new MyReal(ctx.FLOAT().getText());
    }

    @Override
    public Expression visitRational(LabeledExprParser.RationalContext ctx) {
        // We suppose that the rational has 3 child : the numerator, the operator `/`
        // and the denominator
        return MyRational.create(Integer.parseInt(ctx.getChild(0).getText()),
                Integer.parseInt(ctx.getChild(2).getText()));
    }

    @Override
    public Expression visitComplexImaginaryNumber(LabeledExprParser.ComplexImaginaryNumberContext ctx) {
        if (ctx.getChildCount() == 1) {
            return new MyComplex(new MyInteger(0), new MyInteger(1));
        }

        return new MyComplex(new MyInteger(0), (MyNumber) visit(ctx.getChild(0)));
    }

    @Override
    public Expression visitNumberNegation(LabeledExprParser.NumberNegationContext ctx) {
        // We are using infix as that is a special operation, this is simply applying a
        // negation to an atomic value
        return parseToUnaryOperator(ctx, expressions -> new Negation(expressions, Notation.INFIX));
    }

    @Override
    public Expression visitRandomInt(LabeledExprParser.RandomIntContext ctx) {
        return RandomGenerator.genInt(new BigInteger(ctx.INT().getText()));
    }

    @Override
    public Expression visitRandomReal(LabeledExprParser.RandomRealContext ctx) {
        return RandomGenerator.genReal();
    }

    @Override
    public Expression visitRandomRatio(LabeledExprParser.RandomRatioContext ctx) {
        return RandomGenerator
                .genRational(new BigInteger(ctx.getChild(2).getText()), new BigInteger(ctx.getChild(4).getText()));
    }

    @Override
    public Expression visitRandomComplex(LabeledExprParser.RandomComplexContext ctx) {
        return RandomGenerator.genComplex();
    }

    // __________________________________Constant Number__________________________

    @Override
    public Expression visitConstantPi(LabeledExprParser.ConstantPiContext ctx) {
        return ConstantNumber.PI;
    }

    @Override
    public Expression visitConstantEuler(LabeledExprParser.ConstantEulerContext ctx) {
        return ConstantNumber.EULER;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=Static Functions=-=-=-=-=-=-=-=-=-=-=-=-=
    /**
     * Parses the given context as expressions and feeds them to a binary operation.
     * 
     * @param ctx       The context to parse
     * @param operation The binary operation to build and to give the parsed
     *                  expressions as parameters.
     * @return The created operation
     * @param <E> The current parser rule context
     * @param <O> The type of operation to build
     */
    public <E extends ParserRuleContext, O extends BinaryOperation> O parseToBinaryOperator(E ctx,
            BuildOperationFunction<O> operation) {
        ArrayList<Expression> expressions = new ArrayList<>();
        Evaluator v;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            // Checks if the node is a token without any interesting values
            if (!(ctx.getChild(i) instanceof TerminalNode)) {
                v = new Evaluator();
                try {
                    visit(ctx.getChild(i)).accept(v);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } // FIXME : Adrien Fievet should have a look at that
                expressions.add(v.getResult());
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

    /**
     * Parses the given context as expressions and feeds them to a unary operation.
     * 
     * @param ctx       The context to parse.
     *                  This function assumes that the exploration can stop after
     *                  finding a branch that returned an expression as
     *                  a unary operator always as one argument.
     * @param operation The unary operation to build and to give the parsed
     *                  expression as a parameter
     *                  (under the form of an {@link ArrayList} composed of only one
     *                  element).
     * @return The created operation
     * @param <E> The current parser rule context
     * @param <O> The type of operation to build
     */
    public <E extends ParserRuleContext, O extends UnaryOperation> O parseToUnaryOperator(E ctx,
            BuildUnaryOperationFunction<O> operation) {
        Expression expression = null;
        Evaluator v;
        // Explore all path to find the argument to pass to the unary operator.
        for (int i = 0; i < ctx.getChildCount(); i++) {
            // Checks if the node is a token without any interesting values
            if (!(ctx.getChild(i) instanceof TerminalNode)) {
                v = new Evaluator();
                try {
                    visit(ctx.getChild(i)).accept(v);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } // FIXME : Adrien Fievet should have a look at that
                  // We can stop after finding the only expression as this is a unary operation
                expression = v.getResult();
                break;
            }
        }
        O res = null;
        try {
            if (expression == null) {
                throw new IllegalConstruction();
            }
            res = operation.build(expression);
        } catch (IllegalConstruction e) {
            throw new RuntimeException(e);
        }
        return res;
    }

}
