// Generated from D:/DProject/src/main/java/ru/kuryakin/ru.kuryakin.lab1/task7/v2\Task7v2.g4 by ANTLR 4.8
package ru.kuryakin.lab1.task7.v2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task7v2 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT_TEXT=1, CLOSE=2, COMMENT_OPEN=3;
	public static final int
		COMMENT=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT_OPEN", "COMMENT_TEXT", "CLOSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'*)'", "'(*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT_TEXT", "CLOSE", "COMMENT_OPEN"
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


	static Token token;
	static Task7v2 lexer;
	public static void main(String[] args) {
	    String string = "(* 16#abcdff55555 8#1546*) \n" +
	        " 16#fdcbaa(*777*) 2#10(**)001*00";
	    lexer = new Task7v2(CharStreams.fromString(string));
	    while (true){
	        token = lexer.nextToken();
	        if (token.getText() == "<EOF>")
	            break;
	        System.out.printf("Token name: %s, text: %s, lengh: %s\n",
	            lexer.getRuleNames()[token.getType()-1], token.getText(), token.getText().length());
	    }
	}


	public Task7v2(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task7v2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5\33\b\1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\22\n\3\f\3\16\3\25"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\23\2\5\4\5\6\3\b\4\4\2\3\2\2\32\2\4\3\2\2"+
		"\2\3\6\3\2\2\2\3\b\3\2\2\2\4\n\3\2\2\2\6\23\3\2\2\2\b\26\3\2\2\2\n\13"+
		"\7*\2\2\13\f\7,\2\2\f\r\3\2\2\2\r\16\b\2\2\2\16\17\b\2\3\2\17\5\3\2\2"+
		"\2\20\22\13\2\2\2\21\20\3\2\2\2\22\25\3\2\2\2\23\24\3\2\2\2\23\21\3\2"+
		"\2\2\24\7\3\2\2\2\25\23\3\2\2\2\26\27\7,\2\2\27\30\7+\2\2\30\31\3\2\2"+
		"\2\31\32\b\4\4\2\32\t\3\2\2\2\5\2\3\23\5\5\2\2\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}