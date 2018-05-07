import java.util.ArrayList;
import java.util.List;


public class Fleet {
    private ArrayList<List> things;

    public Fleet() {
        things = new ArrayList<>();
    }

    public void add(ArrayList thing) {
        things.add(thing);
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < things.size(); i++) {
            result += (i+1) + ". " + things.get(i) + "\n";
        }
        return result;
    }
}