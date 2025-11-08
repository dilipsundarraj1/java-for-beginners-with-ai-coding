# _5StreamSearchExample.java - Stream API Search Functions

<!-- TOC -->
* [_5StreamSearchExample.java - Stream API Search Functions](#_5streamsearchexamplejava---stream-api-search-functions)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: findFirst() - Finding the First Matching Element](#prompt-1-findfirst---finding-the-first-matching-element)
    * [Prompt 2: findAny() - Finding Any Matching Element](#prompt-2-findany---finding-any-matching-element)
    * [Prompt 3: anyMatch() - Testing if Any Element Matches](#prompt-3-anymatch---testing-if-any-element-matches)
    * [Prompt 4: allMatch() - Testing if All Elements Match](#prompt-4-allmatch---testing-if-all-elements-match)
    * [Prompt 5: noneMatch() - Testing if No Elements Match](#prompt-5-nonematch---testing-if-no-elements-match)
    * [Prompt 6: Best Practices - Effective Search Function Usage](#prompt-6-best-practices---effective-search-function-usage)
  * [Key Learning Points](#key-learning-points)
    * [Search Function Comparison](#search-function-comparison)
    * [Performance Considerations](#performance-considerations)
    * [Optional Handling Best Practices](#optional-handling-best-practices)
  * [Common Use Cases](#common-use-cases)
<!-- TOC -->

## Overview
This file demonstrates the comprehensive use of Stream API search functions in Java, focusing on five primary search operations: `findFirst()`, `findAny()`, `anyMatch()`, `allMatch()`, and `noneMatch()`. It progresses from basic element finding to complex matching scenarios with practical examples. The class serves as a complete guide to understanding different search patterns, Optional handling, and performance considerations in functional programming with streams.

## Prompts for Replication

### Prompt 1: findFirst() - Finding the First Matching Element
**Task**: Create a method demonstrating `findFirst()` for locating the first element that matches specific criteria.

**Expected Function Signature**: `private static void demonstrateFindFirst()`

**Requirements**:
- Print section header: "=== findFirst() - Finding the First Element ==="
- Explain: "findFirst() returns Optional<T> - empty if no element found"
- Show fruit filtering: `fruits.stream().filter(fruit -> fruit.startsWith("C")).findFirst()`
- Demonstrate number filtering: `numbers.stream().filter(n -> n % 2 == 0).findFirst()`
- Show complex filtering: `numbers.stream().filter(n -> n > 10).findFirst()`
- Use `Optional` methods: `orElse()`, `ifPresentOrElse()`
- Handle empty results gracefully

**Implementation Pattern**:
```java
Optional<String> firstFruitWithC = fruits.stream()
        .filter(fruit -> fruit.startsWith("C"))
        .findFirst();
System.out.println("First fruit starting with 'C': " + firstFruitWithC.orElse("Not found"));
```

---

### Prompt 2: findAny() - Finding Any Matching Element
**Task**: Create a method showing `findAny()` for retrieving any element that matches criteria, typically behaves like findFirst() in sequential streams.

**Expected Function Signature**: `private static void demonstrateFindAny()`

**Requirements**:
- Print section header: "=== findAny() - Finding Any Matching Element ==="
- Explain: "Useful for parallel streams where first element might be expensive to find"
- Show sequential example: `colors.stream().filter(color -> color.length() > 4).findAny()`
- Show second example: `colors.stream().filter(color -> color.startsWith("G")).findAny()`
- Explain behavior in sequential streams: "In sequential streams, findAny() typically returns the same result as findFirst()"
- Note: "The difference becomes significant with parallel streams (covered in separate lecture)"
- Use `Optional.orElse()` for safe value extraction

**Sequential Processing Example**:
```java
Optional<String> anyLongColor = colors.stream()
        .filter(color -> color.length() > 4)
        .findAny();
System.out.println("Any color with length > 4: " + anyLongColor.orElse("None"));
```

### Prompt 3: anyMatch() - Testing if Any Element Matches
**Task**: Create a method demonstrating `anyMatch()` for checking if at least one element satisfies a condition.

**Expected Function Signature**: `private static void demonstrateAnyMatch()`

**Requirements**:
- Print section header: "=== anyMatch() - Testing if Any Element Matches ==="
- Explain: "Returns boolean - true if at least one element matches"
- Show string matching: `names.stream().anyMatch(name -> name.startsWith("C"))`
- Demonstrate numeric conditions: `scores.stream().anyMatch(score -> score > 95)`
- Show object property matching: `people.stream().anyMatch(person -> person.age() < 18)`
- Include complex conditions: `names.stream().anyMatch(name -> name.toLowerCase().contains("e"))`
- Use meaningful variable names and clear output messages

**Boolean Logic Pattern**:
```java
boolean hasNameWithC = names.stream().anyMatch(name -> name.startsWith("C"));
System.out.println("Any name starting with 'C'? " + hasNameWithC);
```

---

### Prompt 4: allMatch() - Testing if All Elements Match
**Task**: Create a method showing `allMatch()` for verifying that every element satisfies a condition.

**Expected Function Signature**: `private static void demonstrateAllMatch()`

**Requirements**:
- Print section header: "=== allMatch() - Testing if All Elements Match ==="
- Explain: "Returns boolean - true only if ALL elements match"
- Compare different datasets: short words vs. mixed words
- Show numeric validation: positive numbers vs. mixed numbers
- Demonstrate object validation: `adults.stream().allMatch(person -> person.age() >= 18)`
- Include contrasting examples (true and false cases)
- Use descriptive boolean variable names

**Validation Pattern**:
```java
boolean allShort = shortWords.stream().allMatch(word -> word.length() <= 3);
boolean allShortMixed = mixedWords.stream().allMatch(word -> word.length() <= 3);
```

---

### Prompt 5: noneMatch() - Testing if No Elements Match
**Task**: Create a method demonstrating `noneMatch()` for ensuring no elements satisfy a condition.

**Expected Function Signature**: `private static void demonstrateNoneMatch()`

**Requirements**:
- Print section header: "=== noneMatch() - Testing if No Elements Match ==="
- Explain: "Returns boolean - true only if NO elements match"
- Show exclusion checking: `fruits.stream().noneMatch(fruit -> fruit.startsWith("Z"))`
- Demonstrate data integrity: `evenNumbers.stream().noneMatch(num -> num % 2 != 0)`
- Show validation scenarios: `youngPeople.stream().noneMatch(person -> person.age() >= 18)`
- Include meaningful real-world examples
- Contrast with both even and odd number lists

**Exclusion Pattern**:
```java
boolean noFruitWithZ = fruits.stream().noneMatch(fruit -> fruit.startsWith("Z"));
System.out.println("No fruit starts with 'Z'? " + noFruitWithZ);
```

---

### Prompt 6: Best Practices - Effective Search Function Usage
**Task**: Create a method showcasing best practices, performance considerations, and common patterns.

**Expected Function Signature**: `private static void demonstrateSearchBestPractices()`

**Requirements**:
- Print section header: "=== Search Functions: Best Practices ==="
- Show null safety: `data.stream().filter(Objects::nonNull).findFirst()`
- Demonstrate Optional handling: `ifPresent()`, `orElse()`, `map()`
- Performance tips: Use `anyMatch()` instead of `findFirst().isPresent()`
- Show method chaining with Optional
- Explain short-circuit evaluation benefits
- Include practical combining patterns

**Best Practice Examples**:
```java
// Safe null handling
Optional<String> firstNonNull = data.stream()
        .filter(Objects::nonNull)
        .filter(item -> !item.isEmpty())
        .findFirst();

// Effective Optional usage
String message = firstEven
        .map(num -> "Found even: " + num)
        .orElse("No even number found");
```

## Key Learning Points

### Search Function Comparison
| Function | Return Type | Purpose | Stops When |
|----------|-------------|---------|------------|
| `findFirst()` | `Optional<T>` | Find first matching element | First match found |
| `findAny()` | `Optional<T>` | Find any matching element | Any match found |
| `anyMatch()` | `boolean` | Check if any element matches | First match found |
| `allMatch()` | `boolean` | Check if all elements match | First non-match found |
| `noneMatch()` | `boolean` | Check if no elements match | First match found |

### Performance Considerations
- **Short-circuit evaluation**: All search functions stop processing as soon as the result is determined
- **Parallel processing**: `findAny()` is more efficient than `findFirst()` in parallel streams
- **Existence checking**: Use `anyMatch()` instead of `findFirst().isPresent()` when you only need to know if an element exists

### Optional Handling Best Practices
- Use `ifPresent()` for side effects
- Use `orElse()` for default values
- Use `map()` for transformations
- Avoid `isPresent()` followed by `get()`

## Common Use Cases
1. **Data Validation**: Using `allMatch()` and `noneMatch()` for input validation
2. **Search Operations**: Using `findFirst()` and `findAny()` for element retrieval
3. **Conditional Processing**: Using `anyMatch()` for conditional logic
4. **Quality Assurance**: Combining multiple search functions for comprehensive data checking
