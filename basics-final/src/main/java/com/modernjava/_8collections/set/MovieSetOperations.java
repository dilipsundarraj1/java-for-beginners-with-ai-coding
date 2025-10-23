package com.modernjava._8collections.set;

import com.modernjava.domain.Movie;
import com.modernjava.domain.MovieGenre;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * MovieSetOperations - Practical Set examples using Movie domain objects
 *
 * Demonstrates how to use Set collections with Movie records:
 * 1. Ensuring uniqueness
 * 2. Basic add/remove/contains operations
 * 3. Set operations (union, intersection, difference)
 * 4. Using TreeSet for sorted sets
 */
public class MovieSetOperations {
    public static void main(String[] args) {
        // Sample movies
        Movie m1 = new Movie("Inception", 148, MovieGenre.SCI_FI, 8.8, 2010, "Christopher Nolan");
        Movie m2 = new Movie("The Matrix", 136, MovieGenre.SCI_FI, 8.7, 1999, "The Wachowskis");
        Movie m3 = new Movie("Pulp Fiction", 154, MovieGenre.DRAMA, 8.9, 1994, "Quentin Tarantino");
        Movie m4 = new Movie("Inception", 148, MovieGenre.SCI_FI, 8.8, 2011, "Christopher Nolan"); // duplicate

        // 1. Creating a Set from a List using Streams (ensures uniqueness)
        List<Movie> movieList = Arrays.asList(m1, m2, m3, m4);
        Set<Movie> movieSet = new HashSet<>(movieList);
        System.out.println("Unique movies in set (via streams): " + movieSet.size());
        movieSet.forEach(m -> System.out.println(m.title()));

        // 2. Basic operations using Streams
        boolean containsInception = movieSet.stream().anyMatch(m -> m.equals(m1));
        System.out.println("\nContains 'Inception'? " + containsInception);
        Set<Movie> removedMatrix = movieSet.stream()
            .filter(m -> !m.equals(m2))
            .collect(Collectors.toSet());
        System.out.println("After removing 'The Matrix' (via streams): " + removedMatrix.size());

        // 3. Set operations (union, intersection, difference) using Streams
        Set<Movie> dramaMovies = Stream.of(
            m3,
            new Movie("The Godfather", 175, MovieGenre.DRAMA, 9.2, 1972, "Francis Ford Coppola")
        ).collect(Collectors.toSet());

        // Union
        Set<Movie> union = Stream.concat(movieSet.stream(), dramaMovies.stream())
            .collect(Collectors.toSet());
        System.out.println("\nUnion size (via streams): " + union.size());

        // Intersection
        Set<Movie> intersection = movieSet.stream()
            .filter(dramaMovies::contains)
            .collect(Collectors.toSet());
        System.out.println("Intersection size (via streams): " + intersection.size());

        // Difference
        Set<Movie> difference = movieSet.stream()
            .filter(m -> !dramaMovies.contains(m))
            .collect(Collectors.toSet());
        System.out.println("Difference size (via streams): " + difference.size());

        // 4. Sorted movies (by title) using Streams
        List<Movie> sortedMovies = movieSet.stream()
            .sorted(Comparator.comparing(Movie::title))
            .toList();
        System.out.println("\nMovies sorted by title (via streams):");
        sortedMovies.forEach(m -> System.out.println(m.title()));
    }
}
