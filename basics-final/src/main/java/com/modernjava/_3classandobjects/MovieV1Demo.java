package com.modernjava._3classandobjects;

public class MovieV1Demo {
    static void main(String[] args) {
        // Create a MovieV1 object with parameterized constructor
        MovieV1 movie = new MovieV1("Inception",
                148, "Sci-Fi", 8.8, 13);

        movie.setDuration(-148); // Testing validation in setter

        // Print initial values
        System.out.println("=== Initial Movie Details ===");
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Duration: " + movie.getDuration() + " minutes");
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Rating: " + movie.getRating() + "/10.0");
        System.out.println("Minimum Age: " + movie.getMinimumAge());
        movie.printMovie();

        System.out.println("\n=== Modifying Movie Properties ===");
        // Set different values using setters
        movie.setTitle("The Dark Knight");
        movie.setDuration(152);
        movie.setGenre("Action");
        movie.setRating(9.0);
        movie.setMinimumAge(18);

        // Print updated values
        System.out.println("Updated Title: " + movie.getTitle());
        System.out.println("Updated Duration: " + movie.getDuration() + " minutes");
        System.out.println("Updated Genre: " + movie.getGenre());
        System.out.println("Updated Rating: " + movie.getRating() + "/10.0");
        System.out.println("Updated Minimum Age: " + movie.getMinimumAge());
        movie.printMovie();

        // Display formatted duration
        System.out.println("\nFormatted Duration: " + movie.formattedDuration());

        var rating = MovieUtils.minimumAgeToRating(movie.getMinimumAge());
        System.out.println("Film Rating: " + rating);

        // Create different objects to capture all ratings
        System.out.println("\n=== Demonstrating All Movie Ratings ===");

        // G Rating - minimumAge < 6
        MovieV1 gRatedMovie = new MovieV1("Toy Story", 81, "Animation", 8.3, 0);
        String gRating = MovieUtils.minimumAgeToRating(gRatedMovie.getMinimumAge());
        System.out.println("Movie: " + gRatedMovie.getTitle() + " | Minimum Age: " + gRatedMovie.getMinimumAge() + " | Rating: " + gRating);

        // PG Rating - minimumAge >= 6 && < 13
        MovieV1 pgRatedMovie = new MovieV1("Finding Nemo", 100, "Animation", 8.1, 6);
        String pgRating = MovieUtils.minimumAgeToRating(pgRatedMovie.getMinimumAge());
        System.out.println("Movie: " + pgRatedMovie.getTitle() + " | Minimum Age: " + pgRatedMovie.getMinimumAge() + " | Rating: " + pgRating);

        // PG-13 Rating - minimumAge >= 13 && < 17
        MovieV1 pg13RatedMovie = new MovieV1("The Avengers", 143, "Action", 8.0, 13);
        String pg13Rating = MovieUtils.minimumAgeToRating(pg13RatedMovie.getMinimumAge());
        System.out.println("Movie: " + pg13RatedMovie.getTitle() + " | Minimum Age: " + pg13RatedMovie.getMinimumAge() + " | Rating: " + pg13Rating);

        // R Rating - minimumAge >= 17
        MovieV1 rRatedMovie = new MovieV1("Deadpool", 108, "Action", 7.6, 17);
        String rRating = MovieUtils.minimumAgeToRating(rRatedMovie.getMinimumAge());
        System.out.println("Movie: " + rRatedMovie.getTitle() + " | Minimum Age: " + rRatedMovie.getMinimumAge() + " | Rating: " + rRating);


        MovieV1 gRatedMovie1 = new MovieV1("  Toy Story  ", 81, "Animation", 8.3, 0);
        var trimmedTitle  = MovieV1.trimTitle(gRatedMovie1.getTitle());
        System.out.println("trimmedTitle: '" + trimmedTitle + "'");
    }
}
