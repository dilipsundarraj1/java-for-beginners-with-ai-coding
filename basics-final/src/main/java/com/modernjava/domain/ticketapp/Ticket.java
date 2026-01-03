package com.modernjava.domain.ticketapp;

public record Ticket(
    String ticketId,
    ShowTimeWithSeats showTime,
    int seatNumber,
    double price,
    boolean isBooked
) {}