// Generated from LabeledSettings.g4 by ANTLR 4.13.2
package calculator.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledSettingsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledSettingsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code SettingsQuit}
	 * labeled alternative in {@link LabeledSettingsParser#setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingsQuit(LabeledSettingsParser.SettingsQuitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SettingsHelp}
	 * labeled alternative in {@link LabeledSettingsParser#setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingsHelp(LabeledSettingsParser.SettingsHelpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SettingsListOptions}
	 * labeled alternative in {@link LabeledSettingsParser#setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingsListOptions(LabeledSettingsParser.SettingsListOptionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SettingsInfoOptions}
	 * labeled alternative in {@link LabeledSettingsParser#setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingsInfoOptions(LabeledSettingsParser.SettingsInfoOptionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SettingsClear}
	 * labeled alternative in {@link LabeledSettingsParser#setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingsClear(LabeledSettingsParser.SettingsClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SettingsOption}
	 * labeled alternative in {@link LabeledSettingsParser#setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingsOption(LabeledSettingsParser.SettingsOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoMode}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoMode(LabeledSettingsParser.InfoModeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoRealPrecision}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoRealPrecision(LabeledSettingsParser.InfoRealPrecisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoRoundingMode}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoRoundingMode(LabeledSettingsParser.InfoRoundingModeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoUseRealNotation}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoUseRealNotation(LabeledSettingsParser.InfoUseRealNotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoUseScientificNotation}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoUseScientificNotation(LabeledSettingsParser.InfoUseScientificNotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoScNotationMaxLeft}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoScNotationMaxLeft(LabeledSettingsParser.InfoScNotationMaxLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoScNotationMaxRight}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoScNotationMaxRight(LabeledSettingsParser.InfoScNotationMaxRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoUseDegrees}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoUseDegrees(LabeledSettingsParser.InfoUseDegreesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoSeed}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoSeed(LabeledSettingsParser.InfoSeedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoBaseNotationConvention}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoBaseNotationConvention(LabeledSettingsParser.InfoBaseNotationConventionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfoLogicalSymbol}
	 * labeled alternative in {@link LabeledSettingsParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfoLogicalSymbol(LabeledSettingsParser.InfoLogicalSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionMode}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionMode(LabeledSettingsParser.OptionModeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionRealPrecision}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionRealPrecision(LabeledSettingsParser.OptionRealPrecisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionRoundingMode}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionRoundingMode(LabeledSettingsParser.OptionRoundingModeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionUseRealNotation}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionUseRealNotation(LabeledSettingsParser.OptionUseRealNotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionUseScientificNotation}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionUseScientificNotation(LabeledSettingsParser.OptionUseScientificNotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionScNotationMaxLeft}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionScNotationMaxLeft(LabeledSettingsParser.OptionScNotationMaxLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionScNotationMaxRight}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionScNotationMaxRight(LabeledSettingsParser.OptionScNotationMaxRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionUseDegrees}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionUseDegrees(LabeledSettingsParser.OptionUseDegreesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionSeed}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionSeed(LabeledSettingsParser.OptionSeedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionBaseNotationConvention}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionBaseNotationConvention(LabeledSettingsParser.OptionBaseNotationConventionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionLogicalSymbol}
	 * labeled alternative in {@link LabeledSettingsParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionLogicalSymbol(LabeledSettingsParser.OptionLogicalSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModeArithmetic}
	 * labeled alternative in {@link LabeledSettingsParser#modes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeArithmetic(LabeledSettingsParser.ModeArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModeProgrammer}
	 * labeled alternative in {@link LabeledSettingsParser#modes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeProgrammer(LabeledSettingsParser.ModeProgrammerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoundingModeCeiling}
	 * labeled alternative in {@link LabeledSettingsParser#roundingmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundingModeCeiling(LabeledSettingsParser.RoundingModeCeilingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoundingModeDown}
	 * labeled alternative in {@link LabeledSettingsParser#roundingmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundingModeDown(LabeledSettingsParser.RoundingModeDownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoundingModeFloor}
	 * labeled alternative in {@link LabeledSettingsParser#roundingmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundingModeFloor(LabeledSettingsParser.RoundingModeFloorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoundingModeHalfDown}
	 * labeled alternative in {@link LabeledSettingsParser#roundingmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundingModeHalfDown(LabeledSettingsParser.RoundingModeHalfDownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoundingModeHalfEven}
	 * labeled alternative in {@link LabeledSettingsParser#roundingmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundingModeHalfEven(LabeledSettingsParser.RoundingModeHalfEvenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoundingModeHalfUp}
	 * labeled alternative in {@link LabeledSettingsParser#roundingmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundingModeHalfUp(LabeledSettingsParser.RoundingModeHalfUpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoundingModeUnnecessary}
	 * labeled alternative in {@link LabeledSettingsParser#roundingmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundingModeUnnecessary(LabeledSettingsParser.RoundingModeUnnecessaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoundingModeUp}
	 * labeled alternative in {@link LabeledSettingsParser#roundingmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundingModeUp(LabeledSettingsParser.RoundingModeUpContext ctx);
}