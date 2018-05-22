public class Tree extends Plant {

    public Tree(String name, int waterAmount) {
        this.name=name;
        this.waterAmount=waterAmount;
    }

    @Override
    public boolean needsWater() {
        if (this.waterAmount < 10) {
            return true;
        }
        return false;
    }

    public void need() {
        if (this.waterAmount < 10) {
            needWater();
        } else {
            doesntNeedWater();
        }
    }

    public void needWater(){
        System.out.println("The " + this.name + " tree needs water.");
    }

    public void doesntNeedWater(){
        System.out.println("The " + this.name + " tree doesn't need water.");
    }

    @Override
    public void watering(int number) {
        this.waterAmount += (number * 0.4);
    }

}
