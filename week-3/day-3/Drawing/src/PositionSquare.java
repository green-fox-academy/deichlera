import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
        int x = 20;
        int y = 40;
        for (int i = 0; i < 3; i++) {
            x = randomInt(0, WIDTH);
            y = randomInt(0, HEIGHT);
            drawsquares(x, y, graphics);
        }
    }

    private static int randomInt(int min, int max) {
        int value = (max - min) + 1;
        return (int) (Math.random() * value) + 1;
    }

    private static void drawsquares(int x, int y, Graphics graphics) {
        graphics.drawLine(x, y, x + 50, y);
        graphics.drawLine(x + 50, y, x + 50, y + 50);
        graphics.drawLine(x + 50, y + 50, x, y + 50);
        graphics.drawLine(x, y + 50, x, y);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}