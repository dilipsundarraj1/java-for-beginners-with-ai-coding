# MovieTransformation.java - ArrayList Transformation Operations with Movie Objects

## Overview
This file demonstrates comprehensive transformation operations on ArrayList using Movie objects as examples. It shows traditional loop-based approaches for transforming movie data into different formats without using lambdas or streams. This builds upon basic ArrayList operations to showcase real-world data transformation patterns commonly used in data processing, reporting, and API development.

## Prompts for Replication

### Prompt 1: Basic Data Extraction Transformations
**Task**: Create methods demonstrating how to extract specific data fields from movie objects.

**Expected Function Signature**: `private static void demonstrateTransformToTitles(List<Movie> movies)`

**Requirements**:
- Print section header: "1. Transform Movies to Titles:"
- Extract movie titles: `extractMovieTitles(movies)`
- Display all extracted titles as a simple string list
- Show count of extracted titles
- Demonstrate basic field extraction patterns

**Helper Methods Required**:
```java
public static List<String> extractMovieTitles(List<Movie> movies)
```

---

### Prompt 2: Composite Data Creation Transformations
**Task**: Create methods demonstrating how to combine multiple movie fields into summary strings.

**Expected Function Signature**: `private static void demonstrateTransformToSummaries(List<Movie> movies)`

**Requirements**:
- Print section header: "2. Transform Movies to Summaries:"
- Create movie summaries: `createMovieSummaries(movies)`
- Format: "Title - Genre (Year)"
- Display all summaries with readable formatting
- Show practical data aggregation patterns

**Helper Methods Required**:
```java
public static List<String> createMovieSummaries(List<Movie> movies)
```

---

### Prompt 3: Categorical Classification Transformations
**Task**: Create methods demonstrating how to transform numerical data into categorical labels.

**Expected Function Signature**: `private static void demonstrateTransformToRatingCategories(List<Movie> movies)`

**Requirements**:
- Print section header: "3. Transform Movies to Rating Categories:"
- Transform ratings to categories: `transformToRatingCategories(movies)`
- Categories: "Masterpiece" (9.0+), "Excellent" (8.5+), "Great" (8.0+), "Good" (7.0+), "Average" (6.0+), "Below Average" (<6.0)
- Display movie title → category mappings
- Show practical quality classification

**Helper Methods Required**:
```java
public static List<String> transformToRatingCategories(List<Movie> movies)
```

---

### Prompt 4: Duration Classification Transformations
**Task**: Create methods demonstrating how to classify movies by duration categories.

**Expected Function Signature**: `private static void demonstrateTransformToDurationCategories(List<Movie> movies)`

**Requirements**:
- Print section header: "4. Transform Movies to Duration Categories:"
- Transform duration to categories: `transformToDurationCategories(movies)`
- Categories: "Short Film" (<90min), "Standard Length" (90-120min), "Long Film" (120-150min), "Epic Length" (150-180min), "Marathon Length" (180+min)
- Display movie title with formatted duration → category
- Show practical length-based classification

**Helper Methods Required**:
```java
public static List<String> transformToDurationCategories(List<Movie> movies)
```

---

### Prompt 5: Rich Formatting Transformations
**Task**: Create methods demonstrating how to transform objects into richly formatted strings.

**Expected Function Signature**: `private static void demonstrateTransformToInfoStrings(List<Movie> movies)`

**Requirements**:
- Print section header: "5. Transform Movies to Formatted Info Strings:"
- Create formatted strings: `transformToMovieInfoStrings(movies)`
- Format: "🎬 Title (Year) - Genre | Rating⭐ | Duration | Dir: Director"
- Use emojis and symbols for visual appeal
- Show practical display formatting for user interfaces

**Helper Methods Required**:
```java
public static List<String> transformToMovieInfoStrings(List<Movie> movies)
```

---

### Prompt 6: Object-to-Object Transformations
**Task**: Create methods demonstrating how to transform complex objects into simpler data structures.

