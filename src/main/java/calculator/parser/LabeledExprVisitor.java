// Generated from calculator/parser/LabeledExpr.g4 by ANTLR 4.9.1
package calculator.parser;
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
	 * Visit a parse tree produced by the {@code ExprInfix}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInfix(LabeledExprParser.ExprInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrefix}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrefix(LabeledExprParser.ExprPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPostfix}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPostfix(LabeledExprParser.ExprPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPostfix(LabeledExprParser.SumPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductPostfix(LabeledExprParser.ProductPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#argsPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsPostfix(LabeledExprParser.ArgsPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPrefix(LabeledExprParser.SumPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductPrefix(LabeledExprParser.ProductPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#argsPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsPrefix(LabeledExprParser.ArgsPrefixContext ctx);
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
	 * Visit a parse tree produced by the {@code AtomInfixNegation}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomInfixNegation(LabeledExprParser.AtomInfixNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomInfixSum}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomInfixSum(LabeledExprParser.AtomInfixSumContext ctx);
}