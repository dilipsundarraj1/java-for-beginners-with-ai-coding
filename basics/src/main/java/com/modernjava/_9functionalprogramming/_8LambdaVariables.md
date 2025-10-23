# _8LambdaVariables.java - Lambdas and Local Variables: Effectively Final

## Overview
This file demonstrates the concept of "effectively final" variables in lambda expressions. When lambdas access local variables from their enclosing scope, those variables must be either explicitly final or "effectively final" (never modified after initialization). The class provides clear examples of valid usage patterns and explains the fundamental restrictions that ensure thread-safety and predictable behavior in lambda expressions.

## Prompts for Replication

### Prompt 1: Effectively Final Variables - Valid Usage
**Task**: Create a method demonstrating how lambdas can access local variables that are effectively final.

**Expected Function Signature**: `private static void demonstrateEffectivelyFinal()`

**Requirements**:
- Print section header: "Example 1: Effectively Final Variables (Valid Usage)"
- Explain: "Variables that are never reassigned after initialization can be used in lambdas"
- Show effectively final string variable: `String prefix = "Item: ";`
- Demonstrate lambda accessing the prefix: `items.forEach(item -> System.out.println(prefix + item))`
- Show explicitly final variable: `final String suffix = " (processed)";`
- Use both variables in different lambda expressions
- Print success message confirming compilation

**Implementation Pattern**:
```java
String prefix = "Item: ";  // This is effectively final
List<String> items = List.of("Apple", "Banana", "Cherry");

items.forEach(item -> {
    // Lambda can access 'prefix' because it's effectively final
    System.out.println("  " + prefix + item);
});
```

---

### Prompt 2: Object Mutation Inside Lambdas
**Task**: Create a method showing how object properties can be modified inside lambdas while the object reference remains effectively final.

**Expected Function Signature**: `private static void demonstrateObjectModification()`

**Requirements**:
- Print section header: "Example 2: Modifying Object Properties Inside Lambda"
- Explain: "Object reference is effectively final, but object properties can be modified"
- Create a mutable Counter class with `int value` field and `increment()` method
- Show counter creation: `Counter counter = new Counter();`
- Demonstrate state modification inside lambda: `counter.increment()`
- Process a list of items while incrementing counter
- Show before/after states and intermediate results
- Explain the distinction between reference immutability and object mutation

**Implementation Pattern**:
```java
Counter counter = new Counter();  // Reference 'counter' is effectively final

items.forEach(item -> {
    // We can modify the object's state even though 'counter' reference is effectively final
    counter.increment();
    System.out.println("  Processed: " + item + " | " + counter);
});
```

---

## Key Concepts Explained

### What is "Effectively Final"?
- A variable that is never reassigned after its initialization
- Not explicitly declared `final` but behaves as if it were
- Required for lambda expressions to capture local variables from enclosing scope

### Why This Restriction Exists
- **Thread Safety**: Lambdas may be executed in different threads
- **Predictable Behavior**: Prevents race conditions and unexpected state changes
- **JVM Implementation**: Enables efficient lambda implementation without complex synchronization

### Important Distinctions
1. **Variable Reassignment vs Object Mutation**:
   - ❌ Cannot reassign: `counter = new Counter();` (inside lambda)
   - ✅ Can mutate object: `counter.increment();` (inside lambda)

2. **What's Always Allowed**:
   - Lambda parameters (always effectively final by nature)
   - Instance variables and static variables
   - Method parameters (always effectively final)

3. **Workarounds for Mutable State**:
   - Use wrapper objects (like Counter class)
   - Use collections (ArrayList, etc.)
   - Use atomic classes (AtomicInteger, etc.)

### Best Practices
- Keep lambda expressions simple and focused
- Use effectively final variables naturally - don't force mutations
- Consider if mutable state indicates a design issue
- Prefer immutable approaches when possible

## Common Compilation Errors
```java
// This would cause compilation error:
String status = "Processing";
items.forEach(item -> System.out.println(status + ": " + item));
status = "Completed";  // ❌ Makes 'status' non-effectively final
```

## Real-World Applications
- Event handlers and callbacks
- Stream processing with shared counters
- Configuration objects accessed in lambdas
- Progress tracking during parallel operations
