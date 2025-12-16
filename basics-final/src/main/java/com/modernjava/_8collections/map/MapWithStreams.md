# MapWithStreams.java - Advanced Map Operations Using Java Streams API

## Overview
This file demonstrates how to use Maps with the powerful Streams API for functional programming and data processing. It covers creating Maps from Streams, filtering Map entries, transforming Map data, grouping collections into Maps, and performing complex data analysis. This builds upon basic Map knowledge and introduces modern Java 8+ functional programming techniques that make Map operations more expressive and powerful.

## Prompts for Replication

### Prompt 1: Creating Maps from Other Collections Using Streams
**Task**: Create a method that demonstrates how to create Maps from Lists and other collections using Stream collectors.

**Expected Function Signature**: `public static void createMapsFromStreams()`

**Requirements**:
- Print section header: "1. Creating Maps from Streams:"
- Create `List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");`
- Create map where key is fruit and value is its length using `Collectors.toMap()`:
  - Use `fruit -> fruit` as key mapper and `fruit -> fruit.length()` as value mapper
  - Print result as "Fruit lengths: {map}"
- Create map where key is length and value is fruit:
  - Use `String::length` as key mapper and `Function.identity()` as value mapper
  - Print result as "Length to fruit: {map}"
- Create map with uppercase keys:
  - Use `String::toUpperCase` as key mapper and `Function.identity()` as value mapper
  - Print result as "Uppercase fruits: {map}"
- Add blank line at end for spacing

---

### Prompt 2: Filtering Maps Using Streams
**Task**: Create a method demonstrating how to filter Map entries based on keys, values, or both using Stream operations.

**Expected Function Signature**: `public static void filteringMaps()`

**Requirements**:
- Print section header: "2. Filtering Maps:"
- Create studentGrades map with "Alice" -> 95, "Bob" -> 87, "Charlie" -> 92, "David" -> 78, "Eve" -> 89
- Print original grades: "Original grades: {map}"
- Filter students with grade >= 90:
  - Use `entrySet().stream().filter(entry -> entry.getValue() >= 90)`
  - Collect using `Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)`
  - Print as "High performers (>= 90): {map}"
- Filter students whose names start with "A":
  - Use `filter(entry -> entry.getKey().startsWith("A"))`
  - Print as "Names starting with 'A': {map}"
- Filter and transform in one operation (grade >= 85):
  - Filter for grades >= 85
  - Transform values to "Excellent" if >= 90, "Good" otherwise
  - Print as "Grade categories (85+): {map}"
- Add blank line at end for spacing

---

### Prompt 3: Transforming Maps Using Streams
**Task**: Create a method showing how to transform Map keys and values using Stream operations.

**Expected Function Signature**: `public static void transformingMaps()`

**Requirements**:
- Print section header: "3. Transforming Maps:"
- Create prices map with "laptop" -> 999.99, "phone" -> 699.99, "tablet" -> 399.99, "headphones" -> 199.99
- Print original prices: "Original prices: {map}"
- Apply 10% discount to all prices:
  - Transform values using `entry -> entry.getValue() * 0.9`
  - Print as "Discounted prices (10% off): {map}"
- Create price categories map:
  - Keep original keys
  - Transform values to categories: "Budget" (<300), "Mid-range" (300-700), "Premium" (>700)
  - Print as "Price categories: {map}"
- Add blank line at end for spacing

---

### Prompt 4: Grouping Data into Maps Using Streams
**Task**: Create a method demonstrating how to group collections into Maps using Collectors.groupingBy().

**Expected Function Signature**: `public static void groupingIntoMaps()`

**Requirements**:
- Print section header: "4. Grouping into Maps:"
- Create list of Employee objects with: 
  - "Alice", "Engineering", 95000
  - "Bob", "Marketing", 65000  
  - "Charlie", "Engineering", 88000
  - "David", "Sales", 72000
  - "Eve", "Marketing", 58000
  - "Frank", "Engineering", 102000
- Group employees by department using `Collectors.groupingBy(Employee::getDepartment)`:
  - Print "Employees by department:" header
  - For each department, print department name and list of employee names
- Group and count employees by department:
  - Use `Collectors.groupingBy(Employee::getDepartment, Collectors.counting())`
  - Print as "Employee count by department: {map}"
- Group employees by salary range:
  - Group by "High" (>=80000) vs "Standard" (<80000)
  - Map to employee names using `Collectors.mapping(Employee::getName, Collectors.toList())`
  - Print as "Employees by salary range: {map}"
- Calculate average salary by department:
  - Use `Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))`
  - Print as "Average salary by department: {map}"
- Add blank line at end for spacing

---

### Prompt 5: Advanced Map Operations with Streams
**Task**: Create a method demonstrating complex Map operations combining multiple Stream techniques.

