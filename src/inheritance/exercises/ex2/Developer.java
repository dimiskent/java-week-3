package inheritance.exercises.ex2;

public class Developer extends Employee {
    private String name;
    public Developer(String name, double salary) {
        super(name, salary);
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code");
    }
}
