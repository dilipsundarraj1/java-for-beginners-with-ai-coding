package com.modernjava._3classandobjects;

public class MovieDemoVariables {

    public static void main(String[] args) {
        // Demonstrating variable scope and usage
        Movie movie = new Movie(" Avengers: Endgame ", 181, "Action/Adventure", 8.4, 13, MovieUtils.streamingPlatform_netflix);

        // Using the static method to trim the title
        String trimmedTitle = Movie.trimTitle(movie.title);
        System.out.println("Trimmed Title: " + trimmedTitle);

        // Printing movie details using the instance method
        movie.printMovie();

        // AZN, AMZN or Ama_Zon -> This will cause data issues in your app. Defining a variable like this and using it across the project is a benefit.
        movie.streamingPlatform = MovieUtils.streamingPlatform_amazonprime;
        movie.printMovie();

        // Demonstrating invalid state
        movie.duration = -50;
        movie.rating = -8.5; // Negative rating is invalid
        movie.printMovie();

    }

}
