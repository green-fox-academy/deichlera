import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
        int x;
        int y;
        int width;
        int height;
        for (int i = 0; i < 4; i++) {
            x = randomInt(0, WIDTH);
            y = randomInt(0, HEIGHT);
            width = randomInt(0, WIDTH - x);
            height = randomInt(0, HEIGHT - y);
            int RCOMPONENT = randomInt(0, 255);
            int GCOMPONENT = randomInt(0, 255);
            int BCOMPONENT = randomInt(0, 255);
            graphics.setColor(new Color(RCOMPONENT, GCOMPONENT, BCOMPONENT));
            graphics.drawRect(x, y, width, height);
        }
    }

    private static int randomInt(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
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