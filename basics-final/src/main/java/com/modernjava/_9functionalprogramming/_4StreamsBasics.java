package com.modernjava._9functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * StreamsBasics - Introduction to Java Streams API
 * Demonstrates how Streams make collection operations simpler and more readable
 * Building on lambda expressions to show powerful data processing pipelines
 */
public class _4StreamsBasics {

    static void main(String[] args) {
        System.out.println("=== Java Streams Basics ===\n");

        // 1. Basic stream operations
        demonstrateBasicStreamOperations();

        // 2. Filtering with streams
        demonstrateFiltering();

        // 3. Mapping (transforming) with streams
        demonstrateMapping();

        // 4. Combining operations - the power of streams
        demonstrateCombinedOperations();
    }

    /**
     * Demonstrates basic stream operations and their purposes
     */
    private static void demonstrateBasicStreamOperations() {
        System.out.println("2. Basic Stream Operations:");

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        System.out.println("String numbers: " + numbers);

        // Stream creation
        System.out.println("\nCreating streams:");
        System.out.println("- From collection: list.stream()");
        System.out.println("- Stream count: " + numbers.stream().count());

        // Terminal operations (end the stream)
        System.out.println("\nTerminal operations (execute the stream):");

        // forEach - perform action on each element
        System.out.print("forEach: ");
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // collect - gather results into collection
        List<String> firstThree = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("collect: " + firstThree);

        // count - count elements
        long count = numbers.stream()
                .filter(n -> Integer.parseInt(n) > 5)
                .count();
        System.out.println("count (>5): " + count);
        System.out.println();
    }

    /**
     * Demonstrates filtering operations with streams
     */
    private static void demonstrateFiltering() {
        System.out.println("3. Filtering with Streams:");

        List<String> fruits = Arrays.asList("apple", "apricot", "banana", "blueberry", "cherry", "coconut");
        System.out.println("Fruits: " + fruits);

        // Filter fruits starting with 'a'
        System.out.println("\nFruits starting with 'a':");
        fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .forEach(fruit -> IO.println("  " + fruit));

        // Filter fruits with more than 5 characters
        List<String> longFruits = fruits.stream()
                .filter(fruit -> fruit.length() > 5)
                .collect(Collectors.toList());
        System.out.println("\nFruits with more than 5 characters: " + longFruits);

        // Multiple filters (chaining)
        List<String> specificFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("b"))
                .filter(fruit -> fruit.length() > 6)
                .collect(Collectors.toList());
        System.out.println("Fruits starting with 'b' and longer than 6 chars: " + specificFruits);
        System.out.println();
    }

    /**
     * Demonstrates mapping (transformation) operations
     */
    private static void demonstrateMapping() {
        System.out.println("4. Mapping (Transforming) with Streams:");

        List<String> cities = Arrays.asList("new york", "london", "tokyo", "paris");
        System.out.println("Cities: " + cities);

        // Transform to uppercase
        List<String> upperCaseCities = cities.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("\nUppercase cities: " + upperCaseCities);

        // Transform to lengths
        List<Integer> cityLengths = cities.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("City name lengths: " + cityLengths);

        // Transform to formatted strings
        List<String> formattedCities = cities.stream()
                .map(city -> "City: " + city.substring(0, 1).toUpperCase() + city.substring(1))
                .collect(Collectors.toList());
        System.out.println("Formatted cities: " + formattedCities);

        // Transform string numbers to integers
        List<String> stringNumbers = Arrays.asList("10", "20", "30", "40");
        List<Integer> integers = stringNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("\nString to Integer: " + stringNumbers + " -> " + integers);
        System.out.println();
    }

    /**
     * Demonstrates the power of combining stream operations
     */
    private static void demonstrateCombinedOperations() {
        System.out.println("5. Combined Operations - The Real Power:");

        List<String> words = Arrays.asList("Hello", "World", "Java", "Streams", "Are", "Powerful", "And", "Fun");
        System.out.println("Words: " + words);

        // Complex operation: Find long words, convert to lowercase, sort, and collect
        List<String> processedWords = words.stream()
                .filter(word -> word.length() > 3)          // Keep words longer than 3 chars
                .map(String::toLowerCase)                    // Convert to lowercase
                .sorted()                                    // Sort alphabetically
                .toList();               // Collect results

        System.out.println("\nProcessed words (>3 chars, lowercase, sorted): " + processedWords);

        // Another example: Create a summary string
        String summary = words.stream()
                .filter(word -> word.length() <= 5)         // Keep short words
                .map(String::toUpperCase)                    // Convert to uppercase
                .collect(Collectors.joining(", "));          // Join with commas

        System.out.println("Summary of short words: " + summary);

        // Count and find
        long shortWordCount = words.stream()
                .filter(word -> word.length() <= 3)
                .count();
        System.out.println("Number of short words (≤3 chars): " + shortWordCount);
        System.out.println();
    }
}
