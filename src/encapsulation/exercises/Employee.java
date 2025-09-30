package encapsulation.exercises;

/**
 TODO:
 1. Create private fields: name (String), salary (double).
 2. Write a constructor to initialize both.
 3. Add getters for both fields.
 4. Add a setter for salary that does NOT allow negative values.
 5. Create a method giveRaise(double amount) that increases salary.
 */
public class Employee
{
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary < 0 ? 0 : salary;
    }
    public void setSalary(double salary) {
        if(salary < 0)
            System.out.println("Value must be positive");
        else
            this.salary = salary;
    }
    public void giveRaise(double amount) {
        salary += amount;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
