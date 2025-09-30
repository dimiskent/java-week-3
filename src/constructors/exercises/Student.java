package constructors.exercises;

/**
 TODO:
 1. Create class Student with:
      - private field name
      - private static field studentCount
 2. Each new Student should get a unique ID (increment studentCount).
 3. Add a method getStudentInfo() to print name and ID.
 4. Add a static method getTotalStudents().
*/

public class Student {
    private static int studentCount = 0;
    private int studentID;
    private String studentName;
    public Student(String name) {
        this.studentID = ++studentCount;
        this.studentName = name;
    }
    public void getStudentInfo() {
        System.out.println("Name: " + this.studentName);
        System.out.println("ID: " + this.studentID);
    }
    public static int getTotalStudents() {
        return studentCount;
    }
}