**Expected Function Signature**: `private static void demonstrateTransformToMovieSummaryObjects(List<Movie> movies)`

**Requirements**:
- Print section header: "6. Transform Movies to Summary Objects:"
- Transform to summary objects: `transformToMovieSummaryObjects(movies)`
- Create MovieSummary class with: title, genre, year, recommendation
- Recommendation logic: "Recommended" if rating >= 8.0, else "Not Recommended"
- Show object-to-object transformation patterns

**Helper Methods Required**:
```java
public static List<MovieSummary> transformToMovieSummaryObjects(List<Movie> movies)
```

**Helper Class Required**:
```java
public static class MovieSummary {
    private String title, genre, recommendation;
    private int year;
    // constructor and toString()
}
```

---

### Prompt 7: Mathematical Transformations
**Task**: Create methods demonstrating how to transform numerical data using mathematical operations.

**Expected Function Signature**: `private static void demonstrateMathematicalTransformations(List<Movie> movies)`

**Requirements**:
- Print section header: "7. Mathematical Transformations:"
- Transform ratings to percentages: `transformRatingsToPercentages(movies)` (8.5/10 → 85%)
- Transform duration to hours: `transformDurationToHours(movies)` (148min → 2.47 hours)
- Display before and after values side by side
- Show practical unit conversion patterns

**Helper Methods Required**:
```java
public static List<Double> transformRatingsToPercentages(List<Movie> movies)
public static List<Double> transformDurationToHours(List<Movie> movies)
```

## Key Concepts Covered

### 1. Field Extraction Transformations
**What you'll learn:**
- Simple data extraction from complex objects
- Creating collections of primitive/simple types
- Maintaining data relationships during extraction
- Memory-efficient single-field transformations

**Code Examples:**
```java
public static List<String> extractMovieTitles(List<Movie> movies) {
    List<String> titles = new ArrayList<>();
    for (Movie movie : movies) {
        titles.add(movie.title());
    }
    return titles;
}
```

### 2. Composite String Building
**What you'll learn:**
- Combining multiple object fields into strings
- String formatting and concatenation techniques
- Creating human-readable data representations
- Building display-ready data formats

**Code Examples:**
```java
public static List<String> createMovieSummaries(List<Movie> movies) {
    List<String> summaries = new ArrayList<>();
    for (Movie movie : movies) {
        String summary = movie.title() + " - " + movie.genre() + " (" + movie.releaseYear() + ")";
        summaries.add(summary);
    }
    return summaries;
}
```

### 3. Categorical Classification
**What you'll learn:**
- Converting continuous values to discrete categories
- Multi-condition classification logic
- Business rule implementation in transformations
- Quality and performance categorization

**Code Examples:**
```java
public static List<String> transformToRatingCategories(List<Movie> movies) {
    List<String> categories = new ArrayList<>();
    for (Movie movie : movies) {
        double rating = movie.rating();
        String category;
        if (rating >= 9.0) category = "Masterpiece";
        else if (rating >= 8.5) category = "Excellent";
        else if (rating >= 8.0) category = "Great";
        else category = "Good";
        categories.add(category);
    }
    return categories;
}
```

### 4. Mathematical Conversions
**What you'll learn:**
- Unit conversion algorithms
- Numerical transformation patterns
- Precision handling in calculations
- Scale and percentage conversions

**Code Examples:**
```java
public static List<Double> transformRatingsToPercentages(List<Movie> movies) {
    List<Double> percentages = new ArrayList<>();
    for (Movie movie : movies) {
        double percentage = movie.rating() * 10.0; // Convert 8.5/10 to 85%
        percentages.add(percentage);
    }
    return percentages;
}
```

### 5. Object-to-Object Mapping
**What you'll learn:**
- Converting complex objects to simpler representations
- Data transfer object (DTO) patterns
- Selective field copying and transformation
- API response preparation techniques

