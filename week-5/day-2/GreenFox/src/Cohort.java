import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {

    public String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();

    public Cohort(String name) {
        this.name = name;
        this.mentors= new ArrayList<>() ;
        this.students= new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info(){
        System.out.println("The " + this.name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }

}
