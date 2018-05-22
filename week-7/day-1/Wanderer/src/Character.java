import java.awt.*;

public class Character {

    PositionedImage image = new PositionedImage("hero-down.png", 0, 0);

    public void paintHero(Graphics graphics) {
        image.draw(graphics);
    }
}
