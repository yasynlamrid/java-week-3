package encapsulation.examples;

/**
 * A class representing a bank account with encapsulated balance.
 */

public class BankAccount
{
    private final  String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter
    public double getBalance() {return balance;}

    // Deposit method
    public void deposit(double amount)
    {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
