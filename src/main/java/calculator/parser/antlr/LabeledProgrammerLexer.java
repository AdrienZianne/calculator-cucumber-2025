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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, AND=15, OR=16, NOT=17, 
		INT=18, VALUE=19, BOOL=20, NEWLINE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "AND", "OR", "NOT", "INT", 
			"VALUE", "BOOL", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20"+
		"d\n\20\3\21\3\21\3\21\5\21i\n\21\3\22\3\22\3\22\3\22\5\22o\n\22\3\23\6"+
		"\23r\n\23\r\23\16\23s\3\24\6\24w\n\24\r\24\16\24x\3\25\3\25\3\26\5\26"+
		"~\n\26\3\26\3\26\3\27\6\27\u0083\n\27\r\27\16\27\u0084\3\27\3\27\2\2\30"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\3\2\62;\5\2\62;CXcx\6\2HHVV"+
		"hhvv\4\2\13\13\"\"\2\u008e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t8\3\2\2\2\13<\3"+
		"\2\2\2\rA\3\2\2\2\17G\3\2\2\2\21J\3\2\2\2\23M\3\2\2\2\25R\3\2\2\2\27T"+
		"\3\2\2\2\31V\3\2\2\2\33Y\3\2\2\2\35\\\3\2\2\2\37c\3\2\2\2!h\3\2\2\2#n"+
		"\3\2\2\2%q\3\2\2\2\'v\3\2\2\2)z\3\2\2\2+}\3\2\2\2-\u0082\3\2\2\2/\60\7"+
		"*\2\2\60\4\3\2\2\2\61\62\7+\2\2\62\6\3\2\2\2\63\64\7p\2\2\64\65\7c\2\2"+
		"\65\66\7p\2\2\66\67\7f\2\2\67\b\3\2\2\289\7p\2\29:\7q\2\2:;\7t\2\2;\n"+
		"\3\2\2\2<=\7k\2\2=>\7o\2\2>?\7r\2\2?@\7n\2\2@\f\3\2\2\2AB\7g\2\2BC\7s"+
		"\2\2CD\7w\2\2DE\7k\2\2EF\7x\2\2F\16\3\2\2\2GH\7>\2\2HI\7>\2\2I\20\3\2"+
		"\2\2JK\7@\2\2KL\7@\2\2L\22\3\2\2\2MN\7e\2\2NO\7q\2\2OP\7p\2\2PQ\7x\2\2"+
		"Q\24\3\2\2\2RS\7.\2\2S\26\3\2\2\2TU\7a\2\2U\30\3\2\2\2VW\7\62\2\2WX\7"+
		"d\2\2X\32\3\2\2\2YZ\7\62\2\2Z[\7q\2\2[\34\3\2\2\2\\]\7\62\2\2]^\7z\2\2"+
		"^\36\3\2\2\2_`\7c\2\2`a\7p\2\2ad\7f\2\2bd\7(\2\2c_\3\2\2\2cb\3\2\2\2d"+
		" \3\2\2\2ef\7q\2\2fi\7t\2\2gi\7~\2\2he\3\2\2\2hg\3\2\2\2i\"\3\2\2\2jk"+
		"\7p\2\2kl\7q\2\2lo\7v\2\2mo\7/\2\2nj\3\2\2\2nm\3\2\2\2o$\3\2\2\2pr\t\2"+
		"\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t&\3\2\2\2uw\t\3\2\2vu\3\2"+
		"\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y(\3\2\2\2z{\t\4\2\2{*\3\2\2\2|~\7\17"+
		"\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\f\2\2\u0080,\3\2\2\2"+
		"\u0081\u0083\t\5\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\27\2\2"+
		"\u0087.\3\2\2\2\n\2chnsx}\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}