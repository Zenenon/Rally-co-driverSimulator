// Generated from C:/Users/wikto/IdeaProjects/MiASI/Rally-co-driverSimulator/src/grammar/RallyComParser.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RallyComParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RallyComParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RallyComParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RallyComParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopPhrase}
	 * labeled alternative in {@link RallyComParser#pacenote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopPhrase(RallyComParser.LoopPhraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalPhrase}
	 * labeled alternative in {@link RallyComParser#pacenote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalPhrase(RallyComParser.NormalPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RallyComParser#repeatPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatPhrase(RallyComParser.RepeatPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RallyComParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(RallyComParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionPhrase(RallyComParser.ActionPhraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code turnPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnPhrase(RallyComParser.TurnPhraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code distancePhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistancePhrase(RallyComParser.DistancePhraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code crestPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrestPhrase(RallyComParser.CrestPhraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positioningPhrase}
	 * labeled alternative in {@link RallyComParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositioningPhrase(RallyComParser.PositioningPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RallyComParser#anyNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyNumber(RallyComParser.AnyNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link RallyComParser#turnSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnSpec(RallyComParser.TurnSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link RallyComParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(RallyComParser.ModifierContext ctx);
}