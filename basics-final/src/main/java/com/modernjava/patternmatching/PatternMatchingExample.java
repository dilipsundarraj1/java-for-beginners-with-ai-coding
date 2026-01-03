package com.modernjava.patternmatching;

import com.modernjava._3classandobjects.MovieRecord;
import com.modernjava._3classandobjects.MovieV2;

public class PatternMatchingExample {


    static void main(String[] args) {

        PatternMatchingExample patternMatchingExample = new PatternMatchingExample();
//        var str = patternMatchingExample.pattern(1);
//        System.out.println("str = " + str);
//        var str1 = patternMatchingExample.pattern("Hello");
//        System.out.println("str1 = " + str1);
//
//        System.out.println("\n--- Using Pattern Matching with instanceof ---");
//        var result1 = patternMatchingExample.patternMatchUsingInstanceOf(42);
//        System.out.println("result1 = " + result1);
//
//        var result2 = patternMatchingExample.patternMatchUsingInstanceOf("Java");
//        System.out.println("result2 = " + result2);
//
//        var result3 = patternMatchingExample.patternMatchUsingInstanceOf(3.14);
//        System.out.println("result3 = " + result3);

        System.out.println("\n--- Using Pattern Matching to print Movie Titles ---");
        MovieV2 movieV2 = new MovieV2("John Wick", 101, null, 7.4, 18, "Netflix");
        MovieRecord movieRecord = new MovieRecord("Inception", 148, null, 8.8, 13, "HBO Max");

        System.out.println("Using printTitle (if-else approach):");
        patternMatchingExample.printTitle(movieV2);
        patternMatchingExample.printTitle(movieRecord);
        patternMatchingExample.printTitle("Not a movie");

        System.out.println("\nUsing printTitleSwitchPatternMatch (switch expression approach):");
        patternMatchingExample.printTitleSwitchPatternMatch(movieV2);
        patternMatchingExample.printTitleSwitchPatternMatch(movieRecord);
        patternMatchingExample.printTitleSwitchPatternMatch("Not a movie");
        patternMatchingExample.printTitleSwitchPatternMatch(null);

        System.out.println("\n--- Using Switch Expression with Pattern Matching ---");
        var resultV2_1 = patternMatchingExample.patternMatchUsingInstanceOfV2(42);
        System.out.println("resultV2_1 = " + resultV2_1);

        var resultV2_2 = patternMatchingExample.patternMatchUsingInstanceOfV2("Java");
        System.out.println("resultV2_2 = " + resultV2_2);

        var resultV2_3 = patternMatchingExample.patternMatchUsingInstanceOfV2(3.14);
        System.out.println("resultV2_3 = " + resultV2_3);

        var resultV2_4 = patternMatchingExample.patternMatchUsingInstanceOfV2(null);
        System.out.println("resultV2_4 = " + resultV2_4);

    }


    public String pattern(Object o) {
        if (o instanceof Integer) {
            var i = (Integer) o; // redundant cast to create binding variable
            return "Integer:" + i;
        }
        if (o instanceof String) {
            var i = (String) o;
            return "String of length:" + i.length();
        }
        return "Not a String or Integer";
    }

    public String patternMatchUsingInstanceOf(Object o) {
        if (o == null) {
            return "Object is null";
        }
        if (o instanceof Integer i) { // i is the binding variable. // pattern mathching
            return "Integer:" + i;
        }
        if (o instanceof String i) {
            return "String of length:" + i.length();
        }
        return "Not a String or Integer";
    }

    public String patternMatchUsingInstanceOfV2(Object o) {
        return switch (o) {
            case null -> "Object is null";
            case Integer i -> "Integer:" + i;
            case String i -> "String of length:" + i.length();
            default -> "Not a String or Integer";
        };
    }

    public void printTitle(Object obj) {
        if (obj instanceof MovieV2 movie) {
            System.out.println("MovieV2 Title: " + movie.getTitle());
        } else if (obj instanceof MovieRecord movie) {
            System.out.println("MovieRecord Title: " + movie.title());
        } else {
            System.out.println("Object is not a Movie type");
        }
    }

    public void printTitleSwitchPatternMatch(Object obj) {
        switch (obj) {
            case MovieV2 movie -> System.out.println("MovieV2 Title: " + movie.getTitle());
            case MovieRecord movie -> System.out.println("MovieRecord Title: " + movie.title());
            case null -> System.out.println("Object is null");
            default -> System.out.println("Object is not a Movie type");
        }
    }

}
