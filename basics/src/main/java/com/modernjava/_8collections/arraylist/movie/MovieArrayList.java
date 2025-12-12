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
            // Create 2 elements in the list using List.of() with different genres

        // 2. Creating and manipulating ArrayList - mutable list
        // Create a mutable ArrayList of movies
        // Add at least 3 movies to the list using add function
        // Add a movie at a specific index using add(index, element)
        // remove the first movie using the remove() function


        // 3. Filtering movies
        // Use MovieDatabase.createSampleDatabase
        // Filter the movies which are of genre ACTION and have rating above 8.0
        // Filter the movies that are released after 2015

        // 4. Transforming movies
        // Use MovieDatabase.createSampleDatabase
        // Transform the list of movies to a list of movie titles
        // Transform the list of movies-director pairs

        // 5. Combined filtering and transforming
        // Use MovieDatabase.createSampleDatabase
        // Filter the movies that are released after 2015
        // Transform the  MOvie to formatted strings : The Matrix (1999) - 8.7/10

    }


}
