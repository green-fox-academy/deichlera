import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
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
    int xFieldLength = width / 10;
    int yFieldLength = height / 10;
    int[][] map2 = drawMapForMe();
    int posX = 0;
    int posY = 0;


    Hero hero = new Hero("hero-down.png", posX, posY);
    Hero heroUp = new Hero("hero-up.png", posX, posY);
    Hero heroLeft = new Hero("hero-left.png", posX, posY);
    Hero heroRight = new Hero("hero-right.png", posX, posY);
    Hero heroDown = new Hero("hero-down.png", posX, posY);


    public Board() {
        testBoxX = 0;
        testBoxY = 0;
        // set the size of your draw board
        setPreferredSize(new Dimension(width, height));
        setVisible(true);
    }


    public int[][] drawMapForMe() {
        int[][] coord2 = new int[13][13];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int n = randomNumber(0, 10);
                if (i == 0 || i == j || i == (j + 1) || i == 9) {
                    coord2[i][j] = 1;
                } else if (n < 6) {
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


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
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
                y += yFieldLength;
            }
            x += xFieldLength;
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
            hero.passOverCurrentPosition(heroUp);
            hero = heroUp;
            int nextField = hero.nextFieldIs(map2, 0, yFieldLength, xFieldLength);
            if (nextField == 0) {
            } else if ((hero.posY - xFieldLength) < 0) {
            } else {
                hero.posY -= xFieldLength;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.passOverCurrentPosition(heroDown);
            hero = heroDown;
            int nextField = hero.nextFieldIs(map2, height, yFieldLength, xFieldLength);
            if (nextField == 0) {
            } else if ((hero.posY + xFieldLength) >= height) {
            } else {
                hero.posY += xFieldLength;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.passOverCurrentPosition(heroLeft);
            hero = heroLeft;
            int nextField = hero.nextFieldIs(map2,0, yFieldLength, xFieldLength);
            if (nextField == 0) {
            } else if ((hero.posX - yFieldLength) < 0) {
            } else {
                hero.posX -= yFieldLength;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.passOverCurrentPosition(heroRight);
            hero = heroRight;
            int nextField = hero.nextFieldIs(map2,  width, yFieldLength, xFieldLength);
            if (nextField == 0) {
            } else if ((hero.posX + yFieldLength) >= width) {
            } else {
                hero.posX += yFieldLength;
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }



}







