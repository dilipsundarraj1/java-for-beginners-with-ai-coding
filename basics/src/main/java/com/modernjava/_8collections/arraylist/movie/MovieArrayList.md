# MovieArrayList.java - ArrayList Operations with Movie Collections

## Overview
This file demonstrates fundamental ArrayList operations using Movie records with traditional loop-based approaches. It covers creation, manipulation, filtering, transformation, and combined operations using enhanced for loops and basic conditional logic. The class showcases practical patterns for working with collections in Java without using streams or lambdas, making it perfect for beginners learning core ArrayList concepts.

## Prompts for Replication

### Prompt 1: Creating Movie Collections
**Task**: Create methods demonstrating different ways to create movie collections.

**Expected Function Signature**: `public static void createMoviesWithListOf()`

**Requirements**:
- Print section header: "1. Creating Movies with List.of():"
- Create immutable list using `List.of()` with 2 movie examples
- Display movie count using traditional for loop
- Use enhanced for loop to print all movie details
- Demonstrate immutable collection creation patterns

**Example Movies**:
- Inception (148 min, ACTION, 8.8 rating, 2010)
- The Hangover (100 min, COMEDY, 7.7 rating, 2009)

---

### Prompt 2: ArrayList Manipulation Operations
**Task**: Create methods demonstrating mutable ArrayList operations with traditional approaches.

**Expected Function Signature**: `public static void createMoviesWithArrayList()`

**Requirements**:
- Print section header: "2. Creating and Manipulating ArrayList:"
- Create empty `ArrayList<Movie>`
- Add movies using `add()` function
- Insert movie at specific index using `add(index, element)`
- Remove movie using `remove()` function
- Use enhanced for loops to display results after each operation
- Show size after each operation

**Operations Sequence**:
1. Add 2 movies normally
2. Insert 1 movie at index 1
3. Remove first movie (index 0)

---

### Prompt 3: Movie Filtering Operations
**Task**: Create methods demonstrating filtering using traditional loops and conditionals.

**Expected Function Signature**: `public static void filterMovies()`

**Requirements**:
- Print section header: "3. Filtering Movies:"
- Filter movies with rating > 8.0 using enhanced for loop with if condition
- Filter movies by genre (ACTION movies) using enhanced for loop
- Create new ArrayLists to store filtered results
- Use traditional for loops to display filtered results with clear labels

**Implementation Pattern**:
```java
ArrayList<Movie> filteredMovies = new ArrayList<>();
for (Movie movie : originalMovies) {
    if (filterCondition) {
        filteredMovies.add(movie);
    }
}
```

**Sample Data**: 4 movies with different genres and ratings

---

### Prompt 4: Movie Transformation Operations
**Task**: Create methods demonstrating data transformation using traditional loops.

**Expected Function Signature**: `public static void transformMovies()`

**Requirements**:
- Print section header: "4. Transforming Movies:"
- Transform to extract only movie titles using enhanced for loop
- Transform to create formatted summaries with title and duration
- Create new ArrayLists to store transformed data
- Use traditional for loops to display transformed results

**Implementation Pattern**:
```java
ArrayList<String> transformedData = new ArrayList<>();
for (Movie movie : movies) {
    String transformedItem = /* transformation logic */;
    transformedData.add(transformedItem);
}
```

---

### Prompt 5: Combined Filter and Transform Operations
**Task**: Create methods demonstrating combined filter and transform operations in traditional loops.

**Expected Function Signature**: `public static void filterAndTransformMovies()`

**Requirements**:
- Print section header: "5. Combined Filtering and Transforming Movies:"
- Combine filter and transform operations in single enhanced for loop
- Example 1: Filter high-rated movies (>8.5) and extract titles only
- Example 2: Filter ACTION/DRAMA movies and create formatted summaries
- Demonstrate efficient single-pass data processing

**Implementation Pattern**:
```java
ArrayList<String> result = new ArrayList<>();
for (Movie movie : movies) {
    if (filterCondition) {  // Filter step
        String transformed = /* transformation */;  // Transform step
        result.add(transformed);
    }
}
```

**Expected Output Format**:
```
High-rated movie titles (>8.5 rating):
- The Godfather
- The Shawshank Redemption

Action/Drama movie summaries:
- The Matrix (1999) - 8.7/10
- The Godfather (1972) - 9.2/10
- The Shawshank Redemption (1994) - 9.3/10
```

## Key Learning Points

1. **List.of() vs ArrayList**: Immutable vs mutable collections
2. **Basic Operations**: add(), add(index, element), remove() with traditional iteration
3. **Enhanced For Loops**: Modern iteration without index management
4. **Conditional Logic**: Using if statements for filtering within loops
5. **Single-Pass Processing**: Combining filter and transform operations efficiently
6. **Traditional Approaches**: Foundation concepts before learning streams/lambdas

## Implementation Notes

- **No Streams/Lambdas**: All examples use traditional enhanced for loops
- **Manual Iteration**: Explicit loop control for better understanding
- **Conditional Filtering**: Clear if-statement logic for filtering criteria
- **Step-by-Step Transformation**: Manual data transformation in loops
- **Beginner-Friendly**: Focuses on fundamental ArrayList and loop concepts

## Usage
Run the main method to see all examples in action. Each section demonstrates a specific ArrayList concept using traditional Java approaches suitable for beginners learning core collection operations.
