package encapsulation.exercises;

public class EmployeeExercise {
    public static void main(String[] args) {
        Employee myEmployee = new Employee("John Doe", 500);
        System.out.println("Name: " + myEmployee.getName());
        System.out.println("Initial Salary: " + myEmployee.getSalary());
        System.out.println("Set to -1...");
        myEmployee.setSalary(-1);
        System.out.println("Salary stays " + myEmployee.getSalary());
        System.out.println("Set to 10.4");
        myEmployee.setSalary(10.4);
        System.out.println("Salary: " + myEmployee.getSalary());
        System.out.println("Raise by 4.6");
        myEmployee.giveRaise(4.6);
        System.out.println("After raise: " + myEmployee.getSalary());
    }
}
