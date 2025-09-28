package encapsulation.examples;
/**
 * A class representing a student with encapsulated name and age.
 */

public class Student
{
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        setAge(age); // validation inside setter
    }

    // Getter
    public String getName() {return name;}
    public int getAge() {return age;}

    // Setter with validation
    public void setAge(int age)
    {
        if (age > 0 && age < 120)
        {
            this.age = age;
        }
    }
}
