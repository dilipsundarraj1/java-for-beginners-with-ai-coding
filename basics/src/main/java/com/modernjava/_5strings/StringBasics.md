# StringBasics.java - Understanding String Fundamentals

## Overview
This file introduces the core concepts of Strings in Java, focusing on how strings are created and their immutable nature. For advanced topics like String Pool, see the dedicated `StringPool.java` class.

## Prompts for Replication

### Prompt 1: String Creation and Initialization
**Task**: Create a method that demonstrates different ways to create and initialize strings in Java.

**Expected Function Signature**: `private static void demonstrateStringCreation()`

**Requirements**:
- Print section header: "\n--- String Creation ---"
- Create string using literal: `String name1 = "Java"`
- Create string using new keyword: `String name2 = new String("Java")`
- Create string using var keyword: `var name3 = new String("Java")`
- Create empty strings: `String empty1 = ""` and `String empty2 = new String()`
- Print all created strings with descriptive labels
- Show empty strings in single quotes to demonstrate they're empty

---

### Prompt 2: String Immutability Demonstration
**Task**: Create a method that demonstrates how string immutability works in Java.

**Expected Function Signature**: `private static void demonstrateImmutability()`

**Requirements**:
- Print section header: "\n--- String Immutability ---"
- Create original string using concatenation: `String original = "Hello" + " Java"`
- Create another string: `String s = original + " Java"` with comment "// new String Created"
- Print the original string with label
- Use `concat()` method: `String modified = original.concat(" World")`
- Show that original string remains unchanged after concat
- Print both original and modified strings after concat operation
- Demonstrate reassignment: `original = original.concat("!")`
- Print the result after reassignment

## Key Concepts Covered

### 1. String Declaration and Initialization

**What you'll learn:**
- Different ways to create strings in Java
- The difference between string literals and string objects
- Using var keyword for type inference

**Code Examples:**
```java
// String literal
String name1 = "Java";

// Using new keyword
String name2 = new String("Java");
var name3 = new String("Java");

// Empty string
String empty1 = "";
String empty2 = new String();
```

**Key Points:**
- String literals (like `"Java"`) are the most common way to create strings
- Using `new String()` explicitly creates a new object
- `var` keyword allows type inference for cleaner code
- Empty strings can be created using `""` or `new String()`
- String literals are stored in a special memory area for optimization

### 2. String Immutability

**What you'll learn:**
- Strings cannot be changed once created
- How string operations create new objects
- The difference between concatenation operators and methods

**Code Examples:**
```java
String original = "Hello" + " Java";
String s = original + " Java"; // new String Created
System.out.println("Original string: " + original);

// This creates a new string object, doesn't modify original
String modified = original.concat(" World");

System.out.println("After concat operation:");
System.out.println("Original: " + original);  // Still "Hello Java"
System.out.println("Modified: " + modified);  // "Hello Java World"

// To actually change the reference, we need to reassign
original = original.concat("!");
System.out.println("After reassignment: " + original);
```

**Key Points:**
- **Immutable** means once a string is created, its value cannot be changed
- String concatenation with `+` operator creates new strings
- String methods like `concat()` return NEW strings without modifying the original
- The original string remains unchanged unless you reassign the variable
- Every string operation that appears to "modify" a string actually creates a new one

## Memory Behavior

When you call string methods:
```java
String text = "Hello";
text.concat(" World");  // Creates new string, but text still refers to "Hello"
System.out.println(text);  // Prints "Hello"

text = text.concat(" World");  // Now text refers to the new string
System.out.println(text);  // Prints "Hello World"
```

## Why Immutability Matters

1. **Thread Safety**: Multiple threads can safely access the same string
2. **Caching**: String values can be cached since they never change
3. **Security**: Prevents accidental modification of sensitive data
4. **Memory Optimization**: Enables string pooling (covered in StringPool.java)

## Common Mistakes to Avoid

1. **Forgetting that string methods return new strings**
   ```java
   // Wrong - this doesn't change the original string
   String name = "john";
   name.toUpperCase();  // Returns "JOHN" but doesn't assign it
   System.out.println(name);  // Still prints "john"
   
   // Correct - assign the result
   name = name.toUpperCase();
   System.out.println(name);  // Prints "JOHN"
   ```

2. **Expecting strings to be modified in-place**
   ```java
   // Wrong assumption - strings don't work like arrays
   String text = "Hello";
   text.concat(" World");  // This doesn't modify text
   
   // Correct approach
   text = text.concat(" World");  // Reassign to the new string
   ```

3. **Not understanding concatenation creates new objects**
   ```java
   String original = "Hello" + " Java";
   String s = original + " Java"; // This creates a completely new string
   // Now we have two separate string objects in memory
   ```

## Running the Code

Execute the `StringBasics.java` file to see:
- Different ways to create strings including var keyword usage
- How string concatenation works with + operator
- How string immutability works in practice
- The behavior of string concatenation and reassignment

## Expected Output

```
=== String Basics ===

--- String Creation ---
String literal: Java
Using new keyword: Java
Empty string 1: ''
Empty string 2: ''

--- String Immutability ---
Original string: Hello Java
After concat operation:
Original: Hello Java
Modified: Hello Java World
After reassignment: Hello Java!
```

## Next Steps

- **StringPool.java**: Learn about Java's string pool optimization
- **StringComparison.java**: Master string comparison techniques
- **StringOperations.java**: Explore string manipulation methods
- **StringPerformance.java**: Understand performance considerations
