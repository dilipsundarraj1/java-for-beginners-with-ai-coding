package com.modernjava._6arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * ArrayUtilities - Lecture 4
 *
 * This class demonstrates the powerful utility functions available
 * for working with arrays in Java:
 * - java.util.Arrays class methods
 * - Sorting with custom comparators
 * - Binary search operations
 * - Array equality and comparison
 * - Array to String conversion
 * - Filling arrays with values
 * - Multi-dimensional array utilities
 *
 * @author Dilip
 */
public class ArrayUtilities {

    public static void main(String[] args) {
        System.out.println("=== Array Utilities - Lecture 4 ===\n");

        // Demonstrate Arrays class basic utilities
        demonstrateBasicUtilities();

        // Show advanced sorting capabilities
        demonstrateAdvancedSorting();

        // Demonstrate binary search
        demonstrateBinarySearch();

        // Show array comparison and equality
        demonstrateArrayComparison();

        // Demonstrate array filling and conversion
        demonstrateArrayFillingAndConversion();

        // Show multi-dimensional array utilities
        demonstrateMultiDimensionalArrays();
    }

    private static void demonstrateBasicUtilities() {
        System.out.println("--- Basic Arrays Utility Functions ---");

        int[] numbers = {5, 2, 8, 1, 9, 3};
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array
        Arrays.sort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));

        // Fill array with a specific value
        int[] filled = new int[5];
        Arrays.fill(filled, 42);
        System.out.println("Array filled with 42: " + Arrays.toString(filled));

        // Fill part of an array
        int[] partial = {1, 2, 3, 4, 5, 6, 7};
        Arrays.fill(partial, 2, 5, 99);  // Fill indices 2-4 with 99
        System.out.println("Partial fill (indices 2-4 with 99): " + Arrays.toString(partial));

        // Copy arrays
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = Arrays.copyOf(original, original.length);
        int[] expandedCopy = Arrays.copyOf(original, 8);  // Larger copy
        int[] rangeCopy = Arrays.copyOfRange(original, 1, 4);  // Indices 1-3

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Exact copy: " + Arrays.toString(copy));
        System.out.println("Expanded copy: " + Arrays.toString(expandedCopy));
        System.out.println("Range copy [1-3]: " + Arrays.toString(rangeCopy));

        System.out.println();
    }

    private static void demonstrateAdvancedSorting() {
        System.out.println("--- Advanced Sorting with Arrays ---");

        // Sorting primitive arrays
        double[] prices = {19.99, 5.50, 29.99, 12.75, 8.25};
        System.out.println("Original prices: " + Arrays.toString(prices));
        Arrays.sort(prices);
        System.out.println("Sorted prices: " + Arrays.toString(prices));

        // Sorting part of an array
        int[] data = {9, 3, 7, 1, 5, 8, 2, 6};
        System.out.println("Original data: " + Arrays.toString(data));
        Arrays.sort(data, 2, 6);  // Sort indices 2-5
        System.out.println("Partial sort (indices 2-5): " + Arrays.toString(data));

        // Sorting String arrays
        String[] names = {"Charlie", "Alice", "Bob", "Diana", "Eve"};
        System.out.println("Original names: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted names: " + Arrays.toString(names));

        // Custom sorting with Comparator (for String arrays)
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
        System.out.println("Original cities: " + Arrays.toString(cities));

        // Sort by length
        Arrays.sort(cities, Comparator.comparing(String::length));
        System.out.println("Sorted by length: " + Arrays.toString(cities));

        // Sort by length, then alphabetically
        String[] countries = {"USA", "UK", "Canada", "France", "Germany", "Italy"};
        System.out.println("Original countries: " + Arrays.toString(countries));
        Arrays.sort(countries, Comparator.comparing(String::length).thenComparing(String::compareTo));
        System.out.println("Sorted by length, then alphabetically: " + Arrays.toString(countries));

        // Reverse order sorting
        String[] fruits = {"apple", "banana", "cherry", "date"};
        Arrays.sort(fruits, Collections.reverseOrder());
        System.out.println("Fruits in reverse order: " + Arrays.toString(fruits));

        System.out.println();
    }

    private static void demonstrateBinarySearch() {
        System.out.println("--- Binary Search Operations ---");

        // Binary search requires sorted array
        int[] sortedNumbers = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println("Sorted array: " + Arrays.toString(sortedNumbers));

        // Search for existing elements
        int target = 7;
        int index = Arrays.binarySearch(sortedNumbers, target);
        System.out.println("Binary search for " + target + ": index = " + index);

        // Search for non-existing element
        target = 6;
        index = Arrays.binarySearch(sortedNumbers, target);
        System.out.println("Binary search for " + target + ": index = " + index);
        if (index < 0) {
            int insertionPoint = -(index + 1);
            System.out.println("  -> Would be inserted at index: " + insertionPoint);
        }

        // Binary search on part of array
        index = Arrays.binarySearch(sortedNumbers, 2, 6, 9);  // Search indices 2-5
        System.out.println("Binary search for 9 in range [2-5]: index = " + index);

        // Binary search with String arrays
        String[] sortedWords = {"apple", "banana", "cherry", "grape", "orange"};
        System.out.println("Sorted words: " + Arrays.toString(sortedWords));

        int wordIndex = Arrays.binarySearch(sortedWords, "cherry");
        System.out.println("Binary search for 'cherry': index = " + wordIndex);

        // Binary search with custom comparator
        String[] names = {"Ann", "Bob", "Charlie", "Diana"};
        int nameIndex = Arrays.binarySearch(names, "Bob", String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-insensitive search for 'Bob': index = " + nameIndex);

        System.out.println();
    }

    private static void demonstrateArrayComparison() {
        System.out.println("--- Array Comparison and Equality ---");

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        int[] array4 = {1, 2, 3};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Array3: " + Arrays.toString(array3));
        System.out.println("Array4: " + Arrays.toString(array4));

        // Check equality
        System.out.println("\nEquality checks:");
        System.out.println("array1.equals(array2): " + array1.equals(array2));  // false - reference comparison
        System.out.println("Arrays.equals(array1, array2): " + Arrays.equals(array1, array2));  // true - content comparison
        System.out.println("Arrays.equals(array1, array3): " + Arrays.equals(array1, array3));  // false
        System.out.println("Arrays.equals(array1, array4): " + Arrays.equals(array1, array4));  // false

        // Compare arrays (lexicographically)
        System.out.println("\nComparison results:");
        System.out.println("Arrays.compare(array1, array2): " + Arrays.compare(array1, array2));  // 0 (equal)
        System.out.println("Arrays.compare(array1, array3): " + Arrays.compare(array1, array3));  // negative (array1 < array3)
        System.out.println("Arrays.compare(array1, array4): " + Arrays.compare(array1, array4));  // positive (array1 > array4)

        // String array comparison
        String[] words1 = {"apple", "banana", "cherry"};
        String[] words2 = {"apple", "banana", "cherry"};
        String[] words3 = {"apple", "banana", "date"};

        System.out.println("\nString array equality:");
        System.out.println("Arrays.equals(words1, words2): " + Arrays.equals(words1, words2));
        System.out.println("Arrays.equals(words1, words3): " + Arrays.equals(words1, words3));

        // Hash code
        System.out.println("\nArray hash codes:");
        System.out.println("Arrays.hashCode(array1): " + Arrays.hashCode(array1));
        System.out.println("Arrays.hashCode(array2): " + Arrays.hashCode(array2));
        System.out.println("Same content = same hash code: " + (Arrays.hashCode(array1) == Arrays.hashCode(array2)));

        System.out.println();
    }

    private static void demonstrateArrayFillingAndConversion() {
        System.out.println("--- Array Filling and Conversion ---");

        // Create and fill arrays
        boolean[] flags = new boolean[6];
        Arrays.fill(flags, true);
        System.out.println("Boolean array filled with true: " + Arrays.toString(flags));

        char[] characters = new char[5];
        Arrays.fill(characters, '*');
        System.out.println("Character array filled with '*': " + Arrays.toString(characters));

        // Fill with different values in ranges
        int[] mixed = new int[10];
        Arrays.fill(mixed, 0, 3, 1);    // Fill indices 0-2 with 1
        Arrays.fill(mixed, 3, 6, 2);    // Fill indices 3-5 with 2
        Arrays.fill(mixed, 6, 10, 3);   // Fill indices 6-9 with 3
        System.out.println("Mixed filled array: " + Arrays.toString(mixed));

        // Array to String conversion
        int[] numbers = {10, 20, 30, 40, 50};
        String arrayString = Arrays.toString(numbers);
        System.out.println("Array as string: " + arrayString);

        // Multi-dimensional array to string
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("2D array toString(): " + Arrays.toString(matrix));  // Shows references
        System.out.println("2D array deepToString(): " + Arrays.deepToString(matrix));  // Shows content

        // Convert array to list (useful for further processing)
        String[] nameArray = {"Alice", "Bob", "Charlie"};
        System.out.println("Array: " + Arrays.toString(nameArray));
        // Note: Arrays.asList() creates a fixed-size list backed by the array
        System.out.println("As List: " + Arrays.asList(nameArray));

        System.out.println();
    }

    private static void demonstrateMultiDimensionalArrays() {
        System.out.println("--- Multi-dimensional Array Utilities ---");

        // Create and initialize 2D array
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix3 = {
            {1, 2, 3},
            {4, 5, 7},  // Different value
            {7, 8, 9}
        };

        System.out.println("Matrix1:");
        printMatrix(matrix1);
        System.out.println("Matrix2:");
        printMatrix(matrix2);
        System.out.println("Matrix3:");
        printMatrix(matrix3);

        // Deep equality check
        System.out.println("Deep equality checks:");
        System.out.println("Arrays.deepEquals(matrix1, matrix2): " + Arrays.deepEquals(matrix1, matrix2));
        System.out.println("Arrays.deepEquals(matrix1, matrix3): " + Arrays.deepEquals(matrix1, matrix3));

        // Deep hash code
        System.out.println("Deep hash codes:");
        System.out.println("Arrays.deepHashCode(matrix1): " + Arrays.deepHashCode(matrix1));
        System.out.println("Arrays.deepHashCode(matrix2): " + Arrays.deepHashCode(matrix2));
        System.out.println("Same content = same hash: " + (Arrays.deepHashCode(matrix1) == Arrays.deepHashCode(matrix2)));

        // Deep string representation
        System.out.println("Deep string representation:");
        System.out.println("Arrays.deepToString(matrix1): " + Arrays.deepToString(matrix1));

        // 3D array example
        int[][][] cube = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };
        System.out.println("3D array: " + Arrays.deepToString(cube));

        // Sorting 2D array by first element of each row
        String[][] people = {
            {"Charlie", "25", "Engineer"},
            {"Alice", "30", "Doctor"},
            {"Bob", "22", "Student"}
        };

        System.out.println("Before sorting by name:");
        for (String[] person : people) {
            System.out.println(Arrays.toString(person));
        }

        Arrays.sort(people, Comparator.comparing(row -> row[0]));  // Sort by first element (name)

        System.out.println("After sorting by name:");
        for (String[] person : people) {
            System.out.println(Arrays.toString(person));
        }

        System.out.println();
    }

    // Helper method to print 2D array
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
