# 📘 Constructors & Static in Java

---

## 🏗 Constructors

A **constructor** is a special method used to initialize objects.
- Same name as the class
- No return type (not even `void`)
- Runs automatically when an object is created

### ✨ Types of Constructors
1. **Default constructor** → provided automatically if no constructor is written.
2. **Parameterized constructor** → accepts arguments to set initial values.
3. **Constructor chaining** → one constructor calls another using `this()`.

---

## ⚡ Static Members

- **Static field** → belongs to the *class*, not objects.
- **Static method** → can be called without creating an object.
- Shared across all instances of a class.

---

## ✅ Example 1 – Book with Multiple Constructors

```java
package constructors;
public class Book 
{
    private static int counter = 0; // static field shared by all books
    private int id;
    private String title;
    private String author;

    public static void main(String[] args) 
    {
        Book b1 = new Book();
        Book b2 = new Book("1984");
        Book b3 = new Book("Animal Farm", "George Orwell");

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();

        System.out.println("Total books created: " + Book.getBookCount());
    }

    // Default constructor
    public Book() 
    {
        this("Untitled", "Unknown"); // constructor chaining
    }

    // Parameterized constructor (title only)
    public Book(String title) 
    {
        this(title, "Unknown"); // chaining to another constructor
    }

    // Parameterized constructor (title + author)
    public Book(String title, String author) 
    {
        this.id = ++counter; // each new book gets unique ID
        this.title = title;
        this.author = author;
    }

    public void printInfo() 
    {
        System.out.println("Book #" + id + ": " + title + " by " + author);
    }

    // Static method
    public static int getBookCount() 
    {
        return counter;
    }
    
}
```
---

## 🎯 Learning Outcomes

- Differentiate between default and parameterized constructors
- Use constructor chaining with this()
- Understand how static fields/methods belong to the class
- Track shared state across objects using static variables