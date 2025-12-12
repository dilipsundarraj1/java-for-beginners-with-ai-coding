package com.modernjava._9functionalprogramming;

import java.util.List;

/**
 * StreamsBasics - Introduction to Java Streams API
 * Demonstrates how Streams make collection operations simpler and more readable
 * Building on lambda expressions to show powerful data processing pipelines
 */
public class _2StreamsBasics {

    static void main(String[] args) {
        System.out.println("=== Java Streams Basics ===\n");

        // Create a list of String of random movie names.
        List<String> movieNames = List.of(
                "The Shawshank Redemption",
                "The Godfather",
                "The Dark Knight",
                "Pulp Fiction",
                "Forrest Gump",
                "Inception",
                "The Matrix",
                "Interstellar",
                "Fight Club",
                "Gladiator"
        );
        // 1. Basic stream operations
        demonstrateBasicStreamOperations(movieNames);

        // 2. Filtering with streams
        demonstrateFiltering(movieNames);


        // 3. Mapping (transforming) with streams
        demonstrateMapping(movieNames);

        // 4. Combining operations - the power of streams
        demonstrateCombinedOperations(movieNames);
    }

    private static void demonstrateBasicStreamOperations(List<String> movieNames) {

        // iterate all the elements in a list and print them
        // From the collection just select 3 elements and collect them in a list.
        // sort the list and collect the result in a list.
    }

    private static void demonstrateFiltering(List<String> movieNames) {
        // filter movie names that contain the word "The"
        // collect the result in a list.
        // filter movie names with length greater than 10
        // collect the result in a list.

    }

    private static void demonstrateMapping(List<String> movieNames) {
        // movie names to their moviename - moviename lengths
        // collect the result in a list.

        // movie names to uppercase
        // collect the result in a list.
    }

    private static void demonstrateCombinedOperations(List<String> movieNames) {

        // Filter movie names containing "The", convert to uppercase, sort them, and collect the result.

    }

}