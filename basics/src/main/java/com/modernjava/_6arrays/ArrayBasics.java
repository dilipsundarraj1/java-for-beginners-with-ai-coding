package com.modernjava._6arrays;

/**
 * ArrayBasics - Lecture 1
 *
 * This class demonstrates the fundamental concepts of arrays in Java:
 * - Creating arrays of different primitive types
 * - Array initialization techniques
 * - Array size and indexing
 * - Memory allocation concepts
 *
 * @author Dilip
 */
public class ArrayBasics {




    public static void main(String[] args) {
        System.out.println("=== Array Basics - Lecture 1 ===\n");

        // Demonstrate different ways to create arrays
        demonstrateArrayCreation();

        // Show array initialization techniques
        demonstrateArrayInitialization();

        // Explain array properties
        demonstrateArrayProperties();

        // Show memory concepts
        demonstrateMemoryConcepts();
    }

    private static void demonstrateArrayCreation() {
        System.out.println("--- Creating Arrays of Primitives ---");

        // Declaration and creation - two steps
        int[] numbers;  // Declaration
        numbers = new int[5];  // Creation with size 5

        // Declaration and creation - one step
        int[] scores = new int[3];
        double[] temperatures = new double[7];
        boolean[] flags = new boolean[4];
        char[] letters = new char[26];

        System.out.println("Integer array length: " + numbers.length);
        System.out.println("Double array length: " + temperatures.length);
        System.out.println("Boolean array length: " + flags.length);
        System.out.println("Character array length: " + letters.length);

        // Default values demonstration
        System.out.println("\nDefault values:");
        System.out.println("int array default: " + numbers[0]);  // 0
        System.out.println("double array default: " + temperatures[0]);  // 0.0
        System.out.println("boolean array default: " + flags[0]);  // false
        System.out.println("char array default: '" + letters[0] + "'");  // '\u0000'

        System.out.println();
    }

    private static void demonstrateArrayInitialization() {
        System.out.println("--- Array Initialization Techniques ---");

        // Method 1: Initialize with values during declaration
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19};
        double[] prices = {19.99, 29.99, 39.99, 49.99};
        boolean[] answers = {true, false, true, true, false};

        // Method 2: Using new keyword with values
        int[] evenNumbers = new int[]{2, 4, 6, 8, 10};
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        // Method 3: Initialize after declaration
        int[] oddNumbers = new int[5];
        oddNumbers[0] = 1;
        oddNumbers[1] = 3;
        oddNumbers[2] = 5;
        oddNumbers[3] = 7;
        oddNumbers[4] = 9;

        // Display initialized arrays
        System.out.print("Prime numbers: ");
        printArray(primeNumbers);

        System.out.print("Prices: ");
        printDoubleArray(prices);

        System.out.print("Vowels: ");
        printCharArray(vowels);

        System.out.print("Odd numbers: ");
        printArray(oddNumbers);

        System.out.println();
    }

    private static void demonstrateArrayProperties() {
        System.out.println("--- Array Properties ---");

        int[] data = {10, 20, 30, 40, 50};

        System.out.println("Array length: " + data.length);
        System.out.println("First element (index 0): " + data[0]);
        System.out.println("Last element (index " + (data.length - 1) + "): " + data[data.length - 1]);

        // Accessing elements
        System.out.println("\nAccessing all elements:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Index " + i + ": " + data[i]);
        }

        // Modifying elements
        System.out.println("\nModifying elements:");
        data[2] = 35;  // Change middle element
        System.out.println("After changing index 2 to 35:");
        printArray(data);

        System.out.println();
    }

    private static void demonstrateMemoryConcepts() {
        System.out.println("--- Memory and Reference Concepts ---");

        // Arrays are reference types
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = original;  // This copies the reference, not the array!

        System.out.println("Original array:");
        printArray(original);

        System.out.println("Copy (reference to same array):");
        printArray(copy);

        // Modify through 'copy' reference
        copy[0] = 100;

        System.out.println("\nAfter modifying copy[0] = 100:");
        System.out.println("Original array (also changed!):");
        printArray(original);
        System.out.println("Copy array:");
        printArray(copy);

        // Demonstrate array size is fixed
        System.out.println("\nArray size demonstration:");
        int[] fixedSize = new int[3];
        System.out.println("Created array with length: " + fixedSize.length);
        // fixedSize.length = 5; // This would cause a compile error!
        // Arrays have fixed size - cannot be changed after creation

        System.out.println();
    }

    // Helper methods for printing arrays
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printDoubleArray(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f", array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printCharArray(char[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("'" + array[i] + "'");
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
