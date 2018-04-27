import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
        int par = 7;
        System.out.println(sum(par));
    }

    private static int sum(int temp) {
        int summ = 0;
        for (int i = 1; i <= temp; i++) {
            summ += i;
        }
        return summ;
    }

}
