package inheritance.exercises.ex3;

public class Student extends Person {
    private final int grade;
    private final int age;
    private final String name;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, I'm a student! My name is %s, I'm %d years old and I have a %d/100 on my grades!\n", name, age, grade);
    }
}
