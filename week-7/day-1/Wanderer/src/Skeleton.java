import java.util.ArrayList;


public class Skeleton extends Enemy {

    public Skeleton(String filename, int posX, int posY, Hero hero, ArrayList map, int maxHealthPoint, int currentHealthPoint, int defendPoint, int strikePoint) {
        super(filename, posX, posY, maxHealthPoint, currentHealthPoint, defendPoint, strikePoint);
        findCoordinates(hero, map);
        setUpPoints();
    }

    public void setUpPoints() {
        maxHealthPoint = 2 * 1 * randomNumber(1, 6);
        currentHealthPoint = maxHealthPoint;
        defendPoint = (1/2) * randomNumber(1, 6);
        strikePoint = 1 * randomNumber(1, 6);
        return;
    }



}
