package com.modernjava._3classandobjects;

public class MovieDemoObjectEquality {

    static void main() {
        // Create movie objects for testing
        MovieV1 movie1 = new MovieV1("The Matrix", 136, "Sci-Fi", 8.7, 13);
        System.out.println(movie1);
        //movie1.printMovie();

        MovieV1 movie2 = new MovieV1("The Matrix", 136, "Sci-Fi", 8.7, 13);

        var result = movie1 == movie2; // memory reference comparison
        System.out.println("movie1 == movie2: " + result);

        var result1 = 1 == 1;
        System.out.println("result1: " + result1);

        var result2 = movie1.equals(movie2); // object comparison using equals()
        System.out.println("movie1.equals(movie2): " + result2);
//
//        MovieV1 movie3 = movie1; // Same reference


    }
}
