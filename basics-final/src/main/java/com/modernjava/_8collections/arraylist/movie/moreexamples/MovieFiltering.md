# MovieFiltering.java - ArrayList Filtering Operations with Movie Objects

## Overview
This file demonstrates comprehensive filtering operations on ArrayList using Movie objects as examples. It shows traditional loop-based approaches for filtering movies based on various criteria without using lambdas or streams. This builds upon basic ArrayList operations to showcase real-world data filtering patterns commonly used in applications like search engines, recommendation systems, and data analytics.

## Prompts for Replication

### Prompt 1: Single Criteria Filtering by Genre
**Task**: Create methods demonstrating how to filter movies based on their genre.

**Expected Function Signature**: `private static void demonstrateFilterByGenre(List<Movie> allMovies)`

**Requirements**:
- Print section header: "1. Filter Movies by Genre:"
- Filter Science Fiction movies: `filterMoviesByGenre(allMovies, MovieGenre.SCI_FI)`
- Filter Action movies: `filterMoviesByGenre(allMovies, MovieGenre.ACTION)`
- Display filtered results with count and movie details
- Show practical genre-based categorization

**Helper Methods Required**:
```java
public static List<Movie> filterMoviesByGenre(List<Movie> movies, MovieGenre genre)
```

---

### Prompt 2: Rating-Based Filtering Operations
**Task**: Create methods demonstrating how to filter movies based on their ratings.

**Expected Function Signature**: `private static void demonstrateFilterByRating(List<Movie> allMovies)`

**Requirements**:
- Print section header: "2. Filter Movies by Rating:"
- Filter highly rated movies: `filterMoviesByMinRating(allMovies, 8.5)` (>= 8.5)
- Filter movies in rating range: `filterMoviesByRatingRange(allMovies, 7.0, 8.5)`
- Display quality-based categorization with meaningful labels
- Show practical rating-based recommendations

**Helper Methods Required**:
```java
public static List<Movie> filterMoviesByMinRating(List<Movie> movies, double minRating)
public static List<Movie> filterMoviesByRatingRange(List<Movie> movies, double minRating, double maxRating)
```

---

### Prompt 3: Time-Based Filtering by Release Year
**Task**: Create methods demonstrating how to filter movies based on their release years.

**Expected Function Signature**: `private static void demonstrateFilterByReleaseYear(List<Movie> allMovies)`

**Requirements**:
- Print section header: "3. Filter Movies by Release Year:"
- Filter classic movies: `filterClassicMovies(allMovies)` (before 2000, using Movie.isClassic())
- Filter modern movies: `filterMoviesByMinYear(allMovies, 2010)` (2010 and after)
- Demonstrate era-based categorization
- Show practical historical/contemporary grouping

**Helper Methods Required**:
```java
public static List<Movie> filterClassicMovies(List<Movie> movies) // Uses movie.isClassic()
public static List<Movie> filterMoviesByMinYear(List<Movie> movies, int minYear)
```

---

### Prompt 4: Duration-Based Filtering Operations
**Task**: Create methods demonstrating how to filter movies based on their duration.

**Expected Function Signature**: `private static void demonstrateFilterByDuration(List<Movie> allMovies)`

**Requirements**:
- Print section header: "4. Filter Movies by Duration:"
- Filter short movies: `filterMoviesByMaxDuration(allMovies, 120)` (< 120 minutes)
- Filter long movies: `filterLongMovies(allMovies)` (using Movie.isLongMovie() method)
- Show duration-based preferences for different viewing scenarios
- Display formatted duration with each result

**Helper Methods Required**:
```java
public static List<Movie> filterMoviesByMaxDuration(List<Movie> movies, int maxDuration)
public static List<Movie> filterLongMovies(List<Movie> movies) // Uses movie.isLongMovie()
```

---

### Prompt 5: Complex Multi-Criteria Filtering
**Task**: Create methods demonstrating how to filter movies using multiple criteria simultaneously.

**Expected Function Signature**: `private static void demonstrateComplexFiltering(List<Movie> allMovies)`

