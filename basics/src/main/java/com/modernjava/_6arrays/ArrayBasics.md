# ArrayBasics.java - Understanding Array Fundamentals

<!-- TOC -->
* [ArrayBasics.java - Understanding Array Fundamentals](#arraybasicsjava---understanding-array-fundamentals)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Array Creation and Default Values](#prompt-1-array-creation-and-default-values)
    * [Prompt 2: Array Initialization Techniques](#prompt-2-array-initialization-techniques)
    * [Prompt 3: Array Properties and Element Access](#prompt-3-array-properties-and-element-access)
    * [Prompt 4: Memory and Reference Concepts](#prompt-4-memory-and-reference-concepts)
  * [Key Concepts Covered](#key-concepts-covered)
    * [1. Array Declaration and Creation](#1-array-declaration-and-creation)
    * [2. Array Initialization](#2-array-initialization)
    * [3. Array Properties and Access](#3-array-properties-and-access)
    * [4. Memory and Reference Behavior](#4-memory-and-reference-behavior)
  * [Default Values by Type](#default-values-by-type)
  * [Common Mistakes to Avoid](#common-mistakes-to-avoid)
  * [Helper Methods Explained](#helper-methods-explained)
    * [`printArray(int[] array)`](#printarrayint-array)
    * [`printDoubleArray(double[] array)`](#printdoublearraydouble-array)
    * [`printCharArray(char[] array)`](#printchararraychar-array)
  * [Running the Code](#running-the-code)
  * [Expected Output](#expected-output)
  * [Next Steps](#next-steps)
<!-- TOC -->
## Overview
This file introduces the core concepts of arrays in Java, focusing on how arrays are created, initialized, and their reference behavior. This covers primitive type arrays - for reference type arrays like String[], see the `StringArrays.java` class.

## Prompts for Replication

### Prompt 1: Array Creation and Default Values
**Task**: Create a method that demonstrates different ways to create arrays of primitive types and shows their default values.

**Expected Function Signature**: `private static void demonstrateArrayCreation()`

**Requirements**:
- Print section header: "--- Creating Arrays of Primitives ---"
- Create arrays using two-step process: `int[] numbers;` then `numbers = new int[5];`
- Create arrays using one-step process: `int[] scores = new int[3];`
- Create arrays of different primitive types: double, boolean, char
- Print length of each array type
- Demonstrate default values by printing first element of each array
- Show all primitive default values: int (0), double (0.0), boolean (false), char ('\u0000')

---

### Prompt 2: Array Initialization Techniques
**Task**: Create a method that demonstrates three different ways to initialize arrays with values.

**Expected Function Signature**: `private static void demonstrateArrayInitialization()`

**Requirements**:
- Print section header: "--- Array Initialization Techniques ---"
- **Method 1**: Initialize with values during declaration: `int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19};`
- **Method 2**: Use new keyword with values: `int[] evenNumbers = new int[]{2, 4, 6, 8, 10};`
- **Method 3**: Initialize after declaration by assigning individual elements
- Create arrays of different types: int[], double[], boolean[], char[]
- Display all initialized arrays using helper print methods
- Show prime numbers, prices, vowels, and odd numbers as examples

---

### Prompt 3: Array Properties and Element Access
**Task**: Create a method that demonstrates array length property, indexing, and element modification.

**Expected Function Signature**: `private static void demonstrateArrayProperties()`

**Requirements**:
- Print section header: "--- Array Properties ---"
- Create array: `int[] data = {10, 20, 30, 40, 50};`
- Show array length using `.length` property
- Demonstrate zero-based indexing: first element `data[0]` and last element `data[data.length - 1]`
- Access all elements using for loop with descriptive output
- Modify an element: `data[2] = 35;` and show the change
- Print array before and after modification

---

### Prompt 4: Memory and Reference Concepts
**Task**: Create a method that demonstrates how arrays are reference types and memory behavior.

**Expected Function Signature**: `private static void demonstrateMemoryConcepts()`

**Requirements**:
- Print section header: "--- Memory and Reference Concepts ---"
- Create original array: `int[] original = {1, 2, 3, 4, 5};`
- Create reference copy: `int[] copy = original;` with comment "// This copies the reference, not the array!"
- Print both arrays to show they have same values
- Modify array through copy reference: `copy[0] = 100;`
- Show that original array also changed because they reference same memory
- Demonstrate fixed size concept with comment about inability to change array.length

## Key Concepts Covered

### 1. Array Declaration and Creation

**What you'll learn:**
- Arrays are objects that store multiple values of the same type
- Arrays have fixed size that cannot be changed after creation
- Different ways to create arrays in Java

**Code Examples:**
```java
// Two-step process
int[] numbers;           // Declaration - creates reference variable
numbers = new int[5];    // Creation - allocates memory for 5 integers

// One-step process
int[] scores = new int[3];          // Creates array of 3 integers
double[] temperatures = new double[7];  // Creates array of 7 doubles
boolean[] flags = new boolean[4];    // Creates array of 4 booleans
char[] letters = new char[26];       // Creates array of 26 characters
```

**Key Points:**
- Array variables are reference types (store memory addresses)
- Arrays are allocated in heap memory
- Size must be specified at creation time
- All elements are automatically initialized to default values

### 2. Array Initialization

**What you'll learn:**
- Three different techniques to initialize arrays with values
- When to use each initialization method
- How array size is determined automatically in some cases

**Code Examples:**
```java
// Method 1: Initialize with values during declaration
int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19};
double[] prices = {19.99, 29.99, 39.99, 49.99};
boolean[] answers = {true, false, true, true, false};

// Method 2: Using new keyword with values
int[] evenNumbers = new int[]{2, 4, 6, 8, 10};
char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

// Method 3: Initialize after declaration
int[] oddNumbers = new int[5];
oddNumbers[0] = 1;
oddNumbers[1] = 3;
oddNumbers[2] = 5;
oddNumbers[3] = 7;
oddNumbers[4] = 9;
```

**Key Points:**
- **Method 1** is most concise when you know all values at compile time
- **Method 2** is useful when passing arrays as parameters or assigning to existing variables
- **Method 3** is necessary when values are calculated or input at runtime
- Array size is determined automatically in Methods 1 and 2

### 3. Array Properties and Access

**What you'll learn:**
- How to get array length using `.length` property
- Zero-based indexing system in arrays
- How to access and modify array elements

**Code Examples:**
```java
int[] data = {10, 20, 30, 40, 50};

// Length property (NOT a method!)
System.out.println("Array length: " + data.length); // Output: 5

// Zero-based indexing
System.out.println("First element: " + data[0]);              // 10
System.out.println("Last element: " + data[data.length - 1]); // 50

// Accessing all elements
for (int i = 0; i < data.length; i++) {
    System.out.println("Index " + i + ": " + data[i]);
}

// Modifying elements
data[2] = 35;  // Changes third element from 30 to 35
```

**Key Points:**
- **Length is a property**, not a method (no parentheses!)
- **Zero-based indexing**: first element is at index 0
- **Valid indices**: 0 to length-1
- **Arrays are mutable**: you can change individual elements
- **ArrayIndexOutOfBoundsException** thrown for invalid indices

### 4. Memory and Reference Behavior

**What you'll learn:**
- Arrays are reference types that store memory addresses
- How reference copying works vs. data copying
- Why multiple variables can point to the same array

**Code Examples:**
```java
int[] original = {1, 2, 3, 4, 5};
int[] copy = original;  // Copies the REFERENCE, not the array!

copy[0] = 100;  // Modifying through 'copy'

// Both variables point to same array:
System.out.println("original[0]: " + original[0]); // 100 (changed!)
System.out.println("copy[0]: " + copy[0]);         // 100
```

**Memory Layout:**
```
Stack Memory:           Heap Memory:
+-----------+          +---+---+---+---+---+
| original  |--------> |100| 2 | 3 | 4 | 5 |
+-----------+          +---+---+---+---+---+
| copy      |--------> (same array object)
+-----------+
```

**Key Points:**
- **Reference copying**: `=` copies reference, not array contents
- **Shared data**: Multiple references can modify same array
- **Heap allocation**: Array data is stored in heap memory
- **Fixed size**: Array size cannot be changed after creation

## Default Values by Type

When arrays are created without explicit initialization:

| Type | Default Value |
|------|---------------|
| `int`, `byte`, `short`, `long` | `0` |
| `float`, `double` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` (null character) |
| Reference types (like String) | `null` |

## Common Mistakes to Avoid

1. **Using `.length()` instead of `.length`**
   ```java
   // Wrong - length is a property, not a method
   int size = array.length();  // Compile error!
   
   // Correct
   int size = array.length;    // No parentheses
   ```

2. **Array index out of bounds**
   ```java
   int[] arr = new int[5];  // Valid indices: 0, 1, 2, 3, 4
   arr[5] = 10;  // ArrayIndexOutOfBoundsException!
   
   // Safe access
   arr[arr.length - 1] = 10;  // Access last element
   ```

3. **Confusing reference copying with data copying**
   ```java
   int[] original = {1, 2, 3};
   int[] copy = original;  // This copies the reference!
   copy[0] = 999;
   System.out.println(original[0]);  // Prints 999, not 1!
   ```

4. **Trying to change array size**
   ```java
   int[] arr = new int[5];
   arr.length = 10;  // Compile error! Cannot change array size
   ```

## Helper Methods Explained

The class includes three helper methods for displaying different array types:

### `printArray(int[] array)`
- Prints integer arrays in format: `[1, 2, 3, 4, 5]`
- Uses loop with proper comma separation
- Handles empty arrays gracefully

### `printDoubleArray(double[] array)`
- Prints double arrays with 2-decimal formatting: `[19.99, 29.99, 39.99]`
- Uses `printf("%.2f")` for consistent decimal places
- Same bracket format as integer arrays

### `printCharArray(char[] array)`
- Prints character arrays with single quotes: `['a', 'e', 'i', 'o', 'u']`
- Each character is enclosed in quotes for clarity
- Distinguishes characters from strings

## Running the Code

Execute the `ArrayBasics.java` file to see:
- Different array creation techniques and their default values
- Three initialization methods with various data types
- Array property access and element modification
- Reference behavior and memory sharing between variables

## Expected Output

```
=== Array Basics - Lecture 1 ===

--- Creating Arrays of Primitives ---
Integer array length: 5
Double array length: 7
Boolean array length: 4
Character array length: 26

Default values:
int array default: 0
double array default: 0.0
boolean array default: false
char array default: ''

--- Array Initialization Techniques ---
Prime numbers: [2, 3, 5, 7, 11, 13, 17, 19]
Prices: [19.99, 29.99, 39.99, 49.99]
Vowels: ['a', 'e', 'i', 'o', 'u']
Odd numbers: [1, 3, 5, 7, 9]

--- Array Properties ---
Array length: 5
First element (index 0): 10
Last element (index 4): 50

Accessing all elements:
Index 0: 10
Index 1: 20
Index 2: 30
Index 3: 40
Index 4: 50

Modifying elements:
After changing index 2 to 35:
[10, 20, 35, 40, 50]

--- Memory and Reference Concepts ---
Original array:
[1, 2, 3, 4, 5]
Copy (reference to same array):
[1, 2, 3, 4, 5]

After modifying copy[0] = 100:
Original array (also changed!):
[100, 2, 3, 4, 5]
Copy array:
[100, 2, 3, 4, 5]

Array size demonstration:
Created array with length: 3
```

## Next Steps

- **StringArrays.java**: Learn about arrays of reference types (String[])
- **ArrayOperations.java**: Master adding, removing, and updating array elements
- **ArrayUtilities.java**: Explore the powerful java.util.Arrays class
- **ArrayDisadvantages.java**: Understand when to use arrays vs alternatives like ArrayList
