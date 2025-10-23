package com.modernjava.domain;

/**
 * Movie Record - A modern record-based implementation for Collections demonstrations
 * Records provide immutability, automatic getters, equals(), hashCode(), and toString()
 * Validation is performed in the compact constructor
 *
 * Converted from traditional Movie class to demonstrate benefits of records:
 * - Immutable by default (thread-safe)
 * - Automatic method generation (equals, hashCode, toString, accessors)
 * - Significant reduction in boilerplate code
 * - Enhanced readability and maintainability
 */
public record Movie(
    String title,           // movie title
    int duration,          // duration in minutes
    MovieGenre genre,      // movie genre using enum
    double rating,         // rating out of 10.0
    int releaseYear,       // year the movie was released
    String director,       // movie director
    boolean isAvailable    // availability status
) {

    // Compact constructor with validation
    public Movie {
        // Validate and set defaults for null/invalid values
        title = (title == null || title.trim().isEmpty()) ? "Unknown" : title.trim();
        duration = Math.max(0, duration); // Ensure non-negative duration
        genre = (genre == null) ? MovieGenre.DRAMA : genre; // Default to DRAMA if null
        rating = Math.max(0.0, Math.min(10.0, rating)); // Clamp rating between 0.0 and 10.0
        releaseYear = (releaseYear < 1888) ? 1888 : releaseYear; // First movie was made in 1888
        director = (director == null || director.trim().isEmpty()) ? "Unknown" : director.trim();
        // isAvailable defaults to the provided value (no validation needed for boolean)
    }

    // Alternative constructor without isAvailable (defaults to true)
    public Movie(String title, int duration, MovieGenre genre, double rating, int releaseYear, String director) {
        this(title, duration, genre, rating, releaseYear, director, true);
    }

    // Helper method for formatted duration - migrated from original class
    public String getFormattedDuration() {
        int hours = duration / 60;
        int minutes = duration % 60;
        if (hours > 0) {
            return hours + "h " + minutes + "m";
        } else {
            return minutes + "m";
        }
    }

    // Check if movie is a classic (released before 2000) - migrated from original class
    public boolean isClassic() {
        return releaseYear < 2000;
    }

    // Check if movie is highly rated - migrated from original class
    public boolean isHighlyRated() {
        return rating >= 8.0;
    }

    // Check if movie is long (duration > 150 minutes) - migrated from original class
    public boolean isLongMovie() {
        return duration > 150;
    }

    // Immutability helper methods - "with" methods to create new instances with modified values

    /**
     * Create a new Movie with updated rating
     */
    public Movie withRating(double newRating) {
        return new Movie(title, duration, genre, newRating, releaseYear, director, isAvailable);
    }

    /**
     * Create a new Movie with updated availability status
     */
    public Movie withAvailability(boolean available) {
        return new Movie(title, duration, genre, rating, releaseYear, director, available);
    }

    /**
     * Create a new Movie with updated director
     */
    public Movie withDirector(String newDirector) {
        return new Movie(title, duration, genre, rating, releaseYear, newDirector, isAvailable);
    }

    /**
     * Create a new Movie with updated genre
     */
    public Movie withGenre(MovieGenre newGenre) {
        return new Movie(title, duration, genre, rating, releaseYear, director, isAvailable);
    }

    // Override toString to match original format
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + getFormattedDuration() +
                ", genre=" + genre +
                ", rating=" + rating +
                ", releaseYear=" + releaseYear +
                ", director='" + director + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    // Note: The following methods are automatically provided by records:
    // - Accessor methods: title(), duration(), genre(), rating(), releaseYear(), director(), isAvailable()
    // - equals() method based on all components
    // - hashCode() method based on all components
    // - Default toString() method (overridden above to match original format)
}
