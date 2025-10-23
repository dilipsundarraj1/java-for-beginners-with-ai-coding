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

    // Parameterized constructor with validation
    public MovieV1(String title, int duration, String genre, double rating, int minimumAge, String streamingPlatform) {
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
    public String getGenre() {
        return genre;
    }

    // Setter for genre with validation
    public void setGenre(String genre) {
        if (genre == null) {
            this.genre = "Unknown";
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

    // toString method for easy printing
    @Override
    public String toString() {
        return "Movie: " + title + ", Duration: " + duration + " minutes, Genre: " + genre + ", Rating: " + rating + "/10.0, Minimum Age: " + minimumAge + ", Streaming Platform: " + streamingPlatform;
    }
}