**Expected Function Signature**: `public static void advancedMapOperations()`

**Requirements**:
- Print section header: "5. Advanced Map Operations:"
- Create subjectScores map with:
  - "Math" -> Arrays.asList(85, 92, 78, 96, 87)
  - "Science" -> Arrays.asList(88, 94, 82, 91, 89)  
  - "English" -> Arrays.asList(79, 85, 91, 88, 93)
- Calculate average score for each subject:
  - Transform values to averages using `entry.getValue().stream().mapToInt(Integer::intValue).average().orElse(0.0)`
  - Print as "Average scores by subject: {map}"
- Find subject with highest average:
  - Use `max(Map.Entry.comparingByValue())` on averageScores
  - Use `ifPresent()` to print result
  - Print as "Top performing subject: {subject} with average {formatted_average}"
- Add blank line at end for spacing

---

### Prompt 6: Helper Employee Class Definition
**Task**: Create a static inner Employee class to support the grouping examples.

**Expected Class Definition**:
```java
static class Employee {
    private String name;
    private String department;
    private double salary;
    
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    
    @Override
    public String toString() {
        return name + "(" + department + ", $" + salary + ")";
    }
}
```

---

## Key Concepts Covered

### 1. Creating Maps from Streams

**What you'll learn:**
- How to use Collectors.toMap() to create Maps from other collections
- Different mapper functions for keys and values
- Using method references vs lambda expressions
- Function.identity() for using the element itself as key or value

**Code Examples:**
```java
List<String> fruits = Arrays.asList("apple", "banana", "cherry");

// Create map: fruit -> length
Map<String, Integer> fruitLengths = fruits.stream()
    .collect(Collectors.toMap(
        fruit -> fruit,           // key mapper
        fruit -> fruit.length()   // value mapper
    ));

// Using method references
Map<Integer, String> lengthToFruit = fruits.stream()
    .collect(Collectors.toMap(
        String::length,           // key mapper
        Function.identity()       // value mapper (the fruit itself)
    ));
```

**Key Points:**
- Collectors.toMap() transforms streams into Maps
- Key mapper function determines how to extract keys
- Value mapper function determines how to extract values
- Function.identity() returns the input unchanged
- Method references (::) can replace simple lambda expressions

### 2. Filtering Maps with Streams

**What you'll learn:**
- How to filter Map entries based on conditions
- Working with Map.Entry in stream operations
- Combining filtering with Map reconstruction
- Filtering by keys, values, or complex conditions

**Code Examples:**
```java
Map<String, Integer> studentGrades = new HashMap<>();
// ... populate map

// Filter by value
Map<String, Integer> highPerformers = studentGrades.entrySet().stream()
    .filter(entry -> entry.getValue() >= 90)
    .collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue
    ));

// Filter by key
Map<String, Integer> aNames = studentGrades.entrySet().stream()
    .filter(entry -> entry.getKey().startsWith("A"))
    .collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue
    ));
```

**Key Points:**
- Use entrySet().stream() to stream Map entries
- filter() works with Map.Entry objects
- Map.Entry::getKey and Map.Entry::getValue extract components
- Can filter by key, value, or any combination of conditions
- Always collect back to Map using Collectors.toMap()

### 3. Transforming Map Data

**What you'll learn:**
- How to transform Map keys and values separately or together
- Mathematical operations on Map values
- String transformations on Map keys
- Creating derived Maps with different data types

**Code Examples:**
```java
Map<String, Double> prices = new HashMap<>();
// ... populate map

// Transform values (apply discount)
Map<String, Double> discountedPrices = prices.entrySet().stream()
    .collect(Collectors.toMap(
        Map.Entry::getKey,                    // keep original key
        entry -> entry.getValue() * 0.9      // transform value
    ));

// Transform both keys and values
Map<String, Integer> roundedPrices = prices.entrySet().stream()
    .collect(Collectors.toMap(
        entry -> entry.getKey().toUpperCase(),     // transform key
        entry -> (int) Math.round(entry.getValue()) // transform value
    ));
```

**Key Points:**
- Transform keys and values independently using different mapper functions
- Mathematical operations can be applied to numeric values
- String operations can transform keys into different formats
- Type transformations are possible (Double to Integer, etc.)
- Complex business logic can be embedded in transformation functions

### 4. Grouping Collections into Maps

**What you'll learn:**
- How to use Collectors.groupingBy() for data aggregation
- Creating Maps with List values from object collections
- Downstream collectors for further processing
- Multiple grouping strategies and counting operations

