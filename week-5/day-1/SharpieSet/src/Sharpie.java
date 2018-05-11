public class Sharpie {

    public String color;
    public float width;
    public float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void use() {
        inkAmount--;
    }

    public void useManyTimes(int number) {
        for (int i = 0; i < number; i++) {
            use();
        }
    }

    @Override
    public String toString() {
        return "This sharpie is " + this.color + ", " + this.width + " wide and the ink is " + this.inkAmount + "% full.";
    }
}
