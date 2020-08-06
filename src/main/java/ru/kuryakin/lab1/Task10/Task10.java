// Generated from D:/DProject/src/main/java/ru/kuryakin/lab1/Task10\Task10.g4 by ANTLR 4.8
package ru.kuryakin.lab1.Task10;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task10 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LongConst=1, Const=2, Num=3, Indif=4, Other=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LongConst", "Const", "Num", "Indif", "Other"
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
			null, "LongConst", "Const", "Num", "Indif", "Other"
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


	public Task10(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task10.g4"; }

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
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return LongConst_sempred((RuleContext)_localctx, predIndex);
		case 1:
			return Const_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean LongConst_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getText().length() <= 10;
		case 1:
			return getText().length() <= 11;
		}
		return true;
	}
	private boolean Const_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return getText().length() <= 4;
		case 3:
			return getText().length() <= 5;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7@\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\2\5\2!\n\2\3\3\6\3$"+
		"\n\3\r\3\16\3%\3\3\3\3\3\3\6\3+\n\3\r\3\16\3,\3\3\5\3\60\n\3\3\4\6\4\63"+
		"\n\4\r\4\16\4\64\3\5\6\58\n\5\r\5\16\59\3\6\6\6=\n\6\r\6\16\6>\2\2\7\3"+
		"\3\5\4\7\5\t\6\13\7\3\2\6\3\2\62;\4\2--//\4\2C\\c|\5\2\62;C\\c|\2H\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3 \3\2\2\2\5"+
		"/\3\2\2\2\7\62\3\2\2\2\t\67\3\2\2\2\13<\3\2\2\2\r\16\7N\2\2\16\17\7%\2"+
		"\2\17\21\3\2\2\2\20\22\t\2\2\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2"+
		"\2\23\24\3\2\2\2\24\25\3\2\2\2\25!\6\2\2\2\26\27\7N\2\2\27\30\7%\2\2\30"+
		"\31\3\2\2\2\31\33\t\3\2\2\32\34\t\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35"+
		"\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37!\6\2\3\2 \r\3\2\2\2 \26\3\2"+
		"\2\2!\4\3\2\2\2\"$\t\2\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'"+
		"\3\2\2\2\'\60\6\3\4\2(*\t\3\2\2)+\t\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2"+
		"\2,-\3\2\2\2-.\3\2\2\2.\60\6\3\5\2/#\3\2\2\2/(\3\2\2\2\60\6\3\2\2\2\61"+
		"\63\t\2\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\b\3\2\2\2\668\t\4\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:"+
		"\n\3\2\2\2;=\n\5\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\f\3\2\2"+
		"\2\f\2\23\35 %,/\649>\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}