package inheritance.examples;

// Subclass
public class Bike extends Vehicle
{
    public Bike(String brand)
    {
        super(brand);
    }

    @Override
    public void drive()
    {
        System.out.println(brand + " bike is zooming...");
    }
}
