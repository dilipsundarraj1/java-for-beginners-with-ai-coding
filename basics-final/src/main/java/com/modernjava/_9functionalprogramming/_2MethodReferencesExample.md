# Method References in Java

## Overview
Method references provide a way to refer to methods without invoking them. They are a shorthand notation of lambda expressions that call only one method. The `_2MethodReferencesExample` class demonstrates all four types of method references with practical examples using separate `StringProcessor` and `Person` records.

## Prompts for Replication

### Prompt 1: Static Method References
**Task**: Create a method demonstrating references to static methods.

**Expected Function Signature**: `private static void referenceToStaticMethod()`

**Requirements**:
- Print section header: "1. Reference to Static Method (ClassName::staticMethod):"
- Use sample data: `Arrays.asList("1", "2", "3", "4", "5")` and `Arrays.asList(-1, -2, -3, -4, -5)`
- Show lambda vs method reference for `Integer.parseInt` conversion
- Show lambda vs method reference for `Math.abs` operation
- Use `.toList()` for modern Java practices
- Include explanatory comments for each method reference

**Implementation Pattern**:
```java
// Lambda expression
.map(s -> Integer.parseInt(s))
// Method reference (preferred)
.map(Integer::parseInt)

// Static method reference
.map(Math::abs)  // Reference to static method Math.abs
```

---

### Prompt 2: Instance Method of Particular Object
**Task**: Create a method showing method references to specific object instances.

**Expected Function Signature**: `private static void referenceToInstanceMethodOfParticularObject()`

**Requirements**:
- Create `StringProcessor processor = new StringProcessor("PREFIX_")`
- Use sample words: `Arrays.asList("apple", "banana", "cherry")`
- Show lambda vs method reference for custom `addPrefix` method
- Demonstrate `System.out::println` with `forEach`
- Compare explicit lambda with method reference syntax

**Implementation Pattern**:
```java
// Lambda expression
.map(word -> processor.addPrefix(word))
// Method reference (preferred)
.map(processor::addPrefix)  // Reference to instance method of 'processor' object

// System.out example
words.forEach(System.out::println);  // Reference to println method of System.out
```

---

### Prompt 3: Instance Method of Arbitrary Object
**Task**: Create a method demonstrating method references on parameter objects.

**Expected Function Signature**: `private static void referenceToInstanceMethodOfArbitraryObject()`

**Requirements**:
- Use sample words: `Arrays.asList("hello", "world", "java", "programming")`
- Show lambda vs method reference for `String::toUpperCase`
- Show method reference for `String::length`
- Create `Person` objects and sort using `Person::name` with `Comparator.comparing`
- Demonstrate record accessor method references

**Implementation Pattern**:
```java
// Lambda expression
.map(s -> s.toUpperCase())
// Method reference (preferred)
.map(String::toUpperCase)  // Reference to toUpperCase method of any String object

// Record accessor method reference
.sorted(Comparator.comparing(Person::name))  // Reference to name() accessor method
```

**Note**: This prompt requires the `Person` record to be created first (see Prompt 3b below).

---

### Prompt 3b: Helper Records Creation (Required for Prompts 2, 3, and 4)
**Task**: Create separate record files for demonstration purposes.

**Expected Files**: 
- `StringProcessor.java` (needed for Prompt 2)
- `Person.java` (needed for Prompts 3 and 4)

**StringProcessor Requirements**:
```java
public record StringProcessor(String prefix) {
    public String addPrefix(String input) {
        return prefix + input;
    }
}
```

**Person Requirements**:
```java
public record Person(String name, int age) {
    // Constructor for single parameter (name only)
    public Person(String name) {
        this(name, 0);
    }
    
    // Default constructor
    public Person() {
        this("Unknown", 0);
    }
}
```

**Important Note**: Records automatically generate accessor methods:
- Use `Person::name` (not `Person::getName`)
- Use `Person::age` (not `Person::getAge`)

---

### Prompt 4: Constructor References
**Task**: Create a method showing constructor method references.

**Expected Function Signature**: `private static void referenceToConstructor()`

**Requirements**:
- Use sample names: `Arrays.asList("Alice", "Bob", "Charlie", "David")`
- Demonstrate `Supplier<Person> personSupplier = Person::new` for no-arg constructor
- Show `Function<String, Person> personFactory = Person::new` for single-arg constructor
- Include array constructor reference: `String[]::new`
- Compare lambda constructor calls with method references

