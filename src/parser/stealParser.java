package parser;

// Generated from steal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class stealParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, BYTE=28, FIELD=29, DIGIT=30, ALPHANUM=31;
	public static final int
		RULE_exp = 0, RULE_val = 1, RULE_integerz = 2, RULE_op = 3, RULE_comma = 4;
	public static final String[] ruleNames = {
		"exp", "val", "integerz", "op", "comma"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'not ('", "'tx('", "').'", "'txlen'", "'txid('", 
		"'txpos'", "'arg('", "'arglen'", "'H('", "'versig('", "'byte base64 '", 
		"'int '", "'addr '", "' + '", "' \u2212 '", "' < '", "' \u2264 '", "' = '", 
		"' \u2265 '", "' > '", "' \u2217 '", "' / '", "' % '", "' and '", "' or '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BYTE", "FIELD", "DIGIT", "ALPHANUM"
	};
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
	public String getGrammarFileName() { return "steal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public stealParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public IntegerzContext integerz() {
			return getRuleContext(IntegerzContext.class,0);
		}
		public TerminalNode FIELD() { return getToken(stealParser.FIELD, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stealListener ) ((stealListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stealListener ) ((stealListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exp);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				val();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(T__0);
				setState(12);
				exp();
				setState(13);
				comma();
				setState(14);
				op();
				setState(15);
				exp();
				setState(16);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(T__2);
				setState(19);
				exp();
				setState(20);
				match(T__1);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				match(T__3);
				setState(23);
				integerz();
				setState(24);
				match(T__4);
				setState(25);
				match(FIELD);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(28);
				match(T__6);
				setState(29);
				integerz();
				setState(30);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(32);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(33);
				match(T__8);
				setState(34);
				integerz();
				setState(35);
				match(T__1);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 9);
				{
				setState(37);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 10);
				{
				setState(38);
				match(T__10);
				setState(39);
				exp();
				setState(40);
				match(T__1);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 11);
				{
				setState(42);
				match(T__11);
				setState(43);
				exp();
				setState(44);
				comma();
				setState(45);
				exp();
				setState(46);
				comma();
				setState(47);
				exp();
				setState(48);
				match(T__1);
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(stealParser.BYTE, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stealListener ) ((stealListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stealListener ) ((stealListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_val);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__12);
				setState(53);
				match(BYTE);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__13);
				setState(55);
				match(BYTE);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T__14);
				setState(57);
				match(BYTE);
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

	public static class IntegerzContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(stealParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(stealParser.DIGIT, i);
		}
		public IntegerzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stealListener ) ((stealListener)listener).enterIntegerz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stealListener ) ((stealListener)listener).exitIntegerz(this);
		}
	}

	public final IntegerzContext integerz() throws RecognitionException {
		IntegerzContext _localctx = new IntegerzContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integerz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				match(DIGIT);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stealListener ) ((stealListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stealListener ) ((stealListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CommaContext extends ParserRuleContext {
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stealListener ) ((stealListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stealListener ) ((stealListener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!H\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\65\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3=\n\3\3\4\6\4@\n\4\r\4\16\4A\3\5\3\5\3\6\3\6\3\6\2\2\7\2"+
		"\4\6\b\n\2\3\3\2\22\35\2O\2\64\3\2\2\2\4<\3\2\2\2\6?\3\2\2\2\bC\3\2\2"+
		"\2\nE\3\2\2\2\f\65\5\4\3\2\r\16\7\3\2\2\16\17\5\2\2\2\17\20\5\n\6\2\20"+
		"\21\5\b\5\2\21\22\5\2\2\2\22\23\7\4\2\2\23\65\3\2\2\2\24\25\7\5\2\2\25"+
		"\26\5\2\2\2\26\27\7\4\2\2\27\65\3\2\2\2\30\31\7\6\2\2\31\32\5\6\4\2\32"+
		"\33\7\7\2\2\33\34\7\37\2\2\34\65\3\2\2\2\35\65\7\b\2\2\36\37\7\t\2\2\37"+
		" \5\6\4\2 !\7\4\2\2!\65\3\2\2\2\"\65\7\n\2\2#$\7\13\2\2$%\5\6\4\2%&\7"+
		"\4\2\2&\65\3\2\2\2\'\65\7\f\2\2()\7\r\2\2)*\5\2\2\2*+\7\4\2\2+\65\3\2"+
		"\2\2,-\7\16\2\2-.\5\2\2\2./\5\n\6\2/\60\5\2\2\2\60\61\5\n\6\2\61\62\5"+
		"\2\2\2\62\63\7\4\2\2\63\65\3\2\2\2\64\f\3\2\2\2\64\r\3\2\2\2\64\24\3\2"+
		"\2\2\64\30\3\2\2\2\64\35\3\2\2\2\64\36\3\2\2\2\64\"\3\2\2\2\64#\3\2\2"+
		"\2\64\'\3\2\2\2\64(\3\2\2\2\64,\3\2\2\2\65\3\3\2\2\2\66\67\7\17\2\2\67"+
		"=\7\36\2\289\7\20\2\29=\7\36\2\2:;\7\21\2\2;=\7\36\2\2<\66\3\2\2\2<8\3"+
		"\2\2\2<:\3\2\2\2=\5\3\2\2\2>@\7 \2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2B\7\3\2\2\2CD\t\2\2\2D\t\3\2\2\2EF\3\2\2\2F\13\3\2\2\2\5\64<A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}