import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int color;
        int center1 = WIDTH / 2;
        int RCOMPONENT;
        int GCOMPONENT;
        int BCOMPONENT;
        for (int size = center1; size > 0; size--) {
            //color = ;
            rainbowboxfunction(size, graphics);
        }

    }

    private static void rainbowboxfunction(int size, Graphics graphics) {
        int center1 = WIDTH / 2;
        int center2 = HEIGHT / 2;
        int RCOMPONENT = randomInt(0, 255);
        int GCOMPONENT = randomInt(0, 255);
        int BCOMPONENT = randomInt(0, 255);
        //graphics.drawLine(center1-(size/2),center2-(size/2),center1+(size/2),center2-(size/2));
        //graphics.drawLine(center1+(size/2),center2-(size/2),center1+(size/2),center2+(size/2));
        //graphics.drawLine(center1+(size/2),center2+(size/2),center1-(size/2),center2+(size/2));
        //graphics.drawLine(center1-(size/2),center2+(size/2),center1-(size/2),center2-(size/2));
        graphics.setColor(new Color(RCOMPONENT, GCOMPONENT, BCOMPONENT));
        graphics.fillRect((WIDTH - (size * 2)) / 2, (HEIGHT - (size * 2)) / 2, size * 2, size * 2);
    }

    private static int randomInt(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
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