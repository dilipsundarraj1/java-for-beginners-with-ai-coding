package com.modernjava._3classandobjects;

public class MovieDemoVariables {
    static void main() {


        MovieV2 movieV2 =
                new MovieV2("Inception", 148, MovieGenreEnum.ACTION, 8.8, 13,
                        MovieUtils.StreamingPlatform_netflix);

        System.out.println(movieV2);
        MovieV2 movieV3 =
                new MovieV2("The Lion King", 88, MovieGenreEnum.COMEDY, 8.5, 0,
                        MovieUtils.StreamingPlatform_disney);
        System.out.println(movieV3);

        MovieV2 movieV4 =
                new MovieV2("The Lion King", 88, MovieGenreEnum.COMEDY, 8.5, 0,
                        MovieUtils.StreamingPlatform_disney);
        System.out.println(movieV4);

        // Print all enum values
        System.out.println("\n--- All Movie Genres ---");
        MovieGenreEnum[] genres = MovieGenreEnum.values();
        for (MovieGenreEnum genre : genres) {
            System.out.println("Genre: " + genre);
        }

        System.out.println("\n--- All Movie Genres (Alternative) ---");
        for (MovieGenreEnum genre : MovieGenreEnum.values()) {
            System.out.println("- " + genre.name() + " (ordinal: " + genre.ordinal() + ")");
        }

    }
}
