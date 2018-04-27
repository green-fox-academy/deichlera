import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBox {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        int size;
        int center1 = WIDTH/2;
        for (int i = 0; i < 3; i++) {
            size = randomInt(0,center1);
            drawsquare(size, graphics);
        }
    }

    private static int randomInt(int min, int max) {
        int range = (max - min)+1;
        return (int) (Math.random() * range) + min;
    }

    private static void drawsquare(int size, Graphics graphics) {
        int center1 = WIDTH/2;
        int center2 = HEIGHT/2;
        graphics.drawLine(center1-(size/2),center2-(size/2),center1+(size/2),center2-(size/2));
        graphics.drawLine(center1+(size/2),center2-(size/2),center1+(size/2),center2+(size/2));
        graphics.drawLine(center1+(size/2),center2+(size/2),center1-(size/2),center2+(size/2));
        graphics.drawLine(center1-(size/2),center2+(size/2),center1-(size/2),center2-(size/2));
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}