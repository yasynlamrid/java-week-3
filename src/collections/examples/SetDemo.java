package collections.examples;


import java.util.HashSet;
import java.util.Set;

    public class SetDemo
    {
        public static void main(String[] args)
        {
            Set<String> fruits = new HashSet<>();

            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Orange");
            fruits.add("Apple"); // duplicate ignored

            System.out.println("Fruits: " + fruits);

            fruits.remove("Banana");
            System.out.println("After removing Banana: " + fruits);

            System.out.println("Contains Orange? " + fruits.contains("Orange"));
        }
    }

