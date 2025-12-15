package com.modernjava._9functionalprogramming;

import java.util.List;

/**
 * LambdaVariables - Lambdas and Local Variables: Effectively Final
 * <p>
 * This class demonstrates the concept of "effectively final" variables in lambda expressions.
 * When lambdas access local variables from their enclosing scope, those variables must be
 * either explicitly final or "effectively final" (never modified after initialization).
 * <p>
 * Key Concepts:
 * - Lambda expressions can access local variables from their enclosing scope
 * - These variables must be final or effectively final
 * - Effectively final means the variable is never reassigned after initialization
 * - This restriction exists because lambdas may be executed in different threads
 */
public class _7LambdaVariables {

    // Simple mutable class for demonstration
    static class Counter {
        int value = 0;

        void increment() {
            value++;
        }

        @Override
        public String toString() {
            return "Counter: " + value;
        }
    }

    static void main(String[] args) {
        System.out.println("=== Lambdas and Local Variables: Effectively Final ===\n");

        // Example 1: Demonstrating effectively final variables
        demonstrateEffectivelyFinal();

        // Example 2: Modifying object properties inside lambda
        demonstrateObjectModification();
    }

    /**
     * Example 1: Effectively Final Variables - Valid Usage
     * <p>
     * Demonstrates how lambdas can access local variables that are effectively final.
     * These variables are initialized once and never modified, making them safe
     * for lambda expressions to capture.
     */
    private static void demonstrateEffectivelyFinal() {
        System.out.println("Example 1: Effectively Final Variables (Valid Usage)");
        System.out.println("Variables that are never reassigned after initialization can be used in lambdas\n");

        // Effectively final variable - initialized once, never modified
        String prefix = "Item: ";  // This is effectively final

        List<String> items = List.of("Apple", "Banana", "Cherry");
        int count = 0; // This is also effectively final

        System.out.println("Using effectively final 'prefix' variable in lambda:");
        items.forEach(item -> {
            // Lambda can access 'prefix' because it's effectively final
            System.out.println("  " + prefix + item);
            //count++; // This would cause a compilation error if uncommented
        });

        // Explicitly final variable also works
        final String suffix = " (processed)";
        System.out.println("\nUsing explicitly final 'suffix' variable:");
        items.forEach(item -> System.out.println("  " + item + suffix));

        System.out.println("\n✅ All variables above are effectively final - lambdas compile successfully!");
        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Example 2: Modifying Object Properties Inside Lambda
     * <p>
     * Demonstrates that while the object reference must be effectively final,
     * you can modify the object's properties inside a lambda expression.
     */
    private static void demonstrateObjectModification() {
        System.out.println("Example 2: Modifying Object Properties Inside Lambda");
        System.out.println("Object reference is effectively final, but object properties can be modified\n");

        // Create a mutable object - the reference is effectively final
        Counter counter = new Counter();  // Reference 'counter' is effectively final

        List<String> items = List.of("Apple", "Banana", "Cherry");

        System.out.println("Before processing: " + counter);

        System.out.println("\nProcessing items and incrementing counter inside lambda:");
        items.forEach(item -> {
            // We can modify the object's state even though 'counter' reference is effectively final

            counter.increment();
            //counter = new Counter(); // Uncommenting this line would cause a compilation error
            System.out.println("  Processed: " + item + " | " + counter);
        });

        System.out.println("\nFinal state: " + counter);

        System.out.println("\n📝 Key Takeaway:");
        System.out.println("   • Object references must be effectively final");
        System.out.println("   • But object properties/state can be modified inside lambdas");
        System.out.println("   • The restriction applies to variable reassignment, not object mutation");
        System.out.println("─────────────────────────────────────────────────────────\n");
    }
}
