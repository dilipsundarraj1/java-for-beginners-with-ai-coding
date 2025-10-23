package com.modernjava._8collections.arraylist.movie.moreexamples;

import com.modernjava.domain.Movie;
import com.modernjava._8collections.arraylist.movie.MovieDatabase;
import com.modernjava.domain.MovieGenre;

import java.util.ArrayList;
import java.util.List;

/**
 * MovieMatching - Demonstrates matching operations on ArrayList without lambdas/streams
 * Shows traditional loop-based approaches for finding and matching movies based on various criteria
 */
public class MovieMatching {

    public static void main(String[] args) {
        System.out.println("=== Movie Matching Operations (Without Lambdas/Streams) ===\n");

        List<Movie> allMovies = MovieDatabase.createDatabaseWithUnavailableMovies();

        // Display all movies first
        System.out.println("All Movies in Database:");
        printMovies(allMovies);
        System.out.println();

        // 1. Find first matching movie
        demonstrateFindFirst(allMovies);

        // 2. Check if any movie matches criteria
        demonstrateAnyMatch(allMovies);

        // 3. Check if all movies match criteria
        demonstrateAllMatch(allMovies);

        // 4. Check if no movies match criteria
        demonstrateNoneMatch(allMovies);

        // 5. Find and count matches
        demonstrateFindAndCount(allMovies);

        // 6. Find multiple matches with different criteria
        demonstrateMultipleMatching(allMovies);

        // 7. Complex matching scenarios
        demonstrateComplexMatching(allMovies);
    }

    private static void demonstrateFindFirst(List<Movie> movies) {
        System.out.println("1. Find First Matching Movie:");

        // Find first sci-fi movie
        Movie firstSciFi = findFirstMovieByGenre(movies, MovieGenre.SCI_FI);
        System.out.println("   First Sci-Fi movie: " +
                          (firstSciFi != null ? firstSciFi.title() : "None found"));

        // Find first movie with rating above 9.0
        Movie firstHighRated = findFirstMovieWithMinRating(movies, 9.0);
        System.out.println("   First movie with rating >= 9.0: " +
                          (firstHighRated != null ? firstHighRated.title() + " (" +
                          firstHighRated.rating() + "/10)" : "None found"));

        // Find first Christopher Nolan movie
        Movie firstNolanMovie = findFirstMovieByDirector(movies, "Christopher Nolan");
        System.out.println("   First Christopher Nolan movie: " +
                          (firstNolanMovie != null ? firstNolanMovie.title() : "None found"));
        System.out.println();
    }

    private static void demonstrateAnyMatch(List<Movie> movies) {
        System.out.println("2. Check if Any Movie Matches Criteria:");

        // Check if any movie is from the 1990s
        boolean hasNinetiesMovie = hasAnyMovieFromDecade(movies, 1990);
        System.out.println("   Has any movie from 1990s? " + hasNinetiesMovie);

        // Check if any movie is longer than 3 hours
        boolean hasLongMovie = hasAnyMovieLongerThan(movies, 180);
        System.out.println("   Has any movie longer than 3 hours? " + hasLongMovie);

        // Check if any movie is unavailable
        boolean hasUnavailableMovie = hasAnyUnavailableMovie(movies);
        System.out.println("   Has any unavailable movie? " + hasUnavailableMovie);

        // Check if any horror movie exists
        boolean hasHorrorMovie = hasAnyMovieOfGenre(movies, MovieGenre.HORROR);
        System.out.println("   Has any horror movie? " + hasHorrorMovie);
        System.out.println();
    }

