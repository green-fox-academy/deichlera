import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Character extends PositionedImage {

    public int maxHealthPoint;
    public int currentHealthPoint;
    public int defendPoint;
    public int strikePoint;

    List<String> ways = Arrays.asList("up", "down", "left", "right");

    public Character(String filename, int posX, int posY, int maxHealthPoint, int currentHealthPoint, int defendPoint, int strikePoint) {
        super(filename, posX, posY);
    }

    public void passOverCurrentPosition(Character character) {
        character.posX = this.posX;
        character.posY = this.posY;
    }

    public void passOverCurrentPoints(Character character) {
        character.maxHealthPoint = this.maxHealthPoint;
        character.currentHealthPoint = this.currentHealthPoint;
        character.defendPoint = this.defendPoint;
        character.strikePoint = this.strikePoint;
    }

    public int randomNumber(int min, int max) {
        Random rand = new Random();
        int number = rand.nextInt(max) + min;
        return number;
    }


    public int convertFieldCoordinateToArrayCoordinate(int xCoord, int yCoord, int givenField, int height, int width) {
        if (givenField == 0) {
            xCoord /= width;
            yCoord /= height;
        }
        int coord = (10 * yCoord) + xCoord;
        return coord;
    }

    public int convertArrayCoordinateToFieldCoordinatesX(int coord, int xCoord) {
        xCoord = (coord / 10) * 72;
        return xCoord;
    }

    public int convertArrayCoordinateToFieldCoordinatesY(int coord, int yCoord) {
        yCoord = (coord % 10) * 72;
        return yCoord;
    }

    public int nextFieldIs(String way, ArrayList map2, int height, int width, int field) {
        int nextFieldIs = 0;
        int first;
        if (way == "up") {
            first = this.posY - field;
            if (first < 0) {
            } else {
                int xCoord = this.posX / field;
                int yCoord = (this.posY - field) / field;
                int coord = convertFieldCoordinateToArrayCoordinate(xCoord, yCoord, 1, 720, 720);
                nextFieldIs = (Integer) map2.get(coord);
            }
        } else if (way == "down") {
            first = this.posY + field;
            if (first >= height) {
            } else {
                int xCoord = this.posX / field;
                int yCoord = (this.posY + field) / field;
                int coord = convertFieldCoordinateToArrayCoordinate(xCoord, yCoord, 1, 720, 720);
                nextFieldIs = (Integer) map2.get(coord);
            }
        } else if (way == "left") {
            first = this.posX - field;
            if (first < 0) {
            } else {
                int xCoord = (this.posX - field) / field;
                int yCoord = this.posY / field;
                int coord = convertFieldCoordinateToArrayCoordinate(xCoord, yCoord, 1, 720, 720);
                nextFieldIs = (Integer) map2.get(coord);
            }
        } else {
            first = this.posX + field;
            if (first >= width) {
            } else {
                int xCoord = (this.posX + field) / field;
                int yCoord = this.posY / field;
                int coord = convertFieldCoordinateToArrayCoordinate(xCoord, yCoord, 1, 720, 720);
                nextFieldIs = (Integer) map2.get(coord);
            }
        }
        return nextFieldIs;
    }

    public void strike(KeyEvent e, Character hero, Character enemy, int count, ArrayList enemies) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (count % 2 == 0) {
                int calculatedStrikePoint = 2 * randomNumber(1, 6) + hero.strikePoint;
                enemy.currentHealthPoint -= calculatedStrikePoint;
                count++;
                if (hero.currentHealthPoint>0 && enemy.currentHealthPoint>0) {
                    strike(e, hero, enemy, count, enemies);
                }
                else if(enemy.currentHealthPoint<0){
                    enemies.remove(enemy);
                }
            } else if (count % 2 == 1) {
                int calculatedStrikePoint = 2 * randomNumber(1, 6) + enemy.strikePoint;
                hero.currentHealthPoint -= calculatedStrikePoint;
                count++;
                if (hero.currentHealthPoint>0 && enemy.currentHealthPoint>0) {
                    strike(e, hero, enemy, count, enemies);
                }
            }
        }
    }

}
