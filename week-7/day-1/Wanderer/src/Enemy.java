import java.util.ArrayList;
import java.util.Random;

public class Enemy extends Character {

    public Enemy(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public int coordinateX;
    public int coordinateY;


    public void findCoordinates(Hero hero, ArrayList map) {
        coordinateX = randomNumber(0, 10);
        coordinateY = randomNumber(0, 10);
        int coordinate = convertFieldCoordinateToArrayCoordinate(coordinateX, coordinateY, 1, 720, 720);
        coordinateX = convertArrayCoordinateToFieldCoordinatesY(coordinate, 0);
        coordinateY = convertArrayCoordinateToFieldCoordinatesX(coordinate, 0);
        int choosenFieldIs = (Integer) map.get(coordinate);
        if (choosenFieldIs == 0) {
            findCoordinates(hero, map);
        } else if (hero.posX == coordinateX || hero.posY == coordinateY) {
            findCoordinates(hero, map);
        } else {
            posX = coordinateX;
            posY = coordinateY;
            System.out.println(choosenFieldIs);
        }
        return;
    }

    //duplication.. not good
    private int randomNumber(int min, int max) {
        Random rand = new Random();
        int number = rand.nextInt(max) + min;
        return number;
    }


    public String whereToMove(ArrayList map, int height, int width, int field) {
        String random = null;
        random = randomNextField();
        int theFieldIs = nextFieldIs(random, map, height, width, field);
        while (theFieldIs == 0) {
            random = randomNextField();
            theFieldIs = nextFieldIs(random, map, height, width, field);
        }
        return random;
    }

    public String randomNextField() {
        Random randomizer = new Random();
        String random = ways.get(randomizer.nextInt(ways.size()));
        return random;
    }


    public void moveSkeleton(String way, int field) {
        if (way == "up") {
            posY -= field;
        } else if (way == "down") {
            posY += field;
        } else if (way == "left") {
            posX -= field;
        } else {
            posX += field;
        }
    }

    public void move(Enemy enemy, ArrayList map2, int height, int width, int xFieldLength) {
        passOverCurrentPosition(enemy);
        String way = whereToMove(map2, height, width, xFieldLength);
        moveSkeleton(way, xFieldLength);
    }
}


