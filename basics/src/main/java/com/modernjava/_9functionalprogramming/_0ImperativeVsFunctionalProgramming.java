package com.modernjava._9functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _0ImperativeVsFunctionalProgramming {

    static void main(String[] args) {

        List<String> words = Arrays.asList("java", "python", "javascript");

        System.out.println("=== Lambda Expressions Basics ===\n");

        uppercaseImperative(words);

        uppercaseFunctional(words);


        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));

        sortImperative(names);

        sortFunctional(new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana")));

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
                .stream().map((s)-> s.toUpperCase())  // Lambda version
                // .map(String::toUpperCase) // Method reference version
                .toList();
        System.out.println("Result: " + upperCaseList);
    }

    /**
     * Shows traditional approach with anonymous classes - verbose and hard to read
     */
    private static void sortImperative(List<String> names) {
        System.out.println("2. More Complex Example - Traditional vs Lambda:");


        System.out.println("Original list: " + names);

        // Traditional way - using anonymous class for sorting
        Collections.sort(names, new java.util.Comparator<String>() {
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
        names.sort(java.util.Comparator.comparing(String::length));
        System.out.println("Sorted by length (method ref): " + names);

        System.out.println("\nBenefits of Functional Approach:");
        System.out.println("✓ Concise: 1 line instead of 6 lines");
        System.out.println("✓ Readable: Focuses on 'what' not 'how'");
        System.out.println("✓ Maintainable: Less boilerplate code");
        System.out.println("✓ Expressive: Intent is immediately clear");

        System.out.println("\nComparison:");
        System.out.println("Traditional:  Collections.sort(names, new Comparator<String>() { ... 6 lines ... });");
        System.out.println("Lambda:       names.sort((s1, s2) -> s1.length() - s2.length());");
        System.out.println("Method Ref:   names.sort(Comparator.comparing(String::length));");
        System.out.println();
    }
}
