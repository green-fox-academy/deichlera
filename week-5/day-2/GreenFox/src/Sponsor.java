public class Sponsor extends Person {

    public String company;
    public int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        this("Jane Doe", 30, "female", "Google");
        this.hiredStudents = 0;
    }

    public String introduce() {
        return "Hi, I'm " + name + " , a " + age + " year old " + gender + " who represents " + company + "and hired " + hiredStudents + "students so far.";
    }

    public void hire() {
        hiredStudents++;
    }

    public String getGoal() {
        return "Hire brilliant junior software developers.";
    }
}
