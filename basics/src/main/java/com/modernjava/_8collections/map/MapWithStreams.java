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

    public static void main(String[] args) {
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
        Map<String, Integer> fruitLengths = fruits.stream()
            .collect(Collectors.toMap(
                fruit -> fruit,           // key mapper
                fruit -> fruit.length()   // value mapper
            ));

        System.out.println("Fruit lengths: " + fruitLengths);

        // Create a map where key is the length and value is the fruit
        Map<Integer, String> lengthToFruit = fruits.stream()
            .collect(Collectors.toMap(
                String::length,    // key mapper (method reference)
                Function.identity() // value mapper (the fruit itself)
            ));

        System.out.println("Length to fruit: " + lengthToFruit);

        // Create a map with uppercase keys
        Map<String, String> uppercaseFruits = fruits.stream()
            .collect(Collectors.toMap(
                String::toUpperCase,
                Function.identity()
            ));

        System.out.println("Uppercase fruits: " + uppercaseFruits);
        System.out.println();
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
        Map<String, Integer> highPerformers = studentGrades.entrySet().stream()
            .filter(entry -> entry.getValue() >= 90)
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
            ));

        System.out.println("High performers (>= 90): " + highPerformers);

        // Filter students whose names start with specific letter
        Map<String, Integer> namesStartingWithA = studentGrades.entrySet().stream()
            .filter(entry -> entry.getKey().startsWith("A"))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
            ));

        System.out.println("Names starting with 'A': " + namesStartingWithA);

        // Filter and transform in one operation
        Map<String, String> gradeCategories = studentGrades.entrySet().stream()
            .filter(entry -> entry.getValue() >= 85)
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> entry.getValue() >= 90 ? "Excellent" : "Good"
            ));

        System.out.println("Grade categories (85+): " + gradeCategories);
        System.out.println();
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
        Map<String, Double> discountedPrices = prices.entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> entry.getValue() * 0.9
            ));

        System.out.println("Discounted prices (10% off): " + discountedPrices);

        // Transform keys to uppercase and round prices
        Map<String, Integer> roundedPrices = prices.entrySet().stream()
            .collect(Collectors.toMap(
                entry -> entry.getKey().toUpperCase(),
                entry -> (int) Math.round(entry.getValue())
            ));

        System.out.println("Uppercase keys with rounded prices: " + roundedPrices);

        // Create a new map with price categories
        Map<String, String> priceCategories = prices.entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> {
                    double price = entry.getValue();
                    if (price < 300) return "Budget";
                    else if (price < 700) return "Mid-range";
                    else return "Premium";
                }
            ));

        System.out.println("Price categories: " + priceCategories);
        System.out.println();
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
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Employees by department:");
        employeesByDepartment.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList()));
        });

        // Group and count employees by department
        Map<String, Long> employeeCountByDepartment = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.counting()
            ));

        System.out.println("\nEmployee count by department: " + employeeCountByDepartment);

        // Group employees by salary range
        Map<String, List<String>> employeesBySalaryRange = employees.stream()
            .collect(Collectors.groupingBy(
                emp -> emp.getSalary() >= 80000 ? "High" : "Standard",
                Collectors.mapping(Employee::getName, Collectors.toList())
            ));

        System.out.println("Employees by salary range: " + employeesBySalaryRange);

        // Average salary by department
        Map<String, Double> avgSalaryByDepartment = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        System.out.println("Average salary by department: " + avgSalaryByDepartment);
        System.out.println();
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
        Map<String, Double> averageScores = subjectScores.entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> entry.getValue().stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0)
            ));

        System.out.println("Average scores by subject: " + averageScores);

        // Find the subject with highest average
        Optional<Map.Entry<String, Double>> topSubject = averageScores.entrySet().stream()
            .max(Map.Entry.comparingByValue());

        topSubject.ifPresent(entry ->
            System.out.println("Top performing subject: " + entry.getKey() +
                             " with average " + String.format("%.2f", entry.getValue())));

        // Create a summary map with statistics
        Map<String, String> subjectSummary = subjectScores.entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> {
                    List<Integer> scores = entry.getValue();
                    int min = scores.stream().mapToInt(i -> i).min().orElse(0);
                    int max = scores.stream().mapToInt(i -> i).max().orElse(0);
                    double avg = scores.stream().mapToInt(i -> i).average().orElse(0);
                    return String.format("Min: %d, Max: %d, Avg: %.1f", min, max, avg);
                }
            ));

        System.out.println("\nSubject summary:");
        subjectSummary.forEach((subject, summary) ->
            System.out.println(subject + " - " + summary));

        System.out.println();
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
