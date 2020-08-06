// Generated from D:/DProject/src/main/java/ru/kuryakin/lab1/task9\Task9.g4 by ANTLR 4.8
package ru.kuryakin.lab1.task9;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task9 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StrComment=1, Comment=2, TEXT=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"StrComment", "Comment", "TEXT"
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
			null, "StrComment", "Comment", "TEXT"
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


	public Task9(CharStream input) {
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			StrComment_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void StrComment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.printf("\n");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5)\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\4\r!\2\5\3\3\5\4\7\5\3\2\2\2*\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\3\t\3\2\2\2\5\24\3\2\2\2\7\'\3\2\2\2\t\13\7=\2\2\n\f\13\2\2\2"+
		"\13\n\3\2\2\2\f\r\3\2\2\2\r\16\3\2\2\2\r\13\3\2\2\2\16\17\3\2\2\2\17\20"+
		"\7\f\2\2\20\21\b\2\2\2\21\22\3\2\2\2\22\23\b\2\3\2\23\4\3\2\2\2\24\25"+
		"\7E\2\2\25\26\7Q\2\2\26\27\7O\2\2\27\30\7O\2\2\30\31\7G\2\2\31\32\7P\2"+
		"\2\32\33\7V\2\2\33\34\7\"\2\2\34\35\7&\2\2\35\37\3\2\2\2\36 \13\2\2\2"+
		"\37\36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2!\37\3\2\2\2\"#\3\2\2\2#$\7&\2\2$%"+
		"\3\2\2\2%&\b\3\3\2&\6\3\2\2\2\'(\13\2\2\2(\b\3\2\2\2\5\2\r!\4\3\2\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}