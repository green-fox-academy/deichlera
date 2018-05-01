import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
        int[] aj = {3, 4, 5, 6, 7};
        reverseArray(aj);
        /*for (int i = 0; i < aj.length; i++) {
            System.out.printf("%d ", aj);
        }
        System.out.println();*/
        System.out.println(Arrays.toString(aj));
    }

    private static void reverseArray(int[] aj) {
        for (int i = 0; i < aj.length / 2; i++) {
            int j = aj.length - 1 - i;
            swapTwoElements(aj, i, j);
        }
    }

    private static void swapTwoElements(int[] aj, int first, int second) {
        int temp = aj[first];
        aj[first] = aj[second];
        aj[second] = temp;
    }

}
