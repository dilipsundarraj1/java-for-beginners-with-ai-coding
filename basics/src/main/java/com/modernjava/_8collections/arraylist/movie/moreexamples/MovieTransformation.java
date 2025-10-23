package com.modernjava._8collections.arraylist.movie.moreexamples;

import com.modernjava._8collections.arraylist.movie.MovieDatabase;
import com.modernjava.domain.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * MovieTransformation - Demonstrates transformation operations on ArrayList without lambdas/streams
 * Shows traditional loop-based approaches for transforming movie data into different formats
 */
public class MovieTransformation {

    public static void main(String[] args) {
        System.out.println("=== Movie Transformation Operations (Without Lambdas/Streams) ===\n");

        List<Movie> allMovies = MovieDatabase.createBasicDatabase();

        // Display original movies
        System.out.println("Original Movies:");
        printMovies(allMovies);
        System.out.println();

        // 1. Transform to movie titles
        demonstrateTransformToTitles(allMovies);

        // 2. Transform to movie summaries
        demonstrateTransformToSummaries(allMovies);

        // 3. Transform to rating categories
        demonstrateTransformToRatingCategories(allMovies);

        // 4. Transform to duration categories
        demonstrateTransformToDurationCategories(allMovies);

        // 5. Transform to movie info strings
        demonstrateTransformToInfoStrings(allMovies);

        // 6. Transform objects to other objects
        demonstrateTransformToMovieSummaryObjects(allMovies);

        // 7. Mathematical transformations
        demonstrateMathematicalTransformations(allMovies);
    }

    private static void demonstrateTransformToTitles(List<Movie> movies) {
        System.out.println("1. Transform Movies to Titles:");

        List<String> movieTitles = extractMovieTitles(movies);
        System.out.println("   All Movie Titles (" + movieTitles.size() + " titles):");
        for (String title : movieTitles) {
            System.out.println("     - " + title);
        }
        System.out.println();
    }

    private static void demonstrateTransformToSummaries(List<Movie> movies) {
        System.out.println("2. Transform Movies to Summaries:");

        List<String> movieSummaries = createMovieSummaries(movies);
        System.out.println("   Movie Summaries:");
        for (String summary : movieSummaries) {
            System.out.println("     - " + summary);
        }
        System.out.println();
    }

    private static void demonstrateTransformToRatingCategories(List<Movie> movies) {
        System.out.println("3. Transform Movies to Rating Categories:");

        List<String> ratingCategories = transformToRatingCategories(movies);
        System.out.println("   Rating Categories:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("     - " + movies.get(i).title() + " → " + ratingCategories.get(i));
        }
        System.out.println();
    }

    private static void demonstrateTransformToDurationCategories(List<Movie> movies) {
        System.out.println("4. Transform Movies to Duration Categories:");

        List<String> durationCategories = transformToDurationCategories(movies);
        System.out.println("   Duration Categories:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("     - " + movies.get(i).title() + " (" +
                             movies.get(i).getFormattedDuration() + ") → " + durationCategories.get(i));
        }
        System.out.println();
    }

    private static void demonstrateTransformToInfoStrings(List<Movie> movies) {
        System.out.println("5. Transform Movies to Formatted Info Strings:");

        List<String> movieInfos = transformToMovieInfoStrings(movies);
        System.out.println("   Formatted Movie Information:");
        for (String info : movieInfos) {
            System.out.println("     " + info);
        }
        System.out.println();
    }

    private static void demonstrateTransformToMovieSummaryObjects(List<Movie> movies) {
        System.out.println("6. Transform Movies to Summary Objects:");

        List<MovieSummary> summaries = transformToMovieSummaryObjects(movies);
        System.out.println("   Movie Summary Objects:");
        for (MovieSummary summary : summaries) {
            System.out.println("     " + summary);
        }
        System.out.println();
    }

    private static void demonstrateMathematicalTransformations(List<Movie> movies) {
        System.out.println("7. Mathematical Transformations:");

        // Transform ratings to percentages
        List<Double> ratingPercentages = transformRatingsToPercentages(movies);
        System.out.println("   Ratings as Percentages:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("     - " + movies.get(i).title() + ": " +
                             movies.get(i).rating() + "/10 → " + ratingPercentages.get(i) + "%");
        }

