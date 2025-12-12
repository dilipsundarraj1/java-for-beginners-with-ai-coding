package com.modernjava._9functionalprogramming;

import java.util.*;

public class ImperativeVsFunctionalProgramming {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "python", "javascript");

        System.out.println("=== Lambda Expressions Basics ===\n");

        // Convert a list of Strings to uppercase
        // java, python, javascript -> JAVA, PYTHON, JAVASCRIPT
        uppercaseImperative(words);

        uppercaseFunctional(words);


        // Sort a list of names by their length
        // Alice, Bob, Charlie, Diana -> Bob, Alice, Diana, Charlie
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));

        sortImperative(names);

        sortFunctional(names);

    }

    /**
     * Simple example showing traditional vs lambda vs method reference for uppercase operation
     */

    private static void uppercaseImperative(List<String> words) {
        System.out.println("1. Simple Example - Converting to Uppercase:");


        System.out.println("Original words: " + words);

        // Traditional approach - using enhanced for loop
        System.out.println("\nTraditional approach (enhanced for loop):");
        List<String> uppercaseTraditional = new ArrayList<>();
        for (String word : words) {
            uppercaseTraditional.add(word.toUpperCase());
        }
        System.out.println("Result: " + uppercaseTraditional);

    }

    private static void uppercaseFunctional(List<String> words) {
        // Method reference approach (most concise)
        System.out.println("\nMethod reference (most concise):");
        System.out.print("Result: ");
        var upperCaseList = words
                .stream() // Pass elements one by one.
                .map((s)-> s.toUpperCase())  // Every input is transformed using a Lambda version
                .toList();
        System.out.println("Result: " + upperCaseList);

        // .map(String::toUpperCase) // Method reference version
    }

    /**
     * Shows traditional approach with anonymous classes - verbose and hard to read
     */
    private static void sortImperative(List<String> names) {
        System.out.println("2. More Complex Example - Traditional vs Lambda:");


        System.out.println("Original list: " + names);



        // Traditional way - using anonymous class for sorting
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length(); // Sort by length
            }
        });

        System.out.println("Sorted by length (traditional): " + names);
        System.out.println("Problem: Verbose, hard to read, focuses on 'how' not 'what'");
        System.out.println("- 6 lines of code for simple sorting logic");
        System.out.println("- Anonymous class boilerplate obscures intent");
        System.out.println("- Hard to read and maintain\n");
    }

    /**
     * Shows functional approach with lambdas - concise and readable
     */
    private static void sortFunctional(List<String> names) {
        System.out.println("3. Functional Programming Solution:");

        System.out.println("Original list: " + names);

        // Lambda approach - concise and readable
        System.out.println("\nLambda syntax:");
        names.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted by length (lambda): " + names);

        // Reset for method reference example
        names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));

        // Method reference approach - most concise
        System.out.println("\nMethod reference (most concise):");
        names.sort(Comparator.comparing(String::length));
        System.out.println("Sorted by length (method ref): " + names);

        System.out.println();
    }
}
