package collections.examples;

import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // duplicates allowed

        System.out.println("All names: " + names);
        System.out.println("First name: " + names.get(0));

        names.remove("Bob");
        System.out.println("After removing Bob: " + names);
    }
}