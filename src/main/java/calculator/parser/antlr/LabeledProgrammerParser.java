// Generated from LabeledProgrammer.g4 by ANTLR 4.13.2
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
public class LabeledProgrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BOOL=8, LSHIFT=9, 
		RSHIFT=10, NOT=11, AND=12, OR=13, XOR=14, IMPL=15, EQUIV=16, BINARY_LITERAL=17, 
		OCTAL_LITERAL=18, HEXA_LITERAL=19, INT=20, ALPHABET=21, BOTH=22, NEWLINE=23, 
		WS=24;
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
			null, "'('", "')'", "'conv'", "','", "'nand'", "'nor'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "BOOL", "LSHIFT", "RSHIFT", 
			"NOT", "AND", "OR", "XOR", "IMPL", "EQUIV", "BINARY_LITERAL", "OCTAL_LITERAL", 
			"HEXA_LITERAL", "INT", "ALPHABET", "BOTH", "NEWLINE", "WS"
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class OperationXorContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode XOR() { return getToken(LabeledProgrammerParser.XOR, 0); }
		public OperationXorContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterOperationXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitOperationXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitOperationXor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationEquivContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode EQUIV() { return getToken(LabeledProgrammerParser.EQUIV, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class OperationAndContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode AND() { return getToken(LabeledProgrammerParser.AND, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class OperationNandContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class OperationLshiftContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode LSHIFT() { return getToken(LabeledProgrammerParser.LSHIFT, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class OperationOrContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode OR() { return getToken(LabeledProgrammerParser.OR, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class OperationImplContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode IMPL() { return getToken(LabeledProgrammerParser.IMPL, 0); }
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class OperationNotContext extends OperationContext {
		public TerminalNode NOT() { return getToken(LabeledProgrammerParser.NOT, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
	@SuppressWarnings("CheckReturnValue")
	public static class OperationRshiftContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RSHIFT() { return getToken(LabeledProgrammerParser.RSHIFT, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class OperationNorContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
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
			case T__0:
				{
				_localctx = new OperationPrioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(5);
				match(T__0);
				setState(6);
				operation(0);
				setState(7);
				match(T__1);
				}
				break;
			case T__2:
				{
				_localctx = new OperationConvContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(9);
				match(T__2);
				setState(10);
				match(T__0);
				setState(11);
				operation(0);
				setState(12);
				match(T__3);
				setState(13);
				match(INT);
				setState(14);
				match(T__1);
				}
				break;
			case NOT:
				{
				_localctx = new OperationNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				match(NOT);
				setState(17);
				operation(9);
				}
				break;
			case BOOL:
			case BINARY_LITERAL:
			case OCTAL_LITERAL:
			case HEXA_LITERAL:
			case INT:
			case ALPHABET:
			case BOTH:
				{
				_localctx = new OperationNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(48);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new OperationAndContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(21);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(22);
						match(AND);
						setState(23);
						operation(9);
						}
						break;
					case 2:
						{
						_localctx = new OperationOrContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(24);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(25);
						match(OR);
						setState(26);
						operation(8);
						}
						break;
					case 3:
						{
						_localctx = new OperationXorContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(27);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(28);
						match(XOR);
						setState(29);
						operation(7);
						}
						break;
					case 4:
						{
						_localctx = new OperationNandContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(30);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(31);
						match(T__4);
						setState(32);
						operation(6);
						}
						break;
					case 5:
						{
						_localctx = new OperationNorContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(33);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(34);
						match(T__5);
						setState(35);
						operation(5);
						}
						break;
					case 6:
						{
						_localctx = new OperationImplContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(36);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(37);
						match(IMPL);
						setState(38);
						operation(4);
						}
						break;
					case 7:
						{
						_localctx = new OperationEquivContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(39);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(40);
						match(EQUIV);
						setState(41);
						operation(3);
						}
						break;
					case 8:
						{
						_localctx = new OperationLshiftContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(42);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(43);
						match(LSHIFT);
						setState(44);
						match(INT);
						}
						break;
					case 9:
						{
						_localctx = new OperationRshiftContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(45);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(46);
						match(RSHIFT);
						setState(47);
						match(INT);
						}
						break;
					}
					} 
				}
				setState(52);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class NumberHexaContext extends NumberContext {
		public TerminalNode HEXA_LITERAL() { return getToken(LabeledProgrammerParser.HEXA_LITERAL, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class NumberDefaultContext extends NumberContext {
		public List<TerminalNode> INT() { return getTokens(LabeledProgrammerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LabeledProgrammerParser.INT, i);
		}
		public TerminalNode ALPHABET() { return getToken(LabeledProgrammerParser.ALPHABET, 0); }
		public TerminalNode BOTH() { return getToken(LabeledProgrammerParser.BOTH, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class NumberOctalContext extends NumberContext {
		public TerminalNode OCTAL_LITERAL() { return getToken(LabeledProgrammerParser.OCTAL_LITERAL, 0); }
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class NumberDecimalContext extends NumberContext {
		public TerminalNode INT() { return getToken(LabeledProgrammerParser.INT, 0); }
		public NumberDecimalContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).enterNumberDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledProgrammerListener ) ((LabeledProgrammerListener)listener).exitNumberDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledProgrammerVisitor ) return ((LabeledProgrammerVisitor<? extends T>)visitor).visitNumberDecimal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberBinaryContext extends NumberContext {
		public TerminalNode BINARY_LITERAL() { return getToken(LabeledProgrammerParser.BINARY_LITERAL, 0); }
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
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new NumberBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(BOOL);
				}
				break;
			case 2:
				_localctx = new NumberBinaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(BINARY_LITERAL);
				}
				break;
			case 3:
				_localctx = new NumberOctalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(OCTAL_LITERAL);
				}
				break;
			case 4:
				_localctx = new NumberDecimalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(INT);
				}
				break;
			case 5:
				_localctx = new NumberHexaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(HEXA_LITERAL);
				}
				break;
			case 6:
				_localctx = new NumberDefaultContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(59);
				match(T__6);
				setState(60);
				match(INT);
				}
				break;
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018@\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0014\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u00001\b\u0000\n\u0000\f\u00004\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001>\b\u0001\u0001\u0001\u0000\u0001\u0000"+
		"\u0002\u0000\u0002\u0000\u0001\u0001\u0000\u0014\u0016N\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004\u0005\u0006\u0000"+
		"\uffff\uffff\u0000\u0005\u0006\u0005\u0001\u0000\u0000\u0006\u0007\u0003"+
		"\u0000\u0000\u0000\u0007\b\u0005\u0002\u0000\u0000\b\u0014\u0001\u0000"+
		"\u0000\u0000\t\n\u0005\u0003\u0000\u0000\n\u000b\u0005\u0001\u0000\u0000"+
		"\u000b\f\u0003\u0000\u0000\u0000\f\r\u0005\u0004\u0000\u0000\r\u000e\u0005"+
		"\u0014\u0000\u0000\u000e\u000f\u0005\u0002\u0000\u0000\u000f\u0014\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0005\u000b\u0000\u0000\u0011\u0014\u0003"+
		"\u0000\u0000\t\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0004\u0001\u0000"+
		"\u0000\u0000\u0013\t\u0001\u0000\u0000\u0000\u0013\u0010\u0001\u0000\u0000"+
		"\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u00142\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\n\b\u0000\u0000\u0016\u0017\u0005\f\u0000\u0000\u00171\u0003"+
		"\u0000\u0000\t\u0018\u0019\n\u0007\u0000\u0000\u0019\u001a\u0005\r\u0000"+
		"\u0000\u001a1\u0003\u0000\u0000\b\u001b\u001c\n\u0006\u0000\u0000\u001c"+
		"\u001d\u0005\u000e\u0000\u0000\u001d1\u0003\u0000\u0000\u0007\u001e\u001f"+
		"\n\u0005\u0000\u0000\u001f \u0005\u0005\u0000\u0000 1\u0003\u0000\u0000"+
		"\u0006!\"\n\u0004\u0000\u0000\"#\u0005\u0006\u0000\u0000#1\u0003\u0000"+
		"\u0000\u0005$%\n\u0003\u0000\u0000%&\u0005\u000f\u0000\u0000&1\u0003\u0000"+
		"\u0000\u0004\'(\n\u0002\u0000\u0000()\u0005\u0010\u0000\u0000)1\u0003"+
		"\u0000\u0000\u0003*+\n\u000b\u0000\u0000+,\u0005\t\u0000\u0000,1\u0005"+
		"\u0014\u0000\u0000-.\n\n\u0000\u0000./\u0005\n\u0000\u0000/1\u0005\u0014"+
		"\u0000\u00000\u0015\u0001\u0000\u0000\u00000\u0018\u0001\u0000\u0000\u0000"+
		"0\u001b\u0001\u0000\u0000\u00000\u001e\u0001\u0000\u0000\u00000!\u0001"+
		"\u0000\u0000\u00000$\u0001\u0000\u0000\u00000\'\u0001\u0000\u0000\u0000"+
		"0*\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u000014\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0001\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u00005>\u0005\b\u0000\u00006>\u0005"+
		"\u0011\u0000\u00007>\u0005\u0012\u0000\u00008>\u0005\u0014\u0000\u0000"+
		"9>\u0005\u0013\u0000\u0000:;\u0007\u0000\u0000\u0000;<\u0005\u0007\u0000"+
		"\u0000<>\u0005\u0014\u0000\u0000=5\u0001\u0000\u0000\u0000=6\u0001\u0000"+
		"\u0000\u0000=7\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000=9\u0001"+
		"\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000"+
		"\u0000\u0004\u001302=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}