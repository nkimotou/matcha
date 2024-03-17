package data_structures;

import java.util.ArrayList;

/*
Showcasing an example of arrays using ArrayList.
 */

public class Exarrays {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Access elements inside the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("The elements in the ArrayList will be updated.");
        // Change an element
        numbers.set(1, 25); // Update the element at index 1

        // Remove an element
        numbers.remove(2); // Remove the element at index 2

        // Iterate over ArrayList
        System.out.println("The updated elements are:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Check the ArrayList for a specific element
        if (numbers.contains(15)) {
            System.out.println("The ArrayList contains 15.");
        } else {
            System.out.println("The ArrayList does not contain 15.");
        }

        // Get the size of the ArrayList
        System.out.println("The size of the current ArrayList is " + numbers.size() + ". Clearing the ArrayList will now begin.");

        // Clear the ArrayList
        numbers.clear();
        System.out.println("The ArrayList has been cleared. The new size is " + numbers.size());
    }
}
