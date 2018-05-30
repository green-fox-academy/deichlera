import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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


    Hero hero = new Hero("hero-down.png", posX, posY, 0, 0, 0, 0, 1);


    Hero heroUp = new Hero("hero-up.png", posX, posY, hero.maxHealthPoint, hero.currentHealthPoint, hero.defendPoint, hero.strikePoint, 0);
    Hero heroLeft = new Hero("hero-left.png", posX, posY, hero.maxHealthPoint, hero.currentHealthPoint, hero.defendPoint, hero.strikePoint, 0);
    Hero heroRight = new Hero("hero-right.png", posX, posY, hero.maxHealthPoint, hero.currentHealthPoint, hero.defendPoint, hero.strikePoint, 0);
    Hero heroDown = new Hero("hero-down.png", posX, posY, hero.maxHealthPoint, hero.currentHealthPoint, hero.defendPoint, hero.strikePoint, 0);


    Skeleton skeleton1 = new Skeleton("skeleton.png", posX, posY, hero, map2,0,0,0,0);
    Skeleton skeleton2 = new Skeleton("skeleton.png", posX, posY, hero, map2,0,0,0,0);
    Skeleton skeleton3 = new Skeleton("skeleton.png", posX, posY, hero, map2,0,0,0,0);
    ArrayList<Enemy> enemies = new ArrayList<>();

    Boss boss = new Boss("boss.png", posX, posY, hero, map2,0,0,0,0);

    public void getSkeletons(ArrayList enemies) {
        enemies.add(skeleton1);
        enemies.add(skeleton2);
        enemies.add(skeleton3);
        enemies.add(boss);
    }


    public String  writeOutStats(Hero hero) {
        return "Hero (Level " + hero.level + ") HP: " + hero.maxHealthPoint + "/" + hero.currentHealthPoint + " | " + "DP: " + hero.defendPoint + " | SP :" + hero.strikePoint;
    }

    public Board() {
        testBoxX = 0;
        testBoxY = 0;
        // set the size of your draw board
        setPreferredSize(new Dimension(width, height+ 30));
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

    public void paintEnemies(int count, Graphics graphics) {
        if (count == 0) {
            getSkeletons(enemies);
        }
        for (int i = 0; i < enemies.size(); i++) {
            enemies.get(i).draw(graphics);
        }
    }

    public void moveEnemies() {
        for (int i = 0; i < enemies.size(); i++) {
            if ((count % 2) == 0) {
                enemies.get(i).move(enemies.get(i), map2, height, width, xFieldLength);
            }
        }
    }

    public void moveHero(Hero newHero, String way) {
        hero.passOverCurrentPosition(newHero);
        hero.passOverCurrentPoints(newHero);
        hero = newHero;
        int nextField = hero.nextFieldIs(way, map2, height, width, xFieldLength);
        hero.move(way, nextField, xFieldLength);
        for (int i = 0; i < enemies.size(); i++) {
            if (enemies.get(i).posX==hero.posX && enemies.get(i).posY==hero.posY){
                battle();
            }
        }
        count++;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        paintMap(graphics);
        hero.draw(graphics);
        paintEnemies(count, graphics);
        String aD = writeOutStats(hero);
        graphics.drawString(aD, 0,740);
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
            moveHero(heroUp, "up");
            moveEnemies();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            moveHero(heroDown, "down");
            moveEnemies();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            moveHero(heroLeft, "left");
            moveEnemies();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            moveHero(heroRight, "right");
            moveEnemies();
        }
        repaint();
    }


}






