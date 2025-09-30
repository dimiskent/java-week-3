package inheritance.exercises.ex3;

public class Teacher extends Person {
    private final String subject;
    private final int age;
    private final String name;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, My name is %s, I'm %d years old and I teach %s!\n", name, age, subject);
    }
}
