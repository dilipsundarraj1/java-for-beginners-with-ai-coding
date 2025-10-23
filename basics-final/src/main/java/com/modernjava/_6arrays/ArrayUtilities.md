# ArrayUtilities.java - Essential Array Utility Methods

## Overview
This class provides essential utility methods for common array operations that are frequently needed when working with arrays. It includes methods for finding elements, calculating statistics, comparing arrays, and performing common array manipulations that complement the basic array operations.

## Prompts for Replication

### Prompt 1: Array Search and Find Utilities
**Task**: Create utility methods for finding elements and their positions in arrays.

**Expected Function Signatures**: 
- `public static int findElement(int[] array, int target)`
- `public static int findLastOccurrence(int[] array, int target)`
- `public static boolean contains(int[] array, int target)`
- `private static void demonstrateSearchUtilities()`

**Requirements**:
- Print section header: "--- Array Search Utilities ---"
- `findElement()` should return first index of target element, -1 if not found
- `findLastOccurrence()` should return last index of target element, -1 if not found
- `contains()` should return true if element exists in array
- Test with array: `int[] numbers = {5, 10, 15, 10, 25, 10, 30}`
- Search for existing element (10) and non-existing element (99)
- Demonstrate finding first occurrence, last occurrence, and contains check
- Print clear results showing index positions and boolean values

---

### Prompt 2: Array Statistics and Analysis
**Task**: Create utility methods for calculating common array statistics.

**Expected Function Signatures**: 
- `public static int findMin(int[] array)`
- `public static int findMax(int[] array)`
- `public static double calculateAverage(int[] array)`
- `public static int sum(int[] array)`
- `private static void demonstrateStatisticsUtilities()`

**Requirements**:
- Print section header: "--- Array Statistics Utilities ---"
- Handle empty array cases by returning appropriate values or throwing exceptions
- `findMin()` and `findMax()` should handle arrays with negative numbers
- `calculateAverage()` should return double for precision
- `sum()` should handle potential overflow scenarios
- Test with array: `int[] scores = {78, 85, 92, 67, 88, 95, 73}`
- Display all statistics: min, max, sum, and average with proper formatting
- Include edge case testing with single-element and empty arrays

---

### Prompt 3: Array Comparison and Equality
**Task**: Create utility methods for comparing arrays and checking equality.

**Expected Function Signatures**: 
- `public static boolean areEqual(int[] array1, int[] array2)`
- `public static boolean areEqualIgnoreOrder(int[] array1, int[] array2)`
- `public static int compareArrays(int[] array1, int[] array2)`
- `private static void demonstrateComparisonUtilities()`

**Requirements**:
- Print section header: "--- Array Comparison Utilities ---"
- `areEqual()` should check exact equality (same elements in same order)
- `areEqualIgnoreOrder()` should check if arrays contain same elements regardless of order
- `compareArrays()` should return -1, 0, or 1 for lexicographic comparison
- Test with multiple array pairs:
  - `{1, 2, 3}` and `{1, 2, 3}` (equal)
  - `{1, 2, 3}` and `{3, 2, 1}` (equal ignoring order)
  - `{1, 2, 3}` and `{1, 2, 4}` (different)
- Handle null array parameters appropriately
- Show comparison results with clear boolean outputs

---

### Prompt 4: Array Transformation Utilities
**Task**: Create utility methods for common array transformations.

**Expected Function Signatures**: 
- `public static int[] reverse(int[] array)`
- `public static int[] removeDuplicates(int[] array)`
- `public static int[] getUniqueElements(int[] array)`
- `public static int[] slice(int[] array, int startIndex, int endIndex)`
- `private static void demonstrateTransformationUtilities()`

**Requirements**:
- Print section header: "--- Array Transformation Utilities ---"
- `reverse()` should return new array with elements in reverse order
- `removeDuplicates()` should preserve first occurrence of each element
- `getUniqueElements()` should return elements that appear exactly once
- `slice()` should return subarray from startIndex to endIndex (exclusive)
- Test with array: `int[] data = {1, 2, 2, 3, 4, 4, 5, 6}`
- Handle edge cases: empty arrays, single elements, invalid indices
- Print original and transformed arrays for each operation
- Include bounds checking for slice method

## Key Concepts Covered

### 1. Array Searching Algorithms

**What you'll learn:**
- Linear search implementation for arrays
- Finding first vs. last occurrence of elements
- Boolean search methods for element existence
- Time complexity considerations (O(n) for unsorted arrays)

**Code Examples:**
```java
public static int findElement(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            return i;  // Return first occurrence
        }
    }
    return -1;  // Element not found
}

public static boolean contains(int[] array, int target) {
    return findElement(array, target) != -1;
}
```

**Key Points:**
- **Linear search** is the standard approach for unsorted arrays
- **Return conventions**: -1 for not found, actual index for found
- **Short-circuit evaluation**: stop searching once element is found
- **Edge cases**: handle empty arrays and null parameters

### 2. Statistical Calculations

**What you'll learn:**
- Implementing min/max finding algorithms
- Safe arithmetic operations to avoid overflow
- Proper handling of empty arrays
- Precision considerations with averages

**Code Examples:**
```java
public static int findMax(int[] array) {
    if (array.length == 0) {
        throw new IllegalArgumentException("Array cannot be empty");
    }
    
    int max = array[0];  // Initialize with first element
    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
}

public static double calculateAverage(int[] array) {
    if (array.length == 0) return 0.0;
    return (double) sum(array) / array.length;  // Cast for precision
}
```

**Key Points:**
- **Initialize with first element** for min/max to handle negative numbers
- **Type casting** for precise division in averages
- **Exception handling** for invalid inputs like empty arrays
- **Overflow protection** in sum calculations

