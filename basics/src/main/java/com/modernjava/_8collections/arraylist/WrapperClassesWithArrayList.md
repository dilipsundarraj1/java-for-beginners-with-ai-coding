- **Example 1 - Grade Calculator**: Create student grades list `85, 92, 78, 95, 88`, call `calculateLetterGrade(studentGrades)` and display letter grade
- **Example 2 - Temperature Monitoring**: Create temperatures list `22.5, 24.1, 19.8, 26.3, 23.7`, call `analyzeTemperatures(temperatures)` returning `TemperatureStats` object
- **Example 3 - ID Management**: Create user IDs list `1001L, 1002L, 1005L, 1006L`, call `findMissingIds(userIds, 1001L, 1006L)` to find gaps
- Create inner class `TemperatureStats` with `min`, `max`, `average` fields and `toString()` method formatted as "Min: X°C, Max: Y°C, Average: Z°C"
- Print each example with business context and meaningful results showing real-world wrapper class applications

---
### Prompt 1: ArrayList with Integer Wrapper Class Basic Operations
### 1. Wrapper Classes Fundamentals

**What you'll learn:**
- The relationship between primitive types and their wrapper classes
- Why collections require wrapper classes instead of primitives  
- Print section header: "1. ArrayList with Integer Wrapper Class:"
- The complete mapping of primitives to wrappers

- Add integers using autoboxing: `numbers.add(10); numbers.add(20); numbers.add(30); numbers.add(40); numbers.add(50);`
```java
// Primitive types cannot be used in generics
// List<int> numbers = new ArrayList<>();  // COMPILATION ERROR!

- Add integer `2`, then show difference between `numbers.remove(Integer.valueOf(2))` vs `numbers.remove(2)`
List<Integer> numbers = new ArrayList<>();

// Complete wrapper class mapping
byte    → Byte
### Prompt 2: ArrayList Operations with Wrapper Classes - Practical Methods
- Performance implications of automatic conversions
- Potential pitfalls with null values and autoboxing

**Code Examples:**
```java
- Print section header: "2. ArrayList Operations with Wrapper Classes:"

- Call and display results from helper methods: `findMaximum(scores)`, `findMinimum(scores)`
- Print all results with descriptive output explaining the wrapper class interactions
int value = numbers.get(0); // Integer automatically becomes int

// Arithmetic with wrapper objects (auto unbox → calculate → auto box)
### Prompt 3: Different Wrapper Types in ArrayLists with Specific Examples
Integer b = 20;
Integer sum = a + b;  // Unbox a,b → add → box result
```

**Key Points:**
- Print section header: "3. Different Wrapper Types in ArrayLists:"
- Unboxing happens when wrapper is assigned to primitive variable
- Arithmetic operations automatically unbox, calculate, then box result
- Watch out for NullPointerException when unboxing null wrapper objects

### 3. Collection Operations with Wrapper Classes
**What you'll learn:**
- How to perform mathematical operations on wrapper collections
- Filtering and transformation patterns with numeric data
### Prompt 4: BigDecimal Example for Precise Monetary Calculations
**Task**: Create a method demonstrating the use of BigDecimal in ArrayLists for precise monetary calculations.

**Expected Function Signature**: `private static void demonstrateBigDecimalArrayList()`
```java
public static int findMaximum(List<Integer> numbers) {
- Print section header: "4. ArrayList with BigDecimal (Monetary Values):"
- Create `List<BigDecimal> amounts = new ArrayList<>();` and add monetary values as strings
- Print the list of monetary amounts
- Calculate and print the total and average using BigDecimal
- Compare with double sum for precision demonstration
- Print all results with explanatory messages
        if (number > max) {    // Unboxing for comparison
            max = number;      // Unboxing for assignment
        }
### Prompt 5: Performance and Memory Considerations with Measurements
    return max;
}
```

**Key Points:**
- Print section header: "5. Performance and Memory Considerations:"
- Comparison operators automatically unbox wrapper objects
- Always check for null values before unboxing operations
- Create reusable utility methods for common operations


**What you'll learn:**
- Memory overhead of wrapper objects vs primitives
---

- Performance impact of autoboxing/unboxing in loops
- When to use primitive arrays instead of wrapper collections
- Strategies to minimize wrapper object creation

**Code Examples:**
```java
// Memory comparison
int primitive = 42;        // 4 bytes
Integer wrapper = 42;      // ~16 bytes (object overhead + value)

// Performance consideration in loops
List<Integer> numbers = new ArrayList<>();
for (int i = 0; i < 100000; i++) {
    numbers.add(i);  // Creates 100,000 Integer objects!
}

// Better for large datasets
int[] primitiveArray = new int[100000];
for (int i = 0; i < 100000; i++) {
    primitiveArray[i] = i;  // No object creation
}
```

**Key Points:**
- Integer objects require ~4x more memory than int primitives
- Frequent autoboxing in loops can impact performance
- Consider primitive arrays for large numeric datasets
- Use wrapper collections when you need Collection framework features

## Common Pitfalls and Solutions

### 1. NullPointerException with Unboxing
```java
List<Integer> numbers = new ArrayList<>();
numbers.add(null);  // ArrayList allows null values

// Dangerous - will throw NullPointerException
// int value = numbers.get(0);  

// Safe approach
Integer wrapper = numbers.get(0);
if (wrapper != null) {
    int value = wrapper;  // Safe unboxing
}
```

### 2. Remove Method Confusion
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4);

// Remove by index
numbers.remove(1);  // Removes element at index 1 (value 2)

// Remove by value - need to box the primitive
numbers.remove(Integer.valueOf(2));  // Removes Integer object 2
```

### 3. Equality Comparison
```java
Integer a = 128;
Integer b = 128;
System.out.println(a == b);        // false (different objects)
System.out.println(a.equals(b));   // true (same value)

// Integer caching for -128 to 127
Integer c = 127;
Integer d = 127;  
System.out.println(c == d);        // true (cached objects)
```

## Performance Characteristics

| Operation | Primitive Array | Wrapper ArrayList | Notes |
|-----------|----------------|-------------------|--------|
| Memory per int | 4 bytes | ~16 bytes | Object overhead |
| Access speed | Fastest | Slower (unboxing) | Direct vs method call |
| Iteration | Direct access | Auto-unboxing | Enhanced for-loop |
| Null handling | Not possible | Requires checking | NullPointerException risk |

## Best Practices

1. **Use Wrapper Collections**: When you need Collection framework features
2. **Prefer Primitive Arrays**: For large datasets focused on performance  
3. **Null Safety**: Always check for null before unboxing
4. **Use equals()**: For wrapper object comparison, not ==
5. **Be Aware of Caching**: Integer caches -128 to 127, affects == comparison
6. **Minimize Autoboxing**: In performance-critical loops
7. **Choose Appropriate Type**: Match wrapper type to your data requirements

## Real-World Applications

- **Financial Systems**: Double collections for monetary calculations and currency handling
- **Configuration Management**: Boolean collections for feature flags and system settings
- **Text Processing**: Character collections for parsing and character-level analysis
- **Analytics**: Integer collections for scores, counts, metrics, and statistical data
- **Database Operations**: Long collections for primary keys, timestamps, and ID management
- **Gaming Systems**: Various wrapper types for scores, levels, player statistics, and game state
- **IoT and Sensors**: Double collections for temperature, pressure, and measurement data
