# RegexCheatSheet.java - Comprehensive Regular Expression Reference Guide

## Overview
This file serves as a comprehensive reference guide and cheat sheet for regular expressions in Java. It demonstrates essential regex patterns, character classes, quantifiers, anchors, and provides a library of common patterns for real-world validation scenarios. This is designed as a quick reference for developers.

## Prompts for Replication

### Prompt 1: Basic Character Patterns Demonstration
**Task**: Create a method that demonstrates fundamental character classes and their usage with practical examples.

**Expected Function Signature**: `private static void basicCharacterPatterns()`

**Requirements**:
- Print section header: "1. Basic Character Patterns:"
- Display reference table of basic patterns:
  - `.` - Matches any character (except newline)
  - `\\d` - Matches any digit (0-9)
  - `\\D` - Matches any non-digit
  - `\\w` - Matches word characters (a-z, A-Z, 0-9, _)
  - `\\W` - Matches non-word characters
  - `\\s` - Matches whitespace (space, tab, newline)
  - `\\S` - Matches non-whitespace
- Use test string: `"Hello World! 123 Test@Email.com"`
- Demonstrate each pattern with `demonstratePattern()` helper method
- Show matches found for `\\d+`, `\\w+`, and `\\S+` patterns

---

### Prompt 2: Quantifier Patterns Reference
**Task**: Create a method that demonstrates all quantifier types with clear examples showing their matching behavior.

**Expected Function Signature**: `private static void quantifierPatterns()`

**Requirements**:
- Print section header: "2. Quantifiers:"
- Display quantifier reference table:
  - `*` - Zero or more
  - `+` - One or more  
  - `?` - Zero or one (optional)
  - `{n}` - Exactly n times
  - `{n,}` - n or more times
  - `{n,m}` - Between n and m times
- Use test string: `"cat cats catttt dog dogs"`
- Demonstrate patterns: `cat*`, `cat+`, `cats?`, `cat{2}`, `dog{1,2}`
- Show which words match each quantifier pattern

---

### Prompt 3: Character Classes and Ranges
**Task**: Create a method that demonstrates character classes, ranges, and negation with alphabetic and numeric examples.

**Expected Function Signature**: `private static void characterClasses()`

**Requirements**:
- Print section header: "3. Character Classes:"
- Display character class reference:
  - `[abc]` - Matches a, b, or c
  - `[^abc]` - Matches anything except a, b, or c
  - `[a-z]` - Matches any lowercase letter
  - `[A-Z]` - Matches any uppercase letter
  - `[0-9]` - Matches any digit
  - `[a-zA-Z0-9]` - Matches alphanumeric characters
- Use test string: `"ABC123def456XYZ"`
- Demonstrate patterns: `[A-Z]+`, `[a-z]+`, `[0-9]+`, `[^0-9]+`
- Show sequences found for uppercase, lowercase, digits, and non-digits

---

### Prompt 4: Anchors and Word Boundaries
**Task**: Create a method that demonstrates anchors and boundary matching with multiple test cases.

**Expected Function Signature**: `private static void anchorsAndBoundaries()`

**Requirements**:
- Print section header: "4. Anchors and Boundaries:"
- Display anchor reference:
  - `^` - Start of string/line
  - `$` - End of string/line
  - `\\b` - Word boundary
  - `\\B` - Non-word boundary
- Create test array: `{"start with this", "this is in middle", "end with this"}`
- For each test string, check:
  - `^start.*` - starts with "start"
  - `.*this$` - ends with "this"
  - `\\bthis\\b` - contains word "this"
- Display results in formatted table showing pattern matches

---

### Prompt 5: Common Patterns Library with Validation Examples
**Task**: Create a comprehensive method that demonstrates real-world validation patterns with test cases for each pattern type.

**Expected Function Signature**: `private static void commonPatternsLibrary()`
**Helper Method**: `private static void testPattern(String pattern, String description, String... testCases)`

**Requirements**:
- Print section header: "5. Common Patterns Library:"
- Implement pattern categories with test cases:
  
  **Email Validation:**
  - Basic: `\\w+@\\w+\\.\\w+`
  - Advanced: `^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$`
  
  **Phone Numbers:**
  - US Format: `\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}`
  
  **Dates:**
  - ISO Format: `\\d{4}-\\d{2}-\\d{2}`
  - US Format: `\\d{1,2}/\\d{1,2}/\\d{4}`
  
  **Credit Cards:**
  - Visa: `^4\\d{3}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$`
  - Mastercard: `^5[1-5]\\d{2}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$`
  
  **Other Patterns:**
  - IP Address, URL, Strong Password, HTML Tags
- Use `testPattern()` helper to show validation results with checkmarks/X marks

## Key Concepts Covered

### 1. Fundamental Character Classes

**What you'll learn:**
- Essential building blocks of regex patterns
- Predefined character classes for common matching
- Difference between positive and negative character classes
- When to use each character class type

