package com.modernjava._6arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayDisadvantages - Lecture 5
 *
 * This class demonstrates the limitations and disadvantages of arrays
 * and shows when alternatives like ArrayList might be better:
 * - Fixed size limitations
 * - Performance issues with insertions/deletions
 * - Memory management concerns
 * - Type safety limitations
 * - Comparison with dynamic data structures
 * - When to use arrays vs alternatives
 *
 * @author Dilip
 */
public class ArrayDisadvantages {

    public static void main(String[] args) {
        System.out.println("=== Array Disadvantages - Lecture 5 ===\n");

        // Demonstrate fixed size limitation
        demonstrateFixedSizeProblems();

        // Show performance issues
        demonstratePerformanceIssues();

        // Demonstrate memory management issues
        demonstrateMemoryIssues();

        // Show type safety limitations
        demonstrateTypeSafetyIssues();

        // Compare with ArrayList
        demonstrateArrayListComparison();

        // Show when to use arrays vs alternatives
        demonstrateWhenToUseWhat();
    }

    private static void demonstrateFixedSizeProblems() {
        System.out.println("--- Fixed Size Limitations ---");

        // Problem 1: Cannot change size after creation
        int[] scores = new int[3];
        scores[0] = 85;
        scores[1] = 92;
        scores[2] = 78;

        System.out.println("Initial scores: " + Arrays.toString(scores));
        System.out.println("Array length: " + scores.length);

        // What if we need to add a fourth score?
        // scores[3] = 88; // This would throw ArrayIndexOutOfBoundsException!

        System.out.println("Problem: Cannot add fourth score without creating new array");

        // We have to create a new array
        int[] newScores = new int[4];
        System.arraycopy(scores, 0, newScores, 0, scores.length);
        newScores[3] = 88;

        System.out.println("New array with fourth score: " + Arrays.toString(newScores));
        System.out.println("This required creating entirely new array and copying elements!");

        // Problem 2: Wasted memory with oversized arrays
        String[] names = new String[100];  // We might only use 10 slots
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        // 97 slots are wasted!

        System.out.println("\nMemory waste example:");
        System.out.println("Created array for 100 names, only using 3: " +
                         Arrays.toString(Arrays.copyOf(names, 5)));
        System.out.println("97 slots wasted memory!");

        // Problem 3: Cannot shrink arrays
        System.out.println("\nCannot shrink arrays:");
        System.out.println("If we want to remove elements, we need new smaller array");

        System.out.println();
    }

    private static void demonstratePerformanceIssues() {
        System.out.println("--- Performance Issues ---");

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Problem 1: Inserting at beginning is expensive
        System.out.println("\nInserting at beginning - O(n) operation:");
        long startTime = System.nanoTime();
        int[] withInsertedElement = insertAtBeginning(numbers, 5);
        long endTime = System.nanoTime();

        System.out.println("After inserting 5 at beginning: " + Arrays.toString(withInsertedElement));
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Had to shift ALL existing elements!");

        // Problem 2: Removing elements requires shifting
        System.out.println("\nRemoving element - O(n) operation:");
        startTime = System.nanoTime();
        int[] afterRemoval = removeElementAtIndex(numbers, 2);
        endTime = System.nanoTime();

        System.out.println("After removing element at index 2: " + Arrays.toString(afterRemoval));
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Had to shift elements to fill the gap!");

        // Demonstrate with larger array
        System.out.println("\nPerformance with larger array:");
        int[] largeArray = new int[10000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }

        startTime = System.nanoTime();
        int[] newLargeArray = insertAtBeginning(largeArray, -1);
        endTime = System.nanoTime();

        System.out.println("Inserting at beginning of 10,000 element array took: " +
                         (endTime - startTime) + " nanoseconds");
        System.out.println("This is expensive because we copy 10,000 elements!");

        System.out.println();
    }

    private static void demonstrateMemoryIssues() {
        System.out.println("--- Memory Management Issues ---");

        // Problem 1: All-or-nothing memory allocation
        System.out.println("Memory allocation issues:");

        try {
            // This might fail if we don't have enough contiguous memory
            // int[] hugeArray = new int[Integer.MAX_VALUE]; // Don't actually run this!
            System.out.println("Arrays require contiguous memory blocks");
            System.out.println("Large arrays might fail even if total memory is available");
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: " + e.getMessage());
        }

        // Problem 2: Memory waste with reference types
        String[] stringArray = new String[1000];
        stringArray[0] = "Only one string";
        // 999 null references still consume memory for the reference slots

        System.out.println("\nReference type memory waste:");
        System.out.println("Created String array[1000], using only 1 slot");
        System.out.println("999 null references still consume memory for pointer storage");

        // Problem 3: Cannot easily resize
        System.out.println("\nResize memory issues:");
        int[] small = {1, 2, 3};
        int[] large = new int[small.length * 2];  // Need to double size
        System.arraycopy(small, 0, large, 0, small.length);
        // Now 'small' array becomes eligible for garbage collection
        // But we temporarily used memory for both arrays during copying

        System.out.println("Resizing requires temporary double memory usage");
        System.out.println("Original array: " + Arrays.toString(small));
        System.out.println("Doubled size: " + Arrays.toString(large));

        System.out.println();
    }

