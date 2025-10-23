# CharExamples.java - Understanding Char Primitive Data Type

<!-- TOC -->
* [CharExamples.java - Understanding Char Primitive Data Type](#charexamplesjava---understanding-char-primitive-data-type)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Basic Char Values and Characteristics](#prompt-1-basic-char-values-and-characteristics)
    * [Prompt 2: Unicode Characters and Escape Sequences](#prompt-2-unicode-characters-and-escape-sequences)
    * [Prompt 3: Special Characters and Symbols](#prompt-3-special-characters-and-symbols)
    * [Prompt 4: Char vs String Differences](#prompt-4-char-vs-string-differences)
    * [Prompt 4b: Char Arithmetic Operations](#prompt-4b-char-arithmetic-operations)
    * [Prompt 5: Real-World Practical Examples](#prompt-5-real-world-practical-examples)
  * [Key Concepts Covered](#key-concepts-covered)
    * [1. Char Primitive Type](#1-char-primitive-type)
    * [2. Unicode Support](#2-unicode-support)
    * [3. Escape Sequences](#3-escape-sequences)
    * [4. Special Characters](#4-special-characters)
    * [5. Char vs String](#5-char-vs-string)
  * [Memory Behavior](#memory-behavior)
  * [Common Mistakes to Avoid](#common-mistakes-to-avoid)
    * [1. Using double quotes instead of single quotes](#1-using-double-quotes-instead-of-single-quotes)
    * [2. Trying to store multiple characters](#2-trying-to-store-multiple-characters)
    * [3. Empty character literal](#3-empty-character-literal)
    * [4. Confusing char with String](#4-confusing-char-with-string)
    * [5. Not understanding char is unsigned](#5-not-understanding-char-is-unsigned)
  * [Running the Code](#running-the-code)
  * [Expected Output](#expected-output)
  * [Next Steps](#next-steps)
  * [Summary](#summary)
<!-- TOC -->

## Overview
This file demonstrates the char primitive data type in Java. It covers basic char values, Unicode characters, escape sequences, special characters and symbols, differences between char and String, and practical real-world examples using char in Java programs.

## Prompts for Replication

### Prompt 1: Basic Char Values and Characteristics
**Task**: Create a section that demonstrates the char data type with basic declarations and characteristics.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print section header: "1. BASIC CHAR VALUES"
- Print section divider: "===================="
- Create char variable `letterA` with value 'A'
- Create char variable `letterZ` with value 'Z'
- Create char variable `digit5` with value '5'
- Create char variable `space` with value ' '
- Create char variable `exclamation` with value '!'
- Print label: "📝 Basic Char Declarations:"
- Print each variable with descriptive labels
- Print subsection header: "🔍 Char Characteristics:"
- Print size, range, Unicode range, and default value information
- Add empty line after section

**Exact Code to Implement**:
```java
System.out.println("1. BASIC CHAR VALUES");
System.out.println("====================");

// Basic char declarations
char letterA = 'A';
char letterZ = 'Z';
char digit5 = '5';
char space = ' ';
char exclamation = '!';

System.out.println("📝 Basic Char Declarations:");
System.out.println("letterA: " + letterA);
System.out.println("letterZ: " + letterZ);
System.out.println("digit5: " + digit5);
System.out.println("space: '" + space + "'");
System.out.println("exclamation: " + exclamation);

// Char characteristics
System.out.println("\n🔍 Char Characteristics:");
System.out.println("Size: 16 bits (2 bytes)");
System.out.println("Range: 0 to 65,535 (unsigned)");
System.out.println("Unicode range: '\\u0000' to '\\uffff'");
System.out.println("Default value: '\\u0000' (null character)");
```

**Key Points**:
- Char is a 16-bit Unicode character primitive type
- Size: 16 bits (2 bytes)
- Range: 0 to 65,535 (unsigned)
- Default value: '\u0000' (null character) for instance variables
- **Use single quotes** for char literals: 'A', '5', '@'
- Can store exactly ONE character (letters, digits, symbols)
- Supports full Unicode character set (UTF-16)
- Unlike other numeric types, char is unsigned (no negative values)
- Can be used in arithmetic operations (uses Unicode code point value)
- ASCII characters (0-127) are a subset of Unicode
- Each char has a corresponding numeric value (Unicode code point)

**Expected Output**:
```
1. BASIC CHAR VALUES
====================
📝 Basic Char Declarations:
letterA: A
letterZ: Z
digit5: 5
space: ' '
exclamation: !

🔍 Char Characteristics:
Size: 16 bits (2 bytes)
Range: 0 to 65,535 (unsigned)
Unicode range: '\u0000' to '\uffff'
Default value: '\u0000' (null character)
```

---

### Prompt 2: Unicode Characters and Escape Sequences
**Task**: Create a section demonstrating Unicode characters using escape sequences and direct Unicode input.

**Expected Code Structure**: Variable declarations with Unicode characters and print statements

**Requirements**:
- Print section header with newline: "\n2. UNICODE CHARACTERS & ESCAPE SEQUENCES"
- Print section divider: "========================================="
- Print subsection label: "🌍 Unicode Character Examples:"
- Create char variables using Unicode escape sequences:
  - `unicodeA` = '\u0041' (A)
  - `unicodeAt` = '\u0040' (@)
  - `unicodeDollar` = '\u0024' ($)
  - `unicodeHeart` = '\u2665' (♥)
  - `unicodeStar` = '\u2605' (★)
  - `unicodeArrow` = '\u2192' (→)
- Print each Unicode character with its escape sequence
- Print subsection header: "\n⚡ Escape Sequences:"
- Create char variables for escape sequences:
  - `newline` = '\n'
  - `tab` = '\t'
  - `carriageReturn` = '\r'
  - `backspace` = '\b'
  - `formFeed` = '\f'
  - `singleQuote` = '\''
  - `doubleQuote` = '\"'
  - `backslash` = '\\'
- Print each escape sequence with its ASCII value

**Exact Code to Implement**:
```java
System.out.println("\n2. UNICODE CHARACTERS & ESCAPE SEQUENCES");
System.out.println("=========================================");

// Unicode notation examples
System.out.println("🌍 Unicode Character Examples:");
char unicodeA = '\u0041';      // 'A' in Unicode
char unicodeAt = '\u0040';     // '@' symbol
char unicodeDollar = '\u0024'; // '$' symbol
char unicodeHeart = '\u2665';  // Heart symbol ♥
char unicodeStar = '\u2605';   // Star symbol ★
char unicodeArrow = '\u2192';  // Right arrow →

System.out.println("Unicode A (\\u0041): " + unicodeA);
System.out.println("Unicode @ (\\u0040): " + unicodeAt);
System.out.println("Unicode $ (\\u0024): " + unicodeDollar);
System.out.println("Unicode ♥ (\\u2665): " + unicodeHeart);
System.out.println("Unicode ★ (\\u2605): " + unicodeStar);
System.out.println("Unicode → (\\u2192): " + unicodeArrow);

// Escape sequences
System.out.println("\n⚡ Escape Sequences:");
char newline = '\n';
char tab = '\t';
char carriageReturn = '\r';
char backspace = '\b';
char formFeed = '\f';
char singleQuote = '\'';
char doubleQuote = '\"';
char backslash = '\\';

System.out.println("Newline (\\n): ASCII " + (int)newline);
System.out.println("Tab (\\t): ASCII " + (int)tab);
System.out.println("Carriage return (\\r): ASCII " + (int)carriageReturn);
System.out.println("Backspace (\\b): ASCII " + (int)backspace);
System.out.println("Form feed (\\f): ASCII " + (int)formFeed);
System.out.println("Single quote (\\'): " + singleQuote);
System.out.println("Double quote (\\\"): " + doubleQuote);
System.out.println("Backslash (\\\\): " + backslash);
```

**Key Points**:
- **Unicode Escape Sequences**: \uXXXX format (4 hexadecimal digits)
- All ASCII characters can be represented as Unicode (ASCII 0-127)
- Unicode supports characters from virtually all world languages
- Can use Unicode escape sequences or direct character input
- **Common Escape Sequences**:
  - `\n` - newline (line feed)
  - `\t` - tab
  - `\r` - carriage return
  - `\b` - backspace
  - `\f` - form feed
  - `\'` - single quote
  - `\"` - double quote
  - `\\` - backslash
- Escape sequences start with backslash (\)
- Used to represent special characters that can't be typed directly
- Every Unicode character has a numeric code point (0-65535)
- Can cast char to int to see its numeric value: (int)character

**Expected Output**:
```
2. UNICODE CHARACTERS & ESCAPE SEQUENCES
=========================================
🌍 Unicode Character Examples:
Unicode A (\u0041): A
Unicode @ (\u0040): @
Unicode $ (\u0024): $
Unicode ♥ (\u2665): ♥
Unicode ★ (\u2605): ★
Unicode → (\u2192): →

⚡ Escape Sequences:
Newline (\n): ASCII 10
Tab (\t): ASCII 9
Carriage return (\r): ASCII 13
Backspace (\b): ASCII 8
Form feed (\f): ASCII 12
Single quote (\'): '
Double quote (\"): "
Backslash (\\): \
```

---

### Prompt 3: Special Characters and Symbols
**Task**: Create a section demonstrating mathematical symbols, currency symbols, and other special characters.

**Expected Code Structure**: Variable declarations with special characters and print statements

**Requirements**:
- Print section header with newline: "\n3. SPECIAL CHARACTERS & SYMBOLS"
- Print section divider: "================================"
- Print subsection label: "🧮 Mathematical Symbols:"
- Create char variables for math symbols: +, -, *, /, %, =, <, >
- Print each mathematical symbol
- Print subsection header: "\n💰 Currency & Special Symbols:"
- Create char variables for currency and special symbols:
  - `dollar` = '$'
  - `euro` = '\u20AC' (€)
  - `pound` = '\u00A3' (£)
  - `yen` = '\u00A5' (¥)
  - `copyright` = '\u00A9' (©)
  - `registered` = '\u00AE' (®)
  - `trademark` = '\u2122' (™)
- Print each currency and special symbol

**Exact Code to Implement**:
```java
System.out.println("\n3. SPECIAL CHARACTERS & SYMBOLS");
System.out.println("================================");

// Mathematical symbols
System.out.println("🧮 Mathematical Symbols:");
char plus = '+';
char minus = '-';
char multiply = '*';
char divide = '/';
char percent = '%';
char equals = '=';
char lessThan = '<';
char greaterThan = '>';

System.out.println("Plus: " + plus);
System.out.println("Minus: " + minus);
System.out.println("Multiply: " + multiply);
System.out.println("Divide: " + divide);
System.out.println("Percent: " + percent);
System.out.println("Equals: " + equals);
System.out.println("Less than: " + lessThan);
System.out.println("Greater than: " + greaterThan);

// Currency and special symbols
System.out.println("\n💰 Currency & Special Symbols:");
char dollar = '$';
char euro = '\u20AC';      // € symbol
char pound = '\u00A3';     // £ symbol
char yen = '\u00A5';       // ¥ symbol
char copyright = '\u00A9'; // © symbol
char registered = '\u00AE'; // ® symbol
char trademark = '\u2122';  // ™ symbol

System.out.println("Dollar: " + dollar);
System.out.println("Euro: " + euro);
System.out.println("Pound: " + pound);
System.out.println("Yen: " + yen);
System.out.println("Copyright: " + copyright);
System.out.println("Registered: " + registered);
System.out.println("Trademark: " + trademark);
```

**Key Points**:
- Char can represent any symbol, not just letters and digits
- **Mathematical operators**: +, -, *, /, %, =, <, >
- **Currency symbols**: $, €, £, ¥ (many require Unicode escape sequences)
- **Legal symbols**: ©, ®, ™
- Most common symbols (ASCII) can be typed directly
- International symbols often need Unicode escape sequences
- All symbols have numeric values
- Symbols are just characters with special visual representations

**Expected Output**:
```
3. SPECIAL CHARACTERS & SYMBOLS
================================
🧮 Mathematical Symbols:
Plus: +
Minus: -
Multiply: *
Divide: /
Percent: %
Equals: =
Less than: <
Greater than: >

💰 Currency & Special Symbols:
Dollar: $
Euro: €
Pound: £
Yen: ¥
Copyright: ©
Registered: ®
Trademark: ™
```

---

### Prompt 4: Char vs String Differences
**Task**: Create a section explaining the key differences between char and String.

**Expected Code Structure**: Print statements and char declarations

**Requirements**:
- Print section header with newline: "\n4. CHAR VS STRING DIFFERENCES"
- Print section divider: "=============================="
- Print subsection label: "🔤 Key Differences:"
- Print bullet points explaining differences:
  - char vs String characteristics
  - Quote usage (single vs double)
- Create char variable `singleChar` with value 'H'
- Print "Char example: " + singleChar
- Print "Char size: Always 16 bits (2 bytes)"

**Exact Code to Implement**:
```java
System.out.println("\n4. CHAR VS STRING DIFFERENCES");
System.out.println("==============================");

System.out.println("🔤 Key Differences:");
System.out.println("• char: Single character, primitive type, 16-bit");
System.out.println("• String: Sequence of characters, reference type, variable size");
System.out.println("• char uses single quotes: 'A'");
System.out.println("• String uses double quotes: \"Hello\"");

// Demonstrating the difference
char singleChar = 'H';
// String singleCharAsString = "H"; // This would be a String, not covered yet

System.out.println("\nChar example: " + singleChar);
System.out.println("Char size: Always 16 bits (2 bytes)");
```

**Key Points**:
- **Char**: Primitive type, stores exactly ONE character
- **String**: Reference type (object), stores sequence of characters
- **Memory**: char = 2 bytes, String = variable (overhead + 2 bytes per character)
- **Quotes**: char uses single quotes 'A', String uses double quotes "A"
- **Mutability**: Both are immutable at their level (char values, String objects)
- **Use char when**: Need single character (grade, symbol, flag)
- **Use String when**: Need text, words, sentences, multiple characters
- Cannot mix: char c = "A" is compilation error
- String can contain zero characters (empty string ""), char cannot be empty
- char can be used in arithmetic, String cannot
- char has no methods, String has rich API (length, substring, etc.)
- char is stored by value, String is stored by reference

**Expected Output**:
```
4. CHAR VS STRING DIFFERENCES
==============================
🔤 Key Differences:
• char: Single character, primitive type, 16-bit
• String: Sequence of characters, reference type, variable size
• char uses single quotes: 'A'
• String uses double quotes: "Hello"

Char example: H
Char size: Always 16 bits (2 bytes)
Char can be used in arithmetic operations
Char 'B' - char 'A' = 1
```

---

### Prompt 4b: Char Arithmetic Operations
**Task**: Add a subsection demonstrating that char can be used in arithmetic operations.

**Expected Code Structure**: Variable declarations and arithmetic operations with char

**Requirements**:
- Print message: "Char can be used in arithmetic operations"
- Create char variable `charA` with value 'A'
- Create char variable `charB` with value 'B'
- Create int variable `difference` with value charB - charA
- Print "Char 'B' - char 'A' = " + difference

**Exact Code to Implement**:
```java
// Arithmetic Operation
System.out.println("Char can be used in arithmetic operations");

// Arithmetic with chars
char charA = 'A';
char charB = 'B';
int difference = charB - charA;

System.out.println("Char 'B' - char 'A' = " + difference);
```

**Key Points**:
- Char can participate in arithmetic operations using their Unicode values
- When used in arithmetic, char is automatically promoted to int
- 'A' has Unicode value 65, 'B' has Unicode value 66
- 'B' - 'A' = 66 - 65 = 1
- Useful for: calculating character distances, converting cases, character iterations
- Can add/subtract integers to chars: 'A' + 1 = 'B'
- Result of arithmetic with char is typically int (unless explicitly cast)
- Common use: converting uppercase to lowercase or vice versa
- Example: 'a' - 'A' = 32 (the case difference in ASCII/Unicode)

**Expected Output**:
```
Char can be used in arithmetic operations
Char 'B' - char 'A' = 1
```

---

### Prompt 5: Real-World Practical Examples
**Task**: Create a section demonstrating practical real-world usage of char with grade system examples.

**Expected Code Structure**: Variable declarations and conditional statements using char

**Requirements**:
- Print section header with newline: "\n5. REAL-WORLD PRACTICAL EXAMPLES"
- Print section divider: "================================="
- Print subsection label: "🎓 Grade System:"
- Create char variables for grades: 'A', 'B', 'C', 'D', 'F'
- Use if statement to check if grade1 is between 'A' and 'C'
  - Print passing message if true
- Use if statement to check if grade5 equals 'F'
  - Print failing message if true

**Exact Code to Implement**:
```java
System.out.println("\n5. REAL-WORLD PRACTICAL EXAMPLES");
System.out.println("=================================");

// Grade system using chars
System.out.println("🎓 Grade System:");
char grade1 = 'A';
char grade2 = 'B';
char grade3 = 'C';
char grade4 = 'D';
char grade5 = 'F';

if (grade1 >= 'A' && grade1 <= 'C') {
    System.out.println("Grade " + grade1 + ": Passing grade - Good performance!");
}

if (grade5 == 'F') {
    System.out.println("Grade " + grade5 + ": Failing grade - Needs improvement");
}
```

**Key Points**:
- **Grade Systems**: Using 'A', 'B', 'C', 'D', 'F' for student grades
- **Menu Options**: 'Y'/'N' for yes/no, '1'/'2'/'3' for menu choices
- **Game Development**: Board positions, player symbols ('X', 'O')
- **Text Processing**: Parsing individual characters from input
- **Status Indicators**: Single character flags ('A'ctive, 'P'ending, 'C'ompleted)
- **Keyboard Input**: Capturing single key presses
- Char comparisons use Unicode values ('A' < 'B' is true)
- Can use char in range checks: grade >= 'A' && grade <= 'C'
- Equality checks: grade == 'F'
- Real-world scenarios where single character is sufficient
- More memory efficient than String for single characters
- Often used in legacy systems and protocols

**Expected Output**:
```
5. REAL-WORLD PRACTICAL EXAMPLES
=================================
🎓 Grade System:
Grade A: Passing grade - Good performance!
Grade F: Failing grade - Needs improvement
```

---

## Key Concepts Covered

### 1. Char Primitive Type

**What you'll learn:**
- The char primitive type stores a single 16-bit Unicode character
- Range: 0 to 65,535 (unsigned)
- Size: 16 bits (2 bytes)
- Default value: '\u0000' (null character)
- Uses single quotes for literals
- Can store letters, digits, symbols, and special characters

**Real-world usage:**
- Grade systems ('A', 'B', 'C', 'D', 'F')
- Menu options ('Y'/'N', '1'/'2'/'3')
- Game symbols ('X', 'O' in tic-tac-toe)
- Status flags ('A'ctive, 'P'ending, 'C'ompleted)
- Single keystroke capture

### 2. Unicode Support

**What you'll learn:**
- Java char uses Unicode UTF-16 encoding
- Unicode escape sequences: \uXXXX (4 hex digits)
- Supports characters from all world languages
- ASCII is a subset of Unicode (0-127)
- Every character has a numeric code point
- Can convert between char and int

**Real-world usage:**
- International applications with multilingual support
- Displaying special symbols (♥, ★, →, ©, €)
- Mathematical and scientific notation
- Emoji and extended character sets
- Cross-platform character compatibility

### 3. Escape Sequences

**What you'll learn:**
- Special characters that start with backslash (\)
- Common sequences: \n, \t, \r, \b, \f
- Quote escaping: \', \"
- Backslash escaping: \\
- Used for characters that can't be typed directly
- Each has a specific ASCII/Unicode value

**Real-world usage:**
- Text formatting (newlines, tabs)
- File parsing (CSV, TSV files)
- String literals containing quotes
- File paths on Windows (C:\\Users\\)
- Control characters in protocols

### 4. Special Characters

**What you'll learn:**
- Mathematical symbols (+, -, *, /, %, =, <, >)
- Currency symbols ($, €, £, ¥)
- Legal symbols (©, ®, ™)
- Direct typing vs Unicode escape sequences
- All symbols have numeric values

**Real-world usage:**
- Financial applications (currency symbols)
- Mathematical calculators and expressions
- Legal documents and branding (©, ®, ™)
- Text editors and word processors
- Data validation and input parsing

### 5. Char vs String

**What you'll learn:**
- Char: primitive, single character, 2 bytes
- String: object, multiple characters, variable size
- Single quotes vs double quotes
- When to use char vs String
- Memory and performance considerations

**Real-world usage:**
- Choose char for: single character operations, memory efficiency
- Choose String for: text manipulation, words, sentences
- Grade systems: char grade = 'A'
- Names: String name = "Alice"
- Understanding the trade-offs

---

## Memory Behavior

**Char Storage:**
- **Size**: Always 16 bits (2 bytes)
- **Unsigned**: Range 0 to 65,535 (no negative values)
- **Unicode Code Point**: Each char stores one Unicode character
- **In Arrays**: char[] array stores characters sequentially

**Performance:**
- Char operations are very fast (primitive type)
- No object overhead (unlike Character wrapper class)
- Efficient for single character storage
- Arithmetic operations work on Unicode values

**Stack vs Heap:**
- Local char variables: stored on stack
- Instance char variables: stored in heap with object
- Static char variables: stored in method area
- char[] arrays: array object on heap, elements contiguous

---

## Common Mistakes to Avoid

### 1. Using double quotes instead of single quotes
**❌ Bad:**
```java
char letter = "A";  // Compilation error!
```

**✅ Good:**
```java
char letter = 'A';
```
**Why?** Double quotes are for String, single quotes for char.

---

### 2. Trying to store multiple characters
**❌ Bad:**
```java
char name = 'AB';  // Compilation error!
char word = 'Hello';  // Compilation error!
```

**✅ Good:**
```java
char initial = 'A';
// Use String for multiple characters
String name = "Alice";
```
**Why?** Char can only hold exactly ONE character.

---

### 3. Empty character literal
**❌ Bad:**
```java
char empty = '';  // Compilation error!
```

**✅ Good:**
```java
char space = ' ';  // Use space if you need "empty-like" char
char nullChar = '\u0000';  // Null character (default value)
```
**Why?** Char cannot be empty - must have exactly one character.

---

### 4. Confusing char with String
**❌ Bad:**
```java
char text = "Hello";  // Error: String cannot be assigned to char
String letter = 'A';  // Error: char cannot be directly assigned to String
```

**✅ Good:**
```java
char letter = 'A';
String text = "Hello";
// Convert if needed
String letterAsString = String.valueOf(letter);
char firstChar = text.charAt(0);
```
**Why?** Char and String are different types with different purposes.

---

### 5. Not understanding char is unsigned
**❌ Bad (conceptually):**
```java
char c = -1;  // Actually stores 65535 (wraps around)
```

**✅ Good:**
```java
char c = 'A';  // Use actual characters
int value = (int)c;  // Cast to int if you need the numeric value
if (value >= 0 && value <= 65535) {  // Valid char range
    // safe operation
}
```
**Why?** Char is unsigned (0-65535), doesn't have negative values like other numeric types.

---

## Running the Code

**From IDE:**
1. Open the CharExamples.java file in your IDE
2. Right-click and select "Run CharExamples.main()"
3. View the output in the console

**From Command Line:**
```bash
# Navigate to the basics-final directory
cd basics-final

# Compile
javac src/main/java/com/modernjava/_2primitives/CharExamples.java

# Run
java -cp src/main/java com.modernjava._2primitives.CharExamples
```

**Using Gradle:**
```bash
# From the project root
cd basics-final
../gradlew run -PmainClass=com.modernjava._2primitives.CharExamples
```

---

## Expected Output

```
=== COMPREHENSIVE CHAR GUIDE ===

1. BASIC CHAR VALUES
====================
📝 Basic Char Declarations:
letterA: A
letterZ: Z
digit5: 5
space: ' '
exclamation: !

🔍 Char Characteristics:
Size: 16 bits (2 bytes)
Range: 0 to 65,535 (unsigned)
Unicode range: '\u0000' to '\uffff'
Default value: '\u0000' (null character)

2. UNICODE CHARACTERS & ESCAPE SEQUENCES
=========================================
🌍 Unicode Character Examples:
Unicode A (\u0041): A
Unicode @ (\u0040): @
Unicode $ (\u0024): $
Unicode ♥ (\u2665): ♥
Unicode ★ (\u2605): ★
Unicode → (\u2192): →

⚡ Escape Sequences:
Newline (\n): ASCII 10
Tab (\t): ASCII 9
Carriage return (\r): ASCII 13
Backspace (\b): ASCII 8
Form feed (\f): ASCII 12
Single quote (\'): '
Double quote (\"): "
Backslash (\\): \

3. SPECIAL CHARACTERS & SYMBOLS
================================
🧮 Mathematical Symbols:
Plus: +
Minus: -
Multiply: *
Divide: /
Percent: %
Equals: =
Less than: <
Greater than: >

💰 Currency & Special Symbols:
Dollar: $
Euro: €
Pound: £
Yen: ¥
Copyright: ©
Registered: ®
Trademark: ™

4. CHAR VS STRING DIFFERENCES
==============================
🔤 Key Differences:
• char: Single character, primitive type, 16-bit
• String: Sequence of characters, reference type, variable size
• char uses single quotes: 'A'
• String uses double quotes: "Hello"

Char example: H
Char size: Always 16 bits (2 bytes)
Char can be used in arithmetic operations
Char 'B' - char 'A' = 1

5. REAL-WORLD PRACTICAL EXAMPLES
=================================
🎓 Grade System:
Grade A: Passing grade - Good performance!
Grade F: Failing grade - Needs improvement
```

---

## Next Steps

After mastering char primitives, explore:

1. **Character Class:**
    - Character wrapper class for collections
    - Utility methods: isDigit(), isLetter(), isUpperCase()
    - Character classification and conversion
    - toUpperCase(), toLowerCase() methods

2. **Char in Control Flow:**
    - Switch statements with char cases
    - Char comparison in if conditions
    - Menu-driven programs with char input
    - Character validation

3. **Char Arrays:**
    - Creating and manipulating char arrays
    - Converting between String and char[]
    - Iterating over characters
    - Character buffers

4. **Text Processing:**
    - Parsing strings character by character
    - Character counting and frequency analysis
    - Finding and replacing characters
    - Building strings from chars

5. **Advanced Concepts:**
    - Character encoding (UTF-8, UTF-16)
    - Character streams for I/O
    - Regular expressions with characters
    - Character sets and locales

---

## Summary

**Key Takeaways:**

1. **Char stores exactly ONE Unicode character** - 16 bits (2 bytes)
2. **Use single quotes for char** - 'A', double quotes for String - "Hello"
3. **Unicode support is built-in** - can represent characters from any language
4. **Range is 0 to 65,535** - unsigned, no negative values
5. **Escape sequences** handle special characters: \n, \t, \', \", \\
6. **Every char has a numeric value** - can cast to int to see it
7. **Char vs String** - primitive vs object, single vs multiple characters
8. **Unicode escape sequences** use \uXXXX format (4 hex digits)
9. **Perfect for single character operations** - grades, symbols, flags
10. **Cannot be empty** - must contain exactly one character

**Best Practices:**
- Always use single quotes for char literals
- Use String when you need multiple characters
- Remember char is unsigned (0-65535)
- Use escape sequences for special characters
- Convert to int when you need the numeric value: (int)character
- Choose char over String for memory efficiency with single characters
- Use Character class methods for classification (isDigit, isLetter)
- Be aware of Unicode support for international applications
