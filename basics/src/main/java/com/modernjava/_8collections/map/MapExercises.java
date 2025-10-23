package com.modernjava._8collections.map;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Map Practice Exercises - Hands-on exercises to master Map concepts
 *
 * This file contains practical exercises that progress from basic to advanced.
 * Try to solve each exercise before looking at the solution.
 */
public class MapExercises {

    public static void main(String[] args) {
        System.out.println("=== MAP PRACTICE EXERCISES ===\n");

        // Run all exercises
        exercise1_BasicMapOperations();
        exercise2_WordFrequency();
        exercise3_StudentGrades();
        exercise4_InventoryManagement();
        exercise5_DataTransformation();
        exercise6_AdvancedGrouping();
    }

    /**
     * Exercise 1: Basic Map Operations
     * Create a map of countries and their populations.
     * Perform basic operations like add, update, remove, and search.
     */
    public static void exercise1_BasicMapOperations() {
        System.out.println("Exercise 1: Basic Map Operations");
        System.out.println("================================");

        // TODO: Create a Map to store country populations
        Map<String, Long> countryPopulations = new HashMap<>();

        // TODO: Add some countries with their populations
        countryPopulations.put("China", 1_400_000_000L);
        countryPopulations.put("India", 1_380_000_000L);
        countryPopulations.put("USA", 330_000_000L);
        countryPopulations.put("Indonesia", 270_000_000L);

        System.out.println("Initial populations: " + countryPopulations);

        // TODO: Update USA's population
        countryPopulations.put("USA", 335_000_000L);
        System.out.println("After updating USA: " + countryPopulations.get("USA"));

        // TODO: Check if Brazil exists, if not add it
        if (!countryPopulations.containsKey("Brazil")) {
            countryPopulations.put("Brazil", 215_000_000L);
        }

        // TODO: Find the country with the largest population
        String mostPopulousCountry = countryPopulations.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("Unknown");

        System.out.println("Most populous country: " + mostPopulousCountry);
        System.out.println();
    }

    /**
     * Exercise 2: Word Frequency Counter
     * Count the frequency of words in a given text.
     */
    public static void exercise2_WordFrequency() {
        System.out.println("Exercise 2: Word Frequency Counter");
        System.out.println("==================================");

        String text = "java is great java is powerful java is versatile programming language";

        // TODO: Convert text to lowercase and split into words
        String[] words = text.toLowerCase().split("\\s+");

        // TODO: Count frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word frequencies:");
        wordFrequency.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        // TODO: Find the most frequent word
        String mostFrequentWord = wordFrequency.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("None");

        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println();
    }

