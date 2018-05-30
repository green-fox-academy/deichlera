import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Hero extends Character implements Move {

    public int level=1;


    public Hero(String filename, int posX, int posY, int maxHealthPoint, int currentHealthPoint, int defendPoint, int strikePoint, int level) {

        super(filename, posX, posY, maxHealthPoint, currentHealthPoint, defendPoint, strikePoint);
        setUpPoints();
    }

    public void setUpPoints() {
        maxHealthPoint = 20 + 3 * randomNumber(1, 6);
        currentHealthPoint = maxHealthPoint;
        defendPoint = 2 * randomNumber(1, 6);
        strikePoint = 5 + randomNumber(1, 6);
        return;
    }


    @Override
    public void move(String way, int nextField, int field) {
        if (way == "up") {
            if (nextField == 0) {
            } else {
                posY -= field;
            }
        } else if (way == "down") {
            if (nextField == 0) {
            } else {
                posY += field;
            }
        } else if (way == "left") {
            if (nextField == 0) {
            } else {
                posX -= field;
            }
        } else {
            if (nextField == 0) {
            } else {
                posX += field;
            }
        }

    }
}
