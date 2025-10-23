package com.modernjava._3classandobjects;

/**
 * Demo class to showcase MovieV3 record functionality
 */
public class MovieRecordDemo {

    public static void main(String[] args) {
        System.out.println("=== MovieV3 Record Demo ===\n");

        // 1. Create with full constructor and validation
        System.out.println("1. Creating movie with valid values:");
        MovieRecord inception = new MovieRecord(
            "Inception",
            148,
            MovieGenreEnum.ACTION,
            8.8,
            13,
            "Netflix"
        );
        System.out.println(inception);
        System.out.println("Formatted duration: " + inception.formattedDuration());
        System.out.println();

        // 2. Create with validation (invalid values)
        System.out.println("2. Creating movie with invalid values (shows validation):");
        MovieRecord invalidMovie = new MovieRecord(
            null,           // null title -> "Unknown"
            -50,            // negative duration -> 0
            null,           // null genre -> DRAMA
            15.0,           // rating > 10 -> 10.0
            -5,             // negative age -> 0
            null            // null platform -> "Unknown"
        );
        System.out.println(invalidMovie);
        System.out.println();

        // 3. Demonstrate immutability with 'with' methods
        System.out.println("3. Demonstrating immutability with 'with' methods:");
        MovieRecord updatedMovie = inception.withRating(9.0);
        System.out.println("Original movie: " + inception.rating());
        System.out.println("Updated movie (new instance): " + updatedMovie.rating());
        System.out.println();

        // 4. Update streaming platform
        MovieRecord newPlatformMovie = inception.withStreamingPlatform("Amazon Prime");
        System.out.println("4. Movie with new platform:");
        System.out.println("Original: " + inception.streamingPlatform());
        System.out.println("Updated: " + newPlatformMovie.streamingPlatform());
        System.out.println();

        // 5. Demonstrate automatic equals() and hashCode()
        System.out.println("5. Testing equality:");
        MovieRecord movie1 = new MovieRecord("Titanic", 195, MovieGenreEnum.ROMANCE, 7.8, 13, "Disney+");
        MovieRecord movie2 = new MovieRecord("Titanic", 195, MovieGenreEnum.ROMANCE, 7.8, 13, "Disney+");
        MovieRecord movie3 = new MovieRecord("Avatar", 162, MovieGenreEnum.ACTION, 7.8, 13, "Disney+");

        System.out.println("movie1.equals(movie2): " + movie1.equals(movie2)); // true
        System.out.println("movie1.equals(movie3): " + movie1.equals(movie3)); // false
        System.out.println("movie1.hashCode() == movie2.hashCode(): " + (movie1.hashCode() == movie2.hashCode())); // true
        System.out.println();

        // 6. Accessing record components directly
        System.out.println("6. Accessing record components:");
        System.out.println("Title: " + movie1.title());
        System.out.println("Duration: " + movie1.duration());
        System.out.println("Genre: " + movie1.genre());
        System.out.println("Rating: " + movie1.rating());
        System.out.println("Minimum Age: " + movie1.minimumAge());
        System.out.println("Streaming Platform: " + movie1.streamingPlatform());
        System.out.println();

        // 7. Formatted duration examples
        System.out.println("7. Formatted duration:");
        System.out.println("Inception duration: " + inception.formattedDuration());
        System.out.println("Custom format (2h 30m): " + inception.formattedDuration(2, 30));
        System.out.println();

        // 8. Edge case validation
        System.out.println("8. Edge case validation:");
        MovieRecord edgeCase = new MovieRecord("Test Movie", 90, MovieGenreEnum.COMEDY, 11.5, -10, "");
        System.out.println("Rating clamped from 11.5 to: " + edgeCase.rating());
        System.out.println("Age corrected from -10 to: " + edgeCase.minimumAge());
        System.out.println("Empty platform treated as: " + edgeCase.streamingPlatform());
    }
}
