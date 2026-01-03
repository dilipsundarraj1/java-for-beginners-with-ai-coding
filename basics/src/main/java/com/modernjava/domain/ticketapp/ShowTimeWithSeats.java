package com.modernjava.domain.ticketapp;

import com.modernjava.domain.Movie;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public record ShowTimeWithSeats(
    LocalDate date,
    LocalTime time,
    Screen screen,
    Movie movie,
    List<Seat> seats
) {}