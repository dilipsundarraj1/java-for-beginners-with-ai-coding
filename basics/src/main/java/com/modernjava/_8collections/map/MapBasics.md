# MapBasics.java - Understanding Map Fundamentals in Java

## Overview
This file introduces the fundamental concepts of Map in Java using simple key-value pairs. It demonstrates basic Map operations including creation, adding, accessing, modifying, and removing entries. Maps are essential collections that store unique keys mapped to values, similar to dictionaries or lookup tables. This serves as a foundation for understanding key-value relationships before progressing to advanced Map operations with Streams API.

## Prompts for Replication

### Prompt 1: Basic Map Operations - Creating and Using Simple Maps
**Task**: Create a method that demonstrates creating Maps and performing basic operations like put, get, and containsKey.

**Expected Function Signature**: `public static void basicMapOperations()`

**Requirements**:
- Print section header: "1. Basic Map Operations:"
- Create `Map<String, Integer> studentGrades = new HashMap<>();`
- Add key-value pairs using `put()`: "Alice" -> 95, "Bob" -> 87, "Charlie" -> 92
- Print the complete map showing all entries
- Retrieve a specific value using `get("Alice")` and display result
- Check if a key exists using `containsKey("Bob")` and conditionally print Bob's grade
- Display all keys using `keySet()` and all values using `values()`
- Add blank line at end for spacing

---

### Prompt 2: Different Types of Maps and Their Characteristics
**Task**: Create a method demonstrating HashMap, LinkedHashMap, and TreeMap with their ordering behaviors.

**Expected Function Signature**: `public static void differentMapTypes()`

**Requirements**:
- Print section header: "2. Different Types of Maps:"
- Create HashMap with fruit colors: "apple" -> "red", "banana" -> "yellow", "grape" -> "purple"
- Print HashMap with note "(no order)" showing unpredictable ordering
- Create LinkedHashMap with same fruit colors in same order
- Print LinkedHashMap with note "(insertion order)" showing maintained order
- Create TreeMap with same fruit colors in same order
- Print TreeMap with note "(sorted by key)" showing alphabetical key sorting
- Add blank line at end for spacing

---

### Prompt 3: Common Map Operations Every Developer Should Know
**Task**: Create a method demonstrating essential Map operations like update, remove, getOrDefault, and putIfAbsent.

**Expected Function Signature**: `public static void commonMapOperations()`

**Requirements**:
- Print section header: "3. Common Map Operations:"
- Create inventory map with "laptops" -> 10, "phones" -> 25, "tablets" -> 15
- Display map size using `size()` and emptiness check using `isEmpty()`
- Update existing value: change "laptops" to 12 using `put()` and show updated value
- Remove an item using `remove("tablets")` and capture returned value
- Print inventory after removal
- Demonstrate `getOrDefault("mice", 0)` for non-existent key
- Use `putIfAbsent("keyboards", 20)` to add new item
- Use `putIfAbsent("laptops", 99)` to show it won't update existing key
- Print final inventory state
- Add blank line at end for spacing

---

### Prompt 4: Map Iteration Techniques - Different Ways to Loop Through Maps
**Task**: Create a method demonstrating three different approaches to iterate through Map entries.

**Expected Function Signature**: `public static void mapIterationExamples()`

**Requirements**:
- Print section header: "4. Map Iteration Techniques:"
- Create studentGrades map with "Alice" -> 95, "Bob" -> 87, "Charlie" -> 92
- Demonstrate keySet() iteration with enhanced for loop:
  - Print "Using keySet() and enhanced for loop:"
  - Loop through `studentGrades.keySet()` and print each student's grade using `get()`
- Demonstrate entrySet() iteration with enhanced for loop:
  - Print "Using entrySet() and enhanced for loop:"
  - Loop through `studentGrades.entrySet()` using Map.Entry
  - Print key and value using `getKey()` and `getValue()`
- Demonstrate forEach() with lambda expression:
  - Print "Using forEach() with lambda expression:"
  - Use `forEach((student, grade) -> ...)` to print each entry
- Add blank line at end for spacing

---

