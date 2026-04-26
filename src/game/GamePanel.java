package game;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GamePanel extends JPanel {
    private final CarObject car;
    private final Timer gameTimer;
    private BufferedImage mapImage;

    public GamePanel() {
        setPreferredSize(new Dimension(800, 600));
        car = new CarObject(400, 600);

        // Load the map image from your project folder
        try {
            // Place your map.jpg or map.png in the project root or a resources folder
            mapImage = ImageIO.read(new File("map.jpeg"));
        } catch (IOException e) {
            System.err.println("Could not load map image: " + e.getMessage());
            // Fallback: simple checkered pattern or solid color
        }

        // Game Loop: runs every 16ms (~60 FPS)
        gameTimer = new Timer(16, e -> {
            car.update(0.016); // 0.016s is the delta time
            repaint();
        });
        gameTimer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // --- CAMERA LOGIC ---
        // Calculate the center of the screen
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Calculate the offset to keep the car at the center
        int offsetX = (int) (centerX - car.getX());
        int offsetY = (int) (centerY - car.getY());

        // Save the original transform state
        var originalTransform = g2d.getTransform();

        // Translate the coordinate system. Everything drawn after this
        // will be shifted by the camera offset.
        g2d.translate(offsetX, offsetY);

        // 1. Draw the Map (Background)
        if (mapImage != null) {
            // Draw map at (0,0). Since we translated the camera,
            // the map will appear to move as the car drives.
            g2d.drawImage(mapImage, 0, 0, null);
        } else {
            // Fallback if map fails to load: draw a grid
            drawGrid(g2d);
        }

        // Only draw prediction arrows when the car is stationary
        if (car.isWaiting()) {
            drawTrajectories(g2d);
        }

        car.draw(g2d);

        // 2. Draw the Car
        car.draw(g2d);

        // Restore original transform to draw the HUD (which shouldn't move with the camera)
        g2d.setTransform(originalTransform);
        drawHUD(g2d);
    }

    /**
     * Draws 5 potential paths the car could take based on current speed.
     */
    private void drawTrajectories(Graphics2D g2d) {
        // 1. Define the 5 steering rates (Matches your mapDegreeToSeverity scale)
        double[] testRates = {-25.0, -16.0, -3.5, -1.2, 0.0, 1.2, 3.5, 16.0, 25.0};

        // Set line style (Dashed line)
        float[] dash = {10.0f};
        g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f));

        for (double rate : testRates) {
            // Calculate the path (e.g., 60 meters ahead)
            List<Point2D.Double> path = car.getPredictedPath(rate, 60);

            // Color coding based on steering
            if (rate == 0) g2d.setColor(new Color(255, 255, 255, 180)); // White for straight
            else g2d.setColor(new Color(200, 200, 200, 100)); // Gray for turns

            // Draw the path as a series of lines
            for (int i = 0; i < path.size() - 1; i++) {
                Point2D.Double p1 = path.get(i);
                Point2D.Double p2 = path.get(i+1);
                g2d.drawLine((int)p1.x, (int)p1.y, (int)p2.x, (int)p2.y);
            }

            // Draw an arrowhead or circle at the end of the path
            Point2D.Double last = path.get(path.size() - 1);
            g2d.fillOval((int)last.x - 4, (int)last.y - 4, 8, 8);
        }

        // Reset stroke to normal
        g2d.setStroke(new BasicStroke(1));
    }

    private void drawGrid(Graphics2D g2d) {
        g2d.setColor(Color.DARK_GRAY);
        for (int i = 0; i < 5000; i += 100) {
            g2d.drawLine(i, 0, i, 5000);
            g2d.drawLine(0, i, 5000, i);
        }
    }

    private void drawHUD(Graphics2D g2d) {
        g2d.setColor(new Color(0, 0, 0, 150));
        g2d.fillRect(10, 10, 180, 60);
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Monospaced", Font.BOLD, 16));
        g2d.drawString("SPD: " + (int)car.getSpeed() + " km/h", 20, 35);
    }

    public CarObject getCar() { return car; }
}