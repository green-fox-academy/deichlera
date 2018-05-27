import java.util.ArrayList;
import java.util.Random;

public class Skeleton extends Character {


    public Skeleton(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }


    public void findCoordinates(Hero hero, ArrayList map, int height, int width, int coordinateX, int coordinateY) {
        coordinateX=randomNumber(0,10);
        coordinateY=randomNumber(0,10);
        int coordinate=convertFieldCoordinateToArrayCoordinate(coordinateX, coordinateY, 1, 720,720);
        coordinateX=convertArrayCoordinateToFieldCoordinatesX(coordinate, 0);
        coordinateY=convertArrayCoordinateToFieldCoordinatesY(coordinate, 0);
        int choosenFieldIs = (Integer) map.get(coordinate);
        if (choosenFieldIs==0){
            findCoordinates(hero, map, height, width, coordinateX, coordinateY);
        }
        else if (hero.posX==coordinateX || hero.posY==coordinateY){
            findCoordinates(hero, map, height, width, coordinateX, coordinateY);
        }
        else {
            //convertArrayCoordinateToFieldCoordinates(coordinate, 0,0);
            posX=coordinateX;
            posY=coordinateY;
        }
        return;
    }

    //duplication.. not good
    private int randomNumber(int min, int max) {
        Random rand = new Random();
        int number = rand.nextInt(max) + min;
        return number;
    }

    public void newSkeleton(Hero hero, ArrayList map, int height, int width, int coordinateX, int coordinateY) {
        findCoordinates(hero, map, height, width, coordinateX, coordinateY);
        //posX=coordinateX;
        //posY=coordinateY;
        //System.out.println("farf  " + posX+ " ídrg  " + posY);
    }

}

