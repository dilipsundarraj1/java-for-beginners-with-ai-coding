package com.modernjava._9functionalprogramming;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * StreamCreationExample - Different Ways to Create Streams
 * Demonstrates various static methods for stream creation:
 * - Stream.of() - Creating streams from individual elements
 * - Stream.iterate() - Creating infinite streams with iterative function
 * - Stream.generate() - Creating infinite streams with supplier function
 */
public class _7StreamCreationExample {

    static void main(String[] args) {
        System.out.println("=== Different Ways to Create Streams ===\n");

        // 1. Stream.of() - Creating streams from elements

        // 2. Stream.iterate() - Creating iterative streams

        // 3. Stream.generate() - Creating streams with suppliers

        // 4. Practical examples combining stream creation with operations
    }

    /**
     * Demonstrates Stream.of() method for creating streams from individual elements
     */
    private static void demonstrateStreamOf() {
        System.out.println("1. Stream.of() - Creating Streams from Elements:");
        System.out.println("   Stream.of() creates a finite stream from individual elements\n");

        // Creating stream from individual strings
        System.out.println("Creating stream from individual strings:");
        Stream<String> fruitStream = Stream.of("apple", "banana", "cherry", "date");
        System.out.print("Fruits: ");
        fruitStream.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println("\n");

        // Creating stream from individual numbers
        System.out.println("Creating stream from individual numbers:");
        Stream<Integer> numberStream = Stream.of(10, 20, 30, 40, 50);
        System.out.print("Numbers: ");
        numberStream.forEach(num -> System.out.print(num + " "));
        System.out.println("\n");

        // Creating stream from mixed types (using Object)
        System.out.println("Creating stream from mixed types:");
        Stream<Object> mixedStream = Stream.of("Hello", 42, 3.14, true);
        System.out.print("Mixed types: ");
        mixedStream.forEach(item -> System.out.print(item + " "));
        System.out.println("\n");

        // Empty stream
        System.out.println("Creating empty stream:");
        Stream<String> emptyStream = Stream.of();
        System.out.println("Empty stream count: " + emptyStream.count());
        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Demonstrates Stream.iterate() method for creating iterative streams
     */
    private static void demonstrateStreamIterate() {
        System.out.println("2. Stream.iterate() - Creating Iterative Streams:");
        System.out.println("   Stream.iterate(seed, unaryOperator) creates infinite streams with iteration\n");

        // Simple arithmetic progression
        System.out.println("Arithmetic progression (starting from 1, adding 2):");
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // Powers of 2
        System.out.println("Powers of 2 (starting from 1, multiplying by 2):");
        Stream.iterate(1, n -> n * 2)
                .limit(10)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // String iteration
        System.out.println("String iteration (repeating 'Java' with increasing count):");
        Stream.iterate("Java", s -> s + "!")
                .limit(5)
                .forEach(s -> System.out.println("  " + s));
        System.out.println();

        // Java 9+ iterate with predicate (finite iteration)
        System.out.println("Iterate with condition (Java 9+) - numbers less than 50:");
        Stream.iterate(1, n -> n < 50, n -> n * 3)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");
        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Demonstrates Stream.generate() method for creating streams with supplier functions
     */
    private static void demonstrateStreamGenerate() {
        System.out.println("3. Stream.generate() - Creating Streams with Suppliers:");
        System.out.println("   Stream.generate(supplier) creates infinite streams using supplier function\n");

        // Generating constant values
        System.out.println("Generating constant values:");
        Stream.generate(() -> "Hello")
                .limit(5)
                .forEach(s -> System.out.print(s + " "));
        System.out.println("\n");

        // Generating random numbers
        System.out.println("Generating random numbers (1-100):");
        Random random = new Random();
        Stream.generate(() -> random.nextInt(100) + 1)
                .limit(8)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // Generating random doubles
        System.out.println("Generating random doubles:");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(d -> System.out.printf("%.3f ", d));
        System.out.println("\n");

        // Generating UUIDs
        System.out.println("Generating UUID strings (first 8 characters):");
        Stream.generate(() -> java.util.UUID.randomUUID().toString().substring(0, 8))
                .limit(3)
                .forEach(uuid -> System.out.println("  " + uuid));
        System.out.println();

        // Generating current timestamp
        System.out.println("Generating timestamps:");
        Stream.generate(() -> System.currentTimeMillis())
                .limit(3)
                .forEach(timestamp -> {
                    System.out.println("  " + timestamp);
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                });
        System.out.println();
        System.out.println("─────────────────────────────────────────────────────────\n");
    }

}
