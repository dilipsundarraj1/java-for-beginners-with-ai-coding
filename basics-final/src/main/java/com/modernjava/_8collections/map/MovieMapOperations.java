package com.modernjava._8collections.map;

import com.modernjava.domain.Movie;
import com.modernjava.domain.MovieGenre;

import java.util.*;
import java.util.stream.Collectors;

/**
 * MovieMapOperations - Practical Map examples using Movie domain objects
 *
 * This class demonstrates how to use Maps with real domain objects (Movie records).
 * It shows practical applications like creating movie databases, filtering collections,
 * grouping by various criteria, and performing data analysis operations.
 *
 * Perfect for understanding how Maps work with complex objects in real-world scenarios.
 */
public class MovieMapOperations {

    public static void main(String[] args) {
        System.out.println("=== MOVIE MAP OPERATIONS ===\n");

        // Create sample movie data
        List<Movie> movies = createSampleMovies();

        // Example 1: Basic Map operations with Movie objects
            // Create title->movie map using Collectors.toMap()
            // Lookup specific movies by title and check existence
            // Extract all movie titles sorted alphabetically
        basicMovieMapOperations(movies);

        // Example 2: Creating lookup maps from movie collections
            // Map by title (String -> Movie) - direct key-value mapping
            // Map by release year (Integer -> Movie) - using best rated if duplicates
            // Map by director (String -> List of movie titles) - grouping with downstream collector
            // Rating lookup table (String -> Double) - quick rating access by title
        createMovieLookupMaps(movies);

        // Example 3: Grouping movies using Maps
            // Basic grouping by genre using Collectors.groupingBy()
            // Count movies per genre using downstream counting collector
            // Calculate average ratings by genre using averagingDouble collector
        groupMoviesByGenre(movies);
    }

    /**
     * Creates sample movie data for demonstrations
     */
    private static List<Movie> createSampleMovies() {
        return Arrays.asList(
            new Movie("The Matrix", 136, MovieGenre.SCI_FI, 8.7, 1999, "The Wachowskis"),
            new Movie("Inception", 148, MovieGenre.SCI_FI, 8.8, 2010, "Christopher Nolan"),
            new Movie("The Dark Knight", 152, MovieGenre.ACTION, 9.0, 2008, "Christopher Nolan"),
            new Movie("Pulp Fiction", 154, MovieGenre.DRAMA, 8.9, 1994, "Quentin Tarantino"),
            new Movie("The Godfather", 175, MovieGenre.DRAMA, 9.2, 1972, "Francis Ford Coppola"),
            new Movie("Forrest Gump", 142, MovieGenre.DRAMA, 8.8, 1994, "Robert Zemeckis"),
            new Movie("The Shawshank Redemption", 142, MovieGenre.DRAMA, 9.3, 1994, "Frank Darabont"),
            new Movie("Toy Story", 81, MovieGenre.ANIMATION, 8.3, 1995, "John Lasseter"),
            new Movie("Finding Nemo", 100, MovieGenre.ANIMATION, 8.2, 2003, "Andrew Stanton"),
            new Movie("The Avengers", 143, MovieGenre.ACTION, 8.0, 2012, "Joss Whedon")
        );
    }

    /**
     * Basic Map operations with Movie objects
     */
    public static void basicMovieMapOperations(List<Movie> movies) {
        System.out.println("1. Basic Movie Map Operations:");

        // Create a simple title-to-movie map using Streams
        Map<String, Movie> moviesByTitle = movies.stream()
            .collect(Collectors.toMap(Movie::title, movie -> movie));

        System.out.println("Created movie database with " + moviesByTitle.size() + " movies");

        // Look up specific movies
        Movie matrix = moviesByTitle.get("The Matrix");
        if (matrix != null) {
            System.out.println("Found movie: " + matrix.title() + " (" + matrix.releaseYear() + ")");
            System.out.println("Rating: " + matrix.rating() + "/10, Genre: " + matrix.genre());
        }

        // Check if a movie exists
        boolean hasInception = moviesByTitle.containsKey("Inception");
        System.out.println("Database contains 'Inception': " + hasInception);

        // Get all movie titles using streams
        List<String> allTitles = moviesByTitle.keySet().stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("All movie titles: " + allTitles);

        System.out.println();
    }

    /**
     * Creating various lookup maps from movie collections
     */
    public static void createMovieLookupMaps(List<Movie> movies) {
        System.out.println("2. Creating Movie Lookup Maps:");

        // Map by title (String -> Movie)
        Map<String, Movie> byTitle = movies.stream()
            .collect(Collectors.toMap(Movie::title, movie -> movie));

        System.out.println("Movies by title: " + byTitle.size() + " entries");


        // Map by release year (Integer -> Movie) - using best rated if duplicates
        Map<Integer, Movie> byYear = movies.stream()
            .collect(Collectors.toMap(
                Movie::releaseYear,
                movie -> movie,
                (existing, replacement) ->
                    existing.rating() > replacement.rating() ? existing : replacement
            ));

        System.out.println("Movies by year: " + byYear.size() + " entries");
        System.out.println("Best movie from 1994: " + byYear.get(1994).title());
        // Map by director (String -> List of movie titles)
        Map<String, List<String>> moviesByDirector = movies.stream()
            .collect(Collectors.groupingBy(
                Movie::director,
                Collectors.mapping(Movie::title, Collectors.toList())
            ));

        System.out.println("\nMovies by director:");
        moviesByDirector.forEach((director, titles) ->
            System.out.println(director + ": " + titles));

        // Map of movie titles to ratings for quick rating lookup
        Map<String, Double> ratingLookup = movies.stream()
            .collect(Collectors.toMap(Movie::title, Movie::rating));

        System.out.println("\nQuick rating lookup:");
        System.out.println("The Godfather rating: " + ratingLookup.get("The Godfather"));
        System.out.println("Inception rating: " + ratingLookup.get("Inception"));

        System.out.println();
    }

    /**
     * Grouping movies by various criteria using Maps
     */
    public static void groupMoviesByGenre(List<Movie> movies) {
        System.out.println("3. Grouping Movies by Genre:");

        // Basic grouping by genre
        Map<MovieGenre, List<Movie>> moviesByGenre = movies.stream()
            .collect(Collectors.groupingBy(Movie::genre));

        System.out.println("Movies grouped by genre:");
        moviesByGenre.forEach((genre, movieList) -> {
            System.out.println(genre + " (" + movieList.size() + " movies):");
            movieList.forEach(movie ->
                System.out.println("  - " + movie.title() + " (" + movie.releaseYear() + ")"));
        });

        // Count movies by genre
        Map<MovieGenre, Long> movieCountByGenre = movies.stream()
            .collect(Collectors.groupingBy(Movie::genre, Collectors.counting()));

        System.out.println("\nMovie count by genre:");
        movieCountByGenre.entrySet().stream()
            .sorted(Map.Entry.<MovieGenre, Long>comparingByValue().reversed())
            .forEach(entry ->
                System.out.println(entry.getKey() + ": " + entry.getValue() + " movies"));

        // Average rating by genre
        Map<MovieGenre, Double> avgRatingByGenre = movies.stream()
            .collect(Collectors.groupingBy(
                Movie::genre,
                Collectors.averagingDouble(Movie::rating)
            ));

        System.out.println("\nAverage rating by genre:");
        avgRatingByGenre.entrySet().stream()
            .sorted(Map.Entry.<MovieGenre, Double>comparingByValue().reversed())
            .forEach(entry ->
                System.out.printf("%s: %.2f/10%n", entry.getKey(), entry.getValue()));

        System.out.println();
    }
}
