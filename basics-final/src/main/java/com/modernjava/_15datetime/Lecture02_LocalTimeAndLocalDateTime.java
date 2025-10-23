package com.modernjava._15datetime;

import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.LocalDate;

/**
 * Lecture 02: LocalTime & LocalDateTime
 * - LocalTime creation, retrieval
 * - LocalDateTime creation, modification
 * - Conversion: LocalDate/LocalTime to LocalDateTime
 */
public class Lecture02_LocalTimeAndLocalDateTime {
    public static void main(String[] args) {
        // LocalTime example
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        // LocalDateTime example
        LocalDateTime meeting = LocalDateTime.of(2025, 9, 29, 14, 30);
        System.out.println("Meeting: " + meeting);

        // Conversion: LocalDate + LocalTime -> LocalDateTime
        LocalDate date = LocalDate.of(2025, 9, 29);
        LocalTime time = LocalTime.of(10, 15);
        LocalDateTime combined = LocalDateTime.of(date, time);
        System.out.println("Combined LocalDateTime: " + combined);
    }
}

