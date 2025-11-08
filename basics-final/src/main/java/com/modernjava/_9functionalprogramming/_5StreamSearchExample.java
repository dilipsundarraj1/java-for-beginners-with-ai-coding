package com.modernjava._9functionalprogramming;

import com.modernjava.domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * _5StreamSearchExample - Comprehensive demonstration of Stream API search functions
 * Covers findFirst, findAny, allMatch, anyMatch, noneMatch and their practical applications
 * Each search function is demonstrated in separate methods for clarity
 */
public class _5StreamSearchExample {

    @SuppressWarnings("unused")
    static void main(String[] args) {
        System.out.println("=== Java Streams API: Search Functions ===\n");

        // Demonstrate each search function separately
        demonstrateFindFirst();
        demonstrateFindAny();
        demonstrateAnyMatch();
        demonstrateAllMatch();
        demonstrateNoneMatch();
        demonstrateSearchBestPractices();
    }

    /**
     * Demonstrates findFirst() - finds the first element matching criteria
     * Returns Optional<T> - empty if no element found
     */
    private static void demonstrateFindFirst() {
        System.out.println("=== findFirst() - Finding the First Element ===");

        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");
        List<Integer> numbers = Arrays.asList(1, 3, 7, 9, 15, 21, 28);

        // Find first fruit starting with 'C'
        Optional<String> firstFruitWithC = fruits.stream()
                .filter(fruit -> fruit.startsWith("C"))
                .findFirst();

        System.out.println("First fruit starting with 'C': " +
                          firstFruitWithC.orElse("Not found"));

        // Find first even number
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        System.out.println("First even number: " +
                          firstEven.orElse(-1)); // Using orElse for default value

        // Find first number greater than 10
        Optional<Integer> firstGreaterThan10 = numbers.stream()
                .filter(n -> n > 10)
                .findFirst();

        firstGreaterThan10.ifPresentOrElse(
            num -> System.out.println("First number > 10: " + num),
            () -> System.out.println("No number > 10 found")
        );

        System.out.println();
    }

    /**
     * Demonstrates findAny() - finds any element matching criteria
     * Useful for parallel streams where first element might be expensive to find
     */
    private static void demonstrateFindAny() {
        System.out.println("=== findAny() - Finding Any Matching Element ===");

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange", "Purple");

        // Find any color with length > 4
        Optional<String> anyLongColor = colors.stream()
                .filter(color -> color.length() > 4)
                .findAny();

        System.out.println("Any color with length > 4: " + anyLongColor.orElse("None"));

        // Find any color starting with 'G'
        Optional<String> anyColorWithG = colors.stream()
                .filter(color -> color.startsWith("G"))
                .findAny();

        System.out.println("Any color starting with 'G': " + anyColorWithG.orElse("None"));

        // Note about findAny vs findFirst
        System.out.println("Note: In sequential streams, findAny() typically returns the same result as findFirst()");
        System.out.println("The difference becomes significant with parallel streams (covered in separate lecture)");

        System.out.println();
    }

    /**
     * Demonstrates anyMatch() - checks if any element matches the predicate
     * Returns boolean - true if at least one element matches
     */
    private static void demonstrateAnyMatch() {
        System.out.println("=== anyMatch() - Testing if Any Element Matches ===");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Eve");
        List<Integer> scores = Arrays.asList(85, 92, 78, 96, 88, 73);
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Bob", 17),
            new Person("Alice", 35)
        );

        // Check if any name starts with 'C'
        boolean hasNameWithC = names.stream()
                .anyMatch(name -> name.startsWith("C"));
        System.out.println("Any name starting with 'C'? " + hasNameWithC);

        // Check if any score is above 95
        boolean hasHighScore = scores.stream()
                .anyMatch(score -> score > 95);
        System.out.println("Any score above 95? " + hasHighScore);

        // Check if any person is a minor (age < 18)
        boolean hasMinor = people.stream()
                .anyMatch(person -> person.age() < 18);
        System.out.println("Any person under 18? " + hasMinor);

        // Check if any name contains 'e'
        boolean hasNameWithE = names.stream()
                .anyMatch(name -> name.toLowerCase().contains("e"));
        System.out.println("Any name containing 'e'? " + hasNameWithE);

