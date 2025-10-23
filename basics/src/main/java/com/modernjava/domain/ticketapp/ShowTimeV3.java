package com.modernjava.domain.ticketapp;

import com.modernjava.domain.Movie;

import java.time.Duration;
import java.time.LocalDateTime;

public record ShowTimeV3(
        LocalDateTime showDateTime,
        Screen screen,
        Movie movie,
        Duration duration // Adding actual movie duration instead of assuming 3 hours
) {
    /**
     * Creates a ShowTime with validation
     */
    public ShowTimeV3 {
        if (showDateTime == null) {
            throw new IllegalArgumentException("Show date time cannot be null");
        }
        if (screen == null) {
            throw new IllegalArgumentException("Screen cannot be null");
        }
        if (movie == null) {
            throw new IllegalArgumentException("Movie cannot be null");
        }
        if (duration == null) {
            // Default to 2 hours if duration not specified
            duration = Duration.ofHours(2);
        }
    }
}
