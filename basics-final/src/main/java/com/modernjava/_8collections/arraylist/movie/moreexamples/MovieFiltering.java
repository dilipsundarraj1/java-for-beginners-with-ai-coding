package com.modernjava._8collections.arraylist.movie.moreexamples;

import com.modernjava.domain.Movie;
import com.modernjava._8collections.arraylist.movie.MovieDatabase;
import com.modernjava.domain.MovieGenre;

import java.util.ArrayList;
import java.util.List;

/**
 * MovieFiltering - Demonstrates filtering operations on ArrayList without lambdas/streams
 * Shows traditional loop-based approaches for filtering movies based on various criteria
 */
public class MovieFiltering {

    public static void main(String[] args) {
        System.out.println("=== Movie Filtering Operations (Without Lambdas/Streams) ===\n");

        List<Movie> allMovies = MovieDatabase.createDatabaseWithUnavailableMovies();

        // Display all movies first
        System.out.println("All Movies in Database:");
        printMovies(allMovies);
        System.out.println();

        // 1. Filter by genre
        demonstrateFilterByGenre(allMovies);

        // 2. Filter by rating
        demonstrateFilterByRating(allMovies);

        // 3. Filter by release year
        demonstrateFilterByReleaseYear(allMovies);

        // 4. Filter by duration
        demonstrateFilterByDuration(allMovies);

        // 5. Complex filtering (multiple criteria)
        demonstrateComplexFiltering(allMovies);

        // 6. Filter with custom conditions
        demonstrateCustomFiltering(allMovies);
    }

    private static void demonstrateFilterByGenre(List<Movie> allMovies) {
        System.out.println("1. Filter Movies by Genre:");

        // Filter Science Fiction movies
        List<Movie> sciFiMovies = filterMoviesByGenre(allMovies, MovieGenre.SCI_FI);
        System.out.println("   Science Fiction Movies (" + sciFiMovies.size() + " found):");
        printMovies(sciFiMovies);

        // Filter Action movies
        List<Movie> actionMovies = filterMoviesByGenre(allMovies, MovieGenre.ACTION);
        System.out.println("   Action Movies (" + actionMovies.size() + " found):");
        printMovies(actionMovies);
        System.out.println();
    }

    private static void demonstrateFilterByRating(List<Movie> allMovies) {
        System.out.println("2. Filter Movies by Rating:");

        // Filter highly rated movies (>= 8.5)
        List<Movie> highlyRatedMovies = filterMoviesByMinRating(allMovies, 8.5);
        System.out.println("   Highly Rated Movies (>= 8.5) - " + highlyRatedMovies.size() + " found:");
        printMovies(highlyRatedMovies);

        // Filter movies in rating range
        List<Movie> goodMovies = filterMoviesByRatingRange(allMovies, 7.0, 8.5);
        System.out.println("   Good Movies (7.0 - 8.5) - " + goodMovies.size() + " found:");
        printMovies(goodMovies);
        System.out.println();
    }

    private static void demonstrateFilterByReleaseYear(List<Movie> allMovies) {
        System.out.println("3. Filter Movies by Release Year:");

        // Filter classic movies (before 2000)
        List<Movie> classicMovies = filterClassicMovies(allMovies);
        System.out.println("   Classic Movies (before 2000) - " + classicMovies.size() + " found:");
        printMovies(classicMovies);

        // Filter modern movies (2010 and after)
        List<Movie> modernMovies = filterMoviesByMinYear(allMovies, 2010);
        System.out.println("   Modern Movies (2010+) - " + modernMovies.size() + " found:");
        printMovies(modernMovies);
        System.out.println();
    }

    private static void demonstrateFilterByDuration(List<Movie> allMovies) {
        System.out.println("4. Filter Movies by Duration:");

        // Filter short movies (< 120 minutes)
        List<Movie> shortMovies = filterMoviesByMaxDuration(allMovies, 120);
        System.out.println("   Short Movies (< 120 min) - " + shortMovies.size() + " found:");
        printMovies(shortMovies);

        // Filter long movies (> 150 minutes)
        List<Movie> longMovies = filterLongMovies(allMovies);
        System.out.println("   Long Movies (> 150 min) - " + longMovies.size() + " found:");
        printMovies(longMovies);
        System.out.println();
    }

