public class Dog {
    private String name;
    private String breed;
    private int age;
    private boolean hasOwner;

    public Dog(String name, String breed, int age, boolean hasOwner) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.hasOwner = hasOwner;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return 2;
    }


}
