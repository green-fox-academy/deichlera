public class Student {

    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void learn() {
        System.out.println("'" + this.name + "'");
    }

    public void question(Teacher teacher) {
        System.out.println("Asking " );
        teacher.answer();

    }

}
