# Map Concepts for Beginners

This directory contains comprehensive examples and exercises to help beginners understand Java Maps, from basic concepts to advanced usage with Streams API.

## Learning Path

### 1. **MapBasics.java** - Start Here!
**Concepts Covered:**
- What is a Map? (Key-value pairs)
- Creating and using HashMap, LinkedHashMap, TreeMap
- Basic operations: put(), get(), containsKey(), remove()
- Real-world examples: phone book, word frequency counter

**Key Takeaways:**
- Maps store unique keys that map to values
- Different Map types have different ordering behaviors
- HashMap = fast, no order
- LinkedHashMap = insertion order maintained
- TreeMap = sorted by keys

### 2. **MapWithStreams.java** - Advanced Operations
**Concepts Covered:**
- Creating Maps from Streams using `Collectors.toMap()`
- Filtering Maps with `filter()` and collecting results
- Transforming Map values and keys
- Grouping data into Maps with `Collectors.groupingBy()`
- Advanced operations combining multiple stream operations

**Key Takeaways:**
- Streams make Map operations functional and fluent
- `Collectors.toMap()` creates Maps from other collections
- Map.Entry provides access to both key and value in streams
- Grouping operations are powerful for data analysis

### 3. **MapExercises.java** - Practice Makes Perfect
**Exercises Include:**
- Country population management
- Word frequency analysis
- Student grade calculations
- Inventory management system
- Employee data transformation
- Sales data analysis with grouping

## Quick Reference

### Basic Map Operations
```java
Map<String, Integer> map = new HashMap<>();
map.put("key", 42);                    // Add/update
Integer value = map.get("key");        // Retrieve
boolean exists = map.containsKey("key"); // Check existence
map.remove("key");                     // Remove
```

### Streams with Maps
```java
// Create Map from Stream
Map<String, Integer> lengths = words.stream()
    .collect(Collectors.toMap(w -> w, String::length));

// Filter Map entries
Map<String, Integer> filtered = map.entrySet().stream()
    .filter(entry -> entry.getValue() > 10)
    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

// Group by property
Map<String, List<Person>> byCity = people.stream()
    .collect(Collectors.groupingBy(Person::getCity));
```

## Common Patterns

### 1. Counting/Frequency
```java
Map<String, Integer> frequency = new HashMap<>();
for (String item : items) {
    frequency.put(item, frequency.getOrDefault(item, 0) + 1);
}
```

### 2. Lookup Tables
```java
Map<String, String> countryCapitals = new HashMap<>();
countryCapitals.put("USA", "Washington D.C.");
countryCapitals.put("France", "Paris");
```

### 3. Caching/Memoization
```java
Map<String, ExpensiveResult> cache = new HashMap<>();
public ExpensiveResult compute(String input) {
    return cache.computeIfAbsent(input, this::expensiveOperation);
}
```

## When to Use Each Map Type

| Map Type | Use When | Example |
|----------|----------|---------|
| HashMap | Need fast access, don't care about order | Caches, lookups |
| LinkedHashMap | Need predictable iteration order | LRU caches, maintaining insertion order |
| TreeMap | Need sorted keys | Alphabetical ordering, range queries |
| ConcurrentHashMap | Need thread safety | Multi-threaded applications |

## Best Practices

1. **Choose the right Map type** based on your ordering and performance needs
2. **Use generics** to specify key and value types: `Map<String, Integer>`
3. **Handle null cases** with `getOrDefault()` or `computeIfAbsent()`
4. **Use Streams** for complex transformations and filtering
5. **Consider immutable Maps** using `Map.of()` for constants
6. **Use method references** in streams when possible: `String::length`

## Running the Examples

1. **Start with basics:**
   ```bash
   cd /path/to/project
   ./gradlew run -PmainClass=com.modernjava._8collections.map.MapBasics
   ```

2. **Explore streams:**
   ```bash
   ./gradlew run -PmainClass=com.modernjava._8collections.map.MapWithStreams
   ```

3. **Practice with exercises:**
   ```bash
   ./gradlew run -PmainClass=com.modernjava._8collections.map.MapExercises
   ```

## What You'll Learn

By working through these examples, you'll understand:
- ✅ How Maps work and when to use them
- ✅ The differences between Map implementations
- ✅ How to perform common Map operations
- ✅ How to use Maps with Java 8+ Streams API
- ✅ Real-world applications of Maps in programming
- ✅ Best practices for Map usage

## Next Steps

After mastering Maps, consider exploring:
- **Sets** - Collections of unique elements
- **Lists** - Ordered collections with duplicates
- **Advanced Stream operations** - Parallel streams, custom collectors
- **Functional programming** - Using Maps with functional interfaces

Remember: Maps are one of the most useful data structures in programming. They appear everywhere from caching to configuration, from counting to grouping. Master them, and you'll write more efficient and elegant code!
