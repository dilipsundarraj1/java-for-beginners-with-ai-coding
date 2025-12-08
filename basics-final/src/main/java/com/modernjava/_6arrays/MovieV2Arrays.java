package com.modernjava._6arrays;

import com.modernjava._3classandobjects.MovieV2;
import com.modernjava._3classandobjects.MovieGenreEnum;
import com.modernjava._3classandobjects.MovieUtils;
import java.util.Arrays;

/**
 * This class demonstrates working with arrays of MovieV2 objects.
 * It includes examples for:
 * 1. Printing all movies
 * 2. Searching movies by Netflix Streaming Platform
 * 3. Collecting all action movies
 */
public class MovieV2Arrays {

    // Sample array of 10 movies
    private static final MovieV2[] movies = {
            new MovieV2("Inception", 148, MovieGenreEnum.SCI_FI, 8.8, 13, MovieUtils.StreamingPlatform_netflix),
            new MovieV2("The Dark Knight", 152, MovieGenreEnum.ACTION, 9.0, 12, MovieUtils.StreamingPlatform_netflix),
            new MovieV2("Forrest Gump", 142, MovieGenreEnum.DRAMA, 8.8, 10, MovieUtils.StreamingPlatform_amazonprime),
            new MovieV2("The Matrix", 136, MovieGenreEnum.ACTION, 8.7, 15, MovieUtils.StreamingPlatform_netflix),
            new MovieV2("Interstellar", 169, MovieGenreEnum.SCI_FI, 8.6, 13, MovieUtils.StreamingPlatform_netflix),
            new MovieV2("Pulp Fiction", 154, MovieGenreEnum.THRILLER, 8.9, 18, MovieUtils.StreamingPlatform_disney),
            new MovieV2("Fight Club", 139, MovieGenreEnum.ACTION, 8.8, 18, MovieUtils.StreamingPlatform_netflix),
            new MovieV2("The Shawshank Redemption", 142, MovieGenreEnum.DRAMA, 9.3, 15, MovieUtils.StreamingPlatform_amazonprime),
            new MovieV2("Gladiator", 155, MovieGenreEnum.ACTION, 8.5, 13, MovieUtils.StreamingPlatform_netflix),
            new MovieV2("Avatar", 162, MovieGenreEnum.SCI_FI, 7.8, 12, MovieUtils.StreamingPlatform_disney)
    };

    static void main(String[] args) {
        printAllMovies();
        searchNetflixMovies();
        collectActionMovies();
        sortMoviesByName();
    }



    /**
     * Function 1: Print all movies in the array
     */
    public static void printAllMovies() {
        System.out.println("=== All Movies ===");
        for (MovieV2 movie : movies) {
            movie.printMovie();
        }
    }

    /**
     * Function 2: Search for movies available on Netflix Streaming Platform
     */
    public static void searchNetflixMovies() {
        System.out.println("\n=== Netflix Movies ===");
        for (MovieV2 movie : movies) {
            if (MovieUtils.StreamingPlatform_netflix.equals(movie.getStreamingPlatform())) {
                movie.printMovie();
            }
        }
    }

    /**
     * Function 3: Collect all action genre movies
     */
    public static void collectActionMovies() {
        System.out.println("\n=== Action Movies ===");
        for (MovieV2 movie : movies) {
            if (movie.getGenre() == MovieGenreEnum.ACTION) {
                movie.printMovie();
            }
        }
    }

    /**
     * Function 4: Sort movies by name alphabetically
     */
    public static void sortMoviesByName() {
        System.out.println("\n=== Movies Sorted by Name ===");
        // Create a copy of the array to avoid modifying the original
        MovieV2[] sortedMovies = Arrays.copyOf(movies, movies.length);

        // Sort by movie title using comparator
        Arrays.sort(sortedMovies, (movie1, movie2) -> movie1.getTitle().compareTo(movie2.getTitle()));

        // Display sorted movies
        for (MovieV2 movie : sortedMovies) {
            movie.printMovie();
        }
    }


}

