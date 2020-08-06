// Generated from D:/DProject/src/main/java/ru/kuryakin/lab3/task9\Task9.g4 by ANTLR 4.8
package ru.kuryakin.lab3.task9;
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
		Str=1, Other=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Str", "Num", "H", "Liter", "Other"
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
			null, "Str", "Other"
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
			Str_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Str_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println(getText().substring(getText().indexOf("H") + 1));
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return Str_sempred((RuleContext)_localctx, predIndex);
		case 1:
			return Num_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Str_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getText().substring(getText().indexOf("H") + 1).length() == Integer.parseInt(getText().substring(0, getText().indexOf("H")));
		}
		return true;
	}
	private boolean Num_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return Integer.parseInt(getText()) >= 0 && Integer.parseInt(getText()) < 255;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\4%\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3\25\n\3"+
		"\r\3\16\3\26\3\3\3\3\3\4\3\4\3\5\6\5\36\n\5\r\5\16\5\37\3\6\3\6\3\6\3"+
		"\6\2\2\7\3\3\5\2\7\2\t\2\13\4\3\2\4\3\2\62;\5\2\62;C\\c|\2#\2\3\3\2\2"+
		"\2\2\13\3\2\2\2\3\r\3\2\2\2\5\24\3\2\2\2\7\32\3\2\2\2\t\35\3\2\2\2\13"+
		"!\3\2\2\2\r\16\5\5\3\2\16\17\5\7\4\2\17\20\5\t\5\2\20\21\6\2\2\2\21\22"+
		"\b\2\2\2\22\4\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24"+
		"\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\6\3\3\2\31\6\3\2\2\2\32\33"+
		"\7J\2\2\33\b\3\2\2\2\34\36\t\3\2\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3"+
		"\2\2\2\37 \3\2\2\2 \n\3\2\2\2!\"\13\2\2\2\"#\3\2\2\2#$\b\6\3\2$\f\3\2"+
		"\2\2\5\2\26\37\4\3\2\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}