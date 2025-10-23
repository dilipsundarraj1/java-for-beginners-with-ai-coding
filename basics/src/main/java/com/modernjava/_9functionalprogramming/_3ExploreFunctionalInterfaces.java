package com.modernjava._9functionalprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.*;

/**
 * This class demonstrates the usage of various functional interfaces in Java.
 * Functional interfaces have exactly one abstract method and can be used with lambda expressions.
 */
public class _3ExploreFunctionalInterfaces {

    public static void main(String[] args) {
        System.out.println("=== Exploring Functional Interfaces ===\n");

        explorePredicateInterface();
        exploreConsumerInterface();
        exploreSupplierInterface();
        exploreFunctionInterface();
        exploreUnaryOperatorInterface();
        exploreBinaryOperatorInterface();
        exploreRunnableInterface();
        exploreCallableInterface();
        exploreComparatorInterface();
    }

    /**
     * Predicate<T> - Represents a predicate (boolean-valued function) of one argument.
     * Method: boolean test(T t)
     */
    private static void explorePredicateInterface() {
        System.out.println("1. Predicate Interface:");

        // Example 1: Check if number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));

        // Example 2: Check if string is not empty
        Predicate<String> isNotEmpty = str -> str != null && !str.isEmpty();
        System.out.println("Is 'Hello' not empty? " + isNotEmpty.test("Hello"));
        System.out.println("Is '' not empty? " + isNotEmpty.test(""));

        // Example 3: Combining predicates
        Predicate<Integer> isGreaterThan5 = num -> num > 5;
        Predicate<Integer> isEvenAndGreaterThan5 = isEven.and(isGreaterThan5);
        System.out.println("Is 8 even and greater than 5? " + isEvenAndGreaterThan5.test(8));
        System.out.println("Is 3 even and greater than 5? " + isEvenAndGreaterThan5.test(3));

        System.out.println();
    }

    /**
     * Consumer<T> - Represents an operation that accepts a single input argument and returns no result.
     * Method: void accept(T t)
     */
    private static void exploreConsumerInterface() {
        System.out.println("2. Consumer Interface:");

        // Example 1: Print a string
        Consumer<String> printString = str -> System.out.println("Message: " + str);
        printString.accept("Hello, World!");

        // Example 2: Process a list of numbers
        Consumer<Integer> processNumber = num -> {
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        };

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(processNumber);

        // Example 3: BiConsumer - accepts two arguments
        BiConsumer<String, Integer> printNameAge = (name, age) ->
            System.out.println(name + " is " + age + " years old");
        printNameAge.accept("Alice", 25);

        System.out.println();
    }

    /**
     * Supplier<T> - Represents a supplier of results (no input, returns a result).
     * Method: T get()
     */
    private static void exploreSupplierInterface() {
        System.out.println("3. Supplier Interface:");

        // Example 1: Supply a random number
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number: " + randomNumber.get());

        // Example 2: Supply current timestamp
        Supplier<Long> currentTime = () -> System.currentTimeMillis();
        System.out.println("Current timestamp: " + currentTime.get());

        // Example 3: Supply a default value
        Supplier<String> defaultMessage = () -> "Default Message";
        System.out.println("Default: " + defaultMessage.get());

        // Example 4: Lazy evaluation with Optional
        Optional<String> optional = Optional.empty();
        String result = optional.orElseGet(() -> "Computed default value");
        System.out.println("Optional result: " + result);

        System.out.println();
    }

    /**
     * Function<T, R> - Represents a function that accepts one argument and produces a result.
     * Method: R apply(T t)
     */
    private static void exploreFunctionInterface() {
        System.out.println("4. Function Interface:");

        // Example 1: Convert string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.apply("hello world"));

        // Example 2: Get string length
        Function<String, Integer> getLength = str -> str.length();
        System.out.println("Length of 'Java': " + getLength.apply("Java"));

        // Example 3: Square a number
        Function<Integer, Integer> square = num -> num * num;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 4: Function composition
        Function<Integer, Integer> multiplyBy2 = num -> num * 2;
        Function<Integer, Integer> add3 = num -> num + 3;
        Function<Integer, Integer> multiplyBy2ThenAdd3 = multiplyBy2.andThen(add3);
        System.out.println("(5 * 2) + 3 = " + multiplyBy2ThenAdd3.apply(5));

        // Example 5: BiFunction - accepts two arguments
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("5 + 3 = " + add.apply(5, 3));

        System.out.println();
    }

