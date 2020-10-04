// Generated from C:/Users/peter/Desktop/impl/impl\impl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ID=17, 
		FLOAT=18, ALPHA=19, NUM=20, WHITESPACE=21, COMMENT=22, COMMENT2=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "ID", "FLOAT", 
			"ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'while'", "'('", "')'", 
			"'+'", "'-'", "'*'", "'!='", "'=='", "'<'", "'>'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", 
			"COMMENT", "COMMENT2"
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\7\22a\n\22"+
		"\f\22\16\22d\13\22\3\23\5\23g\n\23\3\23\6\23j\n\23\r\23\16\23k\3\23\3"+
		"\23\6\23p\n\23\r\23\16\23q\5\23t\n\23\3\24\3\24\3\25\3\25\3\26\6\26{\n"+
		"\26\r\26\16\26|\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0085\n\27\f\27\16"+
		"\27\u0088\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0092\n\30"+
		"\f\30\16\30\u0095\13\30\3\30\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\3\2\b\13\2C\\aac|\u00a7\u00a8\u00ba\u00ba\u00c5"+
		"\u00c5\u02de\u02de\u2022\u2022\u2028\u2028\3\2\62;\5\2\13\f\17\17\"\""+
		"\3\2\f\f\3\2,,\3\2\61\61\2\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2"+
		"\2\t\67\3\2\2\2\139\3\2\2\2\r@\3\2\2\2\17F\3\2\2\2\21H\3\2\2\2\23J\3\2"+
		"\2\2\25L\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33S\3\2\2\2\35V\3\2\2\2\37X\3"+
		"\2\2\2!Z\3\2\2\2#]\3\2\2\2%f\3\2\2\2\'u\3\2\2\2)w\3\2\2\2+z\3\2\2\2-\u0080"+
		"\3\2\2\2/\u008b\3\2\2\2\61\62\7}\2\2\62\4\3\2\2\2\63\64\7\177\2\2\64\6"+
		"\3\2\2\2\65\66\7?\2\2\66\b\3\2\2\2\678\7=\2\28\n\3\2\2\29:\7q\2\2:;\7"+
		"w\2\2;<\7v\2\2<=\7r\2\2=>\7w\2\2>?\7v\2\2?\f\3\2\2\2@A\7y\2\2AB\7j\2\2"+
		"BC\7k\2\2CD\7n\2\2DE\7g\2\2E\16\3\2\2\2FG\7*\2\2G\20\3\2\2\2HI\7+\2\2"+
		"I\22\3\2\2\2JK\7-\2\2K\24\3\2\2\2LM\7/\2\2M\26\3\2\2\2NO\7,\2\2O\30\3"+
		"\2\2\2PQ\7#\2\2QR\7?\2\2R\32\3\2\2\2ST\7?\2\2TU\7?\2\2U\34\3\2\2\2VW\7"+
		">\2\2W\36\3\2\2\2XY\7@\2\2Y \3\2\2\2Z[\7(\2\2[\\\7(\2\2\\\"\3\2\2\2]b"+
		"\5\'\24\2^a\5\'\24\2_a\5)\25\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2"+
		"bc\3\2\2\2c$\3\2\2\2db\3\2\2\2eg\7/\2\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2"+
		"hj\5)\25\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ls\3\2\2\2mo\7\60\2"+
		"\2np\5)\25\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sm\3\2\2"+
		"\2st\3\2\2\2t&\3\2\2\2uv\t\2\2\2v(\3\2\2\2wx\t\3\2\2x*\3\2\2\2y{\t\4\2"+
		"\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\26\2\2\177"+
		",\3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7\61\2\2\u0082\u0086\3\2\2"+
		"\2\u0083\u0085\n\5\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\b\27\2\2\u008a.\3\2\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7,\2\2"+
		"\u008d\u0093\3\2\2\2\u008e\u0092\n\6\2\2\u008f\u0090\7,\2\2\u0090\u0092"+
		"\n\7\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\7,\2\2\u0097\u0098\7\61\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\b\30\2\2\u009a\60\3\2\2\2\r\2`bfkqs|\u0086\u0091\u0093\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}