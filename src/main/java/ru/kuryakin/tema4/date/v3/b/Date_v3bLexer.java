// Generated from D:/DProject/src/main/java/ru/kuryakin/tema4/date/v3/b\Date_v3b.g4 by ANTLR 4.8
package ru.kuryakin.tema4.date.v3.b;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Date_v3bLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Number=2, Jan=3, Feb=4, Mar=5, Apr=6, May=7, Jun=8, Jul=9, Aug=10, 
		Sep=11, Oct=12, Nov=13, Dec=14, WS=15, Other=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Number", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", 
			"Sep", "Oct", "Nov", "Dec", "WS", "Other"
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
			"Aug", "Sep", "Oct", "Nov", "Dec", "WS", "Other"
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


	public Date_v3bLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Date_v3b.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22e\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\6\3\'\n\3\r\3\16\3(\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\6\20\\\n\20\r\20\16\20]\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22\3\2\4\3\2\62;\5\2\13\f\17\17\"\"\2f\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5&\3"+
		"\2\2\2\7*\3\2\2\2\t.\3\2\2\2\13\62\3\2\2\2\r\66\3\2\2\2\17:\3\2\2\2\21"+
		">\3\2\2\2\23B\3\2\2\2\25F\3\2\2\2\27J\3\2\2\2\31N\3\2\2\2\33R\3\2\2\2"+
		"\35V\3\2\2\2\37[\3\2\2\2!a\3\2\2\2#$\7.\2\2$\4\3\2\2\2%\'\t\2\2\2&%\3"+
		"\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\6\3\2\2\2*+\7l\2\2+,\7c\2\2,-\7"+
		"p\2\2-\b\3\2\2\2./\7h\2\2/\60\7g\2\2\60\61\7d\2\2\61\n\3\2\2\2\62\63\7"+
		"o\2\2\63\64\7c\2\2\64\65\7t\2\2\65\f\3\2\2\2\66\67\7c\2\2\678\7r\2\28"+
		"9\7t\2\29\16\3\2\2\2:;\7o\2\2;<\7c\2\2<=\7{\2\2=\20\3\2\2\2>?\7l\2\2?"+
		"@\7w\2\2@A\7p\2\2A\22\3\2\2\2BC\7l\2\2CD\7w\2\2DE\7n\2\2E\24\3\2\2\2F"+
		"G\7c\2\2GH\7w\2\2HI\7i\2\2I\26\3\2\2\2JK\7u\2\2KL\7g\2\2LM\7r\2\2M\30"+
		"\3\2\2\2NO\7q\2\2OP\7e\2\2PQ\7v\2\2Q\32\3\2\2\2RS\7p\2\2ST\7q\2\2TU\7"+
		"x\2\2U\34\3\2\2\2VW\7f\2\2WX\7g\2\2XY\7e\2\2Y\36\3\2\2\2Z\\\t\3\2\2[Z"+
		"\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\20\2\2` \3\2\2\2"+
		"ab\13\2\2\2bc\3\2\2\2cd\b\21\2\2d\"\3\2\2\2\5\2(]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}