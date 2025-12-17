package com.modernjava._8collections.set;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Set with Streams API - Advanced Set operations using Java Streams
 *
 * This demonstrates how to use Sets with the powerful Streams API
 * for functional programming and data processing.
 */
public class SetWithStreams {
    public static void main(String[] args) {
        System.out.println("=== SET WITH STREAMS API ===\n");

        // Example 1: Creating Sets from Lists using Streams
        createSetsFromStreams();

        // Example 2: Filtering Sets with Streams
        filteringSets();

        // Example 3: Transforming Sets with Streams
        transformingSets();

        // Example 4: Grouping data into Sets
        groupingIntoSets();

        // Example 5: Advanced Set operations with Streams
        advancedSetOperations();
    }

    /**
     * Creating Sets from other collections using Streams
     */
    public static void createSetsFromStreams() {
        System.out.println("1. Creating Sets from Streams:");

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "apple", "banana");

        // Create a set from a list (removes duplicates)
        // Example : apple, banana, cherry, date [apple, banana are duplicates]

        // Create a set of fruit lengths
        // Example : 5, 6
    }

    /**
     * Filtering Sets using Streams
     */
    public static void filteringSets() {
        System.out.println("2. Filtering Sets:");

        Set<String> colors = new HashSet<>(Arrays.asList("red", "green", "blue", "yellow", "purple"));
        System.out.println("Original colors: " + colors);

        // Filter colors with length > 4
        // Example : green, yellow, purple

        // Filter colors that start with 'b'
        // Example : blue
    }

    /**
     * Transforming Sets using Streams
     */
    public static void transformingSets() {
        System.out.println("3. Transforming Sets:");

        Set<String> animals = new HashSet<>(Arrays.asList("cat", "dog", "bird", "fish"));
        System.out.println("Original animals: " + animals);

        // Transform to uppercase
        // Example : CAT, DOG, BIRD, FISH

        // Transform to length : uppercase format
        // Example : 3 : CAT, 4 : BIRD

    }

    /**
     * Grouping data into Sets (by first letter)
     */
    public static void groupingIntoSets() {
        System.out.println("4. Grouping Data into Sets:");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna", "Brian");

        // Group names by first letter into sets
        // Example : A : [Alice, Anna], B : [Bob, Brian], C : [Charlie], D : [David]
    }

    /**
     * Advanced Set operations with Streams
     */
    public static void advancedSetOperations() {
        System.out.println("5. Advanced Set Operations:");

        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Original numbers: " + numbers);

        // Partition(Divide) numbers into even and odd sets
        // Example : Even : [2, 4, 6, 8, 10], Odd : [1, 3, 5, 7, 9]

    }
}

