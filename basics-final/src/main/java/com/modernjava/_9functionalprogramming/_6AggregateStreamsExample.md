# _6AggregateStreamsExample.java - Stream API Aggregate Operations

<!-- TOC -->
* [_6AggregateStreamsExample.java - Stream API Aggregate Operations](#_6aggregatestreamsexamplejava---stream-api-aggregate-operations)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: count() - Counting Stream Elements](#prompt-1-count---counting-stream-elements)
    * [Prompt 2: reduce() - Custom Reduction Operations](#prompt-2-reduce---custom-reduction-operations)
    * [Prompt 3: min() and max() - Finding Extremes](#prompt-3-min-and-max---finding-extremes)
    * [Prompt 4: Primitive Stream Aggregations](#prompt-4-primitive-stream-aggregations)
    * [Prompt 5: collect() - Advanced Aggregation with Collectors](#prompt-5-collect---advanced-aggregation-with-collectors)
    * [Prompt 6: Real-World Examples - Combining Multiple Operations](#prompt-6-real-world-examples---combining-multiple-operations)
  * [Key Learning Points](#key-learning-points)
    * [Aggregate Operation Comparison](#aggregate-operation-comparison)
    * [Performance Considerations](#performance-considerations)
    * [Optional Handling Best Practices](#optional-handling-best-practices)
  * [Common Use Cases](#common-use-cases)
<!-- TOC -->

## Overview
This file demonstrates the comprehensive use of Stream API aggregate operations in Java, focusing on six primary aggregation methods: `count()`, `reduce()`, `min()`, `max()`, primitive stream aggregations (`sum()`, `average()`), and `collect()`. It progresses from basic element counting to complex aggregation scenarios with practical examples using students grades and various data structures. The class serves as a complete guide to understanding different aggregation patterns, terminal operations, Optional handling, and performance considerations in functional programming with streams.

## Prompts for Replication

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
    System.out.println("1. Count Operation:");
    System.out.println("   count() returns the number of elements in the stream as a long\n");
    
    List<String> words = Arrays.asList("java", "stream", "aggregate", "operations", "count");
    System.out.println("Original list: " + words);
    
    long totalWords = words.stream().count();
    System.out.println("Total words: " + totalWords);
    
    long longWords = words.stream()
                          .filter(word -> word.length() > 5)
                          .count();
    System.out.println("Words longer than 5 characters: " + longWords);
    
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
Optional<Integer> min = numbers.stream().min(Integer::compareTo);
Optional<Integer> max = numbers.stream().max(Integer::compareTo);

System.out.println("Minimum: " + min.orElse(0));
System.out.println("Maximum: " + max.orElse(0));

Optional<String> shortest = words.stream()
                                 .min(Comparator.comparing(String::length));
Optional<String> longest = words.stream()
                               .max(Comparator.comparing(String::length));
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

---

### Prompt 6: Real-World Examples - Combining Multiple Operations
**Task**: Create a method demonstrating practical scenarios combining multiple aggregate operations.

**Expected Function Signature**: `private static void demonstrateRealWorldExamples()`

**Requirements**:
- Print section header: "6. Real-World Examples:"
- Explain: "Combining multiple operations for practical scenarios"
- Use Student domain object with name, grade, subject properties
- Sample data: 8 students with Math, Physics, Chemistry subjects and varying grades (70-96)
- Show overall statistics section:
  - Total students count
  - Average grade across all students
  - Grade range (min-max)
- Show subject-wise analysis:
  - Count students per subject
  - Average grade per subject
  - Top student per subject (name and grade)
- Show advanced analysis:
  - Students above average count
  - Grade distribution (A, B, C, D grades)
- Use Collectors.groupingBy() for subject-based aggregations
- Use Comparator.comparing() for top student selection
- Include multiple subsections: a) Overall statistics, b) Subject-wise analysis, c) Advanced analysis
- Format percentages and decimals appropriately

**Key Analyses**:
```
a) Overall statistics (total, average, range)
b) Subject-wise analysis (count per subject, average by subject, top student)
c) Advanced analysis (above average count, grade distribution)
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

