# _5AggregateStreamsExample.java - Stream API Aggregate Operations

<!-- TOC -->
* [_5AggregateStreamsExample.java - Stream API Aggregate Operations](#_5aggregatestreamsexamplejava---stream-api-aggregate-operations)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: count() - Counting Stream Elements](#prompt-1-count---counting-stream-elements)
    * [Prompt 2: reduce() - Custom Reduction Operations](#prompt-2-reduce---custom-reduction-operations)
    * [Prompt 3: min() and max() - Finding Extremes](#prompt-3-min-and-max---finding-extremes)
    * [Prompt 4: Primitive Stream Aggregations](#prompt-4-primitive-stream-aggregations)
    * [Prompt 5: collect() - Advanced Aggregation with Collectors](#prompt-5-collect---advanced-aggregation-with-collectors)
  * [Key Learning Points](#key-learning-points)
    * [Aggregate Operation Comparison](#aggregate-operation-comparison)
    * [Performance Considerations](#performance-considerations)
    * [Optional Handling Best Practices](#optional-handling-best-practices)
  * [Common Use Cases](#common-use-cases)
<!-- TOC -->

## Overview
This file demonstrates the comprehensive use of Stream API aggregate operations in Java, focusing on five primary aggregation methods: `count()`, `reduce()`, `min()`, `max()`, primitive stream aggregations (`sum()`, `average()`), and `collect()`. It progresses from basic element counting to advanced aggregation scenarios with collectors and practical examples. The class serves as a complete guide to understanding different aggregation patterns, terminal operations, Optional handling, and performance considerations in functional programming with streams.

## Main Method Execution Order

The `main()` method demonstrates the aggregate operations in the following sequence:

```java
public static void main(String[] args) {
    System.out.println("=== Java Stream Aggregate Operations ===\n");

    // 1. Basic count operation
    demonstrateCount();

    // 2. Min and Max operations with Optional handling
    demonstrateMinMax();

    // 3. Primitive stream aggregations (sum, average, etc.)
    demonstratePrimitiveStreamAggregation();

    // 4. Reduce operations - the foundation of aggregation
    demonstrateReduce();

    // 5. Advanced aggregation with collectors
    demonstrateCollectors();
}
```

---

### Prompt 1: count() - Counting Stream Elements
**Task**: Create a method demonstrating `count()` as the simplest aggregate function.

**Expected Function Signature**: `private static void demonstrateCount()`

**Requirements**:
- Print section header: "1. Count Operation:"
- Explain: "count() returns the number of elements in the stream as a long"
- Show basic count: `words.stream().count()`
- Demonstrate count with filtering: `words.stream().filter(word -> word.length() > 5).count()`
- Show counting distinct elements: `duplicates.stream().distinct().count()`
- Use sample data: words list and duplicates list
- Print results with descriptive labels
- Add separator line after outputs

**Implementation Pattern**:
```java
private static void demonstrateCount() {
    // Print section title and short description
    System.out.println("1. Count Operation:");
    System.out.println("   count() returns the number of elements in the stream as a long\n");

    // Create a sample list of words
    List<String> words = List.of("java", "stream", "aggregate", "operations", "count");
    System.out.println("Original list: " + words);

    // Count all items in the stream
    long totalWords = words.stream().count();
    System.out.println("Total words: " + totalWords);

    // Count items after filtering by length
    long longWords = words.stream()
                          .filter(word -> word.length() > 5)
                          .count();
    System.out.println("Words longer than 5 characters: " + longWords);

    // Prepare a list with duplicate entries
    List<String> duplicates = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
    // Count distinct elements using distinct()
    long distinctFruits = duplicates.stream()
                                   .distinct()
                                   .count();
    System.out.println("Distinct fruits from " + duplicates + ": " + distinctFruits);

    // Print a separator line to end the section
    System.out.println("─────────────────────────────────────────────────────────\n");
}
```

---

### Prompt 2: reduce() - Custom Reduction Operations
**Task**: Create a method demonstrating `reduce()` as the most flexible aggregate operation.

**Expected Function Signature**: `private static void demonstrateReduce()`

**Requirements**:
- Print section header: "2. Reduce Operations:"
- Explain: "reduce() combines stream elements using a binary operator"
- Show basic reduce with identity: `numbers.stream().reduce(0, (a, b) -> a + b)` for sum
- Demonstrate using method references: `reduce(0, Integer::sum)`
- Show product calculation: `reduce(1, (a, b) -> a * b)`
- Show reduce without identity (returns Optional): `numbers.stream().reduce((a, b) -> a + b)`
- Demonstrate max using reduce: `reduce(Integer::max)`
- Show string concatenation: basic and space-separated
- Show complex reduction for longest string
- Include multiple sections with subsection labels: a), b), c), d)
- Use Optional methods for safe extraction

**Key Sections**:
```
a) Basic reduce with identity
b) Reduce without identity (returns Optional)
c) String concatenation with reduce
d) Complex reduction - longest string
```

**Implementation Pattern**:
```java
private static void demonstrateReduce() {
    // Print section title and short description
    System.out.println("2. Reduce Operations:");
    System.out.println("   reduce() combines stream elements using a binary operator\n");

    // Create a sample list of numbers
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println("Numbers: " + numbers);

    // Print subsection header
    System.out.println("\na) Basic reduce with identity:");
    // Sum all numbers using reduce with lambda expression
    int sum = numbers.stream()
                     .reduce(0, (a, b) -> a + b);
    System.out.println("Sum using reduce: " + sum);

    // Sum all numbers using reduce with method reference
    int sumMethodRef = numbers.stream()
                              .reduce(0, Integer::sum);
    System.out.println("Sum using method reference: " + sumMethodRef);

    // Calculate product of all numbers using reduce
    int product = numbers.stream()
                         .reduce(1, (a, b) -> a * b);
    System.out.println("Product using reduce: " + product);

    // Print subsection header
    System.out.println("\nb) Reduce without identity (returns Optional):");
    // Sum numbers without identity value - returns Optional
    Optional<Integer> sumOptional = numbers.stream()
                                          .reduce((a, b) -> a + b);
    System.out.println("Sum as Optional: " + sumOptional.orElse(0));

    // Find maximum number using reduce with Integer::max method reference
    Optional<Integer> max = numbers.stream()
                                  .reduce(Integer::max);
    System.out.println("Maximum using reduce: " + max.orElse(0));

    // Print subsection header
    System.out.println("\nc) String concatenation with reduce:");
    // Create a sample list of words
    List<String> words = Arrays.asList("Java", "Stream", "Reduce", "Example");
    System.out.println("Words: " + words);

    // Concatenate all strings without separator
    String concatenated = words.stream()
                               .reduce("", (a, b) -> a + b);
    System.out.println("Concatenated: '" + concatenated + "'");

    // Concatenate all strings with space separator
    String spaceSeparated = words.stream()
                                 .reduce("", (a, b) -> a.isEmpty() ? b : a + " " + b);
    System.out.println("Space separated: '" + spaceSeparated + "'");

    // Print subsection header
    System.out.println("\nd) Complex reduction - longest string:");
    // Find the longest word using reduce with custom comparator logic
    Optional<String> longest = words.stream()
                                    .reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2);
    System.out.println("Longest word: " + longest.orElse("none"));

    // Print a separator line to end the section
    System.out.println("─────────────────────────────────────────────────────────\n");
}
```

---

### Prompt 3: min() and max() - Finding Extremes
**Task**: Create a method showing `min()` and `max()` operations with Optional handling.

**Expected Function Signature**: `private static void demonstrateMinMax()`

**Requirements**:
- Print section header: "3. Min and Max Operations:"
- Explain: "min() and max() return Optional<T> to handle empty streams safely"
- Show basic min/max: `numbers.stream().min(Integer::compareTo)`
- Demonstrate using Comparator: `min(Comparator.naturalOrder())`
- Show string-based comparisons:
  - Shortest and longest strings by length
  - Alphabetical ordering (first and last alphabetically)
- Demonstrate handling empty streams: `emptyList.stream().min(...)`
- Show Optional methods: `orElse()` and `isPresent()`
- Include examples with both integers and strings
- Add descriptive output for each operation

**Implementation Pattern**:
```java
private static void demonstrateMinMax() {
    // Print section title and short description
    System.out.println("3. Min and Max Operations:");
    System.out.println("   min() and max() return Optional<T> to handle empty streams safely\n");

    // Create a sample list of numbers
    List<Integer> numbers = Arrays.asList(15, 3, 8, 21, 7, 12, 4, 19, 6, 10);
    System.out.println("Numbers: " + numbers);

    // Find minimum and maximum values from the list
    Optional<Integer> min = numbers.stream().min(Integer::compareTo);
    Optional<Integer> max = numbers.stream().max(Integer::compareTo);

    System.out.println("Minimum: " + min.orElse(0));
    System.out.println("Maximum: " + max.orElse(0));

    // Find min and max using natural ordering comparator
    Optional<Integer> minNatural = numbers.stream().min(Comparator.naturalOrder());
    Optional<Integer> maxNatural = numbers.stream().max(Comparator.naturalOrder());

    System.out.println("Min (natural order): " + minNatural.orElse(0));
    System.out.println("Max (natural order): " + maxNatural.orElse(0));

    // Print section for string comparisons
    System.out.println("\nString comparisons:");
    // Create a sample list of words
    List<String> words = Arrays.asList("elephant", "cat", "butterfly", "dog", "ant");
    System.out.println("Words: " + words);

    // Find shortest and longest strings by comparing their lengths
    Optional<String> shortest = words.stream()
                                     .min(Comparator.comparing(String::length));
    Optional<String> longest = words.stream()
                                    .max(Comparator.comparing(String::length));

    System.out.println("Shortest word: " + shortest.orElse("none"));
    System.out.println("Longest word: " + longest.orElse("none"));

    // Find first and last words in alphabetical order
    Optional<String> firstAlpha = words.stream().min(String::compareTo);
    Optional<String> lastAlpha = words.stream().max(String::compareTo);

    System.out.println("First alphabetically: " + firstAlpha.orElse("none"));
    System.out.println("Last alphabetically: " + lastAlpha.orElse("none"));

    // Print section for handling empty streams
    System.out.println("\nHandling empty streams:");
    // Create an empty list to demonstrate Optional behavior
    List<Integer> emptyList = Arrays.asList();
    // Try to find minimum in empty stream - returns empty Optional
    Optional<Integer> emptyMin = emptyList.stream().min(Integer::compareTo);

    System.out.println("Min of empty stream: " + emptyMin.orElse(-1));
    System.out.println("Is empty result present? " + emptyMin.isPresent());

    // Print a separator line to end the section
    System.out.println("─────────────────────────────────────────────────────────\n");
}
```

---

### Prompt 4: Primitive Stream Aggregations
**Task**: Create a method demonstrating specialized operations for IntStream, LongStream, DoubleStream.

**Expected Function Signature**: `private static void demonstratePrimitiveStreamAggregation()`

**Requirements**:
- Print section header: "4. Primitive Stream Aggregations:"
- Explain: "Specialized operations for IntStream, LongStream, DoubleStream"
- Show IntStream operations: sum(), average(), min(), max(), count()
- Demonstrate LongStream operations on large numbers
- Show DoubleStream operations with formatting
- Demonstrate converting to primitive streams: `mapToInt()`, `mapToLong()`, `mapToDouble()`
- Show practical examples: sum of squares
- Include multiple subsections: a) IntStream, b) LongStream, c) DoubleStream, d) Converting to primitive streams
- Use OptionalInt, OptionalLong, OptionalDouble for safe value extraction
- Format floating-point results appropriately

**Key Operations**:
```
a) IntStream operations (sum, average, min, max, count)
b) LongStream operations
c) DoubleStream operations
d) Converting to primitive streams (mapToInt, calculating sum of squares)
```

**Implementation Pattern**:
```java
private static void demonstratePrimitiveStreamAggregation() {
    // Print section title and short description
    System.out.println("4. Primitive Stream Aggregations:");
    System.out.println("   Specialized operations for IntStream, LongStream, DoubleStream\n");

    // Print subsection header for IntStream operations
    System.out.println("a) IntStream operations:");
    // Create a sample array of integers
    int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("Array: " + Arrays.toString(intArray));

    // Convert array to IntStream for operations
    IntStream intStream = Arrays.stream(intArray);

    // Calculate sum of all elements in the stream
    int sum = intStream.sum();
    System.out.println("Sum: " + sum);

    // Calculate average of all elements - streams can only be consumed once, so we create new streams
    OptionalDouble average = Arrays.stream(intArray).average();
    System.out.println("Average: " + average.orElse(0.0));

    // Find minimum and maximum values in the stream
    OptionalInt min = Arrays.stream(intArray).min();
    OptionalInt max = Arrays.stream(intArray).max();
    System.out.println("Min: " + min.orElse(0) + ", Max: " + max.orElse(0));

    // Count the number of elements in the stream
    long count = Arrays.stream(intArray).count();
    System.out.println("Count: " + count);

    // Print subsection header for LongStream operations
    System.out.println("\nb) LongStream operations:");
    // Create a sample array of long values
    long[] longArray = {1000000L, 2000000L, 3000000L, 4000000L, 5000000L};
    System.out.println("Long array: " + Arrays.toString(longArray));

    // Calculate sum of all long values in the stream
    long longSum = Arrays.stream(longArray).sum();
    System.out.println("Long sum: " + longSum);

    // Calculate average of all long values
    OptionalDouble longAverage = Arrays.stream(longArray).average();
    System.out.println("Long average: " + longAverage.orElse(0.0));

    // Print subsection header for DoubleStream operations
    System.out.println("\nc) DoubleStream operations:");
    // Create a sample array of double values
    double[] doubleArray = {3.14, 2.71, 1.41, 1.73, 0.57};
    System.out.println("Double array: " + Arrays.toString(doubleArray));

    // Calculate sum of all double values in the stream
    double doubleSum = Arrays.stream(doubleArray).sum();
    System.out.println("Double sum: " + String.format("%.4f", doubleSum));

    // Calculate average of all double values
    OptionalDouble doubleAverage = Arrays.stream(doubleArray).average();
    System.out.println("Double average: " + String.format("%.4f", doubleAverage.orElse(0.0)));

    // Print subsection header for converting to primitive streams
    System.out.println("\nd) Converting Wrapper Classes to primitive streams:");
    // Create a sample list of integers
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

    // Convert Integer objects to IntStream for sum operation
    int streamSum = numbers.stream()
                           .mapToInt(Integer::intValue)
                           .sum();
    System.out.println("Sum using mapToInt: " + streamSum);

    // Calculate sum of squares by mapping each number to its square
    int sumOfSquares = numbers.stream()
                              .mapToInt(n -> n * n)
                              .sum();
    System.out.println("Sum of squares: " + sumOfSquares);

    // Using IntStream.range to generate a range of integers and sum them
    int sumIntRange = IntStream.range(0,10)
            .sum();
    System.out.println("Sum of IntStream.range(0,10): " + sumIntRange);

    // Print a separator line to end the section
    System.out.println("─────────────────────────────────────────────────────────\n");
}
```

---

### Prompt 5: collect() - Advanced Aggregation with Collectors
**Task**: Create a method showcasing `collect()` with built-in and custom collectors.

**Expected Function Signature**: `private static void demonstrateCollectors()`

**Requirements**:
- Print section header: "5. Advanced Aggregation with Collectors:"
- Explain: "Using collect() with built-in and custom collectors"
- Show string joining: basic, with separator, with prefix/suffix
- Demonstrate grouping by property: `groupingBy(String::length)`
- Show counting with collectors: `groupingBy(..., Collectors.counting())`
- Demonstrate statistical collectors: `summarizingInt()`
- Show IntSummaryStatistics methods: getCount(), getSum(), getAverage(), getMin(), getMax()
- Include subsections: a) String joining, b) Grouping by length, c) Counting with collectors, d) Statistical collectors
- Use Map and List for collected results
- Print collected data in readable format

