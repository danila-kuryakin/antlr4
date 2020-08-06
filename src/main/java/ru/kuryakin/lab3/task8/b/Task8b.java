// Generated from D:/DProject/src/main/java/ru/kuryakin/lab3/task8/b\Task8b.g4 by ANTLR 4.8
package ru.kuryakin.lab3.task8.b;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task8b extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GT=1, GE=2, LT=3, LE=4, EQ=5, NE=6, Const=7, Other=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GT", "GE", "LT", "LE", "EQ", "NE", "Const", "Other"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.GT.'", "'.GE.'", "'.LT.'", "'.LE.'", "'.EQ.'", "'.NE.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GT", "GE", "LT", "LE", "EQ", "NE", "Const", "Other"
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


	public Task8b(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task8b.g4"; }

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
			GT_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			GE_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			LT_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			LE_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			EQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			NE_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			Const_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void GT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.print(">");
			break;
		}
	}
	private void GE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.print(">=");
			break;
		}
	}
	private void LT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.print("<");
			break;
		}
	}
	private void LE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.print("<=");
			break;
		}
	}
	private void EQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.print("==");
			break;
		}
	}
	private void NE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.print("<>");
			break;
		}
	}
	private void Const_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.print(getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nU\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\5\b?\n\b\3\b\6\bB\n\b\r\b\16\bC\5\bF\n\b\3\b\3\b\6\b"+
		"J\n\b\r\b\16\bK\5\bN\n\b\3\b\3\b\3\t\3\t\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\3\2\4\4\2--//\3\2\62;\2Y\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\3\23\3\2\2\2\5\32\3\2\2\2\7!\3\2\2\2\t(\3\2\2\2\13/\3\2\2\2\r\66"+
		"\3\2\2\2\17>\3\2\2\2\21Q\3\2\2\2\23\24\7\60\2\2\24\25\7I\2\2\25\26\7V"+
		"\2\2\26\27\7\60\2\2\27\30\3\2\2\2\30\31\b\2\2\2\31\4\3\2\2\2\32\33\7\60"+
		"\2\2\33\34\7I\2\2\34\35\7G\2\2\35\36\7\60\2\2\36\37\3\2\2\2\37 \b\3\3"+
		"\2 \6\3\2\2\2!\"\7\60\2\2\"#\7N\2\2#$\7V\2\2$%\7\60\2\2%&\3\2\2\2&\'\b"+
		"\4\4\2\'\b\3\2\2\2()\7\60\2\2)*\7N\2\2*+\7G\2\2+,\7\60\2\2,-\3\2\2\2-"+
		".\b\5\5\2.\n\3\2\2\2/\60\7\60\2\2\60\61\7G\2\2\61\62\7S\2\2\62\63\7\60"+
		"\2\2\63\64\3\2\2\2\64\65\b\6\6\2\65\f\3\2\2\2\66\67\7\60\2\2\678\7P\2"+
		"\289\7G\2\29:\7\60\2\2:;\3\2\2\2;<\b\7\7\2<\16\3\2\2\2=?\t\2\2\2>=\3\2"+
		"\2\2>?\3\2\2\2?E\3\2\2\2@B\t\3\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2DF\3\2\2\2EA\3\2\2\2EF\3\2\2\2FG\3\2\2\2GM\7\60\2\2HJ\t\3\2\2IH\3"+
		"\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MI\3\2\2\2MN\3\2\2\2NO\3"+
		"\2\2\2OP\b\b\b\2P\20\3\2\2\2QR\13\2\2\2RS\3\2\2\2ST\b\t\t\2T\22\3\2\2"+
		"\2\b\2>CEKM\n\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\b\b\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}