public class Flower extends Plant {

    public Flower(String name, int waterAmount) {
        this.name = name;
        this.waterAmount = waterAmount;
    }


    @Override
    public boolean needsWater() {
        if (this.waterAmount < 5) {
            return true;
        }
        return false;
    }

    public void need(){
        if (this.waterAmount < 5){
            needWater();
            return;
        }
        doesntNeedWater();
    }


    public void needWater(){
        System.out.println("The " + this.name + " flower needs water.");
    }

    public void doesntNeedWater(){
        System.out.println("The " + this.name + " flower doesn't need water.");
    }

    @Override
    public void watering(int number) {
        this.waterAmount += (number * 0.75);
    }
}
