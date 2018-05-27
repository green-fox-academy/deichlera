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
    ArrayList<Integer> map2 = drawMap();
    int posX = 0;
    int posY = 0;
    int count = 0;


    Hero hero = new Hero("hero-down.png", posX, posY);
    Hero heroUp = new Hero("hero-up.png", posX, posY);
    Hero heroLeft = new Hero("hero-left.png", posX, posY);
    Hero heroRight = new Hero("hero-right.png", posX, posY);
    Hero heroDown = new Hero("hero-down.png", posX, posY);

    Skeleton skeleton = new Skeleton("skeleton.png", posX, posY, hero, map2);


    public Board() {
        testBoxX = 0;
        testBoxY = 0;
        // set the size of your draw board
        setPreferredSize(new Dimension(width, height));
        setVisible(true);
    }


    public ArrayList<Integer> drawMap() {
        ArrayList<Integer> coord2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int n = randomNumber(0, 10);
            if (i % 10 == 0 || i % 10 == 9 || i % 11 == 0 || i % 11 == 1) {
                coord2.add(1);
            } else if (n < 6) {
                coord2.add(1);
            } else {
                coord2.add(0);
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
        paintMap(graphics);
        hero.draw(graphics);
        skeleton.draw(graphics);
    }

    private void paintMap(Graphics graphics) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < map2.size(); i++) {
            if (map2.get(i) == 1) {
                PositionedImage image = new PositionedImage("floor.png", x, y);
                image.draw(graphics);
                x += xFieldLength;
            } else if (map2.get(i) == 0) {
                PositionedImage image = new PositionedImage("wall.png", x, y);
                image.draw(graphics);
                x += xFieldLength;
            }
            if (i % 10 == 9) {
                y += yFieldLength;
                x = 0;
            }
        }
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println(e.getKeyCode());
    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.passOverCurrentPosition(heroUp);
            hero = heroUp;
            int nextField = hero.nextFieldIs("up", map2, 0, yFieldLength, xFieldLength);
            hero.move("up", nextField, xFieldLength);
            count++;
            if ((count % 2) == 0) {
                skeleton.move(skeleton, map2, height, width, xFieldLength);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.passOverCurrentPosition(heroDown);
            hero = heroDown;
            int nextField = hero.nextFieldIs("down", map2, height, width, xFieldLength);
            hero.move("down", nextField, xFieldLength);
            count++;
            if ((count % 2) == 0) {
                skeleton.move(skeleton, map2, height, width, xFieldLength);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.passOverCurrentPosition(heroLeft);
            hero = heroLeft;
            int nextField = hero.nextFieldIs("left", map2, height, width, yFieldLength);
            hero.move("left", nextField, xFieldLength);
            count++;
            if ((count % 2) == 0) {
                skeleton.move(skeleton, map2, height, width, xFieldLength);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.passOverCurrentPosition(heroRight);
            hero = heroRight;
            int nextField = hero.nextFieldIs("right", map2, height, width, xFieldLength);
            hero.move("right", nextField, xFieldLength);
            count++;
            if ((count % 2) == 0) {
                skeleton.move(skeleton, map2, height, width, xFieldLength);
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }


}






