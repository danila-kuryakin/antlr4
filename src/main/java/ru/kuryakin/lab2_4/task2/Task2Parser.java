// Generated from D:/DProject/src/main/java/ru/kuryakin/ru.kuryakin.lab2_4/task2\Example1_2.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, Value=6;
	public static final int
		RULE_init = 0, RULE_list = 1, RULE_ext = 2, RULE_coord = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "list", "ext", "coord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WS", "Value"
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
	public String getGrammarFileName() { return "Example1_2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Task2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		return init(0);
	}

	private InitContext init(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitContext _localctx = new InitContext(_ctx, _parentState);
		InitContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_init, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(9);
			list();
			}
			_ctx.stop = _input.LT(-1);
			setState(16);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_init);
					setState(11);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(12);
					match(T__0);
					setState(13);
					list();
					}
					} 
				}
				setState(18);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public ExtContext ext() {
			return getRuleContext(ExtContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__1);
			{System.out.printf("(");}
			setState(21);
			ext();
			setState(22);
			match(T__2);
			System.out.printf(")");
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

	public static class ExtContext extends ParserRuleContext {
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public ExtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ext; }
	}

	public final ExtContext ext() throws RecognitionException {
		ExtContext _localctx = new ExtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ext);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				coord();
				System.out.printf(", 0, 0");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				coord();
				System.out.printf(", ");
				setState(30);
				match(T__3);
				setState(31);
				coord();
				System.out.printf(", 0");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				coord();
				System.out.printf(", ");
				setState(36);
				match(T__3);
				setState(37);
				coord();
				System.out.printf(", ");
				setState(39);
				match(T__3);
				setState(40);
				coord();
				}
				break;
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

	public static class CoordContext extends ParserRuleContext {
		public Token Value;
		public TerminalNode Value() { return getToken(Task2Parser.Value, 0); }
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_coord);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				System.out.printf("0");
				}
				break;
			case Value:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				((CoordContext)_localctx).Value = match(Value);
				System.out.printf("%s", (((CoordContext)_localctx).Value!=null?((CoordContext)_localctx).Value.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			return init_sempred((InitContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean init_sempred(InitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\5\5\62\n\5\3\5\2\3\2\6\2"+
		"\4\6\b\2\2\2\63\2\n\3\2\2\2\4\25\3\2\2\2\6,\3\2\2\2\b\61\3\2\2\2\n\13"+
		"\b\2\1\2\13\f\5\4\3\2\f\22\3\2\2\2\r\16\f\3\2\2\16\17\7\3\2\2\17\21\5"+
		"\4\3\2\20\r\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3\3\2"+
		"\2\2\24\22\3\2\2\2\25\26\7\4\2\2\26\27\b\3\1\2\27\30\5\6\4\2\30\31\7\5"+
		"\2\2\31\32\b\3\1\2\32\5\3\2\2\2\33\34\5\b\5\2\34\35\b\4\1\2\35-\3\2\2"+
		"\2\36\37\5\b\5\2\37 \b\4\1\2 !\7\6\2\2!\"\5\b\5\2\"#\b\4\1\2#-\3\2\2\2"+
		"$%\5\b\5\2%&\b\4\1\2&\'\7\6\2\2\'(\5\b\5\2()\b\4\1\2)*\7\6\2\2*+\5\b\5"+
		"\2+-\3\2\2\2,\33\3\2\2\2,\36\3\2\2\2,$\3\2\2\2-\7\3\2\2\2.\62\b\5\1\2"+
		"/\60\7\b\2\2\60\62\b\5\1\2\61.\3\2\2\2\61/\3\2\2\2\62\t\3\2\2\2\5\22,"+
		"\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}