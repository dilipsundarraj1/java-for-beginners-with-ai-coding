package com.modernjava._6arrays;

import java.util.Arrays;

/**
 * ArrayOperations - Lecture 3
 *
 * This class demonstrates operations on arrays:
 * - Updating elements in arrays
 * - Simulating adding elements (creating new arrays)
 * - Simulating removing elements (creating new arrays)
 * - Searching and finding elements
 * - Sorting arrays
 * - Array copying techniques
 *
 * Note: Arrays have fixed size, so "adding" and "removing"
 * actually means creating new arrays with different sizes.
 *
 * @author Dilip
 */
public class ArrayOperations {

    static void main(String[] args) {
        System.out.println("=== Array Operations - Lecture 3 ===\n");

        // Demonstrate updating elements
        demonstrateUpdatingElements();

        // Show how to "add" elements (create new array)
        demonstrateAddingElements();

        // Show how to "remove" elements (create new array)
        demonstrateRemovingElements();

        // Demonstrate searching operations
        demonstrateSearchingElements();

        // Show array copying techniques
        demonstrateArrayCopying();

        // Demonstrate sorting operations
        demonstrateSortingOperations();
    }

    private static void demonstrateUpdatingElements() {
        System.out.println("--- Updating Array Elements ---");

        int[] scores = {85, 90, 78, 92, 88};
        System.out.println("Original scores:");
        printArray(scores);

        // Simple update
        scores[2] = 82;  // Update third element
        System.out.println("After updating index 2:");
        printArray(scores);

        // Conditional updates
        System.out.println("\nApplying bonus points (5 points if score < 90):");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 90) {
                scores[i] += 5;  // Add bonus points
                System.out.println("Updated score at index " + i + ": " + scores[i]);
            }
        }
        System.out.println("Final scores after bonus:");
        printArray(scores);

        // Bulk update example
        String[] names = {"john", "mary", "bob", "alice"};
        System.out.println("\nOriginal names:");
        printStringArray(names);

        System.out.println("Converting to proper case:");
        for (int i = 0; i < names.length; i++) {
            names[i] = capitalizeFirstLetter(names[i]);
        }
        printStringArray(names);

        System.out.println();
    }

    private static void demonstrateAddingElements() {
        System.out.println("--- 'Adding' Elements to Arrays ---");
        System.out.println("Note: Arrays have fixed size, so we create new arrays\n");

        int[] original = {10, 20, 30};
        System.out.println("Original array:");
        printArray(original);

        // Add element at the end
        int[] withNewEnd = addElementAtEnd(original, 40);
        System.out.println("After adding 40 at the end:");
        printArray(withNewEnd);

        // Add element at the beginning
        int[] withNewBeginning = addElementAtBeginning(original, 5);
        System.out.println("After adding 5 at the beginning:");
        printArray(withNewBeginning);

        // Add element at specific position
        int[] withNewMiddle = addElementAtPosition(original, 25, 2);
        System.out.println("After adding 25 at position 2:");
        printArray(withNewMiddle);

        // Adding multiple elements
        int[] additional = {50, 60, 70};
        int[] combined = combineArrays(original, additional);
        System.out.println("After combining with {50, 60, 70}:");
        printArray(combined);

        System.out.println();
    }

    private static void demonstrateRemovingElements() {
        System.out.println("--- 'Removing' Elements from Arrays ---");
        System.out.println("Note: We create new arrays without the removed elements\n");

        String[] fruits = {"apple", "banana", "orange", "grape", "kiwi"};
        System.out.println("Original fruits:");
        printStringArray(fruits);

        // Remove by index
        String[] afterRemoveByIndex = removeElementAtIndex(fruits, 2);
        System.out.println("After removing element at index 2 (orange):");
        printStringArray(afterRemoveByIndex);

        // Remove by value
        String[] afterRemoveByValue = removeElementByValue(fruits, "banana");
        System.out.println("After removing 'banana':");
        printStringArray(afterRemoveByValue);

        // Remove first element
        String[] afterRemoveFirst = removeFirstElement(fruits);
        System.out.println("After removing first element:");
        printStringArray(afterRemoveFirst);

        // Remove last element
        String[] afterRemoveLast = removeLastElement(fruits);
        System.out.println("After removing last element:");
        printStringArray(afterRemoveLast);

        System.out.println();
    }

    private static void demonstrateSearchingElements() {
        System.out.println("--- Searching Elements in Arrays ---");

        int[] numbers = {15, 8, 23, 42, 7, 19, 33};
        System.out.println("Numbers array:");
        printArray(numbers);

        // Linear search
        int target = 23;
        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Found " + target + " at index: " + index);
        } else {
            System.out.println(target + " not found in array");
        }

        // Find maximum and minimum
        int max = findMaximum(numbers);
        int min = findMinimum(numbers);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        // Find all occurrences
        int[] duplicates = {5, 3, 8, 3, 1, 3, 9};
        System.out.println("\nArray with duplicates:");
        printArray(duplicates);

        int searchValue = 3;
        int[] occurrences = findAllOccurrences(duplicates, searchValue);
        System.out.print("All occurrences of " + searchValue + ": ");
        printArray(occurrences);

        // String array searching
        String[] colors = {"red", "blue", "green", "yellow", "blue", "purple"};
        System.out.println("\nColors array:");
        printStringArray(colors);

        boolean hasBlue = containsString(colors, "blue");
        int firstBlueIndex = findStringIndex(colors, "blue");
        System.out.println("Contains 'blue': " + hasBlue);
        System.out.println("First 'blue' at index: " + firstBlueIndex);

        System.out.println();
    }

    private static void demonstrateArrayCopying() {
        System.out.println("--- Array Copying Techniques ---");

        int[] original = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(original);

        // Shallow copy using loop
        int[] copy1 = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy1[i] = original[i];
        }
        System.out.println("Copy using loop:");
        printArray(copy1);

        // Copy using System.arraycopy()
        int[] copy2 = new int[original.length];
        System.arraycopy(original, 0, copy2, 0, original.length);
        System.out.println("Copy using System.arraycopy():");
        printArray(copy2);

        // Copy using Arrays.copyOf()
        int[] copy3 = Arrays.copyOf(original, original.length);
        System.out.println("Copy using Arrays.copyOf():");
        printArray(copy3);

        // Partial copy
        int[] partialCopy = Arrays.copyOfRange(original, 1, 4);
        System.out.println("Partial copy (indices 1-3):");
        printArray(partialCopy);

        // Demonstrate independence
        copy1[0] = 999;
        System.out.println("After modifying copy1[0] = 999:");
        System.out.println("Original (unchanged): ");
        printArray(original);
        System.out.println("Copy1 (changed): ");
        printArray(copy1);

        System.out.println();
    }

    private static void demonstrateSortingOperations() {
        System.out.println("--- Sorting Operations ---");

        // Sort integers
        int[] numbers = {64, 25, 12, 22, 11, 90};
        System.out.println("Original numbers:");
        printArray(numbers);

        // Create copy for sorting
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);
        System.out.println("Sorted numbers (ascending):");
        printArray(sortedNumbers);

        // Sort strings
        String[] names = {"Charlie", "Alice", "Bob", "Diana"};
        System.out.println("Original names:");
        printStringArray(names);

        String[] sortedNames = Arrays.copyOf(names, names.length);
        Arrays.sort(sortedNames);
        System.out.println("Sorted names (alphabetical):");
        printStringArray(sortedNames);

        System.out.println();
    }

    // Helper methods for array operations

    private static int[] addElementAtEnd(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
//        int[] newArray = Arrays.copyOf(array, array.length+1);
        newArray[array.length] = element;
        return newArray;
    }

    private static int[] addElementAtBeginning(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = element;
        System.arraycopy(array, 0, newArray, 1, array.length);
        return newArray;
    }

    private static int[] addElementAtPosition(int[] array, int element, int position) {
        if (position < 0 || position > array.length) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, position);
        newArray[position] = element;
        System.arraycopy(array, position, newArray, position + 1, array.length - position);
        return newArray;
    }

    private static int[] combineArrays(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, combined, 0, array1.length);
        System.arraycopy(array2, 0, combined, array1.length, array2.length);
        return combined;
    }

    private static String[] removeElementAtIndex(String[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        String[] newArray = new String[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }

    private static String[] removeElementByValue(String[] array, String value) {
        int index = findStringIndex(array, value);
        if (index != -1) {
            return removeElementAtIndex(array, index);
        }
        return Arrays.copyOf(array, array.length);  // Return copy if not found
    }

    private static String[] removeFirstElement(String[] array) {
        if (array.length == 0) return new String[0];
        return Arrays.copyOfRange(array, 1, array.length);
    }

    private static String[] removeLastElement(String[] array) {
        if (array.length == 0) return new String[0];
        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;  // Not found
    }

    private static int findMaximum(int[] array) {
        if (array.length == 0) throw new IllegalArgumentException("Array is empty");

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int findMinimum(int[] array) {
        if (array.length == 0) throw new IllegalArgumentException("Array is empty");

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int[] findAllOccurrences(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) count++;
        }

        int[] occurrences = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                occurrences[index++] = i;
            }
        }
        return occurrences;
    }

    private static boolean containsString(String[] array, String target) {
        return findStringIndex(array, target) != -1;
    }

    private static int findStringIndex(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
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

    private static void printStringArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.print("\"" + array[i] + "\"");
            } else {
                System.out.print("null");
            }
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
