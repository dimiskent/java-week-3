package inheritance.exercises.ex3;

/**
 TODO:
 1. Create a superclass Person with fields name and age.
 2. Create subclasses Student and Teacher.
      - Student has field grade (double).
      - Teacher has field subject (String).
 3. Create a method introduce() in Person that prints a generic introduction.
      - Override introduce() in Student and Teacher with specialized messages.
 4. In main():
      - Create a List<Person>.
      - Add multiple Students and Teachers.
      - Loop through the list and call introduce() on each object.
        (Demonstrates polymorphism + inheritance).
*/

public class Person
{
    private final String name;
    private final int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce() {
        System.out.printf("Hi, my name is %s and I'm %d years old.\n", name, age);
    }
}