    private static void demonstrateTypeSafetyIssues() {
        System.out.println("--- Type Safety Limitations ---");

        // Problem 1: Arrays are covariant (can lead to runtime errors)
        System.out.println("Array covariance issues:");

        Object[] objects = new String[3];  // This is allowed!
        objects[0] = "Hello";  // OK
        objects[1] = "World";  // OK

        try {
            objects[2] = 42;  // This compiles but throws runtime exception!
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException: " + e.getMessage());
            System.out.println("Tried to store Integer in String array - caught at runtime!");
        }

        // Problem 2: No generic type parameters
        System.out.println("\nNo generics support:");
        // String[] stringArray = new String<String>[5];  // This doesn't exist!
        System.out.println("Arrays don't support generic type parameters");
        System.out.println("Cannot have Array<T> like List<T>");

        // Problem 3: Primitive vs Object array confusion
        int[] primitiveInts = {1, 2, 3};
        Integer[] objectInts = {1, 2, 3};

        System.out.println("\nPrimitive vs Object array issues:");
        System.out.println("int[] and Integer[] are completely different types");
        System.out.println("Cannot easily convert between them");
        System.out.println("Arrays.asList(primitiveInts) doesn't work as expected");

        // This creates a List<int[]> not List<Integer>!
        List<?> listFromPrimitiveArray = Arrays.asList(primitiveInts);
        System.out.println("Arrays.asList(int[]) creates: " + listFromPrimitiveArray.getClass());

        // This works correctly
        List<Integer> listFromObjectArray = Arrays.asList(objectInts);
        System.out.println("Arrays.asList(Integer[]) creates: " + listFromObjectArray.getClass());

        System.out.println();
    }

    private static void demonstrateArrayListComparison() {
        System.out.println("--- Array vs ArrayList Comparison ---");

        // Arrays - Fixed size, manual management
        System.out.println("Arrays approach:");
        String[] arrayNames = new String[3];
        arrayNames[0] = "Alice";
        arrayNames[1] = "Bob";
        arrayNames[2] = "Charlie";
        System.out.println("Array: " + Arrays.toString(arrayNames));

        // To add element, need new array
        String[] newArray = new String[4];
        System.arraycopy(arrayNames, 0, newArray, 0, arrayNames.length);
        newArray[3] = "Diana";
        System.out.println("After 'adding' Diana: " + Arrays.toString(newArray));

        System.out.println("\nArrayList approach:");
        List<String> listNames = new ArrayList<>();
        listNames.add("Alice");
        listNames.add("Bob");
        listNames.add("Charlie");
        System.out.println("ArrayList: " + listNames);

        // Easy to add element
        listNames.add("Diana");
        System.out.println("After adding Diana: " + listNames);

        // Easy to remove
        listNames.remove("Bob");
        System.out.println("After removing Bob: " + listNames);

        // Easy to insert at any position
        listNames.add(1, "Eve");
        System.out.println("After inserting Eve at index 1: " + listNames);

        System.out.println("\nPerformance comparison:");

        // Array approach for multiple additions
        long startTime = System.nanoTime();
        int[] intArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < 1000; i++) {
            intArray = addElementAtEnd(intArray, i);
        }
        long arrayTime = System.nanoTime() - startTime;

        // ArrayList approach
        startTime = System.nanoTime();
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < 1000; i++) {
            intList.add(i);
        }
        long listTime = System.nanoTime() - startTime;

        System.out.println("Adding 1000 elements:");
        System.out.println("Array approach: " + arrayTime + " nanoseconds");
        System.out.println("ArrayList approach: " + listTime + " nanoseconds");
        System.out.println("ArrayList is " + (arrayTime / listTime) + "x faster!");

        System.out.println();
    }

    private static void demonstrateWhenToUseWhat() {
        System.out.println("--- When to Use Arrays vs Alternatives ---");

        System.out.println("USE ARRAYS WHEN:");
        System.out.println("✓ Size is known and fixed at compile time");
        System.out.println("✓ Performance is critical (arrays have less overhead)");
        System.out.println("✓ Working with primitive types extensively");
        System.out.println("✓ Interfacing with legacy code or APIs that require arrays");
        System.out.println("✓ Memory usage needs to be minimized");
        System.out.println("✓ Multi-dimensional data structures (matrices)");

        System.out.println("\nExample - Fixed size configuration:");
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday",
                           "Friday", "Saturday", "Sunday"};
        System.out.println("Days of week (fixed): " + Arrays.toString(weekDays));

        System.out.println("\nUSE ARRAYLIST WHEN:");
        System.out.println("✓ Size varies at runtime");
        System.out.println("✓ Frequently adding/removing elements");
        System.out.println("✓ Need type safety with generics");
        System.out.println("✓ Want built-in utility methods");
        System.out.println("✓ Code readability and maintainability is important");
        System.out.println("✓ Integration with Java Collections Framework");

        System.out.println("\nExample - Dynamic shopping cart:");
        List<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("Milk");
        shoppingCart.add("Bread");
        shoppingCart.add("Eggs");
        System.out.println("Shopping cart (dynamic): " + shoppingCart);

        // Easy to modify
        shoppingCart.remove("Bread");
        shoppingCart.add("Butter");
        System.out.println("Updated cart: " + shoppingCart);

        System.out.println("\nOTHER ALTERNATIVES:");
        System.out.println("• LinkedList - For frequent insertions/deletions in middle");
        System.out.println("• Vector - Thread-safe ArrayList (legacy)");
        System.out.println("• Primitive collections (e.g., TIntArrayList) - For performance with primitives");

        System.out.println("\nSUMMARY:");
        System.out.println("Arrays: Low-level, fast, fixed-size");
        System.out.println("ArrayList: High-level, flexible, dynamic");
        System.out.println("Choose based on your specific requirements!");

        System.out.println();
    }

    // Helper methods (same inefficient array operations)
    private static int[] insertAtBeginning(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = element;
        System.arraycopy(array, 0, newArray, 1, array.length);
        return newArray;
    }

    private static int[] removeElementAtIndex(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }

    private static int[] addElementAtEnd(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = element;
        return newArray;
    }
}