    /**
     * UnaryOperator<T> - Represents an operation on a single operand that produces a result of the same type.
     * Extends Function<T, T>
     */
    private static void exploreUnaryOperatorInterface() {
        System.out.println("5. UnaryOperator Interface:");

        // Example 1: Increment by 1
        UnaryOperator<Integer> increment = num -> num + 1;
        System.out.println("Increment 5: " + increment.apply(5));

        // Example 2: Make string title case
        UnaryOperator<String> titleCase = str ->
            str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        System.out.println("Title case 'hELLO': " + titleCase.apply("hELLO"));

        // Example 3: Double a number
        UnaryOperator<Double> doubleValue = num -> num * 2;
        System.out.println("Double 3.5: " + doubleValue.apply(3.5));

        System.out.println();
    }

    /**
     * BinaryOperator<T> - Represents an operation upon two operands of the same type,
     * producing a result of the same type as the operands.
     * Extends BiFunction<T, T, T>
     */
    private static void exploreBinaryOperatorInterface() {
        System.out.println("6. BinaryOperator Interface:");

        // Example 1: Addition
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("10 + 5 = " + add.apply(10, 5));

        // Example 2: Find maximum
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
        System.out.println("Max of 15 and 8: " + max.apply(15, 8));

        // Example 3: String concatenation
        BinaryOperator<String> concat = (str1, str2) -> str1 + " " + str2;
        System.out.println("Concat 'Hello' and 'World': " + concat.apply("Hello", "World"));

        // Example 4: Using with reduce
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = nums.stream().reduce(0, add);
        System.out.println("Sum of [1,2,3,4,5]: " + sum);

        System.out.println();
    }

    /**
     * Runnable - Represents a task that can be executed by a thread.
     * Method: void run()
     */
    private static void exploreRunnableInterface() {
        System.out.println("7. Runnable Interface:");

        // Example 1: Simple task
        Runnable simpleTask = () -> System.out.println("Executing simple task...");
        simpleTask.run();

        // Example 2: Task with multiple operations
        Runnable complexTask = () -> {
            System.out.println("Starting complex task...");
            try {
                Thread.sleep(100); // Simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Complex task completed!");
        };
        complexTask.run();

        // Example 3: Running in a separate thread
        Runnable backgroundTask = () -> {
            System.out.println("Background task running in thread: " +
                Thread.currentThread().getName());
        };
        Thread thread = new Thread(backgroundTask);
        thread.start();

        try {
            thread.join(); // Wait for thread to complete
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println();
    }

    /**
     * Callable<V> - Similar to Runnable, but can return a result and throw checked exceptions.
     * Method: V call() throws Exception
     */
    private static void exploreCallableInterface() {
        System.out.println("8. Callable Interface:");

        // Example 1: Callable that returns a value
        Callable<String> stringTask = () -> {
            Thread.sleep(50); // Simulate work
            return "Task completed successfully!";
        };

        try {
            String result = stringTask.call();
            System.out.println("Callable result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example 2: Callable that performs calculation
        Callable<Integer> calculationTask = () -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            return sum;
        };

        try {
            Integer sum = calculationTask.call();
            System.out.println("Sum of 1 to 100: " + sum);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
    }

    /**
     * Comparator<T> - A comparison function, which imposes a total ordering on some collection of objects.
     * Method: int compare(T o1, T o2)
     */
    private static void exploreComparatorInterface() {
        System.out.println("9. Comparator Interface:");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

        // Example 1: Natural ordering
        Comparator<String> naturalOrder = (s1, s2) -> s1.compareTo(s2);
        names.stream().sorted(naturalOrder).forEach(System.out::println);

        System.out.println("---");

        // Example 2: Reverse ordering
        Comparator<Integer> reverseOrder = (n1, n2) -> n2.compareTo(n1);
        numbers.stream().sorted(reverseOrder).forEach(System.out::println);

        System.out.println("---");

        // Example 3: Custom comparison by length
        Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        names.stream().sorted(byLength).forEach(name ->
            System.out.println(name + " (length: " + name.length() + ")"));

        // Example 4: Using Comparator utility methods
        System.out.println("--- Sorted by length then alphabetically ---");
        names.stream()
              .sorted(Comparator.comparing(String::length).thenComparing(String::compareTo))
              .forEach(System.out::println);

        System.out.println();
    }
}
