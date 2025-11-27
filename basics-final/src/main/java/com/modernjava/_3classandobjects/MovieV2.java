package com.modernjava._3classandobjects;

import java.util.Objects;

public class MovieV2 {

    private String title;
    private int duration; // in minutes
    private MovieGenreEnum genre;
    private double rating; // out of 10.0
    private int minimumAge; // minimum age requirement
    private String streamingPlatform;

    public MovieV2() {
        //super();
        System.out.println("MovieV2 Default Constructor called");
        this.title = "Unknown";
        this.duration = 0;
        this.genre = MovieGenreEnum.ACTION;
        this.rating = 0.0;
        this.minimumAge = 0;
        this.streamingPlatform = "Unknown";
    }

    public MovieV2(String title, int duration, MovieGenreEnum genre, double rating, int minimumAge, String streamingPlatform) {
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
        if (genre == null) {
            this.genre = MovieGenreEnum.ACTION;
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

        // Validate streamingPlatform
        if (streamingPlatform == null || streamingPlatform.isEmpty()) {
            this.streamingPlatform = "Unknown";
        } else {
            this.streamingPlatform = streamingPlatform;
        }
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }

    public MovieGenreEnum getGenre() {
        return this.genre;
    }

    public double getRating() {
        return this.rating;
    }

    public int getMinimumAge() {
        return this.minimumAge;
    }

    public String getStreamingPlatform() {
        return this.streamingPlatform;
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

    public void setGenre(MovieGenreEnum genre) {
        if (genre == null) {
            this.genre = MovieGenreEnum.ACTION;
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

    public void setStreamingPlatform(String streamingPlatform) {
        if (streamingPlatform == null || streamingPlatform.isEmpty()) {
            this.streamingPlatform = "Unknown";
        } else {
            this.streamingPlatform = streamingPlatform;
        }
    }

    // Methods from parent class
    public void printMovie() {
        System.out.println("Movie: " + this.title +
                ", Duration: " + this.duration +
                " minutes, Genre: " + this.genre +
                ", Rating: " + this.rating + "/10.0" +
                ", Minimum Age: " + this.minimumAge +
                ", Streaming Platform: " + this.streamingPlatform);
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
        return "MovieV2{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", minimumAge=" + minimumAge +
                ", streamingPlatform='" + streamingPlatform + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MovieV2 movieV2)) return false;
        return getDuration() == movieV2.getDuration() &&
//                Double.compare(getRating(), movieV2.getRating()) == 0 &&
                getMinimumAge() == movieV2.getMinimumAge() &&
                Objects.equals(getTitle(), movieV2.getTitle()) &&
                Objects.equals(getStreamingPlatform(), movieV2.getStreamingPlatform());
//                &&
//                Objects.equals(getGenre(), movieV2.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDuration(), getGenre(), getRating(), getMinimumAge(), getStreamingPlatform());
    }
}

