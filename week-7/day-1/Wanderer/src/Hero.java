import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {


    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public void passOverPosition(Hero hero2) {
        hero2.posX = this.posX;
        hero2.posY = this.posY;

    }



}
