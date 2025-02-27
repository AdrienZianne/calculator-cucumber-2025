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
		RULE_expr = 0, RULE_sumPostfix = 1, RULE_productPostfix = 2, RULE_atomPostfix = 3, 
		RULE_sumPrefix = 4, RULE_productPrefix = 5, RULE_atomPrefix = 6, RULE_sumInfix = 7, 
		RULE_productInfix = 8, RULE_atomInfix = 9, RULE_number = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "sumPostfix", "productPostfix", "atomPostfix", "sumPrefix", "productPrefix", 
			"atomPrefix", "sumInfix", "productInfix", "atomInfix", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'*'", "'/'", "'+'", "'-'"
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
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExprInfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SUB) | (1L << INT))) != 0)) {
					{
					setState(22);
					sumInfix(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new ExprPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB))) != 0)) {
					{
					setState(25);
					sumPrefix();
					}
				}

				}
				break;
			case 3:
				_localctx = new ExprPostfixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(28);
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
		public SumPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumPostfix; }
	 
		public SumPostfixContext() { }
		public void copyFrom(SumPostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumPostfixSumContext extends SumPostfixContext {
		public List<AtomPostfixContext> atomPostfix() {
			return getRuleContexts(AtomPostfixContext.class);
		}
		public AtomPostfixContext atomPostfix(int i) {
			return getRuleContext(AtomPostfixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public SumPostfixSumContext(SumPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumPostfixSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumPostfixSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumPostfixSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumPostfixDiffContext extends SumPostfixContext {
		public List<AtomPostfixContext> atomPostfix() {
			return getRuleContexts(AtomPostfixContext.class);
		}
		public AtomPostfixContext atomPostfix(int i) {
			return getRuleContext(AtomPostfixContext.class,i);
		}
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public SumPostfixDiffContext(SumPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumPostfixDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumPostfixDiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumPostfixDiff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumPostfixProdContext extends SumPostfixContext {
		public ProductPostfixContext productPostfix() {
			return getRuleContext(ProductPostfixContext.class,0);
		}
		public SumPostfixProdContext(SumPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumPostfixProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumPostfixProd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumPostfixProd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumPostfixContext sumPostfix() throws RecognitionException {
		SumPostfixContext _localctx = new SumPostfixContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sumPostfix);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new SumPostfixProdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				productPostfix();
				}
				break;
			case 2:
				_localctx = new SumPostfixSumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__0);
				setState(35);
				atomPostfix();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INT))) != 0)) {
					{
					{
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(36);
						match(T__1);
						}
					}

					setState(39);
					atomPostfix();
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(45);
				match(T__2);
				setState(46);
				match(ADD);
				}
				break;
			case 3:
				_localctx = new SumPostfixDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(T__0);
				setState(49);
				atomPostfix();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INT))) != 0)) {
					{
					{
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(50);
						match(T__1);
						}
					}

					setState(53);
					atomPostfix();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__2);
				setState(60);
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
		public ProductPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productPostfix; }
	 
		public ProductPostfixContext() { }
		public void copyFrom(ProductPostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProductPostfixMultContext extends ProductPostfixContext {
		public List<AtomPostfixContext> atomPostfix() {
			return getRuleContexts(AtomPostfixContext.class);
		}
		public AtomPostfixContext atomPostfix(int i) {
			return getRuleContext(AtomPostfixContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LabeledExprParser.MUL, 0); }
		public ProductPostfixMultContext(ProductPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductPostfixMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductPostfixMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductPostfixMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProductPostfixDivContext extends ProductPostfixContext {
		public List<AtomPostfixContext> atomPostfix() {
			return getRuleContexts(AtomPostfixContext.class);
		}
		public AtomPostfixContext atomPostfix(int i) {
			return getRuleContext(AtomPostfixContext.class,i);
		}
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public ProductPostfixDivContext(ProductPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductPostfixDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductPostfixDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductPostfixDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductPostfixContext productPostfix() throws RecognitionException {
		ProductPostfixContext _localctx = new ProductPostfixContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_productPostfix);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ProductPostfixMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__0);
				setState(65);
				atomPostfix();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INT))) != 0)) {
					{
					{
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(66);
						match(T__1);
						}
					}

					setState(69);
					atomPostfix();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(T__2);
				setState(76);
				match(MUL);
				}
				break;
			case 2:
				_localctx = new ProductPostfixDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__0);
				setState(79);
				atomPostfix();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INT))) != 0)) {
					{
					{
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(80);
						match(T__1);
						}
					}

					setState(83);
					atomPostfix();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(T__2);
				setState(90);
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

	public static class AtomPostfixContext extends ParserRuleContext {
		public AtomPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomPostfix; }
	 
		public AtomPostfixContext() { }
		public void copyFrom(AtomPostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomPostfixIntContext extends AtomPostfixContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AtomPostfixIntContext(AtomPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAtomPostfixInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAtomPostfixInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomPostfixInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomPostfixSumContext extends AtomPostfixContext {
		public SumPostfixContext sumPostfix() {
			return getRuleContext(SumPostfixContext.class,0);
		}
		public AtomPostfixSumContext(AtomPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAtomPostfixSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAtomPostfixSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomPostfixSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomPostfixContext atomPostfix() throws RecognitionException {
		AtomPostfixContext _localctx = new AtomPostfixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atomPostfix);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new AtomPostfixSumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				sumPostfix();
				}
				break;
			case INT:
				_localctx = new AtomPostfixIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				number();
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

	public static class SumPrefixContext extends ParserRuleContext {
		public SumPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumPrefix; }
	 
		public SumPrefixContext() { }
		public void copyFrom(SumPrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumPrefixSumContext extends SumPrefixContext {
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public List<AtomPrefixContext> atomPrefix() {
			return getRuleContexts(AtomPrefixContext.class);
		}
		public AtomPrefixContext atomPrefix(int i) {
			return getRuleContext(AtomPrefixContext.class,i);
		}
		public SumPrefixSumContext(SumPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumPrefixSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumPrefixSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumPrefixSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumPrefixDiffContext extends SumPrefixContext {
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public List<AtomPrefixContext> atomPrefix() {
			return getRuleContexts(AtomPrefixContext.class);
		}
		public AtomPrefixContext atomPrefix(int i) {
			return getRuleContext(AtomPrefixContext.class,i);
		}
		public SumPrefixDiffContext(SumPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumPrefixDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumPrefixDiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumPrefixDiff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumPrefixProdContext extends SumPrefixContext {
		public ProductPrefixContext productPrefix() {
			return getRuleContext(ProductPrefixContext.class,0);
		}
		public SumPrefixProdContext(SumPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumPrefixProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumPrefixProd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumPrefixProd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumPrefixContext sumPrefix() throws RecognitionException {
		SumPrefixContext _localctx = new SumPrefixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sumPrefix);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
				_localctx = new SumPrefixProdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				productPrefix();
				}
				break;
			case ADD:
				_localctx = new SumPrefixSumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(ADD);
				setState(100);
				match(T__0);
				setState(101);
				atomPrefix();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT))) != 0)) {
					{
					{
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(102);
						match(T__1);
						}
					}

					setState(105);
					atomPrefix();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__2);
				}
				break;
			case SUB:
				_localctx = new SumPrefixDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(SUB);
				setState(114);
				match(T__0);
				setState(115);
				atomPrefix();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT))) != 0)) {
					{
					{
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(116);
						match(T__1);
						}
					}

					setState(119);
					atomPrefix();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(T__2);
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
		public ProductPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productPrefix; }
	 
		public ProductPrefixContext() { }
		public void copyFrom(ProductPrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProductPrefixMultContext extends ProductPrefixContext {
		public TerminalNode MUL() { return getToken(LabeledExprParser.MUL, 0); }
		public List<AtomPrefixContext> atomPrefix() {
			return getRuleContexts(AtomPrefixContext.class);
		}
		public AtomPrefixContext atomPrefix(int i) {
			return getRuleContext(AtomPrefixContext.class,i);
		}
		public ProductPrefixMultContext(ProductPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductPrefixMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductPrefixMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductPrefixMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProductPrefixDivContext extends ProductPrefixContext {
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public List<AtomPrefixContext> atomPrefix() {
			return getRuleContexts(AtomPrefixContext.class);
		}
		public AtomPrefixContext atomPrefix(int i) {
			return getRuleContext(AtomPrefixContext.class,i);
		}
		public ProductPrefixDivContext(ProductPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductPrefixDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductPrefixDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductPrefixDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductPrefixContext productPrefix() throws RecognitionException {
		ProductPrefixContext _localctx = new ProductPrefixContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_productPrefix);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new ProductPrefixMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(MUL);
				setState(130);
				match(T__0);
				setState(131);
				atomPrefix();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT))) != 0)) {
					{
					{
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(132);
						match(T__1);
						}
					}

					setState(135);
					atomPrefix();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__2);
				}
				break;
			case DIV:
				_localctx = new ProductPrefixDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(DIV);
				setState(144);
				match(T__0);
				setState(145);
				atomPrefix();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT))) != 0)) {
					{
					{
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(146);
						match(T__1);
						}
					}

					setState(149);
					atomPrefix();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(T__2);
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

	public static class AtomPrefixContext extends ParserRuleContext {
		public AtomPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomPrefix; }
	 
		public AtomPrefixContext() { }
		public void copyFrom(AtomPrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomPrefixIntContext extends AtomPrefixContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AtomPrefixIntContext(AtomPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAtomPrefixInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAtomPrefixInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomPrefixInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomPrefixSumContext extends AtomPrefixContext {
		public SumPrefixContext sumPrefix() {
			return getRuleContext(SumPrefixContext.class,0);
		}
		public AtomPrefixSumContext(AtomPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAtomPrefixSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAtomPrefixSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomPrefixSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomPrefixContext atomPrefix() throws RecognitionException {
		AtomPrefixContext _localctx = new AtomPrefixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atomPrefix);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
			case ADD:
			case SUB:
				_localctx = new AtomPrefixSumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				sumPrefix();
				}
				break;
			case INT:
				_localctx = new AtomPrefixIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				number();
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

			setState(164);
			productInfix(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new SumInfixAddContext(new SumInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumInfix);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						match(ADD);
						setState(168);
						productInfix(0);
						}
						break;
					case 2:
						{
						_localctx = new SumInfixDiffContext(new SumInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumInfix);
						setState(169);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(170);
						match(SUB);
						setState(171);
						productInfix(0);
						}
						break;
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

			setState(178);
			atomInfix();
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ProductInfixMultContext(new ProductInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_productInfix);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(181);
						match(MUL);
						setState(182);
						atomInfix();
						}
						break;
					case 2:
						{
						_localctx = new ProductInfixDivContext(new ProductInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_productInfix);
						setState(183);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(184);
						match(DIV);
						setState(185);
						atomInfix();
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
	public static class AtomInfixIntContext extends AtomInfixContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
	public static class AtomInfixNegContext extends AtomInfixContext {
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public AtomInfixNegContext(AtomInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAtomInfixNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAtomInfixNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomInfixNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomInfixContext atomInfix() throws RecognitionException {
		AtomInfixContext _localctx = new AtomInfixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atomInfix);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new AtomInfixIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				number();
				}
				break;
			case SUB:
				_localctx = new AtomInfixNegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(SUB);
				setState(193);
				sumInfix(0);
				}
				break;
			case T__0:
				_localctx = new AtomInfixSumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(T__0);
				setState(195);
				sumInfix(0);
				setState(196);
				match(T__2);
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
	public static class NumberIntContext extends NumberContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public NumberIntContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterNumberInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitNumberInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNumberInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		try {
			_localctx = new NumberIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(INT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\u00cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\5\2\32\n\2\3\2\5\2\35\n\2\3\2\5\2 \n\2\5\2\"\n\2\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\66\n\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\5\3A\n\3\3\4\3\4"+
		"\3\4\5\4F\n\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"T\n\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\5\5c\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6x\n\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\3\6\5\6\u0082"+
		"\n\6\3\7\3\7\3\7\3\7\5\7\u0088\n\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0096\n\7\3\7\7\7\u0099\n\7\f\7\16\7\u009c"+
		"\13\7\3\7\3\7\5\7\u00a0\n\7\3\b\3\b\5\b\u00a4\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u00af\n\t\f\t\16\t\u00b2\13\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n\u00c0\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00c9\n\13\3\f\3\f\3\f\2\4\20\22\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\2\2\u00e4\2!\3\2\2\2\4@\3\2\2\2\6^\3\2\2\2\bb\3\2\2\2\n"+
		"\u0081\3\2\2\2\f\u009f\3\2\2\2\16\u00a3\3\2\2\2\20\u00a5\3\2\2\2\22\u00b3"+
		"\3\2\2\2\24\u00c8\3\2\2\2\26\u00ca\3\2\2\2\30\32\5\20\t\2\31\30\3\2\2"+
		"\2\31\32\3\2\2\2\32\"\3\2\2\2\33\35\5\n\6\2\34\33\3\2\2\2\34\35\3\2\2"+
		"\2\35\"\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\31\3"+
		"\2\2\2!\34\3\2\2\2!\37\3\2\2\2\"\3\3\2\2\2#A\5\6\4\2$%\7\3\2\2%,\5\b\5"+
		"\2&(\7\4\2\2\'&\3\2\2\2\'(\3\2\2\2()\3\2\2\2)+\5\b\5\2*\'\3\2\2\2+.\3"+
		"\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\5\2\2\60\61\7\b\2"+
		"\2\61A\3\2\2\2\62\63\7\3\2\2\63:\5\b\5\2\64\66\7\4\2\2\65\64\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\3\2\2\2\679\5\b\5\28\65\3\2\2\29<\3\2\2\2:8\3\2\2\2"+
		":;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\5\2\2>?\7\t\2\2?A\3\2\2\2@#\3\2\2\2"+
		"@$\3\2\2\2@\62\3\2\2\2A\5\3\2\2\2BC\7\3\2\2CJ\5\b\5\2DF\7\4\2\2ED\3\2"+
		"\2\2EF\3\2\2\2FG\3\2\2\2GI\5\b\5\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2"+
		"\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\5\2\2NO\7\6\2\2O_\3\2\2\2PQ\7\3\2\2QX\5\b"+
		"\5\2RT\7\4\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\5\b\5\2VS\3\2\2\2WZ\3\2"+
		"\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\5\2\2\\]\7\7\2\2]_\3"+
		"\2\2\2^B\3\2\2\2^P\3\2\2\2_\7\3\2\2\2`c\5\4\3\2ac\5\26\f\2b`\3\2\2\2b"+
		"a\3\2\2\2c\t\3\2\2\2d\u0082\5\f\7\2ef\7\b\2\2fg\7\3\2\2gn\5\16\b\2hj\7"+
		"\4\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\5\16\b\2li\3\2\2\2mp\3\2\2\2nl"+
		"\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\5\2\2r\u0082\3\2\2\2st\7\t"+
		"\2\2tu\7\3\2\2u|\5\16\b\2vx\7\4\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\5"+
		"\16\b\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2"+
		"\177\u0080\7\5\2\2\u0080\u0082\3\2\2\2\u0081d\3\2\2\2\u0081e\3\2\2\2\u0081"+
		"s\3\2\2\2\u0082\13\3\2\2\2\u0083\u0084\7\6\2\2\u0084\u0085\7\3\2\2\u0085"+
		"\u008c\5\16\b\2\u0086\u0088\7\4\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\5\16\b\2\u008a\u0087\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\5\2\2\u0090\u00a0\3\2\2\2\u0091"+
		"\u0092\7\7\2\2\u0092\u0093\7\3\2\2\u0093\u009a\5\16\b\2\u0094\u0096\7"+
		"\4\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\5\16\b\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7\5\2\2\u009e\u00a0\3\2\2\2\u009f\u0083\3\2\2\2\u009f\u0091\3\2"+
		"\2\2\u00a0\r\3\2\2\2\u00a1\u00a4\5\n\6\2\u00a2\u00a4\5\26\f\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\17\3\2\2\2\u00a5\u00a6\b\t\1\2\u00a6"+
		"\u00a7\5\22\n\2\u00a7\u00b0\3\2\2\2\u00a8\u00a9\f\4\2\2\u00a9\u00aa\7"+
		"\b\2\2\u00aa\u00af\5\22\n\2\u00ab\u00ac\f\3\2\2\u00ac\u00ad\7\t\2\2\u00ad"+
		"\u00af\5\22\n\2\u00ae\u00a8\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\21\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\b\n\1\2\u00b4\u00b5\5\24\13\2\u00b5\u00be\3"+
		"\2\2\2\u00b6\u00b7\f\4\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00bd\5\24\13\2\u00b9"+
		"\u00ba\f\3\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bd\5\24\13\2\u00bc\u00b6\3"+
		"\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\23\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c9\5\26\f"+
		"\2\u00c2\u00c3\7\t\2\2\u00c3\u00c9\5\20\t\2\u00c4\u00c5\7\3\2\2\u00c5"+
		"\u00c6\5\20\t\2\u00c6\u00c7\7\5\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c1\3"+
		"\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\25\3\2\2\2\u00ca"+
		"\u00cb\7\13\2\2\u00cb\27\3\2\2\2!\31\34\37!\',\65:@EJSX^binw|\u0081\u0087"+
		"\u008c\u0095\u009a\u009f\u00a3\u00ae\u00b0\u00bc\u00be\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}