package com.modernjava._8collections.arraylist.movie;

import com.modernjava.domain.Movie;
import com.modernjava.domain.MovieGenre;

import java.util.ArrayList;
import java.util.List;

/**
 * MovieArrayList - Demonstrates ArrayList operations with Movie records
 * Shows creation, manipulation, filtering, and transformation of movie collections
 */
public class MovieArrayList {

    public static void main(String[] args) {
        System.out.println("=== Movie ArrayList Examples ===\n");

        // 1. Creating movies using List.of() - immutable list
        createMoviesWithListOf();

        // 2. Creating and manipulating ArrayList - mutable list
        createMoviesWithArrayList();

        // 3. Filtering movies
        filterMovies();

        // 4. Transforming movies
        transformMovies();

        // 5. Combined filtering and transforming
        filterAndTransformMovies();
    }

    /**
     * Creating an immutable list using List.of()
     */
    public static void createMoviesWithListOf() {
        System.out.println("1. Creating Movies with List.of():");

        // Create immutable list of movies using List.of()
        List<Movie> movies = List.of(
                new Movie("Inception", 148, MovieGenre.ACTION, 8.8, 2010, "Christopher Nolan"),
                new Movie("The Hangover", 100, MovieGenre.COMEDY, 7.7, 2009, "Todd Phillips")
        );

        System.out.println("Created " + movies.size() + " movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println();
    }

    /**
     * Creating and manipulating ArrayList - add and remove operations
     */
    public static void createMoviesWithArrayList() {
        System.out.println("2. Creating and Manipulating ArrayList:");

        // Create mutable ArrayList
        ArrayList<Movie> movies = new ArrayList<>();

        // Add movies using add() function
        movies.add(new Movie("The Dark Knight", 152, MovieGenre.ACTION, 9.0, 2008, "Christopher Nolan"));
        movies.add(new Movie("Titanic", 194, MovieGenre.ROMANCE, 7.9, 1997, "James Cameron"));

        System.out.println("After adding 2 movies: " + movies.size());

        // Add at specific index
        movies.add(1, new Movie("Pulp Fiction", 154, MovieGenre.DRAMA, 8.9, 1994, "Quentin Tarantino"));

        System.out.println("After inserting at index 1: " + movies.size());
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Remove movie using remove() function
        movies.remove(0); // Remove first movie
        System.out.println("\nAfter removing first movie: " + movies.size());
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println();
    }

    /**
     * Filtering movies based on criteria
     */
    public static void filterMovies() {
        System.out.println("3. Filtering Movies:");

        List<Movie> movies = List.of(
                new Movie("Avengers", 143, MovieGenre.ACTION, 8.4, 2012, "Joss Whedon"),
                new Movie("The Notebook", 123, MovieGenre.ROMANCE, 7.8, 2004, "Nick Cassavetes"),
                new Movie("John Wick", 101, MovieGenre.ACTION, 7.4, 2014, "Chad Stahelski"),
                new Movie("Toy Story", 81, MovieGenre.ANIMATION, 8.3, 1995, "John Lasseter")
        );

        // Filter movies with rating > 8.0 using traditional loop
        ArrayList<Movie> highRatedMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.rating() > 8.0) {
                highRatedMovies.add(movie);
            }
        }

        System.out.println("High-rated movies (>8.0):");
        for (Movie movie : highRatedMovies) {
            System.out.println(movie);
        }

        // Filter ACTION movies using traditional loop
        ArrayList<Movie> actionMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.genre() == MovieGenre.ACTION) {
                actionMovies.add(movie);
            }
        }

        System.out.println("\nAction movies:");
        for (Movie movie : actionMovies) {
            System.out.println(movie);
        }
        System.out.println();
    }

    /**
     * Transforming movies - extracting specific data
     */
    public static void transformMovies() {
        System.out.println("4. Transforming Movies:");

        List<Movie> movies = List.of(
                new Movie("Forrest Gump", 142, MovieGenre.DRAMA, 8.8, 1994, "Robert Zemeckis"),
                new Movie("Shrek", 90, MovieGenre.ANIMATION, 7.9, 2001, "Andrew Adamson")
        );

        // Transform to get only movie titles using traditional loop
        ArrayList<String> movieTitles = new ArrayList<>();
        for (Movie movie : movies) {
            movieTitles.add(movie.title());
        }

        System.out.println("Movie titles only:");
        for (String title : movieTitles) {
            System.out.println("- " + title);
        }

        // Transform to get formatted movie info using traditional loop
        ArrayList<String> movieSummaries = new ArrayList<>();
        for (Movie movie : movies) {
            String summary = movie.title() + " (" + movie.getFormattedDuration() + ")";
            movieSummaries.add(summary);
        }

        System.out.println("\nMovie summaries:");
        for (String summary : movieSummaries) {
            System.out.println("- " + summary);
        }
        System.out.println();
    }

    /**
     * Combined filtering and transforming - example of chaining operations
     */
    public static void filterAndTransformMovies() {
        System.out.println("5. Combined Filtering and Transforming Movies:");

        List<Movie> movies = List.of(
                new Movie("The Matrix", 136, MovieGenre.ACTION, 8.7, 1999, "Lana Wachowski"),
                new Movie("The Godfather", 175, MovieGenre.DRAMA, 9.2, 1972, "Francis Ford Coppola"),
                new Movie("Finding Nemo", 100, MovieGenre.ANIMATION, 8.1, 2003, "Andrew Stanton"),
                new Movie("The Shawshank Redemption", 142, MovieGenre.DRAMA, 9.3, 1994, "Frank Darabont")
        );

        // Filter movies with rating > 8.5 and transform to get only titles using traditional loop
        ArrayList<String> filteredMovieTitles = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.rating() > 8.5) {
                filteredMovieTitles.add(movie.title());
            }
        }

        System.out.println("High-rated movie titles (>8.5 rating):");
        for (String title : filteredMovieTitles) {
            System.out.println("- " + title);
        }

        // Filter ACTION/DRAMA movies and transform to formatted strings using traditional loop
        ArrayList<String> filteredSummaries = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.genre() == MovieGenre.ACTION || movie.genre() == MovieGenre.DRAMA) {
                String summary = movie.title() + " (" + movie.releaseYear() + ") - " + movie.rating() + "/10";
                filteredSummaries.add(summary);
            }
        }

        System.out.println("\nAction/Drama movie summaries:");
        for (String summary : filteredSummaries) {
            System.out.println("- " + summary);
        }
    }
}
