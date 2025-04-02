// Generated from calculator/parser/antlr/LabeledExpr.g4 by ANTLR 4.9.1
package calculator.parser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, MUL=14, DIV=15, ADD=16, SUB=17, 
		ID=18, INT=19, FLOAT=20, NEWLINE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "MUL", "DIV", "ADD", "SUB", "ID", 
			"INT", "FLOAT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'sin'", "'cos'", "'tan'", "'sinh'", "'cosh'", 
			"'tanh'", "'asin'", "'acos'", "'atan'", "'i'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "MUL", "DIV", "ADD", "SUB", "ID", "INT", "FLOAT", "NEWLINE", 
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


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\6\23k\n\23\r\23\16\23l\3\24\6\24p\n\24\r"+
		"\24\16\24q\3\25\6\25u\n\25\r\25\16\25v\3\25\3\25\7\25{\n\25\f\25\16\25"+
		"~\13\25\3\26\5\26\u0081\n\26\3\26\3\26\3\27\6\27\u0086\n\27\r\27\16\27"+
		"\u0087\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\5\4\2C"+
		"\\c|\3\2\62;\4\2\13\13\"\"\2\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2"+
		"\2\2\139\3\2\2\2\r=\3\2\2\2\17A\3\2\2\2\21F\3\2\2\2\23K\3\2\2\2\25P\3"+
		"\2\2\2\27U\3\2\2\2\31Z\3\2\2\2\33_\3\2\2\2\35a\3\2\2\2\37c\3\2\2\2!e\3"+
		"\2\2\2#g\3\2\2\2%j\3\2\2\2\'o\3\2\2\2)t\3\2\2\2+\u0080\3\2\2\2-\u0085"+
		"\3\2\2\2/\60\7*\2\2\60\4\3\2\2\2\61\62\7.\2\2\62\6\3\2\2\2\63\64\7+\2"+
		"\2\64\b\3\2\2\2\65\66\7u\2\2\66\67\7k\2\2\678\7p\2\28\n\3\2\2\29:\7e\2"+
		"\2:;\7q\2\2;<\7u\2\2<\f\3\2\2\2=>\7v\2\2>?\7c\2\2?@\7p\2\2@\16\3\2\2\2"+
		"AB\7u\2\2BC\7k\2\2CD\7p\2\2DE\7j\2\2E\20\3\2\2\2FG\7e\2\2GH\7q\2\2HI\7"+
		"u\2\2IJ\7j\2\2J\22\3\2\2\2KL\7v\2\2LM\7c\2\2MN\7p\2\2NO\7j\2\2O\24\3\2"+
		"\2\2PQ\7c\2\2QR\7u\2\2RS\7k\2\2ST\7p\2\2T\26\3\2\2\2UV\7c\2\2VW\7e\2\2"+
		"WX\7q\2\2XY\7u\2\2Y\30\3\2\2\2Z[\7c\2\2[\\\7v\2\2\\]\7c\2\2]^\7p\2\2^"+
		"\32\3\2\2\2_`\7k\2\2`\34\3\2\2\2ab\7,\2\2b\36\3\2\2\2cd\7\61\2\2d \3\2"+
		"\2\2ef\7-\2\2f\"\3\2\2\2gh\7/\2\2h$\3\2\2\2ik\t\2\2\2ji\3\2\2\2kl\3\2"+
		"\2\2lj\3\2\2\2lm\3\2\2\2m&\3\2\2\2np\t\3\2\2on\3\2\2\2pq\3\2\2\2qo\3\2"+
		"\2\2qr\3\2\2\2r(\3\2\2\2su\t\3\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2wx\3\2\2\2x|\7\60\2\2y{\t\3\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3"+
		"\2\2\2}*\3\2\2\2~|\3\2\2\2\177\u0081\7\17\2\2\u0080\177\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\f\2\2\u0083,\3\2\2\2"+
		"\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\27\2\2"+
		"\u008a.\3\2\2\2\t\2lqv|\u0080\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}