**Requirements**:
- Print section header: "5. Complex Filtering (Multiple Criteria):"
- Filter action movies: `filterActionMoviesHighRatedModern(allMovies)` (ACTION + rating >= 8.0 + released after 2000)
- Filter available dramas: `filterAvailableDramasUnder3Hours(allMovies)` (DRAMA + available + duration < 180)
- Show real-world complex search scenarios
- Demonstrate compound filtering logic

**Helper Methods Required**:
```java
public static List<Movie> filterActionMoviesHighRatedModern(List<Movie> movies)
public static List<Movie> filterAvailableDramasUnder3Hours(List<Movie> movies)
```

---

### Prompt 6: Custom Filtering with String Operations
**Task**: Create methods demonstrating how to filter movies using string-based criteria.

**Expected Function Signature**: `private static void demonstrateCustomFiltering(List<Movie> allMovies)`

**Requirements**:
- Print section header: "6. Custom Filtering Examples:"
- Filter by director: `filterMoviesByDirector(allMovies, "Christopher Nolan")`
- Filter by title prefix: `filterMoviesByTitlePrefix(allMovies, "The")`
- Show string matching and pattern-based filtering
- Demonstrate practical search functionality

**Helper Methods Required**:
```java
public static List<Movie> filterMoviesByDirector(List<Movie> movies, String director)
public static List<Movie> filterMoviesByTitlePrefix(List<Movie> movies, String prefix)
```

## Key Concepts Covered

### 1. Single-Criterion Filtering
**What you'll learn:**
- Basic filtering patterns with simple conditions
- Creating new collections with qualifying elements
- Maintaining original collection integrity
- Efficient single-pass filtering algorithms

**Code Examples:**
```java
public static List<Movie> filterMoviesByGenre(List<Movie> movies, MovieGenre genre) {
    List<Movie> filteredMovies = new ArrayList<>();
    for (Movie movie : movies) {
        if (movie.genre() == genre) {
            filteredMovies.add(movie);
        }
    }
    return filteredMovies;
}
```

### 2. Range-Based Filtering
**What you'll learn:**
- Filtering with minimum/maximum thresholds
- Range validation and boundary conditions
- Numeric comparison patterns
- Quality-based categorization

**Code Examples:**
```java
public static List<Movie> filterMoviesByRatingRange(List<Movie> movies, double minRating, double maxRating) {
    List<Movie> filteredMovies = new ArrayList<>();
    for (Movie movie : movies) {
        if (movie.rating() >= minRating && movie.rating() < maxRating) {
            filteredMovies.add(movie);
        }
    }
    return filteredMovies;
}
```

### 3. Object Method Integration
**What you'll learn:**
- Leveraging existing object methods for filtering
- Encapsulation benefits in filtering operations
- Business logic integration with filtering
- Clean code practices with meaningful method names

**Code Examples:**
```java
public static List<Movie> filterClassicMovies(List<Movie> movies) {
    List<Movie> classicMovies = new ArrayList<>();
    for (Movie movie : movies) {
        if (movie.isClassic()) { // Using Movie record method
            classicMovies.add(movie);
        }
    }
    return classicMovies;
}
```

### 4. Multi-Criteria Filtering
**What you'll learn:**
- Complex boolean expressions in filtering
- Logical operators (AND, OR) in conditions
- Performance considerations with multiple checks
- Real-world compound search scenarios

**Code Examples:**
```java
public static List<Movie> filterActionMoviesHighRatedModern(List<Movie> movies) {
    List<Movie> filteredMovies = new ArrayList<>();
    for (Movie movie : movies) {
        if (movie.genre() == MovieGenre.ACTION &&
            movie.rating() >= 8.0 &&
            movie.releaseYear() > 2000) {
            filteredMovies.add(movie);
        }
    }
    return filteredMovies;
}
```

### 5. String-Based Filtering
**What you'll learn:**
- String comparison and matching techniques
- Case sensitivity considerations
- Null safety in string operations
- Pattern matching and prefix filtering

