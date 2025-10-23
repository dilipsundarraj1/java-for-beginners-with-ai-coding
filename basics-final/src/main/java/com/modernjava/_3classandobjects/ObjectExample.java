package com.modernjava._3classandobjects;

public class ObjectExample {
    public static void main(String[] args) {
        Object strObj = "John Wick";
        Object movieObj = new MovieV2("John Wick", 101, MovieGenreEnum.ACTION, 7.4, 18, "Netflix");
        String name = "John";
        var movie = new MovieV2("John Wick", 101, MovieGenreEnum.ACTION, 7.4, 18, "Netflix");
        printName(name);
        printName(movie);
    }

    private static void printName(Object obj) {

        if (obj instanceof String) {
            System.out.println("String name: " + obj);
        } else if (obj instanceof MovieV2) {
            System.out.println("Movie title: " + ((MovieV2) obj).getTitle());
        } else {
            System.out.println("Unknown object type");
        }
    }
}
