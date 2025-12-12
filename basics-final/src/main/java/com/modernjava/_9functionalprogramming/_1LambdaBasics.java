package com.modernjava._9functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * LambdaBasics - Introduction to Lambda Expressions in Java
 * Demonstrates the importance of lambdas and how they simplify functional programming
 * Starting with simple String examples before moving to complex objects
 */
public class _1LambdaBasics {

    public static void main(String[] args) {
        System.out.println("=== Lambda Expressions Basics ===\n");

        // Function<T, R>: transforms input to output
        demonstrateFunction();
        // Consumer<T>: accepts input, performs action, returns nothing
        demonstrateConsumer();
        // Predicate<T>: tests condition, returns boolean
        demonstratePredicate();
        // Supplier<T>: produces values on-demand with no input
        demonstrateSupplier();
        // Comparator<T>: compares two objects for sorting
        demonstrateComparator();
        // BiFunction<T, U, R>: accepts two inputs, returns one output
        demonstrateBiFunction();
        // BiConsumer<T, U>: accepts two inputs, performs action, returns nothing
        demonstrateBiConsumer();
        // BiPredicate<T, U>: tests two inputs, returns boolean
        demonstrateBiPredicate();
    }

    /**
     * Demonstrates Function<T, R> - transforms input to output
     */
    private static void demonstrateFunction() {
        System.out.println("1. Function<T, R> - Transforms Input to Output:");

        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

        Function<Integer, Integer> square = num -> num * num;
        System.out.println("Square of 5: " + square.apply(5));

        Function<String, Integer> countA = str -> (int) str.chars().filter(c -> c == 'a').count();
        System.out.println("Count of 'a' in 'banana': " + countA.apply("banana"));
        System.out.println();
    }

    /**
     * Demonstrates Consumer<T> - accepts input, returns nothing
     */
    private static void demonstrateConsumer() {
        System.out.println("2. Consumer<T> - Accepts Input, Returns Nothing:");

        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, World!");

        Consumer<List<Integer>> printList = list -> list.forEach(System.out::print);
        System.out.print("List contents: ");
        printList.accept(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println();

        Consumer<Integer> printSquare = num -> System.out.print(num + "^2=" + (num * num) + " ");
        System.out.print("Squares: ");
        Arrays.asList(2, 4, 6).forEach(printSquare);
        System.out.println("\n");
    }

    /**
     * Demonstrates Predicate<T> - tests conditions, returns boolean
     */
    private static void demonstratePredicate() {
        System.out.println("3. Predicate<T> - Tests Conditions, Returns Boolean:");

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));

        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C");
        System.out.print("Words longer than 5 characters: ");
        words.stream().filter(isLongerThan5).forEach(w -> System.out.print(w + " "));
        System.out.println("\n");
    }

    /**
     * Demonstrates Supplier<T> - produces values, takes no input
     */
    private static void demonstrateSupplier() {
        System.out.println("4. Supplier<T> - Produces Values, Takes No Input:");

        Supplier<String> greeting = () -> "Hello from Supplier!";
        System.out.println(greeting.get());

        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 100);
        System.out.println("Random number 1: " + randomNumber.get());
        System.out.println("Random number 2: " + randomNumber.get());

        Supplier<LocalDateTime> currentTime = () -> LocalDateTime.now();
        System.out.println("Current time: " + currentTime.get());
        System.out.println();
    }

    /**
     * Demonstrates Comparator<T> - compares two objects for sorting
     */
    private static void demonstrateComparator() {
        System.out.println("5. Comparator<T> - Compares Two Objects for Sorting:");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        System.out.println("Original names: " + names);

        Comparator<String> byLength = (s1, s2) -> s1.length() - s2.length();
        List<String> sortedByLength = new ArrayList<>(names);
        Collections.sort(sortedByLength, byLength);
        System.out.println("Sorted by length: " + sortedByLength);

        Comparator<String> alphabetically = (s1, s2) -> s1.compareToIgnoreCase(s2);
        List<String> sortedAlphabetically = new ArrayList<>(names);
        Collections.sort(sortedAlphabetically, alphabetically);
        System.out.println("Sorted alphabetically: " + sortedAlphabetically);
        System.out.println();
    }

    /**
     * Demonstrates BiFunction<T, U, R> - accepts two inputs, returns one output
     */
    private static void demonstrateBiFunction() {
        System.out.println("6. BiFunction<T, U, R> - Two Inputs, One Output:");

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("5 + 3 = " + add.apply(5, 3));

        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println("5 * 3 = " + multiply.apply(5, 3));

        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + " " + s2;
        System.out.println("Concatenate: " + concatenate.apply("Hello", "World"));

        BiFunction<String, Integer, String> repeat = (str, n) -> str.repeat(n);
        System.out.println("Repeat 'Java' 3 times: " + repeat.apply("Java", 3));
        System.out.println();
    }

    /**
     * Demonstrates BiConsumer<T, U> - accepts two inputs, returns nothing
     */
    private static void demonstrateBiConsumer() {
        System.out.println("7. BiConsumer<T, U> - Two Inputs, No Output:");

        BiConsumer<String, Integer> printWithCount = (str, count) -> {
            for (int i = 0; i < count; i++) {
                System.out.print(str + " ");
            }
            System.out.println();
        };
        System.out.print("Repeat 'Java' 3 times: ");
        printWithCount.accept("Java", 3);

        BiConsumer<Integer, Integer> printSum = (a, b) -> System.out.println("Sum of " + a + " + " + b + " = " + (a + b));
        printSum.accept(10, 20);

        BiConsumer<String, String> printPair = (key, value) -> System.out.println(key + ": " + value);
        printPair.accept("Name", "John");
        printPair.accept("City", "NYC");
        System.out.println();
    }

    /**
     * Demonstrates BiPredicate<T, U> - accepts two inputs, returns boolean
     */
    private static void demonstrateBiPredicate() {
        System.out.println("8. BiPredicate<T, U> - Tests Two Inputs, Returns Boolean:");

        BiPredicate<Integer, Integer> isFirstGreater = (a, b) -> a > b;
        System.out.println("Is 10 > 5? " + isFirstGreater.test(10, 5));
        System.out.println("Is 3 > 8? " + isFirstGreater.test(3, 8));

        BiPredicate<String, String> isSameLength = (s1, s2) -> s1.length() == s2.length();
        System.out.println("Is 'Java' same length as 'Code'? " + isSameLength.test("Java", "Code"));
        System.out.println("Is 'Hello' same length as 'World'? " + isSameLength.test("Hello", "World"));

        BiPredicate<Integer, Integer> bothEven = (a, b) -> a % 2 == 0 && b % 2 == 0;
        System.out.println("Are 4 and 8 both even? " + bothEven.test(4, 8));
        System.out.println("Are 4 and 7 both even? " + bothEven.test(4, 7));
    }

}
