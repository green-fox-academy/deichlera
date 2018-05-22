public class Main {
    public static void main(String[] args) {


        Student john = new Student("John", 20, "male", "BME");
        Student johnClone = new Student();

        try {
            johnClone = (Student) john.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        john.introduce();
        johnClone.introduce();



    }
}
