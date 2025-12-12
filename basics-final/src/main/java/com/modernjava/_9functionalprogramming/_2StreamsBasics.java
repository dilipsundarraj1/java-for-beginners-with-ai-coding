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

        // 4. Combining operations - filter + map + sort + collect
        demonstrateCombinedOperations(movieNames);
    }



    private static void demonstrateBasicStreamOperations(List<String> movieNames) {

        // iterate all the elements in a list and print them
        System.out.println("1. Iterating and printing all movie names:");
        movieNames.stream()
                .forEach(System.out::println);

        // From the collection just select 3 elements and collect them in a list.
        System.out.println("\n2. Selecting first 3 elements:");
        List<String> firstThree = movieNames.stream()
                .limit(3)
                .toList();
        System.out.println(firstThree);

        // sort the list and collect the result in a list.
        System.out.println("\n3. Sorted list of movie names:");
        List<String> sortedMovies = movieNames.stream()
                .sorted()
                .toList();
        System.out.println(sortedMovies);
    }

    private static void demonstrateFiltering(List<String> movieNames) {

        // filter movie names that contain the word "The"
        // collect the result in a list.
        System.out.println("\n4. Movies containing 'The':");
        List<String> moviesWithThe = movieNames.stream()
                .filter(movie -> movie.contains("The"))
                .toList();
        System.out.println(moviesWithThe);

        // filter movie names with length greater than 10
        // collect the result in a list.
        System.out.println("\n5. Movies with length greater than 10:");
        List<String> longerMovies = movieNames.stream()
                .filter(movie -> movie.length() > 10)
                .toList();
        System.out.println(longerMovies);
    }

    private static void demonstrateMapping(List<String> movieNames) {

        // movie names to their moviename - moviename lengths
        // collect the result in a list.
        System.out.println("\n6. Movies with their lengths (name - length):");
        List<String> moviesWithLengths = movieNames.stream()
                .map(movie -> movie + " - " + movie.length())
                .toList();
        System.out.println(moviesWithLengths);

        // movie names to uppercase
        // collect the result in a list.
        System.out.println("\n7. Movies in uppercase:");
        List<String> uppercaseMovies = movieNames.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(uppercaseMovies);
    }

    private static void demonstrateCombinedOperations(List<String> movieNames) {

        // e.g., get sorted list of uppercase movie names that contain 'The'
        // collect the result in a list.
        // print the final list
        System.out.println("\n8. Sorted uppercase movies containing 'The':");
        List<String> result = movieNames.stream()
                .filter(movie -> movie.contains("The"))
                .map(String::toUpperCase)
                .sorted()
                .toList();
        System.out.println(result);
    }

}