**Code Examples:**
```java
public static List<Movie> filterMoviesByDirector(List<Movie> movies, String director) {
    List<Movie> filteredMovies = new ArrayList<>();
    for (Movie movie : movies) {
        if (movie.director() != null && movie.director().equals(director)) {
            filteredMovies.add(movie);
        }
    }
    return filteredMovies;
}
```

## Performance Characteristics

| Filter Type | Time Complexity | Space Complexity | Notes |
|------------|----------------|------------------|--------|
| Single Criterion | O(n) | O(k) where k = matches | Linear scan, new collection |
| Multi-Criteria | O(n) | O(k) where k = matches | Multiple conditions per element |
| Range Filter | O(n) | O(k) where k = matches | Two comparisons per element |
| String Filter | O(n * m) worst case | O(k) where k = matches | m = string comparison length |
| Object Method | O(n * p) | O(k) where k = matches | p = method execution time |

## Best Practices for Movie Filtering

### 1. Immutability and Safety
- Always create new collections for filtered results
- Never modify the original collection during filtering
- Handle null values gracefully in all comparisons
- Use defensive programming techniques

### 2. Performance Optimization
- Place most restrictive conditions first in multi-criteria filters
- Consider early termination for existence checks
- Use efficient comparison methods for strings and objects
- Minimize object creation in tight loops

### 3. Code Organization
- Group related filtering methods together
- Use meaningful method names that describe the filter
- Keep filtering logic separate from display logic
- Make filters reusable and composable

### 4. Error Handling
- Validate input parameters before filtering
- Handle edge cases (empty collections, null criteria)
- Provide clear documentation for expected behavior
- Use type-safe filtering with generics

## Common Use Cases

### 1. E-commerce and Shopping
- **Product Catalogs**: Filter by category, price range, ratings, brand
- **Search Results**: Apply multiple filters simultaneously
- **Recommendation Systems**: Filter based on user preferences
- **Inventory Management**: Filter by availability, stock levels

### 2. Content Management
- **Media Libraries**: Filter movies by genre, year, rating, duration
- **Article Systems**: Filter by publication date, category, author
- **Digital Assets**: Filter by file type, size, creation date
- **User-Generated Content**: Filter by moderation status, popularity

### 3. Data Analysis and Reporting
- **Business Intelligence**: Filter data for specific analysis periods
- **Quality Control**: Filter items meeting quality standards
- **Compliance Reporting**: Filter records by regulatory criteria
- **Performance Metrics**: Filter by performance thresholds

### 4. User Interface Logic
- **Search Interfaces**: Implement advanced search with multiple criteria
- **Dashboard Filters**: Allow users to customize data views
- **Administrative Panels**: Filter records for management tasks
- **Mobile Apps**: Implement efficient local data filtering

## Real-World Applications

### 1. Streaming Platforms
- **Content Discovery**: Filter movies by genre, rating, release year
- **Personalization**: Filter based on viewing history and preferences
- **Family Safety**: Filter content by age ratings and availability
- **Quality Selection**: Filter by video quality and streaming options

### 2. Database Query Simulation
- **Local Caching**: Filter cached data without database queries
- **Testing Frameworks**: Filter test data for specific scenarios
- **Data Migration**: Filter records for transformation processes
- **Backup Systems**: Filter files by criteria for selective backup

### 3. API Data Processing
- **Response Filtering**: Filter API responses before client consumption
- **Data Transformation**: Filter and transform data between services
- **Rate Limiting**: Filter requests based on usage criteria
- **Security Filtering**: Filter data based on access permissions

### 4. Analytics and Machine Learning
- **Feature Selection**: Filter data attributes for model training
- **Data Preprocessing**: Filter outliers and invalid data points
- **A/B Testing**: Filter user groups for experimental analysis
- **Batch Processing**: Filter large datasets for specific operations

This comprehensive filtering functionality demonstrates how traditional loop-based approaches can efficiently handle complex data filtering scenarios commonly encountered in modern applications.
