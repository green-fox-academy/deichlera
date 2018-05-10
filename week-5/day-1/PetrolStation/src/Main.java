public class Main {
    public static void main(String[] args) {

        Station station1 = new Station(10000);
        Car car1 = new Car(0, 100);

        station1.refill(car1);
        station1.refill(car1);
    }

}
