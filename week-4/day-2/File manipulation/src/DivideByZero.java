import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number!");
        number = scanner.nextInt();

        try {
            dividebyten(number);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }

    private static void dividebyten(int number) {
        number = 10 / number;
        System.out.println(number);
    }
}
