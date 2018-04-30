public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
        String[] abc = {"first", "second", "third"};
        swapTwo(abc, 0, 2);
        for (int i = 0; i < abc.length; i++) {
            System.out.printf("%s ", abc[i]);
        }
        System.out.println();
    }

    private static void swapTwo(String[] abc, int first, int second) {
        String temp = abc[first];
        abc[first] = abc[second];
        abc[second] = temp;
    }
}
