// Generated from LabeledProgrammer.g4 by ANTLR 4.9.1
package calculator.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledProgrammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledProgrammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code OperationImpl}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationImpl(LabeledProgrammerParser.OperationImplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationEquiv}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationEquiv(LabeledProgrammerParser.OperationEquivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationAnd}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationAnd(LabeledProgrammerParser.OperationAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationPrio}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationPrio(LabeledProgrammerParser.OperationPrioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationNand}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationNand(LabeledProgrammerParser.OperationNandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationNot}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationNot(LabeledProgrammerParser.OperationNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationConv}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationConv(LabeledProgrammerParser.OperationConvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationNumber}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationNumber(LabeledProgrammerParser.OperationNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationRshift}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationRshift(LabeledProgrammerParser.OperationRshiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationLshift}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationLshift(LabeledProgrammerParser.OperationLshiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationOr}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationOr(LabeledProgrammerParser.OperationOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationNor}
	 * labeled alternative in {@link LabeledProgrammerParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationNor(LabeledProgrammerParser.OperationNorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberBool}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberBool(LabeledProgrammerParser.NumberBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberBinary}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberBinary(LabeledProgrammerParser.NumberBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberOctal}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberOctal(LabeledProgrammerParser.NumberOctalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberDecimal}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberDecimal(LabeledProgrammerParser.NumberDecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberHexa}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberHexa(LabeledProgrammerParser.NumberHexaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberDefault}
	 * labeled alternative in {@link LabeledProgrammerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberDefault(LabeledProgrammerParser.NumberDefaultContext ctx);
}