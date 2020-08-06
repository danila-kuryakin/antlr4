// Generated from D:/DProject/src/main/java/ru/kuryakin/tema3/ex7\Ex7.g4 by ANTLR 4.8
package ru.kuryakin.tema3.ex7;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Ex7 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Hex=1, Ident=2, Decimal=3, Comment=4, Other=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Hex", "Ident", "Decimal", "Comment", "Other", "D", "H", "L"
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
			null, "Hex", "Ident", "Decimal", "Comment", "Other"
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


	public Ex7(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ex7.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7I\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\5\2\33\n\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2"+
		"\3\2\5\2&\n\2\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\6\4\61\n\4\r\4\16"+
		"\4\62\3\5\3\5\3\5\3\5\6\59\n\5\r\5\16\5:\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3:\2\n\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\2\3\2\6"+
		"\4\2JJjj\3\2\62;\5\2\62;CHch\5\2C\\aac|\2M\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7\60\3\2\2\2"+
		"\t\64\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23\25\7\62"+
		"\2\2\24\26\5\17\b\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3"+
		"\2\2\2\30\32\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33&\3\2"+
		"\2\2\34 \5\r\7\2\35\37\5\17\b\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2"+
		" !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\t\2\2\2$&\3\2\2\2%\23\3\2\2\2%\34\3"+
		"\2\2\2&\4\3\2\2\2\',\5\21\t\2(+\5\21\t\2)+\5\r\7\2*(\3\2\2\2*)\3\2\2\2"+
		"+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\6\3\2\2\2.,\3\2\2\2/\61\5\r\7\2\60/\3"+
		"\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\b\3\2\2\2\64\65\7"+
		"\61\2\2\65\66\7,\2\2\668\3\2\2\2\679\13\2\2\28\67\3\2\2\29:\3\2\2\2:;"+
		"\3\2\2\2:8\3\2\2\2;<\3\2\2\2<=\7,\2\2=>\7\61\2\2>?\3\2\2\2?@\b\5\2\2@"+
		"\n\3\2\2\2AB\13\2\2\2B\f\3\2\2\2CD\t\3\2\2D\16\3\2\2\2EF\t\4\2\2F\20\3"+
		"\2\2\2GH\t\5\2\2H\22\3\2\2\2\13\2\27\32 %*,\62:\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}