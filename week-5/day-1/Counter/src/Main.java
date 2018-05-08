import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number!");
        int number = scanner.nextInt();
        Counter defaultCounter = new Counter(number);
        defaultCounter.get();
        defaultCounter.add();
        defaultCounter.get();
        defaultCounter.addMore(12);
        defaultCounter.get();
        defaultCounter.reset(number);
        defaultCounter.get();

    }
}
