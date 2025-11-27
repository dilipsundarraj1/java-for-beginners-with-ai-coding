package com.modernjava._3classandobjects;

public record MovieRecord(
    String title,
    int duration, // in minutes
    MovieGenreEnum genre,
    double rating, // out of 10.0
    int minimumAge, // minimum age requirement
    String streamingPlatform
) {
    // Compact constructor with validation
    public MovieRecord {
        // Validate title
        if (title == null || title.isEmpty()) {
            title = "Unknown";
        }

        // Validate duration
        if (duration < 0) {
            duration = 0;
        }

        // Validate genre
        if (genre == null) {
            genre = MovieGenreEnum.ACTION;
        }

        // Validate rating
        if (rating < 0.0 || rating > 10.0) {
            rating = 0.0;
        }

        // Validate minimumAge
        if (minimumAge < 0) {
            minimumAge = 0;
        }

        // Validate streamingPlatform
        if (streamingPlatform == null || streamingPlatform.isEmpty()) {
            streamingPlatform = "Unknown";
        }
    }

    // Method to create a new MovieRecord with updated rating
    public MovieRecord withRating(double newRating) {
        return new MovieRecord(
                this.title,
                this.duration,
                this.genre,
                newRating,
                this.minimumAge,
                this.streamingPlatform
        );
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

}
