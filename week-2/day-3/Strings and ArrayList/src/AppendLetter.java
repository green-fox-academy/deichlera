import java.util.*;

public class AppendLetter {
    public static void main(String... args) {
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        appendA(far);
    }

    private static void appendA(List<String> far) {
        for (int i = 0; i < far.size(); i++) {
            far.set(i, far.get(i) + 'a');
        }
        System.out.println(far);
    }
}

// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"