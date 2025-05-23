// Generated from LabeledExpr.g4 by ANTLR 4.13.2
package calculator.parser.antlr;
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
	 * Enter a parse tree produced by the {@code EquationInfix}
	 * labeled alternative in {@link LabeledExprParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquationInfix(LabeledExprParser.EquationInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EquationInfix}
	 * labeled alternative in {@link LabeledExprParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquationInfix(LabeledExprParser.EquationInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EquationPostfix}
	 * labeled alternative in {@link LabeledExprParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquationPostfix(LabeledExprParser.EquationPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EquationPostfix}
	 * labeled alternative in {@link LabeledExprParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquationPostfix(LabeledExprParser.EquationPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EquationPrefix}
	 * labeled alternative in {@link LabeledExprParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquationPrefix(LabeledExprParser.EquationPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EquationPrefix}
	 * labeled alternative in {@link LabeledExprParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquationPrefix(LabeledExprParser.EquationPrefixContext ctx);
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
	 * Enter a parse tree produced by the {@code SumPostfixRoot}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void enterSumPostfixRoot(LabeledExprParser.SumPostfixRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPostfixRoot}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void exitSumPostfixRoot(LabeledExprParser.SumPostfixRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPostfixMod}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void enterSumPostfixMod(LabeledExprParser.SumPostfixModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPostfixMod}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void exitSumPostfixMod(LabeledExprParser.SumPostfixModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPostfixUnknown}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void enterSumPostfixUnknown(LabeledExprParser.SumPostfixUnknownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPostfixUnknown}
	 * labeled alternative in {@link LabeledExprParser#sumPostfix}.
	 * @param ctx the parse tree
	 */
	void exitSumPostfixUnknown(LabeledExprParser.SumPostfixUnknownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductPostfixExp}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 */
	void enterProductPostfixExp(LabeledExprParser.ProductPostfixExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductPostfixExp}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 */
	void exitProductPostfixExp(LabeledExprParser.ProductPostfixExpContext ctx);
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
	 * Enter a parse tree produced by the {@code ProductPostfixTrigo}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 */
	void enterProductPostfixTrigo(LabeledExprParser.ProductPostfixTrigoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductPostfixTrigo}
	 * labeled alternative in {@link LabeledExprParser#productPostfix}.
	 * @param ctx the parse tree
	 */
	void exitProductPostfixTrigo(LabeledExprParser.ProductPostfixTrigoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPostfixTrigo}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPostfixTrigo(LabeledExprParser.UnaryPostfixTrigoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPostfixTrigo}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPostfixTrigo(LabeledExprParser.UnaryPostfixTrigoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPostfixLog}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPostfixLog(LabeledExprParser.UnaryPostfixLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPostfixLog}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPostfixLog(LabeledExprParser.UnaryPostfixLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPostfixSqrt}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPostfixSqrt(LabeledExprParser.UnaryPostfixSqrtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPostfixSqrt}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPostfixSqrt(LabeledExprParser.UnaryPostfixSqrtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPostfixNegation}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPostfixNegation(LabeledExprParser.UnaryPostfixNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPostfixNegation}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPostfixNegation(LabeledExprParser.UnaryPostfixNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPostfixAbsolute}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPostfixAbsolute(LabeledExprParser.UnaryPostfixAbsoluteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPostfixAbsolute}
	 * labeled alternative in {@link LabeledExprParser#unaryPostfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPostfixAbsolute(LabeledExprParser.UnaryPostfixAbsoluteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixSin}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixSin(LabeledExprParser.TrigoPostfixSinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixSin}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixSin(LabeledExprParser.TrigoPostfixSinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixCos}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixCos(LabeledExprParser.TrigoPostfixCosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixCos}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixCos(LabeledExprParser.TrigoPostfixCosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixTan}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixTan(LabeledExprParser.TrigoPostfixTanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixTan}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixTan(LabeledExprParser.TrigoPostfixTanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixSinh}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixSinh(LabeledExprParser.TrigoPostfixSinhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixSinh}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixSinh(LabeledExprParser.TrigoPostfixSinhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixCosh}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixCosh(LabeledExprParser.TrigoPostfixCoshContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixCosh}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixCosh(LabeledExprParser.TrigoPostfixCoshContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixTanh}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixTanh(LabeledExprParser.TrigoPostfixTanhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixTanh}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixTanh(LabeledExprParser.TrigoPostfixTanhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixASin}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixASin(LabeledExprParser.TrigoPostfixASinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixASin}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixASin(LabeledExprParser.TrigoPostfixASinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixACos}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixACos(LabeledExprParser.TrigoPostfixACosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixACos}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixACos(LabeledExprParser.TrigoPostfixACosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixATan}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixATan(LabeledExprParser.TrigoPostfixATanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixATan}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixATan(LabeledExprParser.TrigoPostfixATanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixDegToRad}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixDegToRad(LabeledExprParser.TrigoPostfixDegToRadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixDegToRad}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixDegToRad(LabeledExprParser.TrigoPostfixDegToRadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPostfixRadToDeg}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPostfixRadToDeg(LabeledExprParser.TrigoPostfixRadToDegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPostfixRadToDeg}
	 * labeled alternative in {@link LabeledExprParser#trigoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPostfixRadToDeg(LabeledExprParser.TrigoPostfixRadToDegContext ctx);
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
	 * Enter a parse tree produced by the {@code AtomPostfixNumber}
	 * labeled alternative in {@link LabeledExprParser#atomPostfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomPostfixNumber(LabeledExprParser.AtomPostfixNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomPostfixNumber}
	 * labeled alternative in {@link LabeledExprParser#atomPostfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomPostfixNumber(LabeledExprParser.AtomPostfixNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#postfixBinaryArgs}.
	 * @param ctx the parse tree
	 */
	void enterPostfixBinaryArgs(LabeledExprParser.PostfixBinaryArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#postfixBinaryArgs}.
	 * @param ctx the parse tree
	 */
	void exitPostfixBinaryArgs(LabeledExprParser.PostfixBinaryArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#postfixUnaryArgs}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryArgs(LabeledExprParser.PostfixUnaryArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#postfixUnaryArgs}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryArgs(LabeledExprParser.PostfixUnaryArgsContext ctx);
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
	 * Enter a parse tree produced by the {@code SumPrefixRoot}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSumPrefixRoot(LabeledExprParser.SumPrefixRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPrefixRoot}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSumPrefixRoot(LabeledExprParser.SumPrefixRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPrefixMod}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSumPrefixMod(LabeledExprParser.SumPrefixModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPrefixMod}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSumPrefixMod(LabeledExprParser.SumPrefixModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumPrefixUnknown}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSumPrefixUnknown(LabeledExprParser.SumPrefixUnknownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumPrefixUnknown}
	 * labeled alternative in {@link LabeledExprParser#sumPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSumPrefixUnknown(LabeledExprParser.SumPrefixUnknownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductPrefixExp}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void enterProductPrefixExp(LabeledExprParser.ProductPrefixExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductPrefixExp}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void exitProductPrefixExp(LabeledExprParser.ProductPrefixExpContext ctx);
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
	 * Enter a parse tree produced by the {@code ProductPrefixUnary}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void enterProductPrefixUnary(LabeledExprParser.ProductPrefixUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductPrefixUnary}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void exitProductPrefixUnary(LabeledExprParser.ProductPrefixUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPrefixTrigo}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefixTrigo(LabeledExprParser.UnaryPrefixTrigoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPrefixTrigo}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefixTrigo(LabeledExprParser.UnaryPrefixTrigoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPrefixLog}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefixLog(LabeledExprParser.UnaryPrefixLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPrefixLog}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefixLog(LabeledExprParser.UnaryPrefixLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPrefixSqrt}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefixSqrt(LabeledExprParser.UnaryPrefixSqrtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPrefixSqrt}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefixSqrt(LabeledExprParser.UnaryPrefixSqrtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPrefixNegation}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefixNegation(LabeledExprParser.UnaryPrefixNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPrefixNegation}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefixNegation(LabeledExprParser.UnaryPrefixNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPrefixAbsolute}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefixAbsolute(LabeledExprParser.UnaryPrefixAbsoluteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPrefixAbsolute}
	 * labeled alternative in {@link LabeledExprParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefixAbsolute(LabeledExprParser.UnaryPrefixAbsoluteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixSin}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixSin(LabeledExprParser.TrigoPrefixSinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixSin}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixSin(LabeledExprParser.TrigoPrefixSinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixCos}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixCos(LabeledExprParser.TrigoPrefixCosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixCos}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixCos(LabeledExprParser.TrigoPrefixCosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixTan}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixTan(LabeledExprParser.TrigoPrefixTanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixTan}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixTan(LabeledExprParser.TrigoPrefixTanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixSinh}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixSinh(LabeledExprParser.TrigoPrefixSinhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixSinh}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixSinh(LabeledExprParser.TrigoPrefixSinhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixCosh}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixCosh(LabeledExprParser.TrigoPrefixCoshContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixCosh}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixCosh(LabeledExprParser.TrigoPrefixCoshContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixTanh}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixTanh(LabeledExprParser.TrigoPrefixTanhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixTanh}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixTanh(LabeledExprParser.TrigoPrefixTanhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixASin}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixASin(LabeledExprParser.TrigoPrefixASinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixASin}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixASin(LabeledExprParser.TrigoPrefixASinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixACos}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixACos(LabeledExprParser.TrigoPrefixACosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixACos}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixACos(LabeledExprParser.TrigoPrefixACosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixATan}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixATan(LabeledExprParser.TrigoPrefixATanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixATan}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixATan(LabeledExprParser.TrigoPrefixATanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixDegToRad}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixDegToRad(LabeledExprParser.TrigoPrefixDegToRadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixDegToRad}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixDegToRad(LabeledExprParser.TrigoPrefixDegToRadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoPrefixRadToDeg}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoPrefixRadToDeg(LabeledExprParser.TrigoPrefixRadToDegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoPrefixRadToDeg}
	 * labeled alternative in {@link LabeledExprParser#trigoPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoPrefixRadToDeg(LabeledExprParser.TrigoPrefixRadToDegContext ctx);
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
	 * Enter a parse tree produced by the {@code AtomPrefixNumber}
	 * labeled alternative in {@link LabeledExprParser#atomPrefix}.
	 * @param ctx the parse tree
	 */
	void enterAtomPrefixNumber(LabeledExprParser.AtomPrefixNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomPrefixNumber}
	 * labeled alternative in {@link LabeledExprParser#atomPrefix}.
	 * @param ctx the parse tree
	 */
	void exitAtomPrefixNumber(LabeledExprParser.AtomPrefixNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#prefixBinaryArgs}.
	 * @param ctx the parse tree
	 */
	void enterPrefixBinaryArgs(LabeledExprParser.PrefixBinaryArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#prefixBinaryArgs}.
	 * @param ctx the parse tree
	 */
	void exitPrefixBinaryArgs(LabeledExprParser.PrefixBinaryArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#prefixUnaryArgs}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryArgs(LabeledExprParser.PrefixUnaryArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#prefixUnaryArgs}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryArgs(LabeledExprParser.PrefixUnaryArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumInfixUnknown}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 */
	void enterSumInfixUnknown(LabeledExprParser.SumInfixUnknownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumInfixUnknown}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 */
	void exitSumInfixUnknown(LabeledExprParser.SumInfixUnknownContext ctx);
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
	 * Enter a parse tree produced by the {@code SumInfixMod}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 */
	void enterSumInfixMod(LabeledExprParser.SumInfixModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumInfixMod}
	 * labeled alternative in {@link LabeledExprParser#sumInfix}.
	 * @param ctx the parse tree
	 */
	void exitSumInfixMod(LabeledExprParser.SumInfixModContext ctx);
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
	 * Enter a parse tree produced by the {@code ProductInfixExpo}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 */
	void enterProductInfixExpo(LabeledExprParser.ProductInfixExpoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductInfixExpo}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 */
	void exitProductInfixExpo(LabeledExprParser.ProductInfixExpoContext ctx);
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
	 * Enter a parse tree produced by the {@code ProductInfixRoot}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 */
	void enterProductInfixRoot(LabeledExprParser.ProductInfixRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductInfixRoot}
	 * labeled alternative in {@link LabeledExprParser#productInfix}.
	 * @param ctx the parse tree
	 */
	void exitProductInfixRoot(LabeledExprParser.ProductInfixRootContext ctx);
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
	 * Enter a parse tree produced by the {@code ExpoInfixExpo}
	 * labeled alternative in {@link LabeledExprParser#expoInfix}.
	 * @param ctx the parse tree
	 */
	void enterExpoInfixExpo(LabeledExprParser.ExpoInfixExpoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpoInfixExpo}
	 * labeled alternative in {@link LabeledExprParser#expoInfix}.
	 * @param ctx the parse tree
	 */
	void exitExpoInfixExpo(LabeledExprParser.ExpoInfixExpoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpoInfixAtom}
	 * labeled alternative in {@link LabeledExprParser#expoInfix}.
	 * @param ctx the parse tree
	 */
	void enterExpoInfixAtom(LabeledExprParser.ExpoInfixAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpoInfixAtom}
	 * labeled alternative in {@link LabeledExprParser#expoInfix}.
	 * @param ctx the parse tree
	 */
	void exitExpoInfixAtom(LabeledExprParser.ExpoInfixAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomInfixUnary}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomInfixUnary(LabeledExprParser.AtomInfixUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomInfixUnary}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomInfixUnary(LabeledExprParser.AtomInfixUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomInfixNumber}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomInfixNumber(LabeledExprParser.AtomInfixNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomInfixNumber}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomInfixNumber(LabeledExprParser.AtomInfixNumberContext ctx);
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
	 * Enter a parse tree produced by the {@code UnaryInfixTrigo}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryInfixTrigo(LabeledExprParser.UnaryInfixTrigoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryInfixTrigo}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryInfixTrigo(LabeledExprParser.UnaryInfixTrigoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryInfixLog}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryInfixLog(LabeledExprParser.UnaryInfixLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryInfixLog}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryInfixLog(LabeledExprParser.UnaryInfixLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryInfixSqrt}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryInfixSqrt(LabeledExprParser.UnaryInfixSqrtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryInfixSqrt}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryInfixSqrt(LabeledExprParser.UnaryInfixSqrtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryInfixAbsolute}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryInfixAbsolute(LabeledExprParser.UnaryInfixAbsoluteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryInfixAbsolute}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryInfixAbsolute(LabeledExprParser.UnaryInfixAbsoluteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryInfixNegation}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryInfixNegation(LabeledExprParser.UnaryInfixNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryInfixNegation}
	 * labeled alternative in {@link LabeledExprParser#unaryInfix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryInfixNegation(LabeledExprParser.UnaryInfixNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixSin}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixSin(LabeledExprParser.TrigoInfixSinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixSin}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixSin(LabeledExprParser.TrigoInfixSinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixCos}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixCos(LabeledExprParser.TrigoInfixCosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixCos}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixCos(LabeledExprParser.TrigoInfixCosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixTan}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixTan(LabeledExprParser.TrigoInfixTanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixTan}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixTan(LabeledExprParser.TrigoInfixTanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixSinh}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixSinh(LabeledExprParser.TrigoInfixSinhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixSinh}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixSinh(LabeledExprParser.TrigoInfixSinhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixCosh}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixCosh(LabeledExprParser.TrigoInfixCoshContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixCosh}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixCosh(LabeledExprParser.TrigoInfixCoshContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixTanh}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixTanh(LabeledExprParser.TrigoInfixTanhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixTanh}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixTanh(LabeledExprParser.TrigoInfixTanhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixASin}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixASin(LabeledExprParser.TrigoInfixASinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixASin}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixASin(LabeledExprParser.TrigoInfixASinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixACos}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixACos(LabeledExprParser.TrigoInfixACosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixACos}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixACos(LabeledExprParser.TrigoInfixACosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixATan}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixATan(LabeledExprParser.TrigoInfixATanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixATan}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixATan(LabeledExprParser.TrigoInfixATanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixDegToRad}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixDegToRad(LabeledExprParser.TrigoInfixDegToRadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixDegToRad}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixDegToRad(LabeledExprParser.TrigoInfixDegToRadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrigoInfixRadToDeg}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void enterTrigoInfixRadToDeg(LabeledExprParser.TrigoInfixRadToDegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrigoInfixRadToDeg}
	 * labeled alternative in {@link LabeledExprParser#trigoInfix}.
	 * @param ctx the parse tree
	 */
	void exitTrigoInfixRadToDeg(LabeledExprParser.TrigoInfixRadToDegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnknownUnknownExponentNumber}
	 * labeled alternative in {@link LabeledExprParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknownUnknownExponentNumber(LabeledExprParser.UnknownUnknownExponentNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnknownUnknownExponentNumber}
	 * labeled alternative in {@link LabeledExprParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknownUnknownExponentNumber(LabeledExprParser.UnknownUnknownExponentNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnknownUnknownNumber}
	 * labeled alternative in {@link LabeledExprParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknownUnknownNumber(LabeledExprParser.UnknownUnknownNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnknownUnknownNumber}
	 * labeled alternative in {@link LabeledExprParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknownUnknownNumber(LabeledExprParser.UnknownUnknownNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnknownNumber}
	 * labeled alternative in {@link LabeledExprParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknownNumber(LabeledExprParser.UnknownNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnknownNumber}
	 * labeled alternative in {@link LabeledExprParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknownNumber(LabeledExprParser.UnknownNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexImaginaryNumber}
	 * labeled alternative in {@link LabeledExprParser#complexNumber}.
	 * @param ctx the parse tree
	 */
	void enterComplexImaginaryNumber(LabeledExprParser.ComplexImaginaryNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexImaginaryNumber}
	 * labeled alternative in {@link LabeledExprParser#complexNumber}.
	 * @param ctx the parse tree
	 */
	void exitComplexImaginaryNumber(LabeledExprParser.ComplexImaginaryNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexRealNumber}
	 * labeled alternative in {@link LabeledExprParser#complexNumber}.
	 * @param ctx the parse tree
	 */
	void enterComplexRealNumber(LabeledExprParser.ComplexRealNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexRealNumber}
	 * labeled alternative in {@link LabeledExprParser#complexNumber}.
	 * @param ctx the parse tree
	 */
	void exitComplexRealNumber(LabeledExprParser.ComplexRealNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberContant}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberContant(LabeledExprParser.NumberContantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberContant}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberContant(LabeledExprParser.NumberContantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberRational}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberRational(LabeledExprParser.NumberRationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberRational}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberRational(LabeledExprParser.NumberRationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberInfinity}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberInfinity(LabeledExprParser.NumberInfinityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberInfinity}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberInfinity(LabeledExprParser.NumberInfinityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberReal}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberReal(LabeledExprParser.NumberRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberReal}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberReal(LabeledExprParser.NumberRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberNegation}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberNegation(LabeledExprParser.NumberNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberNegation}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberNegation(LabeledExprParser.NumberNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberENotation}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberENotation(LabeledExprParser.NumberENotationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberENotation}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberENotation(LabeledExprParser.NumberENotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberRandom}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberRandom(LabeledExprParser.NumberRandomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberRandom}
	 * labeled alternative in {@link LabeledExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberRandom(LabeledExprParser.NumberRandomContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code RandomInt}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandomInt(LabeledExprParser.RandomIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RandomInt}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandomInt(LabeledExprParser.RandomIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RandomReal}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandomReal(LabeledExprParser.RandomRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RandomReal}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandomReal(LabeledExprParser.RandomRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RandomRatio}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandomRatio(LabeledExprParser.RandomRatioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RandomRatio}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandomRatio(LabeledExprParser.RandomRatioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RandomComplex}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandomComplex(LabeledExprParser.RandomComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RandomComplex}
	 * labeled alternative in {@link LabeledExprParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandomComplex(LabeledExprParser.RandomComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantPi}
	 * labeled alternative in {@link LabeledExprParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstantPi(LabeledExprParser.ConstantPiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantPi}
	 * labeled alternative in {@link LabeledExprParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstantPi(LabeledExprParser.ConstantPiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantEuler}
	 * labeled alternative in {@link LabeledExprParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstantEuler(LabeledExprParser.ConstantEulerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantEuler}
	 * labeled alternative in {@link LabeledExprParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstantEuler(LabeledExprParser.ConstantEulerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfinityPositive}
	 * labeled alternative in {@link LabeledExprParser#infinity}.
	 * @param ctx the parse tree
	 */
	void enterInfinityPositive(LabeledExprParser.InfinityPositiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfinityPositive}
	 * labeled alternative in {@link LabeledExprParser#infinity}.
	 * @param ctx the parse tree
	 */
	void exitInfinityPositive(LabeledExprParser.InfinityPositiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfinityNegative}
	 * labeled alternative in {@link LabeledExprParser#infinity}.
	 * @param ctx the parse tree
	 */
	void enterInfinityNegative(LabeledExprParser.InfinityNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfinityNegative}
	 * labeled alternative in {@link LabeledExprParser#infinity}.
	 * @param ctx the parse tree
	 */
	void exitInfinityNegative(LabeledExprParser.InfinityNegativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#rational}.
	 * @param ctx the parse tree
	 */
	void enterRational(LabeledExprParser.RationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#rational}.
	 * @param ctx the parse tree
	 */
	void exitRational(LabeledExprParser.RationalContext ctx);
}