**Key Patterns**:
```
a) String joining (no separator, with separator, with prefix/suffix)
b) Grouping by length
c) Counting with collectors
d) Statistical collectors (IntSummaryStatistics)
```

**Implementation Pattern**:
```java
private static void demonstrateCollectors() {
    // Print section title and short description
    System.out.println("5. Advanced Aggregation with Collectors:");
    System.out.println("   Using collect() with built-in and custom collectors\n");

    // Create a sample list of words
    List<String> words = Arrays.asList("java", "stream", "collect", "aggregate", "reduce", "map", "filter");
    System.out.println("Words: " + words);

    // Print subsection header for joining strings
    System.out.println("\na) String joining:");
    // Join all words without any separator
    String joined = words.stream().collect(Collectors.joining());
    System.out.println("Joined: " + joined);

    // Join all words with comma and space separator
    String commaSeparated = words.stream().collect(Collectors.joining(", "));
    System.out.println("Comma separated: " + commaSeparated);

    // Join all words with separators and prefix/suffix
    String withPrefix = words.stream().collect(Collectors.joining(", ", "[", "]"));
    System.out.println("With prefix/suffix: " + withPrefix);

    // Print subsection header for statistical collectors
    System.out.println("\nd) Statistical collectors:");
    // Create a sample list of numbers for statistical analysis
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Collect statistics for the list of integers
    IntSummaryStatistics stats = numbers.stream()
                                       .collect(Collectors.summarizingInt(Integer::intValue));

    // Print the collected statistics
    System.out.println("Statistics: " + stats);
    System.out.println("Count: " + stats.getCount());
    System.out.println("Sum: " + stats.getSum());
    System.out.println("Average: " + stats.getAverage());
    System.out.println("Min: " + stats.getMin());
    System.out.println("Max: " + stats.getMax());

    // Print a separator line to end the section
    System.out.println("─────────────────────────────────────────────────────────\n");
}
```

