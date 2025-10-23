# RegexBasics.java - Understanding Regular Expression Fundamentals

## Overview
This file introduces the core concepts of Regular Expressions (Regex) in Java, focusing on basic pattern matching, the Pattern and Matcher classes, and common regex patterns for data validation. This covers fundamental regex operations using the `java.util.regex` package.

## Prompts for Replication

### Prompt 1: Basic Pattern Matching with String.matches()
**Task**: Create a method that demonstrates basic pattern matching using the String.matches() method with simple regex patterns.

**Expected Function Signature**: `private static void basicPatternMatching()`

**Requirements**:
- Print section header: "1. Basic Pattern Matching:"
- Create test string: `String text = "Hello123";`
- Check if string contains only letters using pattern `[a-zA-Z]+`
- Check if string contains letters and numbers using pattern `[a-zA-Z0-9]+`
- Check if string starts with "Hello" using pattern `Hello.*`
- Print results for each pattern test with descriptive output
- Show boolean results for each validation

---

### Prompt 2: Common Regex Patterns for Validation
**Task**: Create a method that demonstrates commonly used regex patterns for real-world data validation.

**Expected Function Signature**: `private static void commonPatterns()`

**Requirements**:
- Print section header: "2. Common Regex Patterns:"
- **Email validation**: Test pattern `\\w+@\\w+\\.\\w+` with "user@example.com"
- **Phone validation**: Test pattern `\\d{3}-\\d{3}-\\d{4}` with "123-456-7890"  
- **ZIP code validation**: Test pattern `\\d{5}` with "12345"
- **Password strength**: Test pattern `(?=.*[a-zA-Z])(?=.*\\d).{8,}` with "Password123"
- Display validation results with descriptive messages
- Show practical use cases for each pattern type

---

### Prompt 3: Pattern and Matcher Classes Usage
**Task**: Create a method that demonstrates advanced regex operations using Pattern and Matcher classes.

**Expected Function Signature**: `private static void patternMatcherExample()`

**Requirements**:
- Print section header: "3. Pattern and Matcher Classes:"
- Create text: `String text = "Contact us at support@company.com or sales@company.com";`
- Use email pattern: `String emailPattern = "\\w+@\\w+\\.\\w+";`
- Compile pattern using `Pattern.compile(emailPattern)`
- Create matcher using `pattern.matcher(text)`
- Find all email matches using `matcher.find()` in while loop
- Print each found email with position information using `matcher.start()` and `matcher.end()`
- Show how to extract multiple matches from single text

---

### Prompt 4: Case Sensitivity Handling
**Task**: Create a method that demonstrates different approaches to handling case sensitivity in regex patterns.

**Expected Function Signature**: `private static void caseSensitivity()`

**Requirements**:
- Print section header: "4. Case Sensitivity:"
- Test string: `String text = "Hello World";`
- Test case-sensitive matching with pattern "hello world" (should fail)
- Test case-insensitive matching using `Pattern.CASE_INSENSITIVE` flag
- Test inline case-insensitive flag using `(?i)hello world` pattern
- Show three different approaches to case handling
- Compare results and explain when to use each method

## Key Concepts Covered

### 1. Basic Pattern Matching

**What you'll learn:**
- How to use String.matches() for basic pattern validation
- Understanding of common character classes (\d, \w, \s)
- Basic quantifiers (+, *, ?, {n})
- When matches() requires full string match

**Code Examples:**
```java
String text = "Hello123";

// Character class patterns
boolean onlyLetters = text.matches("[a-zA-Z]+");        // false
boolean lettersAndNumbers = text.matches("[a-zA-Z0-9]+"); // true
boolean startsWithHello = text.matches("Hello.*");      // true

// Common character classes
"123".matches("\\d+");     // true - one or more digits
"abc".matches("\\w+");     // true - one or more word characters  
" \t".matches("\\s+");     // true - one or more whitespace
```

**Key Points:**
- `matches()` requires the **entire string** to match the pattern
- Use `\\` in Java strings to represent single `\` in regex
- Character classes: `\d` (digits), `\w` (word chars), `\s` (whitespace)
- Quantifiers: `+` (one or more), `*` (zero or more), `?` (optional)

### 2. Common Validation Patterns

**What you'll learn:**
- Practical regex patterns for real-world data validation
- How to construct patterns for specific data formats
- Balance between simplicity and accuracy in validation

**Code Examples:**
```java
// Email validation (simplified)
String emailPattern = "\\w+@\\w+\\.\\w+";
"user@domain.com".matches(emailPattern);  // true

