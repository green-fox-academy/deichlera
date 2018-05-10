public class Teacher {

    public String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void teach(Student student) {
        System.out.println("'Rise up'");
        student.learn();
    }

    public void answer() {
        System.out.println(this.name);
    }
}