**Code Examples:**
```java
// Basic character classes
"123".matches("\\d+");      // true - one or more digits
"abc".matches("\\w+");      // true - one or more word characters
" \t\n".matches("\\s+");    // true - one or more whitespace
"Hello!".matches(".*");     // true - any characters

// Character class combinations
"Hello123".matches("\\w+"); // true - letters and digits are word chars
"test@email".matches("\\w+@\\w+"); // false - @ is not a word character
```

**Reference Table:**
| Pattern | Description | Matches | Doesn't Match |
|---------|-------------|---------|---------------|
| `\d` | Digits | `0-9` | Letters, symbols |
| `\D` | Non-digits | Letters, symbols | `0-9` |
| `\w` | Word characters | `a-z`, `A-Z`, `0-9`, `_` | Spaces, punctuation |
| `\W` | Non-word characters | Spaces, punctuation | `a-z`, `A-Z`, `0-9`, `_` |
| `\s` | Whitespace | Space, tab, newline | Visible characters |
| `\S` | Non-whitespace | Visible characters | Space, tab, newline |
| `.` | Any character | All except newline | Newline `\n` |

### 2. Quantifier Mastery

**What you'll learn:**
- Controlling repetition in pattern matching
- Difference between greedy and reluctant quantifiers
- Exact count specifications
- Range-based quantification

**Code Examples:**
```java
// Basic quantifiers
"cat".matches("ca+t");      // true - one or more 'a'
"ct".matches("ca*t");       // true - zero or more 'a'
"cat".matches("ca?t");      // true - zero or one 'a'
"ct".matches("ca?t");       // true - zero or one 'a'

// Exact count quantifiers
"hello".matches("l{2}");    // false - doesn't match entire string
"hello".matches(".*l{2}.*"); // true - contains two consecutive l's
"123".matches("\\d{3}");    // true - exactly three digits
"12".matches("\\d{2,4}");   // true - between 2 and 4 digits

// Greedy vs reluctant
String html = "<b>bold</b>";
html.replaceAll("<.*>", "[TAG]");    // "[TAG]" - greedy, matches entire string
html.replaceAll("<.*?>", "[TAG]");   // "[TAG]bold[TAG]" - reluctant, matches minimally
```

**Quantifier Reference:**
| Quantifier | Description | Example | Matches |
|------------|-------------|---------|---------|
| `*` | Zero or more | `ca*t` | `ct`, `cat`, `caat` |
| `+` | One or more | `ca+t` | `cat`, `caat` (not `ct`) |
| `?` | Zero or one | `ca?t` | `ct`, `cat` (not `caat`) |
| `{n}` | Exactly n | `ca{2}t` | `caat` only |
| `{n,}` | n or more | `ca{2,}t` | `caat`, `caaat`, etc. |
| `{n,m}` | Between n and m | `ca{1,3}t` | `cat`, `caat`, `caaat` |

### 3. Character Classes and Ranges

**What you'll learn:**
- Creating custom character sets
- Using ranges for efficient matching
- Negating character classes
- Combining multiple ranges

**Code Examples:**
```java
// Custom character classes
"cat".matches("[cbr]at");     // true - c, b, or r followed by 'at'
"hat".matches("[cbr]at");     // false - h not in character class

// Negated character classes  
"bat".matches("[^h]at");      // true - anything except h followed by 'at'
"hat".matches("[^h]at");      // false - h is excluded

// Range character classes
"5".matches("[0-9]");         // true - digit range
"B".matches("[A-Z]");         // true - uppercase range
"x".matches("[a-zA-Z]");      // true - upper or lowercase range

// Complex character classes
"Test123!".matches("[a-zA-Z0-9!]+"); // true - letters, digits, exclamation
```

**Character Class Reference:**
| Pattern | Description | Matches |
|---------|-------------|---------|
| `[abc]` | Any of a, b, c | Single character from set |
| `[^abc]` | Not a, b, or c | Any character except those in set |
| `[a-z]` | Lowercase letters | `a` through `z` |
| `[A-Z]` | Uppercase letters | `A` through `Z` |
| `[0-9]` | Digits | `0` through `9` |
| `[a-zA-Z0-9]` | Alphanumeric | Letters and digits |
| `[a-z&&[^aeiou]]` | Consonants | Lowercase except vowels |

### 4. Anchors and Boundaries

**What you'll learn:**
- Controlling where matches can occur
- Word boundary detection
- Line vs string anchoring
- Position assertions without consuming characters

**Code Examples:**
```java
// Start and end anchors
"hello world".matches("^hello.*");    // true - starts with hello
"hello world".matches(".*world$");    // true - ends with world
"hello world".matches("^hello world$"); // true - exact match

// Word boundaries
"the cat".matches(".*\\bcat\\b.*");   // true - cat as whole word
"concatenate".matches(".*\\bcat\\b.*"); // false - cat not whole word

// Multiple line anchoring (with Pattern.MULTILINE flag)
Pattern pattern = Pattern.compile("^start", Pattern.MULTILINE);
String text = "line1\nstart of line2\nline3";
// Matches "start" at beginning of line2
```

