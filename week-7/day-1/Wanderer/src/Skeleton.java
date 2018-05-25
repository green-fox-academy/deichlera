import java.awt.*;
import java.util.Random;

public class Skeleton extends Character {


    public Skeleton(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public int findXCoordinate(Hero hero, int[][] map, int field) {
        posX = randomNumber(0, 10);
        posY = randomNumber(0, 10);
        int convertedHeroX=
        //convertArrayElementToXFieldCoordinates(posX, field);
        if (map[posX][posY] == 0) {
            findXCoordinate(hero, map, field);
        } else if ((convertArrayElementToXFieldCoordinates(posX, field))==hero.posX || ) {
            findXCoordinate(hero, map, field);
        } else {
            return posX;
        }
        return posX;
    }

    public int findYCoordinate(Hero hero, int field) {
        posY = randomNumber(0, 10);
        convertArrayElementToYFieldCoordinates(posY, field);
        if (posY == hero.posY) {
            findYCoordinate(hero, field);
        } else if (convertFieldCoordinatesToArrayElement(field) == 0) {
            findYCoordinate(hero, field);
        } else {
            return posY;
        }
        return posY;
    }

    public void findCoordinates(Hero hero, int field) {
        posX = findXCoordinate(hero, field);
        posY = findYCoordinate(hero, field);
    }

    //duplication.. not good
    private int randomNumber(int min, int max) {
        Random rand = new Random();
        int number = rand.nextInt(max) + min;
        return number;
    }

    public void newSkeleton(Hero hero, int field) {
        findCoordinates(hero, field);
    }

}
 /*public int findXCoordinate(Hero hero, int field) {
        posX= randomNumber(0, 10);
        convertArrayElementToXFieldCoordinates(posX, field);
        if (posX == hero.posX) {
            findXCoordinate(hero, field);
        } else if (convertFieldCoordinatesToArrayElement(field) == 0) {
            findXCoordinate(hero, field);
        } else {
            return posX;
        }
        return posX;
    }

    public int findYCoordinate(Hero hero, int field) {
        posY = randomNumber(0, 10);
        convertArrayElementToYFieldCoordinates(posY, field);
        if (posY == hero.posY) {
            findYCoordinate(hero, field);
        } else if (convertFieldCoordinatesToArrayElement(field) == 0) {
            findYCoordinate(hero, field);
        } else {
            return posY;
        }
        return posY;
    }

    public void findCoordinates(Hero hero, int field) {
        posX = findXCoordinate(hero, field);
        posY = findYCoordinate(hero, field);
    }

    //duplication.. not good
    private int randomNumber(int min, int max) {
        Random rand = new Random();
        int number = rand.nextInt(max) + min;
        return number;
    }

    public void newSkeleton(Hero hero, int field) {
        findCoordinates(hero, field);
    }
*/