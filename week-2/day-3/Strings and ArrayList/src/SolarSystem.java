import java.util.*;

public class SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.
        putSaturn(planetList);
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"

    }

    public static void putSaturn(ArrayList<String> planetList) {
        planetList.add("Saturn");
        for (int i = 0; i < planetList.size(); i++) {
            System.out.println(planetList.get(i));
        }
        System.out.println(planetList);
        System.out.println(Arrays.toString(planetList.toArray()));
    }


}