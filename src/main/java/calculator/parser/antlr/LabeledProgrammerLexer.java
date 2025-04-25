// Generated from LabeledProgrammer.g4 by ANTLR 4.9.1
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
public class LabeledProgrammerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BOOL=8, LSHIFT=9, 
		RSHIFT=10, NOT=11, AND=12, OR=13, XOR=14, IMPL=15, EQUIV=16, BINARY_LITERAL=17, 
		OCTAL_LITERAL=18, HEXA_LITERAL=19, INT=20, ALPHABET=21, BOTH=22, NEWLINE=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "BOOL", "LSHIFT", 
			"RSHIFT", "NOT", "AND", "OR", "XOR", "IMPL", "EQUIV", "BINARY_LITERAL", 
			"OCTAL_LITERAL", "HEXA_LITERAL", "INT", "ALPHABET", "BOTH", "NEWLINE", 
			"WS"
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


	public LabeledProgrammerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledProgrammer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nQ\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\5\13X\n\13\3\f\3\f\3\f\3\f\5\f^\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\rg\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16o\n\16\3\17\3\17"+
		"\3\17\3\17\5\17u\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0080\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008a\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u0092\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u009a\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00a2\n\24\3"+
		"\25\6\25\u00a5\n\25\r\25\16\25\u00a6\3\26\6\26\u00aa\n\26\r\26\16\26\u00ab"+
		"\3\27\3\27\6\27\u00b0\n\27\r\27\16\27\u00b1\3\30\5\30\u00b5\n\30\3\30"+
		"\3\30\3\31\6\31\u00ba\n\31\r\31\16\31\u00bb\3\31\3\31\2\2\32\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\7\6\2HHVVhhvv\4\2##\u00ae\u00ae"+
		"\3\2\62;\4\2CXcx\4\2\13\13\"\"\2\u00db\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65"+
		"\3\2\2\2\7\67\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\rC\3\2\2\2\17G\3\2\2\2\21"+
		"I\3\2\2\2\23P\3\2\2\2\25W\3\2\2\2\27]\3\2\2\2\31f\3\2\2\2\33n\3\2\2\2"+
		"\35t\3\2\2\2\37\177\3\2\2\2!\u0089\3\2\2\2#\u008b\3\2\2\2%\u0093\3\2\2"+
		"\2\'\u009b\3\2\2\2)\u00a4\3\2\2\2+\u00a9\3\2\2\2-\u00af\3\2\2\2/\u00b4"+
		"\3\2\2\2\61\u00b9\3\2\2\2\63\64\7*\2\2\64\4\3\2\2\2\65\66\7+\2\2\66\6"+
		"\3\2\2\2\678\7e\2\289\7q\2\29:\7p\2\2:;\7x\2\2;\b\3\2\2\2<=\7.\2\2=\n"+
		"\3\2\2\2>?\7p\2\2?@\7c\2\2@A\7p\2\2AB\7f\2\2B\f\3\2\2\2CD\7p\2\2DE\7q"+
		"\2\2EF\7t\2\2F\16\3\2\2\2GH\7a\2\2H\20\3\2\2\2IJ\t\2\2\2J\22\3\2\2\2K"+
		"L\7n\2\2LQ\7u\2\2MQ\7>\2\2NO\7>\2\2OQ\7>\2\2PK\3\2\2\2PM\3\2\2\2PN\3\2"+
		"\2\2Q\24\3\2\2\2RS\7t\2\2SX\7u\2\2TX\7@\2\2UV\7@\2\2VX\7@\2\2WR\3\2\2"+
		"\2WT\3\2\2\2WU\3\2\2\2X\26\3\2\2\2YZ\7p\2\2Z[\7q\2\2[^\7v\2\2\\^\t\3\2"+
		"\2]Y\3\2\2\2]\\\3\2\2\2^\30\3\2\2\2_`\7c\2\2`a\7p\2\2ag\7f\2\2bg\7(\2"+
		"\2cd\7(\2\2dg\7(\2\2eg\7\u2229\2\2f_\3\2\2\2fb\3\2\2\2fc\3\2\2\2fe\3\2"+
		"\2\2g\32\3\2\2\2hi\7q\2\2io\7t\2\2jo\7~\2\2kl\7~\2\2lo\7~\2\2mo\7\u222a"+
		"\2\2nh\3\2\2\2nj\3\2\2\2nk\3\2\2\2nm\3\2\2\2o\34\3\2\2\2pq\7z\2\2qr\7"+
		"q\2\2ru\7t\2\2su\7\u2297\2\2tp\3\2\2\2ts\3\2\2\2u\36\3\2\2\2vw\7k\2\2"+
		"wx\7o\2\2xy\7r\2\2y\u0080\7n\2\2z{\7/\2\2{\u0080\7@\2\2|}\7?\2\2}\u0080"+
		"\7@\2\2~\u0080\7\u2194\2\2\177v\3\2\2\2\177z\3\2\2\2\177|\3\2\2\2\177"+
		"~\3\2\2\2\u0080 \3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7s\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u0085\7k\2\2\u0085\u008a\7x\2\2\u0086\u0087\7?\2\2\u0087"+
		"\u008a\7?\2\2\u0088\u008a\7\u2263\2\2\u0089\u0081\3\2\2\2\u0089\u0086"+
		"\3\2\2\2\u0089\u0088\3\2\2\2\u008a\"\3\2\2\2\u008b\u008c\7\62\2\2\u008c"+
		"\u008d\7d\2\2\u008d\u0091\3\2\2\2\u008e\u0092\5)\25\2\u008f\u0092\5+\26"+
		"\2\u0090\u0092\5-\27\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092$\3\2\2\2\u0093\u0094\7\62\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0099\3\2\2\2\u0096\u009a\5)\25\2\u0097\u009a\5+\26\2\u0098\u009a\5-"+
		"\27\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"&\3\2\2\2\u009b\u009c\7\62\2\2\u009c\u009d\7z\2\2\u009d\u00a1\3\2\2\2"+
		"\u009e\u00a2\5)\25\2\u009f\u00a2\5+\26\2\u00a0\u00a2\5-\27\2\u00a1\u009e"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2(\3\2\2\2\u00a3"+
		"\u00a5\t\4\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7*\3\2\2\2\u00a8\u00aa\t\5\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		",\3\2\2\2\u00ad\u00b0\5)\25\2\u00ae\u00b0\5+\26\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2.\3\2\2\2\u00b3\u00b5\7\17\2\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7\60\3\2\2"+
		"\2\u00b8\u00ba\t\6\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\31\2\2"+
		"\u00be\62\3\2\2\2\24\2PW]fnt\177\u0089\u0091\u0099\u00a1\u00a6\u00ab\u00af"+
		"\u00b1\u00b4\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}