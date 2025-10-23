package com.modernjava._5strings;

/**
 * String Pool - Deep dive into Java String Pool mechanism
 *
 * Key Concepts:
 * - String Pool (String Constant Pool) location and purpose
 * - String literals vs new String() objects
 * - Memory optimization with string pooling
 * - intern() method and its usage
 * - Performance implications
 * - Best practices for string creation
 */
public class StringPool {

    public static void main(String[] args) {
        System.out.println("=== Java String Pool Deep Dive ===");

        // 1. Basic String Pool Behavior
        demonstrateBasicStringPool();

        // 2. String Pool vs Heap Memory
        demonstrateStringPoolVsHeap();

        // 3. The intern() Method
        demonstrateInternMethod();

        // 5. Advanced String Pool Scenarios
        demonstrateAdvancedScenarios();

        // 6. Best Practices
        demonstrateBestPractices();
    }

    /**
     * Demonstrates basic string pool behavior with literals
     */
    private static void demonstrateBasicStringPool() {
        System.out.println("\n--- Basic String Pool Behavior ---");

        // String literals are stored in the String Pool
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Programming";

        System.out.println("String literals:");
        System.out.println("str1 = \"Java\"");
        System.out.println("str2 = \"Java\"");
        System.out.println("str3 = \"Programming\"");

        // Reference comparison - same object in pool
        System.out.println("\nReference comparison (== operator):");
        System.out.println("str1 == str2: " + (str1 == str2));  // true - same reference
        System.out.println("str1 == str3: " + (str1 == str3));  // false - different strings

        // Content comparison
        System.out.println("\nContent comparison (equals method):");
        System.out.println("str1.equals(str2): " + str1.equals(str2));  // true

        // Memory addresses (for educational purposes)
        System.out.println("\nMemory references:");
        System.out.println("str1 identity hash: " + System.identityHashCode(str1));
        System.out.println("str2 identity hash: " + System.identityHashCode(str2));
        System.out.println("str3 identity hash: " + System.identityHashCode(str3));
    }

    /**
     * Compares string pool vs heap memory allocation
     */
    private static void demonstrateStringPoolVsHeap() {
        System.out.println("\n--- String Pool vs Heap Memory ---");

        // String Pool (literals)
        String poolStr1 = "Hello";
        String poolStr2 = "Hello";

        // Heap (using new keyword)
        String heapStr1 = new String("Hello");
        String heapStr2 = new String("Hello");

        System.out.println("String Pool objects:");
        System.out.println("poolStr1 == poolStr2: " + (poolStr1 == poolStr2));  // true
        System.out.println("poolStr1 identity hash: " + System.identityHashCode(poolStr1));
        System.out.println("poolStr2 identity hash: " + System.identityHashCode(poolStr2));

        System.out.println("\nHeap objects:");
        System.out.println("heapStr1 == heapStr2: " + (heapStr1 == heapStr2));  // false
        System.out.println("heapStr1 identity hash: " + System.identityHashCode(heapStr1));
        System.out.println("heapStr2 identity hash: " + System.identityHashCode(heapStr2));

        System.out.println("\nPool vs Heap comparison:");
        System.out.println("poolStr1 == heapStr1: " + (poolStr1 == heapStr1));  // false
        System.out.println("poolStr1.equals(heapStr1): " + poolStr1.equals(heapStr1));  // true

        // Memory usage demonstration
        System.out.println("\nMemory Usage Analysis:");
        System.out.println("- String literals: 1 object in pool (shared)");
        System.out.println("- new String(): 2 separate objects in heap");
        System.out.println("- Pool objects save memory through sharing");
    }

    /**
     * Demonstrates the intern() method functionality
     */
    private static void demonstrateInternMethod() {
        System.out.println("\n--- The intern() Method ---");

        String str1 = "Java";  // In string pool
        String str2 = new String("Java");  // In heap
        String str3 = str2.intern();  // Moved to pool (returns pool reference)

        System.out.println("Before intern():");
        System.out.println("str1 == str2: " + (str1 == str2));  // false
        System.out.println("str1.equals(str2): " + str1.equals(str2));  // true

        System.out.println("\nAfter intern():");
        System.out.println("str1 == str3: " + (str1 == str3));  // true - same pool reference
        System.out.println("str2 == str3: " + (str2 == str3));  // false - str2 still in heap

        // Demonstrate intern() with runtime strings
        String dynamicStr = new String("Dynamic").toUpperCase();
        String internedStr = dynamicStr.intern();
        String literalStr = "DYNAMIC";

        System.out.println("\nDynamic string interning:");
        System.out.println("dynamicStr: " + dynamicStr);
        System.out.println("literalStr == dynamicStr: " + (literalStr == dynamicStr));  // false
        System.out.println("literalStr == internedStr: " + (literalStr == internedStr));  // true

        // When to use intern()
        System.out.println("\nWhen to use intern():");
        System.out.println("- When dealing with many duplicate strings from external sources");
        System.out.println("- Database results, file parsing, network data");
        System.out.println("- Be cautious: intern() can cause memory leaks if overused");
    }


