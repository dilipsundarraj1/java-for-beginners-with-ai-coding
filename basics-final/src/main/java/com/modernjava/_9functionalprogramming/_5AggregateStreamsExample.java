package com.modernjava._9functionalprogramming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.modernjava.domain.Student;

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

        // Count all items in the stream
        long totalWords = words.stream().count();
        System.out.println("Total words: " + totalWords);

        // Count items after filtering by length
        long longWords = words.stream()
                              .filter(word -> word.length() > 5)
                              .count();
        System.out.println("Words longer than 5 characters: " + longWords);

        // Prepare a list with duplicate entries
        List<String> duplicates = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
        // Count distinct elements using distinct()
        long distinctFruits = duplicates.stream()
                                       .distinct()
                                       .count();
        System.out.println("Distinct fruits from " + duplicates + ": " + distinctFruits);

        System.out.println("─────────────────────────────────────────────────────────\n");
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
        // Sum all numbers using reduce with lambda expression
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);

        System.out.println("Sum using reduce: " + sum);

        // Sum all numbers using reduce with method reference
        int sumMethodRef = numbers.stream()
                                  .reduce(0, Integer::sum);
        System.out.println("Sum using method reference: " + sumMethodRef);

        // Calculate product of all numbers using reduce
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b);
        System.out.println("Product using reduce: " + product);

        System.out.println("\nb) Reduce without identity (returns Optional):");
        // Sum numbers without identity value - returns Optional
        Optional<Integer> sumOptional = numbers.stream()
                                              .reduce((a, b) -> a + b);
        System.out.println("Sum as Optional: " + sumOptional.orElse(0));

        // Find maximum number using reduce with Integer::max method reference
        Optional<Integer> max = numbers.stream()
                                      .reduce(Integer::max);
        System.out.println("Maximum using reduce: " + max.orElse(0));

        System.out.println("\nc) String concatenation with reduce:");
        // String concatenation with reduce
        List<String> words = Arrays.asList("Java", "Stream", "Reduce", "Example");
        System.out.println("Words: " + words);

        // Concatenate all strings without separator
        String concatenated = words.stream()
                                   .reduce("", (a, b) -> a + b);
        System.out.println("Concatenated: '" + concatenated + "'");

        // Concatenate all strings with space separator
        String spaceSeparated = words.stream()
                                     .reduce("", (a, b) -> a.isEmpty() ? b : a + " " + b);
        System.out.println("Space separated: '" + spaceSeparated + "'");

        System.out.println("\nd) Complex reduction - longest string:");
        // Find the longest word using reduce with custom comparator logic
        Optional<String> longest = words.stream()
                                        .reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2);
        System.out.println("Longest word: " + longest.orElse("none"));

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

        // Find minimum and maximum values from the list
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        System.out.println("Minimum: " + min.orElse(0));
        System.out.println("Maximum: " + max.orElse(0));

        // Find min and max using natural ordering comparator
        Optional<Integer> minNatural = numbers.stream().min(Comparator.naturalOrder());
        Optional<Integer> maxNatural = numbers.stream().max(Comparator.naturalOrder());

        System.out.println("Min (natural order): " + minNatural.orElse(0));
        System.out.println("Max (natural order): " + maxNatural.orElse(0));

        System.out.println("\nString comparisons:");
        // Create a sample list of words
        List<String> words = Arrays.asList("elephant", "cat", "butterfly", "dog", "ant");
        System.out.println("Words: " + words);

        // Find shortest and longest strings by comparing their lengths
        Optional<String> shortest = words.stream()
                                         .min(Comparator.comparing(String::length));
        Optional<String> longest = words.stream()
                                        .max(Comparator.comparing(String::length));

        System.out.println("Shortest word: " + shortest.orElse("none"));
        System.out.println("Longest word: " + longest.orElse("none"));

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

        // Convert array to IntStream for operations
        IntStream intStream = Arrays.stream(intArray);

        // Calculate sum of all elements in the stream
        int sum = intStream.sum();
        System.out.println("Sum: " + sum);

        // Calculate average of all elements - streams can only be consumed once, so we create new streams
        OptionalDouble average = Arrays.stream(intArray).average();
        System.out.println("Average: " + average.orElse(0.0));

        // Find minimum and maximum values in the stream
        OptionalInt min = Arrays.stream(intArray).min();
        OptionalInt max = Arrays.stream(intArray).max();
        System.out.println("Min: " + min.orElse(0) + ", Max: " + max.orElse(0));

        // Count the number of elements in the stream
        long count = Arrays.stream(intArray).count();
        System.out.println("Count: " + count);

        // Print subsection header for LongStream operations
        System.out.println("\nb) LongStream operations:");
        // Create a sample array of long values
        long[] longArray = {1000000L, 2000000L, 3000000L, 4000000L, 5000000L};
        System.out.println("Long array: " + Arrays.toString(longArray));

        // Calculate sum of all long values in the stream
        long longSum = Arrays.stream(longArray).sum();
        System.out.println("Long sum: " + longSum);

        // Calculate average of all long values
        OptionalDouble longAverage = Arrays.stream(longArray).average();
        System.out.println("Long average: " + longAverage.orElse(0.0));

        // Print subsection header for DoubleStream operations
        System.out.println("\nc) DoubleStream operations:");
        // Create a sample array of double values
        double[] doubleArray = {3.14, 2.71, 1.41, 1.73, 0.57};
        System.out.println("Double array: " + Arrays.toString(doubleArray));

        // Calculate sum of all double values in the stream
        double doubleSum = Arrays.stream(doubleArray).sum();
        System.out.println("Double sum: " + String.format("%.4f", doubleSum));

        // Calculate average of all double values
        OptionalDouble doubleAverage = Arrays.stream(doubleArray).average();
        System.out.println("Double average: " + String.format("%.4f", doubleAverage.orElse(0.0)));

        // Print subsection header for converting to primitive streams
        System.out.println("\nd) Converting Wrapper Classes to primitive streams:");
        // Create a sample list of integers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Convert Integer objects to IntStream for sum operation
        int streamSum = numbers.stream()
                               .mapToInt(Integer::intValue)
                               .sum();
        System.out.println("Sum using mapToInt: " + streamSum);

        // Calculate sum of squares by mapping each number to its square
        int sumOfSquares = numbers.stream()
                                  .mapToInt(n -> n * n)
                                  .sum();
        System.out.println("Sum of squares: " + sumOfSquares);

        // Using IntStream.range to generate a range of integers and sum them
        int sumIntRange = IntStream.range(0,10)
                .sum();
        System.out.println("Sum of IntStream.range(0,10): " + sumIntRange);

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
        // Join all words without any separator
        String joined = words.stream().collect(Collectors.joining());
        System.out.println("Joined: " + joined);

        // Join all words with comma and space separator
        String commaSeparated = words.stream().collect(Collectors.joining(", "));
        System.out.println("Comma separated: " + commaSeparated);

        // Join all words with separators and prefix/suffix
        String withPrefix = words.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println("With prefix/suffix: " + withPrefix);

        // Statistical collectors
        System.out.println("\nd) Statistical collectors:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Get summary statistics using Collectors.summarizingInt
        IntSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Statistics: " + stats);
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());


    }


    /**
     * Key Takeaways for Aggregate Operations:
     *
     * 1. TERMINAL OPERATIONS:
     *    - All aggregate operations are terminal (end the stream)
     *    - They trigger the execution of the entire stream pipeline
     *
     * 2. OPTIONAL HANDLING:
     *    - min(), max() return Optional to handle empty streams
     *    - Always use orElse(), orElseGet(), or check isPresent()
     *
     * 3. PRIMITIVE STREAMS:
     *    - IntStream, LongStream, DoubleStream have specialized methods
     *    - sum(), average() available without Optional wrapping
     *    - Use mapToInt(), mapToLong(), mapToDouble() to convert
     *
     * 4. REDUCE FLEXIBILITY:
     *    - Most powerful aggregate operation
     *    - Can implement any other aggregate operation
     *    - Three forms: with identity, without identity, with combiner
     *
     * 5. COLLECTORS:
     *    - Powerful tool for complex aggregations
     *    - Built-in collectors for common operations
     *    - Can create custom collectors for specific needs
     *
     * 6. PERFORMANCE CONSIDERATIONS:
     *    - Aggregate operations can be parallelized
     *    - Consider using parallel streams for large datasets
     *    - Primitive streams are more efficient for numeric operations
     */
}
