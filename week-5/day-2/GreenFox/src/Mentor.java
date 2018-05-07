public class Mentor extends Person {

    public String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        this("Jane Doe", 30, "female", "intermediate");
    }

    public String getGoal() {
        return "Educate brilliant junior software developers.";
    }

    public String introduce() {
        return "Hi, I'm " + name + " , a " + age + " year old " + gender + level + "mentor.";
    }
}
