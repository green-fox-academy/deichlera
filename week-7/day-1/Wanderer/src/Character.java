import java.awt.*;
import java.awt.image.BufferedImage;

public class Character extends PositionedImage {

    PositionedImage image = new PositionedImage(filename, 0, 0);


    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }


    public int convertFieldCoordinateToArrayCoordinate(int xCoord, int yCoord, int givenField, int height, int width) {
        if (givenField == 0) {
            xCoord /= width;
            yCoord /= height;
        }
        int coord = (10 * yCoord) + xCoord;
        return coord;
    }

    /*public int convertArrayCoordinateToFieldCoordinates(int coord, int xCoord, int yCoord) {
        xCoord = (coord/10)*72;
        yCoord = (coord % 10)*72;
    }*/

    public int convertArrayCoordinateToFieldCoordinatesX(int coord, int xCoord) {
        xCoord = (coord/10)*72;
        return xCoord;
    }
    public int convertArrayCoordinateToFieldCoordinatesY(int coord, int yCoord) {
        yCoord = (coord % 10)*72;
        return yCoord;
    }

}
