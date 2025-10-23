# ArrayList Collections in Java - Movie Domain Examples

## Overview

This package demonstrates ArrayList concepts using a movie domain without lambdas/streams, focusing on traditional loop-based operations. The examples progress from basic ArrayList operations to complex real-world scenarios.

## Package Structure

```
_8collections/
├── Movie.java                    - Enhanced Movie class with proper encapsulation
├── MovieGenre.java              - Enum for movie genres
├── ArrayListBasics.java         - Fundamental ArrayList operations
├── MovieFiltering.java          - Filtering operations without lambdas
├── MovieTransformation.java     - Data transformation operations
├── MovieMatching.java           - Search and matching operations
├── MovieCollectionsDemo.java    - Comprehensive real-world examples
└── README.md                    - This documentation
```

## Core Concepts Covered

### 1. ArrayList Fundamentals (ArrayListBasics.java)

#### ArrayList Creation
```java
// Different ways to create ArrayList
ArrayList<Movie> movieList1 = new ArrayList<>();           // Direct constructor
List<Movie> movieList2 = new ArrayList<>();              // Interface (recommended)
List<Movie> movieList3 = new ArrayList<>(10);            // With initial capacity
```

#### Basic Operations
- **Adding Elements**: `add()`, `add(index, element)`
- **Accessing Elements**: `get(index)`, enhanced for-loop, traditional for-loop
- **Modifying Elements**: `set(index, element)`, direct object modification
- **Removing Elements**: `remove(index)`, `remove(object)`, `clear()`
- **ArrayList Properties**: `size()`, `isEmpty()`, `contains()`, `indexOf()`

### 2. Filtering Operations (MovieFiltering.java)

Demonstrates how to filter collections using traditional loops:

#### Single Criteria Filtering
```java
public static List<Movie> filterMoviesByGenre(List<Movie> movies, MovieGenre genre) {
    List<Movie> filteredMovies = new ArrayList<>();
    for (Movie movie : movies) {
        if (movie.getGenre() == genre) {
            filteredMovies.add(movie);
        }
    }
    return filteredMovies;
}
```

#### Multiple Criteria Filtering
```java
public static List<Movie> filterActionMoviesHighRatedModern(List<Movie> movies) {
    List<Movie> filteredMovies = new ArrayList<>();
    for (Movie movie : movies) {
        if (movie.getGenre() == MovieGenre.ACTION && 
            movie.getRating() >= 8.0 && 
            movie.getReleaseYear() > 2000) {
            filteredMovies.add(movie);
        }
    }
    return filteredMovies;
}
```

#### Filtering Examples
- Filter by genre (Action, Sci-Fi, Drama, etc.)
- Filter by rating (minimum rating, rating range)
- Filter by release year (classics, modern movies)
- Filter by duration (short, long movies)
- Complex filtering (multiple criteria combined)
- Custom filtering (director, title patterns)

### 3. Transformation Operations (MovieTransformation.java)

Shows how to transform data from one form to another:

#### Basic Transformations
```java
// Extract movie titles
public static List<String> extractMovieTitles(List<Movie> movies) {
    List<String> titles = new ArrayList<>();
    for (Movie movie : movies) {
        titles.add(movie.getTitle());
    }
    return titles;
}
```

#### Complex Transformations
```java
// Transform to rating categories
public static List<String> transformToRatingCategories(List<Movie> movies) {
    List<String> categories = new ArrayList<>();
    for (Movie movie : movies) {
        String category;
        double rating = movie.getRating();
        if (rating >= 9.0) {
            category = "Masterpiece";
        } else if (rating >= 8.5) {
            category = "Excellent";
        } else if (rating >= 8.0) {
            category = "Great";
        } else {
            category = "Good";
        }
        categories.add(category);
    }
    return categories;
}
```

#### Transformation Examples
- Extract specific properties (titles, directors, years)
- Create summaries and formatted strings
- Categorize data (rating categories, duration categories)
- Mathematical transformations (percentages, unit conversions)
- Transform to different object types (MovieSummary objects)

### 4. Matching Operations (MovieMatching.java)

Demonstrates search and matching patterns:

#### Find First Match
```java
public static Movie findFirstMovieByGenre(List<Movie> movies, MovieGenre genre) {
    for (Movie movie : movies) {
        if (movie.getGenre() == genre) {
            return movie; // Return first match
        }
    }
    return null; // No match found
}
```

