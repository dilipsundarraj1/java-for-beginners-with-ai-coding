package com.modernjava._7regex;

import java.util.StringTokenizer;

/**
 * String Tokenizers in Java
 *
 * String tokenization is the process of breaking a string into smaller parts (tokens)
 * based on delimiters. Java provides several ways to tokenize strings:
 * - StringTokenizer class (legacy but still useful)
 * - String.split() method
 * - Scanner class
 */
public class StringTokenizers {

    public static void main(String[] args) {
        System.out.println("=== String Tokenizers in Java ===\n");

        // 1. StringTokenizer Class
        stringTokenizerBasics();

        // 2. StringTokenizer with Custom Delimiters
        customDelimiters();

        // 3. StringTokenizer vs String.split()
        tokenizerVsSplit();


        // 5. Handling Empty Tokens
        handlingEmptyTokens();
    }

    /**
     * Demonstrates basic StringTokenizer usage
     */
    private static void stringTokenizerBasics() {
        System.out.println("1. StringTokenizer Basics:");

        String sentence = "Java is a powerful programming language";

        // Create StringTokenizer with default delimiters (space, tab, newline, etc.)
        StringTokenizer tokenizer = new StringTokenizer(sentence);

        System.out.println("Original string: " + sentence);
        System.out.println("Number of tokens: " + tokenizer.countTokens());
        System.out.println("Tokens:");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("  '" + token + "'");
        }

        System.out.println();
    }

    /**
     * Demonstrates StringTokenizer with custom delimiters
     */
    private static void customDelimiters() {
        System.out.println("2. StringTokenizer with Custom Delimiters:");

        String data = "apple,banana;orange|grape:cherry";

        // Using multiple delimiters
        StringTokenizer tokenizer = new StringTokenizer(data, ",;|:");

        System.out.println("Original string: " + data);
        System.out.println("Delimiters: ',;|:'");
        System.out.println("Tokens:");

        while (tokenizer.hasMoreTokens()) {
            System.out.println("  " + tokenizer.nextToken());
        }

        // Including delimiters as tokens
        System.out.println("\nIncluding delimiters as tokens:");
        StringTokenizer tokenizerWithDelims = new StringTokenizer(data, ",;|:", true);

        while (tokenizerWithDelims.hasMoreTokens()) {
            String token = tokenizerWithDelims.nextToken();
            System.out.println("  '" + token + "'");
        }

        System.out.println();



    }

    /**
     * Compares StringTokenizer with String.split()
     */
    private static void tokenizerVsSplit() {
        System.out.println("3. StringTokenizer vs String.split():");

        String csvLine = "John,25,Engineer,New York";

        // Using StringTokenizer
        System.out.println("Using StringTokenizer:");
        StringTokenizer tokenizer = new StringTokenizer(csvLine, ",");
        while (tokenizer.hasMoreTokens()) {
            System.out.println("  " + tokenizer.nextToken());
        }

        // Using String.split()
        System.out.println("Using String.split():");
        String[] parts = csvLine.split(",");
        for (String part : parts) {
            System.out.println("  " + part);
        }

        // Performance comparison note
        System.out.println("\nPerformance Notes:");
        System.out.println("- StringTokenizer: Better for simple delimiters, less memory usage");
        System.out.println("- String.split(): More flexible (uses regex), returns array");

        System.out.println();
    }

    /**
     * Demonstrates handling of empty tokens
     */
    private static void handlingEmptyTokens() {
        System.out.println("5. Handling Empty Tokens:");

        String dataWithEmpty = "apple,,banana,,cherry,";

        // StringTokenizer ignores empty tokens by default
        System.out.println("StringTokenizer (ignores empty tokens):");
        StringTokenizer tokenizer = new StringTokenizer(dataWithEmpty, ",");
        while (tokenizer.hasMoreTokens()) {
            System.out.println("  '" + tokenizer.nextToken() + "'");
        }

        // String.split() preserves empty tokens
        System.out.println("String.split() (preserves empty tokens):");
        String[] parts = dataWithEmpty.split(",");
        for (int i = 0; i < parts.length; i++) {
            System.out.println("  [" + i + "]: '" + parts[i] + "'");
        }

        // Using split with limit to include trailing empty strings
        System.out.println("String.split() with limit -1 (includes trailing empty):");
        String[] allParts = dataWithEmpty.split(",", -1);
        for (int i = 0; i < allParts.length; i++) {
            System.out.println("  [" + i + "]: '" + allParts[i] + "'");
        }

        System.out.println();
    }
}
