package com.modernjava._6arrays;

/**
 * StringArrays - Lecture 2
 *
 * This class demonstrates working with arrays of String objects:
 * - Creating and initializing String arrays
 * - String array operations
 * - Common patterns and use cases
 * - Differences between primitive and reference type arrays
 *
 * @author Dilip
 */
public class StringArrays {

    public static void main(String[] args) {
        System.out.println("=== String Arrays - Lecture 2 ===\n");

        // Demonstrate String array creation and initialization
        demonstrateStringArrayCreation();

        // Show String array operations
        demonstrateStringArrayOperations();

        // Compare with primitive arrays
        demonstrateReferenceTypeDifferences();

        // Show practical examples
        demonstratePracticalExamples();
    }

    private static void demonstrateStringArrayCreation() {
        System.out.println("--- Creating String Arrays ---");

        // Method 1: Create empty array then assign values
        String[] names = new String[4];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        names[3] = "Diana";

        // Method 2: Initialize with values
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Purple"};

        // Method 3: Using new keyword with values
        String[] fruits = new String[]{"Apple", "Banana", "Orange", "Grape"};

        // Method 4: Mixed initialization
        String[] cities = new String[3];
        cities[0] = "New York";
        cities[1] = "London";
        cities[2] = "Tokyo";

        System.out.println("Names array:");
        printStringArray(names);

        System.out.println("Colors array:");
        printStringArray(colors);

        System.out.println("Fruits array:");
        printStringArray(fruits);

        System.out.println("Cities array:");
        printStringArray(cities);

        System.out.println();
    }

    private static void demonstrateStringArrayOperations() {
        System.out.println("--- String Array Operations ---");

        String[] languages = {"Java", "Python", "JavaScript", "C++", "Go"};

        System.out.println("Original languages:");
        printStringArray(languages);

        // Length and accessing elements
        System.out.println("\nArray length: " + languages.length);
        System.out.println("First language: " + languages[0]);
        System.out.println("Last language: " + languages[languages.length - 1]);

        // Modifying elements
        languages[2] = "TypeScript";  // Replace JavaScript with TypeScript
        System.out.println("\nAfter replacing JavaScript with TypeScript:");
        printStringArray(languages);

        // String operations on array elements
        System.out.println("\nString operations on array elements:");
        for (int i = 0; i < languages.length; i++) {
            System.out.println("Language " + (i + 1) + ": " + languages[i] +
                             " (length: " + languages[i].length() +
                             ", uppercase: " + languages[i].toUpperCase() + ")");
        }

        System.out.println();
    }

    private static void demonstrateReferenceTypeDifferences() {
        System.out.println("--- Reference Type vs Primitive Array Differences ---");

        // Default values comparison
        int[] numbers = new int[3];
        String[] texts = new String[3];

        System.out.println("Primitive array default values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("\nString array default values:");
        for (int i = 0; i < texts.length; i++) {
            System.out.println("texts[" + i + "] = " + texts[i]);  // null
        }

        // Null checking is important with String arrays
        System.out.println("\nSafe String array processing:");
        texts[0] = "Hello";
        texts[1] = null;  // Explicitly set to null
        texts[2] = "World";

        for (int i = 0; i < texts.length; i++) {
            if (texts[i] != null) {
                System.out.println("texts[" + i + "] = \"" + texts[i] +
                                 "\" (length: " + texts[i].length() + ")");
            } else {
                System.out.println("texts[" + i + "] = null (cannot call methods on null)");
            }
        }

        // String immutability demonstration
        System.out.println("\nString immutability in arrays:");
        String[] words = {"hello", "world"};
        System.out.println("Before modification:");
        printStringArray(words);

        // This creates a new String object, doesn't modify the existing one
        words[0] = words[0].toUpperCase();
        System.out.println("After words[0].toUpperCase():");
        printStringArray(words);

        System.out.println();
    }

    private static void demonstratePracticalExamples() {
        System.out.println("--- Practical String Array Examples ---");

        // Example 1: Command line arguments simulation
        String[] args = {"file1.txt", "file2.txt", "--verbose", "--output=result.txt"};
        processCommandLineArgs(args);

        // Example 2: Student names and grades
        String[] students = {"John Doe", "Jane Smith", "Mike Johnson", "Sarah Wilson"};
        int[] grades = {85, 92, 78, 96};
        displayStudentGrades(students, grades);

        // Example 3: String array searching
        String[] inventory = {"laptop", "mouse", "keyboard", "monitor", "speakers"};
        searchInventory(inventory, "keyboard");
        searchInventory(inventory, "webcam");

        // Example 4: String array manipulation
        demonstrateStringArrayManipulation();

        System.out.println();
    }

    private static void processCommandLineArgs(String[] args) {
        System.out.println("\n--- Processing Command Line Arguments ---");
        System.out.println("Number of arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("--")) {
                System.out.println("Option: " + args[i]);
            } else {
                System.out.println("File: " + args[i]);
            }
        }
    }

    private static void displayStudentGrades(String[] students, int[] grades) {
        System.out.println("\n--- Student Grade Report ---");

        for (int i = 0; i < students.length; i++) {
            String grade = (grades[i] >= 90) ? "A" :
                          (grades[i] >= 80) ? "B" :
                          (grades[i] >= 70) ? "C" :
                          (grades[i] >= 60) ? "D" : "F";
            System.out.println(students[i] + ": " + grades[i] + " (" + grade + ")");
        }
    }

    private static void searchInventory(String[] inventory, String item) {
        System.out.println("\n--- Searching for: " + item + " ---");
        boolean found = false;

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].equals(item)) {
                System.out.println("Found '" + item + "' at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("'" + item + "' not found in inventory");
        }
    }

    private static void demonstrateStringArrayManipulation() {
        System.out.println("\n--- String Array Manipulation ---");

        String[] sentence = {"java", "is", "a", "powerful", "programming", "language"};

        System.out.println("Original sentence:");
        printStringArray(sentence);

        // Capitalize first letter of each word
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] != null && sentence[i].length() > 0) {
                sentence[i] = sentence[i].substring(0, 1).toUpperCase() +
                             sentence[i].substring(1);
            }
        }

        System.out.println("Capitalized sentence:");
        printStringArray(sentence);

        // Join all words into a single string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sentence.length; i++) {
            result.append(sentence[i]);
            if (i < sentence.length - 1) {
                result.append(" ");
            }
        }

        System.out.println("Joined sentence: " + result.toString());
    }

    // Helper method to print String arrays
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
