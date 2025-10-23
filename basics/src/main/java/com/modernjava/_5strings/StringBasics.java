package com.modernjava._5strings;

/**
 * String Basics - Introduction to Strings in Java
 *
 * Key Concepts:
 * - String declaration and initialization
 * - String immutability
 */
public class StringBasics {

    public static void main(String[] args) {
        System.out.println("=== String Basics ===");

        // 1. String Declaration and Initialization
        demonstrateStringCreation();

        // 2. String Immutability
        demonstrateImmutability();

    }

    private static void demonstrateStringCreation() {
        System.out.println("\n--- String Creation ---");

        // String literal
        String name1 = "Java";

        // Using new keyword
        String name2 = new String("Java");
        var name3 = new String("Java");

        // Empty string
        String empty1 = "";
        String empty2 = new String();

        System.out.println("String literal: " + name1);
        System.out.println("Using new keyword: " + name2);
        System.out.println("Empty string 1: '" + empty1 + "'");
        System.out.println("Empty string 2: '" + empty2 + "'");
    }

    private static void demonstrateImmutability() {
        System.out.println("\n--- String Immutability ---");

        String original = "Hello" + " Java";
        String s = original + " Java";// new String Created
        System.out.println("Original string: " + original);

        // This creates a new string object, doesn't modify original
        String modified = original.concat(" World");

        System.out.println("After concat operation:");
        System.out.println("Original: " + original);  // Still "Hello"
        System.out.println("Modified: " + modified);  // "Hello World"

        // To actually change the reference, we need to reassign
        original = original.concat("!");
        System.out.println("After reassignment: " + original);
    }

}
