import java.awt.*;
import java.awt.image.BufferedImage;

public class Character extends PositionedImage{

    PositionedImage image = new PositionedImage(filename, 0, 0);



    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

}
