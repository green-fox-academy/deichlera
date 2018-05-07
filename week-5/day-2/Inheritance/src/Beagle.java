public class Beagle extends Dog{ //is-a

    private boolean toBeCute;

    public Beagle(String name, String breed, int age, boolean hasOwner, boolean toBeCute) {
        super(name, breed, age, hasOwner);
        this.toBeCute = toBeCute; //super van elöl, de am this
    }

    @Override
    public String toString() {
        return "Beagle{" + "toBeCute=" + toBeCute + '\n' + super.toString();
    }

    public boolean isToBeCute() {
        return toBeCute;
    }

    public void setToBeCute(boolean toBeCute) {
        this.toBeCute = toBeCute;
    }


}