    /**
     * Exercise 3: Student Grade Management
     * Manage student grades and calculate statistics.
     */
    public static void exercise3_StudentGrades() {
        System.out.println("Exercise 3: Student Grade Management");
        System.out.println("====================================");

        Map<String, List<Integer>> studentGrades = new HashMap<>();
        studentGrades.put("Alice", Arrays.asList(85, 92, 78, 96));
        studentGrades.put("Bob", Arrays.asList(88, 84, 91, 87));
        studentGrades.put("Charlie", Arrays.asList(79, 85, 82, 90));
        studentGrades.put("David", Arrays.asList(95, 89, 93, 91));

        // TODO: Calculate average grade for each student
        Map<String, Double> averageGrades = studentGrades.entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> entry.getValue().stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0)
            ));

        System.out.println("Average grades:");
        averageGrades.forEach((student, avg) ->
            System.out.printf("%s: %.2f%n", student, avg));

        // TODO: Find students with average >= 90
        List<String> topPerformers = averageGrades.entrySet().stream()
            .filter(entry -> entry.getValue() >= 90.0)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        System.out.println("Top performers (avg >= 90): " + topPerformers);

        // TODO: Find the highest and lowest average
        OptionalDouble highestAvg = averageGrades.values().stream()
            .mapToDouble(Double::doubleValue)
            .max();
        OptionalDouble lowestAvg = averageGrades.values().stream()
            .mapToDouble(Double::doubleValue)
            .min();

        System.out.printf("Highest average: %.2f%n", highestAvg.orElse(0.0));
        System.out.printf("Lowest average: %.2f%n", lowestAvg.orElse(0.0));
        System.out.println();
    }

    /**
     * Exercise 4: Inventory Management System
     * Manage product inventory with operations like restock, sell, and check stock.
     */
    public static void exercise4_InventoryManagement() {
        System.out.println("Exercise 4: Inventory Management");
        System.out.println("================================");

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Laptop", 15);
        inventory.put("Mouse", 50);
        inventory.put("Keyboard", 30);
        inventory.put("Monitor", 20);
        inventory.put("Headphones", 25);

        System.out.println("Initial inventory: " + inventory);

        // TODO: Sell some items (reduce quantity)
        sellItem(inventory, "Laptop", 3);
        sellItem(inventory, "Mouse", 10);

        // TODO: Restock items (increase quantity)
        restockItem(inventory, "Keyboard", 15);
        restockItem(inventory, "Webcam", 12); // New item

        System.out.println("Updated inventory: " + inventory);

        // TODO: Find items with low stock (< 20)
        List<String> lowStockItems = inventory.entrySet().stream()
            .filter(entry -> entry.getValue() < 20)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        System.out.println("Low stock items (< 20): " + lowStockItems);

        // TODO: Calculate total inventory value (assuming each item costs $100)
        int totalValue = inventory.values().stream()
            .mapToInt(Integer::intValue)
            .sum() * 100;

        System.out.println("Total inventory value: $" + totalValue);
        System.out.println();
    }

    // Helper methods for inventory management
    private static void sellItem(Map<String, Integer> inventory, String item, int quantity) {
        if (inventory.containsKey(item)) {
            int currentStock = inventory.get(item);
            if (currentStock >= quantity) {
                inventory.put(item, currentStock - quantity);
                System.out.println("Sold " + quantity + " " + item + "(s)");
            } else {
                System.out.println("Insufficient stock for " + item);
            }
        } else {
            System.out.println("Item " + item + " not found in inventory");
        }
    }

    private static void restockItem(Map<String, Integer> inventory, String item, int quantity) {
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
        System.out.println("Restocked " + quantity + " " + item + "(s)");
    }

    /**
     * Exercise 5: Data Transformation with Streams
     * Transform and manipulate map data using streams.
     */
    public static void exercise5_DataTransformation() {
        System.out.println("Exercise 5: Data Transformation");
        System.out.println("===============================");

        Map<String, String> employeeInfo = new HashMap<>();
        employeeInfo.put("john_doe", "John Doe,Engineering,85000");
        employeeInfo.put("jane_smith", "Jane Smith,Marketing,72000");
        employeeInfo.put("bob_johnson", "Bob Johnson,Engineering,90000");
        employeeInfo.put("alice_williams", "Alice Williams,Sales,68000");

        // TODO: Parse employee data and create structured objects
        Map<String, Employee> employees = employeeInfo.entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> {
                    String[] parts = entry.getValue().split(",");
                    return new Employee(parts[0], parts[1], Double.parseDouble(parts[2]));
                }
            ));

        System.out.println("Parsed employees:");
        employees.forEach((id, emp) -> System.out.println(id + ": " + emp));

        // TODO: Group employees by department
        Map<String, List<String>> employeesByDept = employees.values().stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.mapping(Employee::getName, Collectors.toList())
            ));

        System.out.println("\nEmployees by department:");
        employeesByDept.forEach((dept, names) ->
            System.out.println(dept + ": " + names));

        // TODO: Find average salary by department
        Map<String, Double> avgSalaryByDept = employees.values().stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        System.out.println("\nAverage salary by department:");
        avgSalaryByDept.forEach((dept, avg) ->
            System.out.printf("%s: $%.2f%n", dept, avg));

        System.out.println();
    }

    /**
     * Exercise 6: Advanced Grouping and Analysis
     * Complex data analysis using maps and streams.
     */
    public static void exercise6_AdvancedGrouping() {
        System.out.println("Exercise 6: Advanced Grouping");
        System.out.println("=============================");

        List<Sale> sales = Arrays.asList(
            new Sale("Laptop", "Electronics", 1200.0, "2024-01-15"),
            new Sale("Book", "Education", 25.0, "2024-01-16"),
            new Sale("Phone", "Electronics", 800.0, "2024-01-17"),
            new Sale("Desk", "Furniture", 300.0, "2024-01-18"),
            new Sale("Chair", "Furniture", 150.0, "2024-01-19"),
            new Sale("Tablet", "Electronics", 500.0, "2024-01-20")
        );

        // TODO: Group sales by category and calculate total revenue
        Map<String, Double> revenueByCategory = sales.stream()
            .collect(Collectors.groupingBy(
                Sale::getCategory,
                Collectors.summingDouble(Sale::getAmount)
            ));

        System.out.println("Revenue by category:");
        revenueByCategory.forEach((category, revenue) ->
            System.out.printf("%s: $%.2f%n", category, revenue));

        // TODO: Find the best-selling category
        String topCategory = revenueByCategory.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("None");

        System.out.println("Top revenue category: " + topCategory);

        // TODO: Group products by price range
        Map<String, List<String>> productsByPriceRange = sales.stream()
            .collect(Collectors.groupingBy(
                sale -> {
                    if (sale.getAmount() < 100) return "Budget";
                    else if (sale.getAmount() < 500) return "Mid-range";
                    else return "Premium";
                },
                Collectors.mapping(Sale::getProduct, Collectors.toList())
            ));

        System.out.println("\nProducts by price range:");
        productsByPriceRange.forEach((range, products) ->
            System.out.println(range + ": " + products));

        System.out.println();
    }

    // Helper classes for exercises
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
            return name + " (" + department + ", $" + salary + ")";
        }
    }

    static class Sale {
        private String product;
        private String category;
        private double amount;
        private String date;

        public Sale(String product, String category, double amount, String date) {
            this.product = product;
            this.category = category;
            this.amount = amount;
            this.date = date;
        }

        public String getProduct() { return product; }
        public String getCategory() { return category; }
        public double getAmount() { return amount; }
        public String getDate() { return date; }
    }
}
