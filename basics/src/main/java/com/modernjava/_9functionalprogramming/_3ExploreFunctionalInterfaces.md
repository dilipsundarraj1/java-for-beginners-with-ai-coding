# Functional Interfaces in Java

<!-- TOC -->
* [Functional Interfaces in Java](#functional-interfaces-in-java)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Predicate Interface Exploration](#prompt-1-predicate-interface-exploration)
    * [Prompt 2: Consumer Interface Exploration](#prompt-2-consumer-interface-exploration)
    * [Prompt 3: Supplier Interface Exploration](#prompt-3-supplier-interface-exploration)
    * [Prompt 4: Function Interface Exploration](#prompt-4-function-interface-exploration)
    * [Prompt 5: UnaryOperator Interface Exploration](#prompt-5-unaryoperator-interface-exploration)
    * [Prompt 6: BinaryOperator Interface Exploration](#prompt-6-binaryoperator-interface-exploration)
    * [Prompt 7: Runnable Interface Exploration](#prompt-7-runnable-interface-exploration)
    * [Prompt 8: Callable Interface Exploration](#prompt-8-callable-interface-exploration)
    * [Prompt 9: Comparator Interface Exploration](#prompt-9-comparator-interface-exploration)
    * [Prompt 10: Main Method Structure](#prompt-10-main-method-structure)
  * [Program Structure](#program-structure)
  * [Functional Interfaces Explored](#functional-interfaces-explored)
    * [1. Predicate&lt;T&gt;](#1-predicatet)
      * [Examples Demonstrated](#examples-demonstrated)
    * [2. Consumer&lt;T&gt;](#2-consumert)
      * [Examples Demonstrated](#examples-demonstrated-1)
    * [3. Supplier&lt;T&gt;](#3-suppliert)
      * [Examples Demonstrated](#examples-demonstrated-2)
    * [4. Function&lt;T, R&gt;](#4-functiont-r)
      * [Examples Demonstrated](#examples-demonstrated-3)
    * [5. UnaryOperator&lt;T&gt;](#5-unaryoperatort)
      * [Examples Demonstrated](#examples-demonstrated-4)
    * [6. BinaryOperator&lt;T&gt;](#6-binaryoperatort)
      * [Examples Demonstrated](#examples-demonstrated-5)
    * [7. Runnable](#7-runnable)
      * [Examples Demonstrated](#examples-demonstrated-6)
    * [8. Callable&lt;V&gt;](#8-callablev)
      * [Examples Demonstrated](#examples-demonstrated-7)
    * [9. Comparator&lt;T&gt;](#9-comparatort)
      * [Examples Demonstrated](#examples-demonstrated-8)
  * [Key Features Demonstrated](#key-features-demonstrated)
    * [Modern Java Integration](#modern-java-integration)
    * [Practical Applications](#practical-applications)
    * [Function Composition](#function-composition)
  * [Educational Value](#educational-value)
  * [Sample Output Structure](#sample-output-structure)
  * [Best Practices Illustrated](#best-practices-illustrated)
  * [Related Topics](#related-topics)
<!-- TOC -->
## Overview
The `_3ExploreFunctionalInterfaces` class provides a comprehensive demonstration of Java's built-in functional interfaces. Functional interfaces contain exactly one abstract method and serve as the foundation for lambda expressions and method references. This class explores 9 different functional interfaces with practical examples.

## Prompts for Replication

### Prompt 1: Predicate Interface Exploration
**Task**: Create a method demonstrating the Predicate functional interface for boolean testing.

**Expected Function Signature**: `private static void explorePredicateInterface()`

**Requirements**:
- Print section header: "1. Predicate Interface:"
- Show number validation with `isEven` predicate using `number % 2 == 0`
- Show string validation with `isNotEmpty` predicate checking null and empty strings
- Demonstrate predicate composition using `.and()` method
- Test with values: 4, 7 for numbers and "Hello", "" for strings
- Combine predicates: `isEven.and(isGreaterThan5)` where `isGreaterThan5` uses `num > 5`

**Implementation Pattern**:
```java
Predicate<Integer> isEven = number -> number % 2 == 0;
Predicate<String> isNotEmpty = str -> str != null && !str.isEmpty();
Predicate<Integer> isEvenAndGreaterThan5 = isEven.and(isGreaterThan5);
```

---

### Prompt 2: Consumer Interface Exploration
**Task**: Create a method demonstrating the Consumer functional interface for side effects.

**Expected Function Signature**: `private static void exploreConsumerInterface()`

**Requirements**:
- Print section header: "2. Consumer Interface:"
- Show simple string printing with `printString` consumer
- Create `processNumber` consumer that prints "even" or "odd" for numbers
- Use `forEach` with the consumer on `Arrays.asList(1, 2, 3, 4, 5)`
- Demonstrate `BiConsumer` with name and age printing
- Test BiConsumer with "Alice", 25

**Implementation Pattern**:
```java
Consumer<String> printString = str -> System.out.println("Message: " + str);
Consumer<Integer> processNumber = num -> { /* even/odd logic */ };
BiConsumer<String, Integer> printNameAge = (name, age) -> /* print format */;
```

---

### Prompt 3: Supplier Interface Exploration
**Task**: Create a method demonstrating the Supplier functional interface for value generation.

**Expected Function Signature**: `private static void exploreSupplierInterface()`

**Requirements**:
- Print section header: "3. Supplier Interface:"
- Create `randomNumber` supplier using `Math.random()`
- Create `currentTime` supplier using `System.currentTimeMillis()`
- Create `defaultMessage` supplier returning "Default Message"
- Demonstrate lazy evaluation with `Optional.empty().orElseGet(() -> "Computed default value")`

**Implementation Pattern**:
```java
Supplier<Double> randomNumber = () -> Math.random();
Supplier<Long> currentTime = () -> System.currentTimeMillis();
Supplier<String> defaultMessage = () -> "Default Message";
```

---

### Prompt 4: Function Interface Exploration
**Task**: Create a method demonstrating the Function functional interface for transformations.

**Expected Function Signature**: `private static void exploreFunctionInterface()`

**Requirements**:
- Print section header: "4. Function Interface:"
- Create string transformation functions: `toUpperCase`, `getLength`
- Create mathematical function: `square` for numbers
- Demonstrate function composition with `multiplyBy2.andThen(add3)`
- Show `BiFunction` for addition: `(a, b) -> a + b`
- Test with "hello world", "Java", and number 5

**Implementation Pattern**:
```java
Function<String, String> toUpperCase = str -> str.toUpperCase();
Function<Integer, Integer> square = num -> num * num;
Function<Integer, Integer> composed = multiplyBy2.andThen(add3);
BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
```

---

### Prompt 5: UnaryOperator Interface Exploration
**Task**: Create a method demonstrating UnaryOperator for same-type transformations.

**Expected Function Signature**: `private static void exploreUnaryOperatorInterface()`

**Requirements**:
- Print section header: "5. UnaryOperator Interface:"
- Create `increment` operator: `num -> num + 1`
- Create `titleCase` operator for strings with proper capitalization
- Create `doubleValue` operator: `num -> num * 2`
- Test with values: 5, "hELLO", 3.5

**Implementation Pattern**:
```java
UnaryOperator<Integer> increment = num -> num + 1;
UnaryOperator<String> titleCase = str -> /* title case logic */;
UnaryOperator<Double> doubleValue = num -> num * 2;
```

---

### Prompt 6: BinaryOperator Interface Exploration
**Task**: Create a method demonstrating BinaryOperator for same-type operations.

**Expected Function Signature**: `private static void exploreBinaryOperatorInterface()`

**Requirements**:
- Print section header: "6. BinaryOperator Interface:"
- Create operators: `add`, `max`, `concat`
- Show stream integration with `nums.stream().reduce(0, add)`
- Use test data: `Arrays.asList(1, 2, 3, 4, 5)`
- Test operations: 10+5, max(15,8), concat("Hello", "World")

**Implementation Pattern**:
```java
BinaryOperator<Integer> add = (a, b) -> a + b;
BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
BinaryOperator<String> concat = (str1, str2) -> str1 + " " + str2;
```

---

### Prompt 7: Runnable Interface Exploration
**Task**: Create a method demonstrating Runnable for task execution.

**Expected Function Signature**: `private static void exploreRunnableInterface()`

**Requirements**:
- Print section header: "7. Runnable Interface:"
- Create `simpleTask` that prints "Executing simple task..."
- Create `complexTask` with try-catch `Thread.sleep(100)` and proper interrupt handling
- Create `backgroundTask` that prints current thread name
- Execute tasks and use `thread.join()` to wait for completion

**Implementation Pattern**:
```java
Runnable simpleTask = () -> System.out.println("Executing simple task...");
Runnable complexTask = () -> { /* complex logic with sleep */ };
Thread thread = new Thread(backgroundTask);
thread.start();
thread.join();
```

---

### Prompt 8: Callable Interface Exploration
**Task**: Create a method demonstrating Callable for tasks that return values.

**Expected Function Signature**: `private static void exploreCallableInterface()`

**Requirements**:
- Print section header: "8. Callable Interface:"
- Create `stringTask` that sleeps 50ms and returns "Task completed successfully!"
- Create `calculationTask` that sums numbers 1 to 100 using a loop
- Use proper try-catch blocks for exception handling
- Call tasks using `.call()` method

**Implementation Pattern**:
```java
Callable<String> stringTask = () -> {
    Thread.sleep(50);
    return "Task completed successfully!";
};

Callable<Integer> calculationTask = () -> {
    int sum = 0;
    for (int i = 1; i <= 100; i++) sum += i;
    return sum;
};
```

---

### Prompt 9: Comparator Interface Exploration
**Task**: Create a method demonstrating Comparator for custom sorting.

**Expected Function Signature**: `private static void exploreComparatorInterface()`

**Requirements**:
- Print section header: "9. Comparator Interface:"
- Use test data: `Arrays.asList("Alice", "Bob", "Charlie", "David")` and `Arrays.asList(5, 2, 8, 1, 9, 3)`
- Create comparators: `naturalOrder`, `reverseOrder`, `byLength`
- Show `Comparator.comparing(String::length).thenComparing(String::compareTo)`
- Use streams with `.sorted()` and print results

**Implementation Pattern**:
```java
Comparator<String> naturalOrder = (s1, s2) -> s1.compareTo(s2);
Comparator<Integer> reverseOrder = (n1, n2) -> n2.compareTo(n1);
Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
```

---

### Prompt 10: Main Method Structure
**Task**: Create a main method that demonstrates all 9 functional interfaces.

**Expected Function Signature**: `public static void main(String[] args)`

**Requirements**:
- Print header: "=== Exploring Functional Interfaces ==="
- Call all 9 interface exploration methods in sequence
- Include proper spacing between sections
- Each method should be self-contained with its own test data

**Key Learning Objectives**:
1. **Functional Interface Mastery**: Understanding the purpose and signature of each interface
2. **Practical Applications**: Real-world examples of each interface type
3. **Composition Patterns**: How to combine and chain functional interfaces
4. **Exception Handling**: Proper error handling in functional contexts
5. **Modern Java Integration**: Using functional interfaces with streams and modern APIs

## Program Structure

The class is organized into dedicated methods, each exploring a specific functional interface:

```java
public static void main(String[] args) {
    System.out.println("=== Exploring Functional Interfaces ===\n");

    explorePredicateInterface();      // boolean test(T t)
    exploreConsumerInterface();       // void accept(T t)
    exploreSupplierInterface();       // T get()
    exploreFunctionInterface();       // R apply(T t)
    exploreUnaryOperatorInterface();  // T apply(T t)
    exploreBinaryOperatorInterface(); // T apply(T t1, T t2)
    exploreRunnableInterface();       // void run()
    exploreCallableInterface();       // V call() throws Exception
    exploreComparatorInterface();     // int compare(T o1, T o2)
}
```

## Functional Interfaces Explored

### 1. Predicate&lt;T&gt;
**Purpose**: Represents a boolean-valued function of one argument  
**Method**: `boolean test(T t)`  
**Explored in**: `explorePredicateInterface()`

#### Examples Demonstrated

**Basic Number Testing:**
```java
// Example 1: Check if number is even
Predicate<Integer> isEven = number -> number % 2 == 0;
System.out.println("Is 4 even? " + isEven.test(4));    // true
System.out.println("Is 7 even? " + isEven.test(7));    // false
```

**String Validation:**
```java
// Example 2: Check if string is not empty
Predicate<String> isNotEmpty = str -> str != null && !str.isEmpty();
System.out.println("Is 'Hello' not empty? " + isNotEmpty.test("Hello")); // true
System.out.println("Is '' not empty? " + isNotEmpty.test(""));           // false
```

**Combining Predicates:**
```java
// Example 3: Combining predicates using and()
Predicate<Integer> isGreaterThan5 = num -> num > 5;
Predicate<Integer> isEvenAndGreaterThan5 = isEven.and(isGreaterThan5);
System.out.println("Is 8 even and greater than 5? " + isEvenAndGreaterThan5.test(8)); // true
System.out.println("Is 3 even and greater than 5? " + isEvenAndGreaterThan5.test(3)); // false
```

### 2. Consumer&lt;T&gt;
**Purpose**: Accepts input and returns no result (performs side effects)  
**Method**: `void accept(T t)`  
**Explored in**: `exploreConsumerInterface()`

#### Examples Demonstrated

**Simple String Processing:**
```java
// Example 1: Print a string
Consumer<String> printString = str -> System.out.println("Message: " + str);
printString.accept("Hello, World!");
```

**Complex Number Processing:**
```java
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
```

**BiConsumer Example:**
```java
// Example 3: BiConsumer - accepts two arguments
BiConsumer<String, Integer> printNameAge = (name, age) ->
    System.out.println(name + " is " + age + " years old");
printNameAge.accept("Alice", 25);
```

### 3. Supplier&lt;T&gt;
**Purpose**: Supplies results without taking input  
**Method**: `T get()`  
**Explored in**: `exploreSupplierInterface()`

#### Examples Demonstrated

**Random Value Generation:**
```java
// Example 1: Supply a random number
Supplier<Double> randomNumber = () -> Math.random();
System.out.println("Random number: " + randomNumber.get());

// Example 2: Supply current timestamp
Supplier<Long> currentTime = () -> System.currentTimeMillis();
System.out.println("Current timestamp: " + currentTime.get());
```

**Default Value Supply:**
```java
// Example 3: Supply a default value
Supplier<String> defaultMessage = () -> "Default Message";
System.out.println("Default: " + defaultMessage.get());

// Example 4: Lazy evaluation with Optional
Optional<String> optional = Optional.empty();
String result = optional.orElseGet(() -> "Computed default value");
System.out.println("Optional result: " + result);
```

### 4. Function&lt;T, R&gt;
**Purpose**: Accepts one argument and produces a result  
**Method**: `R apply(T t)`  
**Explored in**: `exploreFunctionInterface()`

#### Examples Demonstrated

**String Transformations:**
```java
// Example 1: Convert string to uppercase
Function<String, String> toUpperCase = str -> str.toUpperCase();
System.out.println("Uppercase: " + toUpperCase.apply("hello world"));

// Example 2: Get string length
Function<String, Integer> getLength = str -> str.length();
System.out.println("Length of 'Java': " + getLength.apply("Java"));
```

**Mathematical Operations:**
```java
// Example 3: Square a number
Function<Integer, Integer> square = num -> num * num;
System.out.println("Square of 5: " + square.apply(5));
```

**Function Composition:**
```java
// Example 4: Function composition using andThen()
Function<Integer, Integer> multiplyBy2 = num -> num * 2;
Function<Integer, Integer> add3 = num -> num + 3;
Function<Integer, Integer> multiplyBy2ThenAdd3 = multiplyBy2.andThen(add3);
System.out.println("(5 * 2) + 3 = " + multiplyBy2ThenAdd3.apply(5)); // 13
```

**BiFunction Example:**
```java
// Example 5: BiFunction - accepts two arguments
BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
System.out.println("5 + 3 = " + add.apply(5, 3));
```

### 5. UnaryOperator&lt;T&gt;
**Purpose**: Special case of Function where input and output types are the same  
**Extends**: `Function<T, T>`  
**Explored in**: `exploreUnaryOperatorInterface()`

#### Examples Demonstrated

**Mathematical Operations:**
```java
// Example 1: Increment by 1
UnaryOperator<Integer> increment = num -> num + 1;
System.out.println("Increment 5: " + increment.apply(5)); // 6

// Example 3: Double a number
UnaryOperator<Double> doubleValue = num -> num * 2;
System.out.println("Double 3.5: " + doubleValue.apply(3.5)); // 7.0
```

**String Manipulation:**
```java
// Example 2: Make string title case
UnaryOperator<String> titleCase = str ->
    str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
System.out.println("Title case 'hELLO': " + titleCase.apply("hELLO")); // "Hello"
```

### 6. BinaryOperator&lt;T&gt;
**Purpose**: Special case of BiFunction where all types are the same  
**Extends**: `BiFunction<T, T, T>`  
**Explored in**: `exploreBinaryOperatorInterface()`

#### Examples Demonstrated

**Basic Operations:**
```java
// Example 1: Addition
BinaryOperator<Integer> add = (a, b) -> a + b;
System.out.println("10 + 5 = " + add.apply(10, 5)); // 15

// Example 2: Find maximum
BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
System.out.println("Max of 15 and 8: " + max.apply(15, 8)); // 15

// Example 3: String concatenation
BinaryOperator<String> concat = (str1, str2) -> str1 + " " + str2;
System.out.println("Concat 'Hello' and 'World': " + concat.apply("Hello", "World")); // "Hello World"
```

**Stream Integration:**
```java
// Example 4: Using with stream reduce
List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
Integer sum = nums.stream().reduce(0, add);
System.out.println("Sum of [1,2,3,4,5]: " + sum); // 15
```

### 7. Runnable
**Purpose**: Represents a task that can be executed (no parameters, no return value)  
**Method**: `void run()`  
**Explored in**: `exploreRunnableInterface()`

#### Examples Demonstrated

**Simple Task Execution:**
```java
// Example 1: Simple task
Runnable simpleTask = () -> System.out.println("Executing simple task...");
simpleTask.run();
```

**Complex Task with Error Handling:**
```java
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
```

**Threading Example:**
```java
// Example 3: Running in a separate thread
Runnable backgroundTask = () -> {
    System.out.println("Background task running in thread: " +
        Thread.currentThread().getName());
};
Thread thread = new Thread(backgroundTask);
thread.start();
thread.join(); // Wait for thread to complete
```

### 8. Callable&lt;V&gt;
**Purpose**: Similar to Runnable but can return a result and throw checked exceptions  
**Method**: `V call() throws Exception`  
**Explored in**: `exploreCallableInterface()`

#### Examples Demonstrated

**Task with Return Value:**
```java
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
```

**Mathematical Calculation:**
```java
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
    System.out.println("Sum of 1 to 100: " + sum); // 5050
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

### 9. Comparator&lt;T&gt;
**Purpose**: Defines comparison logic for sorting  
**Method**: `int compare(T o1, T o2)`  
**Explored in**: `exploreComparatorInterface()`

#### Examples Demonstrated

**Basic Sorting:**
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

// Example 1: Natural ordering
Comparator<String> naturalOrder = (s1, s2) -> s1.compareTo(s2);
names.stream().sorted(naturalOrder).forEach(System.out::println);

// Example 2: Reverse ordering
Comparator<Integer> reverseOrder = (n1, n2) -> n2.compareTo(n1);
numbers.stream().sorted(reverseOrder).forEach(System.out::println);
```

**Custom Comparisons:**
```java
// Example 3: Custom comparison by length
Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
names.stream().sorted(byLength).forEach(name ->
    System.out.println(name + " (length: " + name.length() + ")"));
```

**Comparator Utility Methods:**
```java
// Example 4: Using Comparator utility methods
System.out.println("--- Sorted by length then alphabetically ---");
names.stream()
      .sorted(Comparator.comparing(String::length).thenComparing(String::compareTo))
      .forEach(System.out::println);
```

## Key Features Demonstrated

### Modern Java Integration
- **Stream API** integration with functional interfaces
- **Method references** where applicable
- **Exception handling** in functional contexts
- **Thread management** with functional interfaces

### Practical Applications
- **Data validation** with Predicate
- **Data transformation** with Function and UnaryOperator
- **Side effects** with Consumer
- **Lazy evaluation** with Supplier
- **Concurrent programming** with Runnable and Callable
- **Custom sorting** with Comparator

### Function Composition
Shows how functional interfaces can be composed:
- `Predicate.and()`, `Predicate.or()`, `Predicate.negate()`
- `Function.andThen()`, `Function.compose()`
- `Comparator.comparing().thenComparing()`

## Educational Value

This class serves as a comprehensive reference for:

1. **Understanding functional interface signatures** - Each interface's key method is clearly documented
2. **Seeing practical applications** - Real-world examples for each interface type
3. **Learning composition patterns** - How to combine functional interfaces
4. **Exception handling** - Proper error handling in functional contexts
5. **Thread integration** - Using functional interfaces with concurrent programming

## Sample Output Structure

The program produces organized output for each functional interface:

```
=== Exploring Functional Interfaces ===

1. Predicate Interface:
Is 4 even? true
Is 7 even? false
Is 'Hello' not empty? true
Is '' not empty? false
Is 8 even and greater than 5? true
Is 3 even and greater than 5? false

2. Consumer Interface:
Message: Hello, World!
1 is odd
2 is even
3 is odd
4 is even
5 is odd
Alice is 25 years old

... (continues for each interface)
```

## Best Practices Illustrated

1. **Clear naming** - Function variables have descriptive names
2. **Proper exception handling** - Try-catch blocks where needed
3. **Resource management** - Thread.join() for proper thread cleanup
4. **Composition over complexity** - Using built-in methods like `andThen()`
5. **Type safety** - Generic type parameters used throughout

## Related Topics
- Lambda Expressions (`_1LambdaBasics.java`)
- Method References (`_2MethodReferencesExample.java`)
- Imperative vs Functional Programming (`_0ImperativeVsFunctionalProgramming.java`)
- Stream API
- Optional Class
- CompletableFuture
- Thread Programming
