// Generated from D:/DProject/src/main/java/ru/kuryakin/tema4/v1\DateV1.g4 by ANTLR 4.8
package ru.kuryakin.tema4.date.v1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateV1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Number=1, Month=2, WS=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Number", "Month", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Number", "Month", "WS"
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


	public DateV1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DateV1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5;\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\6\2\13\n\2\r\2\16\2\f\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3\4\6\4\66\n\4"+
		"\r\4\16\4\67\3\4\3\4\2\2\5\3\3\5\4\7\5\3\2\4\3\2\62;\5\2\13\f\17\17\""+
		"\"\2G\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3\n\3\2\2\2\5\62\3\2\2\2\7\65"+
		"\3\2\2\2\t\13\t\2\2\2\n\t\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2"+
		"\r\4\3\2\2\2\16\17\7l\2\2\17\20\7c\2\2\20\63\7p\2\2\21\22\7h\2\2\22\23"+
		"\7g\2\2\23\63\7d\2\2\24\25\7o\2\2\25\26\7c\2\2\26\63\7t\2\2\27\30\7c\2"+
		"\2\30\31\7r\2\2\31\63\7t\2\2\32\33\7o\2\2\33\34\7c\2\2\34\63\7{\2\2\35"+
		"\36\7l\2\2\36\37\7w\2\2\37\63\7p\2\2 !\7l\2\2!\"\7w\2\2\"\63\7n\2\2#$"+
		"\7c\2\2$%\7w\2\2%\63\7i\2\2&\'\7u\2\2\'(\7g\2\2(\63\7r\2\2)*\7q\2\2*+"+
		"\7e\2\2+\63\7v\2\2,-\7p\2\2-.\7q\2\2.\63\7x\2\2/\60\7f\2\2\60\61\7g\2"+
		"\2\61\63\7e\2\2\62\16\3\2\2\2\62\21\3\2\2\2\62\24\3\2\2\2\62\27\3\2\2"+
		"\2\62\32\3\2\2\2\62\35\3\2\2\2\62 \3\2\2\2\62#\3\2\2\2\62&\3\2\2\2\62"+
		")\3\2\2\2\62,\3\2\2\2\62/\3\2\2\2\63\6\3\2\2\2\64\66\t\3\2\2\65\64\3\2"+
		"\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\b\4\2\2:\b\3"+
		"\2\2\2\6\2\f\62\67\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}