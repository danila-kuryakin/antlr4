// Generated from D:/DProject/src/main/java/ru/kuryakin/lab3/task6\Task6.g4 by ANTLR 4.8
package ru.kuryakin.lab3.task6;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task6 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Reg=1, S=2, Indif=3, Number=4, Sing=5, Other=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Reg", "S", "Indif", "Number", "Sing", "Other"
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
			null, "Reg", "S", "Indif", "Number", "Sing", "Other"
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


	public Task6(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task6.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b.\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\30\n\2\3\3\3\3\3\4\6\4\35\n\4\r\4\16\4\36\3\5\5\5\"\n\5\3\5\6\5%"+
		"\n\5\r\5\16\5&\3\6\3\6\3\7\3\7\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\3\2\n\3\2cf\4\2ffuu\4\2dduu\3\2fg\4\2]]__\5\2\62;C\\c|\4\2--//\3\2\62"+
		";\2\63\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\34\3\2\2\2\t!\3\2\2\2\13(\3\2\2"+
		"\2\r*\3\2\2\2\17\20\t\2\2\2\20\30\7z\2\2\21\22\t\3\2\2\22\30\7k\2\2\23"+
		"\24\t\4\2\2\24\30\7r\2\2\25\26\t\5\2\2\26\30\7u\2\2\27\17\3\2\2\2\27\21"+
		"\3\2\2\2\27\23\3\2\2\2\27\25\3\2\2\2\30\4\3\2\2\2\31\32\t\6\2\2\32\6\3"+
		"\2\2\2\33\35\t\7\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3"+
		"\2\2\2\37\b\3\2\2\2 \"\t\b\2\2! \3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#%\t\t\2"+
		"\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\n\3\2\2\2()\t\b\2\2)\f\3"+
		"\2\2\2*+\13\2\2\2+,\3\2\2\2,-\b\7\2\2-\16\3\2\2\2\7\2\27\36!&\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}