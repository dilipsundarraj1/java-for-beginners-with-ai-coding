package com.modernjava._8collections.set;

import java.util.*;

/**
 * Set Basics - Introduction to Sets for Beginners
 *
 * A Set is a collection that stores unique elements.
 * - No duplicate elements allowed
 * - Useful for membership tests, removing duplicates, etc.
 */
public class SetBasics {
    public static void main(String[] args) {
        System.out.println("=== SET BASICS ===\n");

        // Example 1: Basic Set operations
        basicSetOperations();

        // Example 2: Different types of Sets
        differentSetTypes();

        // Example 3: Common Set operations
        commonSetOperations();

        // Example 4: Set iteration techniques
        setIterationExamples();

        // Example 5: Real-world Set examples
        realWorldExamples();
    }

    /**
     * Basic Set operations - Creating, adding, and checking membership
     */
    public static void basicSetOperations() {
        System.out.println("1. Basic Set Operations:");
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple"); // Duplicate, won't be added
        System.out.println("Fruits set: " + fruits);
        System.out.println("Contains 'banana'? " + fruits.contains("banana"));
        System.out.println("Set size: " + fruits.size());
        System.out.println();
    }

    /**
     * Different types of Sets and their characteristics
     */
    public static void differentSetTypes() {
        System.out.println("2. Different Types of Sets:");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("cat"); hashSet.add("dog"); hashSet.add("bird");
        System.out.println("HashSet (no order): " + hashSet);
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("cat"); linkedHashSet.add("dog"); linkedHashSet.add("bird");
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("cat"); treeSet.add("dog"); treeSet.add("bird");
        System.out.println("TreeSet (sorted order): " + treeSet);
        System.out.println();
    }

    /**
     * Common Set operations every developer should know
     */
    public static void commonSetOperations() {
        System.out.println("3. Common Set Operations:");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1); numbers.add(2); numbers.add(3);
        numbers.remove(2);
        System.out.println("Numbers after removal: " + numbers);
        numbers.addAll(Arrays.asList(3, 4, 5)); // addAll ignores duplicates
        System.out.println("Numbers after addAll: " + numbers);
        numbers.clear();
        System.out.println("Numbers after clear: " + numbers);
        System.out.println();
    }

    /**
     * Set iteration techniques - Different ways to loop through sets
     */
    public static void setIterationExamples() {
        System.out.println("4. Set Iteration Techniques:");
        Set<String> colors = new HashSet<>(Arrays.asList("red", "green", "blue"));
        System.out.println("Using enhanced for loop:");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("\nUsing forEach() with lambda:");
        colors.forEach(c -> System.out.println(c));
        System.out.println();
    }

    /**
     * Real-world Set examples to help understand Set usage
     */
    public static void realWorldExamples() {
        System.out.println("5. Real-World Set Examples:");
        // Example: Removing duplicates from a list
        List<String> namesWithDuplicates = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob");
        Set<String> uniqueNames = new HashSet<>(namesWithDuplicates);
        System.out.println("Unique names: " + uniqueNames);
        // Example: Membership test
        Set<String> allowedUsers = new HashSet<>(Arrays.asList("admin", "user", "guest"));
        String loginUser = "user";
        System.out.println("Is '" + loginUser + "' allowed? " + allowedUsers.contains(loginUser));
        System.out.println();
    }
}

