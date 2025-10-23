package com.modernjava._8collections.arraylist.movie.moreexamples;

import com.modernjava._8collections.arraylist.movie.MovieDatabase;
import com.modernjava.domain.Movie;
import com.modernjava.domain.MovieGenre;

import java.util.ArrayList;
import java.util.List;

/**
 * MovieCollectionsDemo - Comprehensive demonstration of ArrayList operations using Movie domain
 * Combines filtering, transformation, and matching operations without lambdas/streams
 */
public class MovieCollectionsDemo {

    public static void main(String[] args) {
        System.out.println("=== COMPREHENSIVE MOVIE COLLECTIONS DEMO ===");
        System.out.println("Demonstrating ArrayList operations without lambdas/streams\n");

        // Create movie database
        List<Movie> movieDatabase = MovieDatabase.createSampleDatabase();

        System.out.println("Movie Database Created (" + movieDatabase.size() + " movies)");
        System.out.println("===============================================");

        // 1. Basic ArrayList Operations
        demonstrateBasicOperations();

        // 2. Real-world scenario: Movie Recommendation System
        demonstrateMovieRecommendationSystem(movieDatabase);

        // 3. Real-world scenario: Movie Analytics
        demonstrateMovieAnalytics(movieDatabase);

        // 4. Real-world scenario: Movie Catalog Management
        demonstrateMovieCatalogManagement(movieDatabase);

        // 5. Performance considerations
        demonstratePerformanceConsiderations();

        System.out.println("\n=== DEMO COMPLETED ===");
        System.out.println("Check individual classes for detailed examples:");
        System.out.println("- ArrayListBasics.java for fundamental operations");
        System.out.println("- MovieFiltering.java for filtering examples");
        System.out.println("- MovieTransformation.java for transformation examples");
        System.out.println("- MovieMatching.java for matching/search examples");
    }

    private static void demonstrateBasicOperations() {
        System.out.println("\n1. BASIC ARRAYLIST OPERATIONS");
        System.out.println("==============================");

        List<Movie> myWatchlist = new ArrayList<>();

        // Adding movies
        myWatchlist.add(new Movie("The Matrix", 136, MovieGenre.SCI_FI, 8.7, 1999, "Wachowski Sisters"));
        myWatchlist.add(new Movie("Inception", 148, MovieGenre.SCI_FI, 8.8, 2010, "Christopher Nolan"));
        System.out.println("✓ Added 2 movies to watchlist");

        // Accessing
        Movie firstMovie = myWatchlist.get(0);
        System.out.println("✓ First movie: " + firstMovie.title());

        // Size and properties
        System.out.println("✓ Watchlist size: " + myWatchlist.size());
        System.out.println("✓ Is empty: " + myWatchlist.isEmpty());

        // Iteration
        System.out.println("✓ All movies in watchlist:");
        for (Movie movie : myWatchlist) {
            System.out.println("   - " + movie.title() + " (" + movie.releaseYear() + ")");
        }

        var movies = List.of(new Movie("The Matrix", 136, MovieGenre.SCI_FI, 8.7, 1999, "Wachowski Sisters"),
                new Movie("The Matrix1", 136, MovieGenre.SCI_FI, 8.7, 1999, "Wachowski Sisters"));
    }

    private static void demonstrateMovieRecommendationSystem(List<Movie> movieDatabase) {
        System.out.println("\n2. MOVIE RECOMMENDATION SYSTEM");
        System.out.println("===============================");

        // User preferences
        MovieGenre preferredGenre = MovieGenre.SCI_FI;
        double minRating = 8.0;
        int maxDuration = 160; // User prefers movies under 2.5 hours

        System.out.println("User preferences: " + preferredGenre + ", Rating >= " + minRating +
                          ", Duration <= " + maxDuration + " minutes");

        // Find recommendations
        List<Movie> recommendations = findMovieRecommendations(movieDatabase, preferredGenre, minRating, maxDuration);

        System.out.println("\nRecommended movies (" + recommendations.size() + " found):");
        if (recommendations.isEmpty()) {
            System.out.println("   No movies match your criteria. Consider adjusting preferences.");
        } else {
            for (Movie movie : recommendations) {
                System.out.println("   ⭐ " + movie.title() + " (" + movie.releaseYear() + ") - " +
                                 movie.rating() + "/10 - " + movie.getFormattedDuration());
            }
        }

        // Alternative recommendations if no exact matches
        if (recommendations.isEmpty()) {
            System.out.println("\nAlternative recommendations (relaxed criteria):");
            List<Movie> alternatives = findAlternativeRecommendations(movieDatabase, preferredGenre, 7.5);
            for (Movie movie : alternatives) {
                System.out.println("   • " + movie.title() + " - " + movie.rating() + "/10");
            }
        }
    }

