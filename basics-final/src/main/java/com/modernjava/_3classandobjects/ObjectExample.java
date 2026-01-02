package com.modernjava._3classandobjects;

public class ObjectExample {

    static void main() {

        Object name = "John Wick";
        Object movie = new MovieV2("John Wick", 101, MovieGenreEnum.ACTION, 7.4, 18, "Netflix");

        String name1 = "John Wick";
        MovieV2 movie1 = new MovieV2("John Wick", 101, MovieGenreEnum.ACTION, 7.4, 18, "Netflix");
        MovieRecord movieRecord = new MovieRecord("Inception", 148, MovieGenreEnum.ACTION,
                8.8, 13, "HBO Max");

        printObject(name1);
        printObject(movie1);
        printObject(movieRecord);

        // Print titles
        printTitle(movie1);
        printTitle(movieRecord);

        // Print titles using pattern matching
        printTitleV2(movie1);
        printTitleV2(movieRecord);
    }

    public static void printObject(Object obj){
        System.out.println("object value: " + obj);
    }

    // Print the title from MovieV2 and MovieRecord objects
    public static void printTitle(Object obj) {
        if (obj instanceof MovieV2) {
            MovieV2 movie = (MovieV2) obj;
            System.out.println("Title: " + movie.getTitle());
        } else if (obj instanceof MovieRecord) {
            MovieRecord movie = (MovieRecord) obj;
            System.out.println("Title: " + movie.title());
        } else {
            System.out.println("Object is not a MovieV2 or MovieRecord");
        }
    }

    // Print the title using pattern matching for instanceof (Java 16+)
    public static void printTitleV2(Object obj) {
        if (obj instanceof MovieV2 movie) {
            System.out.println("Title: " + movie.getTitle());
        } else if (obj instanceof MovieRecord movie) {
            System.out.println("Title: " + movie.title());
        } else {
            System.out.println("Object is not a MovieV2 or MovieRecord");
        }
    }

    // Print the title using switch expression with type patterns (Java 21+)
    public static void printTitleV3(Object obj) {
        String result = switch (obj) {
            case MovieV2 movie -> "Title: " + movie.getTitle();
            case MovieRecord movie -> "Title: " + movie.title();
            default -> "Object is not a MovieV2 or MovieRecord";
        };
        System.out.println(result);
    }


}
