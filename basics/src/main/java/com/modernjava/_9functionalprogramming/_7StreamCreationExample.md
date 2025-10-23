# _5StreamCreationExample.java - Different Ways to Create Streams

## Overview
This file demonstrates various static methods for creating streams in Java, focusing on three primary creation techniques: `Stream.of()`, `Stream.iterate()`, and `Stream.generate()`. It progresses from simple element-based stream creation to infinite stream generation with practical examples. The class serves as a comprehensive guide to understanding different stream creation patterns and their appropriate use cases in functional programming.

## Prompts for Replication

### Prompt 1: Stream.of() - Creating Streams from Elements
**Task**: Create a method demonstrating `Stream.of()` for creating finite streams from individual elements.

**Expected Function Signature**: `private static void demonstrateStreamOf()`

**Requirements**:
- Print section header: "1. Stream.of() - Creating Streams from Elements:"
- Explain: "Stream.of() creates a finite stream from individual elements"
- Show string stream creation: `Stream.of("apple", "banana", "cherry", "date")`
- Demonstrate number stream: `Stream.of(10, 20, 30, 40, 50)`
- Show mixed type stream using Object: `Stream.of("Hello", 42, 3.14, true)`
- Demonstrate empty stream creation: `Stream.of()`
- Print results using `forEach()` for each example

**Implementation Pattern**:
```java
Stream<String> fruitStream = Stream.of("apple", "banana", "cherry", "date");
fruitStream.forEach(fruit -> System.out.print(fruit + " "));
```

---

### Prompt 2: Stream.iterate() - Creating Iterative Streams
**Task**: Create a method showing `Stream.iterate()` for generating infinite streams with iteration patterns.

**Expected Function Signature**: `private static void demonstrateStreamIterate()`

**Requirements**:
- Print section header: "2. Stream.iterate() - Creating Iterative Streams:"
- Explain: "Stream.iterate(seed, unaryOperator) creates infinite streams with iteration"
- Show arithmetic progression: `Stream.iterate(1, n -> n + 2).limit(10)`
- Demonstrate powers of 2: `Stream.iterate(1, n -> n * 2).limit(10)`
- Show string iteration: `Stream.iterate("Java", s -> s + "!").limit(5)`
- Include Java 9+ predicate version: `Stream.iterate(1, n -> n < 50, n -> n * 3)`
- Use `.limit()` to control infinite stream output

**Iteration Pattern Examples**:
```java
// Arithmetic progression
Stream.iterate(1, n -> n + 2).limit(10)

// Powers of 2
Stream.iterate(1, n -> n * 2).limit(10)

// With predicate (Java 9+)
Stream.iterate(1, n -> n < 50, n -> n * 3)
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
- Include UUID generation: `Stream.generate(() -> UUID.randomUUID().toString().substring(0, 8)).limit(3)`
- Demonstrate timestamp generation with sleep for visibility
- Always use `.limit()` to prevent infinite output

**Supplier Function Examples**:
```java
// Constant values
Stream.generate(() -> "Hello")

// Random numbers
Stream.generate(() -> random.nextInt(100) + 1)

// Method reference
Stream.generate(Math::random)
```

---

### Prompt 4: Practical Examples Combining Stream Creation with Operations
**Task**: Create a method showing real-world applications combining stream creation methods with common stream operations.

**Expected Function Signature**: `private static void demonstratePracticalExamples()`

**Requirements**:
- Print section header: "4. Practical Examples - Combining Stream Creation with Operations:"
- Show multiplication table using `iterate`: `Stream.iterate(7, n -> n + 7).limit(10)`
- Demonstrate filtering with `iterate`: even numbers in range 1-20
- Show complex operations with `of()`: score processing with filter, map, and collect
- Include Java 9+ `takeWhile()` example: powers of 2 less than 1000
- Use various terminal operations: `forEach`, `collect`, `toList()`

**Practical Patterns**:
```java
// Multiplication table
Stream.iterate(7, n -> n + 7)
    .limit(10)
    .forEach(n -> System.out.println("7 x " + (n/7) + " = " + n));

// Filtering with iterate
Stream.iterate(1, n -> n + 1)
    .limit(20)
    .filter(n -> n % 2 == 0)
    .forEach(n -> System.out.print(n + " "));

// Complex operations with of()
Stream.of(85, 92, 78, 96, 88, 76, 94)
    .filter(score -> score >= 80)
    .map(score -> score + 5)
    .sorted()
    .toList();
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
