package interfaces.exercises;

/**
 * TODO:
 * Exercise 2:
 * Define an interface Payment with a method pay(double amount).
 * Implement classes: PaypalPayment, BankTransferPayment.
 * Each class should print a custom payment message.
 * Write a Demo that processes both payments.
 */

public class Exercise2
{
    public static void main(String[] args) {
        PaypalPayment paypal = new PaypalPayment();
        BankTransferPayment bank = new BankTransferPayment();
        paypal.pay(21);
        bank.pay(21);
    }
}

interface Payment {
    void pay(double amount);
}

class PaypalPayment implements Payment {
    public void pay(double amount) {
        System.out.printf("Paid %s using PayPal\n", amount);
    }
}

class BankTransferPayment implements Payment {
    public void pay(double amount) {
        System.out.printf("Paid %s using Bank Transfer\n", amount);
    }
}