# String Arrays - Lecture 2

## Learning Objectives
By the end of this lecture, you will understand:
- How to create and initialize String arrays
- Key differences between primitive and reference type arrays
- Common String array operations and patterns
- Null safety when working with String arrays

## Key Concepts

### 1. String Array Creation
String arrays store references to String objects, not the actual string values.

```java
// Different initialization methods
String[] names = new String[4];  // Creates array with null values
String[] colors = {"Red", "Green", "Blue"};  // Direct initialization
String[] fruits = new String[]{"Apple", "Banana"};  // Explicit array creation
```

### 2. Default Values
Unlike primitive arrays, String arrays are initialized with `null` values by default:
- **Primitive int[]**: defaults to 0
- **String[]**: defaults to null

### 3. Null Safety
Always check for null before calling methods on String array elements:
```java
if (stringArray[i] != null) {
    int length = stringArray[i].length();  // Safe
}
```

### 4. Reference Type Characteristics
- String arrays store references, not actual String objects
- Multiple array elements can reference the same String object
- Strings are immutable - operations create new String objects

### 5. Common Operations
- **Accessing**: `array[index]`
- **Modifying**: `array[index] = "new value"`
- **Searching**: Loop through array and use `.equals()` for comparison
- **Length**: `array.length` (array size) vs `array[i].length()` (string length)

## Practical Examples

### Command Line Arguments
```java
String[] args = {"file1.txt", "--verbose", "--output=result.txt"};
// Process each argument based on its pattern
```

### Student Records
```java
String[] students = {"John Doe", "Jane Smith"};
int[] grades = {85, 92};
// Parallel arrays for related data
```

### Inventory Management
```java
String[] inventory = {"laptop", "mouse", "keyboard"};
// Search for items using loops and string comparison
```

## Important Notes
1. String arrays default to null values - always check for null
2. Use `.equals()` to compare String values, not `==`
3. String operations create new objects due to immutability
4. Be careful with parallel arrays - keep them synchronized

## Common Pitfalls
- **NullPointerException**: Calling methods on null String references
- **String comparison**: Using `==` instead of `.equals()`
- **Array bounds**: Accessing invalid indices

## Next Lecture
In the next lecture, we'll explore **Array Operations** - adding, removing, and updating elements in arrays.
