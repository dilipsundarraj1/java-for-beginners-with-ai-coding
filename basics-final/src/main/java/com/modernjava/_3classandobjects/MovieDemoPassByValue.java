package com.modernjava._3classandobjects;

public class MovieDemoPassByValue {
    static void main() {

        MovieV1 movieV1 =
                new MovieV1("Toy Story", 81, "Animation", 8.3, 0);

        movieV1.printMovie();
        MovieUtils.addIntermission(movieV1, 15);

        movieV1.printMovie();

        var newMovie = MovieUtils.copyAndCreateMovie(movieV1);
        newMovie.printMovie();
        movieV1.printMovie();

    }
}
