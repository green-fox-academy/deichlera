import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give me two numbers!");
        int szam1=scanner.nextInt();
        int szam2=scanner.nextInt();
        if (szam2<= szam1){
            System.out.println("The second number should be bigger");
        }
        else if (szam2>szam1){
            for (int i=szam1;i<szam2;i++){
                System.out.println(i);
            }
        }
    }
}
