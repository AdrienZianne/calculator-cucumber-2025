// Generated from calculator/parser/antlr/LabeledExpr.g4 by ANTLR 4.9.1
package calculator.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LabeledExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPostfixProd}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPostfixProd(LabeledExprParser.SumPostfixProdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPostfixSum}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPostfixSum(LabeledExprParser.SumPostfixSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPostfixDiff}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPostfixDiff(LabeledExprParser.SumPostfixDiffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductPostfixMult}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductPostfixMult(LabeledExprParser.ProductPostfixMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductPostfixDiv}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductPostfixDiv(LabeledExprParser.ProductPostfixDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomPostfixSum}
	 * labeled alternative in {@link LabeledExprParser#atomPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomPostfixSum(LabeledExprParser.AtomPostfixSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomPostfixInt}
	 * labeled alternative in {@link LabeledExprParser#atomPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomPostfixInt(LabeledExprParser.AtomPostfixIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPrefixProd}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPrefixProd(LabeledExprParser.SumPrefixProdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPrefixSum}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPrefixSum(LabeledExprParser.SumPrefixSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPrefixDiff}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPrefixDiff(LabeledExprParser.SumPrefixDiffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductPrefixMult}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductPrefixMult(LabeledExprParser.ProductPrefixMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductPrefixDiv}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductPrefixDiv(LabeledExprParser.ProductPrefixDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomPrefixSum}
	 * labeled alternative in {@link LabeledExprParser#atomPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomPrefixSum(LabeledExprParser.AtomPrefixSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomPrefixInt}
	 * labeled alternative in {@link LabeledExprParser#atomPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomPrefixInt(LabeledExprParser.AtomPrefixIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumInfixAdd}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumInfixAdd(LabeledExprParser.SumInfixAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumInfixDiff}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumInfixDiff(LabeledExprParser.SumInfixDiffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumInfixProd}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumInfixProd(LabeledExprParser.SumInfixProdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductInfixAtom}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductInfixAtom(LabeledExprParser.ProductInfixAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductInfixMult}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductInfixMult(LabeledExprParser.ProductInfixMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductInfixDiv}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductInfixDiv(LabeledExprParser.ProductInfixDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomInfixInt}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomInfixInt(LabeledExprParser.AtomInfixIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomInfixNeg}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomInfixNeg(LabeledExprParser.AtomInfixNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomInfixSum}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomInfixSum(LabeledExprParser.AtomInfixSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberInt}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInt(LabeledExprParser.NumberIntContext ctx);
}