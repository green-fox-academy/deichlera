public class Student extends Person {

    public String previousOrganization;
    public int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this("Jane Doe", 30, "female", "The School Of Life");
        this.skippedDays = 0;
    }

    public String getGoal() {
        return "Be a junior software developer.";
    }

    public String introduce() {
        return "Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + "who skipped " + skippedDays + "days from the course already.";
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}
