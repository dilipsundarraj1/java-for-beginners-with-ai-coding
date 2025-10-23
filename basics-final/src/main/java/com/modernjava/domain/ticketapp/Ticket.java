package com.modernjava.domain.ticketapp;

public record Ticket(
    String ticketId,
    ShowTimeV2 showTime,
    int seatNumber,
    double price,
    boolean isBooked
) {}