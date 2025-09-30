package constructors.exercises;

public class StudentExercise {
    public static void main(String[] args) {
        Student student1 = new Student("Joe");
        Student student2 = new Student("Mary");
        Student student3 = new Student("Marc");
        student1.getStudentInfo();
        student2.getStudentInfo();
        student3.getStudentInfo();
        System.out.println("Total: " + Student.getTotalStudents());
    }
}
