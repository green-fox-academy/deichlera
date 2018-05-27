import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Hero extends Character {


    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public void passOverCurrentPosition(Hero hero2) {
        hero2.posX = this.posX;
        hero2.posY = this.posY;

    }

    public int nextFieldIs(ArrayList map2, int dontLeaveMapInt, int field, int otherfield) {
        int nextFieldIs = 0;
        int first;
        if (this.filename == "hero-up.png") {
            first = this.posY - field;
            if (first < dontLeaveMapInt) {
            } else {
                int xCoord = this.posX / otherfield;
                int yCoord = (this.posY - field) / field;
                int coord = convertFieldCoordinateToArrayCoordinate(xCoord, yCoord, 1, 720, 720);
                nextFieldIs = (Integer) map2.get(coord);
            }
        } else if (this.filename == "hero-down.png") {
            first = this.posY + field;
            if (first >= dontLeaveMapInt) {
            } else {
                int xCoord = this.posX / otherfield;
                int yCoord = (this.posY + field) / field;
                int coord = convertFieldCoordinateToArrayCoordinate(xCoord, yCoord, 1,720, 720);
                nextFieldIs = (Integer) map2.get(coord);
            }
        } else if (this.filename == "hero-left.png") {
            first = this.posX - field;
            if (first < dontLeaveMapInt) {
            } else {
                int xCoord = (this.posX - field) / otherfield;
                int yCoord = this.posY / field;
                int coord = convertFieldCoordinateToArrayCoordinate(xCoord, yCoord, 1,720, 720);
                nextFieldIs = (Integer) map2.get(coord);
            }
        } else {
            first = this.posX + field;
            if (first >= dontLeaveMapInt) {
            } else {
                int xCoord = (this.posX + field) / otherfield;
                int yCoord = this.posY / field;
                int coord = convertFieldCoordinateToArrayCoordinate(xCoord, yCoord, 1,720, 720);
                nextFieldIs = (Integer) map2.get(coord);
            }
        }
        return nextFieldIs;
    }


}
