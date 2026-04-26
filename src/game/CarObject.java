package game;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.geom.Point2D;

/**
 * Represents the physical rally car and its current logical state.
 * It handles real-time physics updates and stores rally-specific flags.
 */
public class CarObject {
    // --- Basic Physics and Coordinates ---
    private double x, y;
    private double angle = 0;             // Current heading in degrees
    private double currentSpeedKmH = 0;
    private double acceleration = 0;      // m/s^2 change applied to speed
    private double steeringRate = 0;      // Steering intensity (deg/meter)
    private double remainingDistance = 0; // Meters left in the current instruction
    private boolean isPaused = true;      // Is the car waiting for a command?

    // --- Rally Logic States (As defined in the grammar) ---
    public enum LanePosition { LEFT, CENTER, RIGHT }
    private LanePosition currentLane = LanePosition.CENTER; // PositioningPhrase

    private boolean isOnCrest = false;      // CrestPhrase (SZCZYT)
    private boolean canCut = true;          // Modifier (CIAC / NIE_CIAC)
    private boolean isAggressive = false;   // Modifier (SMIALO)
    private boolean isTightening = false;   // Modifier (ZACISK)
    private String timingStyle = "NORMAL";  // Modifier (POZNO / WCZESNIE)

    // --- Physics Constants ---
    private static final double MAX_SPEED = 220.0;
    private static final double PIXELS_PER_METER = 2.0;
    private static final double NATURAL_DRAG = 0.55; // Air/Rolling resistance
    private static final double GRIP_LOSS_SPEED = 40.0; // Speed where understeer begins

    public CarObject(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    /**
     * Main simulation loop. Updates physics based on elapsed time.
     * @param deltaTime Time since last frame in seconds (e.g., 0.016 for 60FPS).
     */
    public void update(double deltaTime) {
        if (isPaused) return;

        // 1. UPDATE SPEED
        // v = v0 + a * t. We convert acceleration to km/h change.
        currentSpeedKmH += (acceleration * deltaTime * 3.6);

        // Apply natural drag if no active throttle is applied
        if (acceleration <= 0 && currentSpeedKmH > 0) {
            currentSpeedKmH -= (NATURAL_DRAG * deltaTime * 3.6);
        }

        // Clamp speed between 0 and Max
        currentSpeedKmH = Math.max(0, Math.min(currentSpeedKmH, MAX_SPEED));

        // Convert current speed to meters per second for movement math
        double metersPerSec = currentSpeedKmH / 3.6;
        double frameDist = metersPerSec * deltaTime;

        // 2. CALCULATE STEERING (Understeer Physics)
        // High speed reduces the efficiency of the steering wheel.
        // We divide the steeringRate by a factor of speed to simulate grip loss.
        double speedPenalty = Math.max(1.0, currentSpeedKmH / GRIP_LOSS_SPEED);
        double effectiveSteer = steeringRate / Math.pow(speedPenalty, 3);

        // Heading changes only when the car is actually moving
        if (frameDist > 0) {
            this.angle += (effectiveSteer * frameDist);
        }

        // 3. UPDATE POSITION
        // standard 2D trigonometry: dx = d*cos(theta), dy = d*sin(theta)
        double rad = Math.toRadians(angle);
        x += (frameDist * PIXELS_PER_METER * Math.cos(rad));
        y += (frameDist * PIXELS_PER_METER * Math.sin(rad));

        // 4. CHECK COMPLETION
        remainingDistance -= frameDist;
        if (remainingDistance <= 0) {
            finishInstruction();
        }

        // Add this inside the update() method
        if (!isPaused && steeringRate != 0) {
            // The harder you steer and the faster you go, the more speed you lose
            double scrubEffect = Math.abs(steeringRate) * (currentSpeedKmH / 100.0) * 0.05;
            currentSpeedKmH -= scrubEffect * deltaTime;
        }
    }

    /**
     * Stops the car's current instruction while preserving speed.
     */
    private void finishInstruction() {
        remainingDistance = 0;
        acceleration = 0;
        steeringRate = 0;
        isOnCrest = false; // Car "lands" after passing a crest
        isPaused = true;
    }

    // --- State Setters (Used by RallyVisitor) ---

    public void triggerMove(double accel, int meters, double steer) {
        this.acceleration = accel;
        this.remainingDistance = meters;
        this.steeringRate = steer;
        this.isPaused = false;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void setOnCrest(boolean state) { this.isOnCrest = state; }
    public void setLane(LanePosition lp) { this.currentLane = lp; }
    public void setCanCut(boolean state) { this.canCut = state; }
    public void setAggressive(boolean state) { this.isAggressive = state; }
    public void setTightening(boolean state) { this.isTightening = state; }
    public void setTiming(String style) { this.timingStyle = style; }

    public void draw(Graphics2D g2d) {
        Graphics2D g = (Graphics2D) g2d.create();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.translate(x, y);
        g.rotate(Math.toRadians(angle));

        g.setColor(new Color(30, 80, 180));
        g.fillRoundRect(-18, -10, 36, 20, 8, 8);

        // Dashboard/Front indicator
        g.setColor(Color.WHITE);
        g.fillRect(8, -6, 4, 12);

        g.dispose();
    }

    public boolean isWaiting() {
        return isPaused;
    }

    public List<Point2D.Double> getPredictedPath(double testSteeringRate, int totalMeters) {
        List<Point2D.Double> path = new ArrayList<>();

        // 1. Copy the current state so we don't move the actual car
        double tempX = this.x;
        double tempY = this.y;
        double tempAngle = this.angle;
        double tempSpeed = this.currentSpeedKmH;

        // 2. Simulation parameters
        double stepDistMeters = 2.0; // Calculate a point every 2 meters
        int steps = totalMeters / (int)stepDistMeters;

        // Scale for rendering
        double pixelsPerMeter = 2.0;

        for (int i = 0; i < steps; i++) {
            // A. Apply Understeer Physics (Same as in update method)
            // High speed makes the steering rate less effective
            double speedPenalty = Math.max(1.0, tempSpeed / 50.0);
            double effectiveSteer = testSteeringRate / (speedPenalty * speedPenalty);

            // B. Update Angle and Position
            tempAngle += (effectiveSteer * stepDistMeters);

            double rad = Math.toRadians(tempAngle);
            tempX += (stepDistMeters * pixelsPerMeter * Math.cos(rad));
            tempY += (stepDistMeters * pixelsPerMeter * Math.sin(rad));

            // C. Record the predicted point
            path.add(new Point2D.Double(tempX, tempY));

            // Note: We assume speed is constant during this prediction
        }

        return path;
    }

    public double getSpeed() { return currentSpeedKmH; }
}