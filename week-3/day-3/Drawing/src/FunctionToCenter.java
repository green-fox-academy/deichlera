import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int x;
        int y;
        int lim = 0;
        int maxx = WIDTH / 20;
        int maxy = HEIGHT / 20;
        int pixelx = 0;
        int pixely = 0;
        int xr = randomInt(100, 200);
        System.out.println(xr);

        if (lim < maxx) {
            for (int i = 0; i < maxy; i++) {
                x = randomInt(pixelx, pixelx + 20);
                y = randomInt(pixely, pixely + 20);
                System.out.println("y=" + y);
                System.out.println("x=" + x);
                toCenter(x, y, graphics);
                pixelx += 20;
                lim++;
            }
        }
    }


    private static void toCenter(int x, int y, Graphics graphics) {
        int centerx = WIDTH / 2;
        int centery = HEIGHT / 2;
        graphics.drawLine(x, y, centerx, centery);
    }

    private static int randomInt(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
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