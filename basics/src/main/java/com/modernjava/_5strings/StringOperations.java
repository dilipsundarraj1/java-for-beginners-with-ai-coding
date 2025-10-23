package com.modernjava._5strings;

/**
 * String Operations - Common String Methods
 *
 * Key Concepts:
 * - Length and character access
 * - Concatenation methods
 * - Case conversion
 * - Substring operations
 */
public class StringOperations {

    public static void main(String[] args) {
        System.out.println("=== String Operations ===");

        String text = "Hello Java World";

        // 1. Basic String Information
        demonstrateBasicOperations(text);

        // 2. Concatenation
        demonstrateConcatenation();

        // 3. Case Conversion
        demonstrateCaseConversion(text);

        // 4. Substring Operations
        demonstrateSubstring(text);
    }

    private static void demonstrateBasicOperations(String text) {
        System.out.println("\n--- Basic String Operations ---");

        System.out.println("Original text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Character at index 0: " + text.charAt(0));
        System.out.println("Character at index 6: " + text.charAt(6));
        System.out.println("Is empty: " + text.isEmpty());


        String[] words = text.split(" ");
        System.out.println(words[0]); // "Hello"



        // Check for empty/blank strings
        String empty = "";
        String blank = "   ";
        System.out.println("Empty string length: " + empty.length());
        System.out.println("Blank string length: " + blank.length());
        System.out.println("Blank string is blank: " + blank.isBlank()); // Java 11+
    }

    private static void demonstrateConcatenation() {
        System.out.println("\n--- String Concatenation ---");

        String first = "Hello";
        String second = "World";

        // Using + operator
        String result1 = first + " " + second;
        System.out.println("Using + operator: " + result1);

        // Using concat() method
        String result2 = first.concat(" ").concat(second);
        System.out.println("Using concat(): " + result2);

        // Performance consideration with multiple concatenations
        String result3 = "";
        for (int i = 1; i <= 3; i++) {
            result3 += "Step" + i + " ";
        }
        System.out.println("Multiple concatenations: " + result3.trim());
    }

    private static void demonstrateCaseConversion(String text) {
        System.out.println("\n--- Case Conversion ---");

        System.out.println("Original: " + text);
        System.out.println("Upper case: " + text.toUpperCase());
        System.out.println("Lower case: " + text.toLowerCase());

        // First letter uppercase
        String name = "java";
        String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Capitalized: " + capitalized);
    }

    private static void demonstrateSubstring(String text) {
        System.out.println("\n--- Substring Operations ---");

        System.out.println("Original: " + text);
        System.out.println("Substring from index 6: " + text.substring(6));
        System.out.println("Substring from 0 to 5: " + text.substring(0, 5));
        System.out.println("Substring from 6 to 10: " + text.substring(6, 10));

        // Extract words
        String[] words = text.split(" ");
        System.out.println("First word: " + words[0]);
        System.out.println("Last word: " + words[words.length - 1]);
    }
}
