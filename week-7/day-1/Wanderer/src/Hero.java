import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Hero extends Character implements Move {


    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }


    @Override
    public void move(String way, int nextField, int field) {
        if (way=="up"){
            if (nextField == 0) {
            } else {
                posY -= field;
            }
        }
        else if (way=="down"){
            if (nextField == 0) {
            } else {
                posY += field;
            }
        }
        else if (way=="left"){
            if (nextField == 0) {
            } else {
                posX -= field;
            }
        }
        else {
            if (nextField == 0) {
            } else {
                posX += field;
            }
        }

    }
}
