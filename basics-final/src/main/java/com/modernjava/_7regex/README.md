# Regular Expressions and String Tokenizers in Java

This package (`_7regex`) provides comprehensive coverage of Regular Expressions (Regex) and String Tokenizers in Java through practical examples and real-world applications.

## 📁 Package Contents

### 1. **RegexBasics.java** - Introduction to Regular Expressions
- Basic pattern matching using `String.matches()`
- Common regex patterns (email, phone, ZIP, password)
- Pattern and Matcher classes
- Case sensitivity handling

**Key Concepts:**
- `\d`, `\w`, `\s` character classes
- Basic quantifiers (`+`, `*`, `?`)
- `Pattern.compile()` and `Matcher` usage

### 2. **RegexAdvanced.java** - Advanced Regex Techniques
- Character classes and custom quantifiers
- Groups and capturing with parentheses
- String replacement using `replaceAll()`
- Lookahead and lookbehind assertions
- String splitting with regex patterns

**Key Concepts:**
- `[abc]`, `[^abc]` character classes
- `{n,m}` quantifiers
- `(group)` capturing groups
- `(?=...)` positive lookahead
- `(?<=...)` positive lookbehind

### 3. **StringTokenizers.java** - String Tokenization Methods
- `StringTokenizer` class basics
- Custom delimiters and delimiter inclusion
- Comparison with `String.split()`
- `Scanner` class for tokenization
- Handling empty tokens

**Key Concepts:**
- `StringTokenizer(string, delimiters)`
- `hasMoreTokens()` and `nextToken()`
- Performance differences between methods
- Empty token handling strategies

### 4. **DataValidationExamples.java** - Real-World Data Validation
- Comprehensive email validation
- Phone number formatting and standardization
- Password strength analysis
- URL extraction from text
- Data sanitization and cleaning

**Real-World Applications:**
- Form validation
- Data preprocessing
- Security validation
- Content filtering

### 5. **TextProcessingExamples.java** - Text Processing and Analysis
- Web server log analysis
- CSV data parsing and processing
- Configuration file parsing
- Text statistics and word frequency
- Advanced search and replace operations

**Real-World Applications:**
- Log file analysis
- Data import/export
- Configuration management
- Content analysis

### 6. **RegexCheatSheet.java** - Comprehensive Reference Guide
- Complete regex syntax reference
- Common pattern library
- Validation patterns for various data types
- Quick reference examples

**Pattern Library Includes:**
- Email validation patterns
- Phone number formats
- Date formats (ISO, US)
- Credit card validation
- IP address validation
- URL validation
- Password strength patterns
- HTML tag matching

### 7. **WebAnalyticsExercise.java** - Comprehensive Practical Exercise
- Real-world web analytics tool implementation
- Complex log parsing using multiple regex patterns
- Statistical analysis and reporting
- Security threat detection
- Performance metrics analysis

**Features:**
- Parses Apache Common Log Format
- Browser and OS detection
- Traffic source analysis
- Security analysis
- Performance insights

## 🎯 Learning Objectives

After studying these examples, you will be able to:

1. **Understand Regex Fundamentals**
   - Write basic and advanced regex patterns
   - Use character classes, quantifiers, and anchors
   - Apply lookahead and lookbehind assertions

2. **Master String Tokenization**
   - Choose appropriate tokenization methods
   - Handle various delimiter scenarios
   - Process structured data efficiently

3. **Apply Real-World Solutions**
   - Validate user input effectively
   - Process and analyze text data
   - Clean and sanitize data
   - Build data processing tools

## 🚀 How to Run

Each file contains a `main` method and can be run independently:

```bash
# Navigate to the project directory
cd basics

# Compile and run individual examples
./gradlew run --args="com.modernjava._7regex.RegexBasics"
./gradlew run --args="com.modernjava._7regex.StringTokenizers"
./gradlew run --args="com.modernjava._7regex.DataValidationExamples"
./gradlew run --args="com.modernjava._7regex.TextProcessingExamples"
./gradlew run --args="com.modernjava._7regex.RegexCheatSheet"
./gradlew run --args="com.modernjava._7regex.WebAnalyticsExercise"
```

## 📊 Example Output Highlights

### Email Validation Results:
```
user@example.com                 : ✓ Valid
john.doe@company.co.uk          : ✓ Valid
invalid.email                   : ✗ Invalid
```

### Phone Number Formatting:
```
1234567890          -> (123) 456-7890
123-456-7890        -> (123) 456-7890
(123) 456-7890      -> (123) 456-7890
```

### Web Analytics Summary:
```
Total Requests: 7
Unique Visitors: 5
Total Data Transferred: 11.2 KB
Browser Statistics:
  Chrome    : 5 requests (71.4%)
  Safari    : 1 requests (14.3%)
  curl      : 1 requests (14.3%)
```

## 🛡️ Security Considerations

The examples include security-focused patterns for:
- SQL injection prevention
- XSS attack detection
- Input sanitization
- Suspicious activity detection

## 🔧 Common Regex Patterns Reference

| Pattern | Description | Example |
|---------|-------------|---------|
| `\d+` | One or more digits | `123`, `4567` |
| `\w+@\w+\.\w+` | Basic email | `user@domain.com` |
| `\b\w+\b` | Word boundaries | Matches whole words only |
| `^start.*end$` | String anchors | Must start with "start" and end with "end" |
| `(?=.*[A-Z])` | Positive lookahead | Must contain uppercase letter |

## 💡 Best Practices

1. **Performance**: Use `String.split()` for simple cases, `StringTokenizer` for performance-critical applications
2. **Readability**: Use named groups and comments in complex patterns
3. **Security**: Always validate and sanitize user input
4. **Testing**: Test regex patterns with edge cases and malicious input
5. **Maintenance**: Use constants for commonly used patterns

## 🎓 Exercise Suggestions

1. Extend the email validation to support international domains
2. Add support for different log formats in the web analytics tool
3. Create a CSV parser that handles quoted fields with embedded commas
4. Build a simple syntax highlighter using regex
5. Implement a template engine with variable substitution

## 📚 Additional Resources

- [Java Pattern Class Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)
- [Java StringTokenizer Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/StringTokenizer.html)
- [Regular Expressions Tutorial](https://regexr.com/)
- [Regex Testing Tool](https://regex101.com/)
