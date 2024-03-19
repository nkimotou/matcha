package data_structures;

import java.util.HashMap;
import java.util.Map;

public class FruitsHashmap {
    public static void main(String[] args) {
        // Create a HashMap to store <String, Integer> pairs
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 15);
        hashMap.put("Grape", 25);

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);

        // Access elements in the HashMap
        String key = "Banana";
        System.out.println("Value for key '" + key + "': " + hashMap.get(key));

        // Check if a key exists in the HashMap
        String searchKey = "Orange";
        if (hashMap.containsKey(searchKey)) {
            System.out.println("'" + searchKey + "' exists in the HashMap.");
        } else {
            System.out.println("'" + searchKey + "' does not exist in the HashMap.");
        }

        // Update an existing value in the HashMap
        String updateKey = "Banana";
        int newValue = 30;
        hashMap.put(updateKey, newValue);
        System.out.println("Updated HashMap: " + hashMap);

        // Remove a key-value pair from the HashMap
        String removeKey = "Grape";
        hashMap.remove(removeKey);
        System.out.println("HashMap after removing '" + removeKey + "': " + hashMap);

        // Iterate over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get the size of the HashMap
        System.out.println("The current size of the HashMap: " + hashMap.size());

        // Clear all elements from the HashMap
        hashMap.clear();
        System.out.println("The HashMap has been cleared. New size: " + hashMap.size());
    }
}
