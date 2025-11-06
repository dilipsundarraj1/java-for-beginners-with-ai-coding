package com.modernjava._5strings;

/**
 * String Performance and StringBuilder
 *
 * Key Concepts:
 * - String immutability performance implications
 * - StringBuilder for efficient string building
 * - StringBuffer vs StringBuilder
 * - Best practices for string manipulation
 */
public class StringPerformance {

    static void main(String[] args) {
        System.out.println("=== String Performance and StringBuilder ===");

        // 1. Performance comparison
        demonstratePerformanceIssue();

        // 2. StringBuilder usage

        // 3. StringBuffer vs StringBuilder

    }

    private static void demonstratePerformanceIssue() {
        System.out.println("\n--- Performance Issue with String Concatenation ---");

        // Inefficient way - creates many temporary objects
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 1; i <= 1000; i++) {
            result += "Number " + i + " ";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("String concatenation time: " + (endTime - startTime) + "ms");
        System.out.println("Result length: " + result.length());
        System.out.println("First 50 characters: " + result.substring(0, Math.min(50, result.length())));

        // Efficient way using StringBuilder
    }

}
