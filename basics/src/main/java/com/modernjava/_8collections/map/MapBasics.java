package com.modernjava._8collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map Basics - Introduction to Maps for Beginners
 *
 * A Map is a collection that stores key-value pairs.
 * - Each key is unique
 * - Keys are used to retrieve values
 * - Think of it like a dictionary where you look up a word (key) to find its meaning (value)
 */
public class MapBasics {

    static void main(String[] args) {
        System.out.println("=== MAP BASICS ===\n");

        // Example 1: Creating and using a simple Map
        basicMapOperations();

        // Example 2: Map iteration techniques
        mapIterationUsingStreamsAPI();

        // Example 3: Common Map operations
        modifyMapOperations();

        // Example 4: Different types of Maps
        differentMapTypes();

        // Example 5: Real-world examples
        realWorldExamples();
    }

    /**
     * Basic Map operations - Creating, adding, and retrieving
     */
    public static void basicMapOperations() {
        System.out.println("1. Basic Map Operations:");

        // Creating a new HashMap
        Map<String, Integer> studentGrades = new HashMap<>();

        // Adding key-value pairs
        // Adding student names as keys and their grades as values

        System.out.println("Student grades: " + studentGrades);

        // Getting a value by key
        // Retrieve Alice's grade

        // Checking if a key exists
        // Check if Bob is in the map

        // Get all student names and their grades

        System.out.println();
    }

    /**
     * Map iteration techniques - Different ways to loop through maps
     */
    public static void mapIterationUsingStreamsAPI() {
        System.out.println("2. Map Iteration Techniques:");

        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 87);
        studentGrades.put("Charlie", 92);

        // 1. Using keySet() with functional approach
        //  Iterate over keys and get values and print them.

        // 2. Using entrySet() with functional approach
        // Iterate over entries and print key-value pairs.

        // 3. Using forEach() with lambda expression
        // Directly iterate over map using forEach method.

        System.out.println();
    }

    /**
     * Common Map operations every developer should know
     */
    public static void modifyMapOperations() {
        System.out.println("3. Common Map Operations:");

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("laptops", 10);
        inventory.put("phones", 25);
        inventory.put("tablets", 15);

        // Get the size of the map and check if it's empty
        System.out.println("Inventory size: " + inventory.size());
        System.out.println("Is inventory empty? " + inventory.isEmpty());

        // Update a value using computeIfPresent
        // Update laptops to 12 if it exists


        // Remove an item and capture the value
        // remove tablets from inventory


        // add a new item using putIfAbsent
        // add ipads with quantity 10 if it doesn't exist

        // Attempt to add an existing item using putIfAbsent
        // update keyboards to 20 if it doesn't exist, update laptops to 99 if it doesn't exist

        System.out.println();
    }

    /**
     * Different types of Maps and their characteristics
     */
    public static void differentMapTypes() {
        System.out.println("2. Different Types of Maps:");

        // HashMap - No order guaranteed, fastest performance
        // fruits and their colors - fruit name as key, color as value

        // LinkedHashMap - Maintains insertion order
        // fruits and their colors - fruit name as key, color as value

        // TreeMap - Sorted by keys
        // fruits and their colors - fruit name as key, color as value
    }

    /**
     * Common Map operations every developer should know
     */
    public static void commonMapOperations() {
        System.out.println("3. Common Map Operations:");

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("laptops", 10);
        inventory.put("phones", 25);
        inventory.put("tablets", 15);

        // Size and empty check
        // Get the size of the map and check if it's empty
        System.out.println("Inventory size: " + inventory.size());
        System.out.println("Is inventory empty? " + inventory.isEmpty());

        // Update a value
        inventory.put("laptops", 12); // Updates existing value
        System.out.println("Updated laptops: " + inventory.get("laptops"));

        // Remove an item
        Integer removedValue = inventory.remove("tablets");
        System.out.println("Removed tablets: " + removedValue);
        System.out.println("Inventory after removal: " + inventory);

        // Get value with default
        Integer mice = inventory.getOrDefault("mice", 0);
        System.out.println("Mice in inventory: " + mice);

        // Put if absent
        inventory.putIfAbsent("keyboards", 20);
        inventory.putIfAbsent("laptops", 99); // Won't update because key exists
        System.out.println("Final inventory: " + inventory);

        System.out.println();
    }

    /**
     * Map iteration techniques - Different ways to loop through maps
     */
    public static void mapIterationExamples() {
        System.out.println("4. Map Iteration Techniques:");

        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 87);
        studentGrades.put("Charlie", 92);

        // 1. Using keySet() and enhanced for loop
        System.out.println("Using keySet() and enhanced for loop:");
        for (String student : studentGrades.keySet()) {
            System.out.println(student + "'s grade: " + studentGrades.get(student));
        }

        // 2. Using entrySet() and enhanced for loop
        System.out.println("\nUsing entrySet() and enhanced for loop:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + "'s grade: " + entry.getValue());
        }

        // 3. Using forEach() with lambda expression
        System.out.println("\nUsing forEach() with lambda expression:");
        studentGrades.forEach((student, grade) ->
            System.out.println(student + "'s grade: " + grade));

        System.out.println();
    }

    /**
     * Real-world examples to help understand Map usage
     */
    public static void realWorldExamples() {
        System.out.println("5. Real-World Examples:");

        // Example 1: Phone book
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("John Doe", "555-1234");
        phoneBook.put("Jane Smith", "555-5678");
        phoneBook.put("Bob Johnson", "555-9012");

        System.out.println("Phone Book:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Example 2: Country capitals
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("India", "New Delhi");

        System.out.println("\nCountry Capitals:");
        String country = "France";
        System.out.println("Capital of " + country + ": " + capitals.get(country));

        // Example 3: Word frequency counter
        String text = "hello world hello java world";

        // Split the text into words and count frequency of each word
        // Example: "hello" appears 2 times, "world" appears 2 times, "java" appears 1 time

        System.out.println();
    }
}
