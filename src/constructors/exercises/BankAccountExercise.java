package constructors.exercises;

public class BankAccountExercise {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount2 = new BankAccount("Joe123", 60);
        BankAccount bankAccount3 = new BankAccount("Derek949", 10);
        System.out.println("Account 1: " + bankAccount.getBalance());
        System.out.println("Account 2: " + bankAccount2.getBalance());
        System.out.println("Account 3: " + bankAccount3.getBalance());
        bankAccount3.deposit(50);
        bankAccount2.withdraw(30);
        System.out.println("After Account3 +50 & Account2 -30");
        System.out.println("Account 2: " + bankAccount2.getBalance());
        System.out.println("Account 3: " + bankAccount3.getBalance());
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
    }
}
