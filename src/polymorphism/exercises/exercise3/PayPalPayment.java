package polymorphism.exercises.exercise3;

public class PayPalPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.2f using PayPal\n", amount);
    }
}
