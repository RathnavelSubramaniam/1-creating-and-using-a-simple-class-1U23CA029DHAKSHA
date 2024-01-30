public class Person {
    // Define instance variables
    private String firstName;
    private String lastName;
    private int age;

    // Default constructor
    public Person() {
        // Initialize variables as needed
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Method to get full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        // Create two Person objects with different data
        Person person1 = new Person("John", "Doe", 30);
        Person person2 = new Person("Alice", "Smith", 25);

        // Display full names
        System.out.println("Person 1 Full Name: " + person1.getFullName());
        System.out.println("Person 2 Full Name: " + person2.getFullName());

        // Calculate and display the average age
        double averageAge = (person1.age + person2.age) / 2.0;
        System.out.println("Average Age: " + averageAge);
    }
}
