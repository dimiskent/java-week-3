package interfaces.exercises;

/**
 * TODO:
 * Exercise 3:
 * Create two interfaces: Flyable and Swimmable, each with a method (fly(), swim()).
 * Implement them in classes: Bird (can fly), Fish (can swim), and Duck (can both fly & swim).
 * Test them in Exercise3 class.
 */
public class Exercise3
{
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();
        Bird bird = new Bird();
        bird.fly();
        fish.swim();
        duck.fly();
        duck.swim();
    }
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying.");
    }
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Fish implements Swimmable {
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}