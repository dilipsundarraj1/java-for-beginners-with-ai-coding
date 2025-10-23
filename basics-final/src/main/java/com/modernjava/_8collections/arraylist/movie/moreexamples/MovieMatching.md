# MovieMatching.java - ArrayList Matching Operations with Movie Objects

## Overview
This file demonstrates advanced matching operations on ArrayList using Movie objects as examples. It shows traditional loop-based approaches for finding and matching movies based on various criteria without using lambdas or streams. This builds upon basic ArrayList operations to showcase real-world searching, counting, and conditional checking patterns commonly used in applications.

## Prompts for Replication

### Prompt 1: Find First Matching Element Operations
**Task**: Create methods demonstrating how to find the first element that matches specific criteria.

**Expected Function Signature**: `private static void demonstrateFindFirst(List<Movie> movies)`

**Requirements**:
- Print section header: "1. Find First Matching Movie:"
- Find first movie by genre: `findFirstMovieByGenre(movies, MovieGenre.SCI_FI)`
- Find first movie with minimum rating: `findFirstMovieWithMinRating(movies, 9.0)`
- Find first movie by director: `findFirstMovieByDirector(movies, "Christopher Nolan")`
- Handle null results gracefully with appropriate messages
- Display found movies with title and relevant attributes

**Helper Methods Required**:
```java
public static Movie findFirstMovieByGenre(List<Movie> movies, MovieGenre genre)
public static Movie findFirstMovieWithMinRating(List<Movie> movies, double minRating)
public static Movie findFirstMovieByDirector(List<Movie> movies, String director)
```

---

### Prompt 2: Any Match Conditional Operations
**Task**: Create methods demonstrating how to check if any element matches specific criteria.

**Expected Function Signature**: `private static void demonstrateAnyMatch(List<Movie> movies)`

**Requirements**:
- Print section header: "2. Check if Any Movie Matches Criteria:"
- Check for movies from specific decade: `hasAnyMovieFromDecade(movies, 1990)`
- Check for long movies: `hasAnyMovieLongerThan(movies, 180)` (3+ hours)
- Check for unavailable movies: `hasAnyUnavailableMovie(movies)`
- Check for specific genre: `hasAnyMovieOfGenre(movies, MovieGenre.HORROR)`
- Return boolean results and display meaningful messages

**Helper Methods Required**:
```java
public static boolean hasAnyMovieFromDecade(List<Movie> movies, int decade)
public static boolean hasAnyMovieLongerThan(List<Movie> movies, int duration)
public static boolean hasAnyUnavailableMovie(List<Movie> movies)
public static boolean hasAnyMovieOfGenre(List<Movie> movies, MovieGenre genre)
```

---

### Prompt 3: All Match Validation Operations
**Task**: Create methods demonstrating how to verify all elements match specific criteria.

**Expected Function Signature**: `private static void demonstrateAllMatch(List<Movie> movies)`

**Requirements**:
- Print section header: "3. Check if All Movies Match Criteria:"
- Check if all movies are available: `areAllMoviesAvailable(movies)`
- Check if all have minimum rating: `doAllMoviesHaveMinRating(movies, 6.0)`
- Check if all are modern: `areAllMoviesFromAfterYear(movies, 1970)`
- Check if all meet duration requirement: `areAllMoviesLongerThan(movies, 100)`
- Return boolean results for validation scenarios

**Helper Methods Required**:
```java
public static boolean areAllMoviesAvailable(List<Movie> movies)
public static boolean doAllMoviesHaveMinRating(List<Movie> movies, double minRating)
public static boolean areAllMoviesFromAfterYear(List<Movie> movies, int year)
public static boolean areAllMoviesLongerThan(List<Movie> movies, int duration)
```

---

### Prompt 4: None Match Exclusion Operations
**Task**: Create methods demonstrating how to verify no elements match specific criteria.

**Expected Function Signature**: `private static void demonstrateNoneMatch(List<Movie> movies)`

**Requirements**:
- Print section header: "4. Check if No Movies Match Criteria:"
- Check for very old movies: `areNoMoviesFromBeforeYear(movies, 1950)`
- Check for poor ratings: `areNoMoviesWithRatingBelow(movies, 5.0)`
- Check for documentaries: `areNoMoviesOfGenre(movies, MovieGenre.DOCUMENTARY)`
- Use exclusion logic for data validation scenarios

