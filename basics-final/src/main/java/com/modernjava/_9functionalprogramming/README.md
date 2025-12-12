# Functional Programming in Java - Module 9

## 🎯 Module Overview
This module introduces functional programming concepts in Java, building on the ArrayList concepts from Module 8. You'll learn how lambda expressions and the Streams API can dramatically simplify collection operations and make your code more readable and maintainable.

## 📚 What's Included

### 1. **LambdaBasics.java** - Foundation of Lambda Expressions
- **Problem Statement**: Shows why traditional anonymous classes are verbose and hard to read
- **Lambda Solution**: Demonstrates concise lambda syntax `(parameters) -> expression`
- **Functional Interfaces**: Practical examples with Predicate, Function, and Consumer
- **Method References**: Shorthand notation for common lambda patterns

**Key Example**: Sorting names by length
```java
// Traditional (verbose)
Collections.sort(names, new Comparator<String>() {
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
});

// Lambda (concise)
names.sort((s1, s2) -> s1.length() - s2.length());
```

### 2. **StreamsBasics.java** - Streams API Fundamentals
- **Stream Pipeline Concept**: Intermediate operations + Terminal operations
- **Core Operations**: filter, map, collect, forEach, count
- **Chaining Operations**: Building complex data processing pipelines
- **Practical Examples**: Text processing, data transformation, aggregation

**Key Example**: Processing word collections
```java
// Find long words, convert to uppercase, sort
List<String> result = words.stream()
    .filter(word -> word.length() > 4)
    .map(String::toUpperCase)
    .sorted()
    .collect(Collectors.toList());
```

### 3. **MovieFunctionalProgramming.java** - Real-World Applications
- **Before/After Comparisons**: Traditional loops vs functional approaches
- **Movie Analytics**: Grouping, statistics, and aggregations
- **Complex Pipelines**: Multi-step data processing workflows
- **Advanced Operations**: Finding, sorting, and conditional checks

**Key Example**: Movie analytics that would require many lines traditionally
```java
// Group movies by genre and find top-rated in each
movies.stream()
    .filter(Movie::isAvailable)
    .collect(Collectors.groupingBy(
        Movie::genre,
        Collectors.maxBy(Comparator.comparing(Movie::rating))
    ));
```

## 🔄 Learning Progression

### Stage 1: Understanding the Problem (Traditional Approach)
Start by running the examples to see how traditional loops handle:
- Filtering collections with if statements
- Transforming data with manual iteration
- Complex operations requiring nested loops and temporary variables

### Stage 2: Lambda Expressions (LambdaBasics.java)
Learn how lambdas solve verbosity issues:
- Replace anonymous classes with concise expressions
- Work with functional interfaces naturally
- Use method references for common patterns

### Stage 3: Streams API (StreamsBasics.java)
Master stream operations:
- Chain operations together declaratively
- Process data in functional pipelines
- Leverage built-in operations for common tasks

### Stage 4: Real-World Applications (MovieFunctionalProgramming.java)
Apply concepts to complex scenarios:
- Movie collection analytics
- Multi-criteria filtering and sorting
- Data aggregation and reporting

## 🚀 Running the Examples

```bash
# Run each class to see the progression
java com.modernjava._9functionalprogramming._1LambdaBasics
java com.modernjava._9functionalprogramming._2StreamsBasics  
java com.modernjava._9functionalprogramming.MovieFunctionalProgramming
```

## 💡 Key Benefits Demonstrated

### Readability
- Code reads like natural language describing what you want
- Less focus on "how" (loops, indices), more on "what" (business logic)

### Conciseness
- Eliminate boilerplate code and intermediate variables
- Express complex operations in a few chained method calls

### Composability
- Build complex operations from simple, reusable functions
- Easy to modify and extend existing pipelines

### Safety
- Streams don't modify original collections (immutability)
- Built-in null safety with Optional
- Fewer opportunities for index-based errors

## 🎯 Before vs After Examples

### Example 1: Finding High-Rated Movies
**Traditional (MovieArrayList approach)**:
```java
List<Movie> highRated = new ArrayList<>();
for (Movie movie : movies) {
    if (movie.rating() > 8.5) {
        highRated.add(movie);
    }
}
```

**Functional**:
```java
List<Movie> highRated = movies.stream()
    .filter(movie -> movie.rating() > 8.5)
    .collect(Collectors.toList());
```

### Example 2: Movie Analytics
**Traditional**: Would require multiple loops, temporary variables, and complex logic

**Functional**: Single pipeline operation
```java
movies.stream()
    .collect(Collectors.groupingBy(
        Movie::genre,
        Collectors.averagingDouble(Movie::rating)
    ));
```

## 🔗 Connection to Previous Modules
- **Builds on ArrayList concepts** from Module 8
- **Uses Movie record** from Module 3 (domain objects)
- **Enhances collection operations** with functional style
- **Prepares for advanced Java** frameworks and libraries

## 🎓 Learning Outcomes
After completing this module, you'll be able to:
- Write concise, readable code using lambda expressions
- Process collections efficiently with streams
- Chain operations together for complex data transformations
- Apply functional programming patterns to real-world problems
- Understand when to choose functional vs traditional approaches

## 🔄 Next Steps
- Explore parallel streams for performance
- Learn about custom collectors and advanced stream operations
- Apply these concepts in frameworks like Spring
- Investigate reactive programming patterns
