package com.modernjava.domain;

/**
 * Movie genres enumeration for Collections demonstrations
 */
public enum MovieGenre {
    ACTION("Action"),
    COMEDY("Comedy"),
    DRAMA("Drama"),
    HORROR("Horror"),
    ROMANCE("Romance"),
    THRILLER("Thriller"),
    SCI_FI("Science Fiction"),
    DOCUMENTARY("Documentary"),
    ANIMATION("Animation"),
    FANTASY("Fantasy");

    private final String displayName;

    MovieGenre(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
