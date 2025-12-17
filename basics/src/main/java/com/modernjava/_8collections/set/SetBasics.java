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

        // iterate through the set and print each fruit

        // check an elememnt exists in the set.

        // get the size of the set

        // remove an element from the set

        // addAll to the set
        var fruitList1 = Arrays.asList("kiwi", "mango");

        // cleat the set using clear()
    }

    /**
     * Different types of Sets and their characteristics
     */
    public static void differentSetTypes() {
        System.out.println("2. Different Types of Sets:");
        // create a HashSet of three elements

        // create a LinkedHashSet of three elements

        // create a TreeSet of three elements
    }

}

