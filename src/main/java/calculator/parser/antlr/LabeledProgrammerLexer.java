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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BOOL=10, AND=11, OR=12, NOT=13, LSHIFT=14, RSHIFT=15, BINARY_LITERAL=16, 
		OCTAL_LITERAL=17, HEXA_LITERAL=18, INT=19, ALPHABET=20, BOTH=21, NEWLINE=22, 
		WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"BOOL", "AND", "OR", "NOT", "LSHIFT", "RSHIFT", "BINARY_LITERAL", "OCTAL_LITERAL", 
			"HEXA_LITERAL", "INT", "ALPHABET", "BOTH", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'nand'", "'nor'", "'impl'", "'equiv'", "'conv'", 
			"','", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "BOOL", "AND", 
			"OR", "NOT", "LSHIFT", "RSHIFT", "BINARY_LITERAL", "OCTAL_LITERAL", "HEXA_LITERAL", 
			"INT", "ALPHABET", "BOTH", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f[\n\f\3\r\3\r\3\r\3\r\3\r\5\rb\n\r\3\16\3\16"+
		"\3\16\3\16\5\16h\n\16\3\17\3\17\3\17\3\17\3\17\5\17o\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\5\20v\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21~\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0086\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u008e\n\23\3\24\6\24\u0091\n\24\r\24\16\24\u0092\3\25\6\25\u0096"+
		"\n\25\r\25\16\25\u0097\3\26\3\26\6\26\u009c\n\26\r\26\16\26\u009d\3\27"+
		"\5\27\u00a1\n\27\3\27\3\27\3\30\6\30\u00a6\n\30\r\30\16\30\u00a7\3\30"+
		"\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\6\6\2HHVVhhvv"+
		"\3\2\62;\4\2CXcx\4\2\13\13\"\"\2\u00bf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65"+
		"\3\2\2\2\t:\3\2\2\2\13>\3\2\2\2\rC\3\2\2\2\17I\3\2\2\2\21N\3\2\2\2\23"+
		"P\3\2\2\2\25R\3\2\2\2\27Z\3\2\2\2\31a\3\2\2\2\33g\3\2\2\2\35n\3\2\2\2"+
		"\37u\3\2\2\2!w\3\2\2\2#\177\3\2\2\2%\u0087\3\2\2\2\'\u0090\3\2\2\2)\u0095"+
		"\3\2\2\2+\u009b\3\2\2\2-\u00a0\3\2\2\2/\u00a5\3\2\2\2\61\62\7*\2\2\62"+
		"\4\3\2\2\2\63\64\7+\2\2\64\6\3\2\2\2\65\66\7p\2\2\66\67\7c\2\2\678\7p"+
		"\2\289\7f\2\29\b\3\2\2\2:;\7p\2\2;<\7q\2\2<=\7t\2\2=\n\3\2\2\2>?\7k\2"+
		"\2?@\7o\2\2@A\7r\2\2AB\7n\2\2B\f\3\2\2\2CD\7g\2\2DE\7s\2\2EF\7w\2\2FG"+
		"\7k\2\2GH\7x\2\2H\16\3\2\2\2IJ\7e\2\2JK\7q\2\2KL\7p\2\2LM\7x\2\2M\20\3"+
		"\2\2\2NO\7.\2\2O\22\3\2\2\2PQ\7a\2\2Q\24\3\2\2\2RS\t\2\2\2S\26\3\2\2\2"+
		"TU\7c\2\2UV\7p\2\2V[\7f\2\2W[\7(\2\2XY\7(\2\2Y[\7(\2\2ZT\3\2\2\2ZW\3\2"+
		"\2\2ZX\3\2\2\2[\30\3\2\2\2\\]\7q\2\2]b\7t\2\2^b\7~\2\2_`\7~\2\2`b\7~\2"+
		"\2a\\\3\2\2\2a^\3\2\2\2a_\3\2\2\2b\32\3\2\2\2cd\7p\2\2de\7q\2\2eh\7v\2"+
		"\2fh\7/\2\2gc\3\2\2\2gf\3\2\2\2h\34\3\2\2\2ij\7n\2\2jo\7u\2\2ko\7>\2\2"+
		"lm\7>\2\2mo\7>\2\2ni\3\2\2\2nk\3\2\2\2nl\3\2\2\2o\36\3\2\2\2pq\7t\2\2"+
		"qv\7u\2\2rv\7@\2\2st\7@\2\2tv\7@\2\2up\3\2\2\2ur\3\2\2\2us\3\2\2\2v \3"+
		"\2\2\2wx\7\62\2\2xy\7d\2\2y}\3\2\2\2z~\5\'\24\2{~\5)\25\2|~\5+\26\2}z"+
		"\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\"\3\2\2\2\177\u0080\7\62\2\2\u0080\u0081"+
		"\7q\2\2\u0081\u0085\3\2\2\2\u0082\u0086\5\'\24\2\u0083\u0086\5)\25\2\u0084"+
		"\u0086\5+\26\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2"+
		"\2\2\u0086$\3\2\2\2\u0087\u0088\7\62\2\2\u0088\u0089\7z\2\2\u0089\u008d"+
		"\3\2\2\2\u008a\u008e\5\'\24\2\u008b\u008e\5)\25\2\u008c\u008e\5+\26\2"+
		"\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e&\3"+
		"\2\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093(\3\2\2\2\u0094\u0096\t\4\2\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098*\3\2\2\2\u0099\u009c\5\'\24\2\u009a\u009c\5)\25\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e,\3\2\2\2\u009f\u00a1\7\17\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3"+
		".\3\2\2\2\u00a4\u00a6\t\5\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa"+
		"\b\30\2\2\u00aa\60\3\2\2\2\21\2Zagnu}\u0085\u008d\u0092\u0097\u009b\u009d"+
		"\u00a0\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}