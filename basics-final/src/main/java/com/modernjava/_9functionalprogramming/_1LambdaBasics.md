# LambdaBasics.java - Introduction to Lambda Expressions in Java

<!-- TOC -->
* [LambdaBasics.java - Introduction to Lambda Expressions in Java](#lambdabasicsjava---introduction-to-lambda-expressions-in-java)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Function<T, R> - Transforms Input to Output](#prompt-1-functiont-r---transforms-input-to-output)
    * [Prompt 2: Consumer<T> - Accepts Input, Returns Nothing](#prompt-2-consumert---accepts-input-returns-nothing)
    * [Prompt 3: Predicate<T> - Tests Conditions, Returns Boolean](#prompt-3-predicatet---tests-conditions-returns-boolean)
    * [Prompt 4: Supplier<T> - Produces Values, Takes No Input](#prompt-4-suppliert---produces-values-takes-no-input)
    * [Prompt 5: Comparator<T> - Compares Two Objects for Sorting](#prompt-5-comparatort---compares-two-objects-for-sorting)
    * [Prompt 6: BiFunction<T, U, R> - Two Inputs, One Output](#prompt-6-bifunctiont-u-r---two-inputs-one-output)
    * [Prompt 7: BiConsumer<T, U> - Two Inputs, No Output](#prompt-7-biconsumert-u---two-inputs-no-output)
    * [Prompt 8: BiPredicate<T, U> - Tests Two Inputs, Returns Boolean](#prompt-8-bipredicatet-u---tests-two-inputs-returns-boolean)
  * [Key Learning Objectives](#key-learning-objectives)
    * [1. Lambda Expression Fundamentals](#1-lambda-expression-fundamentals)
    * [2. Single Parameter Functional Interfaces](#2-single-parameter-functional-interfaces)
    * [3. Dual Parameter Functional Interfaces](#3-dual-parameter-functional-interfaces)
    * [4. Foundation for Streams](#4-foundation-for-streams)
  * [Class Structure Analysis](#class-structure-analysis)
  * [Connection to Other Modules](#connection-to-other-modules)
<!-- TOC -->
## Overview
This file introduces lambda expressions in Java through a comprehensive exploration of the 8 most important functional interfaces. Each functional interface is demonstrated in its own dedicated method, progressively building understanding from single-parameter interfaces (Function, Consumer, Predicate, Supplier, Comparator) to dual-parameter interfaces (BiFunction, BiConsumer, BiPredicate). The class serves as a foundation for understanding functional programming concepts before applying them to complex object types and Stream operations.

## Prompts for Replication

Each prompt below represents a complete, independent method that demonstrates one functional interface. These methods are called from the `main()` method and provide clear, practical examples of how to use each interface.

### Prompt 1: Function<T, R> - Transforms Input to Output
**Task**: Create a separate method `demonstrateFunction()` that demonstrates the Function functional interface for transforming data.

**Expected Function Signature**: `private static void demonstrateFunction()`

**Requirements**:
- Print section header: "1. Function<T, R> - Transforms Input to Output:"
- Create `Function<String, Integer>` to get string length
  - Lambda: `str -> str.length()`
  - Apply to: "Hello"
  - Print results in format: "Length of 'Hello': 5"
- Create `Function<Integer, Integer>` to calculate square
  - Lambda: `num -> num * num`
  - Apply to: 5
  - Print results in format: "Square of 5: 25"
- Create `Function<String, Integer>` to count 'a' characters in a string
  - Lambda: `str -> (int) str.chars().filter(c -> c == 'a').count()`
  - Apply to: "banana"
  - Print in format: "Count of 'a' in 'banana': 3"
- End with: `System.out.println();` for spacing
- Call this method from `main()`: `demonstrateFunction();`

**Implementation Pattern**:
```java
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
```

---

### Prompt 2: Consumer<T> - Accepts Input, Returns Nothing
**Task**: Create a separate method `demonstrateConsumer()` that demonstrates the Consumer functional interface for performing actions.

**Expected Function Signature**: `private static void demonstrateConsumer()`

**Requirements**:
- Print section header: "2. Consumer<T> - Accepts Input, Returns Nothing:"
- Create `Consumer<String>` to print a formatted message
  - Lambda: `message -> System.out.println("Message: " + message)`
  - Apply to: "Hello, World!"
- Create `Consumer<List<Integer>>` to print list contents
  - Lambda: `list -> list.forEach(System.out::print)`
  - Apply to: `Arrays.asList(1, 2, 3, 4, 5)`
  - Print prefix: "List contents: "
- Create `Consumer<Integer>` to print numbers with their squares
  - Lambda: `num -> System.out.print(num + "^2=" + (num * num) + " ")`
  - Apply to: `Arrays.asList(2, 4, 6)` using forEach
  - Print prefix: "Squares: "
- End with: `System.out.println("\n");` for spacing
- Call this method from `main()`: `demonstrateConsumer();`

**Implementation Pattern**:
```java
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
```

---

### Prompt 3: Predicate<T> - Tests Conditions, Returns Boolean
**Task**: Create a separate method `demonstratePredicate()` that demonstrates the Predicate functional interface for testing conditions.

**Expected Function Signature**: `private static void demonstratePredicate()`

**Requirements**:
- Print section header: "3. Predicate<T> - Tests Conditions, Returns Boolean:"
- Create `Predicate<Integer>` to check if number is even
  - Lambda: `num -> num % 2 == 0`
  - Test with: 4, 7
  - Print results in format: "Is 4 even? true"
- Create `Predicate<String>` to check if string length > 5
  - Lambda: `str -> str.length() > 5`
  - Use with filter on: `Arrays.asList("Java", "Python", "JavaScript", "C")`
  - Print prefix: "Words longer than 5 characters: "
- End with: `System.out.println("\n");` for spacing
- Call this method from `main()`: `demonstratePredicate();`

**Implementation Pattern**:
```java
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
```

---

### Prompt 4: Supplier<T> - Produces Values, Takes No Input
**Task**: Create a separate method `demonstrateSupplier()` that demonstrates the Supplier functional interface for generating values.

**Expected Function Signature**: `private static void demonstrateSupplier()`

**Requirements**:
- Print section header: "4. Supplier<T> - Produces Values, Takes No Input:"
- Create `Supplier<String>` to generate a greeting
  - Lambda: `() -> "Hello from Supplier!"`
  - Call once and print result
- Create `Supplier<Integer>` to generate random numbers (0-100)
  - Lambda: `() -> (int) (Math.random() * 100)`
  - Generate and print 2 random numbers with labels: "Random number 1:", "Random number 2:"
- Create `Supplier<LocalDateTime>` to provide current timestamp
  - Lambda: `() -> LocalDateTime.now()`
  - Call once and print result with prefix: "Current time: "
- End with: `System.out.println();` for spacing
- Call this method from `main()`: `demonstrateSupplier();`

**Implementation Pattern**:
```java
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
```

---

### Prompt 5: Comparator<T> - Compares Two Objects for Sorting
**Task**: Create a separate method `demonstrateComparator()` that demonstrates the Comparator functional interface for sorting.

**Expected Function Signature**: `private static void demonstrateComparator()`

**Requirements**:
- Print section header: "5. Comparator<T> - Compares Two Objects for Sorting:"
- Create original list: `Arrays.asList("Alice", "Bob", "Charlie", "Diana")`
  - Print: "Original names: [Alice, Bob, Charlie, Diana]"
- Create `Comparator<String>` to sort by string length
  - Lambda: `(s1, s2) -> s1.length() - s2.length()`
  - Apply to copy of names using `Collections.sort()`
  - Print: "Sorted by length: [Bob, Alice, Diana, Charlie]"
- Create `Comparator<String>` to sort alphabetically (case-insensitive)
  - Lambda: `(s1, s2) -> s1.compareToIgnoreCase(s2)`
  - Apply to copy of names using `Collections.sort()`
  - Print: "Sorted alphabetically: [Alice, Bob, Charlie, Diana]"
- End with: `System.out.println();` for spacing
- Call this method from `main()`: `demonstrateComparator();`

**Implementation Pattern**:
```java
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
```

---

### Prompt 6: BiFunction<T, U, R> - Two Inputs, One Output
**Task**: Create a separate method `demonstrateBiFunction()` that demonstrates the BiFunction functional interface for operations on two inputs.

**Expected Function Signature**: `private static void demonstrateBiFunction()`

**Requirements**:
- Print section header: "6. BiFunction<T, U, R> - Two Inputs, One Output:"
- Create `BiFunction<Integer, Integer, Integer>` for addition
  - Lambda: `(a, b) -> a + b`
  - Apply to: (5, 3)
  - Print in format: "5 + 3 = 8"
- Create `BiFunction<Integer, Integer, Integer>` for multiplication
  - Lambda: `(a, b) -> a * b`
  - Apply to: (5, 3)
  - Print in format: "5 * 3 = 15"
- Create `BiFunction<String, String, String>` for string concatenation
  - Lambda: `(s1, s2) -> s1 + " " + s2`
  - Apply to: ("Hello", "World")
  - Print in format: "Concatenate: Hello World"
- Create `BiFunction<String, Integer, String>` to repeat string
  - Lambda: `(str, n) -> str.repeat(n)`
  - Apply to: ("Java", 3)
  - Print in format: "Repeat 'Java' 3 times: JavaJavaJava"
- End with: `System.out.println();` for spacing
- Call this method from `main()`: `demonstrateBiFunction();`

**Implementation Pattern**:
```java
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
```

---

### Prompt 7: BiConsumer<T, U> - Two Inputs, No Output
**Task**: Create a separate method `demonstrateBiConsumer()` that demonstrates the BiConsumer functional interface for actions on two inputs.

**Expected Function Signature**: `private static void demonstrateBiConsumer()`

**Requirements**:
- Print section header: "7. BiConsumer<T, U> - Two Inputs, No Output:"
- Create `BiConsumer<String, Integer>` to repeat and print a string
  - Lambda: `(str, count) -> { for (int i = 0; i < count; i++) System.out.print(str + " "); System.out.println(); }`
  - Apply to: ("Java", 3)
  - Print prefix: "Repeat 'Java' 3 times: "
- Create `BiConsumer<Integer, Integer>` to print sum of two numbers
  - Lambda: `(a, b) -> System.out.println("Sum of " + a + " + " + b + " = " + (a + b))`
  - Apply to: (10, 20)
- Create `BiConsumer<String, String>` to print key-value pairs
  - Lambda: `(key, value) -> System.out.println(key + ": " + value)`
  - Apply to: ("Name", "John"), ("City", "NYC")
- End with: `System.out.println();` for spacing
- Call this method from `main()`: `demonstrateBiConsumer();`

**Implementation Pattern**:
```java
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
```

---

### Prompt 8: BiPredicate<T, U> - Tests Two Inputs, Returns Boolean
**Task**: Create a separate method `demonstrateBiPredicate()` that demonstrates the BiPredicate functional interface for testing two inputs.

**Expected Function Signature**: `private static void demonstrateBiPredicate()`

**Requirements**:
- Print section header: "8. BiPredicate<T, U> - Tests Two Inputs, Returns Boolean:"
- Create `BiPredicate<Integer, Integer>` to check if first is greater than second
  - Lambda: `(a, b) -> a > b`
  - Test with: (10, 5), (3, 8)
  - Print results in format: "Is 10 > 5? true"
- Create `BiPredicate<String, String>` to check if strings have same length
  - Lambda: `(s1, s2) -> s1.length() == s2.length()`
  - Test with: ("Java", "Code"), ("Hello", "World")
  - Print results in format: "Is 'Java' same length as 'Code'? true"
- Create `BiPredicate<Integer, Integer>` to check if both numbers are even
  - Lambda: `(a, b) -> a % 2 == 0 && b % 2 == 0`
  - Test with: (4, 8), (4, 7)
  - Print results in format: "Are 4 and 8 both even? true"
- Call this method from `main()`: `demonstrateBiPredicate();`

**Implementation Pattern**:
```java
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
```

---

## Key Learning Objectives

### 1. Lambda Expression Fundamentals
- Understand lambda syntax: `(parameters) -> expression`
- Learn when lambdas are appropriate vs traditional approaches
- Recognize common functional interface patterns

### 2. Single Parameter Functional Interfaces
- **Function<T, R>**: Transform input to output (type conversion, calculations)
- **Consumer<T>**: Perform actions without returning value (printing, logging)
- **Predicate<T>**: Test conditions and return boolean (filtering)
- **Supplier<T>**: Generate values on-demand with no parameters (factories, lazy loading)
- **Comparator<T>**: Compare objects for sorting and ordering

### 3. Dual Parameter Functional Interfaces
- **BiFunction<T, U, R>**: Accept two inputs, return one output (arithmetic, concatenation)
- **BiConsumer<T, U>**: Perform actions with two inputs, no output (key-value processing)
- **BiPredicate<T, U>**: Test two inputs and return boolean (comparison logic)

### 4. Foundation for Streams
- Prepare for stream operations with lambda understanding
- Connect lambda concepts to collection processing
- Bridge to advanced functional programming concepts

## Class Structure Analysis

```java
public class LambdaBasics {
    // Single Parameter Functional Interfaces
    // 1. Function<T, R> - transforms input to output
    private static void demonstrateFunction()
    
    // 2. Consumer<T> - accepts input, returns nothing (side effects)
    private static void demonstrateConsumer()
    
    // 3. Predicate<T> - tests conditions, returns boolean
    private static void demonstratePredicate()
    
    // 4. Supplier<T> - produces values on-demand, takes no input
    private static void demonstrateSupplier()
    
    // 5. Comparator<T> - compares two objects for ordering
    private static void demonstrateComparator()
    
    // Dual Parameter Functional Interfaces
    // 6. BiFunction<T, U, R> - two inputs, one output
    private static void demonstrateBiFunction()
    
    // 7. BiConsumer<T, U> - two inputs, no output
    private static void demonstrateBiConsumer()
    
    // 8. BiPredicate<T, U> - tests two inputs, returns boolean
    private static void demonstrateBiPredicate()
    
    // Main method calling all demonstrations
    public static void main(String[] args)
}
```

## Connection to Other Modules
- **Builds on**: String operations from Module 5, ArrayList concepts from Module 8
- **Prepares for**: StreamsBasics.java and MovieFunctionalProgramming.java
- **Enables**: Advanced functional programming patterns and modern Java development
