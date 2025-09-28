# 🚗 Composition in Java

**Composition** is an object-oriented programming principle where a class is composed of one or more objects from other classes.  
It represents a **HAS-A relationship** (instead of an **IS-A** relationship from inheritance).

👉 Example:
- A Car **has an** Engine.
- A Library **has** Books.

---

## ✨ Why Composition?

- ✅ Promotes code reuse without tight coupling
- ✅ More flexible than inheritance
- ✅ Follows the principle: *“Favor composition over inheritance”*

---

## ✅ Example – Car with Engine

```java
package composition;

public class Engine 
{
    public void start() 
    {
        System.out.println("Engine started...");
    }
}

public class CarWithEngine 
{
    public static void main(String[] args)
    {
        CarWithEngine car = new CarWithEngine();
        car.startCar();
    }
    private Engine engine; // HAS-A relationship

    public CarWithEngine() 
    {
        this.engine = new Engine();
    }

    public void startCar() 
    {
        engine.start(); // delegate to Engine
        System.out.println("Car is ready to go!");
    }
}
```

## 🎯 Learning Outcomes

✅ Understand the difference between IS-A (inheritance) and HAS-A (composition)
✅ Implement relationships between classes using object references
✅ Delegate responsibilities to composed objects
✅ Recognize when to use composition instead of inheritance