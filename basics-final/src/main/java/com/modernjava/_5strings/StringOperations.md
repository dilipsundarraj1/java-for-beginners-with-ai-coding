# StringOperations.java - Essential String Methods

## Overview
This file demonstrates the most commonly used string operations that every Java developer needs to know for day-to-day programming tasks.

## Prompts for Replication

### Prompt 1: Basic String Operations Demonstration
**Task**: Create a method that demonstrates basic string information operations including length, character access, and empty/blank checking.

**Expected Function Signature**: `private static void demonstrateBasicOperations(String text)`

**Requirements**:
- Print section header: "\n--- Basic String Operations ---"
- Display original text with label: "Original text: " + text
- Show string length: "Length: " + text.length()
- Display character at index 0: "Character at index 0: " + text.charAt(0)
- Display character at index 6: "Character at index 6: " + text.charAt(6)
- Show isEmpty() result: "Is empty: " + text.isEmpty()
- Split text into words array: `String[] words = text.split(" ")`
- Print first word: `System.out.println(words[0])` with comment `// "Hello"`
- Create empty and blank strings: `String empty = ""` and `String blank = "   "`
- Show empty string length, blank string length, and blank string isBlank() result (Java 11+)

---

### Prompt 2: String Concatenation Demonstration
**Task**: Create a method that demonstrates different string concatenation approaches and their performance implications.

**Expected Function Signature**: `private static void demonstrateConcatenation()`

**Requirements**:
- Print section header: "\n--- String Concatenation ---"
- Create two strings: `String first = "Hello"` and `String second = "World"`
- Demonstrate + operator: `String result1 = first + " " + second`
- Print result with label: "Using + operator: " + result1
- Demonstrate concat() method: `String result2 = first.concat(" ").concat(second)`
- Print result with label: "Using concat(): " + result2
- Show performance consideration with loop:
  - Initialize `String result3 = ""`
  - Loop from 1 to 3, concatenating "Step" + i + " " to result3
  - Print final result with trim(): "Multiple concatenations: " + result3.trim()

---

### Prompt 3: Case Conversion Demonstration
**Task**: Create a method that demonstrates string case conversion operations including uppercase, lowercase, and capitalization patterns.

**Expected Function Signature**: `private static void demonstrateCaseConversion(String text)`

**Requirements**:
- Print section header: "\n--- Case Conversion ---"
- Display original text: "Original: " + text
- Show uppercase conversion: "Upper case: " + text.toUpperCase()
- Show lowercase conversion: "Lower case: " + text.toLowerCase()
- Demonstrate first letter capitalization:
  - Create string: `String name = "java"`
  - Capitalize: `String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1)`
  - Print result: "Capitalized: " + capitalized

---

### Prompt 4: Substring Operations Demonstration
**Task**: Create a method that demonstrates substring operations and word extraction techniques.

**Expected Function Signature**: `private static void demonstrateSubstring(String text)`

**Requirements**:
- Print section header: "\n--- Substring Operations ---"
- Display original text: "Original: " + text
- Show substring from index 6: "Substring from index 6: " + text.substring(6)
- Show substring from 0 to 5: "Substring from 0 to 5: " + text.substring(0, 5)
- Show substring from 6 to 10: "Substring from 6 to 10: " + text.substring(6, 10)
- Extract words using split: `String[] words = text.split(" ")`
- Display first word: "First word: " + words[0]
- Display last word: "Last word: " + words[words.length - 1]

## Key Concepts Covered

### 1. Basic String Information Methods

**What you'll learn:**
- How to get string length and access individual characters
- How to check if a string is empty or blank
- How to split strings into arrays

**Code Examples:**
```java
String text = "Hello Java World";
System.out.println("Length: " + text.length());           // 16
System.out.println("Character at index 0: " + text.charAt(0)); // 'H'
System.out.println("Character at index 6: " + text.charAt(6)); // 'J'
System.out.println("Is empty: " + text.isEmpty());        // false

String[] words = text.split(" ");
System.out.println(words[0]); // "Hello"

String empty = "";
String blank = "   ";
System.out.println("Empty length: " + empty.length());    // 0
System.out.println("Blank is blank: " + blank.isBlank()); // true (Java 11+)
```

**Key Points:**
- `length()` returns the number of characters (including spaces)
- `charAt(index)` gets character at specific position (0-based indexing)
- `isEmpty()` checks if length is 0
- `isBlank()` (Java 11+) checks if string contains only whitespace
- `split()` divides string into array based on delimiter

### 2. String Concatenation

**What you'll learn:**
- Different ways to join strings together
- Performance implications of various concatenation methods

**Code Examples:**
```java
String first = "Hello";
String second = "World";

// Using + operator (most common)
String result1 = first + " " + second;  // "Hello World"

// Using concat() method
String result2 = first.concat(" ").concat(second);  // "Hello World"

// Multiple concatenations in loops (performance consideration)
String result3 = "";
for (int i = 1; i <= 3; i++) {
    result3 += "Step" + i + " ";  // Creates new string each time
}
// Result: "Step1 Step2 Step3 "
```

**Key Points:**
- `+` operator is convenient and readable for simple concatenation
- `concat()` method is more explicit but less readable for multiple strings
- Multiple concatenations in loops can be inefficient (use StringBuilder instead)
- Each concatenation creates a new string object due to immutability

