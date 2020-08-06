// Generated from D:/DProject/src/main/java/ru/kuryakin/lab3/task7\Task7.g4 by ANTLR 4.8
package ru.kuryakin.lab3.task7;
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
		R1=1, R2=2, R3=3, R4=4, Other=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"R1", "R2", "R3", "R4", "Other"
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
			null, "R1", "R2", "R3", "R4", "Other"
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
	public String getGrammarFileName() { return "Task7.g4"; }

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
			R1_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			R2_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			R3_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			R4_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void R1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.printf("Регистр общего назначения: %s\n", getText());
			break;
		}
	}
	private void R2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.printf("�?ндексный регистр: %s\n", getText());
			break;
		}
	}
	private void R3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.printf("Указательный регистр: %s\n", getText());
			break;
		}
	}
	private void R4_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.printf("Сегментный регистр: %s\n", getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7%\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\2\2\7\3\3\5\4"+
		"\7\5\t\6\13\7\3\2\7\3\2cf\5\2jjnnzz\4\2ffuu\4\2dduu\4\2eguu\2$\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\22"+
		"\3\2\2\2\7\27\3\2\2\2\t\34\3\2\2\2\13!\3\2\2\2\r\16\t\2\2\2\16\17\t\3"+
		"\2\2\17\20\3\2\2\2\20\21\b\2\2\2\21\4\3\2\2\2\22\23\t\4\2\2\23\24\7k\2"+
		"\2\24\25\3\2\2\2\25\26\b\3\3\2\26\6\3\2\2\2\27\30\t\5\2\2\30\31\7r\2\2"+
		"\31\32\3\2\2\2\32\33\b\4\4\2\33\b\3\2\2\2\34\35\t\6\2\2\35\36\7u\2\2\36"+
		"\37\3\2\2\2\37 \b\5\5\2 \n\3\2\2\2!\"\13\2\2\2\"#\3\2\2\2#$\b\6\6\2$\f"+
		"\3\2\2\2\3\2\7\3\2\2\3\3\3\3\4\4\3\5\5\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}