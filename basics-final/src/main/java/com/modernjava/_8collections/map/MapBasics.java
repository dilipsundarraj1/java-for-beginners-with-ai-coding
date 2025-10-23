package com.modernjava._8collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

/**
 * Map Basics - Introduction to Maps for Beginners
 *
 * A Map is a collection that stores key-value pairs.
 * - Each key is unique
 * - Keys are used to retrieve values
 * - Think of it like a dictionary where you look up a word (key) to find its meaning (value)
 */
public class MapBasics {

    public static void main(String[] args) {
        System.out.println("=== MAP BASICS ===\n");

        // Example 1: Creating and using a simple Map
        basicMapOperations();

        // Example 2: Different types of Maps
        differentMapTypes();

        // Example 3: Common Map operations
        commonMapOperations();

        // Example 4: Map iteration techniques
        mapIterationExamples();

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
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 87);
        studentGrades.put("Charlie", 92);

        System.out.println("Student grades: " + studentGrades);

        // Getting a value by key
        Integer aliceGrade = studentGrades.get("Alice");
        System.out.println("Alice's grade: " + aliceGrade);

        // Checking if a key exists
        if (studentGrades.containsKey("Bob")) {
            System.out.println("Bob's grade: " + studentGrades.get("Bob"));
        }

        // Getting all keys and values
        System.out.println("All students: " + studentGrades.keySet());
        System.out.println("All grades: " + studentGrades.values());

        System.out.println();
    }

    /**
     * Different types of Maps and their characteristics
     */
    public static void differentMapTypes() {
        System.out.println("2. Different Types of Maps:");

        // HashMap - No order guaranteed, fastest performance
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("apple", "red");
        hashMap.put("banana", "yellow");
        hashMap.put("grape", "purple");
        System.out.println("HashMap (no order): " + hashMap);

        // LinkedHashMap - Maintains insertion order
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple", "red");
        linkedHashMap.put("banana", "yellow");
        linkedHashMap.put("grape", "purple");
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);

        // TreeMap - Sorted by keys
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("apple", "red");
        treeMap.put("banana", "yellow");
        treeMap.put("grape", "purple");
        System.out.println("TreeMap (sorted by key): " + treeMap);

        System.out.println();
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
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = text.split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nWord Frequency:");
        wordCount.forEach((word, count) ->
            System.out.println(word + " appears " + count + " times"));

        System.out.println();
    }
}
