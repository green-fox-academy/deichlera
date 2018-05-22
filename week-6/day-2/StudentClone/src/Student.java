public class Student extends Person implements Cloneable{

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

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }


   // protected Object clone() throws CloneNotSupportedException {
     //   return super.clone();}


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Student john = new Student("John Doe", 20, "male", "BME");
}