    private static void demonstrateAllMatch(List<Movie> movies) {
        System.out.println("3. Check if All Movies Match Criteria:");

        // Check if all movies are available
        boolean allAvailable = areAllMoviesAvailable(movies);
        System.out.println("   Are all movies available? " + allAvailable);

        // Check if all movies have rating above 6.0
        boolean allWellRated = doAllMoviesHaveMinRating(movies, 6.0);
        System.out.println("   Do all movies have rating >= 6.0? " + allWellRated);

        // Check if all movies are from after 1970
        boolean allModern = areAllMoviesFromAfterYear(movies, 1970);
        System.out.println("   Are all movies from after 1970? " + allModern);

        // Check if all movies are longer than 100 minutes
        boolean allLongEnough = areAllMoviesLongerThan(movies, 100);
        System.out.println("   Are all movies longer than 100 minutes? " + allLongEnough);
        System.out.println();
    }

    private static void demonstrateNoneMatch(List<Movie> movies) {
        System.out.println("4. Check if No Movies Match Criteria:");

        // Check if no movies are from before 1950
        boolean noVeryOldMovies = areNoMoviesFromBeforeYear(movies, 1950);
        System.out.println("   Are there no movies from before 1950? " + noVeryOldMovies);

        // Check if no movies have rating below 5.0
        boolean noPoorMovies = areNoMoviesWithRatingBelow(movies, 5.0);
        System.out.println("   Are there no movies with rating below 5.0? " + noPoorMovies);

        // Check if no movies are documentaries
        boolean noDocumentaries = areNoMoviesOfGenre(movies, MovieGenre.DOCUMENTARY);
        System.out.println("   Are there no documentary movies? " + noDocumentaries);
        System.out.println();
    }

    private static void demonstrateFindAndCount(List<Movie> movies) {
        System.out.println("5. Find and Count Matches:");

        // Count movies by genre
        int actionCount = countMoviesByGenre(movies, MovieGenre.ACTION);
        int dramaCount = countMoviesByGenre(movies, MovieGenre.DRAMA);
        int sciFiCount = countMoviesByGenre(movies, MovieGenre.SCI_FI);

        System.out.println("   Movies by genre:");
        System.out.println("     Action: " + actionCount);
        System.out.println("     Drama: " + dramaCount);
        System.out.println("     Sci-Fi: " + sciFiCount);

        // Count highly rated movies
        int excellentMovies = countMoviesWithMinRating(movies, 8.5);
        System.out.println("   Excellent movies (>= 8.5): " + excellentMovies);

        // Count movies by decade
        int ninetiesMovies = countMoviesFromDecade(movies, 1990);
        int twoThousandMovies = countMoviesFromDecade(movies, 2000);
        System.out.println("   Movies by decade:");
        System.out.println("     1990s: " + ninetiesMovies);
        System.out.println("     2000s: " + twoThousandMovies);
        System.out.println();
    }

    private static void demonstrateMultipleMatching(List<Movie> movies) {
        System.out.println("6. Multiple Matching Examples:");

        // Find all Christopher Nolan movies
        List<Movie> nolanMovies = findAllMoviesByDirector(movies, "Christopher Nolan");
        System.out.println("   All Christopher Nolan movies (" + nolanMovies.size() + " found):");
        printMoviesList(nolanMovies);

        // Find all movies from the 1990s
        List<Movie> ninetiesMovies = findAllMoviesFromDecade(movies, 1990);
        System.out.println("   All movies from 1990s (" + ninetiesMovies.size() + " found):");
        printMoviesList(ninetiesMovies);
        System.out.println();
    }

    private static void demonstrateComplexMatching(List<Movie> movies) {
        System.out.println("7. Complex Matching Scenarios:");

        // Find best movie (highest rating)
        Movie bestMovie = findMovieWithHighestRating(movies);
        System.out.println("   Best movie (highest rating): " +
                          (bestMovie != null ? bestMovie.title() + " (" +
                          bestMovie.rating() + "/10)" : "None found"));

        // Find longest movie
        Movie longestMovie = findLongestMovie(movies);
        System.out.println("   Longest movie: " +
                          (longestMovie != null ? longestMovie.title() + " (" +
                          longestMovie.getFormattedDuration() + ")" : "None found"));

        // Find most recent movie
        Movie mostRecentMovie = findMostRecentMovie(movies);
        System.out.println("   Most recent movie: " +
                          (mostRecentMovie != null ? mostRecentMovie.title() + " (" +
                          mostRecentMovie.releaseYear() + ")" : "None found"));

        // Check for specific combinations
        boolean hasRecentHighRatedAction = hasRecentHighRatedActionMovie(movies);
        System.out.println("   Has recent high-rated action movie (after 2005, rating >= 8.5)? " +
                          hasRecentHighRatedAction);
        System.out.println();
    }

