import java.awt.*;

public class Character extends PositionedImage{

    PositionedImage image = new PositionedImage("hero-down.png", 0, 0);

    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public void paintHero(Graphics graphics) {
        image.draw(graphics);
    }
}
