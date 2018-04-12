import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give me a number!");
        int szam=scanner.nextInt();
        String csillag="*";
        for(int i=1;i<=szam;i++){
            System.out.println(csillag);
            csillag+="*";
            }
        }
    }

