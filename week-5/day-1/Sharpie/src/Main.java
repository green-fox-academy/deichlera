import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sharpie sharpie1 = new Sharpie("blue", 12.2f);

        Scanner scanner = new Scanner(System.in);

        System.out.println(sharpie1);
        sharpie1.use();
        System.out.println(sharpie1);
        System.out.println("How many times would you like to use the sharpie?");
        int number = scanner.nextInt();
        number = checkNumber(number);
        sharpie1.useManyTimes(number);
        System.out.println(sharpie1);

    }

    private static int checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        while (number > 100) {
            if (number > 100) {
                System.out.println("You can't use the sharpie more than 100 times, because you can't write with a sharpie with no ink!");
                System.out.println("Please give me an other number, less than 100!");
                number = scanner.nextInt();
            }
        }
        return number;
    }
}
