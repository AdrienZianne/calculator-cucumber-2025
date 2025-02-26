// Generated from calculator/parser/LabeledExpr.g4 by ANTLR 4.9.1
package calculator.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, ID=8, INT=9, NEWLINE=10, 
		WS=11;
	public static final int
		RULE_expr = 0, RULE_sumPostfix = 1, RULE_productPostfix = 2, RULE_argsPostfix = 3, 
		RULE_sumPrefix = 4, RULE_productPrefix = 5, RULE_argsPrefix = 6, RULE_sumInfix = 7, 
		RULE_productInfix = 8, RULE_atomInfix = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "sumPostfix", "productPostfix", "argsPostfix", "sumPrefix", "productPrefix", 
			"argsPrefix", "sumInfix", "productInfix", "atomInfix"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MUL", "DIV", "ADD", "SUB", "ID", "INT", "NEWLINE", 
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
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprInfixContext extends ExprContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public ExprInfixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterExprInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitExprInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitExprInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPrefixContext extends ExprContext {
		public SumPrefixContext sumPrefix() {
			return getRuleContext(SumPrefixContext.class,0);
		}
		public ExprPrefixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterExprPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitExprPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitExprPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPostfixContext extends ExprContext {
		public SumPostfixContext sumPostfix() {
			return getRuleContext(SumPostfixContext.class,0);
		}
		public ExprPostfixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterExprPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitExprPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitExprPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		int _la;
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExprInfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SUB) | (1L << INT))) != 0)) {
					{
					setState(20);
					sumInfix(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new ExprPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB))) != 0)) {
					{
					setState(23);
					sumPrefix();
					}
				}

				}
				break;
			case 3:
				_localctx = new ExprPostfixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(26);
					sumPostfix();
					}
				}

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

	public static class SumPostfixContext extends ParserRuleContext {
		public ProductPostfixContext productPostfix() {
			return getRuleContext(ProductPostfixContext.class,0);
		}
		public ArgsPostfixContext argsPostfix() {
			return getRuleContext(ArgsPostfixContext.class,0);
		}
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public SumPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumPostfixContext sumPostfix() throws RecognitionException {
		SumPostfixContext _localctx = new SumPostfixContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sumPostfix);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				productPostfix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(T__0);
				setState(33);
				argsPostfix();
				setState(34);
				match(T__1);
				setState(35);
				match(ADD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(T__0);
				setState(38);
				argsPostfix();
				setState(39);
				match(T__1);
				setState(40);
				match(SUB);
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

	public static class ProductPostfixContext extends ParserRuleContext {
		public List<ArgsPostfixContext> argsPostfix() {
			return getRuleContexts(ArgsPostfixContext.class);
		}
		public ArgsPostfixContext argsPostfix(int i) {
			return getRuleContext(ArgsPostfixContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LabeledExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public ProductPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductPostfixContext productPostfix() throws RecognitionException {
		ProductPostfixContext _localctx = new ProductPostfixContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_productPostfix);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(T__0);
				setState(45);
				argsPostfix();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << INT))) != 0)) {
					{
					{
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(46);
						match(T__2);
						}
					}

					setState(49);
					argsPostfix();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(T__1);
				setState(56);
				match(MUL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__0);
				setState(59);
				argsPostfix();
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << INT))) != 0)) {
					{
					{
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(60);
						match(T__2);
						}
					}

					setState(63);
					argsPostfix();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(T__1);
				setState(70);
				match(DIV);
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

	public static class ArgsPostfixContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public List<ArgsPostfixContext> argsPostfix() {
			return getRuleContexts(ArgsPostfixContext.class);
		}
		public ArgsPostfixContext argsPostfix(int i) {
			return getRuleContext(ArgsPostfixContext.class,i);
		}
		public SumPostfixContext sumPostfix() {
			return getRuleContext(SumPostfixContext.class,0);
		}
		public ArgsPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterArgsPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitArgsPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArgsPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsPostfixContext argsPostfix() throws RecognitionException {
		ArgsPostfixContext _localctx = new ArgsPostfixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argsPostfix);
		int _la;
		try {
			int _alt;
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(INT);
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(76);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__2) {
							{
							setState(75);
							match(T__2);
							}
						}

						setState(78);
						argsPostfix();
						}
						} 
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				sumPostfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
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

	public static class SumPrefixContext extends ParserRuleContext {
		public ProductPrefixContext productPrefix() {
			return getRuleContext(ProductPrefixContext.class,0);
		}
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public ArgsPrefixContext argsPrefix() {
			return getRuleContext(ArgsPrefixContext.class,0);
		}
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public SumPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumPrefixContext sumPrefix() throws RecognitionException {
		SumPrefixContext _localctx = new SumPrefixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sumPrefix);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				productPrefix();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(ADD);
				setState(90);
				match(T__0);
				setState(91);
				argsPrefix();
				setState(92);
				match(T__1);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(SUB);
				setState(95);
				match(T__0);
				setState(96);
				argsPrefix();
				setState(97);
				match(T__1);
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

	public static class ProductPrefixContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(LabeledExprParser.MUL, 0); }
		public List<ArgsPrefixContext> argsPrefix() {
			return getRuleContexts(ArgsPrefixContext.class);
		}
		public ArgsPrefixContext argsPrefix(int i) {
			return getRuleContext(ArgsPrefixContext.class,i);
		}
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public ProductPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductPrefixContext productPrefix() throws RecognitionException {
		ProductPrefixContext _localctx = new ProductPrefixContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_productPrefix);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(MUL);
				setState(102);
				match(T__0);
				setState(103);
				argsPrefix();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT))) != 0)) {
					{
					{
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(104);
						match(T__2);
						}
					}

					setState(107);
					argsPrefix();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(T__1);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(DIV);
				setState(116);
				match(T__0);
				setState(117);
				argsPrefix();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT))) != 0)) {
					{
					{
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(118);
						match(T__2);
						}
					}

					setState(121);
					argsPrefix();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__1);
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

	public static class ArgsPrefixContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public List<ArgsPrefixContext> argsPrefix() {
			return getRuleContexts(ArgsPrefixContext.class);
		}
		public ArgsPrefixContext argsPrefix(int i) {
			return getRuleContext(ArgsPrefixContext.class,i);
		}
		public SumPrefixContext sumPrefix() {
			return getRuleContext(SumPrefixContext.class,0);
		}
		public ArgsPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterArgsPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitArgsPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArgsPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsPrefixContext argsPrefix() throws RecognitionException {
		ArgsPrefixContext _localctx = new ArgsPrefixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argsPrefix);
		int _la;
		try {
			int _alt;
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(INT);
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__2) {
							{
							setState(132);
							match(T__2);
							}
						}

						setState(135);
						argsPrefix();
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				sumPrefix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
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

	public static class SumInfixContext extends ParserRuleContext {
		public SumInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumInfix; }
	 
		public SumInfixContext() { }
		public void copyFrom(SumInfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumInfixAddContext extends SumInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public ProductInfixContext productInfix() {
			return getRuleContext(ProductInfixContext.class,0);
		}
		public SumInfixAddContext(SumInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumInfixAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumInfixAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumInfixAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumInfixDiffContext extends SumInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public ProductInfixContext productInfix() {
			return getRuleContext(ProductInfixContext.class,0);
		}
		public SumInfixDiffContext(SumInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumInfixDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumInfixDiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumInfixDiff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumInfixProdContext extends SumInfixContext {
		public ProductInfixContext productInfix() {
			return getRuleContext(ProductInfixContext.class,0);
		}
		public SumInfixProdContext(SumInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumInfixProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumInfixProd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumInfixProd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumInfixContext sumInfix() throws RecognitionException {
		return sumInfix(0);
	}

	private SumInfixContext sumInfix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumInfixContext _localctx = new SumInfixContext(_ctx, _parentState);
		SumInfixContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_sumInfix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SumInfixProdContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(146);
			productInfix(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new SumInfixAddContext(new SumInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumInfix);
						setState(148);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(149);
						match(ADD);
						setState(150);
						productInfix(0);
						}
						break;
					case 2:
						{
						_localctx = new SumInfixDiffContext(new SumInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumInfix);
						setState(151);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(152);
						match(SUB);
						setState(153);
						productInfix(0);
						}
						break;
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ProductInfixContext extends ParserRuleContext {
		public ProductInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productInfix; }
	 
		public ProductInfixContext() { }
		public void copyFrom(ProductInfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProductInfixAtomContext extends ProductInfixContext {
		public AtomInfixContext atomInfix() {
			return getRuleContext(AtomInfixContext.class,0);
		}
		public ProductInfixAtomContext(ProductInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductInfixAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductInfixAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductInfixAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProductInfixMultContext extends ProductInfixContext {
		public ProductInfixContext productInfix() {
			return getRuleContext(ProductInfixContext.class,0);
		}
		public TerminalNode MUL() { return getToken(LabeledExprParser.MUL, 0); }
		public AtomInfixContext atomInfix() {
			return getRuleContext(AtomInfixContext.class,0);
		}
		public ProductInfixMultContext(ProductInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductInfixMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductInfixMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductInfixMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProductInfixDivContext extends ProductInfixContext {
		public ProductInfixContext productInfix() {
			return getRuleContext(ProductInfixContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public AtomInfixContext atomInfix() {
			return getRuleContext(AtomInfixContext.class,0);
		}
		public ProductInfixDivContext(ProductInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductInfixDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductInfixDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductInfixDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductInfixContext productInfix() throws RecognitionException {
		return productInfix(0);
	}

	private ProductInfixContext productInfix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProductInfixContext _localctx = new ProductInfixContext(_ctx, _parentState);
		ProductInfixContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_productInfix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ProductInfixAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(160);
			atomInfix();
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ProductInfixMultContext(new ProductInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_productInfix);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(MUL);
						setState(164);
						atomInfix();
						}
						break;
					case 2:
						{
						_localctx = new ProductInfixDivContext(new ProductInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_productInfix);
						setState(165);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(166);
						match(DIV);
						setState(167);
						atomInfix();
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class AtomInfixContext extends ParserRuleContext {
		public AtomInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomInfix; }
	 
		public AtomInfixContext() { }
		public void copyFrom(AtomInfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomInfixSumContext extends AtomInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public AtomInfixSumContext(AtomInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAtomInfixSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAtomInfixSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomInfixSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomInfixNegationContext extends AtomInfixContext {
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public AtomInfixNegationContext(AtomInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAtomInfixNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAtomInfixNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomInfixNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomInfixIntContext extends AtomInfixContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public AtomInfixIntContext(AtomInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAtomInfixInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAtomInfixInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomInfixInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomInfixContext atomInfix() throws RecognitionException {
		AtomInfixContext _localctx = new AtomInfixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atomInfix);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new AtomInfixIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(INT);
				}
				break;
			case SUB:
				_localctx = new AtomInfixNegationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(SUB);
				setState(175);
				match(INT);
				}
				break;
			case T__0:
				_localctx = new AtomInfixSumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__0);
				setState(177);
				sumInfix(0);
				setState(178);
				match(T__1);
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
		case 7:
			return sumInfix_sempred((SumInfixContext)_localctx, predIndex);
		case 8:
			return productInfix_sempred((ProductInfixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sumInfix_sempred(SumInfixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean productInfix_sempred(ProductInfixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\5\2\30\n\2\3\2\5\2\33\n\2\3\2\5\2\36\n\2\5\2 \n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\5\4\62\n\4\3\4\7"+
		"\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\7\4C\n\4"+
		"\f\4\16\4F\13\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\5\5O\n\5\3\5\7\5R\n\5\f\5"+
		"\16\5U\13\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6f\n\6\3\7\3\7\3\7\3\7\5\7l\n\7\3\7\7\7o\n\7\f\7\16\7r\13\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7z\n\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7\3\7\5"+
		"\7\u0084\n\7\3\b\3\b\5\b\u0088\n\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13"+
		"\b\3\b\3\b\5\b\u0092\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009d"+
		"\n\t\f\t\16\t\u00a0\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ab"+
		"\n\n\f\n\16\n\u00ae\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b7"+
		"\n\13\3\13\2\4\20\22\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u00cf\2\37\3\2\2"+
		"\2\4,\3\2\2\2\6J\3\2\2\2\bX\3\2\2\2\ne\3\2\2\2\f\u0083\3\2\2\2\16\u0091"+
		"\3\2\2\2\20\u0093\3\2\2\2\22\u00a1\3\2\2\2\24\u00b6\3\2\2\2\26\30\5\20"+
		"\t\2\27\26\3\2\2\2\27\30\3\2\2\2\30 \3\2\2\2\31\33\5\n\6\2\32\31\3\2\2"+
		"\2\32\33\3\2\2\2\33 \3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\35\36\3\2\2\2"+
		"\36 \3\2\2\2\37\27\3\2\2\2\37\32\3\2\2\2\37\35\3\2\2\2 \3\3\2\2\2!-\5"+
		"\6\4\2\"#\7\3\2\2#$\5\b\5\2$%\7\4\2\2%&\7\b\2\2&-\3\2\2\2\'(\7\3\2\2("+
		")\5\b\5\2)*\7\4\2\2*+\7\t\2\2+-\3\2\2\2,!\3\2\2\2,\"\3\2\2\2,\'\3\2\2"+
		"\2-\5\3\2\2\2./\7\3\2\2/\66\5\b\5\2\60\62\7\5\2\2\61\60\3\2\2\2\61\62"+
		"\3\2\2\2\62\63\3\2\2\2\63\65\5\b\5\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3"+
		"\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\4\2\2:;\7\6\2\2;K\3\2"+
		"\2\2<=\7\3\2\2=D\5\b\5\2>@\7\5\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AC\5\b"+
		"\5\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\4"+
		"\2\2HI\7\7\2\2IK\3\2\2\2J.\3\2\2\2J<\3\2\2\2K\7\3\2\2\2LS\7\13\2\2MO\7"+
		"\5\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\5\b\5\2QN\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VY\5\4\3\2WY\7\13\2\2XL\3\2\2\2XV"+
		"\3\2\2\2XW\3\2\2\2Y\t\3\2\2\2Zf\5\f\7\2[\\\7\b\2\2\\]\7\3\2\2]^\5\16\b"+
		"\2^_\7\4\2\2_f\3\2\2\2`a\7\t\2\2ab\7\3\2\2bc\5\16\b\2cd\7\4\2\2df\3\2"+
		"\2\2eZ\3\2\2\2e[\3\2\2\2e`\3\2\2\2f\13\3\2\2\2gh\7\6\2\2hi\7\3\2\2ip\5"+
		"\16\b\2jl\7\5\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\5\16\b\2nk\3\2\2\2o"+
		"r\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\4\2\2t\u0084\3\2"+
		"\2\2uv\7\7\2\2vw\7\3\2\2w~\5\16\b\2xz\7\5\2\2yx\3\2\2\2yz\3\2\2\2z{\3"+
		"\2\2\2{}\5\16\b\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\4\2\2\u0082\u0084\3\2\2\2"+
		"\u0083g\3\2\2\2\u0083u\3\2\2\2\u0084\r\3\2\2\2\u0085\u008c\7\13\2\2\u0086"+
		"\u0088\7\5\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008b\5\16\b\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0092\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0092\5\n\6\2\u0090\u0092\7\13\2\2\u0091\u0085\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\17\3\2\2\2\u0093\u0094\b\t\1"+
		"\2\u0094\u0095\5\22\n\2\u0095\u009e\3\2\2\2\u0096\u0097\f\4\2\2\u0097"+
		"\u0098\7\b\2\2\u0098\u009d\5\22\n\2\u0099\u009a\f\3\2\2\u009a\u009b\7"+
		"\t\2\2\u009b\u009d\5\22\n\2\u009c\u0096\3\2\2\2\u009c\u0099\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\21\3\2\2"+
		"\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\b\n\1\2\u00a2\u00a3\5\24\13\2\u00a3"+
		"\u00ac\3\2\2\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00ab\5\24"+
		"\13\2\u00a7\u00a8\f\3\2\2\u00a8\u00a9\7\7\2\2\u00a9\u00ab\5\24\13\2\u00aa"+
		"\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b7"+
		"\7\13\2\2\u00b0\u00b1\7\t\2\2\u00b1\u00b7\7\13\2\2\u00b2\u00b3\7\3\2\2"+
		"\u00b3\u00b4\5\20\t\2\u00b4\u00b5\7\4\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00af"+
		"\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\25\3\2\2\2\35\27"+
		"\32\35\37,\61\66?DJNSXekpy~\u0083\u0087\u008c\u0091\u009c\u009e\u00aa"+
		"\u00ac\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}