package inheritance.exercises.ex2;

/**
 TODO:
 1. Create a superclass Employee with:
      - name (String), salary (double).
      - method work() → prints "<name> is working".
 2. Create subclasses Developer and Manager:
      - Developer overrides work() → prints "<name> is writing code".
      - Manager overrides work() → prints "<name> is managing the team".
 3. Test both in a main class.
*/


public class Employee
{
    private final String name;
    private final double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void work() {
        System.out.println(name + " is working");
    }
}
