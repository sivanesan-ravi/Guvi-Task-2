package solutions;

public class Solution4 {
    //Define a base class Person with attributes name and age.
    //Create a subclass Employee that inherits from  Person  and  adds  attributes  the employeeIID and salary.
    //Use the super keyword to initialize the Person attributes in the Employee constructor.

    public static void main(String[] args) {
        baseClass();
    }

    //input -
    //output-

    public static void baseClass() {
    }

    // Person class (Base class)
    class Person {
        String name;
        int age;

        // Constructor for Person
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display Person details
        public void displayPersonDetails() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    }
}
