package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a Map<String, List<Integer>> grades.
    - Key = student name
    - Value = list of grades
 2. Add at least 3 students with multiple grades each.
 3. Print all students with their grades.
 4. Calculate and print the average grade for each student.
*/

public class Exercise4
{
    public static void main(String[] args) {
        Map<String, List<Integer>> students = new HashMap<>();
        students.put("Joe McCan", generateGrades(3));
        students.put("John Doe", generateGrades(6));
        // let's also do it the "classic" way
        List<Integer> studentGrades = new ArrayList<>();
        studentGrades.add(50);
        studentGrades.add(70);
        studentGrades.add(45);
        studentGrades.add(82);
        students.put("Maria Garcia", studentGrades);
        students.forEach((name, grades) -> {
            System.out.printf("Grades for %s: ", name);
            int total = 0;
            for(int grade : grades) {
                System.out.print(grade + "/100  ");
                total += grade;
            }
            double average = total / (double) grades.size();
            System.out.printf("\nAverage for %s: %.2f/100\n\n", name, average);
        });

        // old way
        /*
             for(String studentName : students.keySet()) {
                 System.out.printf("Grades for %s: ", studentName);
                 int total = 0;
                 for(int grade : students.get(studentName)) {
                     System.out.print(grade + "/100  ");
                     total += grade;
                 }
                 double average = total / (double) students.get(studentName).size();
                 System.out.printf("\nAverage for %s: %.2f/100\n\n", studentName, average);
             }
        */
    }
    public static List<Integer> generateGrades(int amount) {
        Random r = new Random();
        List<Integer> grades = new ArrayList<>();
        for(int i = 0; i < amount; i++) {
            grades.add(r.nextInt(101));
        }
        return grades;
    }
}