### 3. Array Comparison Techniques

**What you'll learn:**
- Element-by-element comparison strategies
- Order-independent equality checking
- Lexicographic comparison implementation
- Handling null and edge cases

**Code Examples:**
```java
public static boolean areEqual(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
        return false;
    }
    
    for (int i = 0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
            return false;
        }
    }
    return true;
}
```

**Key Points:**
- **Length check first** - arrays of different lengths cannot be equal
- **Early termination** - return false immediately on first difference
- **Order matters** for exact equality comparison
- **Null handling** prevents NullPointerException

### 4. Array Transformation Operations

**What you'll learn:**
- Creating new arrays vs. modifying existing ones
- Efficient element copying and rearrangement
- Duplicate detection and removal algorithms
- Subarray extraction with bounds checking

**Code Examples:**
```java
public static int[] reverse(int[] array) {
    int[] reversed = new int[array.length];
    for (int i = 0; i < array.length; i++) {
        reversed[i] = array[array.length - 1 - i];
    }
    return reversed;
}

public static int[] slice(int[] array, int start, int end) {
    if (start < 0 || end > array.length || start > end) {
        throw new IllegalArgumentException("Invalid slice indices");
    }
    
    int[] slice = new int[end - start];
    System.arraycopy(array, start, slice, 0, end - start);
    return slice;
}
```

**Key Points:**
- **Immutable operations** - create new arrays rather than modifying originals
- **Bounds validation** - check indices before array operations
- **System.arraycopy()** for efficient bulk copying
- **Mathematical relationships** in index calculations

## Common Array Utilities Patterns

### 1. Search Result Conventions
- **Return -1** for "not found" in search methods
- **Return boolean** for simple existence checks
- **Return first occurrence** unless specifically looking for last
- **Handle empty arrays** gracefully

### 2. Statistical Method Design
- **Throw exceptions** for invalid inputs (empty arrays for min/max)
- **Return meaningful defaults** where appropriate (0.0 for average of empty array)
- **Use appropriate return types** (double for averages, int for counts)
- **Consider overflow scenarios** in sum operations

### 3. Transformation Best Practices
- **Create new arrays** instead of modifying parameters
- **Preserve original data** - utility methods should be non-destructive
- **Validate parameters** before processing
- **Return appropriate sizes** - handle cases where result array might be smaller

## Helper Methods Explained

The class includes utility helper methods:

### `printArray(int[] array)`
- Displays arrays in consistent format: `[1, 2, 3, 4, 5]`
- Handles empty and null arrays safely
- Used throughout for displaying test results

### `validateArray(int[] array, String methodName)`
- Common validation logic for null checking
- Throws IllegalArgumentException with descriptive messages
- Prevents code duplication across utility methods

## Error Handling Strategies

### Input Validation
```java
if (array == null) {
    throw new IllegalArgumentException("Array cannot be null");
}
if (array.length == 0) {
    throw new IllegalArgumentException("Array cannot be empty");
}
```

### Bounds Checking
```java
if (index < 0 || index >= array.length) {
    throw new ArrayIndexOutOfBoundsException("Index out of bounds: " + index);
}
```

### Safe Arithmetic
```java
// Avoid overflow in sum calculation
long sum = 0;  // Use long for intermediate calculation
for (int value : array) {
    sum += value;
}
if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
    throw new ArithmeticException("Sum overflow");
}
```

## Running the Code

Execute the `ArrayUtilities.java` file to see:
- Search utility methods finding elements and positions
- Statistical calculations on various array datasets  
- Array comparison methods with different equality criteria
- Transformation utilities creating new arrays with modified content

## Expected Output

```
=== Array Utilities - Essential Helper Methods ===

--- Array Search Utilities ---
Testing with array: [5, 10, 15, 10, 25, 10, 30]

Searching for 10:
  First occurrence at index: 1
  Last occurrence at index: 5
  Contains 10: true

Searching for 99:
  First occurrence at index: -1 (not found)
  Last occurrence at index: -1 (not found)
  Contains 99: false

--- Array Statistics Utilities ---
Testing with scores: [78, 85, 92, 67, 88, 95, 73]

Statistics:
  Minimum score: 67
  Maximum score: 95
  Sum of scores: 578
  Average score: 82.57

Edge cases:
  Single element array [42]: min=42, max=42, sum=42, avg=42.0
  Empty array: sum=0, avg=0.0 (min/max throw exception)

--- Array Comparison Utilities ---
Comparing [1, 2, 3] and [1, 2, 3]:
  Are equal: true
  Are equal (ignore order): true
  Compare result: 0

Comparing [1, 2, 3] and [3, 2, 1]:
  Are equal: false
  Are equal (ignore order): true
  Compare result: -1

Comparing [1, 2, 3] and [1, 2, 4]:
  Are equal: false
  Are equal (ignore order): false
  Compare result: -1

--- Array Transformation Utilities ---
Original array: [1, 2, 2, 3, 4, 4, 5, 6]

Transformations:
  Reversed: [6, 5, 4, 4, 3, 2, 2, 1]
  Remove duplicates: [1, 2, 3, 4, 5, 6]
  Unique elements: [1, 3, 5, 6]
  Slice [2:5]: [2, 3, 4]
```

## When to Use ArrayUtilities

- **Search operations**: When you need to find elements or check existence
- **Data analysis**: When calculating statistics on numeric arrays
- **Array comparison**: When comparing arrays for equality or sorting
- **Data transformation**: When creating modified versions of arrays
- **Validation**: When checking array properties or constraints

This utility class provides the foundation for more complex array operations and serves as a toolkit for common programming tasks involving arrays.
