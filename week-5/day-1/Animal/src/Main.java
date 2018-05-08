public class Main {
    public static void main(String[] args) {

        Animal tiger = new Animal(21, 12);
        Animal fish = new Animal();

        tiger.drink();
        System.out.println(tiger);
        tiger.play();
        System.out.println(tiger);
        System.out.println(fish);
        fish.eat();
        System.out.println(fish);
    }
}
