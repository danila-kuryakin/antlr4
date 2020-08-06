// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task13\Task13.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task13;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task13Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Mov=2, Reg=3, SegmentReg=4, Number=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Mov", "Reg", "SegmentReg", "Number", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'mov'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Mov", "Reg", "SegmentReg", "Number", "WS"
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


	public Task13Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task13.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b/\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\34\n\4\3\5\3\5\3\5\3\6\5\6\"\n\6\3\6\6\6%\n\6\r\6"+
		"\16\6&\3\7\6\7*\n\7\r\7\16\7+\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3"+
		"\2\t\3\2cf\4\2ffuu\4\2dduu\3\2fg\4\2--//\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\63\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\3\17\3\2\2\2\5\21\3\2\2\2\7\33\3\2\2\2\t\35\3\2\2\2\13!\3\2\2\2"+
		"\r)\3\2\2\2\17\20\7.\2\2\20\4\3\2\2\2\21\22\7o\2\2\22\23\7q\2\2\23\24"+
		"\7x\2\2\24\6\3\2\2\2\25\26\t\2\2\2\26\34\7z\2\2\27\30\t\3\2\2\30\34\7"+
		"k\2\2\31\32\t\4\2\2\32\34\7r\2\2\33\25\3\2\2\2\33\27\3\2\2\2\33\31\3\2"+
		"\2\2\34\b\3\2\2\2\35\36\t\5\2\2\36\37\7u\2\2\37\n\3\2\2\2 \"\t\6\2\2!"+
		" \3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#%\t\7\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2"+
		"\2&\'\3\2\2\2\'\f\3\2\2\2(*\t\b\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3"+
		"\2\2\2,-\3\2\2\2-.\b\7\2\2.\16\3\2\2\2\7\2\33!&+\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}