**Code Examples:**
```java
List<Employee> employees = Arrays.asList(/*...*/);

// Basic grouping
Map<String, List<Employee>> byDepartment = employees.stream()
    .collect(Collectors.groupingBy(Employee::getDepartment));

// Grouping with counting
Map<String, Long> countByDepartment = employees.stream()
    .collect(Collectors.groupingBy(
        Employee::getDepartment,
        Collectors.counting()
    ));

// Grouping with mapping
Map<String, List<String>> namesByDepartment = employees.stream()
    .collect(Collectors.groupingBy(
        Employee::getDepartment,
        Collectors.mapping(Employee::getName, Collectors.toList())
    ));
```

**Key Points:**
- groupingBy() creates Maps where keys are group criteria
- Default value type is List<T> containing grouped elements
- Downstream collectors can transform or aggregate grouped data
- Common downstream collectors: counting(), mapping(), averagingDouble()
- Can group by any property or computed value

### 5. Advanced Stream Operations with Maps

**What you'll learn:**
- Combining multiple stream operations for complex transformations
- Statistical operations on Map values
- Finding extremes (min, max) in Map data
- Creating summary information from detailed data

**Code Examples:**
```java
Map<String, List<Integer>> subjectScores = new HashMap<>();
// ... populate with score lists

// Calculate averages
Map<String, Double> averages = subjectScores.entrySet().stream()
    .collect(Collectors.toMap(
        Map.Entry::getKey,
        entry -> entry.getValue().stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0)
    ));

// Find maximum using Optional and ifPresent
Optional<Map.Entry<String, Double>> topSubject = averages.entrySet().stream()
    .max(Map.Entry.comparingByValue());

topSubject.ifPresent(entry ->
    System.out.println("Top subject: " + entry.getKey() + 
                      " with average " + entry.getValue())
);
```

**Key Points:**
- Can perform statistical operations on collections within Map values
- Optional handling is important for empty collections
- max() and min() operations return Optional results
- ifPresent() is used for safe Optional handling
- Nested stream operations allow deep data processing

## Performance Considerations

| Operation | Complexity | Best Practice |
|-----------|------------|---------------|
| Stream Creation | O(1) | Reuse streams when possible |
| Filtering | O(n) | Filter early in pipeline |
| Mapping | O(n) | Combine transformations |
| Grouping | O(n) | Consider memory usage |
| Collecting | O(n) | Choose appropriate collector |

## Best Practices with Map Streams

1. **Use Appropriate Collectors**: Choose the right collector for your use case
2. **Method References**: Prefer `String::length` over `s -> s.length()`
3. **Early Filtering**: Filter data early in the pipeline for performance
4. **Handle Nulls**: Use Optional methods and null-safe operations
5. **Readability**: Break complex operations into smaller, named methods
6. **Parallel Streams**: Consider `parallelStream()` for large datasets
7. **Collect Once**: Avoid multiple terminal operations on same stream

## Common Stream Patterns with Maps

### Frequency Counting
```java
Map<String, Long> frequency = words.stream()
    .collect(Collectors.groupingBy(
        Function.identity(),
        Collectors.counting()
    ));
```

### Index Creation
```java
Map<Integer, Employee> employeeIndex = employees.stream()
    .collect(Collectors.toMap(
        Employee::getId,
        Function.identity()
    ));
```

### Data Transformation
```java
Map<String, String> transformed = original.entrySet().stream()
    .collect(Collectors.toMap(
        entry -> transform(entry.getKey()),
        entry -> transform(entry.getValue())
    ));
```

### Conditional Grouping
```java
Map<Boolean, List<Employee>> partitioned = employees.stream()
    .collect(Collectors.partitioningBy(
        emp -> emp.getSalary() > 50000
    ));
```

## Real-World Applications

- **Data Analysis**: Grouping sales data by region, time period, or product category
- **Report Generation**: Creating summary statistics from detailed transaction data
- **User Analytics**: Grouping user behavior by demographics or activity patterns
- **Inventory Management**: Transforming product data for different display formats
- **Financial Processing**: Calculating aggregates and transforming currency values
- **Log Analysis**: Grouping and counting log entries by severity or source
- **Configuration Management**: Transforming settings between different formats
- **Search Indexing**: Creating lookup tables and inverted indexes

## When to Use Map Streams

✅ **Use Map Streams when:**
- You need to transform or filter existing Map data
- You want to create Maps from other collections
- You need to group data by specific criteria
- You're performing data analysis or aggregation
- You want functional, declarative code style

❌ **Consider alternatives when:**
- Simple iteration is sufficient (use forEach)
- Performance is critical and imperative code is faster
- Operations are too complex for readable stream chains
- You need to modify Maps in place (use traditional loops)

## Next Steps

After mastering Map Streams, explore:
- **Parallel Map Processing** - Using parallel streams with Maps
- **Custom Collectors** - Creating your own collection strategies
- **Map Performance Tuning** - Optimizing Map operations for large datasets
- **Reactive Streams** - Using Maps with reactive programming
- **Map Serialization** - Persisting and loading Map data
