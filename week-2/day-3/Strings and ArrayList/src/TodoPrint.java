public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        int elsohely = todoText.indexOf(" ");
        int kezdo = todoText.length() - elsohely;
        //todoText = ;
        todoText = new StringBuilder(todoText).insert(todoText.length() - kezdo, "My todo:\n").toString();
        todoText = new StringBuilder(todoText).insert(todoText.length(), " - Download games\n").toString();
        todoText = new StringBuilder(todoText).insert(todoText.length(), "      - Diablo").toString();
        System.out.println(todoText);
    }
}