// Generated from D:/DProject/src/main/java/ru/kuryakin/ru.kuryakin.lab3/Task1\Task1.g4 by ANTLR 4.8
package ru.kuryakin.Task1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1;
	public static final int
		RULE_long_num = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"long_num"
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
			null, "NUM"
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

	@Override
	public String getGrammarFileName() { return "Task1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Task1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Long_numContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(Task1Parser.NUM, 0); }
		public Long_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long_num; }
	}

	public final Long_numContext long_num() throws RecognitionException {
		Long_numContext _localctx = new Long_numContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_long_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			if (!(((Long_numContext)_localctx).NUM.getText().length() == 4)) throw new FailedPredicateException(this, "$NUM.getText().length() == 4");
			setState(3);
			((Long_numContext)_localctx).NUM = match(NUM);
			System.out.println(((Long_numContext)_localctx).NUM.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return long_num_sempred((Long_numContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean long_num_sempred(Long_numContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return ((Long_numContext)_localctx).NUM.getText().length() == 4;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\3\t\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\2\2\3\2\2\2\2\7\2\4\3\2\2\2\4\5\6\2\2\3\5\6\7\3\2\2\6\7"+
		"\b\2\1\2\7\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}