**Helper Methods Required**:
```java
public static boolean areNoMoviesFromBeforeYear(List<Movie> movies, int year)
public static boolean areNoMoviesWithRatingBelow(List<Movie> movies, double rating)
public static boolean areNoMoviesOfGenre(List<Movie> movies, MovieGenre genre)
```

---

### Prompt 5: Counting and Statistical Operations
**Task**: Create methods demonstrating how to count elements matching various criteria.

**Expected Function Signature**: `private static void demonstrateFindAndCount(List<Movie> movies)`

**Requirements**:
- Print section header: "5. Find and Count Matches:"
- Count by genre: `countMoviesByGenre()` for ACTION, DRAMA, SCI_FI
- Count highly rated: `countMoviesWithMinRating(movies, 8.5)`
- Count by decade: `countMoviesFromDecade()` for 1990s and 2000s
- Display statistical breakdowns with meaningful categories

**Helper Methods Required**:
```java
public static int countMoviesByGenre(List<Movie> movies, MovieGenre genre)
public static int countMoviesWithMinRating(List<Movie> movies, double minRating)
public static int countMoviesFromDecade(List<Movie> movies, int decade)
```

---

### Prompt 6: Multiple Results Finding Operations
**Task**: Create methods demonstrating how to find all elements matching criteria.

**Expected Function Signature**: `private static void demonstrateMultipleMatching(List<Movie> movies)`

**Requirements**:
- Print section header: "6. Multiple Matching Examples:"
- Find all by director: `findAllMoviesByDirector(movies, "Christopher Nolan")`
- Find all from decade: `findAllMoviesFromDecade(movies, 1990)`
- Return List<Movie> collections of matching results
- Display found movies with count and details

**Helper Methods Required**:
```java
public static List<Movie> findAllMoviesByDirector(List<Movie> movies, String director)
public static List<Movie> findAllMoviesFromDecade(List<Movie> movies, int decade)
```

---

### Prompt 7: Complex Matching Scenarios
**Task**: Create methods demonstrating advanced matching with multiple criteria and optimization finding.

**Expected Function Signature**: `private static void demonstrateComplexMatching(List<Movie> movies)`

**Requirements**:
- Print section header: "7. Complex Matching Scenarios:"
- Find best movie: `findMovieWithHighestRating(movies)`
- Find longest movie: `findLongestMovie(movies)`
- Find most recent: `findMostRecentMovie(movies)`
- Complex criteria check: `hasRecentHighRatedActionMovie(movies)` (after 2005, rating >= 8.5)
- Demonstrate optimization and multi-condition matching

**Helper Methods Required**:
```java
public static Movie findMovieWithHighestRating(List<Movie> movies)
public static Movie findLongestMovie(List<Movie> movies)
public static Movie findMostRecentMovie(List<Movie> movies)
public static boolean hasRecentHighRatedActionMovie(List<Movie> movies)
```

## Key Concepts Covered

### 1. Find First Operations
**What you'll learn:**
- Linear search patterns for finding first match
- Early termination optimization
- Null safety in search operations
- Conditional matching with object properties

**Code Examples:**
```java
public static Movie findFirstMovieByGenre(List<Movie> movies, MovieGenre genre) {
    for (Movie movie : movies) {
        if (movie.genre() == genre) {
            return movie; // Early termination
        }
    }
    return null; // Not found
}
```

### 2. Existence Checking (Any Match)
**What you'll learn:**
- Boolean return patterns for existence checks
- Short-circuit evaluation with early return
- Data validation techniques
- Conditional logic with complex criteria

**Code Examples:**
```java
public static boolean hasAnyMovieFromDecade(List<Movie> movies, int decade) {
    for (Movie movie : movies) {
        int movieDecade = (movie.releaseYear() / 10) * 10;
        if (movieDecade == decade) {
            return true; // Found one, exit early
        }
    }
    return false; // None found
}
```

### 3. Universal Validation (All Match)
**What you'll learn:**
- Validation patterns for entire collections
- Negative condition checking (fail fast)
- Data quality assurance techniques
- Universal quantification logic

