import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();

        Flower flower1 = new Flower("Yellow", 0);
        Flower flower2 = new Flower("Blue", 0);
        Tree tree1 = new Tree("Purple", 0);
        Tree tree2 = new Tree("Orange", 0);

        garden.plants.add(flower1);
        garden.plants.add(flower2);
        garden.plants.add(tree1);
        garden.plants.add(tree2);

        isThePlantNeedWatering(garden);
        garden.waterring(garden,40);
        isThePlantNeedWatering(garden);
        garden.waterring(garden,70);
        isThePlantNeedWatering(garden);
    }

    public static void isThePlantNeedWatering(Garden garden){
        for (int i = 0; i < garden.plants.size(); i++) {
            garden.plants.get(i).need();
        }
    }


}
