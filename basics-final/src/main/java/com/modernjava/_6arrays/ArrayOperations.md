# ArrayOperations.java - Advanced Array Operations and Manipulations

<!-- TOC -->
* [ArrayOperations.java - Advanced Array Operations and Manipulations](#arrayoperationsjava---advanced-array-operations-and-manipulations)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Array Element Updates](#prompt-1-array-element-updates)
    * [Prompt 2: Adding Elements to Arrays](#prompt-2-adding-elements-to-arrays)
    * [Prompt 3: Removing Elements from Arrays](#prompt-3-removing-elements-from-arrays)
    * [Prompt 4: Array Searching Operations](#prompt-4-array-searching-operations)
    * [Prompt 5: Array Copying Techniques](#prompt-5-array-copying-techniques)
    * [Prompt 6: Array Sorting Operations](#prompt-6-array-sorting-operations)
    * [Helper Methods Required](#helper-methods-required)
  * [Key Concepts Covered](#key-concepts-covered)
    * [1. Array Mutability vs Immutability](#1-array-mutability-vs-immutability)
    * [2. Array Expansion and Contraction](#2-array-expansion-and-contraction)
    * [3. Search Algorithms](#3-search-algorithms)
    * [4. Array Copying Best Practices](#4-array-copying-best-practices)
    * [5. Built-in Sorting](#5-built-in-sorting)
  * [Performance Considerations](#performance-considerations)
    * [Time Complexity](#time-complexity)
    * [Space Complexity](#space-complexity)
  * [Common Pitfalls](#common-pitfalls)
  * [Best Practices](#best-practices)
  * [Real-world Applications](#real-world-applications)
  * [Next Steps](#next-steps)
<!-- TOC -->

## Overview
This class demonstrates comprehensive array operations including updating elements, simulating adding/removing elements, searching, copying, and sorting. Since arrays have fixed size in Java, "adding" and "removing" operations actually create new arrays with different sizes.

## Prompts for Replication

### Prompt 1: Array Element Updates
**Task**: Create a method that demonstrates different ways to update array elements.

**Expected Function Signature**: `private static void demonstrateUpdatingElements()`

**Requirements**:
- Print section header: "--- Updating Array Elements ---"
- Create integer array: `int[] scores = {85, 90, 78, 92, 88}`
- Print original array using helper method
- Perform simple update: `scores[2] = 82` (update third element)
- Print array after update
- Implement conditional updates: add 5 bonus points to scores < 90
- Use for loop to iterate and update qualifying scores
- Print progress messages for each update
- Create string array: `String[] names = {"john", "mary", "bob", "alice"}`
- Convert all names to proper case using helper method `capitalizeFirstLetter()`
- Print original and updated string arrays

---

### Prompt 2: Adding Elements to Arrays
**Task**: Create methods that simulate adding elements to arrays by creating new larger arrays.

**Expected Function Signatures**: 
- `private static void demonstrateAddingElements()`
- `private static int[] addElementAtEnd(int[] array, int element)`
- `private static int[] addElementAtBeginning(int[] array, int element)`
- `private static int[] addElementAtPosition(int[] array, int element, int position)`
- `private static int[] combineArrays(int[] array1, int[] array2)`

**Requirements**:
- Print section header noting arrays have fixed size
- Create original array: `int[] original = {10, 20, 30}`
- Demonstrate adding element at end (40)
- Demonstrate adding element at beginning (5)
- Demonstrate adding element at specific position (25 at index 2)
- Demonstrate combining two arrays with additional elements {50, 60, 70}
- Use `System.arraycopy()` for efficient copying
- Handle bounds checking in `addElementAtPosition()` method
- Print results after each operation

---

### Prompt 3: Removing Elements from Arrays
**Task**: Create methods that simulate removing elements by creating new smaller arrays.

**Expected Function Signatures**:
- `private static void demonstrateRemovingElements()`
- `private static String[] removeElementAtIndex(String[] array, int index)`
- `private static String[] removeElementByValue(String[] array, String value)`
- `private static String[] removeFirstElement(String[] array)`
- `private static String[] removeLastElement(String[] array)`

**Requirements**:
- Print section header explaining new arrays are created
- Create string array: `String[] fruits = {"apple", "banana", "orange", "grape", "kiwi"}`
- Demonstrate removal by index (remove "orange" at index 2)
- Demonstrate removal by value (remove "banana")
- Demonstrate removing first and last elements
- Use `System.arraycopy()` for efficient copying
- Handle bounds checking and null cases
- Use `Arrays.copyOfRange()` for first/last element removal
- Print arrays before and after each removal operation

---

### Prompt 4: Array Searching Operations
**Task**: Create methods that demonstrate various searching techniques in arrays.

**Expected Function Signatures**:
- `private static void demonstrateSearchingElements()`
- `private static int linearSearch(int[] array, int target)`
- `private static int findMaximum(int[] array)`
- `private static int findMinimum(int[] array)`
- `private static int[] findAllOccurrences(int[] array, int target)`
- `private static boolean containsString(String[] array, String target)`
- `private static int findStringIndex(String[] array, String target)`

**Requirements**:
- Create integer array: `int[] numbers = {15, 8, 23, 42, 7, 19, 33}`
- Implement linear search to find element 23
- Find and display maximum and minimum values
- Create array with duplicates: `int[] duplicates = {5, 3, 8, 3, 1, 3, 9}`
- Find all occurrences of value 3 and return indices array
- Create string array: `String[] colors = {"red", "blue", "green", "yellow", "blue", "purple"}`
- Demonstrate string searching with contains check and index finding
- Handle null values properly in string comparisons
- Return -1 for not found cases

---

### Prompt 5: Array Copying Techniques
**Task**: Create a method demonstrating different array copying approaches and their characteristics.

**Expected Function Signature**: `private static void demonstrateArrayCopying()`

**Requirements**:
- Print section header: "--- Array Copying Techniques ---"
- Create original array: `int[] original = {1, 2, 3, 4, 5}`
- Demonstrate manual copying using for loop
- Demonstrate copying using `System.arraycopy()`
- Demonstrate copying using `Arrays.copyOf()`
- Create partial copy using `Arrays.copyOfRange()` (indices 1-3)
- Modify one copy to demonstrate independence of arrays
- Show that original array remains unchanged when copy is modified
- Print all arrays to show copying results and independence

---

### Prompt 6: Array Sorting Operations
**Task**: Create a method that demonstrates built-in sorting capabilities.

**Expected Function Signature**: `private static void demonstrateSortingOperations()`

**Requirements**:
- Print section header: "--- Sorting Operations ---"
- Create integer array: `int[] numbers = {64, 25, 12, 22, 11, 90}`
- Use `Arrays.copyOf()` to create copy for sorting
- Sort copy using `Arrays.sort()` while keeping original unchanged
- Create string array: `String[] names = {"Charlie", "Alice", "Bob", "Diana"}`
- Sort strings alphabetically using `Arrays.sort()`
- Print original and sorted arrays for both integer and string examples
- Note: Removed custom sorting implementations for simplicity

---

### Helper Methods Required

**Array Printing Methods**:
```java
private static void printArray(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}

private static void printStringArray(String[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        if (array[i] != null) {
            System.out.print("\"" + array[i] + "\"");
        } else {
            System.out.print("null");
        }
        if (i < array.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}
```

**String Utility Method**:
```java
private static String capitalizeFirstLetter(String str) {
    if (str == null || str.length() == 0) return str;
    return str.substring(0, 1).toUpperCase() + str.substring(1);
}
```

## Key Concepts Covered

### 1. Array Mutability vs Immutability
**What you'll learn:**
- Array elements are mutable (can be changed)
- Array size is immutable (cannot be changed)
- How to work within these constraints

### 2. Array Expansion and Contraction
**What you'll learn:**
- Creating new arrays to simulate adding elements
- Efficient copying techniques using System.arraycopy()
- Memory implications of frequent array operations

### 3. Search Algorithms
**What you'll learn:**
- Linear search implementation and time complexity O(n)
- Finding extremes (min/max) in arrays
- Handling multiple occurrences and search results

### 4. Array Copying Best Practices
**What you'll learn:**
- Performance differences between copying methods
- When to use each copying technique
- Understanding shallow vs deep copying concepts

### 5. Built-in Sorting
**What you'll learn:**
- Using Arrays.sort() for efficient sorting
- Sorting different data types (integers, strings)
- Understanding that Arrays.sort() modifies the original array

## Performance Considerations

### Time Complexity
- **Element Access**: O(1) - Direct index access
- **Linear Search**: O(n) - Must check each element
- **Adding/Removing**: O(n) - Requires array copying
- **Built-in Sort**: O(n log n) - Efficient sorting algorithm

### Space Complexity
- **In-place Operations**: O(1) - Like updating elements
- **New Array Creation**: O(n) - For add/remove operations
- **Copying Operations**: O(n) - Temporary space for new array

## Common Pitfalls
1. **Index Out of Bounds**: Always validate array indices
2. **Null Pointer Exceptions**: Check for null arrays and elements
3. **Memory Inefficiency**: Frequent add/remove operations are expensive
4. **Reference vs Value**: Understanding what gets copied

## Best Practices
1. Use `ArrayList` for frequent modifications
2. Validate input parameters in helper methods
3. Use `System.arraycopy()` for efficient copying
4. Handle edge cases (empty arrays, null values)
5. Use enhanced for-loops when index is not needed

## Real-world Applications
- **Data Processing**: Batch updates to datasets
- **Filtering**: Creating subsets of data
- **Merging**: Combining data from multiple sources
- **Analysis**: Finding patterns, extremes, and statistics
- **Sorting**: Organizing data for better access patterns

## Next Steps
After mastering these array operations, explore:
- **ArrayList and Collections Framework**
- **Multi-dimensional Arrays**
- **Arrays Utility Class Methods**
- **Stream API for Array Processing**
