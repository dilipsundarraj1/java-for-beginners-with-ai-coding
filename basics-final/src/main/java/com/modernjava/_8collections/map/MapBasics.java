package com.modernjava._8collections.map;

import java.util.*;

/**
 * Map Basics - Introduction to Maps for Beginners
 * <p>
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

        // create a map and add some key-value pairs of student names and their grades
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 87);
        studentGrades.put("Charlie", 92);

        System.out.println("Student grades: " + studentGrades);

        // Retrieving a value using its key
        var aliceGrade = studentGrades.get("Alice");
        System.out.println("Alice's grade: " + aliceGrade);

        // Retrieving a value using its key
        var bobGrade = studentGrades.getOrDefault("alex", 0);
        System.out.println("Bob's grade: " + bobGrade);

        //Update an existing Key-Value pair and Updating Bob's grade
        studentGrades.put("Bob", 90);

        // Getting all keys and values
        System.out.println("All students: " + studentGrades.keySet());
        System.out.println("All grades: " + studentGrades.values());

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
        System.out.println("Using keySet() with functional approach:");
        studentGrades.keySet()
                .stream()
                .forEach(student -> System.out.println(student + "'s grade: " + studentGrades.get(student)));

        // 2. Using entrySet() with functional approach
        System.out.println("\nUsing entrySet() with functional approach:");
        studentGrades.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + "'s grade: " + entry.getValue()));

        // 3. Using forEach() with lambda expression
        System.out.println("\nUsing forEach() with lambda expression:");
        studentGrades.forEach((student, grade) ->
                System.out.println(student + "'s grade: " + grade));

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

        // Size and empty check
        System.out.println("Inventory size: " + inventory.size());
        System.out.println("Is inventory empty? " + inventory.isEmpty());

        // Update a value using computeIfPresent
        inventory.computeIfPresent("laptops", (key, value) -> 12);
        System.out.println("Updated laptops: " + inventory.get("laptops"));


        // Remove an item and capture the value
        Integer removedValue = inventory.remove("tablets");
        System.out.println("Removed tabletcomputeIfPresents: " + removedValue);
        System.out.println("Inventory after removal: " + inventory);


        // add a new item using putIfAbsent
        inventory.putIfAbsent("ipads", 10);
        System.out.println("added  ipads: " + inventory.get("ipads"));
        // Attempt to add an existing item using putIfAbsent
        inventory.putIfAbsent("keyboards", 20);
        inventory.putIfAbsent("laptops", 99); // Won't update because key exists
        System.out.println("Final inventory: " + inventory);

        System.out.println();
    }

    /**
     * Different types of Maps and their characteristics
     */
    public static void differentMapTypes() {
        System.out.println("4. Different Types of Maps:");

        // HashMap - No order guaranteed, fastest performance
        //create a HashMap and add some key-value pairs
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("apple", "red");
        hashMap.put("banana", "yellow");
        hashMap.put("grape", "purple");
        System.out.println("HashMap (no order): " + hashMap);

        // LinkedHashMap - Maintains insertion order
        //create a LinkedHashMap and add some key-value pairs
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple", "red");
        linkedHashMap.put("banana", "yellow");
        linkedHashMap.put("grape", "purple");
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);

        // TreeMap - Sorted by keys
        //create a TreeMap and add some key-value pairs
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("banana", "yellow");
        treeMap.put("grape", "purple");
        treeMap.put("apple", "red");
        System.out.println("TreeMap (sorted by key): " + treeMap);

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
        phoneBook.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        // Example 2: Country capitals
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("India", "New Delhi");

        System.out.println("\nCountry Capitals:");
        String country = "France";
        capitals.entrySet().stream()
                .filter(entry -> entry.getKey().equals(country))
                .forEach(entry -> System.out.println("Capital of " + country + ": " + entry.getValue()));

        // Example 3: Word frequency counter
        String text = "hello world hello java world";
        Map<String, Integer> wordCount = new HashMap<>();

        Arrays.stream(text.split(" "))
                .forEach(word -> wordCount.put(word, wordCount.getOrDefault(word, 0) + 1));

        System.out.println("\nWord Frequency:");
        wordCount.forEach((word, count) ->
                System.out.println(word + " appears " + count + " times"));

        System.out.println();
    }
}