**Implementation Pattern**:
```java
// Constructor references
Supplier<Person> personSupplier = Person::new;  // No-arg constructor
Function<String, Person> personFactory = Person::new;  // Single-arg constructor

// Array constructor reference
String[] array = names.stream().toArray(String[]::new);
```

---

### Prompt 5: Main Method Structure
**Task**: Create a main method that demonstrates all four types of method references.

**Expected Function Signature**: `public static void main(String[] args)`

**Requirements**:
- Print header: "=== Exploring Method References ==="
- Call all four method reference demonstration methods in sequence
- Each method should be self-contained with its own sample data
- Include blank lines between sections for readability

**Key Learning Objectives**:
1. **Four Types Mastery**: Understanding when to use each method reference type
2. **Lambda Comparison**: See the evolution from lambda to method reference
3. **Record Integration**: Using method references with modern Java records
4. **Modern Practices**: Using `.toList()`, records, and functional programming

## Program Structure

The example uses two helper records defined in separate files:
- **`StringProcessor`**: A record for demonstrating instance method references
- **`Person`**: A record for demonstrating constructor references and record accessor methods

## Four Types of Method References

The class demonstrates each type through dedicated methods that show both lambda expressions and their equivalent method reference versions.

### 1. Reference to Static Method
**Syntax**: `ClassName::staticMethod`  
**Method**: `referenceToStaticMethod()`

#### When to Use
Use when you want to call a static method as a method reference.

#### Examples Demonstrated

**Integer.parseInt Example:**
```java
List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

// Using lambda expression
List<Integer> integersWithLambda = numbers.stream()
    .map(s -> Integer.parseInt(s))
    .toList();

// Using method reference to static method Integer.parseInt
List<Integer> integersWithMethodRef = numbers.stream()
    .map(Integer::parseInt)  // Reference to static method
    .toList();
```

**Math.abs Example:**
```java
List<Integer> negativeNumbers = Arrays.asList(-1, -2, -3, -4, -5);
List<Integer> absoluteValues = negativeNumbers.stream()
    .map(Math::abs)  // Reference to static method Math.abs
    .toList();
```

### 2. Reference to Instance Method of Particular Object
**Syntax**: `object::instanceMethod`  
**Method**: `referenceToInstanceMethodOfParticularObject()`

#### When to Use
Use when you want to call a method on a specific instance that you already have.

#### Examples Demonstrated

**Custom StringProcessor Method:**
```java
StringProcessor processor = new StringProcessor("PREFIX_");
List<String> words = Arrays.asList("apple", "banana", "cherry");

// Using lambda expression
List<String> processedWithLambda = words.stream()
    .map(word -> processor.addPrefix(word))
    .toList();

// Using method reference to instance method of specific object
List<String> processedWithMethodRef = words.stream()
    .map(processor::addPrefix)  // Reference to instance method of 'processor' object
    .toList();
```

**System.out.println Example:**
```java
// Another example with System.out.println
System.out.println("Printing each word using method reference:");
words.forEach(System.out::println);  // Reference to println method of System.out object
```

### 3. Reference to Instance Method of Arbitrary Object
**Syntax**: `ClassName::instanceMethod`  
**Method**: `referenceToInstanceMethodOfArbitraryObject()`

#### When to Use
Use when the method is called on objects that are passed as parameters to the lambda.

#### Examples Demonstrated

**String Methods:**
```java
List<String> words = Arrays.asList("hello", "world", "java", "programming");

// Using lambda expression
List<String> upperCaseWithLambda = words.stream()
    .map(s -> s.toUpperCase())
    .toList();

// Using method reference to instance method of arbitrary String object
List<String> upperCaseWithMethodRef = words.stream()
    .map(String::toUpperCase)  // Reference to toUpperCase method of any String object
    .toList();
```

**String Length:**
```java
// Another example with String.length()
List<Integer> wordLengths = words.stream()
    .map(String::length)  // Reference to length method of any String object
    .toList();
```

**Sorting with Comparator (Record Accessor Methods):**
```java
List<Person> people = Arrays.asList(
    new Person("Alice", 25),
    new Person("Bob", 30),
    new Person("Charlie", 20)
);

// Sort by name using method reference to record accessor method
List<Person> sortedByName = people.stream()
    .sorted(Comparator.comparing(Person::name))  // Reference to name() accessor method
    .toList();
```

### 4. Reference to Constructor
**Syntax**: `ClassName::new`  
**Method**: `referenceToConstructor()`

#### When to Use
Use to create new instances of a class using method references.

#### Examples Demonstrated

