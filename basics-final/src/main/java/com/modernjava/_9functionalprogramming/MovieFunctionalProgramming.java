package com.modernjava._9functionalprogramming;

import com.modernjava.domain.Movie;
import com.modernjava.domain.MovieGenre;

import java.util.Comparator;
import java.util.List;
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
        movies.forEach(movie -> System.out.println("  " + movie));
        System.out.println();
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
        System.out.println("\nFunctional Approach - High-rated movies (>8.5):");
        List<Movie> highRatedFunctional = movies.stream()
                .filter(movie -> movie.rating() > 8.5)
                .toList();
        System.out.println("Found " + highRatedFunctional.size() + " high-rated movies");
        highRatedFunctional.forEach(movie -> System.out.println("  " + movie.title() + " - " + movie.rating()));

        // More examples with different criteria
        System.out.println("\nAction movies available for streaming:");
        movies.stream()
                .filter(movie -> movie.genre() == MovieGenre.ACTION)
                .filter(Movie::isAvailable)  // Method reference
                .forEach(movie -> System.out.println("  " + movie.title()));

        System.out.println("\nMovies from the 1990s:");
        movies.stream()
                .filter(movie -> movie.releaseYear() >= 1990 && movie.releaseYear() < 2000)
                .forEach(movie -> System.out.println("  " + movie.title() + " (" + movie.releaseYear() + ")"));

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
        System.out.println("\nFunctional Approach - Extract movie titles:");
        List<String> titlesFunctional = movies.stream()
                .map(Movie::title)
                .collect(Collectors.toList());
        System.out.println("Movie titles: " + titlesFunctional);

        // More transformation examples
        System.out.println("\nMovie durations in hours:");
        movies.stream()
                .map(movie -> movie.title() + ": " + String.format("%.1f", movie.duration() / 60.0) + "h")
                .forEach(System.out::println);

        System.out.println("\nMovie ratings as letter grades:");
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

        Optional<Movie> longestMovie = movies.stream()
                .max(Comparator.comparing(Movie::duration));
        longestMovie.ifPresent(movie ->
            System.out.println("  Longest movie: " + movie.title() + " (" + movie.duration() + " min)"));

        Optional<Movie> bestRatedMovie = movies.stream()
                .max(Comparator.comparing(Movie::rating));
        bestRatedMovie.ifPresent(movie ->
            System.out.println("  Best rated movie: " + movie.title() + " (" + movie.rating() + "/10)"));

        Optional<Movie> oldestMovie = movies.stream()
                .min(Comparator.comparing(Movie::releaseYear));
        oldestMovie.ifPresent(movie ->
            System.out.println("  Oldest movie: " + movie.title() + " (" + movie.releaseYear() + ")"));

        // Checking conditions
        System.out.println("\nCondition checks:");
        boolean hasActionMovies = movies.stream()
                .anyMatch(movie -> movie.genre() == MovieGenre.ACTION);
        System.out.println("  Has action movies: " + hasActionMovies);

        boolean allMoviesAvailable = movies.stream()
                .allMatch(Movie::isAvailable);
        System.out.println("  All movies available: " + allMoviesAvailable);

        long recentMoviesCount = movies.stream()
                .filter(movie -> movie.releaseYear() > 2000)
                .count();
        System.out.println("  Recent movies (after 2000): " + recentMoviesCount);

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
