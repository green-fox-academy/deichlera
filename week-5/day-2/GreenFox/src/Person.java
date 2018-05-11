public class Person {
    //enum - hogy csak a male-ből v female-ből lehessen választani
    public String name;
    public int age;
    public String gender;


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this("Jane Doe", 30, "female");
    }


    public void introduce(String name, int age, String gender) {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

}
