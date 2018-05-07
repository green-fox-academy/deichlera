import java.util.ArrayList;
import java.util.Arrays;

public class DiceSet {
    // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
    int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }


    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        diceSet.getCurrent();
        diceSet.roll();
        int[] current = diceSet.getCurrent();
        System.out.println(Arrays.toString(current));
        diceSet.untilAllSix(current);
        diceSet.getCurrent(5);
    }

    public void untilAllSix(int[] current) {
        for (int i = 0; i < 6; i++) {
            while (current[i] != 6) {
                reroll(i);
                System.out.println(Arrays.toString(current));
            }
        }
    }

}
