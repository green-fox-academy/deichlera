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


    public String introduce(String name, int age, String gender) {
        return "Hi, I'm " + name + " , a " + age + " year old " + gender + ".";
    }

    public String getGoal() {
        return "My goal is: Live for the moment!";
    }

}
