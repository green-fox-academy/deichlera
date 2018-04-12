import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give me two numbers(not negatives please): ");
        int girls=scanner.nextInt();
        int boys=scanner.nextInt();
        int ossz=girls+boys;
        if (girls==0){
            System.out.println("Sausage party");
        }
        else if (ossz<20){
            System.out.println("Average party");
        }
        else if (boys == girls){
            System.out.println("The party is exellent!");
        }
        else {
            System.out.println("Quite cool party!");
        }
    }
}
