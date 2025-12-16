package com.modernjava._9functionalprogramming;

import com.modernjava.domain.Movie;
import com.modernjava.domain.MovieGenre;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * MovieFunctionalProgramming - Demonstrates functional programming with Movie objects
 * Shows how lambdas and streams simplify operations compared to traditional approaches
 * Building on the MovieArrayList examples with functional programming concepts
 */
public class MovieFunctionalProgramming {

    static void main(String[] args) {
        System.out.println("=== Movie Functional Programming Examples ===\n");

        // Create sample movie data
        List<Movie> movies = createSampleMovies();
        displayMovieCollection(movies);

        // 1. Traditional vs Functional filtering
        demonstrateTraditionalVsFunctionalFiltering(movies);

        // 2. Traditional vs Functional transformation
        demonstrateTraditionalVsFunctionalTransformation(movies);

        // 3. Advanced functional operations
        demonstrateAdvancedFunctionalOperations(movies);
    }

    /**
     * Creates sample movie data for demonstrations
     */
    private static List<Movie> createSampleMovies() {
        return List.of(
                new Movie("The Matrix", 136, MovieGenre.ACTION, 8.7, 1999, "Lana Wachowski", true),
                new Movie("The Godfather", 175, MovieGenre.DRAMA, 9.2, 1972, "Francis Ford Coppola", true),
                new Movie("Finding Nemo", 100, MovieGenre.ANIMATION, 8.1, 2003, "Andrew Stanton", false),
                new Movie("The Shawshank Redemption", 142, MovieGenre.DRAMA, 9.3, 1994, "Frank Darabont", true),
                new Movie("Avengers", 143, MovieGenre.ACTION, 8.4, 2012, "Joss Whedon", true),
                new Movie("The Notebook", 123, MovieGenre.ROMANCE, 7.8, 2004, "Nick Cassavetes", false),
                new Movie("John Wick", 101, MovieGenre.ACTION, 7.4, 2014, "Chad Stahelski", true),
                new Movie("Toy Story", 81, MovieGenre.ANIMATION, 8.3, 1995, "John Lasseter", true),
                new Movie("Casablanca", 102, MovieGenre.ROMANCE, 8.5, 1942, "Michael Curtiz", true),
                new Movie("Spirited Away", 125, MovieGenre.ANIMATION, 9.0, 2001, "Hayao Miyazaki", false)
        );
    }

    private static void displayMovieCollection(List<Movie> movies) {
        System.out.println("Sample Movie Collection (" + movies.size() + " movies):");
        // Display each movie using forEach
    }

    /**
     * Compares traditional filtering approaches with functional programming
     *
     * Covers:
     * - Traditional for-loop filtering vs Stream API filtering
     * - Single filter conditions (rating > 8.5)
     * - Multiple chained filters (genre AND availability)
     * - Date range filtering (movies from specific decade)
     * - Method references (Movie::isAvailable)
     */
    private static void demonstrateTraditionalVsFunctionalFiltering(List<Movie> movies) {
        System.out.println("1. Filtering: Traditional vs Functional Approach");
        System.out.println("=".repeat(50));

        // TRADITIONAL APPROACH (from MovieArrayList)
        System.out.println("Traditional Approach - High-rated movies (>8.5):");
        List<Movie> highRatedTraditional = new java.util.ArrayList<>();
        for (Movie movie : movies) {
            if (movie.rating() > 8.5) {
                highRatedTraditional.add(movie);
            }
        }
        System.out.println("Found " + highRatedTraditional.size() + " high-rated movies");
        highRatedTraditional.forEach(movie -> System.out.println("  " + movie.title() + " - " + movie.rating()));

        // FUNCTIONAL APPROACH with Streams
        // filtering high-rated movies with rating > 8.5 using Stream API


        // More examples with different criteria
        System.out.println("\nAction movies available for streaming:");
        // filtering action genre movies that are available using method reference

        System.out.println("\nMovies from the 1990s:");
        // filtering movies released in the 1990s using Stream API

        System.out.println();
    }

