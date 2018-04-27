public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
        int par = 3;
        System.out.println(factorio(par));
    }

    private static int factorio(int temp) {
        temp = temp * temp;
        return temp;
    }
}
