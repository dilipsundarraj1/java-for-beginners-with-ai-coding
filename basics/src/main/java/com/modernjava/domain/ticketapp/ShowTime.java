package com.modernjava.domain.ticketapp;

import com.modernjava.domain.Movie;

public record ShowTime(
        String date,
        String time,
        Screen screen,
        Movie movie
) {}