        // Transform duration to hours
        List<Double> durationInHours = transformDurationToHours(movies);
        System.out.println("   Duration in Hours:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("     - " + movies.get(i).title() + ": " +
                             movies.get(i).duration() + " min → " +
                             String.format("%.2f", durationInHours.get(i)) + " hours");
        }
        System.out.println();
    }

    // ===== TRANSFORMATION METHODS =====

    /**
     * Extract movie titles from list of movies
     */
    public static List<String> extractMovieTitles(List<Movie> movies) {
        List<String> titles = new ArrayList<>();

        for (Movie movie : movies) {
            titles.add(movie.title());
        }

        return titles;
    }

    /**
     * Create movie summaries with key information
     */
    public static List<String> createMovieSummaries(List<Movie> movies) {
        List<String> summaries = new ArrayList<>();

        for (Movie movie : movies) {
            String summary = movie.title() + " - " + movie.genre() +
                           " (" + movie.releaseYear() + ")";
            summaries.add(summary);
        }

        return summaries;
    }

    /**
     * Transform movies to rating categories
     */
    public static List<String> transformToRatingCategories(List<Movie> movies) {
        List<String> categories = new ArrayList<>();

        for (Movie movie : movies) {
            String category;
            double rating = movie.rating();

            if (rating >= 9.0) {
                category = "Masterpiece";
            } else if (rating >= 8.5) {
                category = "Excellent";
            } else if (rating >= 8.0) {
                category = "Great";
            } else if (rating >= 7.0) {
                category = "Good";
            } else if (rating >= 6.0) {
                category = "Average";
            } else {
                category = "Below Average";
            }

            categories.add(category);
        }

        return categories;
    }

    /**
     * Transform movies to duration categories
     */
    public static List<String> transformToDurationCategories(List<Movie> movies) {
        List<String> categories = new ArrayList<>();

        for (Movie movie : movies) {
            String category;
            int duration = movie.duration();

            if (duration < 90) {
                category = "Short Film";
            } else if (duration < 120) {
                category = "Standard Length";
            } else if (duration < 150) {
                category = "Long Film";
            } else if (duration < 180) {
                category = "Epic Length";
            } else {
                category = "Marathon Length";
            }

            categories.add(category);
        }

        return categories;
    }

    /**
     * Transform movies to formatted information strings
     */
    public static List<String> transformToMovieInfoStrings(List<Movie> movies) {
        List<String> infoStrings = new ArrayList<>();

        for (Movie movie : movies) {
            String info = String.format("🎬 %s (%d) - %s | %.1f⭐ | %s | Dir: %s",
                movie.title(),
                movie.releaseYear(),
                movie.genre(),
                movie.rating(),
                movie.getFormattedDuration(),
                movie.director()
            );
            infoStrings.add(info);
        }

        return infoStrings;
    }

    /**
     * Transform movies to MovieSummary objects
     */
    public static List<MovieSummary> transformToMovieSummaryObjects(List<Movie> movies) {
        List<MovieSummary> summaries = new ArrayList<>();

        for (Movie movie : movies) {
            MovieSummary summary = new MovieSummary(
                movie.title(),
                movie.genre().toString(),
                movie.releaseYear(),
                movie.rating() >= 8.0 ? "Recommended" : "Not Recommended"
            );
            summaries.add(summary);
        }

        return summaries;
    }

    /**
     * Transform ratings to percentages
     */
    public static List<Double> transformRatingsToPercentages(List<Movie> movies) {
        List<Double> percentages = new ArrayList<>();

        for (Movie movie : movies) {
            double percentage = movie.rating() * 10.0; // Convert 8.5/10 to 85%
            percentages.add(percentage);
        }

        return percentages;
    }

    /**
     * Transform duration from minutes to hours
     */
    public static List<Double> transformDurationToHours(List<Movie> movies) {
        List<Double> hours = new ArrayList<>();

        for (Movie movie : movies) {
            double durationInHours = movie.duration() / 60.0;
            hours.add(durationInHours);
        }

        return hours;
    }

    /**
     * Transform movies to uppercase titles
     */
    public static List<String> transformToUppercaseTitles(List<Movie> movies) {
        List<String> uppercaseTitles = new ArrayList<>();

        for (Movie movie : movies) {
            uppercaseTitles.add(movie.title().toUpperCase());
        }

        return uppercaseTitles;
    }

    /**
     * Transform movies to their release decades
     */
    public static List<String> transformToReleaseDecades(List<Movie> movies) {
        List<String> decades = new ArrayList<>();

        for (Movie movie : movies) {
            int decade = (movie.releaseYear() / 10) * 10; // e.g., 1994 → 1990
            String decadeString = decade + "s";
            decades.add(decadeString);
        }

        return decades;
    }

    /**
     * Transform movies to age ratings based on content and year
     */
    public static List<String> transformToAgeRatings(List<Movie> movies) {
        List<String> ageRatings = new ArrayList<>();

        for (Movie movie : movies) {
            String rating;

            // Simple logic based on genre (in real world, this would be more complex)
            switch (movie.genre()) {
                case HORROR -> rating = "R (18+)";
                case ACTION -> rating = movie.rating() > 8.5 ? "PG-13 (13+)" : "R (18+)";
                case ANIMATION -> rating = "G (All Ages)";
                case DRAMA, SCI_FI -> rating = "PG-13 (13+)";
                default -> rating = "PG (Parental Guidance)";
            }

            ageRatings.add(rating);
        }

        return ageRatings;
    }

    // ===== HELPER CLASSES =====

    /**
     * Simple MovieSummary class for transformation demonstrations
     */
    public static class MovieSummary {
        private String title;
        private String genre;
        private int year;
        private String recommendation;

        public MovieSummary(String title, String genre, int year, String recommendation) {
            this.title = title;
            this.genre = genre;
            this.year = year;
            this.recommendation = recommendation;
        }

        @Override
        public String toString() {
            return title + " (" + year + ") - " + genre + " - " + recommendation;
        }
    }

    // ===== HELPER METHODS =====

    /**
     * Helper method to print movies in a formatted way
     */
    private static void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println("     - " + movie.title() +
                             " (" + movie.releaseYear() + ") " +
                             movie.genre() + " - " + movie.rating() + "/10");
        }
    }

}
