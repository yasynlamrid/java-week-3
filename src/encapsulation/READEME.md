# 🔒 Encapsulation in Java

Encapsulation is one of the **four pillars of Object-Oriented Programming (OOP)**.
It means **hiding the internal state of a class** (its fields) and allowing controlled access through **methods** (getters, setters, and other business logic).

👉 Think of it like a **capsule**: the medicine (data) is hidden inside, and you only access it in a safe way.

---

## ✨ Why Encapsulation?

* ✅ Protects data from being changed directly
* ✅ Allows validation before updating fields
* ✅ Makes code easier to maintain and extend

---

## ✅ Example – BankAccount

```java
public class BankAccount 
{
    private String accountNumber;  // hidden
    private double balance;        // hidden

    // Constructor
    public BankAccount(String accountNumber, double balance) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter
    public double getBalance() { return balance;}
    
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
```

### 🔎 Explanation:

* `accountNumber` and `balance` are **private** → cannot be accessed directly from outside.
* `deposit()` and `withdraw()` act as **controlled access points**.
* Validation is added: you can’t deposit negative money or withdraw more than you have.

---

## 🎯 Learning Outcomes

By the end of this section, you should be able to:

- Declare fields as **private**
- Use **getters and setters** for controlled access
- Add **validation logic** inside methods
- Understand why encapsulation makes code safer and cleaner

---