### 3. Case Conversion

**What you'll learn:**
- How to change string case for formatting and comparison
- Common patterns like capitalizing first letter

**Code Examples:**
```java
String text = "Hello Java World";
System.out.println("Upper case: " + text.toUpperCase());  // "HELLO JAVA WORLD"
System.out.println("Lower case: " + text.toLowerCase());  // "hello java world"

// Capitalize first letter
String name = "java";
String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
System.out.println("Capitalized: " + capitalized);  // "Java"
```

**Key Points:**
- `toUpperCase()` and `toLowerCase()` return new strings
- Original string remains unchanged
- Useful for case-insensitive comparisons
- Common pattern: capitalize first letter using `substring()` combination

### 4. Substring Operations

**What you'll learn:**
- How to extract parts of strings
- Working with string indices and ranges
- Extracting words and components

**Code Examples:**
```java
String text = "Hello Java World";
System.out.println("From index 6: " + text.substring(6));      // "Java World"
System.out.println("From 0 to 5: " + text.substring(0, 5));    // "Hello"
System.out.println("From 6 to 10: " + text.substring(6, 10));  // "Java"

// Extract words using split
String[] words = text.split(" ");
System.out.println("First word: " + words[0]);                 // "Hello"
System.out.println("Last word: " + words[words.length - 1]);   // "World"
```

**Key Points:**
- `substring(startIndex)` extracts from start index to end
- `substring(startIndex, endIndex)` extracts between indices (end index exclusive)
- Indices are 0-based (first character is at index 0)
- `split()` divides string into array based on delimiter
- Access array elements using index notation

## Running the Code

Execute the `StringOperations.java` file to see:
- Basic string information and character access
- Different concatenation approaches and performance considerations
- Case conversion operations
- Substring extraction and word manipulation

## Expected Output

```
=== String Operations ===

--- Basic String Operations ---
Original text: Hello Java World
Length: 16
Character at index 0: H
Character at index 6: J
Is empty: false
Hello
Empty string length: 0
Blank string length: 3
Blank string is blank: true

--- String Concatenation ---
Using + operator: Hello World
Using concat(): Hello World
Multiple concatenations: Step1 Step2 Step3

--- Case Conversion ---
Original: Hello Java World
Upper case: HELLO JAVA WORLD
Lower case: hello java world
Capitalized: Java

--- Substring Operations ---
Original: Hello Java World
Substring from index 6: Java World
Substring from 0 to 5: Hello
Substring from 6 to 10: Java
First word: Hello
Last word: World
```

## Practical Applications

### 1. Input Validation
```java
String userInput = "  John Doe  ";
if (!userInput.trim().isEmpty()) {
    String cleanName = userInput.trim();
    String firstName = cleanName.substring(0, cleanName.indexOf(" "));
    // Process valid input
}
```

### 2. Text Processing
```java
String email = "user@example.com";
String username = email.substring(0, email.indexOf("@"));
String domain = email.substring(email.indexOf("@") + 1);
```

### 3. Formatting Names
```java
String fullName = "john doe";
String[] nameParts = fullName.split(" ");
String formattedName = "";
for (String part : nameParts) {
    formattedName += part.substring(0, 1).toUpperCase() + 
                    part.substring(1).toLowerCase() + " ";
}
// Result: "John Doe "
```

## Performance Considerations

### Efficient vs Inefficient Concatenation
```java
// Inefficient - creates many temporary objects
String result = "";
for (int i = 0; i < 1000; i++) {
    result += "item" + i;  // Bad for loops
}

// Efficient - use StringBuilder for loops
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append("item").append(i);
}
String result = sb.toString();
```

## Common Patterns

### 1. Safe Character Access
```java
String text = "Hello";
if (text.length() > 2) {
    char thirdChar = text.charAt(2);  // Safe - won't throw exception
}
```

### 2. Extracting File Extensions
```java
String filename = "document.pdf";
if (filename.contains(".")) {
    String extension = filename.substring(filename.lastIndexOf(".") + 1);
    // extension = "pdf"
}
```

### 3. Building Display Text
```java
String firstName = "John";
String lastName = "Doe";
int age = 25;
String displayText = firstName + " " + lastName + " (Age: " + age + ")";
// Result: "John Doe (Age: 25)"
```

## Things to Remember

1. **All string methods return new strings** - original is never modified
2. **Check string length** before using `charAt()` to avoid exceptions
3. **Use `+` for simple concatenation**, StringBuilder for loops
4. **Substring end index is exclusive** - `substring(0, 5)` gets characters 0-4
5. **Empty strings have length 0**, blank strings contain only whitespace
6. **Split returns an array** - use proper indexing to access elements

## Practice Exercises

1. Write a method that counts the number of words in a sentence
2. Create a function that reverses a string using substring operations
3. Build a simple text formatter that capitalizes each word
4. Extract domain name from email addresses
5. Create a method that removes all spaces from a string

## Next Steps
- **StringComparison.java**: Learn different ways to compare strings
- **StringPool.java**: Understand string memory optimization
- **StringPerformance.java**: Master StringBuilder for performance optimization
