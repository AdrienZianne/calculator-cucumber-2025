// Generated from LabeledProgrammer.g4 by ANTLR 4.9.1
package calculator.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledProgrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, AND=15, OR=16, NOT=17, 
		INT=18, VALUE=19, BOOL=20, NEWLINE=21, WS=22;
	public static final int
		RULE_operation = 0, RULE_number = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"operation", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'nand'", "'nor'", "'impl'", "'equiv'", "'<<'", "'>>'", 
			"'conv'", "','", "'_'", "'0b'", "'0o'", "'0x'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "AND", "OR", "NOT", "INT", "VALUE", "BOOL", "NEWLINE", 
			"WS"
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
	public String getGrammarFileName() { return "LabeledProgrammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledProgrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperationImplContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OperationImplContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationImpl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationEquivContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OperationEquivContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationEquiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationEquiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationEquiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationAndContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode AND() { return getToken(LabeledProgrammerParser.AND, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OperationAndContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationPrioContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationPrioContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationPrio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationPrio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationPrio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationNandContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OperationNandContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationNand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationNand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationNand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationNotContext extends OperationContext {
		public TerminalNode NOT() { return getToken(LabeledProgrammerParser.NOT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OperationNotContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationConvContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode INT() { return getToken(LabeledProgrammerParser.INT, 0); }
		public OperationConvContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationConv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationConv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationConv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationNumberContext extends OperationContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OperationNumberContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationRshiftContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode INT() { return getToken(LabeledProgrammerParser.INT, 0); }
		public OperationRshiftContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationRshift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationRshift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationRshift(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationLshiftContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode INT() { return getToken(LabeledProgrammerParser.INT, 0); }
		public OperationLshiftContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationLshift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationLshift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationLshift(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationOrContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode OR() { return getToken(LabeledProgrammerParser.OR, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OperationOrContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationNorContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OperationNorContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationNor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationNor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationNor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case VALUE:
			case BOOL:
				{
				_localctx = new OperationNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(5);
				number();
				}
				break;
			case T__0:
				{
				_localctx = new OperationPrioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(6);
				match(T__0);
				setState(7);
				operation(0);
				setState(8);
				match(T__1);
				}
				break;
			case NOT:
				{
				_localctx = new OperationNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(10);
				match(NOT);
				setState(11);
				number();
				}
				break;
			case T__8:
				{
				_localctx = new OperationConvContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12);
				match(T__8);
				setState(13);
				match(T__0);
				setState(14);
				operation(0);
				setState(15);
				match(T__9);
				setState(16);
				match(INT);
				setState(17);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new OperationAndContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(21);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(22);
						match(AND);
						setState(23);
						number();
						}
						break;
					case 2:
						{
						_localctx = new OperationOrContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(24);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(25);
						match(OR);
						setState(26);
						number();
						}
						break;
					case 3:
						{
						_localctx = new OperationNandContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(27);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(28);
						match(T__2);
						setState(29);
						number();
						}
						break;
					case 4:
						{
						_localctx = new OperationNorContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(30);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(31);
						match(T__3);
						setState(32);
						number();
						}
						break;
					case 5:
						{
						_localctx = new OperationImplContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(33);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(34);
						match(T__4);
						setState(35);
						number();
						}
						break;
					case 6:
						{
						_localctx = new OperationEquivContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(36);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(37);
						match(T__5);
						setState(38);
						number();
						}
						break;
					case 7:
						{
						_localctx = new OperationLshiftContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(39);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(40);
						match(T__6);
						setState(41);
						match(INT);
						}
						break;
					case 8:
						{
						_localctx = new OperationRshiftContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(42);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(43);
						match(T__7);
						setState(44);
						match(INT);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberHexaContext extends NumberContext {
		public TerminalNode VALUE() { return getToken(LabeledProgrammerParser.VALUE, 0); }
		public NumberHexaContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterNumberHexa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitNumberHexa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitNumberHexa(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberDefaultContext extends NumberContext {
		public TerminalNode VALUE() { return getToken(LabeledProgrammerParser.VALUE, 0); }
		public TerminalNode INT() { return getToken(LabeledProgrammerParser.INT, 0); }
		public NumberDefaultContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterNumberDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitNumberDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitNumberDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberOctalContext extends NumberContext {
		public TerminalNode VALUE() { return getToken(LabeledProgrammerParser.VALUE, 0); }
		public NumberOctalContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterNumberOctal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitNumberOctal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitNumberOctal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberBoolContext extends NumberContext {
		public TerminalNode BOOL() { return getToken(LabeledProgrammerParser.BOOL, 0); }
		public NumberBoolContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterNumberBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitNumberBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitNumberBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberBinaryContext extends NumberContext {
		public TerminalNode VALUE() { return getToken(LabeledProgrammerParser.VALUE, 0); }
		public NumberBinaryContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterNumberBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitNumberBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitNumberBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_number);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				_localctx = new NumberDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(VALUE);
				setState(51);
				match(T__10);
				setState(52);
				match(INT);
				}
				break;
			case BOOL:
				_localctx = new NumberBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(BOOL);
				}
				break;
			case T__11:
				_localctx = new NumberBinaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T__11);
				setState(55);
				match(VALUE);
				}
				break;
			case T__12:
				_localctx = new NumberOctalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(T__12);
				setState(57);
				match(VALUE);
				}
				break;
			case T__13:
				_localctx = new NumberHexaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(T__13);
				setState(59);
				match(VALUE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30A\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\26"+
		"\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2\63\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\2\3\2\4\2\4\2\2\2M\2\25\3\2"+
		"\2\2\4>\3\2\2\2\6\7\b\2\1\2\7\26\5\4\3\2\b\t\7\3\2\2\t\n\5\2\2\2\n\13"+
		"\7\4\2\2\13\26\3\2\2\2\f\r\7\23\2\2\r\26\5\4\3\2\16\17\7\13\2\2\17\20"+
		"\7\3\2\2\20\21\5\2\2\2\21\22\7\f\2\2\22\23\7\24\2\2\23\24\7\4\2\2\24\26"+
		"\3\2\2\2\25\6\3\2\2\2\25\b\3\2\2\2\25\f\3\2\2\2\25\16\3\2\2\2\26\61\3"+
		"\2\2\2\27\30\f\f\2\2\30\31\7\21\2\2\31\60\5\4\3\2\32\33\f\13\2\2\33\34"+
		"\7\22\2\2\34\60\5\4\3\2\35\36\f\t\2\2\36\37\7\5\2\2\37\60\5\4\3\2 !\f"+
		"\b\2\2!\"\7\6\2\2\"\60\5\4\3\2#$\f\7\2\2$%\7\7\2\2%\60\5\4\3\2&\'\f\6"+
		"\2\2\'(\7\b\2\2(\60\5\4\3\2)*\f\5\2\2*+\7\t\2\2+\60\7\24\2\2,-\f\4\2\2"+
		"-.\7\n\2\2.\60\7\24\2\2/\27\3\2\2\2/\32\3\2\2\2/\35\3\2\2\2/ \3\2\2\2"+
		"/#\3\2\2\2/&\3\2\2\2/)\3\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64\65\7\25\2\2\65\66\7\r\2\2\66"+
		"?\7\24\2\2\67?\7\26\2\289\7\16\2\29?\7\25\2\2:;\7\17\2\2;?\7\25\2\2<="+
		"\7\20\2\2=?\7\25\2\2>\64\3\2\2\2>\67\3\2\2\2>8\3\2\2\2>:\3\2\2\2><\3\2"+
		"\2\2?\5\3\2\2\2\6\25/\61>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}