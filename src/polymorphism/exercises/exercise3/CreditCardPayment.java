package polymorphism.exercises.exercise3;

public class CreditCardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.2f using Credit Card\n", amount);
    }
}
