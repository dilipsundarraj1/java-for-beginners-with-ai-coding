# MovieMapOperations.java - Practical Map Examples with Movie Domain Objects

## Overview
This file demonstrates how to use Maps with real domain objects (Movie records) using Java Streams API exclusively. It shows practical applications like creating movie databases, filtering collections, grouping by various criteria, and performing data analysis operations. This class provides hands-on experience with Maps in real-world scenarios, making it perfect for understanding how Maps work with complex objects rather than simple primitive types.

## Prompts for Replication

### Prompt 1: Basic Map Operations with Movie Objects
**Task**: Create a method that demonstrates fundamental Map operations using Movie domain objects with Streams API.

**Expected Function Signature**: `public static void basicMovieMapOperations(List<Movie> movies)`

**Requirements**:
- Print section header: "1. Basic Movie Map Operations:"
- Create title-to-movie map using `movies.stream().collect(Collectors.toMap(Movie::title, movie -> movie))`
- Print database size: "Created movie database with {size} movies"
- Look up specific movie "The Matrix" using `get()` and display its details (title, year, rating, genre)
- Check if "Inception" exists using `containsKey()` and print result
- Extract all movie titles sorted alphabetically using `keySet().stream().sorted().collect(Collectors.toList())`
- Print sorted titles list
- Add blank line at end for spacing

---

### Prompt 2: Creating Various Lookup Maps from Movie Collections
**Task**: Create a method demonstrating different types of lookup Maps using various Stream collectors and techniques.

**Expected Function Signature**: `public static void createMovieLookupMaps(List<Movie> movies)`

**Requirements**:
- Print section header: "2. Creating Movie Lookup Maps:"
- **Map by title**: Create `Map<String, Movie>` using `Collectors.toMap(Movie::title, movie -> movie)`
  - Print "Movies by title: {size} entries"
- **Map by release year**: Create `Map<Integer, Movie>` with merge function for duplicates
  - Use `Collectors.toMap(Movie::releaseYear, movie -> movie, (existing, replacement) -> existing.rating() > replacement.rating() ? existing : replacement)`
  - Print "Movies by year: {size} entries"
  - Print "Best movie from 1994: {title}" using `get(1994).title()`
- **Map by director**: Create `Map<String, List<String>>` using grouping
  - Use `Collectors.groupingBy(Movie::director, Collectors.mapping(Movie::title, Collectors.toList()))`
  - Print "Movies by director:" header and iterate with forEach showing "director: [titles]"
- **Rating lookup table**: Create `Map<String, Double>` using `Collectors.toMap(Movie::title, Movie::rating)`
  - Print "Quick rating lookup:" header
  - Show examples: "The Godfather rating: {rating}" and "Inception rating: {rating}"
- Add blank line at end for spacing

---

### Prompt 3: Grouping Movies by Genre Using Maps
**Task**: Create a method demonstrating grouping operations with downstream collectors for data analysis.

**Expected Function Signature**: `public static void groupMoviesByGenre(List<Movie> movies)`

**Requirements**:
- Print section header: "3. Grouping Movies by Genre:"
- **Basic grouping**: Create `Map<MovieGenre, List<Movie>>` using `Collectors.groupingBy(Movie::genre)`
  - Print "Movies grouped by genre:" header
  - For each genre, print "{genre} ({count} movies):" and list movies as "  - {title} ({year})"
- **Count by genre**: Create `Map<MovieGenre, Long>` using `Collectors.groupingBy(Movie::genre, Collectors.counting())`
  - Print "Movie count by genre:" header
  - Sort by count descending using `sorted(Map.Entry.<MovieGenre, Long>comparingByValue().reversed())`
  - Print each as "{genre}: {count} movies"
- **Average rating by genre**: Create `Map<MovieGenre, Double>` using `Collectors.groupingBy(Movie::genre, Collectors.averagingDouble(Movie::rating))`
  - Print "Average rating by genre:" header
  - Sort by average rating descending
  - Print each as "{genre}: {average}/10" using `printf("%s: %.2f/10%n", ...)`
- Add blank line at end for spacing

---

### Prompt 4: Sample Movie Data Creation
**Task**: Create a helper method that provides sample movie data for demonstrations.

**Expected Function Signature**: `private static List<Movie> createSampleMovies()`

**Requirements**:
- Return `Arrays.asList()` containing exactly these Movie objects:
  - new Movie("The Matrix", 136, MovieGenre.SCI_FI, 8.7, 1999, "The Wachowskis")
  - new Movie("Inception", 148, MovieGenre.SCI_FI, 8.8, 2010, "Christopher Nolan")
  - new Movie("The Dark Knight", 152, MovieGenre.ACTION, 9.0, 2008, "Christopher Nolan")
  - new Movie("Pulp Fiction", 154, MovieGenre.DRAMA, 8.9, 1994, "Quentin Tarantino")
  - new Movie("The Godfather", 175, MovieGenre.DRAMA, 9.2, 1972, "Francis Ford Coppola")
  - new Movie("Forrest Gump", 142, MovieGenre.DRAMA, 8.8, 1994, "Robert Zemeckis")
  - new Movie("The Shawshank Redemption", 142, MovieGenre.DRAMA, 9.3, 1994, "Frank Darabont")
  - new Movie("Toy Story", 81, MovieGenre.ANIMATION, 8.3, 1995, "John Lasseter")
  - new Movie("Finding Nemo", 100, MovieGenre.ANIMATION, 8.2, 2003, "Andrew Stanton")
  - new Movie("The Avengers", 143, MovieGenre.ACTION, 8.0, 2012, "Joss Whedon")

