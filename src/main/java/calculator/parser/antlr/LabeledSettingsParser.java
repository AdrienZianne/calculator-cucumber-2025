// Generated from LabeledSettings.g4 by ANTLR 4.13.2
package calculator.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LabeledSettingsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, QUIT=23, HELP=24, LISTOPTIONS=25, 
		INFO=26, CLEAR=27, MODE=28, INT=29, UINT=30, BOOL=31, ARITHMETIC=32, PROGRAMMER=33, 
		LOGS=34, FAVOS=35, ADDFAVO=36, DELFAVO=37, USELOG=38, USEFAVO=39, NEWLINE=40, 
		WS=41;
	public static final int
		RULE_setting = 0, RULE_info = 1, RULE_option = 2, RULE_modes = 3, RULE_roundingmode = 4, 
		RULE_history = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"setting", "info", "option", "modes", "roundingmode", "history"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'reset_seed'", "'real_precision'", "'real_rounding_mode'", "'use_real_notation'", 
			"'use_scientific_notation'", "'sc_notation_max_left'", "'sc_notation_max_right'", 
			"'use_degrees'", "'seed'", "'base_notation_convention'", "'logical_symbol'", 
			"'max_store'", "'delete_duplicates'", "'='", "'ceiling'", "'down'", "'floor'", 
			"'half_down'", "'half_even'", "'half_up'", "'unnecessary'", "'up'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "QUIT", 
			"HELP", "LISTOPTIONS", "INFO", "CLEAR", "MODE", "INT", "UINT", "BOOL", 
			"ARITHMETIC", "PROGRAMMER", "LOGS", "FAVOS", "ADDFAVO", "DELFAVO", "USELOG", 
			"USEFAVO", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LabeledSettings.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledSettingsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SettingContext extends ParserRuleContext {
		public SettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setting; }
	 
		public SettingContext() { }
		public void copyFrom(SettingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SettingsQuitContext extends SettingContext {
		public TerminalNode QUIT() { return getToken(LabeledSettingsParser.QUIT, 0); }
		public SettingsQuitContext(SettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterSettingsQuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitSettingsQuit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitSettingsQuit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SettingsClearContext extends SettingContext {
		public TerminalNode CLEAR() { return getToken(LabeledSettingsParser.CLEAR, 0); }
		public SettingsClearContext(SettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterSettingsClear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitSettingsClear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitSettingsClear(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SettingsInfoOptionsContext extends SettingContext {
		public TerminalNode INFO() { return getToken(LabeledSettingsParser.INFO, 0); }
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public SettingsInfoOptionsContext(SettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterSettingsInfoOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitSettingsInfoOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitSettingsInfoOptions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SettingsHistoryContext extends SettingContext {
		public HistoryContext history() {
			return getRuleContext(HistoryContext.class,0);
		}
		public SettingsHistoryContext(SettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterSettingsHistory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitSettingsHistory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitSettingsHistory(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SettingsHelpContext extends SettingContext {
		public TerminalNode HELP() { return getToken(LabeledSettingsParser.HELP, 0); }
		public SettingsHelpContext(SettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterSettingsHelp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitSettingsHelp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitSettingsHelp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SettingsListOptionsContext extends SettingContext {
		public TerminalNode LISTOPTIONS() { return getToken(LabeledSettingsParser.LISTOPTIONS, 0); }
		public SettingsListOptionsContext(SettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterSettingsListOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitSettingsListOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitSettingsListOptions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SettingsResetSeedContext extends SettingContext {
		public SettingsResetSeedContext(SettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterSettingsResetSeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitSettingsResetSeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitSettingsResetSeed(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SettingsOptionContext extends SettingContext {
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public SettingsOptionContext(SettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterSettingsOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitSettingsOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitSettingsOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingContext setting() throws RecognitionException {
		SettingContext _localctx = new SettingContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_setting);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUIT:
				_localctx = new SettingsQuitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(QUIT);
				}
				break;
			case HELP:
				_localctx = new SettingsHelpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(HELP);
				}
				break;
			case LISTOPTIONS:
				_localctx = new SettingsListOptionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				match(LISTOPTIONS);
				}
				break;
			case INFO:
				_localctx = new SettingsInfoOptionsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
				match(INFO);
				setState(16);
				info();
				}
				break;
			case CLEAR:
				_localctx = new SettingsClearContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(17);
				match(CLEAR);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case MODE:
				_localctx = new SettingsOptionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(18);
				option();
				}
				break;
			case T__0:
				_localctx = new SettingsResetSeedContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(19);
				match(T__0);
				}
				break;
			case LOGS:
			case FAVOS:
			case ADDFAVO:
			case DELFAVO:
			case USELOG:
			case USEFAVO:
				_localctx = new SettingsHistoryContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(20);
				history();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfoContext extends ParserRuleContext {
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
	 
		public InfoContext() { }
		public void copyFrom(InfoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoModeContext extends InfoContext {
		public TerminalNode MODE() { return getToken(LabeledSettingsParser.MODE, 0); }
		public InfoModeContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoMode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoRealPrecisionContext extends InfoContext {
		public InfoRealPrecisionContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoRealPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoRealPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoRealPrecision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoBaseNotationConventionContext extends InfoContext {
		public InfoBaseNotationConventionContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoBaseNotationConvention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoBaseNotationConvention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoBaseNotationConvention(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoScNotationMaxLeftContext extends InfoContext {
		public InfoScNotationMaxLeftContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoScNotationMaxLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoScNotationMaxLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoScNotationMaxLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoSeedContext extends InfoContext {
		public InfoSeedContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoSeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoSeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoSeed(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoMaxStoreContext extends InfoContext {
		public InfoMaxStoreContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoMaxStore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoMaxStore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoMaxStore(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoDeleteDuplicatesContext extends InfoContext {
		public InfoDeleteDuplicatesContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoDeleteDuplicates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoDeleteDuplicates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoDeleteDuplicates(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoUseScientificNotationContext extends InfoContext {
		public InfoUseScientificNotationContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoUseScientificNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoUseScientificNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoUseScientificNotation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoScNotationMaxRightContext extends InfoContext {
		public InfoScNotationMaxRightContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoScNotationMaxRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoScNotationMaxRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoScNotationMaxRight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoRoundingModeContext extends InfoContext {
		public InfoRoundingModeContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoRoundingMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoRoundingMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoRoundingMode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoUseRealNotationContext extends InfoContext {
		public InfoUseRealNotationContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoUseRealNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoUseRealNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoUseRealNotation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoUseDegreesContext extends InfoContext {
		public InfoUseDegreesContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoUseDegrees(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoUseDegrees(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoUseDegrees(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoLogicalSymbolContext extends InfoContext {
		public InfoLogicalSymbolContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterInfoLogicalSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitInfoLogicalSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitInfoLogicalSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_info);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODE:
				_localctx = new InfoModeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(MODE);
				}
				break;
			case T__1:
				_localctx = new InfoRealPrecisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new InfoRoundingModeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new InfoUseRealNotationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new InfoUseScientificNotationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new InfoScNotationMaxLeftContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(28);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new InfoScNotationMaxRightContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(29);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new InfoUseDegreesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(30);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new InfoSeedContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(31);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new InfoBaseNotationConventionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(32);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new InfoLogicalSymbolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(33);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new InfoMaxStoreContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(34);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new InfoDeleteDuplicatesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(35);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionContext extends ParserRuleContext {
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
	 
		public OptionContext() { }
		public void copyFrom(OptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionUseRealNotationContext extends OptionContext {
		public TerminalNode BOOL() { return getToken(LabeledSettingsParser.BOOL, 0); }
		public OptionUseRealNotationContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionUseRealNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionUseRealNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionUseRealNotation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionBaseNotationConventionContext extends OptionContext {
		public TerminalNode BOOL() { return getToken(LabeledSettingsParser.BOOL, 0); }
		public OptionBaseNotationConventionContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionBaseNotationConvention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionBaseNotationConvention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionBaseNotationConvention(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionDeleteDuplicatesContext extends OptionContext {
		public TerminalNode BOOL() { return getToken(LabeledSettingsParser.BOOL, 0); }
		public OptionDeleteDuplicatesContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionDeleteDuplicates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionDeleteDuplicates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionDeleteDuplicates(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionScNotationMaxRightContext extends OptionContext {
		public TerminalNode UINT() { return getToken(LabeledSettingsParser.UINT, 0); }
		public OptionScNotationMaxRightContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionScNotationMaxRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionScNotationMaxRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionScNotationMaxRight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionMaxStoreContext extends OptionContext {
		public TerminalNode INT() { return getToken(LabeledSettingsParser.INT, 0); }
		public OptionMaxStoreContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionMaxStore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionMaxStore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionMaxStore(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionUseScientificNotationContext extends OptionContext {
		public TerminalNode BOOL() { return getToken(LabeledSettingsParser.BOOL, 0); }
		public OptionUseScientificNotationContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionUseScientificNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionUseScientificNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionUseScientificNotation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionRealPrecisionContext extends OptionContext {
		public TerminalNode UINT() { return getToken(LabeledSettingsParser.UINT, 0); }
		public OptionRealPrecisionContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionRealPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionRealPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionRealPrecision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionModeContext extends OptionContext {
		public TerminalNode MODE() { return getToken(LabeledSettingsParser.MODE, 0); }
		public ModesContext modes() {
			return getRuleContext(ModesContext.class,0);
		}
		public OptionModeContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionMode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionScNotationMaxLeftContext extends OptionContext {
		public TerminalNode UINT() { return getToken(LabeledSettingsParser.UINT, 0); }
		public OptionScNotationMaxLeftContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionScNotationMaxLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionScNotationMaxLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionScNotationMaxLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionUseDegreesContext extends OptionContext {
		public TerminalNode BOOL() { return getToken(LabeledSettingsParser.BOOL, 0); }
		public OptionUseDegreesContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionUseDegrees(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionUseDegrees(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionUseDegrees(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionSeedContext extends OptionContext {
		public TerminalNode INT() { return getToken(LabeledSettingsParser.INT, 0); }
		public OptionSeedContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionSeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionSeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionSeed(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionLogicalSymbolContext extends OptionContext {
		public TerminalNode BOOL() { return getToken(LabeledSettingsParser.BOOL, 0); }
		public OptionLogicalSymbolContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionLogicalSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionLogicalSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionLogicalSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionRoundingModeContext extends OptionContext {
		public RoundingmodeContext roundingmode() {
			return getRuleContext(RoundingmodeContext.class,0);
		}
		public OptionRoundingModeContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterOptionRoundingMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitOptionRoundingMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitOptionRoundingMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_option);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODE:
				_localctx = new OptionModeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(MODE);
				setState(39);
				match(T__13);
				setState(40);
				modes();
				}
				break;
			case T__1:
				_localctx = new OptionRealPrecisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(T__1);
				setState(42);
				match(T__13);
				setState(43);
				match(UINT);
				}
				break;
			case T__2:
				_localctx = new OptionRoundingModeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(T__2);
				setState(45);
				match(T__13);
				setState(46);
				roundingmode();
				}
				break;
			case T__3:
				_localctx = new OptionUseRealNotationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(T__3);
				setState(48);
				match(T__13);
				setState(49);
				match(BOOL);
				}
				break;
			case T__4:
				_localctx = new OptionUseScientificNotationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(T__4);
				setState(51);
				match(T__13);
				setState(52);
				match(BOOL);
				}
				break;
			case T__5:
				_localctx = new OptionScNotationMaxLeftContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				match(T__5);
				setState(54);
				match(T__13);
				setState(55);
				match(UINT);
				}
				break;
			case T__6:
				_localctx = new OptionScNotationMaxRightContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				match(T__6);
				setState(57);
				match(T__13);
				setState(58);
				match(UINT);
				}
				break;
			case T__7:
				_localctx = new OptionUseDegreesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				match(T__7);
				setState(60);
				match(T__13);
				setState(61);
				match(BOOL);
				}
				break;
			case T__8:
				_localctx = new OptionSeedContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				match(T__8);
				setState(63);
				match(T__13);
				setState(64);
				match(INT);
				}
				break;
			case T__9:
				_localctx = new OptionBaseNotationConventionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(65);
				match(T__9);
				setState(66);
				match(T__13);
				setState(67);
				match(BOOL);
				}
				break;
			case T__10:
				_localctx = new OptionLogicalSymbolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(68);
				match(T__10);
				setState(69);
				match(T__13);
				setState(70);
				match(BOOL);
				}
				break;
			case T__11:
				_localctx = new OptionMaxStoreContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(71);
				match(T__11);
				setState(72);
				match(T__13);
				setState(73);
				match(INT);
				}
				break;
			case T__12:
				_localctx = new OptionDeleteDuplicatesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(74);
				match(T__12);
				setState(75);
				match(T__13);
				setState(76);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModesContext extends ParserRuleContext {
		public ModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modes; }
	 
		public ModesContext() { }
		public void copyFrom(ModesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModeProgrammerContext extends ModesContext {
		public TerminalNode PROGRAMMER() { return getToken(LabeledSettingsParser.PROGRAMMER, 0); }
		public ModeProgrammerContext(ModesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterModeProgrammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitModeProgrammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitModeProgrammer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModeArithmeticContext extends ModesContext {
		public TerminalNode ARITHMETIC() { return getToken(LabeledSettingsParser.ARITHMETIC, 0); }
		public ModeArithmeticContext(ModesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterModeArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitModeArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitModeArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModesContext modes() throws RecognitionException {
		ModesContext _localctx = new ModesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modes);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARITHMETIC:
				_localctx = new ModeArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ARITHMETIC);
				}
				break;
			case PROGRAMMER:
				_localctx = new ModeProgrammerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(PROGRAMMER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RoundingmodeContext extends ParserRuleContext {
		public RoundingmodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roundingmode; }
	 
		public RoundingmodeContext() { }
		public void copyFrom(RoundingmodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoundingModeFloorContext extends RoundingmodeContext {
		public RoundingModeFloorContext(RoundingmodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterRoundingModeFloor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitRoundingModeFloor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitRoundingModeFloor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoundingModeHalfUpContext extends RoundingmodeContext {
		public RoundingModeHalfUpContext(RoundingmodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterRoundingModeHalfUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitRoundingModeHalfUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitRoundingModeHalfUp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoundingModeHalfEvenContext extends RoundingmodeContext {
		public RoundingModeHalfEvenContext(RoundingmodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterRoundingModeHalfEven(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitRoundingModeHalfEven(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitRoundingModeHalfEven(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoundingModeUnnecessaryContext extends RoundingmodeContext {
		public RoundingModeUnnecessaryContext(RoundingmodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterRoundingModeUnnecessary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitRoundingModeUnnecessary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitRoundingModeUnnecessary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoundingModeCeilingContext extends RoundingmodeContext {
		public RoundingModeCeilingContext(RoundingmodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterRoundingModeCeiling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitRoundingModeCeiling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitRoundingModeCeiling(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoundingModeUpContext extends RoundingmodeContext {
		public RoundingModeUpContext(RoundingmodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterRoundingModeUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitRoundingModeUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitRoundingModeUp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoundingModeDownContext extends RoundingmodeContext {
		public RoundingModeDownContext(RoundingmodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterRoundingModeDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitRoundingModeDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitRoundingModeDown(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoundingModeHalfDownContext extends RoundingmodeContext {
		public RoundingModeHalfDownContext(RoundingmodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterRoundingModeHalfDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitRoundingModeHalfDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitRoundingModeHalfDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoundingmodeContext roundingmode() throws RecognitionException {
		RoundingmodeContext _localctx = new RoundingmodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_roundingmode);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new RoundingModeCeilingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new RoundingModeDownContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new RoundingModeFloorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new RoundingModeHalfDownContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new RoundingModeHalfEvenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new RoundingModeHalfUpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new RoundingModeUnnecessaryContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new RoundingModeUpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HistoryContext extends ParserRuleContext {
		public HistoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_history; }
	 
		public HistoryContext() { }
		public void copyFrom(HistoryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HistoryLogsContext extends HistoryContext {
		public TerminalNode LOGS() { return getToken(LabeledSettingsParser.LOGS, 0); }
		public HistoryLogsContext(HistoryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterHistoryLogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitHistoryLogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitHistoryLogs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HistoryFavosContext extends HistoryContext {
		public TerminalNode FAVOS() { return getToken(LabeledSettingsParser.FAVOS, 0); }
		public HistoryFavosContext(HistoryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterHistoryFavos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitHistoryFavos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitHistoryFavos(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HistoryAddFavoContext extends HistoryContext {
		public TerminalNode ADDFAVO() { return getToken(LabeledSettingsParser.ADDFAVO, 0); }
		public TerminalNode INT() { return getToken(LabeledSettingsParser.INT, 0); }
		public HistoryAddFavoContext(HistoryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterHistoryAddFavo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitHistoryAddFavo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitHistoryAddFavo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HistoryDelFavoContext extends HistoryContext {
		public TerminalNode DELFAVO() { return getToken(LabeledSettingsParser.DELFAVO, 0); }
		public TerminalNode INT() { return getToken(LabeledSettingsParser.INT, 0); }
		public HistoryDelFavoContext(HistoryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterHistoryDelFavo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitHistoryDelFavo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitHistoryDelFavo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HistoryUseLogContext extends HistoryContext {
		public TerminalNode USELOG() { return getToken(LabeledSettingsParser.USELOG, 0); }
		public TerminalNode INT() { return getToken(LabeledSettingsParser.INT, 0); }
		public HistoryUseLogContext(HistoryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterHistoryUseLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitHistoryUseLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitHistoryUseLog(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HistoryUseFavoContext extends HistoryContext {
		public TerminalNode USEFAVO() { return getToken(LabeledSettingsParser.USEFAVO, 0); }
		public TerminalNode INT() { return getToken(LabeledSettingsParser.INT, 0); }
		public HistoryUseFavoContext(HistoryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).enterHistoryUseFavo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledSettingsListener ) ((LabeledSettingsListener)listener).exitHistoryUseFavo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledSettingsVisitor ) return ((LabeledSettingsVisitor<? extends T>)visitor).visitHistoryUseFavo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HistoryContext history() throws RecognitionException {
		HistoryContext _localctx = new HistoryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_history);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGS:
				_localctx = new HistoryLogsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(LOGS);
				}
				break;
			case FAVOS:
				_localctx = new HistoryFavosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(FAVOS);
				}
				break;
			case ADDFAVO:
				_localctx = new HistoryAddFavoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(ADDFAVO);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(96);
					match(INT);
					}
				}

				}
				break;
			case DELFAVO:
				_localctx = new HistoryDelFavoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(DELFAVO);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(100);
					match(INT);
					}
				}

				}
				break;
			case USELOG:
				_localctx = new HistoryUseLogContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(USELOG);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(104);
					match(INT);
					}
				}

				}
				break;
			case USEFAVO:
				_localctx = new HistoryUseFavoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				match(USEFAVO);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(108);
					match(INT);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001)r\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0016\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002N\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003R\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005f\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005j\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005n\b\u0005\u0003\u0005p\b\u0005\u0001\u0005\u0000"+
		"\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000\u009b\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004M\u0001\u0000"+
		"\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000"+
		"\no\u0001\u0000\u0000\u0000\f\u0016\u0005\u0017\u0000\u0000\r\u0016\u0005"+
		"\u0018\u0000\u0000\u000e\u0016\u0005\u0019\u0000\u0000\u000f\u0010\u0005"+
		"\u001a\u0000\u0000\u0010\u0016\u0003\u0002\u0001\u0000\u0011\u0016\u0005"+
		"\u001b\u0000\u0000\u0012\u0016\u0003\u0004\u0002\u0000\u0013\u0016\u0005"+
		"\u0001\u0000\u0000\u0014\u0016\u0003\n\u0005\u0000\u0015\f\u0001\u0000"+
		"\u0000\u0000\u0015\r\u0001\u0000\u0000\u0000\u0015\u000e\u0001\u0000\u0000"+
		"\u0000\u0015\u000f\u0001\u0000\u0000\u0000\u0015\u0011\u0001\u0000\u0000"+
		"\u0000\u0015\u0012\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000"+
		"\u0000\u0017%\u0005\u001c\u0000\u0000\u0018%\u0005\u0002\u0000\u0000\u0019"+
		"%\u0005\u0003\u0000\u0000\u001a%\u0005\u0004\u0000\u0000\u001b%\u0005"+
		"\u0005\u0000\u0000\u001c%\u0005\u0006\u0000\u0000\u001d%\u0005\u0007\u0000"+
		"\u0000\u001e%\u0005\b\u0000\u0000\u001f%\u0005\t\u0000\u0000 %\u0005\n"+
		"\u0000\u0000!%\u0005\u000b\u0000\u0000\"%\u0005\f\u0000\u0000#%\u0005"+
		"\r\u0000\u0000$\u0017\u0001\u0000\u0000\u0000$\u0018\u0001\u0000\u0000"+
		"\u0000$\u0019\u0001\u0000\u0000\u0000$\u001a\u0001\u0000\u0000\u0000$"+
		"\u001b\u0001\u0000\u0000\u0000$\u001c\u0001\u0000\u0000\u0000$\u001d\u0001"+
		"\u0000\u0000\u0000$\u001e\u0001\u0000\u0000\u0000$\u001f\u0001\u0000\u0000"+
		"\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u001c\u0000\u0000\'(\u0005\u000e\u0000\u0000(N\u0003\u0006\u0003"+
		"\u0000)*\u0005\u0002\u0000\u0000*+\u0005\u000e\u0000\u0000+N\u0005\u001e"+
		"\u0000\u0000,-\u0005\u0003\u0000\u0000-.\u0005\u000e\u0000\u0000.N\u0003"+
		"\b\u0004\u0000/0\u0005\u0004\u0000\u000001\u0005\u000e\u0000\u00001N\u0005"+
		"\u001f\u0000\u000023\u0005\u0005\u0000\u000034\u0005\u000e\u0000\u0000"+
		"4N\u0005\u001f\u0000\u000056\u0005\u0006\u0000\u000067\u0005\u000e\u0000"+
		"\u00007N\u0005\u001e\u0000\u000089\u0005\u0007\u0000\u00009:\u0005\u000e"+
		"\u0000\u0000:N\u0005\u001e\u0000\u0000;<\u0005\b\u0000\u0000<=\u0005\u000e"+
		"\u0000\u0000=N\u0005\u001f\u0000\u0000>?\u0005\t\u0000\u0000?@\u0005\u000e"+
		"\u0000\u0000@N\u0005\u001d\u0000\u0000AB\u0005\n\u0000\u0000BC\u0005\u000e"+
		"\u0000\u0000CN\u0005\u001f\u0000\u0000DE\u0005\u000b\u0000\u0000EF\u0005"+
		"\u000e\u0000\u0000FN\u0005\u001f\u0000\u0000GH\u0005\f\u0000\u0000HI\u0005"+
		"\u000e\u0000\u0000IN\u0005\u001d\u0000\u0000JK\u0005\r\u0000\u0000KL\u0005"+
		"\u000e\u0000\u0000LN\u0005\u001f\u0000\u0000M&\u0001\u0000\u0000\u0000"+
		"M)\u0001\u0000\u0000\u0000M,\u0001\u0000\u0000\u0000M/\u0001\u0000\u0000"+
		"\u0000M2\u0001\u0000\u0000\u0000M5\u0001\u0000\u0000\u0000M8\u0001\u0000"+
		"\u0000\u0000M;\u0001\u0000\u0000\u0000M>\u0001\u0000\u0000\u0000MA\u0001"+
		"\u0000\u0000\u0000MD\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000"+
		"MJ\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OR\u0005 \u0000"+
		"\u0000PR\u0005!\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000"+
		"\u0000R\u0007\u0001\u0000\u0000\u0000S\\\u0005\u000f\u0000\u0000T\\\u0005"+
		"\u0010\u0000\u0000U\\\u0005\u0011\u0000\u0000V\\\u0005\u0012\u0000\u0000"+
		"W\\\u0005\u0013\u0000\u0000X\\\u0005\u0014\u0000\u0000Y\\\u0005\u0015"+
		"\u0000\u0000Z\\\u0005\u0016\u0000\u0000[S\u0001\u0000\u0000\u0000[T\u0001"+
		"\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000[V\u0001\u0000\u0000\u0000"+
		"[W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\\t\u0001\u0000\u0000\u0000]p\u0005\""+
		"\u0000\u0000^p\u0005#\u0000\u0000_a\u0005$\u0000\u0000`b\u0005\u001d\u0000"+
		"\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bp\u0001\u0000"+
		"\u0000\u0000ce\u0005%\u0000\u0000df\u0005\u001d\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fp\u0001\u0000\u0000\u0000gi\u0005"+
		"&\u0000\u0000hj\u0005\u001d\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jp\u0001\u0000\u0000\u0000km\u0005\'\u0000\u0000ln\u0005"+
		"\u001d\u0000\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"np\u0001\u0000\u0000\u0000o]\u0001\u0000\u0000\u0000o^\u0001\u0000\u0000"+
		"\u0000o_\u0001\u0000\u0000\u0000oc\u0001\u0000\u0000\u0000og\u0001\u0000"+
		"\u0000\u0000ok\u0001\u0000\u0000\u0000p\u000b\u0001\u0000\u0000\u0000"+
		"\n\u0015$MQ[aeimo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}