**Code Examples:**
```java
public static boolean areAllMoviesAvailable(List<Movie> movies) {
    for (Movie movie : movies) {
        if (!movie.isAvailable()) {
            return false; // Found exception, fail fast
        }
    }
    return true; // All passed
}
```

### 4. Statistical Counting
**What you'll learn:**
- Counter patterns for data analysis
- Categorical grouping techniques
- Statistical aggregation methods
- Performance-conscious counting

**Code Examples:**
```java
public static int countMoviesByGenre(List<Movie> movies, MovieGenre genre) {
    int count = 0;
    for (Movie movie : movies) {
        if (movie.genre() == genre) {
            count++;
        }
    }
    return count;
}
```

### 5. Optimization Finding
**What you'll learn:**
- Max/min finding algorithms
- Comparison-based optimization
- Single-pass optimization techniques
- Handling empty collections

**Code Examples:**
```java
public static Movie findMovieWithHighestRating(List<Movie> movies) {
    if (movies.isEmpty()) return null;
    
    Movie bestMovie = movies.get(0);
    for (Movie movie : movies) {
        if (movie.rating() > bestMovie.rating()) {
            bestMovie = movie;
        }
    }
    return bestMovie;
}
```

## Performance Characteristics

| Operation Type | Time Complexity | Space Complexity | Notes |
|---------------|----------------|------------------|--------|
| Find First | O(n) worst case | O(1) | Early termination possible |
| Any Match | O(n) worst case | O(1) | Early termination on first match |
| All Match | O(n) worst case | O(1) | Early termination on first failure |
| Count | O(n) always | O(1) | Must visit all elements |
| Find All | O(n) always | O(k) where k = matches | Creates new collection |
| Find Min/Max | O(n) always | O(1) | Single comparison per element |

## Best Practices for Movie Matching

### 1. Early Termination
- Return immediately when condition is met (find first, any match)
- Use fail-fast approach for validation (all match, none match)
- Minimize unnecessary iterations

### 2. Null Safety
- Always check for null collections
- Handle null object properties gracefully
- Provide meaningful default values

### 3. Meaningful Return Values
- Use Optional<T> for find operations (Java 8+) or null with documentation
- Return empty collections instead of null for find-all operations
- Use boolean returns for existence/validation checks

### 4. Code Readability
- Use descriptive method names that indicate operation type
- Group similar operations together
- Provide clear documentation for complex criteria

## Common Use Cases

### 1. Search Operations
- **User Searches**: Finding movies by title, director, or genre
- **Recommendation Systems**: Finding similar movies or highly-rated content
- **Inventory Management**: Locating specific items in catalogs

### 2. Data Validation
- **Quality Assurance**: Ensuring all records meet minimum standards
- **Compliance Checking**: Verifying regulatory requirements
- **Data Integrity**: Validating consistency across collections

### 3. Statistical Analysis
- **Report Generation**: Counting items by category
- **Performance Metrics**: Finding best/worst performing items
- **Trend Analysis**: Analyzing data distribution patterns

### 4. Business Logic
- **Conditional Processing**: Execute logic based on collection state
- **Feature Flags**: Enable features based on data conditions
- **Access Control**: Check permissions and availability

## Real-World Applications

### 1. E-commerce Platforms
- **Product Search**: Finding products by various criteria
- **Inventory Checks**: Verifying stock availability
- **Recommendation Engines**: Finding similar or popular products

### 2. Content Management Systems
- **Content Discovery**: Finding articles, videos, or media
- **Moderation Tools**: Identifying content needing review
- **Analytics**: Measuring engagement and performance

### 3. Database Operations
- **Query Simulation**: Implementing search without SQL
- **Cache Operations**: Finding cached data efficiently
- **Data Migration**: Validating transferred data

### 4. User Interface Logic
- **Dynamic Menus**: Showing options based on data state
- **Conditional Rendering**: Displaying UI based on data conditions
- **Form Validation**: Checking user input against existing data

This comprehensive matching functionality demonstrates how traditional loop-based approaches can efficiently handle complex search and validation scenarios in real-world applications.
