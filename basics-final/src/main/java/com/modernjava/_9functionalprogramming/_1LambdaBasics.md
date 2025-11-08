# LambdaBasics.java - Introduction to Lambda Expressions in Java

<!-- TOC -->
* [LambdaBasics.java - Introduction to Lambda Expressions in Java](#lambdabasicsjava---introduction-to-lambda-expressions-in-java)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Simple Uppercase Operation Comparison](#prompt-1-simple-uppercase-operation-comparison)
    * [Prompt 2: Traditional Anonymous Class Problem](#prompt-2-traditional-anonymous-class-problem)
    * [Prompt 3: Lambda Expression Solutions](#prompt-3-lambda-expression-solutions)
    * [Prompt 4: Functional Interfaces Deep Dive](#prompt-4-functional-interfaces-deep-dive)
    * [Prompt 5: Lambdas with Collection Operations](#prompt-5-lambdas-with-collection-operations)
    * [Prompt 6: Method References as Lambda Shortcuts](#prompt-6-method-references-as-lambda-shortcuts)
  * [Key Learning Objectives](#key-learning-objectives)
    * [1. Lambda Expression Fundamentals](#1-lambda-expression-fundamentals)
    * [2. Progressive Complexity](#2-progressive-complexity)
    * [3. Readability and Maintainability](#3-readability-and-maintainability)
    * [4. Foundation for Streams](#4-foundation-for-streams)
  * [Class Structure Analysis](#class-structure-analysis)
  * [Connection to Other Modules](#connection-to-other-modules)
<!-- TOC -->
## Overview
This file introduces lambda expressions in Java, demonstrating how they simplify functional programming compared to traditional approaches. It progresses from simple String operations to complex functional interfaces, showing the evolution from verbose anonymous classes to concise lambda expressions and method references. The class serves as a foundation for understanding functional programming concepts before applying them to complex object types.

## Prompts for Replication

### Prompt 1: Simple Uppercase Operation Comparison
**Task**: Create a method demonstrating traditional vs lambda vs method reference approaches for uppercase conversion.

**Expected Function Signature**: `private static void demonstrateSimpleExample()`

**Requirements**:
- Print section header: "1. Simple Example - Converting to Uppercase:"
- Use sample words: `Arrays.asList("java", "python", "javascript")`
- Show traditional approach using enhanced for loop with explicit ArrayList creation
- Demonstrate lambda syntax with `forEach(word -> ...)`
- Show method reference approach with `String::toUpperCase`
- Include progression summary explaining readability improvements

**Implementation Pattern**:
```java
// Traditional
List<String> result = new ArrayList<>();
for (String word : words) {
    result.add(word.toUpperCase());
}

// Lambda
words.forEach(word -> System.out.print(word.toUpperCase() + " "));

// Method Reference
words.stream().map(String::toUpperCase).forEach(...)
```

---

### Prompt 2: Traditional Anonymous Class Problem
**Task**: Create a method showing the verbosity problem that lambdas solve.

**Expected Function Signature**: `private static void demonstrateTraditionalApproach()`

**Requirements**:
- Print section header: "2. More Complex Example - Traditional vs Lambda:"
- Use sample names: `Arrays.asList("Alice", "Bob", "Charlie", "Diana")`
- Show traditional anonymous class approach with `Collections.sort()` and `Comparator<String>`
- Demonstrate sorting by string length using anonymous class
- Explain the verbosity problem: "focuses on 'how' not 'what'"
- Print original list and sorted result

**Anonymous Class Pattern**:
```java
Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
});
```

---

### Prompt 3: Lambda Expression Solutions
**Task**: Create a method showing how lambdas solve the verbosity problem.

**Expected Function Signature**: `private static void introduceLambdaExpressions()`

**Requirements**:
- Print section header: "3. Lambda Expressions Solution:"
- Use same sample data as traditional approach for direct comparison
- Show lambda sorting: `(s1, s2) -> s1.length() - s2.length()`
- Demonstrate method reference sorting: `String::compareToIgnoreCase`
- Include lambda syntax breakdown with visual explanation
- Explain benefits: "Concise, readable, focuses on 'what' not 'how'"

**Lambda Syntax Explanation**:
```
(parameters) -> expression
(s1, s2) -> s1.length() - s2.length()
  ↑          ↑
parameters   what to do
```

---

### Prompt 4: Functional Interfaces Deep Dive
**Task**: Create a method demonstrating common functional interfaces with practical examples.

**Expected Function Signature**: `private static void demonstrateFunctionalInterfaces()`

**Requirements**:
- Print section header: "4. Common Functional Interfaces:"
- Use sample words: `Arrays.asList("hello", "world", "java", "programming", "fun")`
- Demonstrate `Predicate<String>` for testing conditions (word length > 4)
- Show `Function<String, String>` for transformations (toUpperCase)
- Show `Function<String, Integer>` for data extraction (length)
- Demonstrate `Consumer<String>` for actions (printing with exclamation)
- Use traditional loops to apply functional interfaces for clarity

**Functional Interface Examples**:
```java
Predicate<String> isLongWord = word -> word.length() > 4;
Function<String, String> toUpperCase = word -> word.toUpperCase();
Consumer<String> printWithExclamation = word -> System.out.println(word + "!");
```

---

### Prompt 5: Lambdas with Collection Operations
**Task**: Create a method showing lambdas in action with collection-specific operations.

**Expected Function Signature**: `private static void demonstrateLambdasWithCollections()`

**Requirements**:
- Print section header: "5. Lambdas with Collections:"
- Use cities: `Arrays.asList("New York", "London", "Tokyo", "Paris", "Sydney", "Berlin")`
- Show traditional filtering approach with enhanced for loop
- Demonstrate lambda approach using `removeIf()` method
- Show `forEach()` with lambda for iteration
- Compare traditional vs lambda approaches for finding cities starting with 'L'

**Comparison Pattern**:
```java
// Traditional
List<String> filtered = new ArrayList<>();
for (String city : cities) {
    if (city.startsWith("L")) {
        filtered.add(city);
    }
}

// Lambda
cities.removeIf(city -> !city.startsWith("L"));
```

---

### Prompt 6: Method References as Lambda Shortcuts
**Task**: Create a method demonstrating method references as the most concise lambda form.

**Expected Function Signature**: `private static void demonstrateMethodReferences()`

**Requirements**:
- Print section header: "6. Method References - Lambda Shorthand:"
- Use programming languages: `Arrays.asList("java", "python", "javascript", "go", "rust")`
- Show lambda expression: `lang -> System.out.println(lang)`
- Show equivalent method reference: `System.out::println`
- Demonstrate sorting with lambda vs method reference
- Explain method reference syntax and when to use it
- Include key takeaway about functional programming enabling streams

**Method Reference Examples**:
```java
// Lambda
languages.forEach(lang -> System.out.println(lang));
// Method Reference (equivalent)
languages.forEach(System.out::println);

// Lambda
languagesCopy.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
// Method Reference (equivalent)
languagesCopy.sort(String::compareToIgnoreCase);
```

---

## Key Learning Objectives

### 1. Lambda Expression Fundamentals
- Understand lambda syntax: `(parameters) -> expression`
- Learn when lambdas are appropriate vs traditional approaches
- Recognize common functional interface patterns

### 2. Progressive Complexity
- Start with simple operations (uppercase conversion)
- Progress to functional interfaces (Predicate, Function, Consumer)
- End with practical collection operations

### 3. Readability and Maintainability
- See how lambdas improve code readability
- Understand the shift from "how" to "what" in programming
- Learn method references as the most concise form

### 4. Foundation for Streams
- Prepare for stream operations with lambda understanding
- Connect lambda concepts to collection processing
- Bridge to advanced functional programming concepts

## Class Structure Analysis

```java
public class LambdaBasics {
    // 1. Simple string transformation examples
    private static void demonstrateSimpleExample()
    
    // 2. Problem demonstration with anonymous classes  
    private static void demonstrateTraditionalApproach()
    
    // 3. Lambda solutions to verbosity problems
    private static void introduceLambdaExpressions()
    
    // 4. Functional interface deep dive
    private static void demonstrateFunctionalInterfaces()
    
    // 5. Collection-specific lambda operations
    private static void demonstrateLambdasWithCollections()
    
    // 6. Method references as advanced shortcuts
    private static void demonstrateMethodReferences()
}
```

## Connection to Other Modules
- **Builds on**: String operations from Module 5, ArrayList concepts from Module 8
- **Prepares for**: StreamsBasics.java and MovieFunctionalProgramming.java
- **Enables**: Advanced functional programming patterns and modern Java development