// Phone number validation
String phonePattern = "\\d{3}-\\d{3}-\\d{4}";
"123-456-7890".matches(phonePattern);     // true

// Password strength (letters + numbers, min 8 chars)
String passwordPattern = "(?=.*[a-zA-Z])(?=.*\\d).{8,}";
"Password123".matches(passwordPattern);   // true

// ZIP code validation
String zipPattern = "\\d{5}";
"12345".matches(zipPattern);              // true
```

**Key Points:**
- **Lookahead assertions** `(?=...)` for complex requirements
- **Quantifiers** `{n}` for exact count, `{n,}` for minimum count
- **Dot escaping** `\\.` to match literal period
- **Balance** between pattern complexity and maintainability

### 3. Pattern and Matcher Classes

**What you'll learn:**
- When to use Pattern/Matcher vs String.matches()
- How to find multiple matches within text
- Performance benefits of compiled patterns
- Accessing match position and groups

**Code Examples:**
```java
String text = "Emails: john@company.com and mary@company.com";
String pattern = "\\w+@\\w+\\.\\w+";

// Compile pattern once for better performance
Pattern compiledPattern = Pattern.compile(pattern);
Matcher matcher = compiledPattern.matcher(text);

// Find all matches
while (matcher.find()) {
    System.out.println("Found: " + matcher.group());
    System.out.println("Position: " + matcher.start() + "-" + matcher.end());
}
```

**Key Points:**
- **Pattern.compile()** creates reusable compiled pattern
- **matcher.find()** finds next match, returns boolean
- **matcher.group()** returns the matched text
- **matcher.start()/end()** provide match positions
- **Better performance** when reusing patterns multiple times

### 4. Case Sensitivity Control

**What you'll learn:**
- Default case-sensitive behavior of regex
- Multiple ways to make patterns case-insensitive
- When and how to use different case-handling approaches

**Code Examples:**
```java
String text = "Hello World";

// Case sensitive (default) - fails
boolean sensitive = text.matches("hello world");  // false

// Case insensitive with flag
Pattern pattern = Pattern.compile("hello world", Pattern.CASE_INSENSITIVE);
boolean insensitive1 = pattern.matcher(text).matches();  // true

// Case insensitive with inline flag
boolean insensitive2 = text.matches("(?i)hello world");  // true
```

**Key Points:**
- **Default behavior** is case-sensitive
- **Pattern.CASE_INSENSITIVE** flag for compiled patterns
- **Inline flag** `(?i)` can be embedded in pattern string
- **Choose approach** based on whether pattern is reused

## Character Classes Reference

| Pattern | Description | Example Match |
|---------|-------------|---------------|
| `\d` | Any digit (0-9) | `"5"`, `"123"` |
| `\D` | Any non-digit | `"a"`, `"@"` |
| `\w` | Word character (a-z, A-Z, 0-9, _) | `"a"`, `"Z"`, `"5"`, `"_"` |
| `\W` | Non-word character | `"@"`, `" "`, `"!"` |
| `\s` | Whitespace (space, tab, newline) | `" "`, `"\t"`, `"\n"` |
| `\S` | Non-whitespace | `"a"`, `"1"`, `"@"` |
| `.` | Any character (except newline) | `"a"`, `"1"`, `"@"` |

## Quantifier Reference

| Quantifier | Description | Example |
|------------|-------------|---------|
| `+` | One or more | `\d+` matches `"123"` but not `""` |
| `*` | Zero or more | `\d*` matches `"123"` and `""` |
| `?` | Zero or one (optional) | `\d?` matches `"1"` and `""` |
| `{n}` | Exactly n times | `\d{3}` matches `"123"` but not `"12"` |
| `{n,}` | n or more times | `\d{2,}` matches `"123"` but not `"1"` |
| `{n,m}` | Between n and m times | `\d{2,4}` matches `"12"`, `"123"`, `"1234"` |

## Common Pitfalls

1. **Forgetting double backslashes**: Use `"\\d"` not `"\d"` in Java strings
2. **Full string matching**: `matches()` requires entire string to match pattern
3. **Case sensitivity**: Remember regex is case-sensitive by default  
4. **Escaping special characters**: Use `\\.` to match literal period
5. **Performance**: Compile patterns once when reusing multiple times

## Best Practices

1. **Start simple**: Begin with basic patterns and add complexity gradually
2. **Test thoroughly**: Validate patterns with various input examples
3. **Use constants**: Store commonly used patterns as static final variables
4. **Comment complex patterns**: Add explanations for complicated regex
5. **Consider alternatives**: Sometimes String methods are simpler than regex
