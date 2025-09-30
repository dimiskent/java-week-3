package inheritance.exercises.ex2;

public class Manager extends Employee {
    private String name;
    public Manager(String name, double salary) {
        super(name, salary);
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team");
    }
}