---

## Key Learning Points

### Aggregate Operation Comparison
| Operation | Return Type | Purpose | Use Case |
|-----------|------------|---------|----------|
| `count()` | `long` | Count elements in stream | Get total number of elements |
| `reduce()` | `T` or `Optional<T>` | Combine elements with operator | Custom aggregations |
| `min()` | `Optional<T>` | Find minimum element | Find smallest value with comparator |
| `max()` | `Optional<T>` | Find maximum element | Find largest value with comparator |
| `sum()` | Primitive type | Sum of all elements (primitive streams) | Add all numeric values |
| `average()` | `OptionalDouble` | Mean of all elements (primitive streams) | Calculate mean of numbers |
| `collect()` | Custom type | Flexible aggregation with collectors | Group, join, or transform data |

### Performance Considerations
- **Terminal Operations**: All aggregate operations are terminal and trigger stream execution
- **Lazy Evaluation**: Intermediate operations are only executed when a terminal operation is called
- **Short-circuit**: Some operations like `reduce()` on finite streams complete quickly
- **Primitive Streams**: IntStream, LongStream, DoubleStream have specialized methods without Optional wrapping
- **Parallelization**: Aggregate operations work well with `parallelStream()` for large datasets
- **Single Consumption**: Streams can only be consumed once; create new streams for multiple operations

