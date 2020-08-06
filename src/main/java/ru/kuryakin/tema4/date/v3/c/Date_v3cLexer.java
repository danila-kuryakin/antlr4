// Generated from D:/DProject/src/main/java/ru/kuryakin/tema4/date/v3/c\Date_v3c.g4 by ANTLR 4.8
package ru.kuryakin.tema4.date.v3.c;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Date_v3cLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Number=2, Jan=3, Feb=4, Mar=5, Apr=6, May=7, Jun=8, Jul=9, Aug=10, 
		Sep=11, Oct=12, Nov=13, Dec=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Number", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", 
			"Sep", "Oct", "Nov", "Dec", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'jan'", "'feb'", "'mar'", "'apr'", "'may'", "'jun'", 
			"'jul'", "'aug'", "'sep'", "'oct'", "'nov'", "'dec'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Number", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", 
			"Aug", "Sep", "Oct", "Nov", "Dec", "WS"
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


	public Date_v3cLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Date_v3c.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\6\3%\n\3"+
		"\r\3\16\3&\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\6\20Z\n\20\r\20\16\20[\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\4\3\2\62"+
		";\5\2\13\f\17\17\"\"\2`\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\3!\3\2\2\2\5$\3\2\2\2\7(\3\2\2\2\t,\3\2\2\2\13\60\3\2\2\2\r\64\3"+
		"\2\2\2\178\3\2\2\2\21<\3\2\2\2\23@\3\2\2\2\25D\3\2\2\2\27H\3\2\2\2\31"+
		"L\3\2\2\2\33P\3\2\2\2\35T\3\2\2\2\37Y\3\2\2\2!\"\7.\2\2\"\4\3\2\2\2#%"+
		"\t\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\6\3\2\2\2()\7l\2\2"+
		")*\7c\2\2*+\7p\2\2+\b\3\2\2\2,-\7h\2\2-.\7g\2\2./\7d\2\2/\n\3\2\2\2\60"+
		"\61\7o\2\2\61\62\7c\2\2\62\63\7t\2\2\63\f\3\2\2\2\64\65\7c\2\2\65\66\7"+
		"r\2\2\66\67\7t\2\2\67\16\3\2\2\289\7o\2\29:\7c\2\2:;\7{\2\2;\20\3\2\2"+
		"\2<=\7l\2\2=>\7w\2\2>?\7p\2\2?\22\3\2\2\2@A\7l\2\2AB\7w\2\2BC\7n\2\2C"+
		"\24\3\2\2\2DE\7c\2\2EF\7w\2\2FG\7i\2\2G\26\3\2\2\2HI\7u\2\2IJ\7g\2\2J"+
		"K\7r\2\2K\30\3\2\2\2LM\7q\2\2MN\7e\2\2NO\7v\2\2O\32\3\2\2\2PQ\7p\2\2Q"+
		"R\7q\2\2RS\7x\2\2S\34\3\2\2\2TU\7f\2\2UV\7g\2\2VW\7e\2\2W\36\3\2\2\2X"+
		"Z\t\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\20\2"+
		"\2^ \3\2\2\2\5\2&[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}