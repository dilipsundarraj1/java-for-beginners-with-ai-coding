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

        // 4. Practical examples - movie analytics
        demonstrateMovieAnalytics(movies);

        // 5. Complex stream pipelines
        demonstrateComplexStreamPipelines(movies);
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
                .collect(Collectors.toList());
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
     * Demonstrates practical movie analytics using streams
     */
    private static void demonstrateMovieAnalytics(List<Movie> movies) {
        System.out.println("4. Movie Analytics with Streams");
        System.out.println("=".repeat(50));

        // Group movies by genre
        System.out.println("Movies grouped by genre:");
        Map<MovieGenre, List<Movie>> moviesByGenre = movies.stream()
                .collect(Collectors.groupingBy(Movie::genre));

        moviesByGenre.forEach((genre, movieList) -> {
            System.out.println("  " + genre + " (" + movieList.size() + " movies):");
            movieList.forEach(movie -> System.out.println("    - " + movie.title()));
        });

        // Calculate statistics
        System.out.println("\nMovie Statistics:");
        double averageRating = movies.stream()
                .mapToDouble(Movie::rating)
                .average()
                .orElse(0.0);
        System.out.println("  Average rating: " + String.format("%.2f", averageRating));

        double averageDuration = movies.stream()
                .mapToInt(Movie::duration)
                .average()
                .orElse(0.0);
        System.out.println("  Average duration: " + String.format("%.1f", averageDuration) + " minutes");

        // Count by availability
        long availableCount = movies.stream()
                .filter(Movie::isAvailable)
                .count();
        System.out.println("  Available movies: " + availableCount + "/" + movies.size());

        System.out.println();
    }

    /**
     * Demonstrates complex stream pipelines combining multiple operations
     */
    private static void demonstrateComplexStreamPipelines(List<Movie> movies) {
        System.out.println("5. Complex Stream Pipelines");
        System.out.println("=".repeat(50));

        // Pipeline 1: Find top rated available movies from each genre
        System.out.println("Top rated available movie from each genre:");
        movies.stream()
                .filter(Movie::isAvailable)
                .collect(Collectors.groupingBy(
                    Movie::genre,
                    Collectors.maxBy(Comparator.comparing(Movie::rating))
                ))
                .forEach((genre, movieOpt) -> {
                    movieOpt.ifPresent(movie ->
                        System.out.println("  " + genre + ": " + movie.title() + " (" + movie.rating() + "/10)"));
                });

        // Pipeline 2: Create movie recommendations summary
        System.out.println("\nMovie Recommendations (high-rated, recent, available):");
        String recommendations = movies.stream()
                .filter(movie -> movie.rating() > 8.0)
                .filter(movie -> movie.releaseYear() > 1990)
                .filter(Movie::isAvailable)
                .sorted(Comparator.comparing(Movie::rating).reversed())
                .map(movie -> movie.title() + " (" + movie.rating() + "/10)")
                .collect(Collectors.joining(", "));

        System.out.println("  " + recommendations);

        // Pipeline 3: Directors with their movie count and average rating
        System.out.println("\nDirector Statistics:");
        movies.stream()
                .collect(Collectors.groupingBy(
                    Movie::director,
                    Collectors.averagingDouble(Movie::rating)
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry ->
                    System.out.println("  " + entry.getKey() + ": avg " + String.format("%.2f", entry.getValue())));

        // Pipeline 4: Genre analysis with multiple metrics
        System.out.println("\nGenre Analysis:");
        movies.stream()
                .collect(Collectors.groupingBy(Movie::genre))
                .forEach((genre, genreMovies) -> {
                    double avgRating = genreMovies.stream()
                            .mapToDouble(Movie::rating)
                            .average()
                            .orElse(0.0);
                    double avgDuration = genreMovies.stream()
                            .mapToInt(Movie::duration)
                            .average()
                            .orElse(0.0);
                    System.out.println("  " + genre + ": " + genreMovies.size() + " movies, " +
                            "avg rating " + String.format("%.2f", avgRating) + ", " +
                            "avg duration " + String.format("%.0f", avgDuration) + " min");
                });

        System.out.println("\nKey Benefits of Functional Programming:");
        System.out.println("✓ More readable and expressive code");
        System.out.println("✓ Less boilerplate and fewer intermediate variables");
        System.out.println("✓ Operations can be chained together naturally");
        System.out.println("✓ Easier to reason about data transformations");
        System.out.println("✓ Built-in support for parallel processing");
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
