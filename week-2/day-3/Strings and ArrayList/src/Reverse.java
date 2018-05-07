public class Reverse {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        reverse(reversed);
        //System.out.println(reverse(reversed));
    }

    public static void reverse(String reversed) {
        int hossz = reversed.length();
        char[] reversedChars = reversed.toCharArray();
        int j = hossz - 1;
        for (int i = 0; i < (hossz / 2); i++) {
            char temp = reversed.charAt(i);
            reversedChars[i] = reversed.charAt(j);
            reversedChars[j] = temp;
            j -= 1;
        }

        System.out.println(reversedChars);
    }

}
