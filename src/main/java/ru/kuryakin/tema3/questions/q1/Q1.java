// Generated from D:/DProject/src/main/java/ru/kuryakin/tema3/questions/q1\Q1.g4 by ANTLR 4.8
package ru.kuryakin.tema3.questions.q1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Q1 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Expr=1, WD=2, Other=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Expr", "WD", "Other"
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
			null, "Expr", "WD", "Other"
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


	public Q1(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Q1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5\37\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\6\2\13\n\2\r\2\16\2\f\3\2\3\2\3\2\3\2\6\2\23\n\2"+
		"\r\2\16\2\24\3\3\6\3\30\n\3\r\3\16\3\31\3\3\3\3\3\4\3\4\2\2\5\3\3\5\4"+
		"\7\5\3\2\3\4\2\13\f\"\"\2\"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3\n\3"+
		"\2\2\2\5\27\3\2\2\2\7\35\3\2\2\2\t\13\7z\2\2\n\t\3\2\2\2\13\f\3\2\2\2"+
		"\f\n\3\2\2\2\f\r\3\2\2\2\r\22\3\2\2\2\16\17\7{\2\2\17\23\7|\2\2\20\21"+
		"\7|\2\2\21\23\7{\2\2\22\16\3\2\2\2\22\20\3\2\2\2\23\24\3\2\2\2\24\22\3"+
		"\2\2\2\24\25\3\2\2\2\25\4\3\2\2\2\26\30\t\2\2\2\27\26\3\2\2\2\30\31\3"+
		"\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\b\3\2\2\34\6\3"+
		"\2\2\2\35\36\13\2\2\2\36\b\3\2\2\2\7\2\f\22\24\31\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}