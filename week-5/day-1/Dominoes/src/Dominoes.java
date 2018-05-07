import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        order(dominoes);

    }

    private static void order(List<Domino> dominoes) {
        int[] dominoValue = dominoes.get(0).getValues();
        int dominoSecondValue = dominoValue[1];
        int[] nextDomino = new int[2];
        for (int i = 0; i < 6; i++) {
            nextDomino = searchForNextDomino(dominoes, dominoSecondValue, nextDomino);
            System.out.printf(Arrays.toString(nextDomino) + " ");
            dominoSecondValue = nextDomino[1];
        }
    }

    private static int[] searchForNextDomino(List<Domino> dominoes, int dominoSecondValue, int[] nextDomino) {
        for (int i = 0; i < 6; i++) {
            int[] dominoesValue = dominoes.get(i).getValues();
            int dominoFirstValue = dominoesValue[0];
            if (dominoSecondValue == dominoFirstValue) {
                nextDomino = dominoesValue;
            }
        }
        return nextDomino;
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }


}