import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    int width = 720;
    int height = 720;
    int[][] map2 = ddrawMapFroMe();


    PositionedImage hero = new PositionedImage("hero-down.png", 0, 0);


    public Board() {

        testBoxX = 0;
        testBoxY = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(width, height));
        setVisible(true);
    }


    public int[][] ddrawMapFroMe() {
        int[][] coord2 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int n = randomNumber(0, 10);
                if (i == 0 || i == j || i == (j + 1) || i == 9) {
                    coord2[i][j] = 1;
                } else if (n < 7) {
                    coord2[i][j] = 1;
                } else {
                    coord2[i][j] = 0;
                }
            }
        }
        return coord2;
    }


    private int randomNumber(int min, int max) {
        Random rand = new Random();
        int number = rand.nextInt(max) + min;
        return number;
    }

    public static void main(String[] args) {

        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();


        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener


    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        int indexX = 0;
        int indexY = 0;
        int x = 0;
        for (int i = 0; i < map2.length; i++) {
            int y = 0;
            for (int j = 0; j < map2.length; j++) {
                if (map2[i][j] == 1) {
                    PositionedImage image = new PositionedImage("floor.png", x, y);
                    image.draw(graphics);
                } else {
                    PositionedImage image = new PositionedImage("wall.png", x, y);
                    image.draw(graphics);
                }
                y += width / 10;
            }
            x += height / 10;
        }
        hero.draw(graphics);

    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= 100;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 100;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
