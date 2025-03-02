// Generated from calculator/parser/antlr/LabeledExpr.g4 by ANTLR 4.9.1
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
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MUL=5, DIV=6, ADD=7, SUB=8, ID=9, INT=10, 
		FLOAT=11, RATIONAL=12, NEWLINE=13, WS=14;
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
			null, "'('", "','", "')'", "'i'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "ID", "INT", 
			"FLOAT", "RATIONAL", "NEWLINE", "WS"
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
		public TerminalNode EOF() { return getToken(LabeledExprParser.EOF, 0); }
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public SumPrefixContext sumPrefix() {
			return getRuleContext(SumPrefixContext.class,0);
		}
		public SumPostfixContext sumPostfix() {
			return getRuleContext(SumPostfixContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(22);
				sumInfix(0);
				}
				break;
			case 2:
				{
				setState(23);
				sumPrefix();
				}
				break;
			case 3:
				{
				setState(24);
				sumPostfix();
				}
				break;
			}
			setState(27);
			match(EOF);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SumPostfixProdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				productPostfix();
				}
				break;
			case 2:
				_localctx = new SumPostfixSumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(T__0);
				setState(31);
				atomPostfix();
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << SUB) | (1L << INT) | (1L << FLOAT) | (1L << RATIONAL))) != 0)) {
					{
					{
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(32);
						match(T__1);
						}
					}

					setState(35);
					atomPostfix();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
				match(T__2);
				setState(42);
				match(ADD);
				}
				break;
			case 3:
				_localctx = new SumPostfixDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(T__0);
				setState(45);
				atomPostfix();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << SUB) | (1L << INT) | (1L << FLOAT) | (1L << RATIONAL))) != 0)) {
					{
					{
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(46);
						match(T__1);
						}
					}

					setState(49);
					atomPostfix();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(T__2);
				setState(56);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ProductPostfixMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__0);
				setState(61);
				atomPostfix();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << SUB) | (1L << INT) | (1L << FLOAT) | (1L << RATIONAL))) != 0)) {
					{
					{
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(62);
						match(T__1);
						}
					}

					setState(65);
					atomPostfix();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(T__2);
				setState(72);
				match(MUL);
				}
				break;
			case 2:
				_localctx = new ProductPostfixDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__0);
				setState(75);
				atomPostfix();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << SUB) | (1L << INT) | (1L << FLOAT) | (1L << RATIONAL))) != 0)) {
					{
					{
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(76);
						match(T__1);
						}
					}

					setState(79);
					atomPostfix();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(T__2);
				setState(86);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new AtomPostfixSumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				sumPostfix();
				}
				break;
			case SUB:
			case INT:
			case FLOAT:
			case RATIONAL:
				_localctx = new AtomPostfixIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
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
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
				_localctx = new SumPrefixProdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				productPrefix();
				}
				break;
			case ADD:
				_localctx = new SumPrefixSumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(ADD);
				setState(96);
				match(T__0);
				setState(97);
				atomPrefix();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT) | (1L << FLOAT) | (1L << RATIONAL))) != 0)) {
					{
					{
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(98);
						match(T__1);
						}
					}

					setState(101);
					atomPrefix();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__2);
				}
				break;
			case SUB:
				_localctx = new SumPrefixDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(SUB);
				setState(110);
				match(T__0);
				setState(111);
				atomPrefix();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT) | (1L << FLOAT) | (1L << RATIONAL))) != 0)) {
					{
					{
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(112);
						match(T__1);
						}
					}

					setState(115);
					atomPrefix();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new ProductPrefixMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(MUL);
				setState(126);
				match(T__0);
				setState(127);
				atomPrefix();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT) | (1L << FLOAT) | (1L << RATIONAL))) != 0)) {
					{
					{
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(128);
						match(T__1);
						}
					}

					setState(131);
					atomPrefix();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__2);
				}
				break;
			case DIV:
				_localctx = new ProductPrefixDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(DIV);
				setState(140);
				match(T__0);
				setState(141);
				atomPrefix();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT) | (1L << FLOAT) | (1L << RATIONAL))) != 0)) {
					{
					{
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(142);
						match(T__1);
						}
					}

					setState(145);
					atomPrefix();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new AtomPrefixSumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				sumPrefix();
				}
				break;
			case 2:
				_localctx = new AtomPrefixIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				number();
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

			setState(160);
			productInfix(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new SumInfixAddContext(new SumInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumInfix);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(ADD);
						setState(164);
						productInfix(0);
						}
						break;
					case 2:
						{
						_localctx = new SumInfixDiffContext(new SumInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumInfix);
						setState(165);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(166);
						match(SUB);
						setState(167);
						productInfix(0);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

			setState(174);
			atomInfix();
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ProductInfixMultContext(new ProductInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_productInfix);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(MUL);
						setState(178);
						atomInfix();
						}
						break;
					case 2:
						{
						_localctx = new ProductInfixDivContext(new ProductInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_productInfix);
						setState(179);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(180);
						match(DIV);
						setState(181);
						atomInfix();
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new AtomInfixIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				number();
				}
				break;
			case 2:
				_localctx = new AtomInfixNegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(SUB);
				setState(189);
				sumInfix(0);
				}
				break;
			case 3:
				_localctx = new AtomInfixSumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(T__0);
				setState(191);
				sumInfix(0);
				setState(192);
				match(T__2);
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
	public static class NumberRealContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public TerminalNode RATIONAL() { return getToken(LabeledExprParser.RATIONAL, 0); }
		public NumberRealContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterNumberReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitNumberReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNumberReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberNegationContext extends NumberContext {
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberNegationContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterNumberNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitNumberNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNumberNegation(this);
			else return visitor.visitChildren(this);
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
	public static class NumberImaginaryContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public TerminalNode RATIONAL() { return getToken(LabeledExprParser.RATIONAL, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public NumberImaginaryContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterNumberImaginary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitNumberImaginary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNumberImaginary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new NumberIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(INT);
				}
				break;
			case 2:
				_localctx = new NumberRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(FLOAT);
				}
				break;
			case 3:
				_localctx = new NumberRealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(RATIONAL);
				}
				break;
			case 4:
				_localctx = new NumberNegationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(SUB);
				setState(200);
				number();
				}
				break;
			case 5:
				_localctx = new NumberImaginaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << RATIONAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				match(T__3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u00d0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\5\2\34\n\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3$\n\3"+
		"\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3\7"+
		"\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\5\4B\n\4\3\4"+
		"\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\4\7\4S\n\4"+
		"\f\4\16\4V\13\4\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\5\5_\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6f\n\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"t\n\6\3\6\7\6w\n\6\f\6\16\6z\13\6\3\6\3\6\5\6~\n\6\3\7\3\7\3\7\3\7\5\7"+
		"\u0084\n\7\3\7\7\7\u0087\n\7\f\7\16\7\u008a\13\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0092\n\7\3\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3\7\5\7\u009c"+
		"\n\7\3\b\3\b\5\b\u00a0\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ab"+
		"\n\t\f\t\16\t\u00ae\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b9"+
		"\n\n\f\n\16\n\u00bc\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c5"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ce\n\f\3\f\2\4\20\22\r\2\4\6"+
		"\b\n\f\16\20\22\24\26\2\3\3\2\f\16\2\u00e8\2\33\3\2\2\2\4<\3\2\2\2\6Z"+
		"\3\2\2\2\b^\3\2\2\2\n}\3\2\2\2\f\u009b\3\2\2\2\16\u009f\3\2\2\2\20\u00a1"+
		"\3\2\2\2\22\u00af\3\2\2\2\24\u00c4\3\2\2\2\26\u00cd\3\2\2\2\30\34\5\20"+
		"\t\2\31\34\5\n\6\2\32\34\5\4\3\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2"+
		"\2\2\34\35\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37=\5\6\4\2 !\7\3\2\2!("+
		"\5\b\5\2\"$\7\4\2\2#\"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%\'\5\b\5\2&#\3\2\2"+
		"\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\5\2\2,-\7\t"+
		"\2\2-=\3\2\2\2./\7\3\2\2/\66\5\b\5\2\60\62\7\4\2\2\61\60\3\2\2\2\61\62"+
		"\3\2\2\2\62\63\3\2\2\2\63\65\5\b\5\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3"+
		"\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\5\2\2:;\7\n\2\2;=\3\2"+
		"\2\2<\37\3\2\2\2< \3\2\2\2<.\3\2\2\2=\5\3\2\2\2>?\7\3\2\2?F\5\b\5\2@B"+
		"\7\4\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CE\5\b\5\2DA\3\2\2\2EH\3\2\2\2F"+
		"D\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\5\2\2JK\7\7\2\2K[\3\2\2\2"+
		"LM\7\3\2\2MT\5\b\5\2NP\7\4\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QS\5\b\5\2"+
		"RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\5\2\2"+
		"XY\7\b\2\2Y[\3\2\2\2Z>\3\2\2\2ZL\3\2\2\2[\7\3\2\2\2\\_\5\4\3\2]_\5\26"+
		"\f\2^\\\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`~\5\f\7\2ab\7\t\2\2bc\7\3\2\2cj\5"+
		"\16\b\2df\7\4\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\5\16\b\2he\3\2\2\2i"+
		"l\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\5\2\2n~\3\2\2\2"+
		"op\7\n\2\2pq\7\3\2\2qx\5\16\b\2rt\7\4\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2"+
		"\2uw\5\16\b\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2"+
		"\2\2{|\7\5\2\2|~\3\2\2\2}`\3\2\2\2}a\3\2\2\2}o\3\2\2\2~\13\3\2\2\2\177"+
		"\u0080\7\7\2\2\u0080\u0081\7\3\2\2\u0081\u0088\5\16\b\2\u0082\u0084\7"+
		"\4\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\5\16\b\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\5\2\2\u008c\u009c\3\2\2\2\u008d\u008e\7\b\2\2\u008e\u008f\7\3"+
		"\2\2\u008f\u0096\5\16\b\2\u0090\u0092\7\4\2\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\5\16\b\2\u0094\u0091\3"+
		"\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\5\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\177\3\2\2\2\u009b\u008d\3\2\2\2\u009c\r\3\2\2\2\u009d\u00a0"+
		"\5\n\6\2\u009e\u00a0\5\26\f\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2"+
		"\u00a0\17\3\2\2\2\u00a1\u00a2\b\t\1\2\u00a2\u00a3\5\22\n\2\u00a3\u00ac"+
		"\3\2\2\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7\t\2\2\u00a6\u00ab\5\22\n\2"+
		"\u00a7\u00a8\f\3\2\2\u00a8\u00a9\7\n\2\2\u00a9\u00ab\5\22\n\2\u00aa\u00a4"+
		"\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\b\n\1"+
		"\2\u00b0\u00b1\5\24\13\2\u00b1\u00ba\3\2\2\2\u00b2\u00b3\f\4\2\2\u00b3"+
		"\u00b4\7\7\2\2\u00b4\u00b9\5\24\13\2\u00b5\u00b6\f\3\2\2\u00b6\u00b7\7"+
		"\b\2\2\u00b7\u00b9\5\24\13\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\23\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bd\u00c5\5\26\f\2\u00be\u00bf\7\n\2\2\u00bf"+
		"\u00c5\5\20\t\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\7"+
		"\5\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4"+
		"\u00c0\3\2\2\2\u00c5\25\3\2\2\2\u00c6\u00ce\7\f\2\2\u00c7\u00ce\7\r\2"+
		"\2\u00c8\u00ce\7\16\2\2\u00c9\u00ca\7\n\2\2\u00ca\u00ce\5\26\f\2\u00cb"+
		"\u00cc\t\2\2\2\u00cc\u00ce\7\6\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00c7\3\2"+
		"\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\27\3\2\2\2\37\33#(\61\66<AFOTZ^ejsx}\u0083\u0088\u0091\u0096\u009b\u009f"+
		"\u00aa\u00ac\u00b8\u00ba\u00c4\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}