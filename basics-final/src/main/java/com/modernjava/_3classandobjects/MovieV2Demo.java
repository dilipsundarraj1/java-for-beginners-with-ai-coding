package com.modernjava._3classandobjects;

public class MovieV2Demo {

    public static void main(String[] args) {
        System.out.println("=== MovieV2 Demo with Different Genres (Using Encapsulation) ===\n");

        // Creating movies with different genres using the enum

        // 1. ACTION movie
        MovieV2 actionMovie = new MovieV2("John Wick", 101, MovieGenreEnum.ACTION, 7.4, 18, "Netflix");
        System.out.println("1. Action Movie:");
        actionMovie.printMovie();
        System.out.println();

        // 2. COMEDY movie
        MovieV2 comedyMovie = new MovieV2("The Hangover", 100, MovieGenreEnum.COMEDY, 7.7, 17, "Amazon Prime");
        System.out.println("2. Comedy Movie:");
        comedyMovie.printMovie();
        System.out.println();

        // 3. DRAMA movie
        MovieV2 dramaMovie = new MovieV2("The Shawshank Redemption", 142, MovieGenreEnum.DRAMA, 9.3, 15, "HBO Max");
        System.out.println("3. Drama Movie:");
        dramaMovie.printMovie();
        System.out.println();

        // 4. HORROR movie
        MovieV2 horrorMovie = new MovieV2("The Conjuring", 112, MovieGenreEnum.HORROR, 7.5, 16, "Disney+");
        System.out.println("4. Horror Movie:");
        horrorMovie.printMovie();
        System.out.println();

        // 5. ROMANCE movie
        MovieV2 romanceMovie = new MovieV2("The Notebook", 123, MovieGenreEnum.ROMANCE, 7.8, 13, "Hulu");
        System.out.println("5. Romance Movie:");
        romanceMovie.printMovie();
        System.out.println();

        // 6. Using default constructor (will use DRAMA as default genre)
        MovieV2 defaultMovie = new MovieV2();
        // Using setter methods to modify the object (demonstrating encapsulation)
        defaultMovie.setTitle("Unknown Movie");
        defaultMovie.setDuration(90);
        defaultMovie.setRating(5.0);
        System.out.println("6. Movie with Default Constructor (Using Setters):");
        defaultMovie.printMovie();
        System.out.println();

        // 7. Demonstrating getter methods and enum comparison
        System.out.println("=== Demonstrating Getter Methods and Enum Comparison ===");
        System.out.println("Action movie title: " + actionMovie.getTitle());
        System.out.println("Action movie genre: " + actionMovie.getGenre());
        System.out.println("Comedy movie genre: " + comedyMovie.getGenre());
        System.out.println("Are both movies the same genre? " + (actionMovie.getGenre() == comedyMovie.getGenre()));
        System.out.println("Is action movie actually ACTION? " + (actionMovie.getGenre() == MovieGenreEnum.ACTION));
        System.out.println();

        // 8. Demonstrating setter methods with validation
        System.out.println("=== Demonstrating Setter Methods with Validation ===");
        MovieV2 testMovie = new MovieV2();
        System.out.println("Before setting values:");
        testMovie.printMovie();

        // Test setting valid values
        testMovie.setTitle("Test Movie");
        testMovie.setDuration(120);
        testMovie.setGenre(MovieGenreEnum.ACTION);
        testMovie.setRating(8.5);
        testMovie.setMinimumAge(16);
        testMovie.setStreamingPlatform("Netflix");

        System.out.println("After setting valid values:");
        testMovie.printMovie();

        // Test setting invalid values to see validation in action
        testMovie.setTitle(null); // Should default to "Unknown"
        testMovie.setDuration(-50); // Should default to 0
        testMovie.setGenre(null); // Should default to DRAMA
        testMovie.setRating(-2.5); // Should default to 0.0
        testMovie.setMinimumAge(-10); // Should default to 0
        testMovie.setStreamingPlatform(null); // Should default to "Unknown"

        System.out.println("After setting invalid values (validation applied):");
        testMovie.printMovie();
        System.out.println();

        // 9. Showcasing all available genres
        System.out.println("=== All Available Movie Genres ===");
        MovieGenreEnum[] allGenres = MovieGenreEnum.values();
        for (MovieGenreEnum genre : allGenres) {
            System.out.println("- " + genre);
        }
        System.out.println();

        // 10. Creating movies with null values to show validation in constructor
        System.out.println("=== Testing Constructor Validation ===");
        MovieV2 validatedMovie = new MovieV2(null, -50, null, -2.5, -10, null);
        System.out.println("Movie created with null/negative values in constructor:");
        validatedMovie.printMovie();
        System.out.println("Notice how null/negative values are handled with defaults!");
        System.out.println();

        // 11. Using toString method
        System.out.println("=== Using toString Method ===");
        System.out.println(actionMovie.toString());
        System.out.println(comedyMovie.toString());
        System.out.println();

        // 12. Testing equals method
        System.out.println("=== Testing Equals Method ===");
        MovieV2 anotherActionMovie = new MovieV2("John Wick", 101, MovieGenreEnum.ACTION, 7.4, 18, "Netflix");
        System.out.println("Are actionMovie and anotherActionMovie equal? " + actionMovie.equals(anotherActionMovie));
        System.out.println("Are actionMovie and comedyMovie equal? " + actionMovie.equals(comedyMovie));
        System.out.println();

        // 13. Formatted duration examples
        System.out.println("=== Formatted Duration Examples ===");
        System.out.println("Action movie duration: " + actionMovie.formattedDuration());
        System.out.println("Drama movie duration: " + dramaMovie.formattedDuration());
        System.out.println("Custom duration format (3h 45m): " + actionMovie.formattedDuration(3, 45));
        System.out.println();

        // 14. Demonstrating encapsulation benefits
        System.out.println("=== Encapsulation Benefits Demo ===");
        MovieV2 encapsulationDemo = new MovieV2("Encapsulation Demo", 90, MovieGenreEnum.COMEDY, 7.0, 12, "Netflix");

        // Accessing private fields through getter methods
        System.out.println("Title (via getter): " + encapsulationDemo.getTitle());
        System.out.println("Duration (via getter): " + encapsulationDemo.getDuration() + " minutes");
        System.out.println("Genre (via getter): " + encapsulationDemo.getGenre());
        System.out.println("Rating (via getter): " + encapsulationDemo.getRating());
        System.out.println("Minimum Age (via getter): " + encapsulationDemo.getMinimumAge());
        System.out.println("Streaming Platform (via getter): " + encapsulationDemo.getStreamingPlatform());

        // Modifying fields through setter methods with automatic validation
        System.out.println("\nTesting rating validation with setter:");
        System.out.println("Setting rating to 15.0 (should be capped at 10.0):");
        encapsulationDemo.setRating(15.0);
        System.out.println("Actual rating after validation: " + encapsulationDemo.getRating());
    }
}
