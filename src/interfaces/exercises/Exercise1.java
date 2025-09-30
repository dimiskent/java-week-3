package interfaces.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO:
 * Exercise 1:
 * Create a Student class with name and grade.
 * Implement Comparable<Student> so that students are sorted by grade.
 * In main(), add some students to a List and sort them using Collections.sort().
 * Print the sorted list.
 * Note : Comparable<T> interface (built-in in Java).
 */

public class Exercise1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Joe", 80));
        students.add(new Student("John", 40));
        students.add(new Student("Mark", 99));
        students.add(new Student("Mary", 60));
        System.out.println("Before sorting:");
        listStudents(students);
        students.sort(null);
        System.out.println("After sorting:");
        listStudents(students);
    }
    public static void listStudents(List<Student> students) {
        for(Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Grade: " + student.getGrade());
            System.out.println();
        }
    }
}

class Student implements Comparable<Student> {
    private final String name;
    private final int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student o) {
        int sourceGrade = this.grade;
        int targetGrade = o.getGrade();
        if(sourceGrade == targetGrade) {
            return 0;
        } else if (sourceGrade > targetGrade) {
            return 1;
        } else return -1;
    }
}