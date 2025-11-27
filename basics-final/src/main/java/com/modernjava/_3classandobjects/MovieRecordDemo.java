package com.modernjava._3classandobjects;

public class MovieRecordDemo {

    static void main() {
        MovieRecord movie = new MovieRecord(
                "Inception",
                -148,
                MovieGenreEnum.ACTION,
                8.8,
                13,
                "Netflix"
        );

        System.out.println("Movie Title: " + movie.title());
        System.out.println("Duration: " + movie.duration() + " minutes");
        System.out.println("Genre: " + movie.genre());
        System.out.println("Rating: " + movie.rating() + "/10");
        System.out.println("Minimum Age: " + movie.minimumAge());
        System.out.println("Streaming Platform: " + movie.streamingPlatform());

        // Create a new MovieRecord with updated rating using withRating method
        MovieRecord updatedMovie = movie.withRating(9.5);

        System.out.println("\n--- After updating rating ---");
        System.out.println("Original Movie Rating: " + movie.rating() + "/10");
        System.out.println("Updated Movie Rating: " + updatedMovie.rating() + "/10");


        MovieRecord movie1 = new MovieRecord(
                "Inception",
                148,
                MovieGenreEnum.ACTION,
                8.8,
                13,
                "Netflix"
        );

        var result = movie1.equals(movie);
        System.out.println("Are movie and movie1 the same instance? " + result);
        System.out.println("movie :" + movie);
        var durationFormatted = movie1.formattedDuration();
        System.out.println("Formatted Duration: " + durationFormatted);
    }
}
