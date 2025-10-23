package com.modernjava.domain.ticketapp;

public record Screen(
    String name,
    int totalSeats,
    Theatre theatre
) {}