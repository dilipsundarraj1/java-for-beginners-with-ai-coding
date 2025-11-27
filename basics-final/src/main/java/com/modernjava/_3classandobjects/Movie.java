package com.modernjava._3classandobjects;

public class Movie {

    String title;

    int duration; // in minutes // 0

    String genre; // null

    double rating; // out of 10.0 // 0.0

    public Movie(){
        System.out.println("Default Constructor called");
        this.title = "Unknown";
        this.duration = 0;
        this.genre = "Unknown";
        this.rating = 0.0;
    }

    public Movie(String title, int duration, String genre, double rating) {
        // Validate title
        if(title == null || title.isEmpty()){
            this.title = "Unknown";
        } else {
            this.title = title;
        }

        // Validate duration
        if(duration < 0){
            this.duration = 0;
        } else {
            this.duration = duration;
        }

        // Validate genre
        if(genre == null || genre.isEmpty()){
            this.genre = "Unknown";
        } else {
            this.genre = genre;
        }

        // Validate rating
        if(rating < 0.0 || rating > 10.0){
            this.rating = 0.0;
        } else {
            this.rating = rating;
        }
    }

    public void printMovie(){
        System.out.println("Movie: " + this.title +
                ", Duration: " + this.duration +
                " minutes, Genre: " + this.genre +
                ", Rating: " + this.rating + "/10.0");
    }

    public void printMovie(Movie movie){
        System.out.println("Movie: " + movie.title +
                ", Duration: " + movie.duration +
                " minutes, Genre: " + movie.genre +
                ", Rating: " + movie.rating + "/10.0");
    }

    public String formattedDuration() {
        if (this.duration < 0) {
            return "Invalid duration";
        }
        int hours = this.duration / 60;
        int mins = this.duration % 60;
        String result = "";
        if (hours >  0) {
            result = hours + "h ";
        }
        result += mins + "m"; // result = result + mins + "m";
        return result;

    }

    public String formattedDuration(int minutes) {
        if (minutes < 0) {
            return "Invalid duration";
        }
        int hours = minutes / 60;
        int mins = minutes % 60;
        String result = "";
        if (hours >  0) {
            result = hours + "h ";
        }
        result += mins + "m"; // result = result + mins + "m";
        return result;

    }


}
