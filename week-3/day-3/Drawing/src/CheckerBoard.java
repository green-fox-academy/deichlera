import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int size = 10;
        int number = HEIGHT / size;
        int x = 0;
        int y = 0;
        //fillermultiple(number);
        for (int j = 0; j < number; j++) {
            if (j % 2 == 0) {
                fillerBlackBeginning(x, y, size, graphics);
                y += size;
            } else {
                fillerWhiteBeginning(x, y, size, graphics);
                y += size;
            }
        }
    }

    private static void fillerWhiteBeginning(int x, int y, int size, Graphics graphics) {
        for (int i = 0; i < (WIDTH / size); i++) {
            if (i % 2 == 0) {
                graphics.setColor(Color.WHITE);
                graphics.fillRect(x, y, size, size);
                x += size;
            } else {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(x, y, size, size);
                x += size;
            }
        }
    }

    private static void fillerBlackBeginning(int x, int y, int size, Graphics graphics) {
        for (int i = 0; i < (WIDTH / size); i++) {
            if (i % 2 == 0) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(x, y, size, size);
                x += size;
            } else {
                graphics.setColor(Color.WHITE);
                graphics.fillRect(x, y, size, size);
                x += size;
            }
        }

    }

    // Don't touch the code below
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