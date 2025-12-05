package solutions;

public class Solution1 {
    //Create a class Person wih properties (name and age) with following features.
    //a. Default age of person should be 18;
    //b. A person object can be initialized with name and age;
    //c. Method to display name and age of person
    public static void main(String[] args) {
        createClass();
    }

    //input - age
    //output - 18
    public static void createClass() {
    }

    public static class Person {
        private String name;
        private int age;

        // Constructor with only name (age defaults to 18)
        public Person(String name) {
            this.name = name;
            this.age = 18;
        }

        // Constructor with name and age
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display details
        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        // Optional getters/setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}