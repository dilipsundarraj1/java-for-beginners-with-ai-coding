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
    static void main(String[] args) {
        System.out.println("=== SET BASICS ===\n");

        // Example 1: Basic Set operations
        basicSetOperations();

        // Example 2: Different types of Sets
        differentSetTypes();

    }

    /**
     * Basic Set operations - Creating, adding, and checking membership
     */
    public static void basicSetOperations() {
        System.out.println("1. Basic Set Operations:");
        // Creating a new HashSet with String elements
        // Adding some fruits to the set and demonstrating that duplicates are not added
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple"); // Duplicate, won't be added
        System.out.println("Fruits set: " + fruits);

        // iterate through the set and print each fruit
        System.out.println("Iterating through the fruits set:");
        fruits.forEach(s -> System.out.println("fruit : " + s));

        // check an elememnt exists in the set.
        System.out.println("Contains 'banana'? " + fruits.contains("banana"));

        // get the size of the set
        System.out.println("Set size: " + fruits.size());
        System.out.println();

        // remove an element from the set
        fruits.remove("banana");
        System.out.println("Fruits set after removing 'banana': " + fruits);

        var fruitList1 = Arrays.asList("kiwi", "mango");
        fruits.addAll(fruitList1); // addAll ignores duplicates
        System.out.println("fruitList1 after addAll: " + fruits);

        fruits.clear();
        System.out.println("fruits after clear: " + fruits);
    }

    /**
     * Different types of Sets and their characteristics
     */
    public static void differentSetTypes() {
        System.out.println("2. Different Types of Sets:");
        // create a HashSet of three elements
        Set<String> hashSet = new HashSet<>();
        hashSet.add("cat");
        hashSet.add("dog");
        hashSet.add("bird");
        System.out.println("HashSet (no order): " + hashSet);

        // create a LinkedHashSet of three elements
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("cat");
        linkedHashSet.add("dog");
        linkedHashSet.add("bird");
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);

        // create a TreeSet of three elements
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("cat");
        treeSet.add("dog");
        treeSet.add("bird");
        System.out.println("TreeSet (sorted order): " + treeSet);
        System.out.println();
    }

}

