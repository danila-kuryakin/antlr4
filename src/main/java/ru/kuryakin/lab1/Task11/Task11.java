// Generated from D:/DProject/src/main/java/ru/kuryakin/lab1/Task11\Task11.g4 by ANTLR 4.8
package ru.kuryakin.lab1.Task11;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task11 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BConst=1, WConst=2, DWConst=3, Num=4, Indif=5, Other=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BConst", "WConst", "DWConst", "Num", "Indif", "Other"
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
			null, "BConst", "WConst", "DWConst", "Num", "Indif", "Other"
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


	public Task11(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task11.g4"; }

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
		case 1:
			return WConst_sempred((RuleContext)_localctx, predIndex);
		case 2:
			return DWConst_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean WConst_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getText().length()<=9;
		}
		return true;
	}
	private boolean DWConst_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return getText().length()<=14;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bB\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\6\4.\n\4\r\4\16\4/\3\4\3\4\3\5\6\5\65\n\5\r\5\16"+
		"\5\66\3\6\6\6:\n\6\r\6\16\6;\3\7\6\7?\n\7\r\7\16\7@\2\2\b\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\3\2\6\5\2\62;CHch\3\2\62;\4\2C\\c|\5\2\62;C\\c|\2F\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3"+
		"\17\3\2\2\2\5\30\3\2\2\2\7%\3\2\2\2\t\64\3\2\2\2\139\3\2\2\2\r>\3\2\2"+
		"\2\17\20\7D\2\2\20\21\7%\2\2\21\22\7\63\2\2\22\23\78\2\2\23\24\7%\2\2"+
		"\24\25\3\2\2\2\25\26\t\2\2\2\26\27\t\2\2\2\27\4\3\2\2\2\30\31\7Y\2\2\31"+
		"\32\7%\2\2\32\33\7\63\2\2\33\34\78\2\2\34\35\7%\2\2\35\37\3\2\2\2\36 "+
		"\t\2\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\6"+
		"\3\2\2$\6\3\2\2\2%&\7F\2\2&\'\7Y\2\2\'(\7%\2\2()\7\63\2\2)*\78\2\2*+\7"+
		"%\2\2+-\3\2\2\2,.\t\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\61\3\2\2\2\61\62\6\4\3\2\62\b\3\2\2\2\63\65\t\3\2\2\64\63\3\2\2\2\65"+
		"\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\n\3\2\2\28:\t\4\2\298\3\2\2"+
		"\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\f\3\2\2\2=?\n\5\2\2>=\3\2\2\2?@\3\2"+
		"\2\2@>\3\2\2\2@A\3\2\2\2A\16\3\2\2\2\b\2!/\66;@\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}