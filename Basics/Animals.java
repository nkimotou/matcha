/*
Demonstrating class inheritance; parent and child
 */
class Animal {
    // Instance variable
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method for printing the sound an animal makes to the the console
    public void sound() {
        System.out.println(name + " made a strange noise!");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        // Calling parent class constructor
        super(name);
    }

    // Method overriding parent class method
    @Override
    public void sound() {
        System.out.println("That's " + name + "!" + " He just barked!");
    }
}

// Main class to demonstrate inheritance
public class Animals {
    public static void main(String[] args) {
        // Creating Animal object
        Animal animal = new Animal("That dog over there");
        // Call sound method with Animal object
        animal.sound();
        // Creating Dog object
        Dog dog = new Dog("Arcanine");
        // Call sound method with dog object
        dog.sound();
    }
}
