package com.modernjava._3classandobjects;

public class Movie extends Object {
    String title;
    int duration; // in minutes
    String genre;
    double rating; // out of 10.0
    int minimumAge; // minimum age requirement for the movie
    String streamingPlatform; // streaming platform where movie is available

    // No-Argument constructor
    public Movie() {
        System.out.println("Default constructor called");
        this.minimumAge = 0;
        this.streamingPlatform = "Unknown";
    }

    //Parameterized constructor
//    public Movie(String title, int duration, String genre, double rating) {
//        this.title = title;
//        this.duration = duration;
//        this.genre = genre;
//        this.rating = rating;
//    }
//}

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

    public void printMovie(Movie movie){
//        System.out.println("Movie: " + movie.title + ", Duration: " + movie.formattedDuration() + ", Genre: " + movie.genre + ", Rating: " + movie.rating + "/10.0");
        System.out.println("Movie Details are : " + movie.title + ", Duration: " + movie.formattedDuration() + ", Genre: " + movie.genre + ", Rating: " + movie.rating + "/10.0, Minimum Age: " + movie.minimumAge);
    }

    public void printMovie(){
//        System.out.println("Movie: " + movie.title + ", Duration: " + movie.formattedDuration() + ", Genre: " + movie.genre + ", Rating: " + movie.rating + "/10.0");
        System.out.println("Movie Details are : " + this.title + ", Duration: " + this.formattedDuration() + ", Genre: " + this.genre + ", Rating: " + this.rating + "/10.0, Minimum Age: " + this.minimumAge);
    }

    // Parameterized constructor with validation
    public Movie(String title, int duration, String genre, double rating, int minimumAge, String streamingPlatform) {
        if (title == null) {
            this.title = "Unknown";
        } else {
            this.title = title;
        }

        if (duration < 0) {
            this.duration = 0;
        } else {
            this.duration = duration;
        }

        if (genre == null) {
            this.genre = "Unknown";
        } else {
            this.genre = genre;
        }

        if (rating < 0) {
            this.rating = 0.0;
        } else {
            this.rating = rating;
        }

        if (minimumAge < 0) {
            this.minimumAge = 0;
        } else {
            this.minimumAge = minimumAge;
        }

        if (streamingPlatform == null) {
            this.streamingPlatform = "Unknown";
        } else {
            this.streamingPlatform = streamingPlatform;
        }
    }

    public String formattedDuration() {
        int hours = duration / 60;
        int minutes = duration % 60;

//        String result = "";
//        if (hours > 0) {
//            result = hours + "h ";
//        }
//        result = result + minutes + "m";
//        return result;
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
                + ", Rating: " + rating + "/10.0, Minimum Age: " + minimumAge;
    }

    // Simple equals implementation
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Movie)) return false;

        Movie other = (Movie) obj;
        return title.equals(other.title) &&
               duration == other.duration &&
               genre.equals(other.genre) &&
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