---

### Prompt 5: Main Method with Detailed Operation Comments
**Task**: Create the main method that orchestrates all examples with detailed operation descriptions.

**Expected Function Signature**: `public static void main(String[] args)`

**Requirements**:
- Print header: "=== MOVIE MAP OPERATIONS ===\n"
- Create sample movie data: `List<Movie> movies = createSampleMovies();`
- **Example 1** with detailed comments:
  ```java
  // Example 1: Basic Map operations with Movie objects
      // Create title->movie map using Collectors.toMap()
      // Lookup specific movies by title and check existence
      // Extract all movie titles sorted alphabetically
  basicMovieMapOperations(movies);
  ```
- **Example 2** with detailed comments:
  ```java
  // Example 2: Creating lookup maps from movie collections
      // Map by title (String -> Movie) - direct key-value mapping
      // Map by release year (Integer -> Movie) - using best rated if duplicates
      // Map by director (String -> List of movie titles) - grouping with downstream collector
      // Rating lookup table (String -> Double) - quick rating access by title
  createMovieLookupMaps(movies);
  ```
- **Example 3** with detailed comments:
  ```java
  // Example 3: Grouping movies using Maps
      // Basic grouping by genre using Collectors.groupingBy()
      // Count movies per genre using downstream counting collector
      // Calculate average ratings by genre using averagingDouble collector
  groupMoviesByGenre(movies);
  ```

---

## Key Concepts Covered

### 1. Basic Map Operations with Domain Objects

**What you'll learn:**
- How to create Maps from domain objects using Streams API
- Using record accessor methods as key mappers (Movie::title)
- Performing lookups and existence checks on object-based Maps
- Extracting and sorting keys from Maps containing complex objects

**Code Examples:**
```java
// Create title-to-movie mapping
Map<String, Movie> moviesByTitle = movies.stream()
    .collect(Collectors.toMap(Movie::title, movie -> movie));

// Look up specific movie
Movie matrix = moviesByTitle.get("The Matrix");
if (matrix != null) {
    System.out.println("Found: " + matrix.title() + " (" + matrix.releaseYear() + ")");
}

// Extract and sort all titles
List<String> sortedTitles = moviesByTitle.keySet().stream()
    .sorted()
    .collect(Collectors.toList());
```

**Key Points:**
- Record accessor methods work seamlessly as method references
- Maps with domain objects enable rich data lookups
- Stream operations on keySet() provide powerful data extraction
- Null checking is important when retrieving objects

### 2. Advanced Lookup Map Creation

**What you'll learn:**
- Creating multiple specialized lookup Maps from the same data source
- Using merge functions to handle duplicate keys intelligently
- Combining grouping with downstream collectors for complex mappings
- Building efficient data access patterns for different use cases

**Code Examples:**
```java
// Map by year with intelligent duplicate handling
Map<Integer, Movie> byYear = movies.stream()
    .collect(Collectors.toMap(
        Movie::releaseYear,
        movie -> movie,
        (existing, replacement) -> 
            existing.rating() > replacement.rating() ? existing : replacement
    ));

// Group by director with title extraction
Map<String, List<String>> moviesByDirector = movies.stream()
    .collect(Collectors.groupingBy(
        Movie::director,
        Collectors.mapping(Movie::title, Collectors.toList())
    ));

// Simple property extraction for quick lookups
Map<String, Double> ratingLookup = movies.stream()
    .collect(Collectors.toMap(Movie::title, Movie::rating));
```

**Key Points:**
- Merge functions enable intelligent conflict resolution
- Downstream collectors allow transformation during grouping
- Multiple lookup Maps serve different query patterns
- Property extraction Maps optimize common access patterns

### 3. Grouping and Statistical Analysis

**What you'll learn:**
- Basic grouping using Collectors.groupingBy() with enum keys
- Counting elements within groups using downstream collectors
- Calculating statistical aggregates (averages) by group
- Sorting and presenting grouped data effectively

**Code Examples:**
```java
// Basic grouping by genre
Map<MovieGenre, List<Movie>> moviesByGenre = movies.stream()
    .collect(Collectors.groupingBy(Movie::genre));

// Counting movies per genre
Map<MovieGenre, Long> movieCountByGenre = movies.stream()
    .collect(Collectors.groupingBy(Movie::genre, Collectors.counting()));

// Average rating per genre
Map<MovieGenre, Double> avgRatingByGenre = movies.stream()
    .collect(Collectors.groupingBy(
        Movie::genre,
        Collectors.averagingDouble(Movie::rating)
    ));

// Sorting results by value
avgRatingByGenre.entrySet().stream()
    .sorted(Map.Entry.<MovieGenre, Double>comparingByValue().reversed())
    .forEach(entry -> 
        System.out.printf("%s: %.2f/10%n", entry.getKey(), entry.getValue()));
```

