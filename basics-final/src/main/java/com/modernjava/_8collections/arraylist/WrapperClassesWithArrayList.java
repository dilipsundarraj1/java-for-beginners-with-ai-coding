package com.modernjava._8collections.arraylist;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * WrapperClassesWithArrayList - Introduction to Wrapper Classes and ArrayList
 * Demonstrates how to store primitive values in collections using wrapper classes
 * and covers autoboxing/unboxing concepts with practical examples
 */
public class WrapperClassesWithArrayList {

    public static void main(String[] args) {
        System.out.println("=== Wrapper Classes with ArrayList ===\n");

        // 1. ArrayList with Integer wrapper class
        demonstrateIntegerArrayList();

        // 2. ArrayList operations with wrapper classes
        demonstrateWrapperArrayListOperations();

        // 3. Different wrapper types in ArrayLists
        demonstrateDifferentWrapperTypes();

        // 4. BigDecimal example for precise monetary calculations
        // BigDecimal example for precise monetary calculations
        demonstrateBigDecimalArrayList();

        // 5. Performance and memory considerations
        demonstratePerformanceConsiderations();
    }


    private static void demonstrateIntegerArrayList() {
        System.out.println("2. ArrayList with Integer Wrapper Class:");

        // Cannot create ArrayList of primitives
        // List<int> numbers = new ArrayList<>();  // COMPILATION ERROR!

        // Must use wrapper class
        List<Integer> numbers = new ArrayList<>();

        System.out.println("   Created ArrayList<Integer> - stores Integer objects");

        // Adding integers (autoboxing happens automatically)
        numbers.add(Integer.valueOf("10"));    // int 10 automatically converted to Integer
        numbers.add(20);    // Autoboxing
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("   Added integers: " + numbers);
        System.out.println("   List size: " + numbers.size());

        var integer = Integer.parseInt("10");
        int primitiveInt = integer; // unboxing

        // Accessing elements (unboxing happens automatically)
        int firstNumber = numbers.get(0);  // Integer automatically converted to int
        System.out.println("   First number: " + firstNumber + " (unboxed from Integer)");

        // Modifying elements
        numbers.set(1, 25);  // Autoboxing: int 25 → Integer
        System.out.println("   After modification: " + numbers);

        // Removing elements
        numbers.remove(0);  // Removes by index
        System.out.println("   After removing first element: " + numbers);

        // Be careful with remove() method
        numbers.add(2);  // Add number 2
        System.out.println("   Added 2: " + numbers);

        numbers.remove(Integer.valueOf(2));  // Remove Integer object 2
        System.out.println("   Removed Integer 2: " + numbers);
        // numbers.remove(2);  // This would remove element at index 2!

        System.out.println();
    }


    private static void demonstrateWrapperArrayListOperations() {
        System.out.println("4. ArrayList Operations with Wrapper Classes:");

        List<Integer> scores = new ArrayList<>();

        // Adding test scores
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(95);
        scores.add(88);

        System.out.println("   Test scores: " + scores);

        // Finding maximum score
        int maxScore = findMaximum(scores);
        System.out.println("   Maximum score: " + maxScore);

        // Finding minimum score
        int minScore = findMinimum(scores);
        System.out.println("   Minimum score: " + minScore);



        System.out.println();
    }

    private static void demonstrateDifferentWrapperTypes() {
        System.out.println("5. Different Wrapper Types in ArrayLists:");

        // Double ArrayList for prices
        List<Double> prices = new ArrayList<>();
        prices.add(19.99);
        prices.add(29.50);
        prices.add(15.25);
        prices.add(45.00);

        System.out.println("   Prices (Double): " + prices);
        double totalPrice = calculateTotalPrice(prices);
        System.out.println("   Total price: $" + String.format("%.2f", totalPrice));

        // Boolean ArrayList for feature flags
        List<Boolean> features = new ArrayList<>();
        features.add(true);   // Feature A enabled
        features.add(false);  // Feature B disabled
        features.add(true);   // Feature C enabled
        features.add(true);   // Feature D enabled

        System.out.println("\n   Feature flags (Boolean): " + features);
        int enabledFeatures = countEnabledFeatures(features);
        System.out.println("   Enabled features: " + enabledFeatures + "/" + features.size());

        // Character ArrayList for letters
        List<Character> letters = new ArrayList<>();
        letters.add('J');
        letters.add('a');
        letters.add('v');
        letters.add('a');

        System.out.println("\n   Letters (Character): " + letters);
        String word = buildWordFromLetters(letters);
        System.out.println("   Built word: \"" + word + "\"");

        // Long ArrayList for timestamps
        List<Long> timestamps = new ArrayList<>();
        timestamps.add(System.currentTimeMillis());
        timestamps.add(System.currentTimeMillis() + 1000);
        timestamps.add(System.currentTimeMillis() + 2000);

        System.out.println("\n   Timestamps (Long): " + timestamps);
        System.out.println("   Time differences calculated in practical example");

        System.out.println();
    }