    private static void demonstrateComplexFiltering(List<Movie> allMovies) {
        System.out.println("5. Complex Filtering (Multiple Criteria):");

        // Filter: Action movies with rating >= 8.0 released after 2000
        List<Movie> filteredMovies = filterActionMoviesHighRatedModern(allMovies);
        System.out.println("   Action Movies (Rating >= 8.0, Released after 2000) - " +
                          filteredMovies.size() + " found:");
        printMovies(filteredMovies);

        // Filter: Available Drama movies under 3 hours
        List<Movie> availableDramas = filterAvailableDramasUnder3Hours(allMovies);
        System.out.println("   Available Drama Movies (< 180 min) - " +
                          availableDramas.size() + " found:");
        printMovies(availableDramas);
        System.out.println();
    }

    private static void demonstrateCustomFiltering(List<Movie> allMovies) {
        System.out.println("6. Custom Filtering Examples:");

        // Filter by director
        List<Movie> nolanMovies = filterMoviesByDirector(allMovies, "Christopher Nolan");
        System.out.println("   Christopher Nolan Movies - " + nolanMovies.size() + " found:");
        printMovies(nolanMovies);

        // Filter movies with specific title pattern
        List<Movie> theMovies = filterMoviesByTitlePrefix(allMovies, "The");
        System.out.println("   Movies starting with 'The' - " + theMovies.size() + " found:");
        printMovies(theMovies);
        System.out.println();
    }

    // ===== FILTERING METHODS =====

    /**
     * Filter movies by specific genre
     */
    public static List<Movie> filterMoviesByGenre(List<Movie> movies, MovieGenre genre) {
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.genre() == genre) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }

    /**
     * Filter movies with minimum rating
     */
    public static List<Movie> filterMoviesByMinRating(List<Movie> movies, double minRating) {
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.rating() >= minRating) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }

    /**
     * Filter movies within rating range
     */
    public static List<Movie> filterMoviesByRatingRange(List<Movie> movies, double minRating, double maxRating) {
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.rating() >= minRating && movie.rating() < maxRating) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }

    /**
     * Filter classic movies (released before 2000)
     */
    public static List<Movie> filterClassicMovies(List<Movie> movies) {
        List<Movie> classicMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.isClassic()) { // Using the method from Movie record
                classicMovies.add(movie);
            }
        }

        return classicMovies;
    }

    /**
     * Filter movies released after specified year
     */
    public static List<Movie> filterMoviesByMinYear(List<Movie> movies, int minYear) {
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.releaseYear() >= minYear) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }

    /**
     * Filter movies with maximum duration
     */
    public static List<Movie> filterMoviesByMaxDuration(List<Movie> movies, int maxDuration) {
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.duration() < maxDuration) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }

    /**
     * Filter long movies (using Movie record method)
     */
    public static List<Movie> filterLongMovies(List<Movie> movies) {
        List<Movie> longMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.isLongMovie()) { // Using the method from Movie record
                longMovies.add(movie);
            }
        }

        return longMovies;
    }

    /**
     * Complex filter: Action movies with high rating released after 2000
     */
    public static List<Movie> filterActionMoviesHighRatedModern(List<Movie> movies) {
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.genre() == MovieGenre.ACTION &&
                movie.rating() >= 8.0 &&
                movie.releaseYear() > 2000) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }

    /**
     * Filter available drama movies under 3 hours
     */
    public static List<Movie> filterAvailableDramasUnder3Hours(List<Movie> movies) {
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.genre() == MovieGenre.DRAMA &&
                movie.isAvailable() &&
                movie.duration() < 180) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }

    /**
     * Filter movies by director
     */
    public static List<Movie> filterMoviesByDirector(List<Movie> movies, String director) {
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.director() != null && movie.director().equals(director)) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }

    /**
     * Filter movies by title prefix
     */
    public static List<Movie> filterMoviesByTitlePrefix(List<Movie> movies, String prefix) {
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.title() != null && movie.title().startsWith(prefix)) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }

    // ===== HELPER METHODS =====

    /**
     * Helper method to print movies in a formatted way
     */
    private static void printMovies(List<Movie> movies) {
        if (movies.isEmpty()) {
            System.out.println("     No movies found.");
            return;
        }

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