    /**
     * Compares traditional transformation approaches with functional programming
     *
     * Covers:
     * - Traditional for-loop extraction vs Stream API map()
     * - Extracting single properties (titles)
     * - Transforming with calculations (duration conversion to hours)
     * - Formatting transformations (rating to letter grades)
     * - Method references for property extraction (Movie::title)
     */
    private static void demonstrateTraditionalVsFunctionalTransformation(List<Movie> movies) {
        System.out.println("2. Transformation: Traditional vs Functional Approach");
        System.out.println("=".repeat(50));

        // TRADITIONAL APPROACH
        System.out.println("Traditional Approach - Extract movie titles:");
        List<String> titlesTraditional = new java.util.ArrayList<>();
        for (Movie movie : movies) {
            titlesTraditional.add(movie.title());
        }
        System.out.println("Movie titles: " + titlesTraditional);

        // FUNCTIONAL APPROACH
        // extracting movie titles using Stream API map() and method reference
        // Example: The Matrix, The Godfather, Finding Nemo, etc.
        System.out.println("\nFunctional Approach - Extract movie titles:");
        List<String> titlesFunctional = movies.stream()
                .map(Movie::title)
                .collect(Collectors.toList());
        System.out.println("Movie titles: " + titlesFunctional);

        // More transformation examples
        // converting movie durations from minutes to hours
        // Example: The Matrix: 2.3h, The Godfather: 2.9h, Finding Nemo: 1.7h, etc.
        System.out.println("\nMovie durations in hours:");
        movies.stream()
                .map(movie -> movie.title() + ": " + String.format("%.1f", movie.duration() / 60.0) + "h")
                .forEach(System.out::println);

        System.out.println("\nMovie ratings as letter grades:");
        // converting numeric ratings to letter grades
        // Example: The Matrix: A, The Godfather: A+, Finding Nemo: A
        movies.stream()
                .map(movie -> movie.title() + ": " + getRatingGrade(movie.rating()))
                .forEach(System.out::println);

        System.out.println();
    }

    /**
     * Demonstrates advanced functional operations not easily done traditionally
     *
     * Covers:
     * - Finding operations: max(), min() with custom comparators
     * - Optional handling with ifPresent()
     * - Existence checks: anyMatch(), allMatch()
     * - Counting filtered elements
     * - Complex comparisons (duration, rating, release year)
     */
    private static void demonstrateAdvancedFunctionalOperations(List<Movie> movies) {
        System.out.println("3. Advanced Functional Operations");
        System.out.println("=".repeat(50));

        // Finding operations
        System.out.println("Finding operations:");

        // finding the longest movie by duration
        // Example output: Longest movie: The Godfather (175 min)
        Optional<Movie> longestMovie = movies.stream()
                .max(Comparator.comparing(Movie::duration));
        longestMovie.ifPresent(movie ->
            System.out.println("  Longest movie: " + movie.title() + " (" + movie.duration() + " min)"));

        // finding the best rated movie
        // Example output: Best rated movie: The Shawshank Redemption (9.3/
        Optional<Movie> bestRatedMovie = movies.stream()
                .max(Comparator.comparing(Movie::rating));
        bestRatedMovie.ifPresent(movie ->
            System.out.println("  Best rated movie: " + movie.title() + " (" + movie.rating() + "/10)"));

        // finding the oldest movie by release year
        // Example output: Oldest movie: Casablanca (1942)
        Optional<Movie> oldestMovie = movies.stream()
                .min(Comparator.comparing(Movie::releaseYear));
        oldestMovie.ifPresent(movie ->
            System.out.println("  Oldest movie: " + movie.title() + " (" + movie.releaseYear() + ")"));


        System.out.println();
    }

    /**
     * Helper method to convert numeric rating to letter grade
     */
    private static String getRatingGrade(double rating) {
        if (rating >= 9.0) return "A+";
        if (rating >= 8.5) return "A";
        if (rating >= 8.0) return "A-";
        if (rating >= 7.5) return "B+";
        if (rating >= 7.0) return "B";
        return "B-";
    }
}
