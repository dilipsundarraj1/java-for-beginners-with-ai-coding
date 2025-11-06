# StringTokenizers.java - Understanding String Tokenization Methods

<!-- TOC -->
* [StringTokenizers.java - Understanding String Tokenization Methods](#stringtokenizersjava---understanding-string-tokenization-methods)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: StringTokenizer Basics](#prompt-1-stringtokenizer-basics)
    * [Prompt 2: Custom Delimiters and Delimiter Inclusion](#prompt-2-custom-delimiters-and-delimiter-inclusion)
    * [Prompt 3: StringTokenizer vs String.split() Comparison](#prompt-3-stringtokenizer-vs-stringsplit-comparison)
    * [Prompt 4: Handling Empty Tokens](#prompt-4-handling-empty-tokens)
  * [Key Concepts Covered](#key-concepts-covered)
    * [1. StringTokenizer Fundamentals](#1-stringtokenizer-fundamentals)
    * [2. Custom Delimiters and Options](#2-custom-delimiters-and-options)
    * [3. StringTokenizer vs String.split()](#3-stringtokenizer-vs-stringsplit)
    * [4. Empty Token Handling Strategies](#4-empty-token-handling-strategies)
  * [When to Use Each Method](#when-to-use-each-method)
    * [Use StringTokenizer when:](#use-stringtokenizer-when)
    * [Use String.split() when:](#use-stringsplit-when)
  * [Performance Guidelines](#performance-guidelines)
  * [Common Tokenization Patterns](#common-tokenization-patterns)
  * [Best Practices](#best-practices)
  * [Real-World Applications](#real-world-applications)
    * [CSV Processing](#csv-processing)
    * [Configuration File Processing](#configuration-file-processing)
    * [Log File Analysis](#log-file-analysis)
  * [Common Pitfalls and Solutions](#common-pitfalls-and-solutions)
  * [Memory and Performance Considerations](#memory-and-performance-considerations)
    * [StringTokenizer Advantages](#stringtokenizer-advantages)
    * [String.split() Advantages](#stringsplit-advantages)
<!-- TOC -->
## Overview
This file covers various string tokenization approaches in Java, including the StringTokenizer class, String.split() method comparison, and handling empty tokens. It demonstrates when to use each approach, handling different delimiters, and managing empty tokens in different scenarios.

## Prompts for Replication

### Prompt 1: StringTokenizer Basics
**Task**: Create a method that demonstrates basic StringTokenizer usage with default delimiters and token counting.

**Expected Function Signature**: `private static void stringTokenizerBasics()`

**Requirements**:
- Print section header: "1. StringTokenizer Basics:"
- Create test sentence: `"Java is a powerful programming language"`
- Create StringTokenizer with default delimiters (space, tab, newline)
- Display original string and token count using `countTokens()`
- Use while loop with `hasMoreTokens()` and `nextToken()` to extract all tokens
- Print each token with quotes to show exact boundaries
- Demonstrate that StringTokenizer is consumed after iteration

---

### Prompt 2: Custom Delimiters and Delimiter Inclusion
**Task**: Create a method that shows how to use custom delimiters and optionally include delimiters as tokens.

**Expected Function Signature**: `private static void customDelimiters()`

**Requirements**:
- Print section header: "2. StringTokenizer with Custom Delimiters:"
- Create test data: `"apple,banana;orange|grape:cherry"`
- First, tokenize using multiple delimiters: `",;|:"`
- Show tokens without including delimiters
- Then create second tokenizer with same delimiters but include delimiters as tokens (third parameter = true)
- Display both results showing difference between including and excluding delimiters
- Explain practical use cases for delimiter inclusion

---

### Prompt 3: StringTokenizer vs String.split() Comparison
**Task**: Create a method that compares StringTokenizer with String.split() method, showing their differences and use cases.

**Expected Function Signature**: `private static void tokenizerVsSplit()`

**Requirements**:
- Print section header: "3. StringTokenizer vs String.split():"
- Use CSV data: `"John,25,Engineer,New York"`
- Process using StringTokenizer with comma delimiter
- Process using String.split() with comma delimiter
- Display results from both methods
- Include performance notes comparing the two approaches
- Explain when to use each method (StringTokenizer for simple delimiters, split for regex power)

---

### Prompt 4: Handling Empty Tokens
**Task**: Create a method that demonstrates how different tokenization methods handle empty tokens and trailing delimiters.

**Expected Function Signature**: `private static void handlingEmptyTokens()`

**Requirements**:
- Print section header: "5. Handling Empty Tokens:"
- Create data with empty fields: `"apple,,banana,,cherry,"`
- Show StringTokenizer behavior (ignores empty tokens by default)
- Show String.split() behavior (preserves empty tokens)
- Demonstrate String.split() with limit parameter -1 to include trailing empty strings
- Display array indices and values to clearly show differences
- Explain when empty token preservation is important (CSV processing, etc.)

## Key Concepts Covered

### 1. StringTokenizer Fundamentals

**What you'll learn:**
- Legacy but still useful tokenization class
- Default delimiter behavior
- Token counting and iteration
- When StringTokenizer is appropriate

**Code Examples:**
```java
String sentence = "Java is a powerful programming language";

// Create tokenizer with default delimiters (space, tab, newline, etc.)
StringTokenizer tokenizer = new StringTokenizer(sentence);

// Check token count
System.out.println("Number of tokens: " + tokenizer.countTokens()); // 6

// Iterate through tokens
while (tokenizer.hasMoreTokens()) {
    String token = tokenizer.nextToken();
    System.out.println("Token: " + token);
}
// Output: "Java", "is", "a", "powerful", "programming", "language"
```

**Key Points:**
- **Default delimiters**: space, tab, newline, carriage return, form feed
- **Single-use**: StringTokenizer is consumed after iteration
- **countTokens()**: Returns remaining token count (decreases as consumed)
- **Legacy class**: Part of Java since 1.0, still useful for simple cases

### 2. Custom Delimiters and Options

**What you'll learn:**
- Specifying custom delimiter sets
- Including delimiters as tokens
- Multiple delimiter handling
- Delimiter string interpretation

**Code Examples:**
```java
String data = "apple,banana;orange|grape:cherry";

// Custom delimiters without including them
StringTokenizer tokenizer1 = new StringTokenizer(data, ",;|:");
// Result: "apple", "banana", "orange", "grape", "cherry"

// Include delimiters as tokens
StringTokenizer tokenizer2 = new StringTokenizer(data, ",;|:", true);
// Result: "apple", ",", "banana", ";", "orange", "|", "grape", ":", "cherry"

// Single delimiter
StringTokenizer csvTokenizer = new StringTokenizer("a,b,c", ",");
// Result: "a", "b", "c"
```

**Key Points:**
- **Delimiter string**: Each character is treated as separate delimiter
- **Third parameter**: true includes delimiters as tokens
- **Multiple delimiters**: Any character in delimiter string splits
- **No regex support**: Only literal character matching

### 3. StringTokenizer vs String.split()

**What you'll learn:**
- Performance differences between approaches
- Functionality comparison
- When to choose each method
- Memory and reusability considerations

**Code Examples:**
```java
String csvLine = "John,25,Engineer,New York";

// StringTokenizer approach
StringTokenizer tokenizer = new StringTokenizer(csvLine, ",");
while (tokenizer.hasMoreTokens()) {
    System.out.println(tokenizer.nextToken());
}

// String.split() approach  
String[] parts = csvLine.split(",");
for (String part : parts) {
    System.out.println(part);
}

// Performance comparison for large datasets:
// StringTokenizer: Lower memory usage, faster for simple delimiters
// String.split(): More flexible (regex), returns convenient array
```

**Comparison Table:**
| Feature | StringTokenizer | String.split() |
|---------|----------------|----------------|
| **Performance** | Faster for simple cases | Slower (regex overhead) |
| **Memory** | Lower usage | Creates array |
| **Flexibility** | Basic delimiters only | Full regex support |
| **Return Type** | Iterator-like | String array |
| **Reusability** | Single use | Reusable input string |
| **Empty Tokens** | Ignores empty tokens | Preserves empty tokens |

### 4. Empty Token Handling Strategies

**What you'll learn:**
- How different methods handle consecutive delimiters
- Controlling empty token preservation
- Practical implications for data processing
- Choosing appropriate handling for your use case

**Code Examples:**
```java
String dataWithEmpty = "apple,,banana,,cherry,";

// StringTokenizer ignores empty tokens
StringTokenizer tokenizer = new StringTokenizer(dataWithEmpty, ",");
// Result: "apple", "banana", "cherry" (3 tokens)

// String.split() preserves empty tokens by default
String[] parts = dataWithEmpty.split(",");
// Result: ["apple", "", "banana", "", "cherry"] (5 elements)

// String.split() with limit to include trailing empty
String[] allParts = dataWithEmpty.split(",", -1);
// Result: ["apple", "", "banana", "", "cherry", ""] (6 elements)

// Filtering empty strings manually
String[] filtered = Arrays.stream(parts)
    .filter(s -> !s.isEmpty())
    .toArray(String[]::new);
```

**Empty Token Handling Rules:**
| Method | Consecutive Delimiters | Trailing Delimiters |
|--------|----------------------|-------------------|
| **StringTokenizer** | Ignored | Ignored |
| **split()** default | Creates empty strings | Removes trailing empty |
| **split(regex, -1)** | Creates empty strings | Preserves trailing empty |
| **split(regex, limit)** | Creates empty strings | Depends on limit value |

## When to Use Each Method

### Use StringTokenizer when:
- **Simple delimiters** (no regex needed)
- **Performance critical** applications
- **Memory constrained** environments
- **Legacy code** maintenance
- **Don't need empty tokens**

### Use String.split() when:
- **Regex patterns** needed for delimiters
- **Array return type** preferred
- **Empty token preservation** required
- **Modern code** development
- **Integration** with Collections framework

## Performance Guidelines

1. **For simple comma/space splitting**: StringTokenizer fastest
2. **For regex-based splitting**: String.split() most flexible
3. **For large files**: Consider streaming approaches
4. **For memory efficiency**: Process tokens on-demand vs storing arrays
5. **For reusable patterns**: Compile regex patterns once

## Common Tokenization Patterns

```java
// CSV with quoted fields
"\"John Doe\",25,\"New York, NY\""

// Log file entries  
"192.168.1.1 - - [25/Dec/2023:10:00:23 +0000] \"GET /index.html\""

// Configuration files
"database.host=localhost"
"database.port=5432"

// Tab-separated values
"Name\tAge\tCity"
"John\t25\tBoston"

// XML/HTML attribute parsing
"<img src=\"photo.jpg\" alt=\"My Photo\" width=\"100\">"
```

## Best Practices

1. **Choose the right tool**: Match method to requirements
2. **Handle edge cases**: Empty strings, null inputs, no delimiters
3. **Validate input**: Check for expected number of tokens
4. **Performance testing**: Benchmark with real data sizes
5. **Error handling**: Handle malformed input gracefully

## Real-World Applications

### CSV Processing
```java
public List<Employee> parseEmployeeCSV(String csvContent) {
    List<Employee> employees = new ArrayList<>();
    String[] lines = csvContent.split("\n");
    
    for (int i = 1; i < lines.length; i++) { // Skip header
        StringTokenizer tokenizer = new StringTokenizer(lines[i], ",");
        if (tokenizer.countTokens() >= 4) {
            String name = tokenizer.nextToken().trim();
            int age = Integer.parseInt(tokenizer.nextToken().trim());
            String department = tokenizer.nextToken().trim();
            double salary = Double.parseDouble(tokenizer.nextToken().trim());
            
            employees.add(new Employee(name, age, department, salary));
        }
    }
    
    return employees;
}
```

### Configuration File Processing
```java
public Map<String, String> loadConfiguration(String configContent) {
    Map<String, String> config = new HashMap<>();
    StringTokenizer lineTokenizer = new StringTokenizer(configContent, "\n");
    
    while (lineTokenizer.hasMoreTokens()) {
        String line = lineTokenizer.nextToken().trim();
        
        // Skip comments and empty lines
        if (line.startsWith("#") || line.isEmpty()) {
            continue;
        }
        
        // Parse key=value pairs
        String[] keyValue = line.split("=", 2);
        if (keyValue.length == 2) {
            config.put(keyValue[0].trim(), keyValue[1].trim());
        }
    }
    
    return config;
}
```

### Log File Analysis
```java
public void analyzeLogFile(String logContent) {
    StringTokenizer lineTokenizer = new StringTokenizer(logContent, "\n");
    
    while (lineTokenizer.hasMoreTokens()) {
        String logLine = lineTokenizer.nextToken();
        
        // Simple log parsing using space delimiter
        StringTokenizer tokenizer = new StringTokenizer(logLine);
        if (tokenizer.countTokens() >= 3) {
            String timestamp = tokenizer.nextToken();
            String level = tokenizer.nextToken();
            String message = tokenizer.nextToken();
            
            processLogEntry(timestamp, level, message);
        }
    }
}
```

## Common Pitfalls and Solutions

1. **Empty string handling**: Check for null/empty inputs before tokenization
2. **Delimiter confusion**: Remember StringTokenizer treats each character as separate delimiter
3. **Token consumption**: StringTokenizer can only be used once
4. **Performance assumptions**: Test with real data sizes
5. **Regex in split()**: Remember String.split() uses regex patterns

## Memory and Performance Considerations

### StringTokenizer Advantages
- **Lower memory footprint**: No array creation
- **Lazy evaluation**: Tokens created on demand
- **Better for large inputs**: Doesn't load entire result set into memory
- **Faster for simple cases**: No regex compilation overhead

### String.split() Advantages
- **Convenient array result**: Easy to work with and pass around
- **Regex power**: Can handle complex delimiter patterns
- **Predictable behavior**: Always creates array, easier to reason about
- **Better integration**: Works well with modern Java features (Streams, etc.)