    // ===== FIND FIRST METHODS =====

    /**
     * Find first movie of specific genre
     */
    public static Movie findFirstMovieByGenre(List<Movie> movies, MovieGenre genre) {
        for (Movie movie : movies) {
            if (movie.genre() == genre) {
                return movie;
            }
        }
        return null;
    }

    /**
     * Find first movie with minimum rating
     */
    public static Movie findFirstMovieWithMinRating(List<Movie> movies, double minRating) {
        for (Movie movie : movies) {
            if (movie.rating() >= minRating) {
                return movie;
            }
        }
        return null;
    }

    /**
     * Find first movie by director
     */
    public static Movie findFirstMovieByDirector(List<Movie> movies, String director) {
        for (Movie movie : movies) {
            if (movie.director() != null && movie.director().equals(director)) {
                return movie;
            }
        }
        return null;
    }

    // ===== ANY MATCH METHODS =====

    /**
     * Check if any movie is from specified decade
     */
    public static boolean hasAnyMovieFromDecade(List<Movie> movies, int decade) {
        for (Movie movie : movies) {
            int movieDecade = (movie.releaseYear() / 10) * 10;
            if (movieDecade == decade) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if any movie is longer than specified duration
     */
    public static boolean hasAnyMovieLongerThan(List<Movie> movies, int duration) {
        for (Movie movie : movies) {
            if (movie.duration() > duration) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if any movie is unavailable
     */
    public static boolean hasAnyUnavailableMovie(List<Movie> movies) {
        for (Movie movie : movies) {
            if (!movie.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if any movie is of specific genre
     */
    public static boolean hasAnyMovieOfGenre(List<Movie> movies, MovieGenre genre) {
        for (Movie movie : movies) {
            if (movie.genre() == genre) {
                return true;
            }
        }
        return false;
    }

    // ===== ALL MATCH METHODS =====

    /**
     * Check if all movies are available
     */
    public static boolean areAllMoviesAvailable(List<Movie> movies) {
        for (Movie movie : movies) {
            if (!movie.isAvailable()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if all movies have minimum rating
     */
    public static boolean doAllMoviesHaveMinRating(List<Movie> movies, double minRating) {
        for (Movie movie : movies) {
            if (movie.rating() < minRating) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if all movies are from after specified year
     */
    public static boolean areAllMoviesFromAfterYear(List<Movie> movies, int year) {
        for (Movie movie : movies) {
            if (movie.releaseYear() <= year) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if all movies are longer than specified duration
     */
    public static boolean areAllMoviesLongerThan(List<Movie> movies, int duration) {
        for (Movie movie : movies) {
            if (movie.duration() <= duration) {
                return false;
            }
        }
        return true;
    }

    // ===== NONE MATCH METHODS =====

    /**
     * Check if no movies are from before specified year
     */
    public static boolean areNoMoviesFromBeforeYear(List<Movie> movies, int year) {
        for (Movie movie : movies) {
            if (movie.releaseYear() < year) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if no movies have rating below specified value
     */
    public static boolean areNoMoviesWithRatingBelow(List<Movie> movies, double rating) {
        for (Movie movie : movies) {
            if (movie.rating() < rating) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if no movies are of specific genre
     */
    public static boolean areNoMoviesOfGenre(List<Movie> movies, MovieGenre genre) {
        for (Movie movie : movies) {
            if (movie.genre() == genre) {
                return false;
            }
        }
        return true;
    }

    // ===== COUNT METHODS =====

    /**
     * Count movies by genre
     */
    public static int countMoviesByGenre(List<Movie> movies, MovieGenre genre) {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.genre() == genre) {
                count++;
            }
        }
        return count;
    }

    /**
     * Count movies with minimum rating
     */
    public static int countMoviesWithMinRating(List<Movie> movies, double minRating) {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating() >= minRating) {
                count++;
            }
        }
        return count;
    }

    /**
     * Count movies from specific decade
     */
    public static int countMoviesFromDecade(List<Movie> movies, int decade) {
        int count = 0;
        for (Movie movie : movies) {
            int movieDecade = (movie.releaseYear() / 10) * 10;
            if (movieDecade == decade) {
                count++;
            }
        }
        return count;
    }

    // ===== FIND ALL METHODS =====

    /**
     * Find all movies by director
     */
    public static List<Movie> findAllMoviesByDirector(List<Movie> movies, String director) {
        List<Movie> foundMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.director() != null && movie.director().equals(director)) {
                foundMovies.add(movie);
            }
        }
        return foundMovies;
    }

    /**
     * Find all movies from specific decade
     */
    public static List<Movie> findAllMoviesFromDecade(List<Movie> movies, int decade) {
        List<Movie> foundMovies = new ArrayList<>();
        for (Movie movie : movies) {
            int movieDecade = (movie.releaseYear() / 10) * 10;
            if (movieDecade == decade) {
                foundMovies.add(movie);
            }
        }
        return foundMovies;
    }

    // ===== COMPLEX FIND METHODS =====

    /**
     * Find movie with highest rating
     */
    public static Movie findMovieWithHighestRating(List<Movie> movies) {
        if (movies.isEmpty()) {
            return null;
        }

        Movie bestMovie = movies.get(0);
        for (Movie movie : movies) {
            if (movie.rating() > bestMovie.rating()) {
                bestMovie = movie;
            }
        }
        return bestMovie;
    }

    /**
     * Find longest movie
     */
    public static Movie findLongestMovie(List<Movie> movies) {
        if (movies.isEmpty()) {
            return null;
        }

        Movie longestMovie = movies.get(0);
        for (Movie movie : movies) {
            if (movie.duration() > longestMovie.duration()) {
                longestMovie = movie;
            }
        }
        return longestMovie;
    }

    /**
     * Find most recent movie
     */
    public static Movie findMostRecentMovie(List<Movie> movies) {
        if (movies.isEmpty()) {
            return null;
        }

        Movie mostRecent = movies.get(0);
        for (Movie movie : movies) {
            if (movie.releaseYear() > mostRecent.releaseYear()) {
                mostRecent = movie;
            }
        }
        return mostRecent;
    }

    /**
     * Check if has recent high-rated action movie
     */
    public static boolean hasRecentHighRatedActionMovie(List<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.genre() == MovieGenre.ACTION &&
                movie.rating() >= 8.5 &&
                movie.releaseYear() > 2005) {
                return true;
            }
        }
        return false;
    }

    // ===== HELPER METHODS =====

    /**
     * Helper method to print a list of movies
     */
    private static void printMoviesList(List<Movie> movies) {
        if (movies.isEmpty()) {
            System.out.println("     No movies found.");
            return;
        }
        for (Movie movie : movies) {
            System.out.println("     - " + movie.title() + " (" + movie.releaseYear() + ") - " +
                             movie.rating() + "/10");
        }
    }

    /**
     * Helper method to print movies in a formatted way
     */
    private static void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println("     - " + movie.title() +
                             " (" + movie.releaseYear() + ") " +
                             movie.genre() + " - " + movie.rating() + "/10 - " +
                             movie.getFormattedDuration() + " - Dir: " + movie.director());
        }
    }

    /**
     * Helper method to create a sample movie database
     * @deprecated Use MovieDatabase.createDatabaseWithUnavailableMovies() instead
     */
    @Deprecated
    private static List<Movie> createMovieDatabase() {
        return MovieDatabase.createDatabaseWithUnavailableMovies();
    }
}
