package com.modernjava._8collections.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Map with Streams API - Advanced Map operations using Java Streams
 *
 * This demonstrates how to use Maps with the powerful Streams API
 * for functional programming and data processing.
 */
public class MapWithStreams {

    static void main(String[] args) {
        System.out.println("=== MAP WITH STREAMS API ===\n");

        // Example 1: Creating Maps from Lists using Streams
        createMapsFromStreams();

        // Example 2: Filtering Maps with Streams
        filteringMaps();

        // Example 3: Transforming Maps with Streams
        transformingMaps();

        // Example 4: Grouping data into Maps
        groupingIntoMaps();

        // Example 5: Advanced Map operations with Streams
        advancedMapOperations();
    }

    /**
     * Creating Maps from other collections using Streams
     */
    public static void createMapsFromStreams() {
        System.out.println("1. Creating Maps from Streams:");

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");

        // Create a map where key is the fruit and value is its length
        // Example: "apple" -> 5, "banana" -> 6, etc.

        // Create a map where key is the length and value is the fruit
        // Example: 5 -> "apple", 6 -> "banana", etc.

        // Create a map with uppercase keys
        // Example: "APPLE" -> "apple", "BANANA" -> "banana", etc.
    }

    /**
     * Filtering Maps using Streams
     */
    public static void filteringMaps() {
        System.out.println("2. Filtering Maps:");

        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 87);
        studentGrades.put("Charlie", 92);
        studentGrades.put("David", 78);
        studentGrades.put("Eve", 89);

        System.out.println("Original grades: " + studentGrades);

        // Filter students with grade >= 90
        // Example: Alice-> 90, Charlie -> 92

        // Filter students whose names start with specific letter
        // Example: Names starting with 'A' -> Alice

        // Filter and transform in one operation
        // Create a map of students with grade >= 85 and categorize them
        // as "Excellent" (90+) or "Good" (85-89)
        // Example: Alice -> Excellent, Bob -> Good, Charlie -> Excellent, Eve -> Good
    }

    /**
     * Transforming Maps using Streams
     */
    public static void transformingMaps() {
        System.out.println("3. Transforming Maps:");

        Map<String, Double> prices = new HashMap<>();
        prices.put("laptop", 999.99);
        prices.put("phone", 699.99);
        prices.put("tablet", 399.99);
        prices.put("headphones", 199.99);

        System.out.println("Original prices: " + prices);

        // Apply 10% discount to all prices
        // Example : laptop -> 899.99, phone -> 629.99, etc.


        // Create a new map with price categories
        // "Budget" (<300), "Mid-range" (300-700), "Premium" (>700)
        // Example: laptop -> Premium, phone -> Mid-range, etc.
    }

    /**
     * Grouping data into Maps using Streams
     */
    public static void groupingIntoMaps() {
        System.out.println("4. Grouping into Maps:");

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 95000),
                new Employee("Bob", "Marketing", 65000),
                new Employee("Charlie", "Engineering", 88000),
                new Employee("David", "Sales", 72000),
                new Employee("Eve", "Marketing", 58000),
                new Employee("Frank", "Engineering", 102000)
        );

        // Group employees by department
        // Example: "Engineering" -> [Alice, Charlie, Frank], etc.

        // Group and count employees by department
        // Count of employees in each department
        // Example: "Engineering" -> 3, "Marketing" -> 2, etc.

        // Group employees by salary range
        // "High" (>=80000) and "Standard" (<80000)
        // Example: "High" -> [Alice, Charlie, Frank], "Standard" -> [Bob, David, Eve]

        // Calculate average salary for each department
        // Example: "Engineering" -> 95000.0, "Marketing" -> 61500.0, etc.
    }

    /**
     * Advanced Map operations with Streams
     */
    public static void advancedMapOperations() {
        System.out.println("5. Advanced Map Operations:");

        Map<String, List<Integer>> subjectScores = new HashMap<>();
        subjectScores.put("Math", Arrays.asList(85, 92, 78, 96, 87));
        subjectScores.put("Science", Arrays.asList(88, 94, 82, 91, 89));
        subjectScores.put("English", Arrays.asList(79, 85, 91, 88, 93));

        // Calculate average score for each subject
        // Example: Math -> 87.6, Science -> 88.8, English -> 87.2

        // Find the subject with highest average
        // Example: Science with average 88.8
    }

    // Helper class for grouping examples
    static class Employee {
        private String name;
        private String department;
        private double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return name + "(" + department + ", $" + salary + ")";
        }
    }
}
