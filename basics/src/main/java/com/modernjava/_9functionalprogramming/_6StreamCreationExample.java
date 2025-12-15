package com.modernjava._9functionalprogramming;

import java.util.Random;
import java.util.stream.Stream;

/**
 * StreamCreationExample - Different Ways to Create Streams
 * Demonstrates various static methods for stream creation:
 * - Stream.of() - Creating streams from individual elements
 * - Stream.iterate() - Creating infinite streams with iterative function
 * - Stream.generate() - Creating infinite streams with supplier function
 */
public class _6StreamCreationExample {

    public static void main(String[] args) {
        System.out.println("=== Different Ways to Create Streams ===\n");

        // 1. Stream.of() - Creating streams from elements
        demonstrateStreamOf();

        // 2. Stream.iterate() - Creating iterative streams
        demonstrateStreamIterate();

        // 3. Stream.generate() - Creating streams with suppliers
        demonstrateStreamGenerate();

    }

    /**
     * Demonstrates Stream.of() method for creating streams from individual elements
     */
    private static void demonstrateStreamOf() {
        System.out.println("1. Stream.of() - Creating Streams from Elements:");
        System.out.println("   Stream.of() creates a finite stream from individual elements\n");

        // Creating stream from individual strings
        // Creating stream from individual numbers
        // Empty stream

    }

    /**
     * Demonstrates Stream.iterate() method for creating iterative streams
     */
    private static void demonstrateStreamIterate() {
        System.out.println("2. Stream.iterate() - Creating Iterative Streams:");
        System.out.println("   Stream.iterate(seed, unaryOperator) creates infinite streams with iteration\n");

        // Simple arithmetic progression - limit 10

        // String iteration - limnit 5

        // Java 9+ iterate with predicate (finite iteration) - numbers less than 50

    }

    /**
     * Demonstrates Stream.generate() method for creating streams with supplier functions
     */
    private static void demonstrateStreamGenerate() {
        System.out.println("3. Stream.generate() - Creating Streams with Suppliers:");
        System.out.println("   Stream.generate(supplier) creates infinite streams using supplier function\n");

        // Generating constant values - limit 5

        // Generating random numbers using Random bound from  (1-100) - limit 5

        // Generating random doubles using Math::random-  - limit 5

        // Generating current timestamp - limit 3
    }

}
