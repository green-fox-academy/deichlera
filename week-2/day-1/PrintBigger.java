import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give me two whole number, seperated with a space: ");
        int szam1=scanner.nextInt();
        int szam2=scanner.nextInt();
        if(szam1>szam2){
            System.out.println(szam1);
        }
        else {
            System.out.println(szam2);
        }
    }
}
