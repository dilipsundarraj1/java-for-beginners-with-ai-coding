package com.modernjava._3classandobjects;

/**
 * Simple demo class explaining object equality and toString() method behavior
 * using Movie objects without any collections.
 */
public class MovieDemoObjectEquality {
    public static void main(String[] args) {
        System.out.println("=== Movie Object Equality Demo ===\n");

        // Create movie objects for testing
        Movie movie1 = new Movie("The Matrix", 136, "Sci-Fi", 8.7, 13, MovieUtils.streamingPlatform_netflix);
        Movie movie2 = new Movie("The Matrix", 136, "Sci-Fi", 8.7, 13, MovieUtils.streamingPlatform_netflix);
        Movie movie3 = movie1; // Same reference

        // ============= toString() Method Demo =============
        System.out.println("1. toString() Method:");
        System.out.println("Default toString() shows: ClassName@HashCode");
        System.out.println();

        System.out.println("movie1: " + movie1);
        System.out.println("movie2: " + movie2);
        System.out.println("movie3: " + movie3);
        System.out.println();

        System.out.println("Notice: movie1 and movie2 have different hash codes");
        System.out.println("        movie1 and movie3 have the same hash code (same object)");
        System.out.println();

        // ============= equals() Method Demo =============
        System.out.println("2. equals() Method:");
        System.out.println("Default equals() compares memory references, not content");
        System.out.println();

        // Same reference test
        System.out.println("Same Reference Test:");
        System.out.println("movie1 == movie3: " + (movie1 == movie3));
        System.out.println("movie1.equals(movie3): " + movie1.equals(movie3));
        System.out.println();

        // Same content, different objects test
        System.out.println("Same Content, Different Objects Test:");
        System.out.println("movie1 == movie2: " + (movie1 == movie2));
        System.out.println("movie1.equals(movie2): " + movie1.equals(movie2));
        System.out.println();

        // ============= Manual Content Comparison =============
        System.out.println("3. Manual Content Comparison:");
        System.out.println("Let's check if movie1 and movie2 have the same content:");
        System.out.println();

        boolean sameTitle = movie1.title.equals(movie2.title);
        boolean sameDuration = movie1.duration == movie2.duration;
        boolean sameGenre = movie1.genre.equals(movie2.genre);
        boolean sameRating = movie1.rating == movie2.rating;
        boolean sameMinAge = movie1.minimumAge == movie2.minimumAge;

        System.out.println("Title same: " + sameTitle + " ('" + movie1.title + "' vs '" + movie2.title + "')");
        System.out.println("Duration same: " + sameDuration + " (" + movie1.duration + " vs " + movie2.duration + ")");
        System.out.println("Genre same: " + sameGenre + " ('" + movie1.genre + "' vs '" + movie2.genre + "')");
        System.out.println("Rating same: " + sameRating + " (" + movie1.rating + " vs " + movie2.rating + ")");
        System.out.println("MinAge same: " + sameMinAge + " (" + movie1.minimumAge + " vs " + movie2.minimumAge + ")");
        System.out.println();

        boolean contentEqual = sameTitle && sameDuration && sameGenre && sameRating && sameMinAge;
        System.out.println("Content is identical: " + contentEqual);
        System.out.println("But equals() returned: " + movie1.equals(movie2));
        System.out.println();

        // ============= The Problem =============
        System.out.println("4. The Problem:");
        System.out.println("- toString() doesn't show useful information");
        System.out.println("- equals() doesn't compare content, only memory references");
        System.out.println("- Two movies with identical data are not considered 'equal'");
        System.out.println();

        // ============= Different Objects Demo =============
        System.out.println("5. Different Content Test:");
        Movie movie4 = new Movie("Inception", 148, "Thriller", 8.8, 13, "Amazon Prime");
        System.out.println("movie1: " + movie1);
        System.out.println("movie4: " + movie4);
        System.out.println("movie1.equals(movie4): " + movie1.equals(movie4));
        System.out.println("This correctly returns false (different content)");
        System.out.println();

        // ============= Solution Explanation =============
        System.out.println("6. What We Need:");
        System.out.println("Custom toString(): Should show meaningful movie information");
        System.out.println("Custom equals(): Should compare all field values");
        System.out.println();
        System.out.println("Example of what toString() should return:");
        System.out.println("'Movie: The Matrix, Duration: 2h 16m, Genre: Sci-Fi, Rating: 8.7/10.0, Age: 13+'");
    }
}
