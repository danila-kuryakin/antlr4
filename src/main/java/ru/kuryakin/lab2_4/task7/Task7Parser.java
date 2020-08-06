// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task7\Task7.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task7;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task7Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Sing=6, Number=7, WS=8;
	public static final int
		RULE_start = 0, RULE_list = 1, RULE_element = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "list", "element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'N'", "'G'", "'X'", "'Y'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "Sing", "Number", "WS"
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
	public String getGrammarFileName() { return "Task7.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Task7Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntermediateContext extends StartContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IntermediateContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).enterIntermediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).exitIntermediate(this);
		}
	}
	public static class EndContext extends StartContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public EndContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).exitEnd(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		return start(0);
	}

	private StartContext start(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StartContext _localctx = new StartContext(_ctx, _parentState);
		StartContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_start, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(7);
			list(0);
			setState(8);
			match(T__0);
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
					_localctx = new IntermediateContext(new StartContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_start);
					setState(10);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(11);
					list(0);
					setState(12);
					match(T__0);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).exitList(this);
		}
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
			setState(20);
			element();
			}
			_ctx.stop = _input.LT(-1);
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_list);
					setState(22);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(23);
					element();
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class YCoordContext extends ElementContext {
		public Token singY;
		public Token numY;
		public TerminalNode Number() { return getToken(Task7Parser.Number, 0); }
		public TerminalNode Sing() { return getToken(Task7Parser.Sing, 0); }
		public YCoordContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).enterYCoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).exitYCoord(this);
		}
	}
	public static class XCoordContext extends ElementContext {
		public Token singX;
		public Token numX;
		public TerminalNode Number() { return getToken(Task7Parser.Number, 0); }
		public TerminalNode Sing() { return getToken(Task7Parser.Sing, 0); }
		public XCoordContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).enterXCoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).exitXCoord(this);
		}
	}
	public static class FunctionContext extends ElementContext {
		public Token numFunction;
		public TerminalNode Number() { return getToken(Task7Parser.Number, 0); }
		public FunctionContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).exitFunction(this);
		}
	}
	public static class FrameContext extends ElementContext {
		public Token numFrame;
		public TerminalNode Number() { return getToken(Task7Parser.Number, 0); }
		public FrameContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).enterFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task7Listener ) ((Task7Listener)listener).exitFrame(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new FrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__1);
				setState(30);
				((FrameContext)_localctx).numFrame = match(Number);
				}
				break;
			case T__2:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__2);
				setState(32);
				((FunctionContext)_localctx).numFunction = match(Number);
				}
				break;
			case T__3:
				_localctx = new XCoordContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(T__3);
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Sing) {
					{
					setState(34);
					((XCoordContext)_localctx).singX = match(Sing);
					}
				}

				setState(37);
				((XCoordContext)_localctx).numX = match(Number);
				}
				break;
			case T__4:
				_localctx = new YCoordContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(T__4);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Sing) {
					{
					setState(39);
					((YCoordContext)_localctx).singY = match(Sing);
					}
				}

				setState(42);
				((YCoordContext)_localctx).numY = match(Number);
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
			return start_sempred((StartContext)_localctx, predIndex);
		case 1:
			return list_sempred((ListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean start_sempred(StartContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean list_sempred(ListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4&\n\4\3\4\3\4\3\4\5\4+\n\4\3\4\5\4.\n\4\3\4\2\4\2\4\5\2\4\6\2"+
		"\2\2\63\2\b\3\2\2\2\4\25\3\2\2\2\6-\3\2\2\2\b\t\b\2\1\2\t\n\5\4\3\2\n"+
		"\13\7\3\2\2\13\22\3\2\2\2\f\r\f\3\2\2\r\16\5\4\3\2\16\17\7\3\2\2\17\21"+
		"\3\2\2\2\20\f\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3\3"+
		"\2\2\2\24\22\3\2\2\2\25\26\b\3\1\2\26\27\5\6\4\2\27\34\3\2\2\2\30\31\f"+
		"\3\2\2\31\33\5\6\4\2\32\30\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3"+
		"\2\2\2\35\5\3\2\2\2\36\34\3\2\2\2\37 \7\4\2\2 .\7\t\2\2!\"\7\5\2\2\"."+
		"\7\t\2\2#%\7\6\2\2$&\7\b\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'.\7\t\2\2"+
		"(*\7\7\2\2)+\7\b\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,.\7\t\2\2-\37\3\2\2"+
		"\2-!\3\2\2\2-#\3\2\2\2-(\3\2\2\2.\7\3\2\2\2\7\22\34%*-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}