    private static void demonstrateMovieAnalytics(List<Movie> movieDatabase) {
        System.out.println("\n3. MOVIE ANALYTICS DASHBOARD");
        System.out.println("=============================");

        // Calculate statistics
        double averageRating = calculateAverageRating(movieDatabase);
        int totalDuration = calculateTotalDuration(movieDatabase);
        Movie highestRated = findHighestRatedMovie(movieDatabase);
        Movie longestMovie = findLongestMovie(movieDatabase);

        System.out.println("📊 Database Statistics:");
        System.out.println("   Total movies: " + movieDatabase.size());
        System.out.println("   Average rating: " + String.format("%.2f", averageRating) + "/10");
        System.out.println("   Total runtime: " + formatDuration(totalDuration));
        System.out.println("   Highest rated: " + highestRated.title() + " (" + highestRated.rating() + "/10)");
        System.out.println("   Longest movie: " + longestMovie.title() + " (" + longestMovie.getFormattedDuration() + ")");

        // Genre breakdown
        System.out.println("\n📈 Genre Distribution:");
        analyzeGenreDistribution(movieDatabase);

        // Decade analysis
        System.out.println("\n📅 Decade Analysis:");
        analyzeDecadeDistribution(movieDatabase);

        // Quality analysis
        System.out.println("\n🏆 Quality Analysis:");
        analyzeMovieQuality(movieDatabase);
    }

    private static void demonstrateMovieCatalogManagement(List<Movie> movieDatabase) {
        System.out.println("\n4. MOVIE CATALOG MANAGEMENT");
        System.out.println("============================");

        // Create different collections for different purposes
        List<Movie> availableMovies = filterAvailableMovies(movieDatabase);
        List<Movie> classicMovies = filterClassicMovies(movieDatabase);
        List<Movie> recentMovies = filterRecentMovies(movieDatabase, 2010);

        System.out.println("📚 Catalog Organization:");
        System.out.println("   Available movies: " + availableMovies.size());
        System.out.println("   Classic movies (pre-2000): " + classicMovies.size());
        System.out.println("   Recent movies (2010+): " + recentMovies.size());

        // Featured collections
        List<Movie> criticsChoice = filterCriticsChoice(movieDatabase, 9.0);
        List<Movie> familyFriendly = filterFamilyFriendly(movieDatabase);
        List<Movie> marathonMovies = filterMarathonMovies(movieDatabase, 180);

        System.out.println("\n🎯 Featured Collections:");
        System.out.println("   Critics' Choice (9.0+): " + criticsChoice.size() + " movies");
        printMovieTitles(criticsChoice);

        System.out.println("   Family Friendly: " + familyFriendly.size() + " movies");
        printMovieTitles(familyFriendly);

        System.out.println("   Marathon Movies (3+ hours): " + marathonMovies.size() + " movies");
        printMovieTitles(marathonMovies);
    }

    private static void demonstratePerformanceConsiderations() {
        System.out.println("\n5. PERFORMANCE CONSIDERATIONS");
        System.out.println("==============================");

        System.out.println("⚡ ArrayList Performance Tips:");
        System.out.println("   ✓ Use ArrayList<> constructor with initial capacity for large collections");
        System.out.println("   ✓ Use enhanced for-loop for iteration when index not needed");
        System.out.println("   ✓ Use traditional for-loop when you need index access");
        System.out.println("   ✓ Avoid frequent insertions/deletions in middle of large lists");
        System.out.println("   ✓ Consider using List<> interface instead of ArrayList<> for flexibility");

        // Demonstrate different iteration approaches
        List<Movie> testMovies = createTestMovieList(1000);

        System.out.println("\n🔍 Iteration Performance Demo (1000 movies):");

        // Enhanced for-loop
        long startTime = System.nanoTime();
        int count1 = 0;
        for (Movie movie : testMovies) {
            if (movie.rating() > 8.0) count1++;
        }
        long enhancedForTime = System.nanoTime() - startTime;

        // Traditional for-loop
        startTime = System.nanoTime();
        int count2 = 0;
        for (int i = 0; i < testMovies.size(); i++) {
            if (testMovies.get(i).rating() > 8.0) count2++;
        }
        long traditionalForTime = System.nanoTime() - startTime;

        System.out.println("   Enhanced for-loop: " + (enhancedForTime / 1000) + " microseconds");
        System.out.println("   Traditional for-loop: " + (traditionalForTime / 1000) + " microseconds");
        System.out.println("   Both found: " + count1 + " highly-rated movies");
    }

    // ===== HELPER METHODS FOR RECOMMENDATION SYSTEM =====

