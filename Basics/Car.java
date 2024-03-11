/*
This program demonstrating OOP - Object Oriented Programming.
-Methods
-Classes
-Constructors
*/
public class Car {
    // Private instance variables
    private String brand;
    private String model;
    private int year;

    // Constructorn with data parameters for instance variables
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Get methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // DisplayInfo method to print to the console
    public void displayInfo() {
        System.out.println("My car is a  " + brand + " " + model + " " + year);
    }

    // Main method to demonstrate the usage of Car class
    public static void main(String[] args) {
        // Creating instances of Car class
        Car car1 = new Car("Toyota", "Celica", 1991);
        Car car2 = new Car("Nissan", "Fair Lady Z", 1985);

        // Accessing instance variables and methods
        System.out.println("I have one  " + car1.getBrand() + " " + car1.getModel() + " " + car1.getYear() + "in my inventory");
        System.out.println("I have one  " + car2.getBrand() + " " + car2.getModel() + " " + car2.getYear() + "in my inventory");

        // Calling displayInfo() method
        car1.displayInfo();
        car2.displayInfo();
    }
}
