public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        int elsohely = quote.indexOf(" you");
        //System.out.println(kezdo);
        int kezdo = quote.length() - elsohely;
        quote = new StringBuilder(quote).insert(quote.length() - kezdo, " always takes longer than").toString();
        System.out.println(quote);
    }
}