**Anchor Reference:**
| Anchor | Description | Usage |
|--------|-------------|-------|
| `^` | Start of string/line | `^start` matches beginning |
| `$` | End of string/line | `end$` matches at end |
| `\b` | Word boundary | `\bword\b` matches whole words |
| `\B` | Non-word boundary | `\Bword\B` matches within words |
| `\A` | Start of string (not line) | Always beginning of input |
| `\Z` | End of string (not line) | Always end of input |

### 5. Comprehensive Pattern Library

**What you'll learn:**
- Real-world validation patterns
- Industry-standard regex solutions
- Pattern complexity trade-offs
- Testing and validation strategies

**Code Examples:**
```java
// Email validation patterns
String basicEmail = "\\w+@\\w+\\.\\w+";
String comprehensiveEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

// Phone number patterns
String usPhone = "\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}";
String intlPhone = "\\+?[1-9]\\d{1,14}"; // E.164 format

// Date patterns
String isoDate = "\\d{4}-\\d{2}-\\d{2}";           // 2023-12-25
String usDate = "\\d{1,2}/\\d{1,2}/\\d{4}";       // 12/25/2023
String europeanDate = "\\d{1,2}\\.\\d{1,2}\\.\\d{4}"; // 25.12.2023

// Security patterns
String strongPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
String safeFilename = "^[a-zA-Z0-9._-]+$";
String htmlTag = "<[a-zA-Z][a-zA-Z0-9]*\\b[^>]*>";

// Network patterns
String ipv4 = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
String url = "^https?://[\\w\\-]+(\\.[\\w\\-]+)+([\\w\\-\\.,@?^=%&:/~\\+#]*[\\w\\-\\@?^=%&/~\\+#])?$";
```

**Pattern Library Categories:**

**1. Contact Information:**
- Email addresses (basic and comprehensive)
- Phone numbers (US, international)
- Postal codes (US ZIP, UK, Canadian)

**2. Financial:**
- Credit card numbers (Visa, Mastercard, Amex)
- Currency amounts
- Account numbers

**3. Dates and Times:**
- ISO 8601 dates
- US date formats
- Time formats (12/24 hour)

**4. Security:**
- Password strength validation
- Safe filenames
- SQL injection detection

**5. Network:**
- IPv4 and IPv6 addresses
- URLs and URIs
- Domain names

## Advanced Pattern Techniques

### Lookahead and Lookbehind
```java
// Password must contain uppercase, lowercase, digit, special char
String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$";

// Find numbers followed by currency symbols
String currencyPattern = "\\d+(?=[€£$])";

// Find numbers preceded by currency symbols  
String amountPattern = "(?<=[€£$])\\d+";
```

### Named Groups (Java 7+)
```java
String datePattern = "(?<year>\\d{4})-(?<month>\\d{2})-(?<day>\\d{2})";
Pattern pattern = Pattern.compile(datePattern);
Matcher matcher = pattern.matcher("2023-12-25");

if (matcher.find()) {
    String year = matcher.group("year");   // "2023"
    String month = matcher.group("month"); // "12" 
    String day = matcher.group("day");     // "25"
}
```

### Performance Optimization
```java
// Compile patterns once for reuse
private static final Pattern EMAIL_PATTERN = 
    Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

// Use possessive quantifiers to prevent backtracking
String efficientPattern = "\\d++\\.\\d++"; // Possessive quantifiers
String problematicPattern = "(\\d+)+";      // Avoid nested quantifiers
```

## Testing and Validation Strategies

### Comprehensive Test Cases
```java
// Test edge cases for email validation
String[] emailTests = {
    "valid@example.com",        // ✓ Basic valid
    "user.name@example.com",    // ✓ With dot
    "user+tag@example.com",     // ✓ With plus
    "user_name@example-site.org", // ✓ With underscore and hyphen
    "",                         // ✗ Empty
    "invalid",                  // ✗ No @
    "@example.com",            // ✗ No username  
    "user@",                   // ✗ No domain
    "user@.com",               // ✗ Invalid domain
    "user space@example.com"    // ✗ Space in username
};
```

### Pattern Debugging
```java
// Use Pattern.quote() for literal strings
String literal = Pattern.quote("$100.00");
// Results in: \Q$100.00\E

// Debug complex patterns by breaking them down
String complexPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

// Break into parts for testing:
// (?=.*[A-Z])           - has uppercase
// (?=.*[a-z])           - has lowercase  
// (?=.*\\d)             - has digit
// (?=.*[@$!%*?&])       - has special char
// [A-Za-z\\d@$!%*?&]{8,} - allowed chars, min 8
```

## Common Pitfalls and Solutions

1. **Escaping in Java strings**: Use `\\` for single backslash in regex
2. **Greedy quantifiers**: Use `*?`, `+?` for non-greedy matching
3. **Catastrophic backtracking**: Avoid nested quantifiers like `(a+)+`
4. **Case sensitivity**: Use Pattern.CASE_INSENSITIVE or `(?i)` flag
5. **Unicode handling**: Use `\p{L}` for Unicode letters, `\p{N}` for numbers
