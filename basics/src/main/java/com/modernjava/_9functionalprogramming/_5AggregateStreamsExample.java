package com.modernjava._9functionalprogramming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * _6AggregateStreamsExample - Comprehensive Guide to Stream Aggregate Operations
 *
 * Demonstrates terminal operations that reduce stream elements to single values:
 * - reduce() - Custom reduction with binary operators
 * - count() - Count elements in the stream
 * - min(), max() - Find minimum/maximum elements (returns Optional)
 * - sum(), average() - Specialized operations for primitive streams
 * - collect() - Flexible aggregation using collectors
 */
public class _5AggregateStreamsExample {

    public static void main(String[] args) {
        System.out.println("=== Java Stream Aggregate Operations ===\n");

        // 1. Basic count operation
        demonstrateCount();

        // 2. Min and Max operations with Optional handling
        demonstrateMinMax();

        // 3. Primitive stream aggregations (sum, average, etc.)
        demonstratePrimitiveStreamAggregation();

        // 4. Reduce operations - the foundation of aggregation
        demonstrateReduce();

        // 5. Advanced aggregation with collectors
        demonstrateCollectors();

    }

    /**
     * Demonstrates the count() operation - simplest aggregate function
     */
    private static void demonstrateCount() {
        System.out.println("1. Count Operation:");
        System.out.println("   count() returns the number of elements in the stream as a long\n");

        List<String> words = List.of("java", "stream", "aggregate", "operations", "count");
        System.out.println("Original list: " + words);

        // [practice] Count all items in the stream

        // [practice]  Count items after filtering by length

        // list with duplicate entries
        List<String> duplicates = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
        // [practice]  Count distinct elements using distinct()
    }

    /**
     * Demonstrates reduce() operations - the most flexible aggregate operation
     */
    private static void demonstrateReduce() {
        System.out.println("2. Reduce Operations:");
        System.out.println("   reduce() combines stream elements using a binary operator\n");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Numbers: " + numbers);

        // Simple reduction - sum
        System.out.println("\na) Basic reduce with identity:");
        // [practice]  Sum all numbers using reduce with lambda expression

        // [practice]  Sum all numbers using reduce with method reference
        // [practice]  Calculate product of all numbers using reduce
        // Sum numbers without identity value - returns Optional
        Optional<Integer> sumOptional = numbers.stream()
                                              .reduce((a, b) -> a + b);
        System.out.println("Sum as Optional: " + sumOptional.orElse(0));

        // [practice]  Find maximum number using reduce with Integer::max method reference
        // String concatenation with reduce
        List<String> words = Arrays.asList("Java", "Stream", "Reduce", "Example");
        System.out.println("Words: " + words);

        // [practice]  Concatenate all strings without separator
        // [practice]  Concatenate all strings with space separator
        // [practice]  Find the longest word using reduce with custom comparator logic

        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Demonstrates min() and max() operations with Optional handling
     */
    private static void demonstrateMinMax() {
        System.out.println("3. Min and Max Operations:");
        System.out.println("   min() and max() return Optional<T> to handle empty streams safely\n");

        // Create a sample list of numbers
        List<Integer> numbers = Arrays.asList(15, 3, 8, 21, 7, 12, 4, 19, 6, 10);
        System.out.println("Numbers: " + numbers);

        // [practice]  Find minimum and maximum values from the list
        // [practice]  Find min and max using natural ordering comparator

        System.out.println("\nString comparisons:");
        // Create a sample list of words
        List<String> words = Arrays.asList("elephant", "cat", "butterfly", "dog", "ant");
        System.out.println("Words: " + words);

        // [practice]  Find shortest and longest strings by comparing their lengths

        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Demonstrates primitive stream aggregations (IntStream, LongStream, DoubleStream)
     */
    private static void demonstratePrimitiveStreamAggregation() {
        System.out.println("4. Primitive Stream Aggregations:");
        System.out.println("   Specialized operations for IntStream, LongStream, DoubleStream\n");

        System.out.println("a) IntStream operations:");
        // Create a sample array of integers
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array: " + Arrays.toString(intArray));

        // [practice]  Convert array to IntStream for operations

        // [practice]  Calculate sum of all elements in the stream

        // [practice]  Calculate average of all elements - streams can only be consumed once, so we create new streams

        // [practice]  Find minimum and maximum values in the stream

        // [practice]  Count the number of elements in the stream

        // Print subsection header for LongStream operations
        System.out.println("\nb) LongStream operations:");
        // [practice]  Create a sample array of long values

        // [practice]  Calculate sum of all long values in the stream

        // [practice]  Calculate average of all long values

        // Print subsection header for DoubleStream operations
        System.out.println("\nc) DoubleStream operations:");
        // [practice]  Create a sample array of double values

        // [practice]  Calculate sum of all double values in the stream

        // [practice]  Calculate average of all double values

        // [practice]  Print subsection header for converting to primitive streams
        System.out.println("\nd) Converting Wrapper Classes to primitive streams:");
        // Create a sample list of integers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // [practice]  Convert Integer objects to IntStream for sum operation

        // [practice]  Calculate sum of squares by mapping each number to its square

        // [practice]  Using IntStream.range to generate a range of integers and sum them

        // Print a separator line to end the section
        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Demonstrates advanced aggregation using collectors
     */
    private static void demonstrateCollectors() {
        // Print section title and short description
        System.out.println("5. Advanced Aggregation with Collectors:");
        System.out.println("   Using collect() with built-in and custom collectors\n");

        // Create a sample list of words
        List<String> words = Arrays.asList("java", "stream", "collect", "aggregate", "reduce", "map", "filter");
        System.out.println("Words: " + words);

        // Print subsection header for joining strings
        System.out.println("\na) String joining:");
        // [practice]  Join all words without any separator

        // [practice]  Join all words with comma and space separator

        // [practice]  Join all words with separators and prefix/suffix

        // [practice]  Statistical collectors
        System.out.println("\nd) Statistical collectors:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    }

}
