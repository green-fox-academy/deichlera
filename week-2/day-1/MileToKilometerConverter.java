import java.util.Scanner;

public class MileToKilometerConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give me a whole number!");
        int kilometer=scanner.nextInt();
        double miles=kilometer*0.621371192;
        System.out.println(kilometer + " km is " + miles + " miles.");

    }
}
