// Generated from C:/Users/wikto/IdeaProjects/MiASI/Rally-co-driverSimulator/src/grammar/RallyComParser.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RallyComParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEWY=1, PRAWY=2, NAWROT=3, SZCZYT=4, PROSTO=5, JEDEN=6, DWA=7, TRZY=8, 
		CZTERY=9, PIEC=10, MAKS=11, HALF=12, DNEM=13, PLUS=14, HAMUJ=15, PRZYHAMUJ=16, 
		PELNE_HAMOWANIE=17, ZDUS=18, DO_LEWEJ=19, DO_PRAWEJ=20, Z_DROGI=21, CIAC=22, 
		NIE_CIAC=23, POZNO=24, WCZESNIE=25, SMIALO=26, CELUJ=27, ZACISK=28, PRZEZ=29, 
		DO=30, PRZED=31, NA=32, COMMA=33, X=34, LBRACK=35, RBRACK=36, NEWLINE=37, 
		WS=38, INT=39;
	public static final int
		RULE_program = 0, RULE_pacenote = 1, RULE_repeatPhrase = 2, RULE_sequence = 3, 
		RULE_element = 4, RULE_anyNumber = 5, RULE_turnSpec = 6, RULE_modifier = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "pacenote", "repeatPhrase", "sequence", "element", "anyNumber", 
			"turnSpec", "modifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'hamuj'", "'przyhamuj'", "'pe\\u0142ne hamowanie'", 
			"'zdu\\u015B'", "'do lewej'", "'do prawej'", null, "'ci\\u0105\\u0107'", 
			"'nie ci\\u0105\\u0107'", "'p\\u00F3\\u017Ano'", "'wcze\\u015Bnie'", 
			"'\\u015Bmia\\u0142o'", "'celuj'", "'zacisk'", "'przez'", "'do'", "'przed'", 
			"'na'", "','", "'x'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEWY", "PRAWY", "NAWROT", "SZCZYT", "PROSTO", "JEDEN", "DWA", 
			"TRZY", "CZTERY", "PIEC", "MAKS", "HALF", "DNEM", "PLUS", "HAMUJ", "PRZYHAMUJ", 
			"PELNE_HAMOWANIE", "ZDUS", "DO_LEWEJ", "DO_PRAWEJ", "Z_DROGI", "CIAC", 
			"NIE_CIAC", "POZNO", "WCZESNIE", "SMIALO", "CELUJ", "ZACISK", "PRZEZ", 
			"DO", "PRZED", "NA", "COMMA", "X", "LBRACK", "RBRACK", "NEWLINE", "WS", 
			"INT"
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
	public String getGrammarFileName() { return "RallyComParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RallyComParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<PacenoteContext> pacenote() {
			return getRuleContexts(PacenoteContext.class);
		}
		public PacenoteContext pacenote(int i) {
			return getRuleContext(PacenoteContext.class,i);
		}
		public TerminalNode EOF() { return getToken(RallyComParser.EOF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RallyComParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RallyComParser.COMMA, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			pacenote();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(17);
				match(COMMA);
				setState(18);
				pacenote();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
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
	public static class PacenoteContext extends ParserRuleContext {
		public PacenoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pacenote; }
	 
		public PacenoteContext() { }
		public void copyFrom(PacenoteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopPhraseContext extends PacenoteContext {
		public RepeatPhraseContext repeatPhrase() {
			return getRuleContext(RepeatPhraseContext.class,0);
		}
		public LoopPhraseContext(PacenoteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterLoopPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitLoopPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitLoopPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalPhraseContext extends PacenoteContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public NormalPhraseContext(PacenoteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterNormalPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitNormalPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitNormalPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PacenoteContext pacenote() throws RecognitionException {
		PacenoteContext _localctx = new PacenoteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pacenote);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new LoopPhraseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				repeatPhrase();
				}
				break;
			case 2:
				_localctx = new NormalPhraseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				sequence();
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
	public static class RepeatPhraseContext extends ParserRuleContext {
		public AnyNumberContext count;
		public TerminalNode X() { return getToken(RallyComParser.X, 0); }
		public TerminalNode LBRACK() { return getToken(RallyComParser.LBRACK, 0); }
		public List<PacenoteContext> pacenote() {
			return getRuleContexts(PacenoteContext.class);
		}
		public PacenoteContext pacenote(int i) {
			return getRuleContext(PacenoteContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(RallyComParser.RBRACK, 0); }
		public AnyNumberContext anyNumber() {
			return getRuleContext(AnyNumberContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RallyComParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RallyComParser.COMMA, i);
		}
		public RepeatPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterRepeatPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitRepeatPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitRepeatPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatPhraseContext repeatPhrase() throws RecognitionException {
		RepeatPhraseContext _localctx = new RepeatPhraseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_repeatPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((RepeatPhraseContext)_localctx).count = anyNumber();
			setState(31);
			match(X);
			setState(32);
			match(LBRACK);
			setState(33);
			pacenote();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(34);
				match(COMMA);
				setState(35);
				pacenote();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(RBRACK);
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
	public static class SequenceContext extends ParserRuleContext {
		public Token connect;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> DO() { return getTokens(RallyComParser.DO); }
		public TerminalNode DO(int i) {
			return getToken(RallyComParser.DO, i);
		}
		public List<TerminalNode> PRZED() { return getTokens(RallyComParser.PRZED); }
		public TerminalNode PRZED(int i) {
			return getToken(RallyComParser.PRZED, i);
		}
		public List<TerminalNode> NA() { return getTokens(RallyComParser.NA); }
		public TerminalNode NA(int i) {
			return getToken(RallyComParser.NA, i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			element();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) {
				{
				{
				setState(44);
				((SequenceContext)_localctx).connect = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
					((SequenceContext)_localctx).connect = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(45);
				element();
				}
				}
				setState(50);
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
	@SuppressWarnings("CheckReturnValue")
	public static class CrestPhraseContext extends ElementContext {
		public TerminalNode SZCZYT() { return getToken(RallyComParser.SZCZYT, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public CrestPhraseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterCrestPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitCrestPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitCrestPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositioningPhraseContext extends ElementContext {
		public TerminalNode DO_LEWEJ() { return getToken(RallyComParser.DO_LEWEJ, 0); }
		public TerminalNode DO_PRAWEJ() { return getToken(RallyComParser.DO_PRAWEJ, 0); }
		public TerminalNode Z_DROGI() { return getToken(RallyComParser.Z_DROGI, 0); }
		public PositioningPhraseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterPositioningPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitPositioningPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitPositioningPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionPhraseContext extends ElementContext {
		public Token action;
		public TerminalNode HAMUJ() { return getToken(RallyComParser.HAMUJ, 0); }
		public TerminalNode PRZYHAMUJ() { return getToken(RallyComParser.PRZYHAMUJ, 0); }
		public TerminalNode PELNE_HAMOWANIE() { return getToken(RallyComParser.PELNE_HAMOWANIE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ActionPhraseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterActionPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitActionPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitActionPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TurnPhraseContext extends ElementContext {
		public Token direct;
		public TerminalNode LEWY() { return getToken(RallyComParser.LEWY, 0); }
		public TerminalNode PRAWY() { return getToken(RallyComParser.PRAWY, 0); }
		public TurnSpecContext turnSpec() {
			return getRuleContext(TurnSpecContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TurnPhraseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterTurnPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitTurnPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitTurnPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DistancePhraseContext extends ElementContext {
		public Token dist;
		public TerminalNode INT() { return getToken(RallyComParser.INT, 0); }
		public TerminalNode PROSTO() { return getToken(RallyComParser.PROSTO, 0); }
		public DistancePhraseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterDistancePhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitDistancePhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitDistancePhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAMUJ:
			case PRZYHAMUJ:
			case PELNE_HAMOWANIE:
				_localctx = new ActionPhraseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((ActionPhraseContext)_localctx).action = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0)) ) {
					((ActionPhraseContext)_localctx).action = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549759713302L) != 0)) {
					{
					setState(52);
					element();
					}
				}

				}
				break;
			case LEWY:
			case PRAWY:
				_localctx = new TurnPhraseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((TurnPhraseContext)_localctx).direct = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LEWY || _la==PRAWY) ) {
					((TurnPhraseContext)_localctx).direct = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4040L) != 0)) {
					{
					setState(56);
					turnSpec();
					}
				}

				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1069838336L) != 0)) {
					{
					{
					setState(59);
					modifier();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INT:
				_localctx = new DistancePhraseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				((DistancePhraseContext)_localctx).dist = match(INT);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROSTO) {
					{
					setState(66);
					match(PROSTO);
					}
				}

				}
				break;
			case SZCZYT:
				_localctx = new CrestPhraseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(SZCZYT);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1069838336L) != 0)) {
					{
					{
					setState(70);
					modifier();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DO_LEWEJ:
			case DO_PRAWEJ:
			case Z_DROGI:
				_localctx = new PositioningPhraseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
	public static class AnyNumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RallyComParser.INT, 0); }
		public TerminalNode JEDEN() { return getToken(RallyComParser.JEDEN, 0); }
		public TerminalNode DWA() { return getToken(RallyComParser.DWA, 0); }
		public TerminalNode TRZY() { return getToken(RallyComParser.TRZY, 0); }
		public TerminalNode CZTERY() { return getToken(RallyComParser.CZTERY, 0); }
		public TerminalNode PIEC() { return getToken(RallyComParser.PIEC, 0); }
		public AnyNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterAnyNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitAnyNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitAnyNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyNumberContext anyNumber() throws RecognitionException {
		AnyNumberContext _localctx = new AnyNumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_anyNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 549755815872L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TurnSpecContext extends ParserRuleContext {
		public Token degree;
		public TerminalNode JEDEN() { return getToken(RallyComParser.JEDEN, 0); }
		public TerminalNode DWA() { return getToken(RallyComParser.DWA, 0); }
		public TerminalNode TRZY() { return getToken(RallyComParser.TRZY, 0); }
		public TerminalNode CZTERY() { return getToken(RallyComParser.CZTERY, 0); }
		public TerminalNode PIEC() { return getToken(RallyComParser.PIEC, 0); }
		public TerminalNode MAKS() { return getToken(RallyComParser.MAKS, 0); }
		public TerminalNode NAWROT() { return getToken(RallyComParser.NAWROT, 0); }
		public TurnSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterTurnSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitTurnSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitTurnSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnSpecContext turnSpec() throws RecognitionException {
		TurnSpecContext _localctx = new TurnSpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_turnSpec);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JEDEN:
			case DWA:
			case TRZY:
			case CZTERY:
			case PIEC:
			case MAKS:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				((TurnSpecContext)_localctx).degree = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) ) {
					((TurnSpecContext)_localctx).degree = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NAWROT:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(NAWROT);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) {
					{
					setState(83);
					((TurnSpecContext)_localctx).degree = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) ) {
						((TurnSpecContext)_localctx).degree = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
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
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode HALF() { return getToken(RallyComParser.HALF, 0); }
		public TerminalNode DNEM() { return getToken(RallyComParser.DNEM, 0); }
		public TerminalNode PLUS() { return getToken(RallyComParser.PLUS, 0); }
		public TerminalNode CIAC() { return getToken(RallyComParser.CIAC, 0); }
		public TerminalNode NIE_CIAC() { return getToken(RallyComParser.NIE_CIAC, 0); }
		public TerminalNode POZNO() { return getToken(RallyComParser.POZNO, 0); }
		public TerminalNode WCZESNIE() { return getToken(RallyComParser.WCZESNIE, 0); }
		public TerminalNode SMIALO() { return getToken(RallyComParser.SMIALO, 0); }
		public TerminalNode CELUJ() { return getToken(RallyComParser.CELUJ, 0); }
		public TerminalNode ZACISK() { return getToken(RallyComParser.ZACISK, 0); }
		public TerminalNode PRZEZ() { return getToken(RallyComParser.PRZEZ, 0); }
		public TerminalNode ZDUS() { return getToken(RallyComParser.ZDUS, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1069838336L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\'[\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003"+
		"\n\u0003\f\u00032\t\u0003\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0005\u0004"+
		"=\b\u0004\n\u0004\f\u0004@\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"D\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004H\b\u0004\n\u0004\f\u0004"+
		"K\t\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006U\b\u0006\u0003\u0006W\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0000\u0007\u0001\u0000\u001e \u0001\u0000\u000f\u0011\u0001"+
		"\u0000\u0001\u0002\u0001\u0000\u0013\u0015\u0002\u0000\u0006\n\'\'\u0001"+
		"\u0000\u0006\u000b\u0003\u0000\f\u000e\u0012\u0012\u0016\u001da\u0000"+
		"\u0010\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004"+
		"\u001e\u0001\u0000\u0000\u0000\u0006+\u0001\u0000\u0000\u0000\bM\u0001"+
		"\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000"+
		"\u000eX\u0001\u0000\u0000\u0000\u0010\u0015\u0003\u0002\u0001\u0000\u0011"+
		"\u0012\u0005!\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0011"+
		"\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0005\u0000\u0000\u0001\u0019\u0001\u0001\u0000\u0000\u0000\u001a\u001d"+
		"\u0003\u0004\u0002\u0000\u001b\u001d\u0003\u0006\u0003\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0003"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0003\n\u0005\u0000\u001f \u0005"+
		"\"\u0000\u0000 !\u0005#\u0000\u0000!&\u0003\u0002\u0001\u0000\"#\u0005"+
		"!\u0000\u0000#%\u0003\u0002\u0001\u0000$\"\u0001\u0000\u0000\u0000%(\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0005$\u0000\u0000"+
		"*\u0005\u0001\u0000\u0000\u0000+0\u0003\b\u0004\u0000,-\u0007\u0000\u0000"+
		"\u0000-/\u0003\b\u0004\u0000.,\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0007\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000035\u0007\u0001\u0000\u0000"+
		"46\u0003\b\u0004\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6N\u0001\u0000\u0000\u000079\u0007\u0002\u0000\u00008:\u0003\f\u0006\u0000"+
		"98\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:>\u0001\u0000\u0000"+
		"\u0000;=\u0003\u000e\u0007\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?N\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AC\u0005\'\u0000\u0000BD\u0005"+
		"\u0005\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DN\u0001\u0000\u0000\u0000EI\u0005\u0004\u0000\u0000FH\u0003\u000e\u0007"+
		"\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JN\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LN\u0007\u0003\u0000\u0000M3\u0001\u0000\u0000\u0000"+
		"M7\u0001\u0000\u0000\u0000MA\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000N\t\u0001\u0000\u0000\u0000OP\u0007\u0004"+
		"\u0000\u0000P\u000b\u0001\u0000\u0000\u0000QW\u0007\u0005\u0000\u0000"+
		"RT\u0005\u0003\u0000\u0000SU\u0007\u0005\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VQ\u0001\u0000"+
		"\u0000\u0000VR\u0001\u0000\u0000\u0000W\r\u0001\u0000\u0000\u0000XY\u0007"+
		"\u0006\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000\f\u0015\u001c&059>C"+
		"IMTV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}