**Constructor with Supplier (No-arg Constructor):**
```java
// Using method reference to constructor (for no-arg constructor)
Supplier<Person> personSupplier = Person::new;  // Reference to no-arg constructor
Person emptyPerson = personSupplier.get();
System.out.println("Empty person: " + emptyPerson);
```

**Constructor with Function (Single Parameter):**
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

// Using constructor reference with Function for single parameter
Function<String, Person> personFactory = Person::new;  // Reference to single-arg constructor
List<Person> peopleWithConstructorRef = names.stream()
    .map(personFactory)
    .toList();
```

**Array Constructor Reference:**
```java
// Example with array constructor reference
String[] array1 = names.stream().toArray(String[]::new);  // Reference to String array constructor
System.out.println("Array created with constructor reference: " + Arrays.toString(array1));
```

## Helper Records

### StringProcessor Record
Located in `StringProcessor.java`:
```java
public record StringProcessor(String prefix) {
    public String addPrefix(String input) {
        return prefix + input;
    }
}
```

### Person Record
Located in `Person.java`:
```java
public record Person(String name, int age) {
    // Constructor for single parameter (name only)
    public Person(String name) {
        this(name, 0);
    }
    
    // Default constructor
    public Person() {
        this("Unknown", 0);
    }
}
```

**Important**: Records automatically generate accessor methods that match the component names:
- `name()` - not `getName()`
- `age()` - not `getAge()`

## Program Flow

The main method executes each demonstration in sequence:

```java
public static void main(String[] args) {
    System.out.println("=== Exploring Method References ===\n");

    referenceToStaticMethod();                          // Type 1
    referenceToInstanceMethodOfParticularObject();      // Type 2
    referenceToInstanceMethodOfArbitraryObject();       // Type 3
    referenceToConstructor();                           // Type 4
}
```

## Key Features Demonstrated

### Modern Java Practices
1. **Uses `.toList()`** instead of `.collect(Collectors.toList())` for cleaner code
2. **Record classes** for clean, immutable data structures
3. **Method references** preferred over lambda expressions when possible
4. **Stream API** integration for functional programming

### Comparison Patterns
Each method shows the progression:
```java
// Lambda expression (explicit)
.map(s -> Integer.parseInt(s))

// Method reference (concise)
.map(Integer::parseInt)
```

### Record Integration
Shows how method references work with record accessor methods:
```java
// Works with record accessor methods
Comparator.comparing(Person::name)  // Calls name() method, not getName()
```

## When Method References Can't Be Used

The examples focus on where method references ARE applicable. Method references have limitations - use lambda expressions when you need:

1. **Multiple statements**
2. **Parameter modification**
3. **Conditional logic**
4. **Complex transformations**

## Benefits Demonstrated

### ✅ Advantages Shown in the Code
- **More readable** - eliminates lambda boilerplate when calling existing methods
- **More concise** - shorter syntax than equivalent lambdas
- **Clear intent** - shows exactly which method is being called
- **Reusable** - same method can be referenced multiple times
- **Modern Java** - demonstrates current best practices

### ✅ Best Practices Illustrated
1. **Prefer method references** over lambda expressions when possible
2. **Use meaningful helper classes/records** to demonstrate concepts clearly
3. **Combine with streams** for fluent, readable code
4. **Understand record accessor methods** - they use component names, not getter patterns
5. **Use modern Java features** like `.toList()` for cleaner code

## Sample Output

The program produces output showing each type of method reference in action:

```
=== Exploring Method References ===

1. Reference to Static Method (ClassName::staticMethod):
Original strings: [1, 2, 3, 4, 5]
Converted to integers (lambda): [1, 2, 3, 4, 5]
Converted to integers (method ref): [1, 2, 3, 4, 5]
Negative numbers: [-1, -2, -3, -4, -5]
Absolute values: [1, 2, 3, 4, 5]

2. Reference to Instance Method of Particular Object (object::instanceMethod):
Original words: [apple, banana, cherry]
Processed (lambda): [PREFIX_apple, PREFIX_banana, PREFIX_cherry]
Processed (method ref): [PREFIX_apple, PREFIX_banana, PREFIX_cherry]
Printing each word using method reference:
apple
banana
cherry

... (and so on for each type)
```

## Related Topics
- Lambda Expressions (`_1LambdaBasics.java`)
- Functional Interfaces (`_3ExploreFunctionalInterfaces.java`)
- Imperative vs Functional Programming (`_0ImperativeVsFunctionalProgramming.java`)
- Stream API
- Record Classes
- Functional Programming Concepts
