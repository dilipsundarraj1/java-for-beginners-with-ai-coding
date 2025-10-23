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
        Set<String> uniqueFruits = fruits.stream().collect(Collectors.toSet());
        System.out.println("Unique fruits: " + uniqueFruits);

        // Create a set of fruit lengths
        Set<Integer> fruitLengths = fruits.stream().map(String::length).collect(Collectors.toSet());
        System.out.println("Fruit lengths: " + fruitLengths);
        System.out.println();
    }

    /**
     * Filtering Sets using Streams
     */
    public static void filteringSets() {
        System.out.println("2. Filtering Sets:");

        Set<String> colors = new HashSet<>(Arrays.asList("red", "green", "blue", "yellow", "purple"));
        System.out.println("Original colors: " + colors);

        // Filter colors with length > 4
        Set<String> longColors = colors.stream()
            .filter(color -> color.length() > 4)
            .collect(Collectors.toSet());
        System.out.println("Colors with length > 4: " + longColors);

        // Filter colors that start with 'b'
        Set<String> bColors = colors.stream()
            .filter(color -> color.startsWith("b"))
            .collect(Collectors.toSet());
        System.out.println("Colors starting with 'b': " + bColors);
        System.out.println();
    }

    /**
     * Transforming Sets using Streams
     */
    public static void transformingSets() {
        System.out.println("3. Transforming Sets:");

        Set<String> animals = new HashSet<>(Arrays.asList("cat", "dog", "bird", "fish"));
        System.out.println("Original animals: " + animals);

        // Transform to uppercase
        Set<String> upperAnimals = animals.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toSet());
        System.out.println("Uppercase animals: " + upperAnimals);

        // Transform to lengths
        Set<Integer> animalLengths = animals.stream()
            .map(String::length)
            .collect(Collectors.toSet());
        System.out.println("Animal name lengths: " + animalLengths);
        System.out.println();
    }

    /**
     * Grouping data into Sets (by first letter)
     */
    public static void groupingIntoSets() {
        System.out.println("4. Grouping Data into Sets:");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna", "Brian");

        // Group names by first letter into sets
        Map<Character, Set<String>> namesByFirstLetter = names.stream()
            .collect(Collectors.groupingBy(
                name -> name.charAt(0),
                Collectors.toSet()
            ));
        System.out.println("Names grouped by first letter: " + namesByFirstLetter);
        System.out.println();
    }

    /**
     * Advanced Set operations with Streams
     */
    public static void advancedSetOperations() {
        System.out.println("5. Advanced Set Operations:");

        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Original numbers: " + numbers);

        // Partition numbers into even and odd sets
        Map<Boolean, Set<Integer>> evenOddPartition = numbers.stream()
            .collect(Collectors.partitioningBy(
                n -> n % 2 == 0,
                Collectors.toSet()
            ));
        System.out.println("Even numbers: " + evenOddPartition.get(true));
        System.out.println("Odd numbers: " + evenOddPartition.get(false));

        // Find the max and min in the set
        int max = numbers.stream().max(Integer::compareTo).orElse(-1);
        int min = numbers.stream().min(Integer::compareTo).orElse(-1);
        System.out.println("Max: " + max + ", Min: " + min);
        System.out.println();
    }
}

