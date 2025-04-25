// Generated from LabeledProgrammer.g4 by ANTLR 4.13.2
package calculator.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledProgrammerParser}.
 */
public interface LabeledProgrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code OperationXor}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationXor(LabeledProgrammerParser.OperationXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationXor}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationXor(LabeledProgrammerParser.OperationXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationEquiv}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationEquiv(LabeledProgrammerParser.OperationEquivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationEquiv}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationEquiv(LabeledProgrammerParser.OperationEquivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationAnd}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationAnd(LabeledProgrammerParser.OperationAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationAnd}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationAnd(LabeledProgrammerParser.OperationAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationNand}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationNand(LabeledProgrammerParser.OperationNandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationNand}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationNand(LabeledProgrammerParser.OperationNandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationConv}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationConv(LabeledProgrammerParser.OperationConvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationConv}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationConv(LabeledProgrammerParser.OperationConvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationNumber}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationNumber(LabeledProgrammerParser.OperationNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationNumber}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationNumber(LabeledProgrammerParser.OperationNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationLshift}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationLshift(LabeledProgrammerParser.OperationLshiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationLshift}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationLshift(LabeledProgrammerParser.OperationLshiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationOr}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationOr(LabeledProgrammerParser.OperationOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationOr}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationOr(LabeledProgrammerParser.OperationOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationImpl}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationImpl(LabeledProgrammerParser.OperationImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationImpl}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationImpl(LabeledProgrammerParser.OperationImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationPrio}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationPrio(LabeledProgrammerParser.OperationPrioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationPrio}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationPrio(LabeledProgrammerParser.OperationPrioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationNot}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationNot(LabeledProgrammerParser.OperationNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationNot}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationNot(LabeledProgrammerParser.OperationNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationRshift}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationRshift(LabeledProgrammerParser.OperationRshiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationRshift}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationRshift(LabeledProgrammerParser.OperationRshiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationNor}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperationNor(LabeledProgrammerParser.OperationNorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationNor}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperationNor(LabeledProgrammerParser.OperationNorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberBool}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberBool(LabeledProgrammerParser.NumberBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberBool}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberBool(LabeledProgrammerParser.NumberBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberBinary}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberBinary(LabeledProgrammerParser.NumberBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberBinary}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberBinary(LabeledProgrammerParser.NumberBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberOctal}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberOctal(LabeledProgrammerParser.NumberOctalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberOctal}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberOctal(LabeledProgrammerParser.NumberOctalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberDecimal}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberDecimal(LabeledProgrammerParser.NumberDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberDecimal}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberDecimal(LabeledProgrammerParser.NumberDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberHexa}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberHexa(LabeledProgrammerParser.NumberHexaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberHexa}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberHexa(LabeledProgrammerParser.NumberHexaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberDefault}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberDefault(LabeledProgrammerParser.NumberDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberDefault}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberDefault(LabeledProgrammerParser.NumberDefaultContext ctx);
}