import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give me a number:");
        int number=scanner.nextInt();
        int sum=0;
        for (int i = 0; i < number; i++) {
            System.out.println("Please give me an integer again:");
            int anInteger=scanner.nextInt();
            sum+=anInteger;
        }
        int average=sum/number;
        System.out.println("The sum of your integers: " + sum);
        System.out.println("The average of your integers: " + average);
    }
}
