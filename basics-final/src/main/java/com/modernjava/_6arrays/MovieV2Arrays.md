# MovieV2Arrays.java - Working with Arrays of Objects

<!-- TOC -->
* [MovieV2Arrays.java - Working with Arrays of Objects](#moviev2arraysjava---working-with-arrays-of-objects)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 0: Initialize Static Movie Array](#prompt-0-initialize-static-movie-array)
    * [Prompt 1: Print All Movies from Array](#prompt-1-print-all-movies-from-array)
    * [Prompt 2: Search Movies by Streaming Platform](#prompt-2-search-movies-by-streaming-platform)
    * [Prompt 3: Collect Action Genre Movies](#prompt-3-collect-action-genre-movies)
    * [Prompt 4: Sort Movies by Name](#prompt-4-sort-movies-by-name)
    * [1. Arrays of Objects](#1-arrays-of-objects)
    * [2. Object Property Access](#2-object-property-access)
    * [3. Filtering and Searching Arrays](#3-filtering-and-searching-arrays)
  * [MovieV2 Class Structure](#moviev2-class-structure)
    * [4. Sorting Arrays with Comparators](#4-sorting-arrays-with-comparators)
  * [Common Patterns](#common-patterns)
    * [Pattern 1: Iterate All Objects](#pattern-1-iterate-all-objects)
    * [Pattern 2: Filter by String Property](#pattern-2-filter-by-string-property)
    * [Pattern 3: Filter by Enum Property](#pattern-3-filter-by-enum-property)
    * [Pattern 4: Filter by Multiple Conditions](#pattern-4-filter-by-multiple-conditions)
  * [Running the Code](#running-the-code)
  * [Expected Output](#expected-output)
  * [Next Steps](#next-steps)
<!-- TOC -->

## Overview

This file demonstrates how to work with arrays of complex objects (MovieV2) in Java. It covers practical scenarios like iterating through object arrays, filtering based on specific properties (streaming platform, genre), and displaying object data. This builds on the basic array concepts by introducing object references and property access patterns.

## Prompts for Replication

### Prompt 0: Initialize Static Movie Array
**Task**: Create a static array variable containing 10 MovieV2 objects as sample data.

**Expected Variable Declaration**: `private static final MovieV2[] movies`

**Requirements**:
- Declare as private static final to ensure immutability
- Initialize with array of 10 MovieV2 objects
- Each movie should have the following properties:
  - Title (String)
  - Duration in minutes (int)
  - Genre (MovieGenreEnum)
  - Rating 0-10 (double)
  - Age Rating minimum age (int)
  - Streaming Platform using MovieUtils constants
- Use variety of genres: SCI_FI, ACTION, DRAMA, THRILLER
- Use variety of streaming platforms:
  - `MovieUtils.StreamingPlatform_netflix`
  - `MovieUtils.StreamingPlatform_amazonprime`
  - `MovieUtils.StreamingPlatform_disney`

**Sample Movies:**
```java
private static final MovieV2[] movies = {
    new MovieV2("Inception", 148, MovieGenreEnum.SCI_FI, 8.8, 13, MovieUtils.StreamingPlatform_netflix),
    new MovieV2("The Dark Knight", 152, MovieGenreEnum.ACTION, 9.0, 12, MovieUtils.StreamingPlatform_netflix),
    new MovieV2("Forrest Gump", 142, MovieGenreEnum.DRAMA, 8.8, 10, MovieUtils.StreamingPlatform_amazonprime),
    new MovieV2("The Matrix", 136, MovieGenreEnum.ACTION, 8.7, 15, MovieUtils.StreamingPlatform_netflix),
    new MovieV2("Interstellar", 169, MovieGenreEnum.SCI_FI, 8.6, 13, MovieUtils.StreamingPlatform_netflix),
    new MovieV2("Pulp Fiction", 154, MovieGenreEnum.THRILLER, 8.9, 18, MovieUtils.StreamingPlatform_disney),
    new MovieV2("Fight Club", 139, MovieGenreEnum.ACTION, 8.8, 18, MovieUtils.StreamingPlatform_netflix),
    new MovieV2("The Shawshank Redemption", 142, MovieGenreEnum.DRAMA, 9.3, 15, MovieUtils.StreamingPlatform_amazonprime),
    new MovieV2("Gladiator", 155, MovieGenreEnum.ACTION, 8.5, 13, MovieUtils.StreamingPlatform_netflix),
    new MovieV2("Avatar", 162, MovieGenreEnum.SCI_FI, 7.8, 12, MovieUtils.StreamingPlatform_disney)
};
```

**Key Learning**:
- Static variables are shared across all instances
- `final` keyword ensures the array reference cannot change
- Using constants from MovieUtils maintains code consistency
- Variety in sample data makes for better testing

---

### Prompt 1: Print All Movies from Array
**Task**: Create a method that iterates through an array of MovieV2 objects and displays all movies.

**Expected Function Signature**: `public static void printAllMovies()`

**Requirements**:
- Print section header: "=== All Movies ==="
- Use enhanced for loop to iterate through movie array
- Call `movie.printMovie()` for each movie object
- Display all 10 movies in the sample array

**Key Learning**:
- Enhanced for loop syntax for object arrays: `for (MovieV2 movie : movies)`
- Accessing methods on object array elements
- Simple iteration patterns

---

### Prompt 2: Search Movies by Streaming Platform
**Task**: Create a method that filters and displays movies available on Netflix using MovieUtils constants.

**Expected Function Signature**: `public static void searchNetflixMovies()`

**Requirements**:
- Print section header: "=== Netflix Movies ==="
- Use enhanced for loop to iterate through movie array
- Check if movie's streaming platform matches `MovieUtils.StreamingPlatform_netflix`
- Use `.equals()` method for string comparison
- Call `movie.printMovie()` only for matching movies
- Should return 5 movies in the sample data

**Key Learning**:
- Conditional filtering within loops
- Property access using getter methods: `movie.getStreamingPlatform()`
- String equality comparison with `.equals()`
- Using centralized constants from utility classes

---

### Prompt 3: Collect Action Genre Movies
**Task**: Create a method that filters and displays all movies belonging to the ACTION genre.

**Expected Function Signature**: `public static void collectActionMovies()`

**Requirements**:
- Print section header: "=== Action Movies ==="
- Use enhanced for loop to iterate through movie array
- Check if movie's genre equals `MovieGenreEnum.ACTION`
- Use enum comparison with `==` operator (not `.equals()`)
- Call `movie.printMovie()` only for matching movies
- Should return 4 movies in the sample data

**Key Learning**:
- Comparing enum values with `==` operator
- Genre property access: `movie.getGenre()`
- Enum type comparison vs. string comparison
- Filtering by object attributes

## Key Concepts Covered

---

### Prompt 4: Sort Movies by Name
**Task**: Create a method that sorts the movie array alphabetically by title and displays the sorted results.

**Expected Function Signature**: `public static void sortMoviesByName()`

**Requirements**:
- Print section header: "=== Movies Sorted by Name ==="
- Create a copy of the original array using `Arrays.copyOf(movies, movies.length)`
- Use `Arrays.sort()` with a lambda comparator
- Sort by movie title alphabetically: `(movie1, movie2) -> movie1.getTitle().compareTo(movie2.getTitle())`
- Display all sorted movies using enhanced for loop
- Call `movie.printMovie()` for each movie in sorted order

**Key Learning**:
- Using `Arrays.copyOf()` to create a copy without modifying original array
- `Arrays.sort()` with custom comparators
- Lambda expressions for comparators: `(movie1, movie2) -> ...`
- String comparison using `.compareTo()` for sorting
- Preserving immutability of original data

---

- Objects must be initialized before access

### 2. Object Property Access

**What you'll learn:**
- How to access object properties using getter methods
- Calling methods on object array elements
- The difference between property access patterns

**Code Examples:**
```java
// Accessing properties through getter methods
MovieV2 movie = movies[0];
String platform = movie.getStreamingPlatform();
MovieGenreEnum genre = movie.getGenre();
double rating = movie.getRating();

// Calling methods in loop
for (MovieV2 movie : movies) {
    movie.printMovie();  // Calls printMovie() on each object
}
```

**Key Points:**
- Use getter methods to access private object properties
- Methods are called on individual objects, not the array
- Each object maintains its own state/data
- Properties can be compared for filtering

### 3. Filtering and Searching Arrays

**What you'll learn:**
- How to select subset of array elements based on conditions
- String vs. enum comparison patterns
- Common filtering patterns with loops

**Code Examples:**
```java
// Filtering by string property (use .equals())
for (MovieV2 movie : movies) {
    if (MovieUtils.StreamingPlatform_netflix.equals(movie.getStreamingPlatform())) {
        movie.printMovie();
    }
}

// Filtering by enum property (use ==)
for (MovieV2 movie : movies) {
    if (movie.getGenre() == MovieGenreEnum.ACTION) {
        movie.printMovie();
    }
}
```

**Key Points:**
- **String comparison**: Use `.equals()` method, not `==`
- **Enum comparison**: Use `==` operator
- **Enhanced for loop**: Cleaner syntax when order doesn't matter
- **Conditional filtering**: Apply business logic inside loop

## MovieV2 Class Structure

The MovieV2 class represents a movie with the following properties:

| Property | Type | Description |
|----------|------|-------------|
| `title` | String | Movie title |
| `duration` | int | Duration in minutes |
| `genre` | MovieGenreEnum | Genre category (ACTION, SCI_FI, DRAMA, etc.) |
| `rating` | double | Rating (0.0 to 10.0) |
| `ageRating` | int | Minimum age requirement |
| `streamingPlatform` | String | Platform (Netflix, Prime Video, Disney+) |

**Available Methods:**
- `getTitle()` - Returns movie title
- `getDuration()` - Returns duration in minutes
- `getGenre()` - Returns MovieGenreEnum
- `getRating()` - Returns rating
- `getAgeRating()` - Returns age rating
- `getStreamingPlatform()` - Returns streaming platform
- `printMovie()` - Prints formatted movie information

## Sample Data

The MovieV2Arrays class includes a static array of 10 sample movies:

### 4. Sorting Arrays with Comparators

**What you'll learn:**
- How to sort arrays of objects using `Arrays.sort()`
- Using lambda expressions with comparators
- Creating copies of arrays to preserve original data

**Code Examples:**
```java
// Sort a copy of the array to preserve original
MovieV2[] sortedMovies = Arrays.copyOf(movies, movies.length);

// Sort using lambda comparator
Arrays.sort(sortedMovies, (movie1, movie2) -> movie1.getTitle().compareTo(movie2.getTitle()));

// Display sorted results
for (MovieV2 movie : sortedMovies) {
    movie.printMovie();
}
```

**Key Points:**
- **`Arrays.copyOf()`**: Creates independent copy of array
- **`Arrays.sort()`**: Sorts array in-place using provided comparator
- **Lambda comparator**: `(a, b) -> a.compareTo(b)` for ascending order
- **String sorting**: Use `.compareTo()` for alphabetical ordering
- **Preserve original**: Always work on a copy when original data matters

for (MovieV2 movie : movies) {
    movie.printMovie();
}
```

### Pattern 2: Filter by String Property
```java
for (MovieV2 movie : movies) {
    if (MovieUtils.StreamingPlatform_netflix.equals(movie.getStreamingPlatform())) {
        // Process matching movie
    }
}
```

### Pattern 3: Filter by Enum Property
```java
for (MovieV2 movie : movies) {
    if (movie.getGenre() == MovieGenreEnum.ACTION) {
        // Process matching movie
    }
}
```

### Pattern 4: Filter by Multiple Conditions
```java
for (MovieV2 movie : movies) {
    if (movie.getGenre() == MovieGenreEnum.ACTION && 
        movie.getRating() >= 8.5) {
        // Process matching movie
    }
}
```

## Running the Code

Execute the `MovieV2Arrays.java` main method to see:
- All 10 movies displayed with complete information
- Only Netflix movies filtered and displayed
- Only ACTION genre movies collected and displayed

## Expected Output

```
=== All Movies ===
Inception - 148 mins - SCI_FI - Rating: 8.8 - Age: 13 - Netflix
The Dark Knight - 152 mins - ACTION - Rating: 9.0 - Age: 12 - Netflix
Forrest Gump - 142 mins - DRAMA - Rating: 8.8 - Age: 10 - Prime Video
The Matrix - 136 mins - ACTION - Rating: 8.7 - Age: 15 - Netflix
Interstellar - 169 mins - SCI_FI - Rating: 8.6 - Age: 13 - Netflix
Pulp Fiction - 154 mins - THRILLER - Rating: 8.9 - Age: 18 - Disney+
Fight Club - 139 mins - ACTION - Rating: 8.8 - Age: 18 - Netflix
The Shawshank Redemption - 142 mins - DRAMA - Rating: 9.3 - Age: 15 - Prime Video
Gladiator - 155 mins - ACTION - Rating: 8.5 - Age: 13 - Netflix
Avatar - 162 mins - SCI_FI - Rating: 7.8 - Age: 12 - Disney+

=== Netflix Movies ===
Inception - 148 mins - SCI_FI - Rating: 8.8 - Age: 13 - Netflix
The Dark Knight - 152 mins - ACTION - Rating: 9.0 - Age: 12 - Netflix
The Matrix - 136 mins - ACTION - Rating: 8.7 - Age: 15 - Netflix
Interstellar - 169 mins - SCI_FI - Rating: 8.6 - Age: 13 - Netflix
Fight Club - 139 mins - ACTION - Rating: 8.8 - Age: 18 - Netflix
Gladiator - 155 mins - ACTION - Rating: 8.5 - Age: 13 - Netflix

=== Action Movies ===
The Dark Knight - 152 mins - ACTION - Rating: 9.0 - Age: 12 - Netflix
The Matrix - 136 mins - ACTION - Rating: 8.7 - Age: 15 - Netflix
Fight Club - 139 mins - ACTION - Rating: 8.8 - Age: 18 - Netflix
Gladiator - 155 mins - ACTION - Rating: 8.5 - Age: 13 - Netflix
```

## Next Steps

- **Advanced filtering**: Use multiple conditions to filter complex movie searches
- **Sorting arrays**: Learn to sort MovieV2 arrays by rating, duration, or title
- **Array transformations**: Extract specific properties into new arrays
- **Collections**: Explore ArrayList and other collection types for more flexible data structures


