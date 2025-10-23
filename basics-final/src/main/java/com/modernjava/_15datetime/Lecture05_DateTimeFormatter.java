package com.modernjava._15datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Lecture 05: DateTimeFormatter
 * - Formatting and parsing LocalDate, LocalTime, LocalDateTime
 */
public class Lecture05_DateTimeFormatter {
    public static void main(String[] args) {
        // Format LocalDate
        LocalDate date = LocalDate.of(2025, 9, 29);
        DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(dateFmt);
        System.out.println("Formatted LocalDate: " + formattedDate);

        // Parse LocalTime
        String timeStr = "14:45:30";
        LocalTime time = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Parsed LocalTime: " + time);

        // Format LocalDateTime
        LocalDateTime ldt = LocalDateTime.of(2025, 9, 29, 16, 20, 45);
        DateTimeFormatter ldtFmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedLdt = ldt.format(ldtFmt);
        System.out.println("Formatted LocalDateTime: " + formattedLdt);
    }
}

