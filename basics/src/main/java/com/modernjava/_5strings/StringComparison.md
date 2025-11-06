# StringComparison.java - Mastering String Comparison

<!-- TOC -->
* [StringComparison.java - Mastering String Comparison](#stringcomparisonjava---mastering-string-comparison)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Equality Comparison Demonstration](#prompt-1-equality-comparison-demonstration)
    * [Prompt 2: Case-Insensitive Comparison Demonstration](#prompt-2-case-insensitive-comparison-demonstration)
    * [Prompt 3: Null-Safe Comparison Demonstration](#prompt-3-null-safe-comparison-demonstration)
    * [Prompt 4: Lexicographic Comparison Demonstration](#prompt-4-lexicographic-comparison-demonstration)
  * [Key Concepts Covered](#key-concepts-covered)
    * [1. Equality Comparison: `equals()` vs `==`](#1-equality-comparison-equals-vs-)
    * [2. Case-Insensitive Comparison](#2-case-insensitive-comparison)
    * [3. Null-Safe Comparison](#3-null-safe-comparison)
<!-- TOC -->
## Overview
This file teaches you the critical differences between various string comparison methods and how to avoid common bugs related to string equality checking.

## Prompts for Replication

### Prompt 1: Equality Comparison Demonstration
**Task**: Create a method that demonstrates the difference between reference equality (`==`) and content equality (`equals()`).

**Expected Function Signature**: `private static void demonstrateEquality()`

**Requirements**:
- Print section header: "\n--- Equality Comparison ---"
- Create four string variables:
  - `String str1 = "Java"` (string literal)
  - `String str2 = "Java"` (same string literal)
  - `String str3 = new String("Java")` (heap object)
  - `String str4 = "JAVA"` (different content)
- Demonstrate reference comparison with `==`:
  - Show str1 == str2 (true - same reference)
  - Show str1 == str3 (false - different reference)
- Demonstrate content comparison with `equals()`:
  - Show str1.equals(str2) (true)
  - Show str1.equals(str3) (true)
  - Show str1.equals(str4) (false)
- Show best practice: `"Java".equals(str1)` to avoid NullPointerException

---

### Prompt 2: Case-Insensitive Comparison Demonstration
**Task**: Create a method that demonstrates case-insensitive string comparison using `equalsIgnoreCase()`.

**Expected Function Signature**: `private static void demonstrateCaseInsensitiveComparison()`

**Requirements**:
- Print section header: "\n--- Case-insensitive Comparison ---"
- Create four string variables:
  - `String str1 = "Java"`
  - `String str2 = "JAVA"`
  - `String str3 = "java"`
  - `String str4 = "JaVa"`
- Print all string values with labels
- Show first example: `str1.equalsIgnoreCase(str2)` (true)
- Demonstrate additional comparisons:
  - str1.equalsIgnoreCase(str3) (true)
  - str1.equalsIgnoreCase(str4) (true)

---

### Prompt 3: Null-Safe Comparison Demonstration
**Task**: Create a method that demonstrates safe ways to compare strings when null values might be involved.

**Expected Function Signature**: `private static void demonstrateNullSafeComparison()`

**Requirements**:
- Print section header: "\n--- Null-safe Comparison ---"
- Create three string variables:
  - `String str1 = "Java"`
  - `String str2 = null`
  - `String str3 = null`
- **Warning Comment**: Add a comment about `str2.equals(str1)` causing NullPointerException (don't actually call it)
- Demonstrate `Objects.equals()` for null-safe comparison:
  - Show Objects.equals(str1, "Java") (true)
  - Show Objects.equals(str1, str2) (false)
  - Show Objects.equals(str2, str3) (true)
- Show string literal first approach:
  - Show "Java".equals(str1) (true)
  - Show "Java".equals(str2) (false, no NPE)
- Include commented warning about `str2.equals("Java")` throwing NPE

---

### Prompt 4: Lexicographic Comparison Demonstration
**Task**: Create a method that demonstrates lexicographic (alphabetical) string comparison using `compareTo()`.

**Expected Function Signature**: `private static void demonstrateLexicographicComparison()`

**Requirements**:
- Print section header: "\n--- Lexicographic Comparison (compareTo) ---"
- Create five string variables:
  - `String str1 = "Apple"`
  - `String str2 = "Banana"`
  - `String str3 = "Apple"` (same as str1)
  - `String str4 = "apple"` (different case)
  - `String str5 = "Zebra"`
- Demonstrate basic `compareTo()` results:
  - str1.compareTo(str2) (negative - Apple < Banana)
  - str1.compareTo(str3) (0 - Apple == Apple)
  - str2.compareTo(str1) (positive - Banana > Apple)
  - str1.compareTo(str5) (negative - Apple < Zebra)
  - str1.compareTo(str4) (negative - case sensitive)
- Show case-insensitive comparison: str1.compareToIgnoreCase(str4) (0)
- Include practical sorting demonstration with fruit names array
- Show alphabetical ordering examples with explanatory output

## Key Concepts Covered

### 1. Equality Comparison: `equals()` vs `==`

**What you'll learn:**
- The fundamental difference between reference and content comparison
- Why `==` can give unexpected results with strings
- Safe practices for string equality checking

**Code Examples:**
```java
String str1 = "Java";                // String literal (pool)
String str2 = "Java";                // Same reference from pool
String str3 = new String("Java");    // New object in heap
String str4 = "JAVA";                // Different content

// Reference comparison with ==
System.out.println(str1 == str2);    // true (same memory location)
System.out.println(str1 == str3);    // false (different memory locations)

// Content comparison with equals()
System.out.println(str1.equals(str2)); // true (same content)
System.out.println(str1.equals(str3)); // true (same content)
System.out.println(str1.equals(str4)); // false (different content)
```

**Key Points:**
- `==` compares **memory addresses** (references)
- `.equals()` compares **actual content**
- String literals from pool may share same reference
- Objects created with `new` always have different references
- **Always use `.equals()` for content comparison**

### 2. Case-Insensitive Comparison

**What you'll learn:**
- How to compare strings ignoring case differences
- When case-insensitive comparison is useful

**Code Examples:**
```java
String str1 = "Java";
String str2 = "JAVA";
String str3 = "java";
String str4 = "JaVa";

// Case-insensitive comparison
System.out.println(str1.equalsIgnoreCase(str2)); // true
System.out.println(str1.equalsIgnoreCase(str3)); // true
System.out.println(str1.equalsIgnoreCase(str4)); // true
```

**Key Points:**
- `equalsIgnoreCase()` ignores upper/lower case differences
- Useful for user input validation, file names, configuration values
- More efficient than converting to same case before comparison

### 3. Null-Safe Comparison

**What you'll learn:**
- How to safely compare strings when null values are possible
- Two main approaches: `Objects.equals()` and string literal first
- Why null values cause NullPointerException

**Code Examples:**
```java
String str1 = "Java";
String str2 = null;

// Unsafe - throws NullPointerException
// str2.equals("Java");  // DON'T DO THIS!

// Safe approach 1: Objects.equals()
System.out.println(Objects.equals(str1, str2)); // false
System.out.println(Objects.equals(str2, null)); // true

// Safe approach 2: String literal first
System.out.println("Java".equals(str1)); // true
System.out.println("Java".equals(str2)); // false (no exception)
```

**Key Points:**
- `Objects.equals()` handles null values safely
- String literal first prevents NullPointerException
- Never call methods on potentially null string variables
- Both approaches are valid - choose based on readability

