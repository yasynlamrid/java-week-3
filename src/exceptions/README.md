# ⚠️ Exceptions in Java

---

## 🔎 Errors vs Exceptions

| Feature      | Errors (serious)                         | Exceptions (recoverable)              |
|--------------|------------------------------------------|---------------------------------------|
| Meaning      | Problems in JVM/system                   | Problems in program logic             |
| Recoverable? | ❌ No (program usually stops)             | ✅ Yes (can be caught)                 |
| Checked?     | Not checked                              | Checked by compiler/runtime           |
| Examples     | `OutOfMemoryError`, `StackOverflowError` | `NullPointerException`, `IOException` |

👉 **Key idea**:  
- **Exceptions** = problems you can handle.  
- **Errors** = critical issues you usually don’t handle.  

---

## 🏗 Types of Exceptions

1. **Checked Exceptions (compile time)**  
   - Must handle with `try-catch` or `throws`.  
   - Example: `IOException`, `SQLException`.  

2. **Unchecked Exceptions (runtime)**  
   - Happen while running the program.  
   - Not checked at compile time.  
   - Example: `NullPointerException`, `ArithmeticException`.  

3. **Errors**  
   - Serious issues.  
   - Example: `OutOfMemoryError`, `StackOverflowError`.  

---

## 📚 Exception Hierarchy (Simple)

```txt
Throwable
 ├── Error               (serious problems)
 └── Exception
       ├── Checked       (IOException, SQLException)
       └── Unchecked     (RuntimeException)
````

---

## 📋 Common Java Exceptions

### ✅ Checked Exceptions

* `IOException` → Input/output problem
* `FileNotFoundException` → File not found
* `SQLException` → Database error
* `ClassNotFoundException` → Class missing
* `InterruptedException` → Thread interrupted

### ⚡ Unchecked Exceptions (Runtime)

* `NullPointerException` → Using null object
* `ArrayIndexOutOfBoundsException` → Wrong array index
* `ArithmeticException` → Divide by zero
* `NumberFormatException` → Bad string-to-number conversion
* `ClassCastException` → Wrong type casting
* `IllegalArgumentException` → Bad argument passed

### ❌ Errors

* `OutOfMemoryError` → JVM ran out of memory
* `StackOverflowError` → Infinite recursion
* `VirtualMachineError` → JVM failure
* `LinkageError` → Class linking problem

---

## 🛠 How to Handle Exceptions

### 1. Using **try-catch**

```java
public class Example1 
{
    public static void main(String[] args) 
    {
        try 
        {
            int result = 10 / 0; // risky code
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
```

### 2. Using **try-catch-finally**

```java
public class Example2 
{
    public static void main(String[] args) 
    {
        try 
        {
            String text = null;
            System.out.println(text.length());
        } 
        catch (NullPointerException e) 
        {
            System.out.println("Caught a null pointer!");
        } 
        finally 
        {
            System.out.println("This block always runs.");
        }
    }
}
```

### 3. Declaring with **throws**

```java
import java.io.*;

public class Example3 
{
    public static void readFile() throws IOException 
    {
        FileReader fr = new FileReader("data.txt");
    }
    
    public static void main(String[] args) 
    {
        try 
        {
            readFile();
        } 
        catch (IOException e) 
        {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
```

### 4. Creating a **Custom Exception**

```java
class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String message) 
    {
        super(message);
    }
}

public class Example4 
{
    static void checkAge(int age) throws InvalidAgeException 
    {
        if (age < 18) 
        {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }
    public static void main(String[] args) 
    {
        try 
        {
            checkAge(15);
        } 
        catch (InvalidAgeException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```

---

## 🎯 Key Takeaways

* Use `try-catch` to **handle problems gracefully**.
* Use `finally` for code that must always run (like closing files).
* Use `throws` to **pass responsibility** to the caller.
* Create **custom exceptions** for application-specific rules.
* Don’t catch `Error` (like `OutOfMemoryError`) — usually fatal.

---
