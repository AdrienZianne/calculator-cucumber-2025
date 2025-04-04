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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, MUL=28, DIV=29, ADD=30, SUB=31, ID=32, INT=33, 
		FLOAT=34, NEWLINE=35, WS=36;
	public static final int
		RULE_expr = 0, RULE_setting = 1, RULE_sumPostfix = 2, RULE_productPostfix = 3, 
		RULE_unaryPostfix = 4, RULE_trigoPostfix = 5, RULE_atomPostfix = 6, RULE_sumPrefix = 7, 
		RULE_productPrefix = 8, RULE_unaryPrefix = 9, RULE_trigoPrefix = 10, RULE_atomPrefix = 11, 
		RULE_sumInfix = 12, RULE_productInfix = 13, RULE_atomInfix = 14, RULE_unaryInfix = 15, 
		RULE_trigoInfix = 16, RULE_complexNumber = 17, RULE_number = 18, RULE_random = 19, 
		RULE_constant = 20, RULE_rational = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "setting", "sumPostfix", "productPostfix", "unaryPostfix", "trigoPostfix", 
			"atomPostfix", "sumPrefix", "productPrefix", "unaryPrefix", "trigoPrefix", 
			"atomPrefix", "sumInfix", "productInfix", "atomInfix", "unaryInfix", 
			"trigoInfix", "complexNumber", "number", "random", "constant", "rational"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'seed'", "'('", "')'", "'reset_seed'", "','", "'log'", "'sin'", 
			"'cos'", "'tan'", "'sinh'", "'cosh'", "'tanh'", "'asin'", "'acos'", "'atan'", 
			"'i'", "'rand_int'", "'rand_real'", "'rand_ratio'", "'rand_cmplx'", "'pi'", 
			"'PI'", "'Pi'", "'pI'", "'\u03C0'", "'E'", "'e'", "'*'", "'/'", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "MUL", "DIV", "ADD", "SUB", "ID", "INT", "FLOAT", 
			"NEWLINE", "WS"
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
		public SettingContext setting() {
			return getRuleContext(SettingContext.class,0);
		}
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(44);
				setting();
				}
				break;
			case 2:
				{
				setState(45);
				sumInfix(0);
				}
				break;
			case 3:
				{
				setState(46);
				sumPrefix();
				}
				break;
			case 4:
				{
				setState(47);
				sumPostfix();
				}
				break;
			}
			setState(50);
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
	public static class SettingSetSeedContext extends SettingContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public SettingSetSeedContext(SettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSettingSetSeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSettingSetSeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSettingSetSeed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SettingResetSeedContext extends SettingContext {
		public SettingResetSeedContext(SettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSettingResetSeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSettingResetSeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSettingResetSeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingContext setting() throws RecognitionException {
		SettingContext _localctx = new SettingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setting);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SettingSetSeedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__0);
				setState(53);
				match(T__1);
				setState(54);
				match(INT);
				setState(55);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new SettingResetSeedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(56);
					match(T__0);
					setState(57);
					match(T__1);
					setState(58);
					match(T__2);
					}
					break;
				case T__3:
					{
					setState(59);
					match(T__3);
					setState(60);
					match(T__1);
					setState(61);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 4, RULE_sumPostfix);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new SumPostfixProdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				productPostfix();
				}
				break;
			case 2:
				_localctx = new SumPostfixSumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__1);
				setState(68);
				atomPostfix();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << SUB) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(69);
						match(T__4);
						}
					}

					setState(72);
					atomPostfix();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(T__2);
				setState(79);
				match(ADD);
				}
				break;
			case 3:
				_localctx = new SumPostfixDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(T__1);
				setState(82);
				atomPostfix();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << SUB) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(83);
						match(T__4);
						}
					}

					setState(86);
					atomPostfix();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__2);
				setState(93);
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
	public static class ProductPostfixTrigoContext extends ProductPostfixContext {
		public UnaryPostfixContext unaryPostfix() {
			return getRuleContext(UnaryPostfixContext.class,0);
		}
		public ProductPostfixTrigoContext(ProductPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductPostfixTrigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductPostfixTrigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductPostfixTrigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductPostfixContext productPostfix() throws RecognitionException {
		ProductPostfixContext _localctx = new ProductPostfixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_productPostfix);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ProductPostfixMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__1);
				setState(98);
				atomPostfix();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << SUB) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(99);
						match(T__4);
						}
					}

					setState(102);
					atomPostfix();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(T__2);
				setState(109);
				match(MUL);
				}
				break;
			case 2:
				_localctx = new ProductPostfixDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__1);
				setState(112);
				atomPostfix();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << SUB) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(113);
						match(T__4);
						}
					}

					setState(116);
					atomPostfix();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(T__2);
				setState(123);
				match(DIV);
				}
				break;
			case 3:
				_localctx = new ProductPostfixTrigoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				unaryPostfix();
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

	public static class UnaryPostfixContext extends ParserRuleContext {
		public UnaryPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPostfix; }
	 
		public UnaryPostfixContext() { }
		public void copyFrom(UnaryPostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryPostfixLogContext extends UnaryPostfixContext {
		public AtomPostfixContext atomPostfix() {
			return getRuleContext(AtomPostfixContext.class,0);
		}
		public UnaryPostfixLogContext(UnaryPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterUnaryPostfixLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitUnaryPostfixLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitUnaryPostfixLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryPostfixTrigoContext extends UnaryPostfixContext {
		public TrigoPostfixContext trigoPostfix() {
			return getRuleContext(TrigoPostfixContext.class,0);
		}
		public UnaryPostfixTrigoContext(UnaryPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterUnaryPostfixTrigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitUnaryPostfixTrigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitUnaryPostfixTrigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPostfixContext unaryPostfix() throws RecognitionException {
		UnaryPostfixContext _localctx = new UnaryPostfixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryPostfix);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new UnaryPostfixTrigoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				trigoPostfix();
				}
				break;
			case 2:
				_localctx = new UnaryPostfixLogContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__1);
				setState(130);
				atomPostfix();
				setState(131);
				match(T__2);
				setState(132);
				match(T__5);
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

	public static class TrigoPostfixContext extends ParserRuleContext {
		public TrigoPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigoPostfix; }
	 
		public TrigoPostfixContext() { }
		public void copyFrom(TrigoPostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrigoPostfixTanhContext extends TrigoPostfixContext {
		public AtomPostfixContext atomPostfix() {
			return getRuleContext(AtomPostfixContext.class,0);
		}
		public TrigoPostfixTanhContext(TrigoPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPostfixTanh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPostfixTanh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPostfixTanh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPostfixCoshContext extends TrigoPostfixContext {
		public AtomPostfixContext atomPostfix() {
			return getRuleContext(AtomPostfixContext.class,0);
		}
		public TrigoPostfixCoshContext(TrigoPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPostfixCosh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPostfixCosh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPostfixCosh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPostfixATanContext extends TrigoPostfixContext {
		public AtomPostfixContext atomPostfix() {
			return getRuleContext(AtomPostfixContext.class,0);
		}
		public TrigoPostfixATanContext(TrigoPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPostfixATan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPostfixATan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPostfixATan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPostfixTanContext extends TrigoPostfixContext {
		public AtomPostfixContext atomPostfix() {
			return getRuleContext(AtomPostfixContext.class,0);
		}
		public TrigoPostfixTanContext(TrigoPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPostfixTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPostfixTan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPostfixTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPostfixACosContext extends TrigoPostfixContext {
		public AtomPostfixContext atomPostfix() {
			return getRuleContext(AtomPostfixContext.class,0);
		}
		public TrigoPostfixACosContext(TrigoPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPostfixACos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPostfixACos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPostfixACos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPostfixASinContext extends TrigoPostfixContext {
		public AtomPostfixContext atomPostfix() {
			return getRuleContext(AtomPostfixContext.class,0);
		}
		public TrigoPostfixASinContext(TrigoPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPostfixASin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPostfixASin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPostfixASin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPostfixSinhContext extends TrigoPostfixContext {
		public AtomPostfixContext atomPostfix() {
			return getRuleContext(AtomPostfixContext.class,0);
		}
		public TrigoPostfixSinhContext(TrigoPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPostfixSinh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPostfixSinh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPostfixSinh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPostfixSinContext extends TrigoPostfixContext {
		public AtomPostfixContext atomPostfix() {
			return getRuleContext(AtomPostfixContext.class,0);
		}
		public TrigoPostfixSinContext(TrigoPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPostfixSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPostfixSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPostfixSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPostfixCosContext extends TrigoPostfixContext {
		public AtomPostfixContext atomPostfix() {
			return getRuleContext(AtomPostfixContext.class,0);
		}
		public TrigoPostfixCosContext(TrigoPostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPostfixCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPostfixCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPostfixCos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrigoPostfixContext trigoPostfix() throws RecognitionException {
		TrigoPostfixContext _localctx = new TrigoPostfixContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_trigoPostfix);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new TrigoPostfixSinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__1);
				setState(137);
				atomPostfix();
				setState(138);
				match(T__2);
				setState(139);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new TrigoPostfixCosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__1);
				setState(142);
				atomPostfix();
				setState(143);
				match(T__2);
				setState(144);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new TrigoPostfixTanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__1);
				setState(147);
				atomPostfix();
				setState(148);
				match(T__2);
				setState(149);
				match(T__8);
				}
				break;
			case 4:
				_localctx = new TrigoPostfixSinhContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(T__1);
				setState(152);
				atomPostfix();
				setState(153);
				match(T__2);
				setState(154);
				match(T__9);
				}
				break;
			case 5:
				_localctx = new TrigoPostfixCoshContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(T__1);
				setState(157);
				atomPostfix();
				setState(158);
				match(T__2);
				setState(159);
				match(T__10);
				}
				break;
			case 6:
				_localctx = new TrigoPostfixTanhContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(T__1);
				setState(162);
				atomPostfix();
				setState(163);
				match(T__2);
				setState(164);
				match(T__11);
				}
				break;
			case 7:
				_localctx = new TrigoPostfixASinContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				match(T__1);
				setState(167);
				atomPostfix();
				setState(168);
				match(T__2);
				setState(169);
				match(T__12);
				}
				break;
			case 8:
				_localctx = new TrigoPostfixACosContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				match(T__1);
				setState(172);
				atomPostfix();
				setState(173);
				match(T__2);
				setState(174);
				match(T__13);
				}
				break;
			case 9:
				_localctx = new TrigoPostfixATanContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				match(T__1);
				setState(177);
				atomPostfix();
				setState(178);
				match(T__2);
				setState(179);
				match(T__14);
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
		public ComplexNumberContext complexNumber() {
			return getRuleContext(ComplexNumberContext.class,0);
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
		enterRule(_localctx, 12, RULE_atomPostfix);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new AtomPostfixSumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				sumPostfix();
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case SUB:
			case INT:
			case FLOAT:
				_localctx = new AtomPostfixIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				complexNumber();
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
		enterRule(_localctx, 14, RULE_sumPrefix);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case MUL:
			case DIV:
				_localctx = new SumPrefixProdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				productPrefix();
				}
				break;
			case ADD:
				_localctx = new SumPrefixSumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(ADD);
				setState(189);
				match(T__1);
				setState(190);
				atomPrefix();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(191);
						match(T__4);
						}
					}

					setState(194);
					atomPrefix();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(T__2);
				}
				break;
			case SUB:
				_localctx = new SumPrefixDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(SUB);
				setState(203);
				match(T__1);
				setState(204);
				atomPrefix();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(205);
						match(T__4);
						}
					}

					setState(208);
					atomPrefix();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
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
	public static class ProductPrefixUnaryContext extends ProductPrefixContext {
		public UnaryPrefixContext unaryPrefix() {
			return getRuleContext(UnaryPrefixContext.class,0);
		}
		public ProductPrefixUnaryContext(ProductPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProductPrefixUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProductPrefixUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProductPrefixUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductPrefixContext productPrefix() throws RecognitionException {
		ProductPrefixContext _localctx = new ProductPrefixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_productPrefix);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new ProductPrefixMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(MUL);
				setState(219);
				match(T__1);
				setState(220);
				atomPrefix();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(221);
						match(T__4);
						}
					}

					setState(224);
					atomPrefix();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
				match(T__2);
				}
				break;
			case DIV:
				_localctx = new ProductPrefixDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(DIV);
				setState(233);
				match(T__1);
				setState(234);
				atomPrefix();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(235);
						match(T__4);
						}
					}

					setState(238);
					atomPrefix();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(T__2);
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				_localctx = new ProductPrefixUnaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				unaryPrefix();
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

	public static class UnaryPrefixContext extends ParserRuleContext {
		public UnaryPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPrefix; }
	 
		public UnaryPrefixContext() { }
		public void copyFrom(UnaryPrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryPrefixLogContext extends UnaryPrefixContext {
		public AtomPrefixContext atomPrefix() {
			return getRuleContext(AtomPrefixContext.class,0);
		}
		public UnaryPrefixLogContext(UnaryPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterUnaryPrefixLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitUnaryPrefixLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitUnaryPrefixLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryPrefixTrigoContext extends UnaryPrefixContext {
		public TrigoPrefixContext trigoPrefix() {
			return getRuleContext(TrigoPrefixContext.class,0);
		}
		public UnaryPrefixTrigoContext(UnaryPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterUnaryPrefixTrigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitUnaryPrefixTrigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitUnaryPrefixTrigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPrefixContext unaryPrefix() throws RecognitionException {
		UnaryPrefixContext _localctx = new UnaryPrefixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryPrefix);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				_localctx = new UnaryPrefixTrigoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				trigoPrefix();
				}
				break;
			case T__5:
				_localctx = new UnaryPrefixLogContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__5);
				setState(251);
				match(T__1);
				setState(252);
				atomPrefix();
				setState(253);
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

	public static class TrigoPrefixContext extends ParserRuleContext {
		public TrigoPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigoPrefix; }
	 
		public TrigoPrefixContext() { }
		public void copyFrom(TrigoPrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrigoPrefixSinContext extends TrigoPrefixContext {
		public AtomPrefixContext atomPrefix() {
			return getRuleContext(AtomPrefixContext.class,0);
		}
		public TrigoPrefixSinContext(TrigoPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPrefixSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPrefixSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPrefixSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPrefixCosContext extends TrigoPrefixContext {
		public AtomPrefixContext atomPrefix() {
			return getRuleContext(AtomPrefixContext.class,0);
		}
		public TrigoPrefixCosContext(TrigoPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPrefixCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPrefixCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPrefixCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPrefixACosContext extends TrigoPrefixContext {
		public AtomPrefixContext atomPrefix() {
			return getRuleContext(AtomPrefixContext.class,0);
		}
		public TrigoPrefixACosContext(TrigoPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPrefixACos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPrefixACos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPrefixACos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPrefixSinhContext extends TrigoPrefixContext {
		public AtomPrefixContext atomPrefix() {
			return getRuleContext(AtomPrefixContext.class,0);
		}
		public TrigoPrefixSinhContext(TrigoPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPrefixSinh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPrefixSinh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPrefixSinh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPrefixASinContext extends TrigoPrefixContext {
		public AtomPrefixContext atomPrefix() {
			return getRuleContext(AtomPrefixContext.class,0);
		}
		public TrigoPrefixASinContext(TrigoPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPrefixASin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPrefixASin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPrefixASin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPrefixCoshContext extends TrigoPrefixContext {
		public AtomPrefixContext atomPrefix() {
			return getRuleContext(AtomPrefixContext.class,0);
		}
		public TrigoPrefixCoshContext(TrigoPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPrefixCosh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPrefixCosh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPrefixCosh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPrefixATanContext extends TrigoPrefixContext {
		public AtomPrefixContext atomPrefix() {
			return getRuleContext(AtomPrefixContext.class,0);
		}
		public TrigoPrefixATanContext(TrigoPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPrefixATan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPrefixATan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPrefixATan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPrefixTanhContext extends TrigoPrefixContext {
		public AtomPrefixContext atomPrefix() {
			return getRuleContext(AtomPrefixContext.class,0);
		}
		public TrigoPrefixTanhContext(TrigoPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPrefixTanh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPrefixTanh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPrefixTanh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoPrefixTanContext extends TrigoPrefixContext {
		public AtomPrefixContext atomPrefix() {
			return getRuleContext(AtomPrefixContext.class,0);
		}
		public TrigoPrefixTanContext(TrigoPrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoPrefixTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoPrefixTan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoPrefixTan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrigoPrefixContext trigoPrefix() throws RecognitionException {
		TrigoPrefixContext _localctx = new TrigoPrefixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_trigoPrefix);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new TrigoPrefixSinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(T__6);
				setState(258);
				match(T__1);
				setState(259);
				atomPrefix();
				setState(260);
				match(T__2);
				}
				break;
			case T__7:
				_localctx = new TrigoPrefixCosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__7);
				setState(263);
				match(T__1);
				setState(264);
				atomPrefix();
				setState(265);
				match(T__2);
				}
				break;
			case T__8:
				_localctx = new TrigoPrefixTanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(T__8);
				setState(268);
				match(T__1);
				setState(269);
				atomPrefix();
				setState(270);
				match(T__2);
				}
				break;
			case T__9:
				_localctx = new TrigoPrefixSinhContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(T__9);
				setState(273);
				match(T__1);
				setState(274);
				atomPrefix();
				setState(275);
				match(T__2);
				}
				break;
			case T__10:
				_localctx = new TrigoPrefixCoshContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(T__10);
				setState(278);
				match(T__1);
				setState(279);
				atomPrefix();
				setState(280);
				match(T__2);
				}
				break;
			case T__11:
				_localctx = new TrigoPrefixTanhContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				match(T__11);
				setState(283);
				match(T__1);
				setState(284);
				atomPrefix();
				setState(285);
				match(T__2);
				}
				break;
			case T__12:
				_localctx = new TrigoPrefixASinContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				match(T__12);
				setState(288);
				match(T__1);
				setState(289);
				atomPrefix();
				setState(290);
				match(T__2);
				}
				break;
			case T__13:
				_localctx = new TrigoPrefixACosContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(292);
				match(T__13);
				setState(293);
				match(T__1);
				setState(294);
				atomPrefix();
				setState(295);
				match(T__2);
				}
				break;
			case T__14:
				_localctx = new TrigoPrefixATanContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(297);
				match(T__14);
				setState(298);
				match(T__1);
				setState(299);
				atomPrefix();
				setState(300);
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
		public ComplexNumberContext complexNumber() {
			return getRuleContext(ComplexNumberContext.class,0);
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
		enterRule(_localctx, 22, RULE_atomPrefix);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new AtomPrefixSumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				sumPrefix();
				}
				break;
			case 2:
				_localctx = new AtomPrefixIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				complexNumber();
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_sumInfix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SumInfixProdContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(309);
			productInfix(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new SumInfixAddContext(new SumInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumInfix);
						setState(311);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(312);
						match(ADD);
						setState(313);
						productInfix(0);
						}
						break;
					case 2:
						{
						_localctx = new SumInfixDiffContext(new SumInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumInfix);
						setState(314);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(315);
						match(SUB);
						setState(316);
						productInfix(0);
						}
						break;
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_productInfix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ProductInfixAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(323);
			atomInfix();
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ProductInfixMultContext(new ProductInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_productInfix);
						setState(325);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(326);
						match(MUL);
						setState(327);
						atomInfix();
						}
						break;
					case 2:
						{
						_localctx = new ProductInfixDivContext(new ProductInfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_productInfix);
						setState(328);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(329);
						match(DIV);
						setState(330);
						atomInfix();
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class AtomInfixComplexContext extends AtomInfixContext {
		public ComplexNumberContext complexNumber() {
			return getRuleContext(ComplexNumberContext.class,0);
		}
		public AtomInfixComplexContext(AtomInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAtomInfixComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAtomInfixComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomInfixComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomInfixUnaryContext extends AtomInfixContext {
		public UnaryInfixContext unaryInfix() {
			return getRuleContext(UnaryInfixContext.class,0);
		}
		public AtomInfixUnaryContext(AtomInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAtomInfixUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAtomInfixUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomInfixUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomInfixContext atomInfix() throws RecognitionException {
		AtomInfixContext _localctx = new AtomInfixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomInfix);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new AtomInfixUnaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				unaryInfix();
				}
				break;
			case 2:
				_localctx = new AtomInfixComplexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				complexNumber();
				}
				break;
			case 3:
				_localctx = new AtomInfixSumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(T__1);
				setState(339);
				sumInfix(0);
				setState(340);
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

	public static class UnaryInfixContext extends ParserRuleContext {
		public UnaryInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryInfix; }
	 
		public UnaryInfixContext() { }
		public void copyFrom(UnaryInfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryInfixNegationContext extends UnaryInfixContext {
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public UnaryInfixNegationContext(UnaryInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterUnaryInfixNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitUnaryInfixNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitUnaryInfixNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryInfixTrigoContext extends UnaryInfixContext {
		public TrigoInfixContext trigoInfix() {
			return getRuleContext(TrigoInfixContext.class,0);
		}
		public UnaryInfixTrigoContext(UnaryInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterUnaryInfixTrigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitUnaryInfixTrigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitUnaryInfixTrigo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryInfixLogContext extends UnaryInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public UnaryInfixLogContext(UnaryInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterUnaryInfixLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitUnaryInfixLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitUnaryInfixLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryInfixContext unaryInfix() throws RecognitionException {
		UnaryInfixContext _localctx = new UnaryInfixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unaryInfix);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				_localctx = new UnaryInfixTrigoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				trigoInfix();
				}
				break;
			case T__5:
				_localctx = new UnaryInfixLogContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(T__5);
				setState(346);
				sumInfix(0);
				}
				break;
			case SUB:
				_localctx = new UnaryInfixNegationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(347);
					match(SUB);
					setState(348);
					sumInfix(0);
					}
					break;
				case 2:
					{
					setState(349);
					match(SUB);
					setState(350);
					match(T__1);
					setState(351);
					sumInfix(0);
					setState(352);
					match(T__2);
					}
					break;
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

	public static class TrigoInfixContext extends ParserRuleContext {
		public TrigoInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigoInfix; }
	 
		public TrigoInfixContext() { }
		public void copyFrom(TrigoInfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrigoInfixATanContext extends TrigoInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TrigoInfixATanContext(TrigoInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoInfixATan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoInfixATan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoInfixATan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoInfixTanhContext extends TrigoInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TrigoInfixTanhContext(TrigoInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoInfixTanh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoInfixTanh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoInfixTanh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoInfixTanContext extends TrigoInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TrigoInfixTanContext(TrigoInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoInfixTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoInfixTan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoInfixTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoInfixCosContext extends TrigoInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TrigoInfixCosContext(TrigoInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoInfixCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoInfixCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoInfixCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoInfixSinhContext extends TrigoInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TrigoInfixSinhContext(TrigoInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoInfixSinh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoInfixSinh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoInfixSinh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoInfixSinContext extends TrigoInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TrigoInfixSinContext(TrigoInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoInfixSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoInfixSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoInfixSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoInfixASinContext extends TrigoInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TrigoInfixASinContext(TrigoInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoInfixASin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoInfixASin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoInfixASin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoInfixACosContext extends TrigoInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TrigoInfixACosContext(TrigoInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoInfixACos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoInfixACos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoInfixACos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigoInfixCoshContext extends TrigoInfixContext {
		public SumInfixContext sumInfix() {
			return getRuleContext(SumInfixContext.class,0);
		}
		public TrigoInfixCoshContext(TrigoInfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrigoInfixCosh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrigoInfixCosh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrigoInfixCosh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrigoInfixContext trigoInfix() throws RecognitionException {
		TrigoInfixContext _localctx = new TrigoInfixContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trigoInfix);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new TrigoInfixSinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(T__6);
				setState(359);
				match(T__1);
				setState(360);
				sumInfix(0);
				setState(361);
				match(T__2);
				}
				break;
			case T__7:
				_localctx = new TrigoInfixCosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(T__7);
				setState(364);
				match(T__1);
				setState(365);
				sumInfix(0);
				setState(366);
				match(T__2);
				}
				break;
			case T__8:
				_localctx = new TrigoInfixTanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(T__8);
				setState(369);
				match(T__1);
				setState(370);
				sumInfix(0);
				setState(371);
				match(T__2);
				}
				break;
			case T__9:
				_localctx = new TrigoInfixSinhContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(T__9);
				setState(374);
				match(T__1);
				setState(375);
				sumInfix(0);
				setState(376);
				match(T__2);
				}
				break;
			case T__10:
				_localctx = new TrigoInfixCoshContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				match(T__10);
				setState(379);
				match(T__1);
				setState(380);
				sumInfix(0);
				setState(381);
				match(T__2);
				}
				break;
			case T__11:
				_localctx = new TrigoInfixTanhContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(383);
				match(T__11);
				setState(384);
				match(T__1);
				setState(385);
				sumInfix(0);
				setState(386);
				match(T__2);
				}
				break;
			case T__12:
				_localctx = new TrigoInfixASinContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
				match(T__12);
				setState(389);
				match(T__1);
				setState(390);
				sumInfix(0);
				setState(391);
				match(T__2);
				}
				break;
			case T__13:
				_localctx = new TrigoInfixACosContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(393);
				match(T__13);
				setState(394);
				match(T__1);
				setState(395);
				sumInfix(0);
				setState(396);
				match(T__2);
				}
				break;
			case T__14:
				_localctx = new TrigoInfixATanContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(398);
				match(T__14);
				setState(399);
				match(T__1);
				setState(400);
				sumInfix(0);
				setState(401);
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

	public static class ComplexNumberContext extends ParserRuleContext {
		public ComplexNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexNumber; }
	 
		public ComplexNumberContext() { }
		public void copyFrom(ComplexNumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexImaginaryNumberContext extends ComplexNumberContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ComplexImaginaryNumberContext(ComplexNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterComplexImaginaryNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitComplexImaginaryNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitComplexImaginaryNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplexRealNumberContext extends ComplexNumberContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ComplexRealNumberContext(ComplexNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterComplexRealNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitComplexRealNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitComplexRealNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexNumberContext complexNumber() throws RecognitionException {
		ComplexNumberContext _localctx = new ComplexNumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_complexNumber);
		int _la;
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new ComplexImaginaryNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << SUB) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					setState(405);
					number();
					}
				}

				setState(408);
				match(T__15);
				}
				break;
			case 2:
				_localctx = new ComplexRealNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
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
	public static class NumberContantContext extends NumberContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public NumberContantContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterNumberContant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitNumberContant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNumberContant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberRationalContext extends NumberContext {
		public RationalContext rational() {
			return getRuleContext(RationalContext.class,0);
		}
		public NumberRationalContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterNumberRational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitNumberRational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNumberRational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberRealContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
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
	public static class NumberRandomContext extends NumberContext {
		public RandomContext random() {
			return getRuleContext(RandomContext.class,0);
		}
		public NumberRandomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterNumberRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitNumberRandom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNumberRandom(this);
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

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new NumberRationalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				rational();
				}
				break;
			case 2:
				_localctx = new NumberIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(INT);
				}
				break;
			case 3:
				_localctx = new NumberRealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(FLOAT);
				}
				break;
			case 4:
				_localctx = new NumberContantContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				constant();
				}
				break;
			case 5:
				_localctx = new NumberRandomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				random();
				}
				break;
			case 6:
				_localctx = new NumberNegationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(417);
				match(SUB);
				setState(418);
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

	public static class RandomContext extends ParserRuleContext {
		public RandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random; }
	 
		public RandomContext() { }
		public void copyFrom(RandomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RandomIntContext extends RandomContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public RandomIntContext(RandomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterRandomInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitRandomInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRandomInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomRealContext extends RandomContext {
		public RandomRealContext(RandomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterRandomReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitRandomReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRandomReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomComplexContext extends RandomContext {
		public RandomComplexContext(RandomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterRandomComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitRandomComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRandomComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomRatioContext extends RandomContext {
		public List<TerminalNode> INT() { return getTokens(LabeledExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LabeledExprParser.INT, i);
		}
		public RandomRatioContext(RandomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterRandomRatio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitRandomRatio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRandomRatio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_random);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new RandomIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(T__16);
				setState(422);
				match(T__1);
				setState(423);
				match(INT);
				setState(424);
				match(T__2);
				}
				break;
			case T__17:
				_localctx = new RandomRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(T__17);
				setState(426);
				match(T__1);
				setState(427);
				match(T__2);
				}
				break;
			case T__18:
				_localctx = new RandomRatioContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(T__18);
				setState(429);
				match(T__1);
				setState(430);
				match(INT);
				setState(431);
				match(T__4);
				setState(432);
				match(INT);
				setState(433);
				match(T__2);
				}
				break;
			case T__19:
				_localctx = new RandomComplexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				match(T__19);
				setState(435);
				match(T__1);
				setState(436);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantPiContext extends ConstantContext {
		public ConstantPiContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterConstantPi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitConstantPi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConstantPi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantEulerContext extends ConstantContext {
		public ConstantEulerContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterConstantEuler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitConstantEuler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConstantEuler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constant);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				_localctx = new ConstantPiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__25:
			case T__26:
				_localctx = new ConstantEulerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class RationalContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(LabeledExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LabeledExprParser.INT, i);
		}
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public RationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterRational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitRational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RationalContext rational() throws RecognitionException {
		RationalContext _localctx = new RationalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rational);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(INT);
			setState(444);
			match(DIV);
			setState(445);
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
		case 12:
			return sumInfix_sempred((SumInfixContext)_localctx, predIndex);
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u01c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\5\2"+
		"\63\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3\5\3C"+
		"\n\3\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4W\n\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\5\4b\n\4"+
		"\3\5\3\5\3\5\5\5g\n\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5u\n\5\3\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\3\5\3\5\5\5\u0081\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0089\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00b8\n\7\3\b\3\b\5\b\u00bc\n\b\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00c3\n\t\3\t\7\t\u00c6\n\t\f\t\16\t\u00c9\13\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00d1\n\t\3\t\7\t\u00d4\n\t\f\t\16\t\u00d7\13\t\3\t\3\t\5\t\u00db"+
		"\n\t\3\n\3\n\3\n\3\n\5\n\u00e1\n\n\3\n\7\n\u00e4\n\n\f\n\16\n\u00e7\13"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ef\n\n\3\n\7\n\u00f2\n\n\f\n\16\n\u00f5"+
		"\13\n\3\n\3\n\3\n\5\n\u00fa\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0102"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0131\n\f\3\r\3\r\5"+
		"\r\u0135\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0140\n"+
		"\16\f\16\16\16\u0143\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u014e\n\17\f\17\16\17\u0151\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0159\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0165\n\21\5\21\u0167\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0196\n\22\3\23\5\23"+
		"\u0199\n\23\3\23\3\23\5\23\u019d\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u01a6\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01b8\n\25\3\26\3\26\5\26\u01bc\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\2\4\32\34\30\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,\2\4\3\2\27\33\3\2\34\35\2\u01f8\2\62\3\2\2\2\4B\3\2"+
		"\2\2\6a\3\2\2\2\b\u0080\3\2\2\2\n\u0088\3\2\2\2\f\u00b7\3\2\2\2\16\u00bb"+
		"\3\2\2\2\20\u00da\3\2\2\2\22\u00f9\3\2\2\2\24\u0101\3\2\2\2\26\u0130\3"+
		"\2\2\2\30\u0134\3\2\2\2\32\u0136\3\2\2\2\34\u0144\3\2\2\2\36\u0158\3\2"+
		"\2\2 \u0166\3\2\2\2\"\u0195\3\2\2\2$\u019c\3\2\2\2&\u01a5\3\2\2\2(\u01b7"+
		"\3\2\2\2*\u01bb\3\2\2\2,\u01bd\3\2\2\2.\63\5\4\3\2/\63\5\32\16\2\60\63"+
		"\5\20\t\2\61\63\5\6\4\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3"+
		"\2\2\2\63\64\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\7\3\2\2\678\7\4"+
		"\2\289\7#\2\29C\7\5\2\2:;\7\3\2\2;<\7\4\2\2<A\7\5\2\2=>\7\6\2\2>?\7\4"+
		"\2\2?A\7\5\2\2@:\3\2\2\2@=\3\2\2\2AC\3\2\2\2B\66\3\2\2\2B@\3\2\2\2C\5"+
		"\3\2\2\2Db\5\b\5\2EF\7\4\2\2FM\5\16\b\2GI\7\7\2\2HG\3\2\2\2HI\3\2\2\2"+
		"IJ\3\2\2\2JL\5\16\b\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2"+
		"\2OM\3\2\2\2PQ\7\5\2\2QR\7 \2\2Rb\3\2\2\2ST\7\4\2\2T[\5\16\b\2UW\7\7\2"+
		"\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\5\16\b\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\5\2\2_`\7!\2\2`b\3\2\2\2aD\3"+
		"\2\2\2aE\3\2\2\2aS\3\2\2\2b\7\3\2\2\2cd\7\4\2\2dk\5\16\b\2eg\7\7\2\2f"+
		"e\3\2\2\2fg\3\2\2\2gh\3\2\2\2hj\5\16\b\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\5\2\2op\7\36\2\2p\u0081\3\2\2\2qr\7"+
		"\4\2\2ry\5\16\b\2su\7\7\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\5\16\b\2w"+
		"t\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\5\2\2"+
		"}~\7\37\2\2~\u0081\3\2\2\2\177\u0081\5\n\6\2\u0080c\3\2\2\2\u0080q\3\2"+
		"\2\2\u0080\177\3\2\2\2\u0081\t\3\2\2\2\u0082\u0089\5\f\7\2\u0083\u0084"+
		"\7\4\2\2\u0084\u0085\5\16\b\2\u0085\u0086\7\5\2\2\u0086\u0087\7\b\2\2"+
		"\u0087\u0089\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0089\13"+
		"\3\2\2\2\u008a\u008b\7\4\2\2\u008b\u008c\5\16\b\2\u008c\u008d\7\5\2\2"+
		"\u008d\u008e\7\t\2\2\u008e\u00b8\3\2\2\2\u008f\u0090\7\4\2\2\u0090\u0091"+
		"\5\16\b\2\u0091\u0092\7\5\2\2\u0092\u0093\7\n\2\2\u0093\u00b8\3\2\2\2"+
		"\u0094\u0095\7\4\2\2\u0095\u0096\5\16\b\2\u0096\u0097\7\5\2\2\u0097\u0098"+
		"\7\13\2\2\u0098\u00b8\3\2\2\2\u0099\u009a\7\4\2\2\u009a\u009b\5\16\b\2"+
		"\u009b\u009c\7\5\2\2\u009c\u009d\7\f\2\2\u009d\u00b8\3\2\2\2\u009e\u009f"+
		"\7\4\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\7\r\2\2"+
		"\u00a2\u00b8\3\2\2\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\5\16\b\2\u00a5\u00a6"+
		"\7\5\2\2\u00a6\u00a7\7\16\2\2\u00a7\u00b8\3\2\2\2\u00a8\u00a9\7\4\2\2"+
		"\u00a9\u00aa\5\16\b\2\u00aa\u00ab\7\5\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00b8"+
		"\3\2\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\5\16\b\2\u00af\u00b0\7\5\2\2"+
		"\u00b0\u00b1\7\20\2\2\u00b1\u00b8\3\2\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4"+
		"\5\16\b\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\7\21\2\2\u00b6\u00b8\3\2\2\2"+
		"\u00b7\u008a\3\2\2\2\u00b7\u008f\3\2\2\2\u00b7\u0094\3\2\2\2\u00b7\u0099"+
		"\3\2\2\2\u00b7\u009e\3\2\2\2\u00b7\u00a3\3\2\2\2\u00b7\u00a8\3\2\2\2\u00b7"+
		"\u00ad\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8\r\3\2\2\2\u00b9\u00bc\5\6\4\2"+
		"\u00ba\u00bc\5$\23\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\17"+
		"\3\2\2\2\u00bd\u00db\5\22\n\2\u00be\u00bf\7 \2\2\u00bf\u00c0\7\4\2\2\u00c0"+
		"\u00c7\5\30\r\2\u00c1\u00c3\7\7\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\5\30\r\2\u00c5\u00c2\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\5\2\2\u00cb\u00db\3\2\2\2\u00cc"+
		"\u00cd\7!\2\2\u00cd\u00ce\7\4\2\2\u00ce\u00d5\5\30\r\2\u00cf\u00d1\7\7"+
		"\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\5\30\r\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\7\5\2\2\u00d9\u00db\3\2\2\2\u00da\u00bd\3\2\2\2\u00da\u00be\3\2"+
		"\2\2\u00da\u00cc\3\2\2\2\u00db\21\3\2\2\2\u00dc\u00dd\7\36\2\2\u00dd\u00de"+
		"\7\4\2\2\u00de\u00e5\5\30\r\2\u00df\u00e1\7\7\2\2\u00e0\u00df\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\5\30\r\2\u00e3\u00e0"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\5\2\2\u00e9\u00fa\3\2"+
		"\2\2\u00ea\u00eb\7\37\2\2\u00eb\u00ec\7\4\2\2\u00ec\u00f3\5\30\r\2\u00ed"+
		"\u00ef\7\7\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\5\30\r\2\u00f1\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f7\7\5\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00fa\5\24\13\2\u00f9"+
		"\u00dc\3\2\2\2\u00f9\u00ea\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\23\3\2\2"+
		"\2\u00fb\u0102\5\26\f\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe\7\4\2\2\u00fe"+
		"\u00ff\5\30\r\2\u00ff\u0100\7\5\2\2\u0100\u0102\3\2\2\2\u0101\u00fb\3"+
		"\2\2\2\u0101\u00fc\3\2\2\2\u0102\25\3\2\2\2\u0103\u0104\7\t\2\2\u0104"+
		"\u0105\7\4\2\2\u0105\u0106\5\30\r\2\u0106\u0107\7\5\2\2\u0107\u0131\3"+
		"\2\2\2\u0108\u0109\7\n\2\2\u0109\u010a\7\4\2\2\u010a\u010b\5\30\r\2\u010b"+
		"\u010c\7\5\2\2\u010c\u0131\3\2\2\2\u010d\u010e\7\13\2\2\u010e\u010f\7"+
		"\4\2\2\u010f\u0110\5\30\r\2\u0110\u0111\7\5\2\2\u0111\u0131\3\2\2\2\u0112"+
		"\u0113\7\f\2\2\u0113\u0114\7\4\2\2\u0114\u0115\5\30\r\2\u0115\u0116\7"+
		"\5\2\2\u0116\u0131\3\2\2\2\u0117\u0118\7\r\2\2\u0118\u0119\7\4\2\2\u0119"+
		"\u011a\5\30\r\2\u011a\u011b\7\5\2\2\u011b\u0131\3\2\2\2\u011c\u011d\7"+
		"\16\2\2\u011d\u011e\7\4\2\2\u011e\u011f\5\30\r\2\u011f\u0120\7\5\2\2\u0120"+
		"\u0131\3\2\2\2\u0121\u0122\7\17\2\2\u0122\u0123\7\4\2\2\u0123\u0124\5"+
		"\30\r\2\u0124\u0125\7\5\2\2\u0125\u0131\3\2\2\2\u0126\u0127\7\20\2\2\u0127"+
		"\u0128\7\4\2\2\u0128\u0129\5\30\r\2\u0129\u012a\7\5\2\2\u012a\u0131\3"+
		"\2\2\2\u012b\u012c\7\21\2\2\u012c\u012d\7\4\2\2\u012d\u012e\5\30\r\2\u012e"+
		"\u012f\7\5\2\2\u012f\u0131\3\2\2\2\u0130\u0103\3\2\2\2\u0130\u0108\3\2"+
		"\2\2\u0130\u010d\3\2\2\2\u0130\u0112\3\2\2\2\u0130\u0117\3\2\2\2\u0130"+
		"\u011c\3\2\2\2\u0130\u0121\3\2\2\2\u0130\u0126\3\2\2\2\u0130\u012b\3\2"+
		"\2\2\u0131\27\3\2\2\2\u0132\u0135\5\20\t\2\u0133\u0135\5$\23\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0133\3\2\2\2\u0135\31\3\2\2\2\u0136\u0137\b\16\1\2\u0137"+
		"\u0138\5\34\17\2\u0138\u0141\3\2\2\2\u0139\u013a\f\4\2\2\u013a\u013b\7"+
		" \2\2\u013b\u0140\5\34\17\2\u013c\u013d\f\3\2\2\u013d\u013e\7!\2\2\u013e"+
		"\u0140\5\34\17\2\u013f\u0139\3\2\2\2\u013f\u013c\3\2\2\2\u0140\u0143\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\33\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0145\b\17\1\2\u0145\u0146\5\36\20\2\u0146\u014f"+
		"\3\2\2\2\u0147\u0148\f\4\2\2\u0148\u0149\7\36\2\2\u0149\u014e\5\36\20"+
		"\2\u014a\u014b\f\3\2\2\u014b\u014c\7\37\2\2\u014c\u014e\5\36\20\2\u014d"+
		"\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\35\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0159"+
		"\5 \21\2\u0153\u0159\5$\23\2\u0154\u0155\7\4\2\2\u0155\u0156\5\32\16\2"+
		"\u0156\u0157\7\5\2\2\u0157\u0159\3\2\2\2\u0158\u0152\3\2\2\2\u0158\u0153"+
		"\3\2\2\2\u0158\u0154\3\2\2\2\u0159\37\3\2\2\2\u015a\u0167\5\"\22\2\u015b"+
		"\u015c\7\b\2\2\u015c\u0167\5\32\16\2\u015d\u015e\7!\2\2\u015e\u0165\5"+
		"\32\16\2\u015f\u0160\7!\2\2\u0160\u0161\7\4\2\2\u0161\u0162\5\32\16\2"+
		"\u0162\u0163\7\5\2\2\u0163\u0165\3\2\2\2\u0164\u015d\3\2\2\2\u0164\u015f"+
		"\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u015a\3\2\2\2\u0166\u015b\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167!\3\2\2\2\u0168\u0169\7\t\2\2\u0169\u016a\7\4\2\2"+
		"\u016a\u016b\5\32\16\2\u016b\u016c\7\5\2\2\u016c\u0196\3\2\2\2\u016d\u016e"+
		"\7\n\2\2\u016e\u016f\7\4\2\2\u016f\u0170\5\32\16\2\u0170\u0171\7\5\2\2"+
		"\u0171\u0196\3\2\2\2\u0172\u0173\7\13\2\2\u0173\u0174\7\4\2\2\u0174\u0175"+
		"\5\32\16\2\u0175\u0176\7\5\2\2\u0176\u0196\3\2\2\2\u0177\u0178\7\f\2\2"+
		"\u0178\u0179\7\4\2\2\u0179\u017a\5\32\16\2\u017a\u017b\7\5\2\2\u017b\u0196"+
		"\3\2\2\2\u017c\u017d\7\r\2\2\u017d\u017e\7\4\2\2\u017e\u017f\5\32\16\2"+
		"\u017f\u0180\7\5\2\2\u0180\u0196\3\2\2\2\u0181\u0182\7\16\2\2\u0182\u0183"+
		"\7\4\2\2\u0183\u0184\5\32\16\2\u0184\u0185\7\5\2\2\u0185\u0196\3\2\2\2"+
		"\u0186\u0187\7\17\2\2\u0187\u0188\7\4\2\2\u0188\u0189\5\32\16\2\u0189"+
		"\u018a\7\5\2\2\u018a\u0196\3\2\2\2\u018b\u018c\7\20\2\2\u018c\u018d\7"+
		"\4\2\2\u018d\u018e\5\32\16\2\u018e\u018f\7\5\2\2\u018f\u0196\3\2\2\2\u0190"+
		"\u0191\7\21\2\2\u0191\u0192\7\4\2\2\u0192\u0193\5\32\16\2\u0193\u0194"+
		"\7\5\2\2\u0194\u0196\3\2\2\2\u0195\u0168\3\2\2\2\u0195\u016d\3\2\2\2\u0195"+
		"\u0172\3\2\2\2\u0195\u0177\3\2\2\2\u0195\u017c\3\2\2\2\u0195\u0181\3\2"+
		"\2\2\u0195\u0186\3\2\2\2\u0195\u018b\3\2\2\2\u0195\u0190\3\2\2\2\u0196"+
		"#\3\2\2\2\u0197\u0199\5&\24\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2"+
		"\u0199\u019a\3\2\2\2\u019a\u019d\7\22\2\2\u019b\u019d\5&\24\2\u019c\u0198"+
		"\3\2\2\2\u019c\u019b\3\2\2\2\u019d%\3\2\2\2\u019e\u01a6\5,\27\2\u019f"+
		"\u01a6\7#\2\2\u01a0\u01a6\7$\2\2\u01a1\u01a6\5*\26\2\u01a2\u01a6\5(\25"+
		"\2\u01a3\u01a4\7!\2\2\u01a4\u01a6\5&\24\2\u01a5\u019e\3\2\2\2\u01a5\u019f"+
		"\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a6\'\3\2\2\2\u01a7\u01a8\7\23\2\2\u01a8\u01a9\7\4\2"+
		"\2\u01a9\u01aa\7#\2\2\u01aa\u01b8\7\5\2\2\u01ab\u01ac\7\24\2\2\u01ac\u01ad"+
		"\7\4\2\2\u01ad\u01b8\7\5\2\2\u01ae\u01af\7\25\2\2\u01af\u01b0\7\4\2\2"+
		"\u01b0\u01b1\7#\2\2\u01b1\u01b2\7\7\2\2\u01b2\u01b3\7#\2\2\u01b3\u01b8"+
		"\7\5\2\2\u01b4\u01b5\7\26\2\2\u01b5\u01b6\7\4\2\2\u01b6\u01b8\7\5\2\2"+
		"\u01b7\u01a7\3\2\2\2\u01b7\u01ab\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01b4"+
		"\3\2\2\2\u01b8)\3\2\2\2\u01b9\u01bc\t\2\2\2\u01ba\u01bc\t\3\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc+\3\2\2\2\u01bd\u01be\7#\2\2\u01be"+
		"\u01bf\7\37\2\2\u01bf\u01c0\7#\2\2\u01c0-\3\2\2\2,\62@BHMV[afkty\u0080"+
		"\u0088\u00b7\u00bb\u00c2\u00c7\u00d0\u00d5\u00da\u00e0\u00e5\u00ee\u00f3"+
		"\u00f9\u0101\u0130\u0134\u013f\u0141\u014d\u014f\u0158\u0164\u0166\u0195"+
		"\u0198\u019c\u01a5\u01b7\u01bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}