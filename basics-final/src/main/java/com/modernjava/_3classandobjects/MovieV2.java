package com.modernjava._3classandobjects;

public class MovieV2 {
    // Private fields for encapsulation
    private String title;
    private int duration; // in minutes
    private MovieGenreEnum genre; // Using enum instead of String
    private double rating; // out of 10.0
    private int minimumAge; // minimum age requirement for the movie
    private String streamingPlatform; // streaming platform where movie is available

    // No-Argument constructor
    public MovieV2() {
        System.out.println("Default constructor called");
        this.title = "Unknown";
        this.duration = 0;
        this.genre = MovieGenreEnum.DRAMA; // Default genre
        this.rating = 0.0;
        this.minimumAge = 0;
        this.streamingPlatform = "Unknown";
    }

    // Parameterized constructor with validation
    public MovieV2(String title, int duration, MovieGenreEnum genre, double rating, int minimumAge, String streamingPlatform) {
        setTitle(title);
        setDuration(duration);
        setGenre(genre);
        setRating(rating);
        setMinimumAge(minimumAge);
        setStreamingPlatform(streamingPlatform);
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title with validation
    public void setTitle(String title) {
        if (title == null) {
            this.title = "Unknown";
        } else {
            this.title = title;
        }
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Setter for duration with validation
    public void setDuration(int duration) {
        if (duration < 0) { // validation in place
            this.duration = 0;
        } else {
            this.duration = duration;
        }
    }

    // Getter for genre
    public MovieGenreEnum getGenre() {
        return genre;
    }

    // Setter for genre with validation
    public void setGenre(MovieGenreEnum genre) {
        if (genre == null) {
            this.genre = MovieGenreEnum.DRAMA; // Default to DRAMA if null
        } else {
            this.genre = genre;
        }
    }

    // Getter for rating
    public double getRating() {
        return rating;
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

    // Getter for minimum age
    public int getMinimumAge() {
        return minimumAge;
    }

    // Setter for minimum age with validation
    public void setMinimumAge(int minimumAge) {
        if (minimumAge < 0) {
            this.minimumAge = 0;
        } else {
            this.minimumAge = minimumAge;
        }
    }

    // Getter for streaming platform
    public String getStreamingPlatform() {
        return streamingPlatform;
    }

    // Setter for streaming platform with validation
    public void setStreamingPlatform(String streamingPlatform) {
        if (streamingPlatform == null) {
            this.streamingPlatform = "Unknown";
        } else {
            this.streamingPlatform = streamingPlatform;
        }
    }

    public static String trimTitle(String title) {
        if (title == null) {
            return "Unknown";
        }

        return title.trim();
    }

    public static String trimTitle(String title, String title2) {
        if (title == null) {
            return "Unknown";
        }

        return title.trim();
    }

    public void printMovie(MovieV2 movie){
        System.out.println("Movie Details are : " + movie.getTitle() + ", Duration: " + movie.formattedDuration() + ", Genre: " + movie.getGenre() + ", Rating: " + movie.getRating() + "/10.0, Minimum Age: " + movie.getMinimumAge());
    }

    public void printMovie(){
        System.out.println("Movie Details are : " + this.getTitle() + ", Duration: " + this.formattedDuration() + ", Genre: " + this.getGenre() + ", Rating: " + this.getRating() + "/10.0, Minimum Age: " + this.getMinimumAge());
    }

    public String formattedDuration() {
        int hours = duration / 60;
        int minutes = duration % 60;

        return formattedDuration(hours, minutes);
    }

    // Overloaded method that accepts hours and minutes as parameters
    public String formattedDuration(int hours, int minutes) {
        String result = "";
        if (hours > 0) {
            result = hours + "h ";
        }
        result = result + minutes + "m";
        return result;
    }

    // Simple toString implementation
    @Override
    public String toString() {
        return "Movie: " + title + ", Duration: " + duration + " minutes, Genre: " + genre
                + ", Rating: " + rating + "/10.0, Minimum Age: " + minimumAge + ", Streaming Platform: " + streamingPlatform;
    }

    // Simple equals implementation
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof MovieV2)) return false;

        MovieV2 other = (MovieV2) obj;
        return title.equals(other.title) &&
               duration == other.duration &&
               genre == other.genre && // Enum comparison using ==
               rating == other.rating &&
               minimumAge == other.minimumAge;
    }

   public void displayMovie() {
        // Local variable
        String movieName = "Inception";
        int duration = 120; // in minutes
        System.out.println("Movie: " + movieName + ", Duration: " + duration + " mins");
    }
}
