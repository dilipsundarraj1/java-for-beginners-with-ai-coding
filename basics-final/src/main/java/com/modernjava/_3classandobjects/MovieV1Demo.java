package com.modernjava._3classandobjects;

public class MovieV1Demo {
    public static void main(String[] args) {
        System.out.println("=== MovieV1 Demo - Encapsulation Examples ===\n");

        // 1. Creating objects using default constructor
        System.out.println("1. Default Constructor:");
        MovieV1 movie1 = new MovieV1();
        System.out.println("Default movie: " + movie1);
        System.out.println();

        // 2. Creating objects using parameterized constructor with valid values
        System.out.println("2. Parameterized Constructor with Valid Values:");
        MovieV1 movie2 = new MovieV1("The Matrix", 136, "Sci-Fi", 8.7, 13, MovieUtils.streamingPlatform_netflix);
        System.out.println("Valid movie: " + movie2);
        System.out.println();

        // 3. Creating objects with null and negative values (testing validation)
        System.out.println("3. Parameterized Constructor with Invalid Values:");
        MovieV1 movie3 = new MovieV1(null, -120, null, -5.5, -10, null);
        System.out.println("Movie with invalid values: " + movie3);
        System.out.println();

        // 4. Using setter methods to modify existing object
        System.out.println("4. Using Setter Methods:");
        MovieV1 movie4 = new MovieV1();
        movie4.setTitle("Inception");
        movie4.setDuration(148);
        movie4.setGenre("Thriller");
        movie4.setRating(8.8);
        movie4.setMinimumAge(13);
        movie4.setStreamingPlatform(MovieUtils.streamingPlatform_netflix);
        System.out.println("Movie created with setters: " + movie4);
        System.out.println();

        // 5. Testing setter validation with invalid values
        System.out.println("5. Testing Setter Validation:");
        MovieV1 movie5 = new MovieV1("Avatar", 162, "Action", 7.8, 13, MovieUtils.streamingPlatform_amazonprime);
        System.out.println("Before invalid updates: " + movie5);

        // Trying to set invalid values
        movie5.setTitle(null);
        movie5.setDuration(-50);
        movie5.setGenre(null);
        movie5.setRating(-3.0);
        movie5.setMinimumAge(-5);
        movie5.setStreamingPlatform(null);
        System.out.println("After invalid updates: " + movie5);
        System.out.println();

        // 6. Testing rating upper limit validation
        System.out.println("6. Testing Rating Upper Limit:");
        MovieV1 movie6 = new MovieV1("Best Movie Ever", 90, "Comedy", 15.0, 0, MovieUtils.streamingPlatform_netflix);
        System.out.println("Movie with rating > 10: " + movie6);
        System.out.println();

        // 7. Using getter methods to access individual fields
        System.out.println("7. Accessing Individual Fields with Getters:");
        MovieV1 movie7 = new MovieV1("Pulp Fiction", 154, "Crime", 8.9, 17, MovieUtils.streamingPlatform_amazonprime);
        System.out.println("Title: " + movie7.getTitle());
        System.out.println("Duration: " + movie7.getDuration() + " minutes");
        System.out.println("Genre: " + movie7.getGenre());
        System.out.println("Rating: " + movie7.getRating() + "/10.0");
        System.out.println("Minimum Age: " + movie7.getMinimumAge());
        System.out.println("Streaming Platform: " + movie7.getStreamingPlatform());
        System.out.println();

        // 8. Modifying specific fields while keeping others unchanged
        System.out.println("8. Selective Field Updates:");
        MovieV1 movie8 = new MovieV1("The Godfather", 175, "Crime", 9.2, 17, MovieUtils.streamingPlatform_netflix);
        System.out.println("Original: " + movie8);

        // Only update rating
        movie8.setRating(9.5);
        System.out.println("After rating update: " + movie8);

        // Only update duration
        movie8.setDuration(180);
        System.out.println("After duration update: " + movie8);

        // Only update minimum age
        movie8.setMinimumAge(16);
        System.out.println("After minimum age update: " + movie8);

        // Only update streaming platform
        movie8.setStreamingPlatform(MovieUtils.streamingPlatform_amazonprime);
        System.out.println("After streaming platform update: " + movie8);
        System.out.println();

        // 9. Demonstrating encapsulation benefits
        System.out.println("9. Encapsulation Benefits Demonstration:");
        MovieV1 movie9 = new MovieV1("Test Movie", 120, "Drama", 7.0, 13, MovieUtils.streamingPlatform_netflix);
        System.out.println("Original movie: " + movie9);

        // These would cause compilation errors (demonstrating encapsulation):
        // movie9.title = "Direct Access"; // Error: title has private access
        // movie9.rating = -1.0; // Error: rating has private access
        // movie9.minimumAge = -5; // Error: minimumAge has private access
        // movie9.streamingPlatform = "Direct Access"; // Error: streamingPlatform has private access

        // Must use setters (which provide validation):
        movie9.setTitle("Updated Movie");
        movie9.setRating(8.5);
        movie9.setMinimumAge(18);
        movie9.setStreamingPlatform(MovieUtils.streamingPlatform_amazonprime);
        System.out.println("Updated through setters: " + movie9);
        System.out.println();
    }
}
