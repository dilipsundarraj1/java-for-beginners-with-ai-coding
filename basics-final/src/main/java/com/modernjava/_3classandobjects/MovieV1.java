package com.modernjava._3classandobjects;

import java.util.Objects;

public class MovieV1 extends Object {

    private String title;
    private int duration; // in minutes
    private String genre;
    private double rating; // out of 10.0
    private int minimumAge; // minimum age requirement
    //streamingPlatform

    public MovieV1() {
        //super();
        System.out.println("MovieV1 Default Constructor called");
        this.title = "Unknown";
        this.duration = 0;
        this.genre = "Unknown";
        this.rating = 0.0;
        this.minimumAge = 0;
    }

    public MovieV1(String title, int duration, String genre, double rating, int minimumAge) {
        // super(title, duration, genre, rating);
        // Validate title
        if (title == null || title.isEmpty()) {
            this.title = "Unknown";
        } else {
            this.title = title;
        }

        // Validate duration
        if (duration < 0) {
            this.duration = 0;
        } else {
            this.duration = duration;
        }

        // Validate genre
        if (genre == null || genre.isEmpty()) {
            this.genre = "Unknown";
        } else {
            this.genre = genre;
        }

        // Validate rating
        if (rating < 0.0 || rating > 10.0) {
            this.rating = 0.0;
        } else {
            this.rating = rating;
        }

        // Validate minimumAge
        if (minimumAge < 0) {
            this.minimumAge = 0;
        } else {
            this.minimumAge = minimumAge;
        }
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getGenre() {
        return this.genre;
    }

    public double getRating() {
        return this.rating;
    }

    public int getMinimumAge() {
        return this.minimumAge;
    }

    public static String trimTitle(String title) {
        if(title == null){
            return "Unknown";
        }
        //this.title
        return title.trim();
    }

    public static String trimTitle(String title, String title1) {
        if(title == null){
            return "Unknown";
        }
        return title.trim();
    }

    // Setters
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            this.title = "Unknown";
        } else {
            this.title = title;
        }
    }

    public void setDuration(int duration) {
        if (duration < 0) {
            this.duration = 0;
        } else {
            this.duration = duration;
        }
    }

    public void setGenre(String genre) {
        if (genre == null || genre.isEmpty()) {
            this.genre = "Unknown";
        } else {
            this.genre = genre;
        }
    }

    public void setRating(double rating) {
        if (rating < 0.0 || rating > 10.0) {
            this.rating = 0.0;
        } else {
            this.rating = rating;
        }
    }

    public void setMinimumAge(int minimumAge) {
        if (minimumAge < 0) {
            this.minimumAge = 0;
        } else {
            this.minimumAge = minimumAge;
        }
    }

    // Methods from parent class
    public void printMovie() {
        System.out.println("Movie: " + this.title +
                ", Duration: " + this.duration +
                " minutes, Genre: " + this.genre +
                ", Rating: " + this.rating + "/10.0" +
                ", Minimum Age: " + this.minimumAge);
    }

    public String formattedDuration() {
        if (this.duration < 0) {
            return "Invalid duration";
        }
        int hours = this.duration / 60;
        int mins = this.duration % 60;
        String result = "";
        if (hours > 0) {
            result = hours + "h ";
        }
        result += mins + "m";
        return result;
    }

    @Override
    public String toString() {
        return "MovieV1{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", minimumAge=" + minimumAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MovieV1 movieV1)) return false;
        return getDuration() == movieV1.getDuration() &&
//                Double.compare(getRating(), movieV1.getRating()) == 0 &&
                getMinimumAge() == movieV1.getMinimumAge() &&
                Objects.equals(getTitle(), movieV1.getTitle());
//                &&
//                Objects.equals(getGenre(), movieV1.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDuration(), getGenre(), getRating(), getMinimumAge());
    }
}

