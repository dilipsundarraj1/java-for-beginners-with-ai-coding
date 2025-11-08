# StreamsBasics.java - Introduction to Java Streams API

<!-- TOC -->
* [StreamsBasics.java - Introduction to Java Streams API](#streamsbasicsjava---introduction-to-java-streams-api)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Basic Stream Operations](#prompt-1-basic-stream-operations)
    * [Prompt 2: Filtering Operations](#prompt-2-filtering-operations)
    * [Prompt 3: Mapping (Transformation) Operations](#prompt-3-mapping-transformation-operations)
    * [Prompt 4: Combined Operations Pipeline](#prompt-4-combined-operations-pipeline)
  * [Key Concepts Demonstrated](#key-concepts-demonstrated)
    * [Stream Characteristics](#stream-characteristics)
    * [Operation Types](#operation-types)
    * [Functional Programming Benefits](#functional-programming-benefits)
  * [Prerequisites](#prerequisites)
  * [Next Steps](#next-steps)
<!-- TOC -->

## Overview
This file introduces the Java Streams API, demonstrating how streams make collection operations simpler and more readable. Building on lambda expressions, it shows powerful data processing pipelines that transform imperative code into declarative operations. The class progresses from basic stream operations to complex chained transformations, serving as a foundation for functional programming with collections.

## Prompts for Replication

### Prompt 1: Basic Stream Operations
**Task**: Create a method demonstrating fundamental stream operations and their purposes.

**Expected Function Signature**: `private static void demonstrateBasicStreamOperations()`

**Requirements**:
- Print section header: "Basic Stream Operations:"
- Use sample data: `Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")`
- Demonstrate stream creation from collections
- Show terminal operations that execute the stream:
  - `forEach` - perform action on each element
  - `collect` - gather results into collection
  - `count` - count elements matching criteria
- Include intermediate operations like `limit` and `filter`
- Explain the lazy evaluation concept

**Implementation Pattern**:
```java
// Stream creation
numbers.stream()

// Terminal operations
.forEach(n -> System.out.print(n + " "))
.collect(Collectors.toList())
.count()

// Intermediate operations
.limit(5)
.filter(n -> Integer.parseInt(n) > 5)
```

---

### Prompt 2: Filtering Operations
**Task**: Create a method showing how to filter collections using predicates.

**Expected Function Signature**: `private static void demonstrateFiltering()`

**Requirements**:
- Print section header: "Filtering with Streams:"
- Use sample data: `Arrays.asList("apple", "apricot", "banana", "blueberry", "cherry", "coconut")`
- Demonstrate single filter conditions:
  - Filter items starting with specific letter
  - Filter items by length criteria
- Show filter chaining for multiple conditions
- Use both `forEach` for display and `collect` for results
- Explain predicate functions and their role

**Implementation Pattern**:
```java
// Single filter
fruits.stream()
    .filter(fruit -> fruit.startsWith("a"))
    .forEach(System.out::println)

// Multiple filters (chaining)
fruits.stream()
    .filter(fruit -> fruit.startsWith("b"))
    .filter(fruit -> fruit.length() > 6)
    .collect(Collectors.toList())
```

---

### Prompt 3: Mapping (Transformation) Operations
**Task**: Create a method demonstrating data transformation using map operations.

**Expected Function Signature**: `private static void demonstrateMapping()`

**Requirements**:
- Print section header: "Mapping (Transforming) with Streams:"
- Use sample data: `Arrays.asList("new york", "london", "tokyo", "paris")`
- Show different types of transformations:
  - String to uppercase using method reference
  - Extract string lengths to integers
  - Format strings with custom logic
  - Type conversion (String to Integer)
- Demonstrate both lambda expressions and method references
- Include additional example with string numbers conversion

**Implementation Pattern**:
```java
// Method reference transformation
cities.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList())

// Lambda transformation
cities.stream()
    .map(city -> "City: " + city.substring(0, 1).toUpperCase() + city.substring(1))
    .collect(Collectors.toList())

// Type conversion
stringNumbers.stream()
    .map(Integer::parseInt)
    .collect(Collectors.toList())
```

---

### Prompt 4: Combined Operations Pipeline
**Task**: Create a method showcasing the power of chaining stream operations.

**Expected Function Signature**: `private static void demonstrateCombinedOperations()`

**Requirements**:
- Print section header: "Combined Operations - The Real Power:"
- Use sample data: `Arrays.asList("Hello", "World", "Java", "Streams", "Are", "Powerful", "And", "Fun")`
- Demonstrate complex operation chains:
  - Filter → Map → Sort → Collect pipeline
  - Filter → Map → Join operation using `Collectors.joining()`
  - Filter → Count operation
- Show how intermediate operations are lazy and terminal operations trigger execution
- Emphasize the declarative nature and readability

**Implementation Pattern**:
```java
// Complex chained operations
words.stream()
    .filter(word -> word.length() > 3)          // Intermediate: filter
    .map(String::toLowerCase)                   // Intermediate: transform
    .sorted()                                   // Intermediate: sort
    .toList();                                  // Terminal: collect

// Join operation
words.stream()
    .filter(word -> word.length() <= 5)
    .map(String::toUpperCase)
    .collect(Collectors.joining(", "));

// Count operation
words.stream()
    .filter(word -> word.length() <= 3)
    .count();
```

## Key Concepts Demonstrated

### Stream Characteristics
- **Lazy Evaluation**: Intermediate operations are not executed until a terminal operation is called
- **Immutability**: Original collections remain unchanged
- **Chaining**: Operations can be linked together for complex data processing
- **Readability**: Declarative style is more readable than imperative loops

### Operation Types
1. **Intermediate Operations** (return Stream):
   - `filter()` - select elements matching criteria
   - `map()` - transform elements
   - `sorted()` - sort elements
   - `limit()` - limit number of elements

2. **Terminal Operations** (trigger execution):
   - `forEach()` - perform action on each element
   - `collect()` - gather results into collection
   - `count()` - count elements
   - `toList()` - collect to List (Java 16+)

### Functional Programming Benefits
- **Declarative**: Describe what you want, not how to do it
- **Composable**: Operations can be easily combined
- **Readable**: Code intent is clear and concise
- **Maintainable**: Easier to modify and understand

## Prerequisites
- Understanding of lambda expressions (see LambdaBasics.java)
- Basic knowledge of Java collections
- Familiarity with functional interfaces like Predicate and Function

## Next Steps
After mastering these basics, explore:
- Parallel streams for performance
- Custom collectors
- Stream operations with complex objects
- Integration with Optional for null safety
