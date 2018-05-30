import java.util.ArrayList;

public class Boss extends Enemy {


    public Boss(String filename, int posX, int posY, Hero hero, ArrayList map, int maxHealthPoint, int currentHealthPoint, int defendPoint, int strikePoint) {
        super(filename, posX, posY, maxHealthPoint, currentHealthPoint, defendPoint, strikePoint);
        findCoordinates(hero, map);
        setUpPoints();
    }

    public void setUpPoints() {
        maxHealthPoint = 2 * 1 * randomNumber(1, 6) + randomNumber(1,6);
        currentHealthPoint = maxHealthPoint;
        defendPoint = (1/2) * randomNumber(1, 6) + randomNumber(1,6);
        strikePoint = 1 * randomNumber(1, 6) + 1;
        return;
    }

}
