package com.modernjava._3classandobjects;

/**
 * Utility class containing common movie-related helper methods.
 * All methods are static and the class cannot be instantiated.
 */
public  class MovieUtils {

    // Static variable
    static String streamingPlatform_netflix = "Netflix";
    // Static variable
    static String streamingPlatform_amazonprime = "Amazon_Prime";

    /**
     * Maps minimum age to MPAA rating category.
     */
    public static String minimumAgeToRating(int minimumAge) {
        if (minimumAge >= 17) return "R";
        if (minimumAge >= 13) return "PG-13";
        if (minimumAge >= 6) return "PG";
        return "G";
    }

    public static void addIntermission(Movie m, int extraMinutes) {
        if (m == null) return;
        if (extraMinutes < 0) extraMinutes = 0;
        m.duration += extraMinutes; // <— mutation
    }

    /**
     * Creates a copy of a Movie object with all the same field values
     * and then modifies the title of the newly created object.
     */
    public static Movie copyAndModifyMovie(Movie original) {
        if (original == null) {
            return null;
        }

        // Create a new Movie object with copied values
        Movie copy = new Movie(
            original.title,
            original.duration,
            original.genre,
            original.rating,
            original.minimumAge,
            original.streamingPlatform
        );

        // Modify the newly created object
        copy.title = copy.title + " (Copy)";

        return copy;
    }

}
