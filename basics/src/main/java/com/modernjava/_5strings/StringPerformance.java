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



    public static void main(String[] args) {
        System.out.println("=== String Performance and StringBuilder ===");




        // 1. Performance comparison
        demonstratePerformanceIssue();

        // 2. StringBuilder usage
        demonstrateStringBuilder();

        // 3. StringBuffer vs StringBuilder
        demonstrateStringBuffer();

        // 4. Best practices
        demonstrateBestPractices();
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
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            sb.append("Number ").append(i).append(" ");
        }
        String efficientResult = sb.toString();
        endTime = System.currentTimeMillis();

        System.out.println("StringBuilder time: " + (endTime - startTime) + "ms");
        System.out.println("Results are equal: " + result.equals(efficientResult));
    }

    private static void demonstrateStringBuilder() {
        System.out.println("\n--- StringBuilder Usage ---");

        // Creating StringBuilder
        StringBuilder sb = new StringBuilder();
        System.out.println("Initial capacity: " + sb.capacity());
        System.out.println("Initial length: " + sb.length());

        // Appending different types
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        sb.append(" Number: ");
        sb.append(42);
        sb.append(" Boolean: ");
        sb.append(true);

        System.out.println("After appending: " + sb.toString());
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // Method chaining
        StringBuilder chainedSb = new StringBuilder()
                .append("Method ")
                .append("chaining ")
                .append("is ")
                .append("convenient");
        System.out.println("Method chaining: " + chainedSb.toString());

        // Insert operation
        sb.insert(0, "Prefix: ");
        System.out.println("After insert: " + sb.toString());

        // Delete operation
        sb.delete(0, 8); // Remove "Prefix: "
        System.out.println("After delete: " + sb.toString());

        // Replace operation
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb.toString());

        // Reverse operation
        StringBuilder reverseSb = new StringBuilder("Hello");
        reverseSb.reverse();
        System.out.println("Reversed 'Hello': " + reverseSb.toString());
    }

    private static void demonstrateStringBuffer() {
        System.out.println("\n--- StringBuffer vs StringBuilder ---");

        // StringBuilder (not thread-safe, faster)
        StringBuilder sb = new StringBuilder("StringBuilder");
        sb.append(" is faster");
        System.out.println("StringBuilder: " + sb.toString());

        // StringBuffer (thread-safe, slower)
        StringBuffer sbf = new StringBuffer("StringBuffer");
        sbf.append(" is thread-safe");
        System.out.println("StringBuffer: " + sbf.toString());

        System.out.println("\nKey differences:");
        System.out.println("- StringBuilder: Not synchronized, faster, single-threaded use");
        System.out.println("- StringBuffer: Synchronized, slower, multi-threaded use");
        System.out.println("- For most cases, use StringBuilder");
    }

    private static void demonstrateBestPractices() {
        System.out.println("\n--- Best Practices ---");

        // 1. Use StringBuilder for multiple concatenations
        System.out.println("1. Use StringBuilder for loops:");
        StringBuilder sb = new StringBuilder();
        String[] items = {"Apple", "Banana", "Cherry", "Date"};
        for (String item : items) {
            sb.append(item).append(", ");
        }
        // Remove last comma and space
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        System.out.println("   Result: " + sb.toString());

        // 2. Pre-size StringBuilder if you know approximate size
        System.out.println("\n2. Pre-size StringBuilder:");
        StringBuilder preSized = new StringBuilder(100); // Initial capacity
        System.out.println("   Initial capacity: " + preSized.capacity());

        // 3. Use String.join() for simple joining
        System.out.println("\n3. Use String.join() for simple cases:");
        String joined = String.join(", ", items);
        System.out.println("   Result: " + joined);

        // 4. Null checking
        System.out.println("\n4. Null-safe operations:");
        String nullableString = null;
        StringBuilder safeSb = new StringBuilder();
        safeSb.append(nullableString != null ? nullableString : "default");
        System.out.println("   Safe append: " + safeSb.toString());

        // 5. Building complex strings
        System.out.println("\n5. Building formatted reports:");
        StringBuilder report = new StringBuilder();
        report.append("=== REPORT ===\n");
        report.append(String.format("Date: %tF\n", new java.util.Date()));
        report.append("Items processed: ").append(items.length).append("\n");
        report.append("Status: Complete\n");
        report.append("===============");
        System.out.println(report.toString());
    }
}
