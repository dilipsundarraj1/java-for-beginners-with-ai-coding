# MovieV1.java - Understanding the "this" Operator and Class Design

<!-- TOC -->
* [MovieV1.java - Understanding the "this" Operator and Class Design](#moviev1java---understanding-the-this-operator-and-class-design)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Private Fields, No-Argument Constructor, and toString Method](#prompt-1-private-fields-no-argument-constructor-and-tostring-method)
    * [Prompt 2: Getter Methods for All Fields](#prompt-2-getter-methods-for-all-fields)
    * [Prompt 3: Setter Methods with Validation](#prompt-3-setter-methods-with-validation)
  * [Key Concepts Covered](#key-concepts-covered)
    * [1. The "this" Operator](#1-the-this-operator)
    * [2. Private Fields and Encapsulation](#2-private-fields-and-encapsulation)
    * [3. Constructors](#3-constructors)
    * [4. Getter Methods](#4-getter-methods)
    * [5. Setter Methods with Validation](#5-setter-methods-with-validation)
  * [Memory Behavior](#memory-behavior)
  * [Common Mistakes to Avoid](#common-mistakes-to-avoid)
    * [1. Forgetting "this" keyword in constructors and setters](#1-forgetting-this-keyword-in-constructors-and-setters)
    * [2. Missing validation in setter methods](#2-missing-validation-in-setter-methods)
    * [3. Not using private for fields](#3-not-using-private-for-fields)
    * [4. Inconsistent naming conventions](#4-inconsistent-naming-conventions)
  * [Running the Code](#running-the-code)
  * [Next Steps](#next-steps)
  * [Summary](#summary)
<!-- TOC -->

## Overview
This file demonstrates the Movie class implementation, focusing on the "this" operator, encapsulation with private fields, constructors, and getter/setter methods. The class represents a movie with properties like title, duration, genre, rating, minimum age requirement, and streaming platform.

## Prompts for Replication

### Prompt 1: Private Fields, No-Argument Constructor, and toString Method
**Task**: Create a Movie class with private fields, a no-argument constructor that initializes all fields with default values, and a toString method.

**Expected Code Structure**: Class declaration with private fields, constructor, and toString method

**Requirements**:
- Create a public class named `MovieV1`
- Declare 6 private fields:
  - `title` (String) - represents the movie title
  - `duration` (int) - represents duration in minutes
  - `genre` (String) - represents the movie genre
  - `rating` (double) - represents rating out of 10.0
  - `minimumAge` (int) - represents minimum age requirement
  - `streamingPlatform` (String) - represents where the movie is available
- Create a no-argument constructor that:
  - Prints "Default constructor called"
  - Uses the "this" keyword to initialize all fields with default values:
    - `this.title = "Unknown"`
    - `this.duration = 0`
    - `this.genre = "Unknown"`
    - `this.rating = 0.0`
    - `this.minimumAge = 0`
    - `this.streamingPlatform = "Unknown"`
- Override the toString method that:
  - Returns a formatted string displaying all field values
  - Format: "Movie: {title}, Duration: {duration} minutes, Genre: {genre}, Rating: {rating}/10.0, Minimum Age: {minimumAge}, Streaming Platform: {streamingPlatform}"

**Key Points About "this" Operator**:
- The "this" keyword refers to the current object instance
- In the constructor, "this.title" refers to the instance variable, not the parameter
- Without "this", the assignment would be ambiguous (is it assigning to the parameter or the field?)
- "this" is essential when parameter names match field names
- "this" helps distinguish between local variables/parameters and instance variables
- Every object created gets its own copy of instance variables
- "this" allows us to refer to those instance variables from within methods
- In a constructor, "this" represents the object being constructed
- Default values: String -> "Unknown", int -> 0, double -> 0.0, boolean -> false

**Exact Code to Implement**:
```java
package com.modernjava._3classandobjects;

public class MovieV1 {
    // Private fields for encapsulation
    private String title;
    private int duration; // in minutes
    private String genre;
    private double rating; // out of 10.0
    private int minimumAge; // minimum age requirement for the movie
    private String streamingPlatform; // streaming platform where movie is available

    // No-Argument constructor
    public MovieV1() {
        System.out.println("Default constructor called");
        this.title = "Unknown";
        this.duration = 0;
        this.genre = "Unknown";
        this.rating = 0.0;
        this.minimumAge = 0;
        this.streamingPlatform = "Unknown";
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Movie: " + this.title + ", Duration: " + this.duration + " minutes, Genre: " + this.genre + ", Rating: " + this.rating + "/10.0, Minimum Age: " + this.minimumAge + ", Streaming Platform: " + this.streamingPlatform;
    }
}
```

**Expected Output** (when object is created and printed):
```
Default constructor called
Movie: Unknown, Duration: 0 minutes, Genre: Unknown, Rating: 0.0/10.0, Minimum Age: 0, Streaming Platform: Unknown
```

---

### Prompt 2: Getter Methods for All Fields
**Task**: Implement getter methods for all six fields in the Movie class to retrieve the values of private instance variables.

**Expected Code Structure**: Six getter methods following Java naming conventions

**Requirements**:
- Create a public getter method for `title`:
  - Method name: `getTitle()`
  - Return type: String
  - Return: the current value of `this.title`
- Create a public getter method for `duration`:
  - Method name: `getDuration()`
  - Return type: int
  - Return: the current value of `this.duration`
- Create a public getter method for `genre`:
  - Method name: `getGenre()`
  - Return type: String
  - Return: the current value of `this.genre`
- Create a public getter method for `rating`:
  - Method name: `getRating()`
  - Return type: double
  - Return: the current value of `this.rating`
- Create a public getter method for `minimumAge`:
  - Method name: `getMinimumAge()`
  - Return type: int
  - Return: the current value of `this.minimumAge`
- Create a public getter method for `streamingPlatform`:
  - Method name: `getStreamingPlatform()`
  - Return type: String
  - Return: the current value of `this.streamingPlatform`

**Key Points About Getter Methods**:
- Getters provide controlled access to private fields (read-only access)
- Naming convention: `get` + CapitalizedFieldName (e.g., `getTitle`, `getDuration`)
- For boolean fields, use `is` prefix instead of `get` (e.g., `isValid()` instead of `getValid()`)
- Getters allow the class to protect internal state while providing read access
- All getters use "this" to refer to instance variables
- Getters have no parameters (they don't modify state)
- Getters return a value (return type is not void)
- They enable data encapsulation - internal implementation can change without affecting clients
- Getters can perform additional logic (though simple ones usually just return the value)

**Exact Code to Implement**:
```java
    // Getter for title
    public String getTitle() {
        return this.title;
    }

    // Getter for duration
    public int getDuration() {
        return this.duration;
    }

    // Getter for genre
    public String getGenre() {
        return this.genre;
    }

    // Getter for rating
    public double getRating() {
        return this.rating;
    }

    // Getter for minimum age
    public int getMinimumAge() {
        return this.minimumAge;
    }

    // Getter for streaming platform
    public String getStreamingPlatform() {
        return this.streamingPlatform;
    }
```

**Usage Example**:
```java
MovieV1 movie = new MovieV1();
System.out.println("Title: " + movie.getTitle());           // Output: Title: Unknown
System.out.println("Duration: " + movie.getDuration());     // Output: Duration: 0
System.out.println("Genre: " + movie.getGenre());           // Output: Genre: Unknown
System.out.println("Rating: " + movie.getRating());         // Output: Rating: 0.0
System.out.println("Minimum Age: " + movie.getMinimumAge()); // Output: Minimum Age: 0
System.out.println("Platform: " + movie.getStreamingPlatform()); // Output: Platform: Unknown
```

---

### Prompt 3: Setter Methods with Validation
**Task**: Implement setter methods for all six fields in the Movie class with appropriate validation logic.

**Expected Code Structure**: Six setter methods with validation conditions for each field

**Requirements**:
- Create a public setter method for `title`:
  - Method name: `setTitle(String title)`
  - Parameter: `title` (String)
  - Validation: If title is null, set `this.title` to "Unknown", otherwise set to the provided value
  - No return value (void)
- Create a public setter method for `duration`:
  - Method name: `setDuration(int duration)`
  - Parameter: `duration` (int)
  - Validation: If duration is less than 0, set `this.duration` to 0, otherwise set to the provided value
  - No return value (void)
- Create a public setter method for `genre`:
  - Method name: `setGenre(String genre)`
  - Parameter: `genre` (String)
  - Validation: If genre is null, set `this.genre` to "Unknown", otherwise set to the provided value
  - No return value (void)
- Create a public setter method for `rating`:
  - Method name: `setRating(double rating)`
  - Parameter: `rating` (double)
  - Validation: If rating is less than 0, set `this.rating` to 0.0; if rating is greater than 10.0, set to 10.0; otherwise set to the provided value
  - No return value (void)
- Create a public setter method for `minimumAge`:
  - Method name: `setMinimumAge(int minimumAge)`
  - Parameter: `minimumAge` (int)
  - Validation: If minimumAge is less than 0, set `this.minimumAge` to 0, otherwise set to the provided value
  - No return value (void)
- Create a public setter method for `streamingPlatform`:
  - Method name: `setStreamingPlatform(String streamingPlatform)`
  - Parameter: `streamingPlatform` (String)
  - Validation: If streamingPlatform is null, set `this.streamingPlatform` to "Unknown", otherwise set to the provided value
  - No return value (void)

**Key Points About Setter Methods**:
- Setters provide controlled write access to private fields
- Naming convention: `set` + CapitalizedFieldName (e.g., `setTitle`, `setDuration`)
- Setters take exactly one parameter (the new value) that matches the field type
- Setters use "this" to refer to the instance variable being modified
- Validation is crucial - setters protect data integrity by ensuring only valid values are assigned
- Types of validation:
  - Null checks for String fields (prevent null pointer exceptions)
  - Range checks for numeric fields (ensure values are within acceptable bounds)
  - Type checking (parameter type matches field type)
- Setters return void (they modify state, don't return values)
- Parameter name typically matches the field name (requires "this" to distinguish)
- Setters enable the class to enforce business rules
- Setters can perform side effects (logging, notifications, etc.)
- Good setters make code more maintainable and prevent invalid states

**Exact Code to Implement**:
```java
    // Setter for title with validation
    public void setTitle(String title) {
        if (title == null) {
            this.title = "Unknown";
        } else {
            this.title = title;
        }
    }

    // Setter for duration with validation
    public void setDuration(int duration) {
        if (duration < 0) { // validation in place
            this.duration = 0;
        } else {
            this.duration = duration;
        }
    }

    // Setter for genre with validation
    public void setGenre(String genre) {
        if (genre == null) {
            this.genre = "Unknown";
        } else {
            this.genre = genre;
        }
    }

    // Setter for rating with validation
    public void setRating(double rating) {
        if (rating < 0) {
            this.rating = 0.0;
        } else if (rating > 10.0) {
            this.rating = 10.0;
        } else {
            this.rating = rating;
        }
    }

    // Setter for minimum age with validation
    public void setMinimumAge(int minimumAge) {
        if (minimumAge < 0) {
            this.minimumAge = 0;
        } else {
            this.minimumAge = minimumAge;
        }
    }

    // Setter for streaming platform with validation
    public void setStreamingPlatform(String streamingPlatform) {
        if (streamingPlatform == null) {
            this.streamingPlatform = "Unknown";
        } else {
            this.streamingPlatform = streamingPlatform;
        }
    }
```

**Usage Example with Validation**:
```java
MovieV1 movie = new MovieV1();

// Setting with valid values
movie.setTitle("The Avengers");
movie.setDuration(150);
movie.setGenre("Action");
movie.setRating(8.5);
movie.setMinimumAge(13);
movie.setStreamingPlatform("Disney+");

// Setting with invalid values - validation kicks in
movie.setDuration(-10);           // Sets to 0 (negative not allowed)
movie.setRating(15.0);            // Sets to 10.0 (max is 10.0)
movie.setMinimumAge(-5);          // Sets to 0 (negative not allowed)
movie.setTitle(null);             // Sets to "Unknown" (null not allowed)
movie.setGenre(null);             // Sets to "Unknown" (null not allowed)

System.out.println(movie);
// Output: Movie: Unknown, Duration: 0 minutes, Genre: Unknown, Rating: 10.0/10.0, Minimum Age: 0, Streaming Platform: Disney+
```

---

## Key Concepts Covered

### 1. The "this" Operator
The "this" keyword is a reference to the current object instance. It serves several purposes:
- **Distinguishes instance variables from parameters/local variables**: When a parameter has the same name as an instance variable, "this" clarifies which one you're referring to
- **Makes code self-documenting**: Using "this" explicitly shows you're working with instance state
- **Required in constructors**: When initializing fields from parameters with the same name
- **Optional but recommended**: Even when not strictly necessary, using "this" is a best practice
- **Scope**: Only available within instance methods and constructors (not in static methods)

Example:
```java
public void setTitle(String title) {
    this.title = title;  // Without "this", this would be ambiguous
}
```

### 2. Private Fields and Encapsulation
- **private keyword**: Restricts access to fields only within the class itself
- **Encapsulation principle**: Hide internal implementation details from external users
- **Protection**: Prevents direct modification of fields from outside the class
- **Single point of control**: All access goes through getters/setters
- **Data integrity**: Validation can be enforced at the setter level
- **Flexibility**: Internal representation can change without affecting the public interface

### 3. Constructors
- **Purpose**: Initialize object state when created with the `new` keyword
- **No-argument constructor**: Also called default constructor, takes no parameters
- **Name requirement**: Constructor name must match the class name exactly
- **Automatic initialization**: Fields are automatically initialized to default values (0, false, null)
- **Custom initialization**: Constructors override defaults with meaningful initial values
- **Multiple constructors**: A class can have multiple constructors (constructor overloading)

### 4. Getter Methods
- **Access control**: Provide read-only access to private fields
- **Naming convention**: `get` + CapitalizedFieldName
- **No parameters**: Getters don't take arguments
- **Return value**: Must return a value matching the field type
- **Logic allowed**: Can include additional logic (calculations, transformations)
- **Encapsulation benefit**: Hide the internal representation from users

### 5. Setter Methods with Validation
- **Write protection**: Allow controlled modification of private fields
- **Naming convention**: `set` + CapitalizedFieldName
- **Validation**: Enforce business rules and data integrity
- **void return**: Setters don't return values, they modify state
- **Single parameter**: Takes one parameter matching the field type
- **Protection level**: Prevent invalid states from being created

## Memory Behavior
- Each object instance has its own copy of instance variables
- The "this" keyword allows each instance to refer to its own variables
- When you create a new Movie object, "this" refers to that specific instance
- Multiple objects can exist simultaneously, each with independent state
- Memory is allocated on the heap, with each object having its own space
- References to objects are stored on the stack, but the actual objects are on the heap

## Common Mistakes to Avoid

### 1. Forgetting "this" keyword in constructors and setters
**Wrong**:
```java
public void setTitle(String title) {
    title = title;  // Assigns parameter to itself, field unchanged!
}
```

**Correct**:
```java
public void setTitle(String title) {
    this.title = title;  // Assigns parameter to instance variable
}
```

### 2. Missing validation in setter methods
**Wrong**:
```java
public void setRating(double rating) {
    this.rating = rating;  // No validation - allows invalid values like 15.0 or -5.0
}
```

**Correct**:
```java
public void setRating(double rating) {
    if (rating < 0) {
        this.rating = 0.0;
    } else if (rating > 10.0) {
        this.rating = 10.0;
    } else {
        this.rating = rating;
    }
}
```

### 3. Not using private for fields
**Wrong**:
```java
public class MovieV1 {
    public String title;  // Anyone can directly modify!
}
```

**Correct**:
```java
public class MovieV1 {
    private String title;  // Only accessible through getters/setters
}
```

### 4. Inconsistent naming conventions
**Wrong**:
```java
public String gettitle() { }        // Inconsistent capitalization
public void SetTitle(String t) { }  // Inconsistent parameter naming
public String title() { }           // Missing get prefix
```

**Correct**:
```java
public String getTitle() { }
public void setTitle(String title) { }
```

## Running the Code
To test the complete MovieV1 class implementation, create a test class:

```java
public class MovieV1Test {
    public static void main(String[] args) {
        // Test 1: Create object with no-argument constructor
        System.out.println("=== Test 1: Default Constructor ===");
        MovieV1 movie1 = new MovieV1();
        System.out.println(movie1);
        System.out.println();

        // Test 2: Use setters to modify values
        System.out.println("=== Test 2: Using Setters ===");
        movie1.setTitle("Inception");
        movie1.setDuration(148);
        movie1.setGenre("Sci-Fi");
        movie1.setRating(8.8);
        movie1.setMinimumAge(13);
        movie1.setStreamingPlatform("Netflix");
        System.out.println(movie1);
        System.out.println();

        // Test 3: Use getters to retrieve values
        System.out.println("=== Test 3: Using Getters ===");
        System.out.println("Title: " + movie1.getTitle());
        System.out.println("Duration: " + movie1.getDuration() + " minutes");
        System.out.println("Genre: " + movie1.getGenre());
        System.out.println("Rating: " + movie1.getRating());
        System.out.println("Minimum Age: " + movie1.getMinimumAge());
        System.out.println("Platform: " + movie1.getStreamingPlatform());
        System.out.println();

        // Test 4: Validation with invalid values
        System.out.println("=== Test 4: Validation Testing ===");
        movie1.setDuration(-50);
        System.out.println("After setting duration to -50: " + movie1.getDuration());
        
        movie1.setRating(12.5);
        System.out.println("After setting rating to 12.5: " + movie1.getRating());
        
        movie1.setTitle(null);
        System.out.println("After setting title to null: " + movie1.getTitle());
        
        System.out.println();
        System.out.println("Final object state:");
        System.out.println(movie1);
    }
}
```

## Expected Output
```
=== Test 1: Default Constructor ===
Default constructor called
Movie: Unknown, Duration: 0 minutes, Genre: Unknown, Rating: 0.0/10.0, Minimum Age: 0, Streaming Platform: Unknown

=== Test 2: Using Setters ===
Movie: Inception, Duration: 148 minutes, Genre: Sci-Fi, Rating: 8.8/10.0, Minimum Age: 13, Streaming Platform: Netflix

=== Test 3: Using Getters ===
Title: Inception
Duration: 148 minutes
Genre: Sci-Fi
Rating: 8.8
Minimum Age: 13
Platform: Netflix

=== Test 4: Validation Testing ===
After setting duration to -50: 0
After setting rating to 12.5: 10.0
After setting title to null: Unknown

Final object state:
Movie: Unknown, Duration: 0 minutes, Genre: Unknown, Rating: 0.0/10.0, Minimum Age: 0, Streaming Platform: Unknown
```

## Next Steps
1. Implement all three prompts to create a complete MovieV1 class
2. Create a test class to verify all methods work correctly
3. Experiment with different values to understand validation
4. Modify the class to add new fields and corresponding getters/setters
5. Create a parameterized constructor that accepts all fields as parameters
6. Add additional methods like `canWatchMovie(int age)` that use instance variables

## Summary
The MovieV1 class demonstrates fundamental object-oriented programming concepts:
- **Encapsulation**: Private fields with public getters/setters
- **Data Integrity**: Validation in setters ensures only valid states
- **Code Organization**: Clear separation of concerns (fields, constructors, getters, setters)
- **The "this" Operator**: Essential for distinguishing instance variables from parameters
- **Best Practices**: Following naming conventions and validation patterns
- **Reusability**: The class can be instantiated multiple times with independent state
- **Maintainability**: Changes to internal representation don't affect external users

Understanding the "this" operator is crucial for mastering Java's object-oriented paradigm!

