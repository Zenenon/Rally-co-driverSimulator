// Generated from C:/Users/wikto/IdeaProjects/MiASI/Rally-co-driverSimulator/src/grammar/RallyComParser.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RallyComParser}.
 */
public interface RallyComParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RallyComParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RallyComParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RallyComParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RallyComParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopPhrase}
	 * labeled alternative in {@link RallyComParser#pacenote}.
	 * @param ctx the parse tree
	 */
	void enterLoopPhrase(RallyComParser.LoopPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopPhrase}
	 * labeled alternative in {@link RallyComParser#pacenote}.
	 * @param ctx the parse tree
	 */
	void exitLoopPhrase(RallyComParser.LoopPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalPhrase}
	 * labeled alternative in {@link RallyComParser#pacenote}.
	 * @param ctx the parse tree
	 */
	void enterNormalPhrase(RallyComParser.NormalPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalPhrase}
	 * labeled alternative in {@link RallyComParser#pacenote}.
	 * @param ctx the parse tree
	 */
	void exitNormalPhrase(RallyComParser.NormalPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RallyComParser#repeatPhrase}.
	 * @param ctx the parse tree
	 */
	void enterRepeatPhrase(RallyComParser.RepeatPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RallyComParser#repeatPhrase}.
	 * @param ctx the parse tree
	 */
	void exitRepeatPhrase(RallyComParser.RepeatPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RallyComParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(RallyComParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RallyComParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(RallyComParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 */
	void enterActionPhrase(RallyComParser.ActionPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 */
	void exitActionPhrase(RallyComParser.ActionPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code turnPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTurnPhrase(RallyComParser.TurnPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code turnPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTurnPhrase(RallyComParser.TurnPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code distancePhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 */
	void enterDistancePhrase(RallyComParser.DistancePhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code distancePhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 */
	void exitDistancePhrase(RallyComParser.DistancePhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code crestPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 */
	void enterCrestPhrase(RallyComParser.CrestPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code crestPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 */
	void exitCrestPhrase(RallyComParser.CrestPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positioningPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 */
	void enterPositioningPhrase(RallyComParser.PositioningPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positioningPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 */
	void exitPositioningPhrase(RallyComParser.PositioningPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RallyComParser#anyNumber}.
	 * @param ctx the parse tree
	 */
	void enterAnyNumber(RallyComParser.AnyNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link RallyComParser#anyNumber}.
	 * @param ctx the parse tree
	 */
	void exitAnyNumber(RallyComParser.AnyNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link RallyComParser#turnSpec}.
	 * @param ctx the parse tree
	 */
	void enterTurnSpec(RallyComParser.TurnSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link RallyComParser#turnSpec}.
	 * @param ctx the parse tree
	 */
	void exitTurnSpec(RallyComParser.TurnSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link RallyComParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(RallyComParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RallyComParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(RallyComParser.ModifierContext ctx);
}