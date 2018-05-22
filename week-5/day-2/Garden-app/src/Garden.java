import java.util.ArrayList;
import java.util.List;

public class Garden {

    public ArrayList<Plant> plants = new ArrayList<Plant>();

    public int count;

    public void waterring(Garden garden, int number) {
        System.out.println("Watering with " + number);
        count = countNeedsWater(count);
        for (int i = 0; i < plants.size(); i++) {
            if (garden.needsWatter(i) == true) {
                this.plants.get(i).watering(number / count);
            }

        }
    }

    public boolean needsWatter(int i) {
        if (plants.get(i).needsWater() == true) {
            return true;
        }
        return false;
    }

    public int countNeedsWater(int count) {
        count = 0;
        for (int j = 0; j < plants.size(); j++) {
            if (plants.get(j).needsWater() == true) {
                count++;
            }
        }
        return count;
    }

}
