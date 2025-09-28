# 🔌 Interfaces in Java

An **interface** in Java is a **contract** that defines methods a class must implement.  
It provides **abstraction** and supports **multiple inheritance** of type.

---

## ✨ Key Points

- Defined with the `interface` keyword.
- Can only contain:
    - **abstract methods** (before Java 8, all methods were abstract).
    - **default methods** (Java 8+) → methods with a body.
    - **static methods** (Java 8+).
    - **constants** (implicitly `public static final`).
- A class implements an interface using `implements`.
- A class can implement **multiple interfaces**.

---

## ✅ Example 1 – Basic Interface

```java
package week4.interfaces;

interface Animal 
{
    void makeSound(); // abstract method
}

class Dog implements Animal 
{
    @Override
    public void makeSound() 
    {
        System.out.println("Woof!");
    }
}

public class InterfaceDemo 
{
    public static void main(String[] args) 
    {
        Animal a = new Dog();
        a.makeSound(); // Woof!
    }
}
```

---

## 🎯 Learning Outcomes

- Define and use interfaces with implements
- Understand multiple inheritance with interfaces
- Use default and static methods in interfaces
- Apply interfaces to achieve abstraction and flexibility