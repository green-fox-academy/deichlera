import java.util.ArrayList;


public class Skeleton extends Enemy {

    public Skeleton(String filename, int posX, int posY, Hero hero, ArrayList map) {
        super(filename, posX, posY);
        findCoordinates(hero, map);
    }



}
