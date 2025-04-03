// Generated from calculator/parser/antlr/LabeledExpr.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by the {@code ProductPrefixTrigo}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void enterProductPrefixTrigo(LabeledExprParser.ProductPrefixTrigoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductPrefixTrigo}
	 * labeled alternative in {@link LabeledExprParser#productPrefix}.
	 * @param ctx the parse tree
	 */
	void exitProductPrefixTrigo(LabeledExprParser.ProductPrefixTrigoContext ctx);
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
	 * Enter a parse tree produced by the {@code AtomInfixTrig}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomInfixTrig(LabeledExprParser.AtomInfixTrigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomInfixTrig}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomInfixTrig(LabeledExprParser.AtomInfixTrigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomInfixComplex}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void enterAtomInfixComplex(LabeledExprParser.AtomInfixComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomInfixComplex}
	 * labeled alternative in {@link LabeledExprParser#atomInfix}.
	 * @param ctx the parse tree
	 */
	void exitAtomInfixComplex(LabeledExprParser.AtomInfixComplexContext ctx);
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