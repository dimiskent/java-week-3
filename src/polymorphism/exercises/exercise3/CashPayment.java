package polymorphism.exercises.exercise3;

public class CashPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.2f using Cash\n", amount);
    }
}
