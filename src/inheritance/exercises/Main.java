package inheritance.exercises;

import inheritance.exercises.ex1.*;
import inheritance.exercises.ex2.Developer;
import inheritance.exercises.ex2.Manager;
import inheritance.exercises.ex3.Person;
import inheritance.exercises.ex3.Student;
import inheritance.exercises.ex3.Teacher;
import inheritance.exercises.ex4.Circle;
import inheritance.exercises.ex4.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal = new Animal();
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
        System.out.println("Exercise 2");
        Developer developer = new Developer("John Doe", 200);
        Manager manager = new Manager("Alex Kingston", 580.3);
        developer.work();
        manager.work();
        System.out.println("Exercise 3");
        Person person = new Person("John", 20);
        Student student = new Student("Joe", 20, 90);
        Teacher teacher = new Teacher("Eliot", 54, "Mathematics");
        person.introduce();
        student.introduce();
        teacher.introduce();
        System.out.println("Exercise 4");
        Circle circle = new Circle(200);
        Rectangle rectangle = new Rectangle(8, 4);
        System.out.println("Area of a circle (200) => " + circle.getArea());
        System.out.println("Area of a rectangle (8,4) => " + rectangle.getArea());
    }
}
