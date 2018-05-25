import java.awt.*;
import java.awt.image.BufferedImage;

public class Character extends PositionedImage {

    PositionedImage image = new PositionedImage(filename, 0, 0);


    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }


    public int convertFieldCoordinateXToArrayElement(int field) {
        int xCoord = this.posX / field;
        posX = xCoord;
        return posX;
    }

    public int convertFieldCoordinateYToArrayElement(int field) {
        int yCoord = this.posY / field;
        posY = yCoord;
        return posY;
    }

    public void convertArrayElementToXFieldCoordinates(int firstElement, int field) {
        this.posX = firstElement * field;
    }

    public void convertArrayElementToYFieldCoordinates(int secondElement, int field) {
        this.posY = secondElement * field;
    }

}
