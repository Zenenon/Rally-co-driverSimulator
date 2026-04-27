package interpreter;

import game.CarObject;
import grammar.RallyComParserBaseVisitor;
import grammar.RallyComParser;

/**
 * The bridge between the ANTLR Parse Tree and the Game Engine.
 * Overrides specific labeled rules from RallyComParser.g4.
 */
public class RallyVisitor extends RallyComParserBaseVisitor<Void> {
    private final CarObject car;

    // Command Buffer: Values are stored here until visitDistancePhrase triggers execution
    private double pendingAccel = 0;
    private double pendingSteer = 0;

    public RallyVisitor(CarObject car) {
        this.car = car;
    }

    /**
     * Handles: direct=(LEWY|PRAWY) turnSpec? modifier*
     */
    @Override
    public Void visitLoopPhrase(RallyComParser.LoopPhraseContext ctx) {
        return visit(ctx.repeatPhrase());
    }

    @Override
    public Void visitRepeatPhrase(RallyComParser.RepeatPhraseContext ctx) {
        int iterations = Integer.parseInt(ctx.count.getText());

        for (int i = 0; i < iterations; i++) {
            // We tell the visitor to re-process every pacenote inside the [ ]
            for (RallyComParser.PacenoteContext pacenote : ctx.pacenote()) {
                this.visit(pacenote);
            }
        }
        return null;
    }

    @Override
    public Void visitNormalPhrase(RallyComParser.NormalPhraseContext ctx) {
        return visit(ctx.sequence());
    }

    @Override
    public Void visitTurnPhrase(RallyComParser.TurnPhraseContext ctx) {
        double severity = 3.0; // Default turn intensity

        // 1. Process Severity (1-5, MAX or NAWROT)
        if (ctx.turnSpec() != null) {
            if (ctx.turnSpec().degree != null) {
                severity = mapDegreeToSeverity(ctx.turnSpec().degree.getText());
            }
            if (ctx.turnSpec().getText().contains("nawrot")) {
                severity = 45.0; // Very sharp hairpin turn
            }
        }

        // 2. Determine Direction (L/P or Polish words)
        String direction = ctx.direct.getText().toLowerCase();
        pendingSteer = (direction.startsWith("l")) ? -severity : severity;

        // 3. Visit children to pick up any modifiers (like 'zacisk' or 'dnem')
        return visitChildren(ctx);
    }

    /**
     * Handles: dist=INT PROSTO?
     * This is the "Execution" node. It triggers the car's physical movement.
     */
    @Override
    public Void visitDistancePhrase(RallyComParser.DistancePhraseContext ctx) {
        int meters = Integer.parseInt(ctx.dist.getText());

        // Pass the accumulated steering and acceleration to the car
        car.queueMove(pendingAccel, meters, pendingSteer);

        // Reset command buffer for the next part of the pacenote sequence
        pendingAccel = 0;
        pendingSteer = 0;
        return null;
    }

    /**
     * Handles: action=(HAMUJ | PRZYHAMUJ | PELNE_HAMOWANIE) element?
     */
    @Override
    public Void visitActionPhrase(RallyComParser.ActionPhraseContext ctx) {
        String action = ctx.action.getText().toLowerCase();

        // Map braking actions to negative acceleration (m/s^2)
        if (action.contains("przyhamuj")) pendingAccel = -3.5;
        else if (action.contains("pełne") || action.contains("pelne")) pendingAccel = -14.0;
        else pendingAccel = -8.0; // Standard "hamuj"

        // If followed by a distance or turn (recursive element), visit it
        if (ctx.element() != null) {
            return visit(ctx.element());
        } else {
            // If just "hamuj" is typed, brake over a default 30m stretch
            car.queueMove(pendingAccel, 30, pendingSteer);
            return null;
        }
    }

    /**
     * Handles: SZCZYT modifier*
     */
    @Override
    public Void visitCrestPhrase(RallyComParser.CrestPhraseContext ctx) {
        car.setOnCrest(true);
        return visitChildren(ctx);
    }

    /**
     * Handles: (DO_LEWEJ | DO_PRAWEJ | Z_DROGI)
     */
    @Override
    public Void visitPositioningPhrase(RallyComParser.PositioningPhraseContext ctx) {
        String text = ctx.getText().toLowerCase();
        if (text.contains("lewej")) car.setLane(CarObject.LanePosition.LEFT);
        else if (text.contains("prawej")) car.setLane(CarObject.LanePosition.RIGHT);
        else car.setLane(CarObject.LanePosition.CENTER);
        return null;
    }

    /**
     * Handles all modifiers. Even those without immediate physics impact
     * are implemented to maintain the car's logical state.
     */
    @Override
    public Void visitModifier(RallyComParser.ModifierContext ctx) {
        String mod = ctx.getText().toLowerCase();

        switch (mod) {
            // --- Speed Modifiers ---
            case "dnem", "_" -> pendingAccel = 4.8;
            case "plus", "+" -> pendingAccel = 2.2;
            case "pół", "pol" -> pendingAccel = 0.8;
            case "zduś", "zdus" -> pendingAccel = -10.0;

            // --- Driving Style Modifiers ---
            case "śmiało", "smialo" -> car.setAggressive(true);
            case "zacisk" -> car.setTightening(true);
            case "późno", "pozno" -> car.setTiming("LATE");
            case "wcześnie", "wczesnie" -> car.setTiming("EARLY");

            // --- Track Logic Modifiers ---
            case "ciąć", "ciac" -> car.setCanCut(true);
            case "nie ciąć", "nie ciac" -> car.setCanCut(false);

            // 'celuj', 'przez' - recognized but no logic assigned yet
        }
        return null;
    }

    /**
     * Helper to map rally 1-5 scale to steering degrees per meter.
     */
    private double mapDegreeToSeverity(String deg) {
        return switch (deg.toLowerCase()) {
            case "1" -> 1.2;
            case "2" -> 3.8;
            case "3" -> 8.5;
            case "4" -> 16.0;
            case "5" -> 28.0;
            case "maks", "max" -> 48.0;
            default -> 4.0;
        };
    }
}