    private static List<Movie> findMovieRecommendations(List<Movie> movies, MovieGenre genre,
                                                       double minRating, int maxDuration) {
        List<Movie> recommendations = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.genre() == genre &&
                movie.rating() >= minRating &&
                movie.duration() <= maxDuration &&
                movie.isAvailable()) {
                recommendations.add(movie);
            }
        }
        return recommendations;
    }

    private static List<Movie> findAlternativeRecommendations(List<Movie> movies, MovieGenre genre, double minRating) {
        List<Movie> alternatives = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.genre() == genre && movie.rating() >= minRating && movie.isAvailable()) {
                alternatives.add(movie);
            }
        }
        return alternatives.size() > 3 ? alternatives.subList(0, 3) : alternatives;
    }

    // ===== ANALYTICS METHODS =====

    private static double calculateAverageRating(List<Movie> movies) {
        double sum = 0;
        for (Movie movie : movies) {
            sum += movie.rating();
        }
        return movies.isEmpty() ? 0 : sum / movies.size();
    }

    private static int calculateTotalDuration(List<Movie> movies) {
        int total = 0;
        for (Movie movie : movies) {
            total += movie.duration();
        }
        return total;
    }

    private static Movie findHighestRatedMovie(List<Movie> movies) {
        if (movies.isEmpty()) return null;
        Movie highest = movies.get(0);
        for (Movie movie : movies) {
            if (movie.rating() > highest.rating()) {
                highest = movie;
            }
        }
        return highest;
    }

    private static Movie findLongestMovie(List<Movie> movies) {
        if (movies.isEmpty()) return null;
        Movie longest = movies.get(0);
        for (Movie movie : movies) {
            if (movie.duration() > longest.duration()) {
                longest = movie;
            }
        }
        return longest;
    }

    private static void analyzeGenreDistribution(List<Movie> movies) {
        // Count movies by genre
        for (MovieGenre genre : MovieGenre.values()) {
            int count = 0;
            for (Movie movie : movies) {
                if (movie.genre() == genre) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("   " + genre.getDisplayName() + ": " + count + " movies");
            }
        }
    }

    private static void analyzeDecadeDistribution(List<Movie> movies) {
        // Count by decades
        int[] decades = {1970, 1980, 1990, 2000, 2010, 2020};
        for (int decade : decades) {
            int count = 0;
            for (Movie movie : movies) {
                int movieDecade = (movie.releaseYear() / 10) * 10;
                if (movieDecade == decade) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("   " + decade + "s: " + count + " movies");
            }
        }
    }

    private static void analyzeMovieQuality(List<Movie> movies) {
        int masterpieces = 0, excellent = 0, good = 0, average = 0;

        for (Movie movie : movies) {
            double rating = movie.rating();
            if (rating >= 9.0) masterpieces++;
            else if (rating >= 8.5) excellent++;
            else if (rating >= 7.5) good++;
            else average++;
        }

        System.out.println("   Masterpieces (9.0+): " + masterpieces);
        System.out.println("   Excellent (8.5-8.9): " + excellent);
        System.out.println("   Good (7.5-8.4): " + good);
        System.out.println("   Average (<7.5): " + average);
    }

    // ===== CATALOG MANAGEMENT METHODS =====

    private static List<Movie> filterAvailableMovies(List<Movie> movies) {
        List<Movie> available = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.isAvailable()) {
                available.add(movie);
            }
        }
        return available;
    }

    private static List<Movie> filterClassicMovies(List<Movie> movies) {
        List<Movie> classics = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.releaseYear() < 2000) {
                classics.add(movie);
            }
        }
        return classics;
    }

    private static List<Movie> filterRecentMovies(List<Movie> movies, int fromYear) {
        List<Movie> recent = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.releaseYear() >= fromYear) {
                recent.add(movie);
            }
        }
        return recent;
    }

    private static List<Movie> filterCriticsChoice(List<Movie> movies, double minRating) {
        List<Movie> criticsChoice = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.rating() >= minRating) {
                criticsChoice.add(movie);
            }
        }
        return criticsChoice;
    }

    private static List<Movie> filterFamilyFriendly(List<Movie> movies) {
        List<Movie> familyFriendly = new ArrayList<>();
        for (Movie movie : movies) {
            // Simple logic: avoid horror, include animation and some dramas
            if (movie.genre() == MovieGenre.ANIMATION ||
                (movie.genre() == MovieGenre.COMEDY) ||
                (movie.genre() == MovieGenre.DRAMA && movie.rating() >= 8.0)) {
                familyFriendly.add(movie);
            }
        }
        return familyFriendly;
    }

    private static List<Movie> filterMarathonMovies(List<Movie> movies, int minDuration) {
        List<Movie> marathonMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.duration() >= minDuration) {
                marathonMovies.add(movie);
            }
        }
        return marathonMovies;
    }

    // ===== UTILITY METHODS =====

    private static void printMovieTitles(List<Movie> movies) {
        if (movies.isEmpty()) {
            System.out.println("     No movies in this collection");
            return;
        }
        for (Movie movie : movies) {
            System.out.println("     • " + movie.title() + " (" + movie.releaseYear() + ")");
        }
    }

    private static String formatDuration(int minutes) {
        int hours = minutes / 60;
        int mins = minutes % 60;
        return hours + "h " + mins + "m";
    }

    private static List<Movie> createTestMovieList(int size) {
        return MovieDatabase.createTestDatabase(size);
    }

}
