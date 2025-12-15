# _6StreamCreationExample.java - Different Ways to Create Streams

<!-- TOC -->
* [_6StreamCreationExample.java - Different Ways to Create Streams](#_6streamcreationexamplejava---different-ways-to-create-streams)
  * [Overview](#overview)
  * [Main Method Execution Order](#main-method-execution-order)
    * [Prompt 1: Stream.of() - Creating Streams from Elements](#prompt-1-streamof---creating-streams-from-elements)
    * [Prompt 2: Stream.iterate() - Creating Iterative Streams](#prompt-2-streamiterate---creating-iterative-streams)
    * [Prompt 3: Stream.generate() - Creating Streams with Suppliers](#prompt-3-streamgenerate---creating-streams-with-suppliers)
  * [Key Concepts Covered](#key-concepts-covered)
    * [1. Stream Creation Methods](#1-stream-creation-methods)
    * [2. Stream Characteristics](#2-stream-characteristics)
    * [3. Best Practices](#3-best-practices)
    * [4. Java Version Features](#4-java-version-features)
  * [Learning Progression](#learning-progression)
<!-- TOC -->

## Overview
This file demonstrates various static methods for creating streams in Java, focusing on three primary creation techniques: `Stream.of()`, `Stream.iterate()`, and `Stream.generate()`. It progresses from simple element-based stream creation to infinite stream generation with practical examples. The class serves as a comprehensive guide to understanding different stream creation patterns and their appropriate use cases in functional programming.

## Main Method Execution Order

The `main()` method demonstrates the stream creation methods in the following sequence:

```java
public static void main(String[] args) {
    System.out.println("=== Different Ways to Create Streams ===\n");

    // 1. Stream.of() - Creating streams from elements
    demonstrateStreamOf();

    // 2. Stream.iterate() - Creating iterative streams
    demonstrateStreamIterate();

    // 3. Stream.generate() - Creating streams with suppliers
    demonstrateStreamGenerate();
}
```

---

### Prompt 1: Stream.of() - Creating Streams from Elements
**Task**: Create a method demonstrating `Stream.of()` for creating finite streams from individual elements.

**Expected Function Signature**: `private static void demonstrateStreamOf()`

**Requirements**:
- Print section header: "1. Stream.of() - Creating Streams from Elements:"
- Explain: "Stream.of() creates a finite stream from individual elements"
- Show string stream creation: `Stream.of("apple", "banana", "cherry", "date")`
- Demonstrate number stream: `Stream.of(10, 20, 30, 40, 50)`
- Demonstrate empty stream creation: `Stream.of()`
- Print results using `forEach()` for each example
- Include separator line at the end

**Implementation Pattern**:
```java
private static void demonstrateStreamOf() {
    // Print section title and short description
    System.out.println("1. Stream.of() - Creating Streams from Elements:");
    System.out.println("   Stream.of() creates a finite stream from individual elements\n");

    // Print subsection header for creating string stream
    System.out.println("Creating stream from individual strings:");
    // Create a finite stream from individual string elements
    Stream<String> fruitStream = Stream.of("apple", "banana", "cherry", "date");
    System.out.print("Fruits: ");
    // Print each fruit from the stream using forEach
    fruitStream.forEach(fruit -> System.out.print(fruit + " "));
    System.out.println("\n");

    // Print subsection header for creating number stream
    System.out.println("Creating stream from individual numbers:");
    // Create a finite stream from individual integer elements
    Stream<Integer> numberStream = Stream.of(10, 20, 30, 40, 50);
    System.out.print("Numbers: ");
    // Print each number from the stream using forEach
    numberStream.forEach(num -> System.out.print(num + " "));
    System.out.println("\n");

    // Print subsection header for empty stream
    System.out.println("Creating empty stream:");
    // Create an empty stream and count its elements
    Stream<String> emptyStream = Stream.of();
    System.out.println("Empty stream count: " + emptyStream.count());
    
    // Print a separator line to end the section
    System.out.println("─────────────────────────────────────────────────────────\n");
}
```

---

### Prompt 2: Stream.iterate() - Creating Iterative Streams
**Task**: Create a method showing `Stream.iterate()` for generating infinite streams with iteration patterns.

**Expected Function Signature**: `private static void demonstrateStreamIterate()`

**Requirements**:
- Print section header: "2. Stream.iterate() - Creating Iterative Streams:"
- Explain: "Stream.iterate(seed, unaryOperator) creates infinite streams with iteration"
- Show arithmetic progression: `Stream.iterate(1, n -> n + 2).limit(10)`
- Demonstrate string iteration: `Stream.iterate("Java", s -> s + "!").limit(5)`
- Include Java 9+ predicate version: `Stream.iterate(1, n -> n < 50, n -> n * 3)`
- Use `.limit()` to control infinite stream output
- Include separator line at the end

**Iteration Pattern Examples**:
```
a) Arithmetic progression (1, 3, 5, 7, ...)
b) String iteration (Java, Java!, Java!!, ...)
c) Iterate with predicate (Java 9+) - numbers less than 50
```

**Implementation Pattern**:
```java
private static void demonstrateStreamIterate() {
    // Print section title and short description
    System.out.println("2. Stream.iterate() - Creating Iterative Streams:");
    System.out.println("   Stream.iterate(seed, unaryOperator) creates infinite streams with iteration\n");

    // Print subsection header for arithmetic progression
    System.out.println("Arithmetic progression (starting from 1, adding 2):");
    // Generate sequence of odd numbers by starting at 1 and adding 2 each time
    Stream.iterate(1, n -> n + 2)
            .limit(10)
            .forEach(n -> System.out.print(n + " "));
    System.out.println("\n");

    // Print subsection header for string iteration
    System.out.println("String iteration (repeating 'Java' with increasing count):");
    // Generate strings by appending exclamation mark to previous string
    Stream.iterate("Java", s -> s + "!")
            .limit(5)
            .forEach(s -> System.out.println("  " + s));
    System.out.println();

    // Print subsection header for iterate with predicate
    System.out.println("Iterate with condition (Java 9+) - numbers less than 50:");
    // Generate numbers starting at 1, multiplying by 3 until less than 50
    Stream.iterate(1, n -> n < 50, n -> n * 3)
            .forEach(n -> System.out.print(n + " "));
    System.out.println("\n");
    
    // Print a separator line to end the section
    System.out.println("─────────────────────────────────────────────────────────\n");
}
```

---

### Prompt 3: Stream.generate() - Creating Streams with Suppliers
**Task**: Create a method demonstrating `Stream.generate()` for creating streams using supplier functions.

**Expected Function Signature**: `private static void demonstrateStreamGenerate()`

**Requirements**:
- Print section header: "3. Stream.generate() - Creating Streams with Suppliers:"
- Explain: "Stream.generate(supplier) creates infinite streams using supplier function"
- Show constant value generation: `Stream.generate(() -> "Hello").limit(5)`
- Demonstrate random number generation: `Stream.generate(() -> random.nextInt(100) + 1).limit(8)`
- Show random doubles: `Stream.generate(Math::random).limit(5)`
- Demonstrate timestamp generation: `Stream.generate(() -> System.currentTimeMillis()).limit(3)`
- Always use `.limit()` to prevent infinite output
- Include separator line at the end

**Supplier Function Examples**:
```
a) Generating constant values (Hello, Hello, ...)
b) Generating random numbers (1-100)
c) Generating random doubles using Math::random
d) Generating current timestamps
```

**Implementation Pattern**:
```java
private static void demonstrateStreamGenerate() {
    // Print section title and short description
    System.out.println("3. Stream.generate() - Creating Streams with Suppliers:");
    System.out.println("   Stream.generate(supplier) creates infinite streams using supplier function\n");

    // Print subsection header for generating constant values
    System.out.println("Generating constant values:");
    // Generate the same constant value repeatedly using lambda
    Stream.generate(() -> "Hello")
            .limit(5)
            .forEach(s -> System.out.print(s + " "));
    System.out.println("\n");

    // Print subsection header for generating random numbers
    System.out.println("Generating random numbers (1-100):");
    // Generate random integers between 1 and 100 repeatedly
    Random random = new Random();
    Stream.generate(() -> random.nextInt(100) + 1)
            .limit(8)
            .forEach(n -> System.out.print(n + " "));
    System.out.println("\n");

    // Print subsection header for generating random doubles
    System.out.println("Generating random doubles:");
    // Generate random double values between 0.0 and 1.0 using method reference
    Stream.generate(Math::random)
            .limit(5)
            .forEach(d -> System.out.printf("%.3f ", d));
    System.out.println("\n");

    // Print subsection header for generating timestamps
    System.out.println("Generating timestamps:");
    // Generate current system timestamps repeatedly
    Stream.generate(() -> System.currentTimeMillis())
            .limit(3)
            .forEach(timestamp -> {
                System.out.println("  " + timestamp);
            });
    System.out.println();
    
    // Print a separator line to end the section
    System.out.println("─────────────────────────────────────────────────────────\n");
}
```

---

## Key Concepts Covered

### 1. Stream Creation Methods
- **Stream.of()**: Creates finite streams from individual elements
- **Stream.iterate()**: Creates infinite streams with iterative patterns
- **Stream.generate()**: Creates infinite streams using supplier functions

### 2. Stream Characteristics
- **Finite vs Infinite**: Understanding when streams terminate naturally
- **Lazy Evaluation**: Streams are processed only when terminal operations are called
- **Supplier Functions**: Functions that produce values without taking parameters

### 3. Best Practices
- Always use `.limit()` with infinite streams to prevent endless execution
- Choose appropriate creation method based on data pattern needs
- Combine creation methods with intermediate and terminal operations effectively

### 4. Java Version Features
- Basic stream creation available since Java 8
- `Stream.iterate()` with predicate available since Java 9
- `takeWhile()` operation available since Java 9

## Learning Progression
1. Start with `Stream.of()` for understanding basic stream creation
2. Move to `Stream.iterate()` for pattern-based generation
3. Explore `Stream.generate()` for supplier-based creation
4. Practice combining creation methods with stream operations
5. Apply knowledge to real-world data processing scenarios
