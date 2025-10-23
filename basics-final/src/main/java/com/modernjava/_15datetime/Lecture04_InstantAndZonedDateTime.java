package com.modernjava._15datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Lecture 04: Instant & ZonedDateTime
 * - Instant: timestamps, conversion
 * - ZonedDateTime: time zones, conversion
 */
public class Lecture04_InstantAndZonedDateTime {
    public static void main(String[] args) {
        // Instant example
        Instant now = Instant.now();
        System.out.println("Current Instant: " + now);
        LocalDateTime ldt = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
        System.out.println("LocalDateTime from Instant: " + ldt);

        // ZonedDateTime example
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("ZonedDateTime (Asia/Kolkata): " + zdt);
    }
}

