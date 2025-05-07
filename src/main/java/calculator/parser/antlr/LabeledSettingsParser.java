// Generated from LabeledSettings.g4 by ANTLR 4.13.2
package calculator.parser.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LabeledSettingsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, QUIT=21, HELP=22, LISTOPTIONS=23, INFO=24, 
		CLEAR=25, MODE=26, INT=27, UINT=28, BOOL=29, ARITHMETIC=30, PROGRAMMER=31, 
		NEWLINE=32, WS=33;
	public static final int
		RULE_setting = 0, RULE_info = 1, RULE_option = 2, RULE_modes = 3, RULE_roundingmode = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"setting", "info", "option", "modes", "roundingmode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'reset_seed'", "'real_precision'", "'real_rounding_mode'", "'use_real_notation'", 
			"'use_scientific_notation'", "'sc_notation_max_left'", "'sc_notation_max_right'", 
			"'use_degrees'", "'seed'", "'base_notation_convention'", "'logical_symbol'", 
			"'='", "'ceiling'", "'down'", "'floor'", "'half_down'", "'half_even'", 
			"'half_up'", "'unnecessary'", "'up'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "QUIT", "HELP", 
			"LISTOPTIONS", "INFO", "CLEAR", "MODE", "INT", "UINT", "BOOL", "ARITHMETIC", 
			"PROGRAMMER", "NEWLINE", "WS"
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
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUIT:
				_localctx = new SettingsQuitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(QUIT);
				}
				break;
			case HELP:
				_localctx = new SettingsHelpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(HELP);
				}
				break;
			case LISTOPTIONS:
				_localctx = new SettingsListOptionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				match(LISTOPTIONS);
				}
				break;
			case INFO:
				_localctx = new SettingsInfoOptionsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
				match(INFO);
				setState(14);
				info();
				}
				break;
			case CLEAR:
				_localctx = new SettingsClearContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(15);
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
			case MODE:
				_localctx = new SettingsOptionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(16);
				option();
				}
				break;
			case T__0:
				_localctx = new SettingsResetSeedContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(17);
				match(T__0);
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
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODE:
				_localctx = new InfoModeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(MODE);
				}
				break;
			case T__1:
				_localctx = new InfoRealPrecisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new InfoRoundingModeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new InfoUseRealNotationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new InfoUseScientificNotationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new InfoScNotationMaxLeftContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(25);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new InfoScNotationMaxRightContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(26);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new InfoUseDegreesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(27);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new InfoSeedContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(28);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new InfoBaseNotationConventionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(29);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new InfoLogicalSymbolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(30);
				match(T__10);
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

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_option);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODE:
				_localctx = new OptionModeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(MODE);
				setState(34);
				match(T__11);
				setState(35);
				modes();
				}
				break;
			case T__1:
				_localctx = new OptionRealPrecisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__1);
				setState(37);
				match(T__11);
				setState(38);
				match(UINT);
				}
				break;
			case T__2:
				_localctx = new OptionRoundingModeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(T__2);
				setState(40);
				match(T__11);
				setState(41);
				roundingmode();
				}
				break;
			case T__3:
				_localctx = new OptionUseRealNotationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(T__3);
				setState(43);
				match(T__11);
				setState(44);
				match(BOOL);
				}
				break;
			case T__4:
				_localctx = new OptionUseScientificNotationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(T__4);
				setState(46);
				match(T__11);
				setState(47);
				match(BOOL);
				}
				break;
			case T__5:
				_localctx = new OptionScNotationMaxLeftContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				match(T__5);
				setState(49);
				match(T__11);
				setState(50);
				match(UINT);
				}
				break;
			case T__6:
				_localctx = new OptionScNotationMaxRightContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				match(T__6);
				setState(52);
				match(T__11);
				setState(53);
				match(UINT);
				}
				break;
			case T__7:
				_localctx = new OptionUseDegreesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				match(T__7);
				setState(55);
				match(T__11);
				setState(56);
				match(BOOL);
				}
				break;
			case T__8:
				_localctx = new OptionSeedContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				match(T__8);
				setState(58);
				match(T__11);
				setState(59);
				match(INT);
				}
				break;
			case T__9:
				_localctx = new OptionBaseNotationConventionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(60);
				match(T__9);
				setState(61);
				match(T__11);
				setState(62);
				match(BOOL);
				}
				break;
			case T__10:
				_localctx = new OptionLogicalSymbolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(63);
				match(T__10);
				setState(64);
				match(T__11);
				setState(65);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARITHMETIC:
				_localctx = new ModeArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(ARITHMETIC);
				}
				break;
			case PROGRAMMER:
				_localctx = new ModeProgrammerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new RoundingModeCeilingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new RoundingModeDownContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new RoundingModeFloorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new RoundingModeHalfDownContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new RoundingModeHalfEvenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new RoundingModeHalfUpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new RoundingModeUnnecessaryContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new RoundingModeUpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				match(T__19);
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
		"\u0004\u0001!S\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"G\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001\u0004"+
		"\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000o\u0000\u0012"+
		"\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004B\u0001"+
		"\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000"+
		"\u0000\n\u0013\u0005\u0015\u0000\u0000\u000b\u0013\u0005\u0016\u0000\u0000"+
		"\f\u0013\u0005\u0017\u0000\u0000\r\u000e\u0005\u0018\u0000\u0000\u000e"+
		"\u0013\u0003\u0002\u0001\u0000\u000f\u0013\u0005\u0019\u0000\u0000\u0010"+
		"\u0013\u0003\u0004\u0002\u0000\u0011\u0013\u0005\u0001\u0000\u0000\u0012"+
		"\n\u0001\u0000\u0000\u0000\u0012\u000b\u0001\u0000\u0000\u0000\u0012\f"+
		"\u0001\u0000\u0000\u0000\u0012\r\u0001\u0000\u0000\u0000\u0012\u000f\u0001"+
		"\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014 \u0005\u001a"+
		"\u0000\u0000\u0015 \u0005\u0002\u0000\u0000\u0016 \u0005\u0003\u0000\u0000"+
		"\u0017 \u0005\u0004\u0000\u0000\u0018 \u0005\u0005\u0000\u0000\u0019 "+
		"\u0005\u0006\u0000\u0000\u001a \u0005\u0007\u0000\u0000\u001b \u0005\b"+
		"\u0000\u0000\u001c \u0005\t\u0000\u0000\u001d \u0005\n\u0000\u0000\u001e"+
		" \u0005\u000b\u0000\u0000\u001f\u0014\u0001\u0000\u0000\u0000\u001f\u0015"+
		"\u0001\u0000\u0000\u0000\u001f\u0016\u0001\u0000\u0000\u0000\u001f\u0017"+
		"\u0001\u0000\u0000\u0000\u001f\u0018\u0001\u0000\u0000\u0000\u001f\u0019"+
		"\u0001\u0000\u0000\u0000\u001f\u001a\u0001\u0000\u0000\u0000\u001f\u001b"+
		"\u0001\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 \u0003\u0001"+
		"\u0000\u0000\u0000!\"\u0005\u001a\u0000\u0000\"#\u0005\f\u0000\u0000#"+
		"C\u0003\u0006\u0003\u0000$%\u0005\u0002\u0000\u0000%&\u0005\f\u0000\u0000"+
		"&C\u0005\u001c\u0000\u0000\'(\u0005\u0003\u0000\u0000()\u0005\f\u0000"+
		"\u0000)C\u0003\b\u0004\u0000*+\u0005\u0004\u0000\u0000+,\u0005\f\u0000"+
		"\u0000,C\u0005\u001d\u0000\u0000-.\u0005\u0005\u0000\u0000./\u0005\f\u0000"+
		"\u0000/C\u0005\u001d\u0000\u000001\u0005\u0006\u0000\u000012\u0005\f\u0000"+
		"\u00002C\u0005\u001c\u0000\u000034\u0005\u0007\u0000\u000045\u0005\f\u0000"+
		"\u00005C\u0005\u001c\u0000\u000067\u0005\b\u0000\u000078\u0005\f\u0000"+
		"\u00008C\u0005\u001d\u0000\u00009:\u0005\t\u0000\u0000:;\u0005\f\u0000"+
		"\u0000;C\u0005\u001b\u0000\u0000<=\u0005\n\u0000\u0000=>\u0005\f\u0000"+
		"\u0000>C\u0005\u001d\u0000\u0000?@\u0005\u000b\u0000\u0000@A\u0005\f\u0000"+
		"\u0000AC\u0005\u001d\u0000\u0000B!\u0001\u0000\u0000\u0000B$\u0001\u0000"+
		"\u0000\u0000B\'\u0001\u0000\u0000\u0000B*\u0001\u0000\u0000\u0000B-\u0001"+
		"\u0000\u0000\u0000B0\u0001\u0000\u0000\u0000B3\u0001\u0000\u0000\u0000"+
		"B6\u0001\u0000\u0000\u0000B9\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000"+
		"\u0000B?\u0001\u0000\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DG\u0005"+
		"\u001e\u0000\u0000EG\u0005\u001f\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000G\u0007\u0001\u0000\u0000\u0000HQ\u0005\r\u0000"+
		"\u0000IQ\u0005\u000e\u0000\u0000JQ\u0005\u000f\u0000\u0000KQ\u0005\u0010"+
		"\u0000\u0000LQ\u0005\u0011\u0000\u0000MQ\u0005\u0012\u0000\u0000NQ\u0005"+
		"\u0013\u0000\u0000OQ\u0005\u0014\u0000\u0000PH\u0001\u0000\u0000\u0000"+
		"PI\u0001\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000"+
		"\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000Q\t\u0001\u0000\u0000\u0000\u0005"+
		"\u0012\u001fBFP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}