### Prompt 5: Real-World Examples to Help Understand Map Usage
**Task**: Create a method demonstrating practical Map applications including phone book, country capitals, and word frequency counting.

**Expected Function Signature**: `public static void realWorldExamples()`

**Requirements**:
- Print section header: "5. Real-World Examples:"
- Create phone book example:
  - Create `Map<String, String> phoneBook` with contacts: "John Doe" -> "555-1234", "Jane Smith" -> "555-5678", "Bob Johnson" -> "555-9012"
  - Print "Phone Book:" header
  - Iterate using entrySet() and print each contact with arrow format: "Name -> Phone"
- Create country capitals example:
  - Create capitals map with "USA" -> "Washington D.C.", "France" -> "Paris", "Japan" -> "Tokyo", "India" -> "New Delhi"
  - Print "Country Capitals:" header with blank line
  - Look up specific country "France" and print result
- Create word frequency counter example:
  - Define text: "hello world hello java world"
  - Create `Map<String, Integer> wordCount` as empty HashMap
  - Split text by spaces and count each word using `getOrDefault(word, 0) + 1`
  - Print "Word Frequency:" header with blank line
  - Use forEach to print each word and its count with format "word appears X times"
- Add blank line at end for spacing

---

## Key Concepts Covered

### 1. Map Creation and Basic Operations

**What you'll learn:**
- How to create different types of Maps (HashMap, LinkedHashMap, TreeMap)
- Basic operations: put(), get(), containsKey(), keySet(), values()
- Understanding key-value relationships and unique key constraint
- When to use Map interface vs concrete implementations

**Code Examples:**
```java
// Creating a Map
Map<String, Integer> studentGrades = new HashMap<>();

// Adding key-value pairs
studentGrades.put("Alice", 95);
studentGrades.put("Bob", 87);

// Retrieving values
Integer aliceGrade = studentGrades.get("Alice");

// Checking key existence
if (studentGrades.containsKey("Bob")) {
    System.out.println("Bob's grade: " + studentGrades.get("Bob"));
}
```

**Key Points:**
- Keys must be unique; values can be duplicated
- put() adds new entries or updates existing ones
- get() returns null if key doesn't exist
- containsKey() is safer than checking for null values

### 2. Different Map Types and Their Ordering

**What you'll learn:**
- HashMap: No guaranteed order, fastest performance
- LinkedHashMap: Maintains insertion order
- TreeMap: Automatically sorted by keys
- When to choose each Map implementation

**Code Examples:**
```java
// HashMap - no order guaranteed
Map<String, String> hashMap = new HashMap<>();

// LinkedHashMap - maintains insertion order
Map<String, String> linkedHashMap = new LinkedHashMap<>();

// TreeMap - sorted by keys
Map<String, String> treeMap = new TreeMap<>();
```

**Key Points:**
- HashMap offers best performance for most use cases
- LinkedHashMap useful when insertion order matters
- TreeMap provides automatic sorting but with slower performance
- Choose based on your ordering and performance requirements

### 3. Essential Map Operations

**What you'll learn:**
- How to update existing values safely
- Different removal methods and their return values
- Safe value retrieval with getOrDefault()
- Conditional insertion with putIfAbsent()

**Code Examples:**
```java
Map<String, Integer> inventory = new HashMap<>();

// Update existing value
inventory.put("laptops", 12); // Updates if exists, adds if not

// Safe removal with return value
Integer removedValue = inventory.remove("tablets");

// Safe retrieval with default
Integer mice = inventory.getOrDefault("mice", 0);

// Conditional insertion
inventory.putIfAbsent("keyboards", 20); // Only adds if key doesn't exist
```

**Key Points:**
- put() both adds and updates entries
- remove() returns the removed value or null
- getOrDefault() prevents null pointer exceptions
- putIfAbsent() useful for initialization patterns

### 4. Map Iteration Patterns

**What you'll learn:**
- Three different ways to iterate through Map entries
- When to use keySet() vs entrySet() vs forEach()
- Performance implications of different iteration methods
- Modern functional programming approaches with Maps