**Key Points:**
- Enum keys create well-structured grouping categories
- Downstream collectors enable analysis during grouping
- Statistical collectors (counting, averaging) provide immediate insights
- Stream sorting on Map.Entry enables ranked presentations

## Performance Characteristics

| Operation | Complexity | Best For | Notes |
|-----------|------------|----------|-------|
| `Collectors.toMap()` | O(n) | Direct lookups | Fast key-based access |
| `Collectors.groupingBy()` | O(n) | Categorical analysis | Groups related items |
| `Collectors.counting()` | O(1) per group | Frequency analysis | Efficient counting |
| `Collectors.averagingDouble()` | O(1) per group | Statistical summaries | Built-in calculations |
| Map.Entry sorting | O(n log n) | Ranked results | Use for top-N queries |

## Best Practices with Domain Object Maps

1. **Use Method References**: Prefer `Movie::title` over `movie -> movie.title()`
2. **Smart Merge Functions**: Handle duplicates intelligently based on business logic
3. **Appropriate Collectors**: Choose downstream collectors that match your analysis needs
4. **Null Safety**: Always check for null when retrieving objects from Maps
5. **Efficient Lookups**: Create specialized lookup Maps for different access patterns
6. **Readable Grouping**: Use meaningful enum keys for grouping operations
7. **Stream Reuse**: Don't reuse streams; create new ones for each operation

## Common Patterns with Domain Objects

### Object-to-Object Mapping
```java
Map<String, Movie> movieIndex = movies.stream()
    .collect(Collectors.toMap(Movie::title, Function.identity()));
```

### Property Extraction Maps
```java
Map<String, Integer> durationLookup = movies.stream()
    .collect(Collectors.toMap(Movie::title, Movie::duration));
```

### Conflict Resolution
```java
Map<Integer, Movie> bestByYear = movies.stream()
    .collect(Collectors.toMap(
        Movie::releaseYear,
        Function.identity(),
        (m1, m2) -> m1.rating() > m2.rating() ? m1 : m2
    ));
```

### Multi-Level Grouping
```java
Map<MovieGenre, List<String>> titlesByGenre = movies.stream()
    .collect(Collectors.groupingBy(
        Movie::genre,
        Collectors.mapping(Movie::title, Collectors.toList())
    ));
```

## Real-World Applications

- **Movie Database Systems**: Indexing movies by title, year, director, or genre
- **Content Recommendation**: Grouping content by categories for recommendation engines
- **Analytics Dashboards**: Creating summary statistics and reports from movie data
- **Search Optimization**: Building multiple indexes for different search criteria
- **Data Transformation**: Converting between different data representations
- **Business Intelligence**: Aggregating metrics by business dimensions
- **Cache Implementation**: Creating fast lookup structures for frequently accessed data
- **API Response Optimization**: Pre-computing grouped data for API endpoints

## Domain Object Advantages

✅ **Benefits of using domain objects in Maps:**
- **Type Safety**: Compile-time checking of property access
- **Rich Data**: Full object context available after lookup
- **Method References**: Clean, readable code with accessor methods
- **Business Logic**: Objects can contain calculated properties and methods
- **Immutability**: Records provide immutable data structures
- **IDE Support**: Better autocomplete and refactoring support

❌ **Consider simpler approaches when:**
- You only need a single property from objects
- Memory usage is a primary concern
- Simple key-value relationships are sufficient
- Performance is more important than readability

## Learning Progression

### Beginner Level
1. **Basic Lookups**: Start with simple title-to-movie mappings
2. **Property Access**: Learn to use record accessor methods
3. **Existence Checking**: Master containsKey() and null handling

### Intermediate Level
1. **Multiple Indexes**: Create different lookup Maps from same data
2. **Merge Functions**: Handle duplicate keys intelligently
3. **Basic Grouping**: Group objects by simple properties

### Advanced Level
1. **Downstream Collectors**: Combine grouping with statistical analysis
2. **Complex Analysis**: Sort and rank grouped results
3. **Performance Optimization**: Choose appropriate data structures for access patterns

## Integration with Other Java Features

### Records Integration
```java
// Record methods work seamlessly as method references
.collect(Collectors.toMap(Movie::title, Movie::rating))
```

### Enum Integration
```java
// Enums provide structured grouping keys
.collect(Collectors.groupingBy(Movie::genre))
```

### Optional Integration
```java
// Handle potential null values safely
Optional.ofNullable(moviesByTitle.get("Unknown Movie"))
    .ifPresent(movie -> System.out.println(movie.title()));
```

## Next Steps

After mastering movie Map operations, explore:
- **Custom Collectors** - Creating your own collection strategies for domain-specific needs
- **Parallel Processing** - Using parallel streams with large movie datasets
- **Map Composition** - Combining multiple Maps for complex queries
- **Caching Strategies** - Using Maps as application-level caches
- **Database Integration** - Converting between Map structures and database results
- **JSON Mapping** - Converting Maps to/from JSON for API development
