public class Animal {


    public int counter = 0;
    public int hunger;
    public int thirst;

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.counter = ++counter;
    }

    public Animal() {
        this(50, 50);
        this.counter = ++counter;
    }

    public void eat() {
        hunger++;
        System.out.println(this.counter + ". animal thanks for the food!");
    }

    public void drink() {
        thirst++;
        System.out.println(this.counter + ". animal thanks for the drink!");
    }

    public void play() {
        hunger--;
        thirst--;
        System.out.println(this.counter + ". animal: 'That was an awesome game!'");
    }

    @Override
    public String toString() {
        return "The " + this.counter + ". animal is " + this.hunger + " level hungry and " + this.thirst + " level thirsty now.";
    }
}
