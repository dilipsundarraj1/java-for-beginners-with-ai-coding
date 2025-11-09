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

    static void main(String[] args) {
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

    }

    /**
     * Creating and manipulating ArrayList - add and remove operations
     */
    public static void createMoviesWithArrayList() {
        System.out.println("2. Creating and Manipulating ArrayList:");

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
    }
}
