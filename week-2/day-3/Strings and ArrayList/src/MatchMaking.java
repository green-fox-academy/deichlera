import java.util.*;

public class MatchMaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...

        makingMatches(girls, boys);
    }

    public static void makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> girlsAndBoys = new ArrayList<String>();
        for (int i = 0; i < girls.size(); i++) {
            girlsAndBoys.add(girls.get(i));
            girlsAndBoys.add(boys.get(i));
        }
        System.out.println(girlsAndBoys);
    }
}
