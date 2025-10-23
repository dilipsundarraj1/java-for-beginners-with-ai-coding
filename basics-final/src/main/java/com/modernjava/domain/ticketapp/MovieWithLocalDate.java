package com.modernjava.domain.ticketapp;

import com.modernjava.domain.MovieGenre;

import java.time.LocalDate;

/**
 * MovieWithLocalDate Record - Simple record to represent a movie with a LocalDate release date.
 */
public record MovieWithLocalDate(
    String title,
    int duration,
    MovieGenre genre,
    double rating,
    int releaseYear,
    String director,
    boolean isAvailable,
    LocalDate releaseDate // LocalDate representing the release date
) {}

