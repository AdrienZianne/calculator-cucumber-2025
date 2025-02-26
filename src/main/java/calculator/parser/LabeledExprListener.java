// Generated from calculator/parser/LabeledExpr.g4 by ANTLR 4.9.1
package calculator.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExprParser}.
 */
public interface LabeledExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ExprInfix}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInfix(LabeledExprParser.ExprInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInfix}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInfix(LabeledExprParser.ExprInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPrefix}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPrefix(LabeledExprParser.ExprPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPrefix}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPrefix(LabeledExprParser.ExprPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPostfix}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPostfix(LabeledExprParser.ExprPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPostfix}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPostfix(LabeledExprParser.ExprPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void enterSumPostfix(LabeledExprParser.SumPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void exitSumPostfix(LabeledExprParser.SumPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 */
	void enterProductPostfix(LabeledExprParser.ProductPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 */
	void exitProductPostfix(LabeledExprParser.ProductPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#argsPostfix}.
	 * @param ctx the parse tree
	 */
	void enterArgsPostfix(LabeledExprParser.ArgsPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#argsPostfix}.
	 * @param ctx the parse tree
	 */
	void exitArgsPostfix(LabeledExprParser.ArgsPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSumPrefix(LabeledExprParser.SumPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSumPrefix(LabeledExprParser.SumPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void enterProductPrefix(LabeledExprParser.ProductPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void exitProductPrefix(LabeledExprParser.ProductPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#argsPrefix}.
	 * @param ctx the parse tree
	 */
	void enterArgsPrefix(LabeledExprParser.ArgsPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#argsPrefix}.
	 * @param ctx the parse tree
	 */
	void exitArgsPrefix(LabeledExprParser.ArgsPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumInfixAdd}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 */
	void enterSumInfixAdd(LabeledExprParser.SumInfixAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumInfixAdd}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 */
	void exitSumInfixAdd(LabeledExprParser.SumInfixAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumInfixDiff}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 */
	void enterSumInfixDiff(LabeledExprParser.SumInfixDiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumInfixDiff}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 */
	void exitSumInfixDiff(LabeledExprParser.SumInfixDiffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumInfixProd}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 */
	void enterSumInfixProd(LabeledExprParser.SumInfixProdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumInfixProd}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 */
	void exitSumInfixProd(LabeledExprParser.SumInfixProdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductInfixAtom}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 */
	void enterProductInfixAtom(LabeledExprParser.ProductInfixAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductInfixAtom}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 */
	void exitProductInfixAtom(LabeledExprParser.ProductInfixAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductInfixMult}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 */
	void enterProductInfixMult(LabeledExprParser.ProductInfixMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductInfixMult}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 */
	void exitProductInfixMult(LabeledExprParser.ProductInfixMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductInfixDiv}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 */
	void enterProductInfixDiv(LabeledExprParser.ProductInfixDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductInfixDiv}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 */
	void exitProductInfixDiv(LabeledExprParser.ProductInfixDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomInfixInt}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomInfixInt(LabeledExprParser.AtomInfixIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomInfixInt}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomInfixInt(LabeledExprParser.AtomInfixIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomInfixNegation}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomInfixNegation(LabeledExprParser.AtomInfixNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomInfixNegation}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomInfixNegation(LabeledExprParser.AtomInfixNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomInfixSum}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomInfixSum(LabeledExprParser.AtomInfixSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomInfixSum}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomInfixSum(LabeledExprParser.AtomInfixSumContext ctx);
}