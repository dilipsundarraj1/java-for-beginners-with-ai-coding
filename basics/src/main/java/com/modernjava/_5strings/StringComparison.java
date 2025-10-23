package com.modernjava._5strings;

/**
 * String Comparison - Different ways to compare strings
 *
 * Key Concepts:
 * - equals() vs == operator
 * - Case-sensitive vs case-insensitive comparison
 * - Lexicographic comparison with compareTo()
 */
public class StringComparison {

    public static void main(String[] args) {
        System.out.println("=== String Comparison ===");

        // 1. Equality Comparison
        demonstrateEquality();

        // 2. Case-insensitive Comparison
        demonstrateCaseInsensitiveComparison();

        // 3. Null-safe Comparison
        demonstrateNullSafeComparison();

        // 4. Lexicographic Comparison
        demonstrateLexicographicComparison();
    }

    private static void demonstrateEquality() {
        System.out.println("\n--- Equality Comparison ---");

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "JAVA";

        // Reference comparison with ==
        System.out.println("str1 == str2: " + (str1 == str2));  // true (same reference)
        System.out.println("str1 == str3: " + (str1 == str3));  // false (different reference)

        // Content comparison with equals()
        System.out.println("str1.equals(str2): " + str1.equals(str2));  // true
        System.out.println("str1.equals(str3): " + str1.equals(str3));  // true
        System.out.println("str1.equals(str4): " + str1.equals(str4));  // false

        // Best practice: Use string literal first to avoid NullPointerException
        System.out.println("\"Java\".equals(str1): " + "Java".equals(str1));  // true
    }

    private static void demonstrateCaseInsensitiveComparison() {
        System.out.println("\n--- Case-insensitive Comparison ---");

        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "java";
        String str4 = "JaVa";
        System.out.println(str1.equalsIgnoreCase(str2));  // true

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);


        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));  // true
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4));  // true
    }



    private static void demonstrateNullSafeComparison() {
        System.out.println("\n--- Null-safe Comparison ---");

        String str1 = "Java";
        String str2 = null;
        String str3 = null;

        // Safe way to compare with potential null values
        System.out.println("Using Objects.equals():");
        System.out.println("Objects.equals(str1, \"Java\"): " + java.util.Objects.equals(str1, "Java"));  // true
        System.out.println("Objects.equals(str1, str2): " + java.util.Objects.equals(str1, str2));  // false
        System.out.println("Objects.equals(str2, str3): " + java.util.Objects.equals(str2, str3));  // true

        // Using string literal first (recommended practice)
        System.out.println("\"Java\".equals(str1): " + "Java".equals(str1));  // true
        System.out.println("\"Java\".equals(str2): " + "Java".equals(str2));  // false (no NPE)

        // This would throw NullPointerException:
        // System.out.println(str2.equals("Java"));  // Don't do this!
    }

    private static void demonstrateLexicographicComparison() {
        System.out.println("\n--- Lexicographic Comparison (compareTo) ---");

        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";
        String str4 = "apple";
        String str5 = "Zebra";

        System.out.println(str1.compareTo(str2)); // Negative
        System.out.println(str2.compareTo(str1)); // Positive
        System.out.println(str1.compareTo("Apple")); // 0


        // compareTo() returns:
        // - negative value if first string is lexicographically less than second
        // - zero if strings are equal
        // - positive value if first string is lexicographically greater than second

        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));  // negative (Apple < Banana)
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));  // 0 (Apple == Apple)
        System.out.println("str2.compareTo(str1): " + str2.compareTo(str1));  // positive (Banana > Apple)
        System.out.println("str1.compareTo(str5): " + str1.compareTo(str5));  // negative (Apple < Zebra)

        // Case-sensitive comparison
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));  // negative (A < a in ASCII)

        // Case-insensitive lexicographic comparison
        System.out.println("str1.compareToIgnoreCase(str4): " + str1.compareToIgnoreCase(str4));  // 0

        // Practical example: Sorting demonstration
        System.out.println("\n--- Sorting Order Demonstration ---");
        String[] fruits = {"Banana", "Apple", "Cherry", "apple", "Zebra"};

        System.out.println("Original array:");
        printArray(fruits);

        // Manual sorting demonstration using compareTo
        System.out.println("\nLexicographic order (case-sensitive):");
        for (String fruit : fruits) {
            for (String other : fruits) {
                if (!fruit.equals(other)) {
                    int comparison = fruit.compareTo(other);
                    String relation = comparison < 0 ? " < " : (comparison > 0 ? " > " : " == ");
                    System.out.println(fruit + relation + other + " (" + comparison + ")");
                }
            }
        }

        // Demonstrate practical usage
        System.out.println("\n--- Practical Usage Examples ---");
        String[] names = {"Alice", "Bob", "alice", "ALICE"};

        System.out.println("Alphabetical ordering (case-sensitive):");
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                int result = names[i].compareTo(names[j]);
                if (result < 0) {
                    System.out.println(names[i] + " comes before " + names[j]);
                } else if (result > 0) {
                    System.out.println(names[i] + " comes after " + names[j]);
                } else {
                    System.out.println(names[i] + " is same as " + names[j]);
                }
            }
        }
    }

    // Helper method to print array
    private static void printArray(String[] array) {
        for (String item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
