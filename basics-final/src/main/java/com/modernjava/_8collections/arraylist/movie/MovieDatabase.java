package com.modernjava._8collections.arraylist.movie;

import com.modernjava.domain.Movie;
import com.modernjava.domain.MovieGenre;

import java.util.ArrayList;
import java.util.List;

/**
 * MovieDatabase - Centralized movie database utility for all collection demonstrations
 * Provides consistent movie data across filtering, matching, transformation, and demo classes
 */
public class MovieDatabase {

    /**
     * Creates a comprehensive movie database for demonstrations
     * Contains movies from different decades, genres, and with varying ratings
     *
     * @return List of Movie records with sample data for testing and demonstrations
     */
    public static List<Movie> createSampleDatabase() {
        List<Movie> movies = new ArrayList<>();

        // Classic movies (pre-2000)
        movies.add(new Movie("The Godfather", 175, MovieGenre.DRAMA, 9.2, 1972, "Francis Ford Coppola"));
        movies.add(new Movie("Casablanca", 102, MovieGenre.DRAMA, 8.5, 1942, "Michael Curtiz"));
        movies.add(new Movie("The Wizard of Oz", 102, MovieGenre.FANTASY, 8.0, 1939, "Victor Fleming"));
        movies.add(new Movie("Pulp Fiction", 154, MovieGenre.DRAMA, 8.9, 1994, "Quentin Tarantino"));
        movies.add(new Movie("The Shawshank Redemption", 142, MovieGenre.DRAMA, 9.3, 1994, "Frank Darabont"));
        movies.add(new Movie("Goodfellas", 146, MovieGenre.DRAMA, 8.7, 1990, "Martin Scorsese"));
        movies.add(new Movie("The Matrix", 136, MovieGenre.SCI_FI, 8.7, 1999, "Wachowski Sisters"));
        movies.add(new Movie("Forrest Gump", 142, MovieGenre.DRAMA, 8.8, 1994, "Robert Zemeckis"));

        // 2000s movies
        movies.add(new Movie("The Dark Knight", 152, MovieGenre.ACTION, 9.0, 2008, "Christopher Nolan"));
        movies.add(new Movie("Lord of the Rings: Return of the King", 201, MovieGenre.FANTASY, 8.9, 2003, "Peter Jackson"));
        movies.add(new Movie("Finding Nemo", 100, MovieGenre.ANIMATION, 8.1, 2003, "Andrew Stanton"));
        movies.add(new Movie("WALL-E", 98, MovieGenre.ANIMATION, 8.4, 2008, "Andrew Stanton"));

        // 2010s movies
        movies.add(new Movie("Inception", 148, MovieGenre.SCI_FI, 8.8, 2010, "Christopher Nolan"));
        movies.add(new Movie("The Avengers", 143, MovieGenre.ACTION, 8.0, 2012, "Joss Whedon"));
        movies.add(new Movie("Interstellar", 169, MovieGenre.SCI_FI, 8.6, 2014, "Christopher Nolan"));
        movies.add(new Movie("Mad Max: Fury Road", 120, MovieGenre.ACTION, 8.1, 2015, "George Miller"));
        movies.add(new Movie("Parasite", 132, MovieGenre.THRILLER, 8.6, 2019, "Bong Joon-ho"));

        // 2020s movies
        movies.add(new Movie("Dune", 155, MovieGenre.SCI_FI, 8.0, 2021, "Denis Villeneuve"));
        movies.add(new Movie("Spider-Man: No Way Home", 148, MovieGenre.ACTION, 8.2, 2021, "Jon Watts"));

        return movies;
    }

    /**
     * Creates a movie database with some movies marked as unavailable
     * Useful for testing filtering operations and availability-based logic
     *
     * @return List of Movie records with some unavailable movies
     */
    public static List<Movie> createDatabaseWithUnavailableMovies() {
        List<Movie> movies = createSampleDatabase();

        // Mark some movies as unavailable for demonstration purposes
        movies.set(0, movies.get(0).withAvailability(false)); // The Godfather
        movies.set(5, movies.get(5).withAvailability(false)); // Goodfellas

        return movies;
    }

    /**
     * Creates a basic movie database for simple demonstrations
     * Contains fewer movies for cleaner output in basic examples
     *
     * @return List of Movie records with basic sample data
     */
    public static List<Movie> createBasicDatabase() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("The Matrix", 136, MovieGenre.SCI_FI, 8.7, 1999, "Wachowski Sisters"));
        movies.add(new Movie("Inception", 148, MovieGenre.SCI_FI, 8.8, 2010, "Christopher Nolan"));
        movies.add(new Movie("The Dark Knight", 152, MovieGenre.ACTION, 9.0, 2008, "Christopher Nolan"));
        movies.add(new Movie("Pulp Fiction", 154, MovieGenre.DRAMA, 8.9, 1994, "Quentin Tarantino"));
        movies.add(new Movie("The Shawshank Redemption", 142, MovieGenre.DRAMA, 9.3, 1994, "Frank Darabont"));
        movies.add(new Movie("Forrest Gump", 142, MovieGenre.DRAMA, 8.8, 1994, "Robert Zemeckis"));

        return movies;
    }

    /**
     * Creates a test movie database for performance demonstrations
     * Generates movies programmatically for testing with large datasets
     *
     * @param size Number of movies to generate
     * @return List of Movie records for performance testing
     */
    public static List<Movie> createTestDatabase(int size) {
        List<Movie> movies = new ArrayList<>();
        MovieGenre[] genres = MovieGenre.values();

        for (int i = 0; i < size; i++) {
            String title = "Test Movie " + (i + 1);
            int duration = 90 + (i % 120); // Duration between 90-210 minutes
            MovieGenre genre = genres[i % genres.length];
            double rating = 5.0 + (i % 6); // Rating between 5.0-10.0
            int releaseYear = 1980 + (i % 45); // Years between 1980-2024
            String director = "Director " + (i % 100 + 1);

            movies.add(new Movie(title, duration, genre, rating, releaseYear, director));
        }

        return movies;
    }
}
