package constructors.exercises;

/**
 TODO:
 1. Create class BankAccount with:
      - private fields accountNumber, balance
      - private static field accountCount
 2. Add constructors:
      - Default constructor → sets accountNumber="0000", balance=0
      - Parameterized constructor → sets accountNumber and balance
 3. Increment accountCount whenever a new account is created.
 4. Add methods deposit(), withdraw(), getBalance().
 5. Add static method getTotalAccounts().
 6. Test creating multiple accounts and check total accounts.
*/

public class BankAccount
{

    private String accountNumber;
    private double balance;
    private static int accountCount;
    public BankAccount(){
        accountNumber = "0000";
        balance = 0;
        accountCount = accountCount +1;

    }

    public BankAccount(String accountNumber, double balance ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountCount++;

    }

    public int getAcountCount(){
        return accountCount;
    }


    public void deposit(double amount){
        if(amount > 0 ){

            this.balance = this.balance + amount;
            System.out.println("Deposited: " + amount);

        }
        else {
            System.out.println("The amount is negatif ");

        }



    }
    public void withdraw(double amount){
        if(balance >= 0 && amount > 0 ){

            this.balance = this.balance - amount;
            System.out.println("Withdrew: " + amount);

        }
        else {

            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }

        System.out.println("Your new balance is : "  + balance);

    }

    public double getBalance(){

        return this.balance;
    }
    public static int getTotalAccounts() {
        return accountCount;
    }









}
