// Generated from parcial.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class parcialParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, PLUS=3, MINUS=4, MUL=5, DIV=6, MOD=7, POT=8, ASSIGN=9, INC=10, 
		LLLAVE=11, RLLAVE=12, CL=13, CR=14, LPAREN=15, RPAREN=16, LT=17, GT=18, 
		NEQ=19, IF=20, ELSE=21, FOR=22, RET=23, DEF=24, MAX=25, VAR_INT=26, VAR_FLOAT=27, 
		VAR_DOUBLE=28, VAR_CHAR=29, VAR_STR=30, VAR_VOID=31, STRUCT=32, COMMENT=33, 
		OUTPUT=34, INPUT=35, COMMA=36, NUMFLOAT=37, ID=38, NUM=39, STRING=40;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_decVar = 2, RULE_expr = 3, 
		RULE_cincoutStatement = 4, RULE_output = 5, RULE_input = 6, RULE_structDeclaration = 7, 
		RULE_structBody = 8, RULE_funcDeclaration = 9, RULE_paramList = 10, RULE_comentario = 11, 
		RULE_funcBody = 12, RULE_for = 13, RULE_forInit = 14, RULE_forCond = 15, 
		RULE_forUpdate = 16, RULE_ifStatement = 17, RULE_corcht = 18, RULE_sumatoria = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "decVar", "expr", "cincoutStatement", "output", 
			"input", "structDeclaration", "structBody", "funcDeclaration", "paramList", 
			"comentario", "funcBody", "for", "forInit", "forCond", "forUpdate", "ifStatement", 
			"corcht", "sumatoria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sumatoria'", null, "'sum'", "'res'", "'mul'", "'div'", "'%'", 
			"'pot'", "'='", "'++'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'<'", 
			"'>'", "'<>'", "'if'", "'else'", "'for'", "'ret'", "'#def'", "'MAX'", 
			"':n'", "':nF'", "':nD'", "':Ch'", "':S'", "':V'", "'estruct'", null, 
			"'->'", "'<-'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POT", "ASSIGN", 
			"INC", "LLLAVE", "RLLAVE", "CL", "CR", "LPAREN", "RPAREN", "LT", "GT", 
			"NEQ", "IF", "ELSE", "FOR", "RET", "DEF", "MAX", "VAR_INT", "VAR_FLOAT", 
			"VAR_DOUBLE", "VAR_CHAR", "VAR_STR", "VAR_VOID", "STRUCT", "COMMENT", 
			"OUTPUT", "INPUT", "COMMA", "NUMFLOAT", "ID", "NUM", "STRING"
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
	public String getGrammarFileName() { return "parcial.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public parcialParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1027509092354L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DecVarContext decVar() {
			return getRuleContext(DecVarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CincoutStatementContext cincoutStatement() {
			return getRuleContext(CincoutStatementContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public SumatoriaContext sumatoria() {
			return getRuleContext(SumatoriaContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				decVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				structDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				funcDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				cincoutStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				comentario();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(53);
				sumatoria();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecVarContext extends ParserRuleContext {
		public TerminalNode VAR_CHAR() { return getToken(parcialParser.VAR_CHAR, 0); }
		public List<TerminalNode> ID() { return getTokens(parcialParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(parcialParser.ID, i);
		}
		public List<CorchtContext> corcht() {
			return getRuleContexts(CorchtContext.class);
		}
		public CorchtContext corcht(int i) {
			return getRuleContext(CorchtContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(parcialParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(parcialParser.ASSIGN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(parcialParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(parcialParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parcialParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parcialParser.COMMA, i);
		}
		public TerminalNode VAR_INT() { return getToken(parcialParser.VAR_INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode VAR_FLOAT() { return getToken(parcialParser.VAR_FLOAT, 0); }
		public TerminalNode VAR_DOUBLE() { return getToken(parcialParser.VAR_DOUBLE, 0); }
		public DecVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterDecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitDecVar(this);
		}
	}

	public final DecVarContext decVar() throws RecognitionException {
		DecVarContext _localctx = new DecVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decVar);
		int _la;
		try {
			int _alt;
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(VAR_CHAR);
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(57);
						match(ID);
						setState(59);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CL) {
							{
							setState(58);
							corcht();
							}
						}

						setState(63);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(61);
							match(ASSIGN);
							setState(62);
							match(STRING);
							}
						}

						setState(66);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(65);
							match(COMMA);
							}
							break;
						}
						}
						} 
					}
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case VAR_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(VAR_INT);
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(74);
						match(ID);
						setState(76);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CL) {
							{
							setState(75);
							corcht();
							}
						}

						setState(80);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(78);
							match(ASSIGN);
							setState(79);
							expr(0);
							}
						}

						setState(83);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(82);
							match(COMMA);
							}
							break;
						}
						}
						} 
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case VAR_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(VAR_FLOAT);
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(91);
						match(ID);
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CL) {
							{
							setState(92);
							corcht();
							}
						}

						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(95);
							match(ASSIGN);
							setState(96);
							expr(0);
							}
						}

						setState(100);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(99);
							match(COMMA);
							}
							break;
						}
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case VAR_DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(VAR_DOUBLE);
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(108);
						match(ID);
						setState(110);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==CL) {
							{
							setState(109);
							corcht();
							}
						}

						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(112);
							match(ASSIGN);
							setState(113);
							expr(0);
							}
						}

						setState(117);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(116);
							match(COMMA);
							}
							break;
						}
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(parcialParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(parcialParser.RPAREN, 0); }
		public TerminalNode NUM() { return getToken(parcialParser.NUM, 0); }
		public TerminalNode NUMFLOAT() { return getToken(parcialParser.NUMFLOAT, 0); }
		public TerminalNode ID() { return getToken(parcialParser.ID, 0); }
		public SumatoriaContext sumatoria() {
			return getRuleContext(SumatoriaContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(parcialParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(parcialParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(parcialParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(parcialParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(parcialParser.MOD, 0); }
		public TerminalNode POT() { return getToken(parcialParser.POT, 0); }
		public TerminalNode LT() { return getToken(parcialParser.LT, 0); }
		public TerminalNode GT() { return getToken(parcialParser.GT, 0); }
		public TerminalNode NEQ() { return getToken(parcialParser.NEQ, 0); }
		public TerminalNode ASSIGN() { return getToken(parcialParser.ASSIGN, 0); }
		public TerminalNode INC() { return getToken(parcialParser.INC, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(127);
				match(LPAREN);
				setState(128);
				expr(0);
				setState(129);
				match(RPAREN);
				}
				break;
			case NUM:
				{
				setState(131);
				match(NUM);
				}
				break;
			case NUMFLOAT:
				{
				setState(132);
				match(NUMFLOAT);
				}
				break;
			case ID:
				{
				setState(133);
				match(ID);
				}
				break;
			case T__0:
				{
				setState(134);
				sumatoria();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(138);
						match(PLUS);
						setState(139);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(141);
						match(MINUS);
						setState(142);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(144);
						match(MUL);
						setState(145);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(147);
						match(DIV);
						setState(148);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(150);
						match(MOD);
						setState(151);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(153);
						match(POT);
						setState(154);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(156);
						match(LT);
						setState(157);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(159);
						match(GT);
						setState(160);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(162);
						match(NEQ);
						setState(163);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(165);
						match(ASSIGN);
						setState(166);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(168);
						match(INC);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CincoutStatementContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(parcialParser.OUTPUT, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(parcialParser.INPUT, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public CincoutStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cincoutStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterCincoutStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitCincoutStatement(this);
		}
	}

	public final CincoutStatementContext cincoutStatement() throws RecognitionException {
		CincoutStatementContext _localctx = new CincoutStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cincoutStatement);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(OUTPUT);
				setState(175);
				output();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(INPUT);
				setState(177);
				input();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(parcialParser.STRING, 0); }
		public TerminalNode ID() { return getToken(parcialParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_output);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(parcialParser.ID, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(parcialParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(parcialParser.ID, 0); }
		public TerminalNode LLLAVE() { return getToken(parcialParser.LLLAVE, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode RLLAVE() { return getToken(parcialParser.RLLAVE, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(STRUCT);
			setState(188);
			match(ID);
			setState(189);
			match(LLLAVE);
			setState(190);
			structBody();
			setState(191);
			match(RLLAVE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructBodyContext extends ParserRuleContext {
		public List<DecVarContext> decVar() {
			return getRuleContexts(DecVarContext.class);
		}
		public DecVarContext decVar(int i) {
			return getRuleContext(DecVarContext.class,i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitStructBody(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				decVar();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR_INT() { return getToken(parcialParser.VAR_INT, 0); }
		public TerminalNode ID() { return getToken(parcialParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(parcialParser.LPAREN, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(parcialParser.RPAREN, 0); }
		public TerminalNode LLLAVE() { return getToken(parcialParser.LLLAVE, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public TerminalNode RLLAVE() { return getToken(parcialParser.RLLAVE, 0); }
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterFuncDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitFuncDeclaration(this);
		}
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(VAR_INT);
			setState(199);
			match(ID);
			setState(200);
			match(LPAREN);
			setState(201);
			paramList();
			setState(202);
			match(RPAREN);
			setState(203);
			match(LLLAVE);
			setState(204);
			funcBody();
			setState(205);
			match(RLLAVE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> VAR_INT() { return getTokens(parcialParser.VAR_INT); }
		public TerminalNode VAR_INT(int i) {
			return getToken(parcialParser.VAR_INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(parcialParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(parcialParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parcialParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parcialParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(VAR_INT);
			setState(208);
			match(ID);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(209);
				match(COMMA);
				setState(210);
				match(VAR_INT);
				setState(211);
				match(ID);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(parcialParser.COMMENT, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(COMMENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncBodyContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(parcialParser.RET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitFuncBody(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1027509092354L) != 0)) {
				{
				{
				setState(219);
				statement();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(RET);
			setState(226);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(parcialParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(parcialParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(parcialParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parcialParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(parcialParser.RPAREN, 0); }
		public TerminalNode LLLAVE() { return getToken(parcialParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(parcialParser.RLLAVE, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForCondContext forCond() {
			return getRuleContext(ForCondContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(FOR);
			setState(229);
			match(LPAREN);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 963079340034L) != 0)) {
				{
				setState(230);
				forInit();
				}
			}

			setState(233);
			match(COMMA);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072707074L) != 0)) {
				{
				setState(234);
				forCond();
				}
			}

			setState(237);
			match(COMMA);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072707074L) != 0)) {
				{
				setState(238);
				forUpdate();
				}
			}

			setState(241);
			match(RPAREN);
			setState(242);
			match(LLLAVE);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				statement();
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1027509092354L) != 0) );
			setState(248);
			match(RLLAVE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public DecVarContext decVar() {
			return getRuleContext(DecVarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forInit);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_INT:
			case VAR_FLOAT:
			case VAR_DOUBLE:
			case VAR_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				decVar();
				}
				break;
			case T__0:
			case LPAREN:
			case NUMFLOAT:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForCondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterForCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitForCond(this);
		}
	}

	public final ForCondContext forCond() throws RecognitionException {
		ForCondContext _localctx = new ForCondContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(parcialParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(parcialParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(parcialParser.RPAREN, 0); }
		public List<TerminalNode> LLLAVE() { return getTokens(parcialParser.LLLAVE); }
		public TerminalNode LLLAVE(int i) {
			return getToken(parcialParser.LLLAVE, i);
		}
		public List<TerminalNode> RLLAVE() { return getTokens(parcialParser.RLLAVE); }
		public TerminalNode RLLAVE(int i) {
			return getToken(parcialParser.RLLAVE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(parcialParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IF);
			setState(259);
			match(LPAREN);
			setState(260);
			expr(0);
			setState(261);
			match(RPAREN);
			setState(262);
			match(LLLAVE);
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				statement();
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1027509092354L) != 0) );
			setState(268);
			match(RLLAVE);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(269);
				match(ELSE);
				setState(270);
				match(LLLAVE);
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(271);
					statement();
					}
					}
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1027509092354L) != 0) );
				setState(276);
				match(RLLAVE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CorchtContext extends ParserRuleContext {
		public TerminalNode CL() { return getToken(parcialParser.CL, 0); }
		public TerminalNode CR() { return getToken(parcialParser.CR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CorchtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corcht; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterCorcht(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitCorcht(this);
		}
	}

	public final CorchtContext corcht() throws RecognitionException {
		CorchtContext _localctx = new CorchtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_corcht);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(CL);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072707074L) != 0)) {
				{
				setState(281);
				expr(0);
				}
			}

			setState(284);
			match(CR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SumatoriaContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(parcialParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parcialParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parcialParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(parcialParser.RPAREN, 0); }
		public SumatoriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumatoria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).enterSumatoria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parcialListener ) ((parcialListener)listener).exitSumatoria(this);
		}
	}

	public final SumatoriaContext sumatoria() throws RecognitionException {
		SumatoriaContext _localctx = new SumatoriaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sumatoria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__0);
			setState(287);
			match(LPAREN);
			setState(288);
			expr(0);
			setState(289);
			match(COMMA);
			setState(290);
			expr(0);
			setState(291);
			match(COMMA);
			setState(292);
			expr(0);
			setState(293);
			match(RPAREN);
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
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u0128\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000*\b\u0000\u000b\u0000"+
		"\f\u0000+\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0005"+
		"\u0002E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002M\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002Q\b\u0002"+
		"\u0001\u0002\u0003\u0002T\b\u0002\u0005\u0002V\b\u0002\n\u0002\f\u0002"+
		"Y\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002^\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002b\b\u0002\u0001\u0002\u0003\u0002e\b\u0002"+
		"\u0005\u0002g\b\u0002\n\u0002\f\u0002j\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002o\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"s\b\u0002\u0001\u0002\u0003\u0002v\b\u0002\u0005\u0002x\b\u0002\n\u0002"+
		"\f\u0002{\t\u0002\u0003\u0002}\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0088\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00aa\b\u0003"+
		"\n\u0003\f\u0003\u00ad\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00b3\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00b8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\b\u00c3\b\b\u000b"+
		"\b\f\b\u00c4\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d5\b\n\n"+
		"\n\f\n\u00d8\t\n\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u00dd\b\f\n\f"+
		"\f\f\u00e0\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u00e8\b\r\u0001\r\u0001\r\u0003\r\u00ec\b\r\u0001\r\u0001\r\u0003\r\u00f0"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0004\r\u00f5\b\r\u000b\r\f\r\u00f6\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u00fd\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u0109\b\u0011\u000b\u0011"+
		"\f\u0011\u010a\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011"+
		"\u0111\b\u0011\u000b\u0011\f\u0011\u0112\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0117\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u011b\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0000\u0001\u0006\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0000\u014d\u0000)\u0001"+
		"\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004|\u0001\u0000\u0000"+
		"\u0000\u0006\u0087\u0001\u0000\u0000\u0000\b\u00b2\u0001\u0000\u0000\u0000"+
		"\n\u00b7\u0001\u0000\u0000\u0000\f\u00b9\u0001\u0000\u0000\u0000\u000e"+
		"\u00bb\u0001\u0000\u0000\u0000\u0010\u00c2\u0001\u0000\u0000\u0000\u0012"+
		"\u00c6\u0001\u0000\u0000\u0000\u0014\u00cf\u0001\u0000\u0000\u0000\u0016"+
		"\u00d9\u0001\u0000\u0000\u0000\u0018\u00de\u0001\u0000\u0000\u0000\u001a"+
		"\u00e4\u0001\u0000\u0000\u0000\u001c\u00fc\u0001\u0000\u0000\u0000\u001e"+
		"\u00fe\u0001\u0000\u0000\u0000 \u0100\u0001\u0000\u0000\u0000\"\u0102"+
		"\u0001\u0000\u0000\u0000$\u0118\u0001\u0000\u0000\u0000&\u011e\u0001\u0000"+
		"\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",\u0001\u0001\u0000\u0000\u0000-7\u0003\u0004\u0002\u0000.7\u0003\u0006"+
		"\u0003\u0000/7\u0003\u000e\u0007\u000007\u0003\u0012\t\u000017\u0003\u001a"+
		"\r\u000027\u0003\"\u0011\u000037\u0003\b\u0004\u000047\u0003\u0016\u000b"+
		"\u000057\u0003&\u0013\u00006-\u0001\u0000\u0000\u00006.\u0001\u0000\u0000"+
		"\u00006/\u0001\u0000\u0000\u000060\u0001\u0000\u0000\u000061\u0001\u0000"+
		"\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u0003\u0001\u0000\u0000"+
		"\u00008F\u0005\u001d\u0000\u00009;\u0005&\u0000\u0000:<\u0003$\u0012\u0000"+
		";:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=>\u0005\t\u0000\u0000>@\u0005(\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000AC\u0005$\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000"+
		"\u0000\u0000D9\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G}\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000IW\u0005\u001a\u0000\u0000JL\u0005&\u0000\u0000"+
		"KM\u0003$\u0012\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NO\u0005\t\u0000\u0000OQ\u0003\u0006\u0003\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000"+
		"\u0000RT\u0005$\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000UJ\u0001\u0000\u0000\u0000VY\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X}\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Zh\u0005\u001b\u0000\u0000"+
		"[]\u0005&\u0000\u0000\\^\u0003$\u0012\u0000]\\\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_`\u0005\t\u0000\u0000"+
		"`b\u0003\u0006\u0003\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000ce\u0005$\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000f[\u0001\u0000"+
		"\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000i}\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"ky\u0005\u001c\u0000\u0000ln\u0005&\u0000\u0000mo\u0003$\u0012\u0000n"+
		"m\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000or\u0001\u0000\u0000"+
		"\u0000pq\u0005\t\u0000\u0000qs\u0003\u0006\u0003\u0000rp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tv\u0005$\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000"+
		"\u0000\u0000wl\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|8\u0001\u0000\u0000\u0000|I\u0001\u0000\u0000"+
		"\u0000|Z\u0001\u0000\u0000\u0000|k\u0001\u0000\u0000\u0000}\u0005\u0001"+
		"\u0000\u0000\u0000~\u007f\u0006\u0003\uffff\uffff\u0000\u007f\u0080\u0005"+
		"\u000f\u0000\u0000\u0080\u0081\u0003\u0006\u0003\u0000\u0081\u0082\u0005"+
		"\u0010\u0000\u0000\u0082\u0088\u0001\u0000\u0000\u0000\u0083\u0088\u0005"+
		"\'\u0000\u0000\u0084\u0088\u0005%\u0000\u0000\u0085\u0088\u0005&\u0000"+
		"\u0000\u0086\u0088\u0003&\u0013\u0000\u0087~\u0001\u0000\u0000\u0000\u0087"+
		"\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u00ab\u0001\u0000\u0000\u0000\u0089\u008a\n\u0010\u0000\u0000\u008a\u008b"+
		"\u0005\u0003\u0000\u0000\u008b\u00aa\u0003\u0006\u0003\u0011\u008c\u008d"+
		"\n\u000f\u0000\u0000\u008d\u008e\u0005\u0004\u0000\u0000\u008e\u00aa\u0003"+
		"\u0006\u0003\u0010\u008f\u0090\n\u000e\u0000\u0000\u0090\u0091\u0005\u0005"+
		"\u0000\u0000\u0091\u00aa\u0003\u0006\u0003\u000f\u0092\u0093\n\r\u0000"+
		"\u0000\u0093\u0094\u0005\u0006\u0000\u0000\u0094\u00aa\u0003\u0006\u0003"+
		"\u000e\u0095\u0096\n\f\u0000\u0000\u0096\u0097\u0005\u0007\u0000\u0000"+
		"\u0097\u00aa\u0003\u0006\u0003\r\u0098\u0099\n\u000b\u0000\u0000\u0099"+
		"\u009a\u0005\b\u0000\u0000\u009a\u00aa\u0003\u0006\u0003\f\u009b\u009c"+
		"\n\n\u0000\u0000\u009c\u009d\u0005\u0011\u0000\u0000\u009d\u00aa\u0003"+
		"\u0006\u0003\u000b\u009e\u009f\n\t\u0000\u0000\u009f\u00a0\u0005\u0012"+
		"\u0000\u0000\u00a0\u00aa\u0003\u0006\u0003\n\u00a1\u00a2\n\b\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0013\u0000\u0000\u00a3\u00aa\u0003\u0006\u0003\t\u00a4"+
		"\u00a5\n\u0007\u0000\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6\u00aa"+
		"\u0003\u0006\u0003\b\u00a7\u00a8\n\u0006\u0000\u0000\u00a8\u00aa\u0005"+
		"\n\u0000\u0000\u00a9\u0089\u0001\u0000\u0000\u0000\u00a9\u008c\u0001\u0000"+
		"\u0000\u0000\u00a9\u008f\u0001\u0000\u0000\u0000\u00a9\u0092\u0001\u0000"+
		"\u0000\u0000\u00a9\u0095\u0001\u0000\u0000\u0000\u00a9\u0098\u0001\u0000"+
		"\u0000\u0000\u00a9\u009b\u0001\u0000\u0000\u0000\u00a9\u009e\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000\u0000\u00a9\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u0007\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005\"\u0000\u0000\u00af\u00b3\u0003\n\u0005"+
		"\u0000\u00b0\u00b1\u0005#\u0000\u0000\u00b1\u00b3\u0003\f\u0006\u0000"+
		"\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\t\u0001\u0000\u0000\u0000\u00b4\u00b8\u0005(\u0000\u0000\u00b5"+
		"\u00b8\u0005&\u0000\u0000\u00b6\u00b8\u0003\u0006\u0003\u0000\u00b7\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u000b\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005&\u0000\u0000\u00ba\r\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		" \u0000\u0000\u00bc\u00bd\u0005&\u0000\u0000\u00bd\u00be\u0005\u000b\u0000"+
		"\u0000\u00be\u00bf\u0003\u0010\b\u0000\u00bf\u00c0\u0005\f\u0000\u0000"+
		"\u00c0\u000f\u0001\u0000\u0000\u0000\u00c1\u00c3\u0003\u0004\u0002\u0000"+
		"\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u0011\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u001a\u0000\u0000"+
		"\u00c7\u00c8\u0005&\u0000\u0000\u00c8\u00c9\u0005\u000f\u0000\u0000\u00c9"+
		"\u00ca\u0003\u0014\n\u0000\u00ca\u00cb\u0005\u0010\u0000\u0000\u00cb\u00cc"+
		"\u0005\u000b\u0000\u0000\u00cc\u00cd\u0003\u0018\f\u0000\u00cd\u00ce\u0005"+
		"\f\u0000\u0000\u00ce\u0013\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u001a"+
		"\u0000\u0000\u00d0\u00d6\u0005&\u0000\u0000\u00d1\u00d2\u0005$\u0000\u0000"+
		"\u00d2\u00d3\u0005\u001a\u0000\u0000\u00d3\u00d5\u0005&\u0000\u0000\u00d4"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u0015\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005!\u0000\u0000\u00da\u0017\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0003\u0002\u0001\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0"+
		"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0017\u0000\u0000\u00e2\u00e3"+
		"\u0003\u0006\u0003\u0000\u00e3\u0019\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0005\u0016\u0000\u0000\u00e5\u00e7\u0005\u000f\u0000\u0000\u00e6\u00e8"+
		"\u0003\u001c\u000e\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb"+
		"\u0005$\u0000\u0000\u00ea\u00ec\u0003\u001e\u000f\u0000\u00eb\u00ea\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0005$\u0000\u0000\u00ee\u00f0\u0003 \u0010"+
		"\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0010\u0000"+
		"\u0000\u00f2\u00f4\u0005\u000b\u0000\u0000\u00f3\u00f5\u0003\u0002\u0001"+
		"\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\f\u0000\u0000"+
		"\u00f9\u001b\u0001\u0000\u0000\u0000\u00fa\u00fd\u0003\u0004\u0002\u0000"+
		"\u00fb\u00fd\u0003\u0006\u0003\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u001d\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0003\u0006\u0003\u0000\u00ff\u001f\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0003\u0006\u0003\u0000\u0101!\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005\u0014\u0000\u0000\u0103\u0104\u0005\u000f\u0000\u0000\u0104"+
		"\u0105\u0003\u0006\u0003\u0000\u0105\u0106\u0005\u0010\u0000\u0000\u0106"+
		"\u0108\u0005\u000b\u0000\u0000\u0107\u0109\u0003\u0002\u0001\u0000\u0108"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u0116\u0005\f\u0000\u0000\u010d\u010e"+
		"\u0005\u0015\u0000\u0000\u010e\u0110\u0005\u000b\u0000\u0000\u010f\u0111"+
		"\u0003\u0002\u0001\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005\f\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u010d\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117#\u0001\u0000"+
		"\u0000\u0000\u0118\u011a\u0005\r\u0000\u0000\u0119\u011b\u0003\u0006\u0003"+
		"\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u000e\u0000"+
		"\u0000\u011d%\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0001\u0000\u0000"+
		"\u011f\u0120\u0005\u000f\u0000\u0000\u0120\u0121\u0003\u0006\u0003\u0000"+
		"\u0121\u0122\u0005$\u0000\u0000\u0122\u0123\u0003\u0006\u0003\u0000\u0123"+
		"\u0124\u0005$\u0000\u0000\u0124\u0125\u0003\u0006\u0003\u0000\u0125\u0126"+
		"\u0005\u0010\u0000\u0000\u0126\'\u0001\u0000\u0000\u0000$+6;?BFLPSW]a"+
		"dhnruy|\u0087\u00a9\u00ab\u00b2\u00b7\u00c4\u00d6\u00de\u00e7\u00eb\u00ef"+
		"\u00f6\u00fc\u010a\u0112\u0116\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}