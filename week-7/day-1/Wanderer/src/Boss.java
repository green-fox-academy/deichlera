import java.util.ArrayList;

public class Boss extends Enemy {


    public Boss(String filename, int posX, int posY, Hero hero, ArrayList map) {
        super(filename, posX, posY);
        findCoordinates(hero, map);
    }


}
