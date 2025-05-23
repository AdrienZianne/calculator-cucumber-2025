// Generated from LabeledExpr.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by the {@code EquationInfix}
	 * labeled alternative in {@link LabeledExprParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationInfix(LabeledExprParser.EquationInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EquationPostfix}
	 * labeled alternative in {@link LabeledExprParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationPostfix(LabeledExprParser.EquationPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EquationPrefix}
	 * labeled alternative in {@link LabeledExprParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationPrefix(LabeledExprParser.EquationPrefixContext ctx);
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
	 * Visit a parse tree produced by the {@code SumPostfixRoot}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPostfixRoot(LabeledExprParser.SumPostfixRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPostfixMod}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPostfixMod(LabeledExprParser.SumPostfixModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPostfixUnknown}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPostfixUnknown(LabeledExprParser.SumPostfixUnknownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductPostfixExp}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductPostfixExp(LabeledExprParser.ProductPostfixExpContext ctx);
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
	 * Visit a parse tree produced by the {@code ProductPostfixTrigo}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductPostfixTrigo(LabeledExprParser.ProductPostfixTrigoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPostfixTrigo}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPostfixTrigo(LabeledExprParser.UnaryPostfixTrigoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPostfixLog}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPostfixLog(LabeledExprParser.UnaryPostfixLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPostfixSqrt}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPostfixSqrt(LabeledExprParser.UnaryPostfixSqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPostfixNegation}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPostfixNegation(LabeledExprParser.UnaryPostfixNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPostfixAbsolute}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPostfixAbsolute(LabeledExprParser.UnaryPostfixAbsoluteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixSin}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixSin(LabeledExprParser.TrigoPostfixSinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixCos}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixCos(LabeledExprParser.TrigoPostfixCosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixTan}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixTan(LabeledExprParser.TrigoPostfixTanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixSinh}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixSinh(LabeledExprParser.TrigoPostfixSinhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixCosh}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixCosh(LabeledExprParser.TrigoPostfixCoshContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixTanh}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixTanh(LabeledExprParser.TrigoPostfixTanhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixASin}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixASin(LabeledExprParser.TrigoPostfixASinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixACos}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixACos(LabeledExprParser.TrigoPostfixACosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixATan}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixATan(LabeledExprParser.TrigoPostfixATanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixDegToRad}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixDegToRad(LabeledExprParser.TrigoPostfixDegToRadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPostfixRadToDeg}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPostfixRadToDeg(LabeledExprParser.TrigoPostfixRadToDegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomPostfixSum}
	 * labeled alternative in {@link LabeledExprParser#atomPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomPostfixSum(LabeledExprParser.AtomPostfixSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomPostfixNumber}
	 * labeled alternative in {@link LabeledExprParser#atomPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomPostfixNumber(LabeledExprParser.AtomPostfixNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#postfixBinaryArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixBinaryArgs(LabeledExprParser.PostfixBinaryArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#postfixUnaryArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryArgs(LabeledExprParser.PostfixUnaryArgsContext ctx);
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
	 * Visit a parse tree produced by the {@code SumPrefixRoot}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPrefixRoot(LabeledExprParser.SumPrefixRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPrefixMod}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPrefixMod(LabeledExprParser.SumPrefixModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumPrefixUnknown}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumPrefixUnknown(LabeledExprParser.SumPrefixUnknownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductPrefixExp}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductPrefixExp(LabeledExprParser.ProductPrefixExpContext ctx);
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
	 * Visit a parse tree produced by the {@code ProductPrefixUnary}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductPrefixUnary(LabeledExprParser.ProductPrefixUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPrefixTrigo}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefixTrigo(LabeledExprParser.UnaryPrefixTrigoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPrefixLog}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefixLog(LabeledExprParser.UnaryPrefixLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPrefixSqrt}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefixSqrt(LabeledExprParser.UnaryPrefixSqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPrefixNegation}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefixNegation(LabeledExprParser.UnaryPrefixNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPrefixAbsolute}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefixAbsolute(LabeledExprParser.UnaryPrefixAbsoluteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixSin}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixSin(LabeledExprParser.TrigoPrefixSinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixCos}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixCos(LabeledExprParser.TrigoPrefixCosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixTan}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixTan(LabeledExprParser.TrigoPrefixTanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixSinh}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixSinh(LabeledExprParser.TrigoPrefixSinhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixCosh}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixCosh(LabeledExprParser.TrigoPrefixCoshContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixTanh}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixTanh(LabeledExprParser.TrigoPrefixTanhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixASin}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixASin(LabeledExprParser.TrigoPrefixASinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixACos}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixACos(LabeledExprParser.TrigoPrefixACosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixATan}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixATan(LabeledExprParser.TrigoPrefixATanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixDegToRad}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixDegToRad(LabeledExprParser.TrigoPrefixDegToRadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoPrefixRadToDeg}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoPrefixRadToDeg(LabeledExprParser.TrigoPrefixRadToDegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomPrefixSum}
	 * labeled alternative in {@link LabeledExprParser#atomPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomPrefixSum(LabeledExprParser.AtomPrefixSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomPrefixNumber}
	 * labeled alternative in {@link LabeledExprParser#atomPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomPrefixNumber(LabeledExprParser.AtomPrefixNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prefixBinaryArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixBinaryArgs(LabeledExprParser.PrefixBinaryArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prefixUnaryArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryArgs(LabeledExprParser.PrefixUnaryArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumInfixUnknown}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumInfixUnknown(LabeledExprParser.SumInfixUnknownContext ctx);
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
	 * Visit a parse tree produced by the {@code SumInfixMod}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumInfixMod(LabeledExprParser.SumInfixModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumInfixProd}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumInfixProd(LabeledExprParser.SumInfixProdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductInfixExpo}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductInfixExpo(LabeledExprParser.ProductInfixExpoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductInfixAtom}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductInfixAtom(LabeledExprParser.ProductInfixAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProductInfixRoot}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductInfixRoot(LabeledExprParser.ProductInfixRootContext ctx);
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
	 * Visit a parse tree produced by the {@code ExpoInfixExpo}
	 * labeled alternative in {@link LabeledExprParser#expoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpoInfixExpo(LabeledExprParser.ExpoInfixExpoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpoInfixAtom}
	 * labeled alternative in {@link LabeledExprParser#expoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpoInfixAtom(LabeledExprParser.ExpoInfixAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomInfixUnary}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomInfixUnary(LabeledExprParser.AtomInfixUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomInfixNumber}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomInfixNumber(LabeledExprParser.AtomInfixNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomInfixSum}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomInfixSum(LabeledExprParser.AtomInfixSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryInfixTrigo}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryInfixTrigo(LabeledExprParser.UnaryInfixTrigoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryInfixLog}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryInfixLog(LabeledExprParser.UnaryInfixLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryInfixSqrt}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryInfixSqrt(LabeledExprParser.UnaryInfixSqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryInfixAbsolute}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryInfixAbsolute(LabeledExprParser.UnaryInfixAbsoluteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryInfixNegation}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryInfixNegation(LabeledExprParser.UnaryInfixNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixSin}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixSin(LabeledExprParser.TrigoInfixSinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixCos}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixCos(LabeledExprParser.TrigoInfixCosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixTan}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixTan(LabeledExprParser.TrigoInfixTanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixSinh}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixSinh(LabeledExprParser.TrigoInfixSinhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixCosh}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixCosh(LabeledExprParser.TrigoInfixCoshContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixTanh}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixTanh(LabeledExprParser.TrigoInfixTanhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixASin}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixASin(LabeledExprParser.TrigoInfixASinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixACos}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixACos(LabeledExprParser.TrigoInfixACosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixATan}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixATan(LabeledExprParser.TrigoInfixATanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixDegToRad}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixDegToRad(LabeledExprParser.TrigoInfixDegToRadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrigoInfixRadToDeg}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigoInfixRadToDeg(LabeledExprParser.TrigoInfixRadToDegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnknownUnknownExponentNumber}
	 * labeled alternative in {@link LabeledExprParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownUnknownExponentNumber(LabeledExprParser.UnknownUnknownExponentNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnknownUnknownNumber}
	 * labeled alternative in {@link LabeledExprParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownUnknownNumber(LabeledExprParser.UnknownUnknownNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnknownNumber}
	 * labeled alternative in {@link LabeledExprParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownNumber(LabeledExprParser.UnknownNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexImaginaryNumber}
	 * labeled alternative in {@link LabeledExprParser#complexNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexImaginaryNumber(LabeledExprParser.ComplexImaginaryNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexRealNumber}
	 * labeled alternative in {@link LabeledExprParser#complexNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexRealNumber(LabeledExprParser.ComplexRealNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberContant}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberContant(LabeledExprParser.NumberContantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberRational}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberRational(LabeledExprParser.NumberRationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberInfinity}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInfinity(LabeledExprParser.NumberInfinityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberReal}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberReal(LabeledExprParser.NumberRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberNegation}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberNegation(LabeledExprParser.NumberNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberENotation}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberENotation(LabeledExprParser.NumberENotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberRandom}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberRandom(LabeledExprParser.NumberRandomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberInt}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInt(LabeledExprParser.NumberIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RandomInt}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomInt(LabeledExprParser.RandomIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RandomReal}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomReal(LabeledExprParser.RandomRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RandomRatio}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomRatio(LabeledExprParser.RandomRatioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RandomComplex}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomComplex(LabeledExprParser.RandomComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantPi}
	 * labeled alternative in {@link LabeledExprParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantPi(LabeledExprParser.ConstantPiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantEuler}
	 * labeled alternative in {@link LabeledExprParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantEuler(LabeledExprParser.ConstantEulerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfinityPositive}
	 * labeled alternative in {@link LabeledExprParser#infinity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfinityPositive(LabeledExprParser.InfinityPositiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfinityNegative}
	 * labeled alternative in {@link LabeledExprParser#infinity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfinityNegative(LabeledExprParser.InfinityNegativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#rational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRational(LabeledExprParser.RationalContext ctx);
}