    /**
     * Shows performance impact of string pool vs heap allocation
     */
    private static void demonstratePerformanceImpact() {
        System.out.println("\n--- Performance Impact ---");

        int iterations = 100000;
        String testString = "PerformanceTest";

        // Test 1: String literals
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            String s = "PerformanceTest";  // Always returns same pool reference
        }
        long literalTime = System.nanoTime() - startTime;

        // Test 2: new String()
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            String s = new String("PerformanceTest");  // Creates new object each time
        }
        long newStringTime = System.nanoTime() - startTime;

        System.out.printf("String literals time: %,d nanoseconds%n", literalTime);
        System.out.printf("new String() time: %,d nanoseconds%n", newStringTime);
        System.out.printf("Performance difference: %.2fx slower%n",
                         (double) newStringTime / literalTime);
    }

    /**
     * Advanced string pool scenarios and edge cases
     */
    private static void demonstrateAdvancedScenarios() {
        System.out.println("\n--- Advanced String Pool Scenarios ---");

        // Compile-time string concatenation
        String str1 = "Hello" + " " + "World";  // Compiled to "Hello World"
        String str2 = "Hello World";
        System.out.println("Compile-time concatenation:");
        System.out.println("str1 == str2: " + (str1 == str2));  // true

        // Runtime string concatenation
        String hello = "Hello";
        String str3 = hello + " World";  // Runtime concatenation
        System.out.println("Runtime concatenation:");
        System.out.println("str2 == str3: " + (str2 == str3));  // false
        System.out.println("str2.equals(str3): " + str2.equals(str3));  // true

        // String concatenation and string pool
        String str4 = new String("Hello World");  // Creates new string in heap
        System.out.println("New String() result:");
        System.out.println("str2 == str4: " + (str2 == str4));  // false
        System.out.println("str2 == str4.intern(): " + (str2 == str4.intern()));  // true

        // Empty string behavior
        String empty1 = "";
        String empty2 = new String("");
        String empty3 = empty2.intern();
        System.out.println("Empty string behavior:");
        System.out.println("empty1 == empty3: " + (empty1 == empty3));  // true
    }

    /**
     * Best practices for working with strings and string pool
     */
    private static void demonstrateBestPractices() {
        System.out.println("\n--- String Pool Best Practices ---");

        System.out.println("✅ DO:");
        System.out.println("1. Use string literals for constants: String name = \"Java\";");
        System.out.println("2. Use intern() for strings from external sources when many duplicates expected");
        System.out.println("3. Compare strings with equals(), not ==");
        System.out.println("4. Declare string constants as static final");

        System.out.println("\n❌ DON'T:");
        System.out.println("1. Use new String() unnecessarily: new String(\"text\")");
        System.out.println("2. Overuse intern() - can cause memory leaks");
        System.out.println("3. Use == for string comparison (unless intentionally comparing references)");

        // Example of good constant declaration
        demonstrateStringConstants();
    }

    /**
     * Demonstrates proper string constant declaration
     */
    private static void demonstrateStringConstants() {
        System.out.println("\n--- String Constants Best Practice ---");

        // Good practice - constants in string pool
        final String ERROR_MESSAGE = "Operation failed";
        final String SUCCESS_MESSAGE = "Operation completed";

        // These will reference the same pool objects
        String result1 = ERROR_MESSAGE;
        String result2 = "Operation failed";

        System.out.println("String constants:");
        System.out.println("ERROR_MESSAGE == result2: " + (ERROR_MESSAGE == result2));  // true

        // Memory efficient status checking
        String status = getOperationStatus();
        if (status == ERROR_MESSAGE) {  // Safe reference comparison
            System.out.println("Reference comparison works with pool strings");
        }
    }

    /**
     * Helper method for demonstration
     */
    private static String getOperationStatus() {
        return "Operation failed";  // Returns string from pool
    }
}
