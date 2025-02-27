// Generated from calculator/parser/LabeledExpr.g4 by ANTLR 4.9.1
package calculator.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExprParser}.
 */
public interface LabeledExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LabeledExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LabeledExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPostfixProd}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void enterSumPostfixProd(LabeledExprParser.SumPostfixProdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPostfixProd}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void exitSumPostfixProd(LabeledExprParser.SumPostfixProdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPostfixSum}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void enterSumPostfixSum(LabeledExprParser.SumPostfixSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPostfixSum}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void exitSumPostfixSum(LabeledExprParser.SumPostfixSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPostfixDiff}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void enterSumPostfixDiff(LabeledExprParser.SumPostfixDiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPostfixDiff}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void exitSumPostfixDiff(LabeledExprParser.SumPostfixDiffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductPostfixMult}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 */
	void enterProductPostfixMult(LabeledExprParser.ProductPostfixMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductPostfixMult}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 */
	void exitProductPostfixMult(LabeledExprParser.ProductPostfixMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductPostfixDiv}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 */
	void enterProductPostfixDiv(LabeledExprParser.ProductPostfixDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductPostfixDiv}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 */
	void exitProductPostfixDiv(LabeledExprParser.ProductPostfixDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomPostfixSum}
	 * labeled alternative in {@link LabeledExprParser#atomPostfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomPostfixSum(LabeledExprParser.AtomPostfixSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomPostfixSum}
	 * labeled alternative in {@link LabeledExprParser#atomPostfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomPostfixSum(LabeledExprParser.AtomPostfixSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomPostfixInt}
	 * labeled alternative in {@link LabeledExprParser#atomPostfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomPostfixInt(LabeledExprParser.AtomPostfixIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomPostfixInt}
	 * labeled alternative in {@link LabeledExprParser#atomPostfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomPostfixInt(LabeledExprParser.AtomPostfixIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPrefixProd}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSumPrefixProd(LabeledExprParser.SumPrefixProdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPrefixProd}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSumPrefixProd(LabeledExprParser.SumPrefixProdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPrefixSum}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSumPrefixSum(LabeledExprParser.SumPrefixSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPrefixSum}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSumPrefixSum(LabeledExprParser.SumPrefixSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPrefixDiff}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSumPrefixDiff(LabeledExprParser.SumPrefixDiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPrefixDiff}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSumPrefixDiff(LabeledExprParser.SumPrefixDiffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductPrefixMult}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void enterProductPrefixMult(LabeledExprParser.ProductPrefixMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductPrefixMult}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void exitProductPrefixMult(LabeledExprParser.ProductPrefixMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductPrefixDiv}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void enterProductPrefixDiv(LabeledExprParser.ProductPrefixDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductPrefixDiv}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void exitProductPrefixDiv(LabeledExprParser.ProductPrefixDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomPrefixSum}
	 * labeled alternative in {@link LabeledExprParser#atomPrefix}.
	 * @param ctx the parse tree
	 */
	void enterAtomPrefixSum(LabeledExprParser.AtomPrefixSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomPrefixSum}
	 * labeled alternative in {@link LabeledExprParser#atomPrefix}.
	 * @param ctx the parse tree
	 */
	void exitAtomPrefixSum(LabeledExprParser.AtomPrefixSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomPrefixInt}
	 * labeled alternative in {@link LabeledExprParser#atomPrefix}.
	 * @param ctx the parse tree
	 */
	void enterAtomPrefixInt(LabeledExprParser.AtomPrefixIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomPrefixInt}
	 * labeled alternative in {@link LabeledExprParser#atomPrefix}.
	 * @param ctx the parse tree
	 */
	void exitAtomPrefixInt(LabeledExprParser.AtomPrefixIntContext ctx);
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
	 * Enter a parse tree produced by the {@code AtomInfixNeg}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomInfixNeg(LabeledExprParser.AtomInfixNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomInfixNeg}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomInfixNeg(LabeledExprParser.AtomInfixNegContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code NumberInt}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberInt(LabeledExprParser.NumberIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberInt}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberInt(LabeledExprParser.NumberIntContext ctx);
}