        System.out.println();
    }

    /**
     * Demonstrates allMatch() - checks if all elements match the predicate
     * Returns boolean - true only if ALL elements match
     */
    private static void demonstrateAllMatch() {
        System.out.println("=== allMatch() - Testing if All Elements Match ===");

        List<String> shortWords = Arrays.asList("cat", "dog", "bat", "rat");
        List<String> mixedWords = Arrays.asList("cat", "elephant", "dog", "hippopotamus");
        List<Integer> positiveNumbers = Arrays.asList(5, 10, 15, 20, 25);
        List<Integer> mixedNumbers = Arrays.asList(5, -2, 10, 15);

        List<Person> adults = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Bob", 22),
            new Person("Alice", 35)
        );

        // Check if all words are short (length <= 3)
        boolean allShort = shortWords.stream()
                .allMatch(word -> word.length() <= 3);
        System.out.println("All words in shortWords <= 3 chars? " + allShort);

        boolean allShortMixed = mixedWords.stream()
                .allMatch(word -> word.length() <= 3);
        System.out.println("All words in mixedWords <= 3 chars? " + allShortMixed);

        // Check if all numbers are positive
        boolean allPositive = positiveNumbers.stream()
                .allMatch(num -> num > 0);
        System.out.println("All numbers in positiveNumbers > 0? " + allPositive);

        boolean allPositiveMixed = mixedNumbers.stream()
                .allMatch(num -> num > 0);
        System.out.println("All numbers in mixedNumbers > 0? " + allPositiveMixed);

        // Check if all people are adults (age >= 18)
        boolean allAdults = adults.stream()
                .allMatch(person -> person.age() >= 18);
        System.out.println("All people are adults (>= 18)? " + allAdults);

        System.out.println();
    }

    /**
     * Demonstrates noneMatch() - checks if no elements match the predicate
     * Returns boolean - true only if NO elements match
     */
    private static void demonstrateNoneMatch() {
        System.out.println("=== noneMatch() - Testing if No Elements Match ===");

        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7, 9);

        List<Person> youngPeople = Arrays.asList(
            new Person("Tom", 16),
            new Person("Jerry", 15),
            new Person("Mickey", 17)
        );

        // Check if no fruit starts with 'Z'
        boolean noFruitWithZ = fruits.stream()
                .noneMatch(fruit -> fruit.startsWith("Z"));
        System.out.println("No fruit starts with 'Z'? " + noFruitWithZ);

        // Check if no number is odd in evenNumbers
        boolean noOddInEvens = evenNumbers.stream()
                .noneMatch(num -> num % 2 != 0);
        System.out.println("No odd numbers in evenNumbers list? " + noOddInEvens);

        // Check if no number is even in oddNumbers
        boolean noEvenInOdds = oddNumbers.stream()
                .noneMatch(num -> num % 2 == 0);
        System.out.println("No even numbers in oddNumbers list? " + noEvenInOdds);

        // Check if no person is an adult
        boolean noAdults = youngPeople.stream()
                .noneMatch(person -> person.age() >= 18);
        System.out.println("No adults in youngPeople list? " + noAdults);

        // Check if no fruit is longer than 10 characters
        boolean noLongFruits = fruits.stream()
                .noneMatch(fruit -> fruit.length() > 10);
        System.out.println("No fruit longer than 10 chars? " + noLongFruits);

        System.out.println();
    }

    /**
     * Demonstrates best practices and common patterns with search functions
     * Shows error handling, performance considerations, and practical tips
     */
    private static void demonstrateSearchBestPractices() {
        System.out.println("=== Search Functions: Best Practices ===");

        List<String> data = Arrays.asList("apple", "banana", null, "cherry", "", "date");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 1. Safe null handling with search functions
        System.out.println("--- Null Safety ---");
        Optional<String> firstNonNull = data.stream()
                .filter(Objects::nonNull)
                .filter(item -> !item.isEmpty())
                .findFirst();
        System.out.println("First non-null, non-empty string: " + firstNonNull.orElse("NONE"));

        // 2. Using Optional methods effectively
        System.out.println("\n--- Optional Best Practices ---");
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        // Good: Using ifPresent
        firstEven.ifPresent(num -> System.out.println("Processing even number: " + num));

        // Good: Using orElse for defaults
        int result = firstEven.orElse(0);
        System.out.println("Even number or default: " + result);

        // Good: Using map to transform Optional content
        String message = firstEven
                .map(num -> "Found even: " + num)
                .orElse("No even number found");
        System.out.println(message);

        // 3. Performance considerations
        System.out.println("\n--- Performance Tips ---");

        // Use anyMatch instead of findFirst when you only need to know if element exists
        boolean hasLongString = data.stream()
                .filter(Objects::nonNull)
                .anyMatch(s -> s.length() > 5);
        System.out.println("Has string longer than 5 chars: " + hasLongString);

        // 4. Combining search operations
        System.out.println("\n--- Combining Search Operations ---");

        List<Integer> testNumbers = Arrays.asList(2, 4, 6, 8, 10, 12);

        // Check conditions and provide meaningful feedback
        if (testNumbers.stream().allMatch(n -> n % 2 == 0)) {
            System.out.println("All numbers are even");

            Optional<Integer> firstGreaterThan5 = testNumbers.stream()
                    .filter(n -> n > 5)
                    .findFirst();

            firstGreaterThan5.ifPresent(num ->
                System.out.println("First even number > 5: " + num));
        }

        // 5. Short-circuit evaluation benefit
        System.out.println("\n--- Short-Circuit Evaluation ---");
        System.out.println("Search functions use short-circuit evaluation:");
        System.out.println("- anyMatch stops at first match");
        System.out.println("- allMatch stops at first non-match");
        System.out.println("- noneMatch stops at first match");
        System.out.println("- findFirst stops at first element");
        System.out.println("This makes them efficient for large datasets!");

        System.out.println("\n=== End of Stream Search Functions Demo ===");
    }
}
