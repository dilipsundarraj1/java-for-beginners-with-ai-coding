package com.modernjava._3classandobjects;

/**
 * MovieV3 - A record-based implementation of Movie class
 * Records provide immutability, automatic getters, equals(), hashCode(), and toString()
 * Validation is performed in the compact constructor
 */
public record MovieRecord(
    String title,
    int duration, // in minutes
    MovieGenreEnum genre,
    double rating, // out of 10.0
    int minimumAge, // minimum age requirement for the movie
    String streamingPlatform // streaming platform where movie is available
) {

    // Compact constructor with validation
    public MovieRecord {
        System.out.println("Parameterized constructor called");
        // Validate and set defaults for null/invalid values
        title = (title == null) ? "Unknown" : title;
        duration = Math.max(0, duration); // Ensure non-negative duration
        genre = (genre == null) ? MovieGenreEnum.DRAMA : genre;
        rating = Math.max(0.0, Math.min(10.0, rating)); // Clamp rating between 0.0 and 10.0
        minimumAge = Math.max(0, minimumAge); // Ensure non-negative age
        streamingPlatform = (streamingPlatform == null) ? "Unknown" : streamingPlatform;
    }

    // Format duration as hours and minutes
    public String formattedDuration() {
        int hours = duration / 60;
        int minutes = duration % 60;
        return formattedDuration(hours, minutes);
    }

    // Overloaded method that accepts hours and minutes as parameters
    public String formattedDuration(int hours, int minutes) {
        String result = "";
        if (hours > 0) {
            result = hours + "h ";
        }
        result = result + minutes + "m";
        return result;
    }

    // Override toString to match MovieV2 format
//    @Override
//    public String toString() {
//        return "Movie: " + title + ", Duration: " + duration + " minutes, Genre: " + genre
//                + ", Rating: " + rating + "/10.0, Minimum Age: " + minimumAge + ", Streaming Platform: " + streamingPlatform;
//    }

    // Method to create a new MovieV3 with updated rating (since records are immutable)
    public MovieRecord withRating(double newRating) {
        return new MovieRecord(title, duration, genre, newRating, minimumAge, streamingPlatform);
    }

    // Method to create a new MovieV3 with updated streaming platform
    public MovieRecord withStreamingPlatform(String newPlatform) {
        return new MovieRecord(title, duration, genre, rating, minimumAge, newPlatform);
    }
}
