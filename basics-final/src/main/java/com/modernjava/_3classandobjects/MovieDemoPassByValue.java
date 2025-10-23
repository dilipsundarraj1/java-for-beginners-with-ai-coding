package com.modernjava._3classandobjects;

public class MovieDemoPassByValue {

    public static void main(String[] args) {

        // Demonstrating pass-by-value
        Movie movie = new Movie(" Avengers: Endgame ", 181, "Action/Adventure", 8.4, 13, MovieUtils.streamingPlatform_netflix);
        MovieUtils.addIntermission(movie, 15);
        movie.printMovie();

        var movie1 = MovieUtils.copyAndModifyMovie(movie);
        movie.printMovie();
        movie1.printMovie();

    }
}