#### Any/All/None Matching
```java
// Check if any movie matches criteria
public static boolean hasAnyMovieFromDecade(List<Movie> movies, int decade) {
    for (Movie movie : movies) {
        int movieDecade = (movie.getReleaseYear() / 10) * 10;
        if (movieDecade == decade) {
            return true; // Found at least one
        }
    }
    return false; // None found
}

// Check if all movies match criteria
public static boolean areAllMoviesAvailable(List<Movie> movies) {
    for (Movie movie : movies) {
        if (!movie.isAvailable()) {
            return false; // Found one that doesn't match
        }
    }
    return true; // All match
}
```

#### Matching Examples
- Find first match by various criteria
- Check existence (any match)
- Validate collections (all match)
- Verify absence (none match)
- Count matches
- Find all matches
- Complex searches (highest rated, longest, most recent)

### 5. Real-World Applications (MovieCollectionsDemo.java)

#### Movie Recommendation System
- Filter movies based on user preferences
- Provide alternative recommendations
- Handle edge cases (no matches found)

#### Movie Analytics Dashboard
- Calculate statistics (averages, totals)
- Analyze distributions (genre, decade)
- Quality analysis (rating categories)

#### Movie Catalog Management
- Organize movies into collections
- Create featured collections
- Manage availability status

## Key Learning Points

### 1. ArrayList Characteristics
- **Dynamic Size**: Automatically grows and shrinks
- **Index-Based Access**: Fast random access using indices
- **Ordered**: Maintains insertion order
- **Allows Duplicates**: Can store duplicate elements
- **Not Thread-Safe**: Not synchronized by default

### 2. Performance Considerations
- **Access**: O(1) - Fast random access
- **Search**: O(n) - Linear search through elements
- **Insertion**: O(1) at end, O(n) in middle
- **Deletion**: O(1) at end, O(n) in middle or by object

### 3. Best Practices
- Use `List<T>` interface instead of `ArrayList<T>` for flexibility
- Specify initial capacity for large collections
- Use enhanced for-loop when index not needed
- Use traditional for-loop when index access required
- Avoid frequent insertions/deletions in middle of large lists

### 4. Common Patterns

#### Filtering Pattern
```java
List<TargetType> result = new ArrayList<>();
for (SourceType item : sourceList) {
    if (condition(item)) {
        result.add(item);
    }
}
return result;
```

#### Transformation Pattern
```java
List<ResultType> result = new ArrayList<>();
for (InputType item : inputList) {
    ResultType transformed = transform(item);
    result.add(transformed);
}
return result;
```

#### Find Pattern
```java
for (ItemType item : list) {
    if (matches(item)) {
        return item; // or process item
    }
}
return null; // or default value
```

## Running the Examples

### Individual Classes
```bash
# Basic ArrayList operations
java com.modernjava._8collections.ArrayListBasics

# Filtering examples
java com.modernjava._8collections.MovieFiltering

# Transformation examples
java com.modernjava._8collections.MovieTransformation

# Matching examples
java com.modernjava._8collections.MovieMatching
```

### Comprehensive Demo
```bash
# Run complete demonstration
java com.modernjava._8collections.MovieCollectionsDemo
```

## Expected Output Highlights

### ArrayListBasics Output
- ArrayList creation methods
- Adding, accessing, modifying, removing elements
- ArrayList properties and iteration methods

### MovieFiltering Output
- Movies filtered by genre, rating, year, duration
- Complex multi-criteria filtering
- Custom filtering examples

### MovieTransformation Output
- Movie titles, summaries, categories
- Mathematical transformations
- Object-to-object transformations

### MovieMatching Output
- First match examples
- Any/all/none match validation
- Counting and complex search scenarios

### MovieCollectionsDemo Output
- Movie recommendation system simulation
- Analytics dashboard with statistics
- Catalog management scenarios
- Performance considerations demonstration

## Next Steps

After mastering these traditional approaches, you can explore:

1. **Stream API**: Modern functional approach to collections
2. **Lambda Expressions**: Concise way to write filtering/transformation logic
3. **Other Collection Types**: LinkedList, HashSet, HashMap
4. **Collection Utilities**: Collections class methods
5. **Custom Collection Operations**: Building reusable utility methods

## Key Takeaways

1. **ArrayList is fundamental**: Understanding basic operations is crucial
2. **Loops are powerful**: Traditional loops can handle complex scenarios
3. **Patterns emerge**: Common filtering, transformation, and matching patterns
4. **Performance matters**: Choose appropriate operations for your use case
5. **Real-world application**: Collections operations solve practical problems

This foundation prepares you for more advanced collection concepts and modern Java features like streams and lambdas.
