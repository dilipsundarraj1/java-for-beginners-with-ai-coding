# Array Disadvantages - Lecture 5

## Learning Objectives
By the end of this lecture, you will understand:
- The major limitations and disadvantages of arrays
- Performance issues with array operations
- Memory management concerns with arrays
- Type safety limitations
- When to choose arrays vs alternatives like ArrayList

## Major Disadvantages of Arrays

### 1. Fixed Size Limitation
**Problem**: Arrays cannot change size after creation
- Cannot add elements beyond initial capacity
- Cannot shrink when elements are removed
- Must create new array and copy elements for size changes

**Impact**:
- Wasted memory with oversized arrays
- Performance penalty for frequent resizing
- Complex code for dynamic operations

### 2. Performance Issues
**Expensive Operations**:
- **Insertion at beginning**: O(n) - must shift all elements
- **Deletion from middle**: O(n) - must shift remaining elements
- **Resizing**: O(n) - must copy all elements to new array

**Example**:
```java
// Adding element at beginning requires shifting ALL elements
int[] original = {10, 20, 30, 40, 50};
// To insert 5 at beginning, must create new array and shift everything
```

### 3. Memory Management Issues
- **Contiguous memory requirement**: Large arrays may fail even with available memory
- **All-or-nothing allocation**: Cannot partially allocate
- **Temporary double memory usage** during resizing operations
- **Reference type waste**: Null references still consume memory

### 4. Type Safety Limitations
- **Covariance issues**: Can lead to runtime `ArrayStoreException`
- **No generics support**: Cannot use `Array<T>` like `List<T>`
- **Primitive vs Object confusion**: `int[]` and `Integer[]` are incompatible

```java
Object[] objects = new String[3];  // Compiles
objects[0] = 42;  // Runtime exception!
```

### 5. Limited Functionality
- **No built-in methods** for common operations
- **Manual implementation** required for searching, sorting, etc.
- **No integration** with Collections Framework
- **Primitive operations** for complex tasks

## Array vs ArrayList Comparison

| Feature | Arrays | ArrayList |
|---------|--------|-----------|
| Size | Fixed | Dynamic |
| Performance | Faster access | Slight overhead |
| Memory | Lower overhead | Higher overhead |
| Type Safety | Limited | Full generics support |
| Built-in Methods | Minimal | Rich API |
| Ease of Use | Complex for dynamic ops | Simple and intuitive |

## When to Use What

### Use Arrays When:
✅ **Size is known and fixed** at compile time  
✅ **Performance is critical** (minimal overhead)  
✅ **Working with primitives** extensively  
✅ **Legacy API compatibility** required  
✅ **Memory usage** needs to be minimized  
✅ **Multi-dimensional data** (matrices)  

**Example Use Cases**:
- Days of the week
- RGB color values
- Fixed game board
- Mathematical matrices

### Use ArrayList When:
✅ **Size varies** at runtime  
✅ **Frequent additions/removals** needed  
✅ **Type safety** with generics required  
✅ **Rich functionality** needed  
✅ **Code maintainability** is important  
✅ **Collections Framework** integration needed  

**Example Use Cases**:
- Shopping cart items
- User input lists
- Search results
- Dynamic configurations

## Alternative Collections

### ArrayList
- Dynamic resizing
- Rich API (add, remove, contains, etc.)
- Type-safe with generics
- Integrates with Collections Framework

### LinkedList
- Efficient insertion/deletion in middle
- Higher memory overhead
- Poor random access performance

### Primitive Collections (Third-party)
- Libraries like Trove, Eclipse Collections
- Combine array performance with dynamic sizing
- Avoid boxing/unboxing overhead

## Performance Guidelines

### Array Performance Tips:
1. **Pre-size appropriately** if size is predictable
2. **Avoid frequent resizing** operations
3. **Use System.arraycopy()** for bulk operations
4. **Consider StringBuilder** for dynamic string operations

### When Performance Matters:
- **Critical loops** with millions of iterations
- **Memory-constrained** environments
- **Real-time systems** with strict timing requirements
- **Large datasets** where overhead matters

## Summary

**Arrays are excellent for**:
- Fixed-size, high-performance scenarios
- Mathematical computations
- Low-level system programming
- When every byte of memory counts

**ArrayList and Collections are better for**:
- Most application development
- Dynamic data handling
- Code readability and maintenance
- Integration with modern Java features

**Key Takeaway**: Choose the right tool for the job. Arrays aren't inherently bad - they're just specialized tools with specific use cases. Modern Java development typically favors Collections for their flexibility and ease of use, while arrays remain important for performance-critical and fixed-size scenarios.
