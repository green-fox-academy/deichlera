import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give me a whole number: ");
        int szam=scanner.nextInt();
        if ((szam & 1) == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
            }
}
