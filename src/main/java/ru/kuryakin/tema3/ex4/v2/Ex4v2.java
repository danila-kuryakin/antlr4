// Generated from D:/DProject/src/main/java/ru/kuryakin/tema3/ex4/v2\Ex4v2.g4 by ANTLR 4.8
package ru.kuryakin.tema3.ex4.v2;

import java.util.Scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Ex4v2 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Liter=1, Other=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Liter", "Other"
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
			null, "Liter", "Other"
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


	    public static void main(String[] args) {
	        Token token;
	        Ex4v2 lexer;
	        Scanner in;
	        String s = "";
	        while (true) {
	            in = new Scanner(System.in);
	            while (true) {
	                if (!in.hasNextLine())
	                    return;
	                s = in.nextLine();

	                lexer = new Ex4v2(CharStreams.fromString(s));
	                while (true) {
	                    token = lexer.nextToken();
	                    if (token.getText().equals("<EOF>"))
	                        break;
	                }
	            }
	        }
	    }


	public Ex4v2(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ex4v2.g4"; }

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
			Liter_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Liter_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println(getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\4\31\b\1\4\2\t\2"+
		"\4\3\t\3\3\2\6\2\t\n\2\r\2\16\2\n\3\2\6\2\16\n\2\r\2\16\2\17\5\2\22\n"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\2\2\4\3\3\5\4\3\2\4\4\2C\\c|\3\2\62;\2\33\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\3\21\3\2\2\2\5\25\3\2\2\2\7\t\t\2\2\2\b\7\3\2\2"+
		"\2\t\n\3\2\2\2\n\b\3\2\2\2\n\13\3\2\2\2\13\22\3\2\2\2\f\16\t\3\2\2\r\f"+
		"\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\b\3"+
		"\2\2\2\21\r\3\2\2\2\22\23\3\2\2\2\23\24\b\2\2\2\24\4\3\2\2\2\25\26\13"+
		"\2\2\2\26\27\3\2\2\2\27\30\b\3\3\2\30\6\3\2\2\2\6\2\n\17\21\4\3\2\2\b"+
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