package polymorphism;

import polymorphism.exercises.exercise4.*;
import polymorphism.exercises.exercise2.Calculator;
import polymorphism.exercises.exercise1.Animal;
import polymorphism.exercises.exercise1.Bird;
import polymorphism.exercises.exercise1.Dog;
import polymorphism.exercises.exercise3.CashPayment;
import polymorphism.exercises.exercise3.CreditCardPayment;
import polymorphism.exercises.exercise3.PayPalPayment;
import polymorphism.exercises.exercise3.Payment;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Polymorphism!");
        System.out.println("Exercise 1");
        Dog dog = new Dog();
        Bird bird = new Bird();
        Animal animal = new Animal();
        animal.eat();
        dog.eat();
        bird.eat();
        System.out.println("Exercise 2");
        Calculator calculator = new Calculator();
        System.out.println("1 + 2 = " + calculator.add(1, 2));
        System.out.println("1 + 2 + 3 = " + calculator.add(1, 2, 3));
        System.out.println("1.5 + 2.5 = " + calculator.add(1.5, 2.5));
        System.out.println("Exercise 3");

        List<Payment> paymentList = new ArrayList<>();
        paymentList.add(new PayPalPayment());
        paymentList.add(new CashPayment());
        paymentList.add(new CreditCardPayment());

        for(Payment payment : paymentList) {
            payment.pay(25);
        }

        System.out.println("Exercise 4");
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        for(Shape shape : shapes) {
            shape.draw();
        }
    }
}


