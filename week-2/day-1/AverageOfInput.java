import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give me 5 number in a row parted by spaces: ");
        int szam1=scanner.nextInt();
        int szam2=scanner.nextInt();
        int szam3=scanner.nextInt();
        int szam4=scanner.nextInt();
        int szam5=scanner.nextInt();
        int sum=szam1 + szam2 + szam3 + szam4 + szam5;
        System.out.println("Sum: " + sum + ", Average: " + sum/5);



    }

}
