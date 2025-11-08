package com.modernjava._9functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * LambdaBasics - Introduction to Lambda Expressions in Java
 * Demonstrates the importance of lambdas and how they simplify functional programming
 * Starting with simple String examples before moving to complex objects
 */
public class _1LambdaBasics {

    static void main(String[] args) {
        System.out.println("=== Lambda Expressions Basics ===\n");

        // 1. Introduction to lambda expressions
        introduceLambdaExpressions();

        // 4. Common functional interfaces
        demonstrateFunctionalInterfaces();

        // 5. Lambda expressions with collections
        demonstrateLambdasWithCollections();

        // 6. Method references - shorthand for lambdas
        demonstrateMethodReferences();
    }


    /**
     * Shows how lambdas solve the verbosity problem
     */
    private static void introduceLambdaExpressions() {
        // Method reference approach (most concise)
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana", null));

        System.out.println("\nMethod reference (most concise):");
        System.out.print("Result: ");
        var upperCaseList = names.stream()
                .filter(name -> !name.isEmpty())
                .map((s)-> s.toUpperCase())  // Lambda version
                // .map(String::toUpperCase) // Method reference version
                .toList();
        System.out.println("Result: " + upperCaseList);

//        upperCaseList
//                .forEach(s -> {
//                    System.out.println("  " + s);
//                });
    }

    /**
     * Demonstrates common functional interfaces used with lambdas
     */
    private static void demonstrateFunctionalInterfaces() {
        System.out.println("4. Common Functional Interfaces:");

        List<String> words = Arrays.asList("hello", "world", "java", "programming", "fun");
        System.out.println("Working with words: " + words);

        // Predicate<T> - tests a condition, returns boolean
        System.out.println("\nPredicate<T> - Testing conditions:");
        Predicate<String> isLongWord = word -> word.length() > 4;

        for (String word : words) {
            if (isLongWord.test(word)) {
                System.out.println("  '" + word + "' is a long word (>4 chars)");
            }
        }

        // Function<T, R> - transforms input to output
        System.out.println("\nFunction<T, R> - Transforming data:");
        Function<String, String> toUpperCase = word -> word.toUpperCase();
        Function<String, Integer> getLength = word -> word.length();

        for (String word : words) {
            System.out.println("  '" + word + "' -> '" + toUpperCase.apply(word) + "' (length: " + getLength.apply(word) + ")");
        }

        // Consumer<T> - performs action, returns nothing
        System.out.println("\nConsumer<T> - Performing actions:");
        Consumer<String> printWithExclamation = word -> System.out.println("  " + word + "!");

        System.out.println("Words with excitement:");
        words.forEach(printWithExclamation);
        System.out.println();
    }

    /**
     * Shows lambdas in action with collection operations
     */
    private static void demonstrateLambdasWithCollections() {
        System.out.println("5. Lambdas with Collections:");

        List<String> cities = new ArrayList<>(Arrays.asList("New York", "London", "Tokyo", "Paris", "Sydney", "Berlin"));
        System.out.println("Cities: " + cities);

        // Traditional approach - finding cities starting with 'L'
        System.out.println("\nTraditional approach - find cities starting with 'L':");
        List<String> citiesWithL = new ArrayList<>();
        for (String city : cities) {
            if (city.startsWith("L")) {
                citiesWithL.add(city);
            }
        }
        System.out.println("Cities starting with 'L': " + citiesWithL);

        // Lambda approach - much cleaner (we'll see more in Streams)
        System.out.println("\nLambda approach preview (using removeIf):");
        List<String> citiesCopy = new ArrayList<>(cities);
        citiesCopy.removeIf(city -> !city.startsWith("L"));
        System.out.println("Cities starting with 'L': " + citiesCopy);

        // Using forEach with lambda
        System.out.println("\nUsing forEach with lambda:");
        cities.forEach(city -> System.out.println("  Visit: " + city));
        System.out.println();
    }

    /**
     * Demonstrates method references as shorthand for lambdas
     */
    private static void demonstrateMethodReferences() {
        System.out.println("6. Method References - Lambda Shorthand:");

        List<String> languages = Arrays.asList("java", "python", "javascript", "go", "rust");
        System.out.println("Programming languages: " + languages);

        // Lambda expressions
        System.out.println("\nWith lambda expressions:");
        languages.forEach(lang -> System.out.println("  Language: " + lang));

        // Method references - even more concise
        System.out.println("\nWith method references (same result):");
        languages.forEach(System.out::println);

        // Sorting examples
        List<String> languagesCopy = new ArrayList<>(languages);

        // Lambda
        languagesCopy.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("\nSorted with lambda: " + languagesCopy);

        // Method reference
        languagesCopy.sort(String::compareToIgnoreCase);
        System.out.println("Same sorting with method reference: " + languagesCopy);

        System.out.println("\nKey Takeaway: Lambdas enable functional programming style in Java");
        System.out.println("- More concise than anonymous classes");
        System.out.println("- Focus on 'what' not 'how'");
        System.out.println("- Enable powerful operations with Streams (next topic!)");
        System.out.println();
    }
}