    private static void demonstrateBigDecimalArrayList() {
        System.out.println("=== BigDecimal Precision Example ===\n");

        // Using double
        double d1 = 0.1;
        double d2 = 0.2;
        double doubleSum = d1 + d2;
        System.out.println("Using double:");
        System.out.println("   0.1 + 0.2 = " + doubleSum); // Expecting 0.3, but not exact!

        // Using BigDecimal
        BigDecimal bd1 = new BigDecimal("0.1"); // Always use String constructor for precision
        BigDecimal bd2 = new BigDecimal("0.2");
        BigDecimal bdSum = bd1.add(bd2);

        System.out.println("\nUsing BigDecimal:");
        System.out.println("   0.1 + 0.2 = " + bdSum); // Exactly 0.3
        System.out.println();
    }

    private static void demonstratePerformanceConsiderations() {
        System.out.println("7. Performance and Memory Considerations:");

        System.out.println("   Memory Impact of Wrapper Classes:");
        System.out.println("   - int primitive: 4 bytes");
        System.out.println("   - Integer object: ~16 bytes (object overhead + 4 bytes value)");
        System.out.println("   - ArrayList<Integer> has additional memory overhead per element");

        System.out.println("\n   Performance Tips:");
        System.out.println("   ✓ Use primitive arrays when possible for large datasets");
        System.out.println("   ✓ Be aware of autoboxing/unboxing in tight loops");
        System.out.println("   ✓ Consider specialized collections for primitives (TIntArrayList)");
        System.out.println("   ✓ Watch out for NullPointerException with null wrapper objects");

        // Performance demonstration
        System.out.println("\n   Autoboxing Performance Test:");
        long startTime = System.currentTimeMillis();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);  // Autoboxing happens 100,000 times
        }

        long endTime = System.currentTimeMillis();
        System.out.println("   Time to add 100,000 integers: " + (endTime - startTime) + " ms");
        System.out.println("   (Each add involves creating an Integer object)");

        System.out.println();
    }

    // ===== HELPER METHODS =====

    /**
     * Find maximum value in Integer list
     */
    public static int findMaximum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }

        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {  // Unboxing happens automatically
                max = number;
            }
        }
        return max;
    }

    /**
     * Find minimum value in Integer list
     */
    public static int findMinimum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }

        int min = numbers.get(0);
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    /**
     * Calculate average of Integer list
     */
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0.0;
        }

        long sum = 0;
        for (Integer number : numbers) {
            sum += number;  // Unboxing
        }
        return (double) sum / numbers.size();
    }


    /**
     * Calculate total price from Double list
     */
    public static double calculateTotalPrice(List<Double> prices) {
        double total = 0.0;

        for (Double price : prices) {
            total += price;  // Unboxing
        }

        return total;
    }

    /**
     * Count enabled features from Boolean list
     */
    public static int countEnabledFeatures(List<Boolean> features) {
        int count = 0;

        for (Boolean feature : features) {
            if (feature) {  // Unboxing
                count++;
            }
        }

        return count;
    }

    /**
     * Build word from Character list
     */
    public static String buildWordFromLetters(List<Character> letters) {
        StringBuilder word = new StringBuilder();

        for (Character letter : letters) {
            word.append(letter);  // Unboxing
        }

        return word.toString();
    }


}
