// Generated from D:/DProject/src/main/java/ru/kuryakin/tema3/questions/q3\Q3.g4 by ANTLR 4.8
package ru.kuryakin.tema3.questions.q3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Q3 extends Lexer {
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


	public Q3(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Q3.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5\36\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\3\2\3\2\5\2\r\n\2\3\2\6\2\20\n\2\r\2\16\2\21\3\2"+
		"\3\2\3\3\6\3\27\n\3\r\3\16\3\30\3\3\3\3\3\4\3\4\2\2\5\3\3\5\4\7\5\3\2"+
		"\4\3\2c|\4\2\13\f\"\"\2 \2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3\f\3\2\2"+
		"\2\5\26\3\2\2\2\7\34\3\2\2\2\t\n\7\60\2\2\n\13\7\60\2\2\13\r\7\60\2\2"+
		"\f\t\3\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2\16\20\t\2\2\2\17\16\3\2\2\2\20\21"+
		"\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7A\2\2\24\4\3"+
		"\2\2\2\25\27\t\3\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3"+
		"\2\2\2\31\32\3\2\2\2\32\33\b\3\2\2\33\6\3\2\2\2\34\35\13\2\2\2\35\b\3"+
		"\2\2\2\6\2\f\21\30\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}