**Code Examples:**
```java
public static List<MovieSummary> transformToMovieSummaryObjects(List<Movie> movies) {
    List<MovieSummary> summaries = new ArrayList<>();
    for (Movie movie : movies) {
        MovieSummary summary = new MovieSummary(
            movie.title(),
            movie.genre().toString(),
            movie.releaseYear(),
            movie.rating() >= 8.0 ? "Recommended" : "Not Recommended"
        );
        summaries.add(summary);
    }
    return summaries;
}
```

## Performance Characteristics

| Transformation Type | Time Complexity | Space Complexity | Notes |
|-------------------|----------------|------------------|--------|
| Field Extraction | O(n) | O(n) | Simple field access |
| String Building | O(n * m) | O(n * m) | m = average string length |
| Mathematical | O(n) | O(n) | Simple arithmetic operations |
| Categorical | O(n) | O(n) | Conditional logic per element |
| Object Mapping | O(n * k) | O(n * k) | k = construction complexity |
| Formatting | O(n * f) | O(n * f) | f = formatting complexity |

## Best Practices for Movie Transformation

### 1. Data Integrity
- Preserve original data during transformation
- Handle null values gracefully in all transformations
- Validate input data before transformation
- Use immutable objects when possible

### 2. Memory Management
- Create appropriately sized result collections
- Consider streaming for very large datasets
- Release references to original data when not needed
- Use efficient string building techniques

### 3. Code Clarity
- Use descriptive method names that indicate transformation type
- Separate transformation logic from formatting logic
- Keep transformations pure (no side effects)
- Document complex transformation rules

### 4. Error Handling
- Validate transformation parameters
- Handle edge cases (empty collections, invalid data)
- Provide meaningful error messages
- Consider using Optional for nullable results

## Common Use Cases

### 1. API Development
- **Response Formatting**: Transform internal objects to API responses
- **Data Transfer Objects**: Create lightweight objects for network transfer
- **Version Compatibility**: Transform between different API versions
- **Client Customization**: Format data for specific client requirements

### 2. Reporting and Analytics
- **Data Aggregation**: Transform raw data into summary statistics
- **Chart Preparation**: Format data for visualization tools
- **Export Formats**: Transform to CSV, JSON, XML for external systems
- **Dashboard Data**: Create display-ready data structures

### 3. User Interface Preparation
- **Display Formatting**: Transform data for human-readable presentation
- **Dropdown Population**: Extract options for UI components
- **Search Results**: Format search results for display
- **Mobile Optimization**: Transform for mobile-friendly formats

### 4. Data Integration
- **System Migration**: Transform data between different systems
- **Format Conversion**: Convert between different data formats
- **ETL Processes**: Extract, Transform, Load operations
- **Data Normalization**: Standardize data formats across systems

## Real-World Applications

### 1. Content Management Systems
- **Article Summaries**: Transform full articles to preview snippets
- **SEO Optimization**: Extract and format meta information
- **Content Categories**: Classify content by type and topic
- **Publishing Workflows**: Transform drafts to published formats

### 2. E-commerce Platforms
- **Product Listings**: Transform inventory data to display format
- **Price Calculations**: Convert currencies and apply discounts
- **Review Summaries**: Aggregate and categorize customer reviews
- **Recommendation Engines**: Transform user data to recommendation format

### 3. Financial Applications
- **Statement Generation**: Transform transaction data to statements
- **Risk Assessment**: Categorize investments by risk levels
- **Currency Conversion**: Transform amounts between currencies
- **Regulatory Reporting**: Format data for compliance requirements

### 4. Healthcare Systems
- **Patient Records**: Transform medical data for different departments
- **Billing Systems**: Convert treatments to billing codes
- **Research Data**: Anonymize and format data for research
- **Insurance Claims**: Transform medical records to claim formats

This comprehensive transformation functionality demonstrates how traditional loop-based approaches can efficiently handle complex data transformation scenarios commonly encountered in modern software development.
