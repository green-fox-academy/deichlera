public class Counter {

    public int counter;

    public Counter(int counter) {
        this.counter = counter;
    }

    public void add() {
        counter++;
    }

    public void addMore(int number) {
        for (int i = 0; i < number; i++) {
            add();
        }
    }

    public void get() {
        System.out.println("The current value of the counter is " + counter + ".");
    }

    public void reset(int defaultValue) {
        counter = defaultValue;
    }

    @Override
    public String toString() {
        return "The counter is " + counter + ".";
    }

    /*@Override
    public String toString() {
        return "Counter{" +
                "counter=" + counter +
                '}';
    }*/
}
