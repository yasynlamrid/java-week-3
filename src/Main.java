import constructors.exercises.BankAccount;

public class Main
{
    public static void main(String[] args)
    {
        // Create accounts
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("1234", 500.0);
        BankAccount acc3 = new BankAccount("5678", 1000.0);

        // Test deposits and withdrawals
        acc2.deposit(200.0);
        acc3.withdraw(300.0);

        // Print balances
        System.out.println("Balance of acc1: " + acc1.getBalance());
        System.out.println("Balance of acc2: " + acc2.getBalance());
        System.out.println("Balance of acc3: " + acc3.getBalance());


    }
}