### Optional Handling Best Practices
- Use `orElse()` for default values when Optional might be empty
- Use `isPresent()` to check if Optional contains a value
- Use `ifPresent()` for side effects when value is present
- Use `map()` for transformations on Optional values
- Avoid `isPresent()` followed by `get()` - use `map()` or `orElse()` instead
- For numeric operations, use OptionalInt, OptionalLong, OptionalDouble

## Common Use Cases
1. **Data Analysis**: Using count(), sum(), average() for statistical analysis
2. **Data Grouping**: Using collect() with groupingBy() to organize data by categories
3. **Validation**: Using min(), max() with Comparator for constraint checking
4. **Reporting**: Combining multiple aggregate operations for comprehensive reports
5. **Quality Metrics**: Calculating statistics and distributions for data quality assessment
6. **Performance Analysis**: Using primitive stream aggregations for numerical computations

---

## Key Takeaways for Aggregate Operations

### 1. TERMINAL OPERATIONS
- All aggregate operations are terminal (end the stream)
- They trigger the execution of the entire stream pipeline
- Once consumed, streams cannot be reused

### 2. OPTIONAL HANDLING
- `min()` and `max()` return `Optional` to handle empty streams
- Always use `orElse()`, `orElseGet()`, or check `isPresent()`
- `OptionalInt`, `OptionalLong`, `OptionalDouble` for primitive streams

### 3. PRIMITIVE STREAMS
- `IntStream`, `LongStream`, `DoubleStream` have specialized methods
- `sum()`, `average()` available without Optional wrapping
- Use `mapToInt()`, `mapToLong()`, `mapToDouble()` to convert wrapper types
- `IntStream.range()` efficiently generates numeric ranges

### 4. REDUCE FLEXIBILITY
- Most powerful aggregate operation
- Can implement any other aggregate operation
- Three forms: with identity, without identity, with combiner
- Useful for custom aggregations beyond standard collectors

### 5. COLLECTORS
- Powerful tool for complex aggregations
- Built-in collectors for common operations (joining, grouping, summarizing)
- `Collectors.summarizingInt()` returns `IntSummaryStatistics` with count, sum, average, min, max
- Can create custom collectors for specific needs

### 6. PERFORMANCE CONSIDERATIONS
- Aggregate operations can be parallelized with `parallelStream()`
- Consider using parallel streams for large datasets
- Primitive streams are more efficient for numeric operations
- Streams can only be consumed once - create new streams for multiple operations

