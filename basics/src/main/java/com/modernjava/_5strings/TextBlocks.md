# TextBlocks.java - Modern Multi-line String Handling

## Overview
This file demonstrates the evolution of multi-line string handling in Java, comparing traditional string concatenation with the modern Text Blocks feature introduced in Java 13. It showcases how Text Blocks simplify the creation of multi-line strings, especially for JSON, HTML, SQL, and other formatted text.

## Prompts for Replication

### Prompt 1: Traditional Multi-line String Demonstration
**Task**: Create a method that demonstrates traditional multi-line string creation using string concatenation and escape sequences.

**Expected Function Signature**: `private static void demonstrateTraditionalString()`

**Requirements**:
- Print section header: "\n--- Traditional Multi-line String ---"
- Create a JSON string using traditional concatenation:
  - `String json = "{\n" +`
  - `"   \"name\": \"Inception\",\n" +`
  - `"   \"rating\": 8.8,\n" +`
  - `"   \"genre\": \"Sci-Fi\"\n" +`
  - `"}";`
- Print descriptive label: "Movie JSON (Traditional):"
- Print the JSON string to show the formatted output

---

### Prompt 2: Text Blocks Demonstration
**Task**: Create a method that demonstrates the modern Text Blocks feature for cleaner multi-line string creation (Java 13+).

**Expected Function Signature**: `private static void demonstrateTextBlocks()`

**Requirements**:
- Print section header: "\n--- Text Blocks (Java 13+) ---"
- Create a JSON string using text blocks syntax:
  - Start with `String jsonTextBlock = """`
  - Include the opening brace `{`
  - Add person data: name "John", age 30, city "New York"
  - Close with `}` and the closing `""";`
  - Use proper indentation without explicit `\n` or `+` operators
- Print descriptive label: "Person JSON (Text Block):"
- Print the JSON text block to show the formatted output

---

### Prompt 3: Main Method Integration
**Task**: Create a main method that demonstrates both approaches with clear section identification.

**Expected Function Signature**: `public static void main(String[] args)`

**Requirements**:
- Print application header: "=== Text Blocks Demonstration ==="
- Add descriptive comments before each method call
- Call `demonstrateTraditionalString()` with comment "// Demonstrate traditional string concatenation"
- Call `demonstrateTextBlocks()` with comment "// Demonstrate text blocks (Java 13+)"

## Key Concepts Covered

### 1. Traditional Multi-line Strings

**What you'll learn:**
- How to create multi-line strings using concatenation and escape sequences
- The verbosity and complexity of traditional approaches
- Common escape sequences: `\n` for newlines, `\"` for quotes

**Code Examples:**
```java
// Traditional approach - verbose and error-prone
String json = "{\n" +
        "   \"name\": \"Inception\",\n" +
        "   \"rating\": 8.8,\n" +
        "   \"genre\": \"Sci-Fi\"\n" +
        "}";
```

**Key Points:**
- Requires explicit `+` operators for concatenation
- Needs `\n` escape sequences for line breaks
- Requires `\"` to include quotes in the string
- Prone to formatting errors and hard to maintain
- No automatic indentation management

### 2. Text Blocks (Java 13+)

**What you'll learn:**
- How Text Blocks simplify multi-line string creation
- Automatic handling of indentation and formatting
- Elimination of escape sequences for common characters

**Code Examples:**
```java
// Text Blocks - clean and readable
String jsonTextBlock = """
        {
            "name": "John",
            "age": 30,
            "city": "New York"
        }
        """;
```

**Key Points:**
- Uses triple quotes (`"""`) to define text block boundaries
- Automatically handles line breaks without `\n`
- No need to escape double quotes inside the block
- Automatic indentation management based on the closing `"""`
- Much more readable and maintainable
- Preserves formatting exactly as written

### 3. Text Block Features

**Indentation Management:**
- Text blocks automatically remove common leading whitespace
- The position of the closing `"""` determines the base indentation
- Preserves relative indentation within the block

**Escape Sequence Handling:**
- Most escape sequences are unnecessary in text blocks
- Double quotes don't need to be escaped
- Newlines are preserved automatically
- Special characters like `\n` can still be used if needed

## Running the Code

Execute the `TextBlocks.java` file to see:
- Traditional string concatenation with escape sequences
- Modern text blocks with clean, readable syntax
- Side-by-side comparison of both approaches

## Expected Output

```
=== Text Blocks Demonstration ===

--- Traditional Multi-line String ---
Movie JSON (Traditional):
{
   "name": "Inception",
   "rating": 8.8,
   "genre": "Sci-Fi"
}

--- Text Blocks (Java 13+) ---
Person JSON (Text Block):
{
    "name": "John",
    "age": 30,
    "city": "New York"
}
```

## Practical Applications

