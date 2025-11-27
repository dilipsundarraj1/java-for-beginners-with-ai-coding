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
    }

    public static void printObject(Object obj){
        System.out.println("object value: " + obj);
    }

}
