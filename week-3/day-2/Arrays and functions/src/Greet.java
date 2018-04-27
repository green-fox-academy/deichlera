import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`
        String a1 = "Greenfox";
        greet(a1);
    }

    private static void greet(String asd) {
        System.out.printf("Greeting dear, %s", asd);
    }

}
