package com.modernjava._3classandobjects;

/**
 * Utility class containing common movie-related helper methods.
 * All methods are static and the class cannot be instantiated.
 */
public  class MovieUtils {

    static String StreamingPlatform_netflix = "Netflix";
    static String StreamingPlatform_amazonprime = "Amazon_Prime";
    static String StreamingPlatform_disney = "DISNEY";
    /**
     * Maps minimum age to MPAA rating category.
     */

    public static String minimumAgeToRating(int minimumAge) {
        var generalRating = "G";
        if (minimumAge >= 17) return "R";
        if (minimumAge >= 13) return "PG-13";
        if (minimumAge >= 6) return "PG";
        return generalRating;
    }

    public static void addIntermission(MovieV1 m, int extraMinutes) {
        if (m == null) return;
        if (extraMinutes < 0) extraMinutes = 0;
        m.setDuration(m.getDuration()+ extraMinutes) ; // <— mutation 81+15 => 96
    }

    public static MovieV1 copyAndCreateMovie(MovieV1 movie) {
        if (movie == null) return null;

        MovieV1 copiedMovie = new MovieV1(
            movie.getTitle()+"2",
            movie.getDuration(),
            movie.getGenre(),
            movie.getRating(),
            movie.getMinimumAge()
        );

        return copiedMovie;
    }
}
