// Generated from D:/DProject/src/main/java/ru/kuryakin/tema4/date/v3/a\Date_v3a.g4 by ANTLR 4.8
package ru.kuryakin.tema4.date.v3.a;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Date_v3aLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Number=2, Mouth=3, WS=4, Other=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Number", "Mouth", "WS", "Other"
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
			null, null, "Number", "Mouth", "WS", "Other"
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


	public Date_v3aLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Date_v3a.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7E\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\6\3\21\n\3\r\3\16\3\22\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\49\n\4\3\5\6\5<\n\5\r\5\16\5=\3\5\3\5\3\6\3\6\3\6\3\6\2\2\7\3\3\5\4"+
		"\7\5\t\6\13\7\3\2\4\3\2\62;\5\2\13\f\17\17\"\"\2Q\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\20\3\2\2\2\78"+
		"\3\2\2\2\t;\3\2\2\2\13A\3\2\2\2\r\16\7.\2\2\16\4\3\2\2\2\17\21\t\2\2\2"+
		"\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\6\3\2\2\2"+
		"\24\25\7l\2\2\25\26\7c\2\2\269\7p\2\2\27\30\7h\2\2\30\31\7g\2\2\319\7"+
		"d\2\2\32\33\7o\2\2\33\34\7c\2\2\349\7t\2\2\35\36\7c\2\2\36\37\7r\2\2\37"+
		"9\7t\2\2 !\7o\2\2!\"\7c\2\2\"9\7{\2\2#$\7l\2\2$%\7w\2\2%9\7p\2\2&\'\7"+
		"l\2\2\'(\7w\2\2(9\7n\2\2)*\7c\2\2*+\7w\2\2+9\7i\2\2,-\7u\2\2-.\7g\2\2"+
		".9\7r\2\2/\60\7q\2\2\60\61\7e\2\2\619\7v\2\2\62\63\7p\2\2\63\64\7q\2\2"+
		"\649\7x\2\2\65\66\7f\2\2\66\67\7g\2\2\679\7e\2\28\24\3\2\2\28\27\3\2\2"+
		"\28\32\3\2\2\28\35\3\2\2\28 \3\2\2\28#\3\2\2\28&\3\2\2\28)\3\2\2\28,\3"+
		"\2\2\28/\3\2\2\28\62\3\2\2\28\65\3\2\2\29\b\3\2\2\2:<\t\3\2\2;:\3\2\2"+
		"\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\b\5\2\2@\n\3\2\2\2AB\13\2"+
		"\2\2BC\3\2\2\2CD\b\6\2\2D\f\3\2\2\2\6\2\228=\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}