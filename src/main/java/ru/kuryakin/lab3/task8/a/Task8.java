// Generated from D:/DProject/src/main/java/ru/kuryakin/lab3/task8\Task8.g4 by ANTLR 4.8
package ru.kuryakin.lab3.task8.a;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task8 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comparison=1, Const=2, Other=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Comparison", "Const", "Other"
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
			null, "Comparison", "Const", "Other"
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


	public Task8(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task8.g4"; }

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
			Comparison_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			Const_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Comparison_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println(getText());
			break;
		}
	}
	private void Const_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println(getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5-\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\21\n\2\3\2\3\2\3\2\3\3"+
		"\5\3\27\n\3\3\3\6\3\32\n\3\r\3\16\3\33\5\3\36\n\3\3\3\3\3\6\3\"\n\3\r"+
		"\3\16\3#\5\3&\n\3\3\3\3\3\3\4\3\4\3\4\3\4\2\2\5\3\3\5\4\7\5\3\2\6\4\2"+
		"IINN\4\2GGVV\4\2--//\3\2\62;\2\63\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\3\t\3\2\2\2\5\26\3\2\2\2\7)\3\2\2\2\t\20\7\60\2\2\n\13\t\2\2\2\13\21"+
		"\t\3\2\2\f\r\7G\2\2\r\21\7S\2\2\16\17\7P\2\2\17\21\7G\2\2\20\n\3\2\2\2"+
		"\20\f\3\2\2\2\20\16\3\2\2\2\21\22\3\2\2\2\22\23\7\60\2\2\23\24\b\2\2\2"+
		"\24\4\3\2\2\2\25\27\t\4\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27\35\3\2\2\2"+
		"\30\32\t\5\2\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2"+
		"\34\36\3\2\2\2\35\31\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37%\7\60\2\2"+
		" \"\t\5\2\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%!\3\2\2"+
		"\2%&\3\2\2\2&\'\3\2\2\2\'(\b\3\3\2(\6\3\2\2\2)*\13\2\2\2*+\3\2\2\2+,\b"+
		"\4\4\2,\b\3\2\2\2\t\2\20\26\33\35#%\5\3\2\2\3\3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}