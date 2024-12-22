import java.util.HashSet;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals() method to compare based on name and age
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Check if the same object
        if (obj == null || getClass() != obj.getClass()) return false;  // Null or different class
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);  // Compare fields
    }

    // Override hashCode() method to generate hash code based on name and age
    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;  // Simple hash code formula
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EqualsHashCodeExample {
    public static void main(String[] args) {
        // Create two Person objects with the same name and age
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);
        
        // Create a HashSet and add the persons to it
        HashSet<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2); // person2 should be considered equal to person1
        
        // Print the size of the set (should be 1 if equals() and hashCode() are correctly overridden)
        System.out.println("Size of HashSet: " + personSet.size());  // Output: 1
        
        // Print the details of the person in the set
        for (Person p : personSet) {
            System.out.println(p.getName() + " - " + p.getAge());
        }
    }
}

