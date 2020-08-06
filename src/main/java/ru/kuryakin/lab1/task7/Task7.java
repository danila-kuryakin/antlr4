// Generated from D:/DProject/src/main/java/ru/kuryakin/lab1/task7\Task9.g4 by ANTLR 4.8
package ru.kuryakin.lab1.task7;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task7 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, CommentNew=2, Other=3, CommentStart=4, CommentClose=5, Text=6;
	public static final int
		COM=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COM"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "CommentNew", "Other", "CommentStart", "CommentClose", "Text"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "CommentNew", "Other", "CommentStart", "CommentClose", "Text"
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


	public Task7(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task9.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b-\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\2\2\b\4\3\6\4\b\5\n\6\f\7\16\b\4\2\3\3\5\2"+
		"\13\f\17\17\"\"\2,\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\3\n\3\2\2\2\3\f"+
		"\3\2\2\2\3\16\3\2\2\2\4\21\3\2\2\2\6\25\3\2\2\2\b\33\3\2\2\2\n\35\3\2"+
		"\2\2\f#\3\2\2\2\16)\3\2\2\2\20\22\t\2\2\2\21\20\3\2\2\2\22\23\3\2\2\2"+
		"\23\21\3\2\2\2\23\24\3\2\2\2\24\5\3\2\2\2\25\26\7*\2\2\26\27\7,\2\2\27"+
		"\30\3\2\2\2\30\31\b\3\2\2\31\32\b\3\3\2\32\7\3\2\2\2\33\34\13\2\2\2\34"+
		"\t\3\2\2\2\35\36\7*\2\2\36\37\7,\2\2\37 \3\2\2\2 !\b\5\2\2!\"\b\5\3\2"+
		"\"\13\3\2\2\2#$\7,\2\2$%\7+\2\2%&\3\2\2\2&\'\b\6\2\2\'(\b\6\4\2(\r\3\2"+
		"\2\2)*\13\2\2\2*+\3\2\2\2+,\b\7\2\2,\17\3\2\2\2\5\2\3\23\5\b\2\2\7\3\2"+
		"\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}