package com.modernjava._4controlstatements._switch;

public class SwitchDemo {

    enum SeatType { REGULAR, PREMIUM, RECLINER }

    private enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }


    public static int seatSurchargeDollarV1(SeatType seat) {
        return switch (seat) {
            case REGULAR -> 0;
            case PREMIUM -> 2; // $2.50
            case RECLINER -> 5; // $5.00
        };
    }

    public static int seatSurchargeDollar(SeatType seat) {
        int surcharge;
        switch (seat) {
            case REGULAR:
                surcharge = 0;
                break;
            case PREMIUM:
                surcharge =  2; // $2.50
            case RECLINER:
                surcharge =  5; // $5.00
            default:
                throw new IllegalArgumentException("Unknown seat type: " + seat);
        }
        return surcharge;
    }

    public static int seatSurchargeCentsUsingIfElse(SeatType seat) {
        if (seat == SeatType.REGULAR) {
            return 0;
        } else if (seat == SeatType.PREMIUM) {
            return 2; // $2.50
        } else if (seat == SeatType.RECLINER) {
            return 5; // $5.00
        } else {
            throw new IllegalArgumentException("Unknown seat type: " + seat);
        }
    }

    /**
     * Demonstrates switch expressions with multiple case values
     * Shows how to group multiple enum values in a single case using comma separation
     */
    public static int basePriceByDay(Day day) {
        return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY -> 8; // Weekday discount $8.00
            case THURSDAY -> 9; // Regular Thursday price $9.00
            case FRIDAY, SATURDAY, SUNDAY -> 12; // Weekend premium $12.00
        };
    }

    static void main(String[] args) {
        System.out.println("=== Switch Demo - Function Invocations ===\n");

        // Test seatSurchargeDollarV1 (switch expression)
        System.out.println("1. seatSurchargeDollarV1() - Modern Switch Expression:");
        System.out.println("   REGULAR seat: $" + seatSurchargeDollarV1(SeatType.REGULAR));
        System.out.println("   PREMIUM seat: $" + seatSurchargeDollarV1(SeatType.PREMIUM));
        System.out.println("   RECLINER seat: $" + seatSurchargeDollarV1(SeatType.RECLINER));
        System.out.println();

        // Test seatSurchargeDollar (traditional switch statement)
        System.out.println("2. seatSurchargeDollar() - Traditional Switch Statement:");
        System.out.println("   REGULAR seat: $" + seatSurchargeDollar(SeatType.REGULAR));
        System.out.println("   PREMIUM seat: $" + seatSurchargeDollar(SeatType.PREMIUM));
        System.out.println("   RECLINER seat: $" + seatSurchargeDollar(SeatType.RECLINER));
        System.out.println();

        // Test seatSurchargeCentsUsingIfElse (if-else alternative)
        System.out.println("3. seatSurchargeCentsUsingIfElse() - If-Else Alternative:");
        System.out.println("   REGULAR seat: $" + seatSurchargeCentsUsingIfElse(SeatType.REGULAR));
        System.out.println("   PREMIUM seat: $" + seatSurchargeCentsUsingIfElse(SeatType.PREMIUM));
        System.out.println("   RECLINER seat: $" + seatSurchargeCentsUsingIfElse(SeatType.RECLINER));
        System.out.println();

        // Test basePriceByDay (switch with multiple case values)
        System.out.println("4. basePriceByDay() - Switch with Multiple Case Values:");
        System.out.println("   MONDAY: $" + basePriceByDay(Day.MONDAY));
        System.out.println("   TUESDAY: $" + basePriceByDay(Day.TUESDAY));
        System.out.println("   WEDNESDAY: $" + basePriceByDay(Day.WEDNESDAY));
        System.out.println("   THURSDAY: $" + basePriceByDay(Day.THURSDAY));
        System.out.println("   FRIDAY: $" + basePriceByDay(Day.FRIDAY));
        System.out.println("   SATURDAY: $" + basePriceByDay(Day.SATURDAY));
        System.out.println("   SUNDAY: $" + basePriceByDay(Day.SUNDAY));
    }



}
