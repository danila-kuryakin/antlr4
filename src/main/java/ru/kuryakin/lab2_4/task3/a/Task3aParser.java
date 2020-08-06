// Generated from D:/DProject/src/main/java/ru/kuryakin/ru.kuryakin.lab2_4/task3/a\Task3a.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task3.a;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task3aParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4, Value=5;
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
			null, "'('", "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS", "Value"
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
	public String getGrammarFileName() { return "Task3a.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int x;
	    private int y;
	    private int num;
	    private int i;
	    private double l;
	    ArrayList<String> coord;

	    public void initCoord(){
	        this.i = 0;
	        this.l = -1;
	    }

	    public void setX(String x) {
	        this.x = Integer.parseInt(x);
	    }

	    public void setY(String y) {
	        this.y = Integer.parseInt(y);
	    }

	    public String get(){
	        return String.format("num: %s, length: %f\n", num, l);
	    }

	    public void compare() {
	        i++;
	        double newL = Math.sqrt((this.x*this.x+this.y*this.y));
	        if(newL > l){
	            this.l = newL;
	            num = i;
	            return;
	        }
	    }

	public Task3aParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			initCoord();
			setState(9);
			list(0);
			System.out.printf(get());
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

	public static class ListContext extends ParserRuleContext {
		public ExtContext ext() {
			return getRuleContext(ExtContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		return list(0);
	}

	private ListContext list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListContext _localctx = new ListContext(_ctx, _parentState);
		ListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(13);
			ext();
			}
			_ctx.stop = _input.LT(-1);
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_list);
					setState(15);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(16);
					ext();
					}
					} 
				}
				setState(21);
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

	public static class ExtContext extends ParserRuleContext {
		public CoordContext coord;
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
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			((ExtContext)_localctx).coord = coord();
			setX((((ExtContext)_localctx).coord!=null?_input.getText(((ExtContext)_localctx).coord.start,((ExtContext)_localctx).coord.stop):null)); 
			setState(25);
			match(T__1);
			setState(26);
			((ExtContext)_localctx).coord = coord();
			setY((((ExtContext)_localctx).coord!=null?_input.getText(((ExtContext)_localctx).coord.start,((ExtContext)_localctx).coord.stop):null)); 
			setState(28);
			match(T__2);
			compare();
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
		public TerminalNode Value() { return getToken(Task3aParser.Value, 0); }
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_coord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(Value);
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
		case 1:
			return list_sempred((ListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean list_sempred(ListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\24\n\3\f\3"+
		"\16\3\27\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\2\3\4\6"+
		"\2\4\6\b\2\2\2 \2\n\3\2\2\2\4\16\3\2\2\2\6\30\3\2\2\2\b!\3\2\2\2\n\13"+
		"\b\2\1\2\13\f\5\4\3\2\f\r\b\2\1\2\r\3\3\2\2\2\16\17\b\3\1\2\17\20\5\6"+
		"\4\2\20\25\3\2\2\2\21\22\f\3\2\2\22\24\5\6\4\2\23\21\3\2\2\2\24\27\3\2"+
		"\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\5\3\2\2\2\27\25\3\2\2\2\30\31\7\3"+
		"\2\2\31\32\5\b\5\2\32\33\b\4\1\2\33\34\7\4\2\2\34\35\5\b\5\2\35\36\b\4"+
		"\1\2\36\37\7\5\2\2\37 \b\4\1\2 \7\3\2\2\2!\"\7\7\2\2\"\t\3\2\2\2\3\25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}