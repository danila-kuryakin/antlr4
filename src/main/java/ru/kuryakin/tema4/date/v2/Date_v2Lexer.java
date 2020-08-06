// Generated from D:/DProject/src/main/java/ru/kuryakin/tema4/example2\Date_v2.g4 by ANTLR 4.8
package ru.kuryakin.tema4.date.v2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Date_v2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Number=2, Month=3, WS=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Number", "Month", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Number", "Month", "WS"
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


	public Date_v2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Date_v2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6?\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\6\3\17\n\3\r\3\16\3\20\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\67"+
		"\n\4\3\5\6\5:\n\5\r\5\16\5;\3\5\3\5\2\2\6\3\3\5\4\7\5\t\6\3\2\4\3\2\62"+
		";\5\2\13\f\17\17\"\"\2K\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\3\13\3\2\2\2\5\16\3\2\2\2\7\66\3\2\2\2\t9\3\2\2\2\13\f\7.\2\2\f\4\3"+
		"\2\2\2\r\17\t\2\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2"+
		"\2\2\21\6\3\2\2\2\22\23\7l\2\2\23\24\7c\2\2\24\67\7p\2\2\25\26\7h\2\2"+
		"\26\27\7g\2\2\27\67\7d\2\2\30\31\7o\2\2\31\32\7c\2\2\32\67\7t\2\2\33\34"+
		"\7c\2\2\34\35\7r\2\2\35\67\7t\2\2\36\37\7o\2\2\37 \7c\2\2 \67\7{\2\2!"+
		"\"\7l\2\2\"#\7w\2\2#\67\7p\2\2$%\7l\2\2%&\7w\2\2&\67\7n\2\2\'(\7c\2\2"+
		"()\7w\2\2)\67\7i\2\2*+\7u\2\2+,\7g\2\2,\67\7r\2\2-.\7q\2\2./\7e\2\2/\67"+
		"\7v\2\2\60\61\7p\2\2\61\62\7q\2\2\62\67\7x\2\2\63\64\7f\2\2\64\65\7g\2"+
		"\2\65\67\7e\2\2\66\22\3\2\2\2\66\25\3\2\2\2\66\30\3\2\2\2\66\33\3\2\2"+
		"\2\66\36\3\2\2\2\66!\3\2\2\2\66$\3\2\2\2\66\'\3\2\2\2\66*\3\2\2\2\66-"+
		"\3\2\2\2\66\60\3\2\2\2\66\63\3\2\2\2\67\b\3\2\2\28:\t\3\2\298\3\2\2\2"+
		":;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\b\5\2\2>\n\3\2\2\2\6\2\20\66"+
		";\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}