### 1. JSON Creation
```java
// Traditional way
String jsonTraditional = "{\n" +
    "  \"users\": [\n" +
    "    {\"id\": 1, \"name\": \"Alice\"},\n" +
    "    {\"id\": 2, \"name\": \"Bob\"}\n" +
    "  ]\n" +
    "}";

// Text blocks way
String jsonTextBlock = """
    {
      "users": [
        {"id": 1, "name": "Alice"},
        {"id": 2, "name": "Bob"}
      ]
    }
    """;
```

### 2. HTML Templates
```java
String htmlTemplate = """
    <!DOCTYPE html>
    <html>
    <head>
        <title>%s</title>
    </head>
    <body>
        <h1>Welcome %s!</h1>
        <p>Today is a great day for learning Java.</p>
    </body>
    </html>
    """;
```

### 3. SQL Queries
```java
String sqlQuery = """
    SELECT u.name, u.email, p.title
    FROM users u
    JOIN posts p ON u.id = p.user_id
    WHERE u.active = true
    AND p.published_date > ?
    ORDER BY p.published_date DESC
    """;
```

### 4. Configuration Files
```java
String yamlConfig = """
    server:
      port: 8080
      servlet:
        context-path: /api
    
    database:
      url: jdbc:mysql://localhost:3306/mydb
      username: admin
      password: secret
    """;
```

## Advantages of Text Blocks

### **Readability**
- Code looks exactly like the intended output
- No mental parsing of escape sequences required
- Natural indentation and formatting

### **Maintainability**
- Easy to modify and update multi-line content
- Less error-prone than concatenation
- Clear visual representation of the final string

### **Developer Experience**
- Faster to write and understand
- Better IDE support with syntax highlighting
- Reduced debugging time for formatting issues

## Migration Strategies

### **When to Use Text Blocks**
- ✅ Multi-line strings (JSON, XML, HTML, SQL)
- ✅ Template strings with formatting
- ✅ Configuration content
- ✅ Documentation strings
- ✅ Test data with complex formatting

### **When to Stick with Traditional Strings**
- ✅ Simple, single-line strings
- ✅ When targeting Java versions before 13
- ✅ Dynamic string building (use StringBuilder instead)
- ✅ When concatenating with variables frequently

## Version Compatibility

### **Java Version Support**
- **Java 13**: Preview feature (requires `--enable-preview`)
- **Java 14**: Second preview (requires `--enable-preview`)
- **Java 15**: Standard feature (no preview flag needed)

### **Compiler Flags for Preview Versions**
```bash
# Java 13-14 (preview feature)
javac --enable-preview --release 13 TextBlocks.java
java --enable-preview TextBlocks

# Java 15+ (standard feature)
javac TextBlocks.java
java TextBlocks
```

## Best Practices

### **1. Proper Indentation**
```java
// Good - closing """ determines base indentation
String good = """
    {
        "name": "value"
    }
    """;

// Avoid - inconsistent indentation
String avoid = """
{
        "name": "value"
    }
""";
```

### **2. Trailing Whitespace**
```java
// Be aware of trailing spaces in text blocks
String content = """
    Line 1    
    Line 2
    """;  // Line 1 has trailing spaces
```

### **3. String Interpolation**
```java
String name = "Alice";
int age = 30;

String profile = """
    {
        "name": "%s",
        "age": %d,
        "active": true
    }
    """.formatted(name, age);
```

## Common Patterns

### **1. Template with Placeholders**
```java
public static String createUserJson(String name, int age, String city) {
    return """
        {
            "name": "%s",
            "age": %d,
            "city": "%s"
        }
        """.formatted(name, age, city);
}
```

### **2. Multi-line Error Messages**
```java
String errorMessage = """
    Validation failed:
    - Name cannot be empty
    - Age must be between 0 and 120
    - Email format is invalid
    Please correct these issues and try again.
    """;
```

### **3. API Documentation**
```java
String apiDoc = """
    POST /api/users
    
    Creates a new user in the system.
    
    Request Body:
    {
        "name": "string",
        "email": "string",
        "age": "number"
    }
    
    Response:
    201 Created - User successfully created
    400 Bad Request - Invalid input data
    """;
```

## Migration Example

### **Before (Traditional)**
```java
String createTable = "CREATE TABLE users (\n" +
    "    id SERIAL PRIMARY KEY,\n" +
    "    name VARCHAR(100) NOT NULL,\n" +
    "    email VARCHAR(255) UNIQUE NOT NULL,\n" +
    "    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,\n" +
    "    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP\n" +
    ");";
```

### **After (Text Blocks)**
```java
String createTable = """
    CREATE TABLE users (
        id SERIAL PRIMARY KEY,
        name VARCHAR(100) NOT NULL,
        email VARCHAR(255) UNIQUE NOT NULL,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
    """;
```

## Next Steps
- **StringBasics.java**: Learn fundamental string creation and immutability
- **StringOperations.java**: Master essential string manipulation methods
- **StringPerformance.java**: Understand StringBuilder for performance optimization
- **StringComparison.java**: Learn different ways to compare strings
