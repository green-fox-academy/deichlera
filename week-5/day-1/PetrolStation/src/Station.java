public class Station {

    public int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car) {
        car.gasAmount += car.capacity;
        gasAmount -= car.capacity;
        car.capacity = 0;
        System.out.println("The capacitiy of the station after this refill: " + gasAmount);
    }

}