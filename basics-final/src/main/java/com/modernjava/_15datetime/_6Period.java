package com.modernjava._15datetime;

import java.time.LocalDate;
import java.time.Period;

/**
 * Demonstrates Period class concepts with simple examples
 * Period represents a date-based amount of time (years, months, days)
 * It's used for date arithmetic and calculating differences between dates
 */
public class _6Period {

    public static void main(String[] args) {
        System.out.println("=== Java Period Examples ===\n");

        // Example 1: Creating periods in different ways
        createPeriodExamples();

        // Example 2: Calculating age using Period
        calculateAgeExample();

        // Example 3: Adding/Subtracting periods from dates
        dateArithmeticExample();

        // Example 4: Period between two dates
        periodBetweenDatesExample();

        // Example 5: Using ISO 8601 Period strings
        iso8601PeriodExample();
    }

    /**
     * Demonstrates different ways to create Period objects
     */
    private static void createPeriodExamples() {
        System.out.println("1. Creating Periods:");

        // Create periods using static factory methods
        Period oneYear = Period.ofYears(1);
        Period threeMonths = Period.ofMonths(3);
        Period tenDays = Period.ofDays(10);
        Period combined = Period.of(2, 6, 15); // 2 years, 6 months, 15 days

        System.out.println("One year: " + oneYear);
        System.out.println("Three months: " + threeMonths);
        System.out.println("Ten days: " + tenDays);
        System.out.println("Combined (2y 6m 15d): " + combined);
        System.out.println();
    }

    /**
     * Demonstrates calculating age using Period
     */
    private static void calculateAgeExample() {
        System.out.println("2. Calculating Age:");

        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Birth date: " + birthDate);
        System.out.println("Current date: " + currentDate);
        System.out.println("Age: " + age.getYears() + " years, " +
                          age.getMonths() + " months, " +
                          age.getDays() + " days");
        System.out.println("Age as Period: " + age);
        System.out.println();
    }

    /**
     * Demonstrates adding and subtracting periods from dates
     */
    private static void dateArithmeticExample() {
        System.out.println("3. Date Arithmetic with Periods:");

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        Period projectDuration = Period.of(1, 3, 10); // 1 year, 3 months, 10 days

        LocalDate endDate = startDate.plus(projectDuration);
        LocalDate halfwayDate = startDate.plus(Period.ofMonths(6));

        System.out.println("Project start date: " + startDate);
        System.out.println("Project duration: " + projectDuration);
        System.out.println("Project end date: " + endDate);
        System.out.println("Halfway point: " + halfwayDate);

        // Subtracting periods
        LocalDate reviewDate = endDate.minus(Period.ofWeeks(2)); // 2 weeks before end
        System.out.println("Review date (2 weeks before end): " + reviewDate);
        System.out.println();
    }

    /**
     * Demonstrates calculating period between two specific dates
     */
    private static void periodBetweenDatesExample() {
        System.out.println("4. Period Between Dates:");

        LocalDate startDate = LocalDate.of(2023, 3, 15);
        LocalDate endDate = LocalDate.of(2024, 8, 22);

        Period difference = Period.between(startDate, endDate);

        System.out.println("Start date: " + startDate);
        System.out.println("End date: " + endDate);
        System.out.println("Difference: " + difference);
        System.out.println("Time elapsed: " + difference.getYears() + " years, " +
                          difference.getMonths() + " months, " +
                          difference.getDays() + " days");

        // Real-world example: Employment duration
        LocalDate hireDate = LocalDate.of(2020, 9, 1);
        LocalDate currentDate = LocalDate.now();
        Period employment = Period.between(hireDate, currentDate);

        System.out.println("\nEmployment Example:");
        System.out.println("Hire date: " + hireDate);
        System.out.println("Current date: " + currentDate);
        System.out.println("Employment duration: " + employment);
        System.out.println();
    }

    /**
     * Demonstrates using ISO 8601 Period strings like "P2Y6M15D"
     * P = Period
     * Y = Years
     * M = Months
     * D = Days
     */
    private static void iso8601PeriodExample() {
        System.out.println("5. ISO 8601 Period Strings:");

        // Parse period strings using Period.parse()
        Period period1 = Period.parse("P2Y6M15D");  // 2 years, 6 months, 15 days
        Period period2 = Period.parse("P1Y");       // 1 year
        Period period3 = Period.parse("P6M");       // 6 months
        Period period4 = Period.parse("P30D");      // 30 days
        Period period5 = Period.parse("P1Y2M3D");   // 1 year, 2 months, 3 days

        System.out.println("Parsing 'P2Y6M15D': " + period1);
        System.out.println("Parsing 'P1Y': " + period2);
        System.out.println("Parsing 'P6M': " + period3);
        System.out.println("Parsing 'P30D': " + period4);
        System.out.println("Parsing 'P1Y2M3D': " + period5);

        // Converting Period back to string format
        Period customPeriod = Period.of(5, 8, 12);
        String periodString = customPeriod.toString();
        System.out.println("Period.of(5, 8, 12) as string: " + periodString);

        // Real-world example: Project timeline
        System.out.println("\nReal-world example:");
        LocalDate projectStart = LocalDate.of(2024, 1, 15);
        Period projectDuration = Period.parse("P2Y6M15D");  // Your example
        LocalDate projectEnd = projectStart.plus(projectDuration);

        System.out.println("Project start: " + projectStart);
        System.out.println("Project duration: " + projectDuration + " (" + projectDuration.toString() + ")");
        System.out.println("Project end: " + projectEnd);

        // Breaking down the period
        System.out.println("Duration breakdown:");
        System.out.println("  Years: " + projectDuration.getYears());
        System.out.println("  Months: " + projectDuration.getMonths());
        System.out.println("  Days: " + projectDuration.getDays());

        // Using the period for calculations
        LocalDate milestone1 = projectStart.plus(Period.parse("P1Y"));      // 1 year milestone
        LocalDate milestone2 = projectStart.plus(Period.parse("P1Y6M"));    // 1.5 year milestone
        LocalDate review = projectEnd.minus(Period.parse("P1M"));           // 1 month before end

        System.out.println("\nProject milestones:");
        System.out.println("1 year milestone: " + milestone1);
        System.out.println("1.5 year milestone: " + milestone2);
        System.out.println("Final review: " + review);
        System.out.println();
    }
}
