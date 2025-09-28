package collections.examples;

import java.util.HashMap;
import java.util.Map;

public class MapDemo
{
    public static void main(String[] args)
    {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 20);

        System.out.println("All ages: " + ages);

        System.out.println("Alice's age: " + ages.get("Alice"));

        ages.remove("Bob");
        System.out.println("After removing Bob: " + ages);

        for (String name : ages.keySet()) {
            System.out.println(name + " is " + ages.get(name) + " years old");
        }
    }
}