**Code Examples:**
```java
Map<String, Integer> studentGrades = new HashMap<>();

// Method 1: Using keySet() - less efficient
for (String student : studentGrades.keySet()) {
    System.out.println(student + ": " + studentGrades.get(student));
}

// Method 2: Using entrySet() - more efficient
for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}

// Method 3: Using forEach() - modern approach
studentGrades.forEach((student, grade) -> 
    System.out.println(student + ": " + grade));
```

**Key Points:**
- entrySet() iteration is more efficient than keySet() + get()
- forEach() with lambdas provides cleaner, more readable code
- Use keySet() only when you need just the keys
- entrySet() gives direct access to both key and value

### 5. Real-World Applications

**What you'll learn:**
- Practical applications of Maps in everyday programming
- Common patterns like phone books and lookup tables
- Word frequency counting algorithm
- How Maps solve real business problems

**Code Examples:**
```java
// Phone book implementation
Map<String, String> phoneBook = new HashMap<>();
phoneBook.put("John Doe", "555-1234");

// Country-capital lookup
Map<String, String> capitals = new HashMap<>();
capitals.put("France", "Paris");
String capital = capitals.get("France");

// Word frequency counter
Map<String, Integer> wordCount = new HashMap<>();
for (String word : words) {
    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
}
```

**Key Points:**
- Maps excel at lookup operations and associations
- Frequency counting is a common Map pattern
- getOrDefault() simplifies counter implementations
- Maps provide O(1) average lookup time

## Performance Characteristics

| Operation | HashMap | LinkedHashMap | TreeMap | Notes |
|-----------|---------|---------------|---------|-------|
| `get(key)` | O(1) | O(1) | O(log n) | HashMap fastest |
| `put(key, value)` | O(1) | O(1) | O(log n) | HashMap fastest |
| `remove(key)` | O(1) | O(1) | O(log n) | HashMap fastest |
| `containsKey(key)` | O(1) | O(1) | O(log n) | HashMap fastest |
| Iteration | O(n) | O(n) | O(n) | LinkedHashMap preserves order |

## Best Practices with Maps

1. **Use Map Interface**: `Map<K, V> map = new HashMap<>();` for flexibility
2. **Choose Right Implementation**: HashMap for performance, LinkedHashMap for order, TreeMap for sorting
3. **Null Handling**: Use getOrDefault() to avoid null pointer exceptions
4. **Key Immutability**: Ensure keys don't change after insertion
5. **Proper Equals/HashCode**: Override these methods for custom key objects
6. **Use entrySet()**: More efficient than keySet() + get() for iteration
7. **Initial Capacity**: Set capacity if you know approximate size

## Common Use Cases

- **Lookup Tables**: Mapping codes to descriptions, IDs to names
- **Caching**: Storing computed results for quick retrieval
- **Configuration**: Mapping property names to values
- **Counting**: Frequency analysis and occurrence tracking
- **Indexing**: Creating indexes for fast data access
- **Association**: Linking related data elements
- **Translation**: Mapping between different representations

## Real-World Applications

- **User Management**: Mapping user IDs to user profiles
- **Inventory Systems**: Product codes to stock quantities
- **Web Applications**: Session IDs to user sessions
- **Database Indexing**: Primary keys to record locations
- **Gaming**: Player names to scores or achievements
- **Configuration Management**: Setting names to values
- **Language Processing**: Words to definitions or translations
- **Financial Systems**: Account numbers to account details

## When to Use Maps

✅ **Use Maps when:**
- You need fast lookup by key
- You have natural key-value relationships
- You need to eliminate duplicates (by key)
- You want to count occurrences of items
- You need associative arrays or dictionaries

❌ **Don't use Maps when:**
- You only need to store single values (use List or Set)
- Order of insertion is critical and you need indexed access (use List)
- You need mathematical set operations (use Set)
- You have simple sequential data (use arrays or Lists)

## Next Steps

After mastering basic Maps, explore:
- **Maps with Streams API** - Functional programming with Maps
- **Custom Key Objects** - Creating your own key classes
- **Concurrent Maps** - Thread-safe Map operations
- **Map Collectors** - Advanced grouping and partitioning
- **Performance Tuning** - Optimizing Map operations for large datasets
