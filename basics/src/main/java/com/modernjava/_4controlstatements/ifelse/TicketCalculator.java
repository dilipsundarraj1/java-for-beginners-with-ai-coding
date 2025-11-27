package com.modernjava._4controlstatements.ifelse;

public class TicketCalculator {

    enum SeatType {REGULAR, PREMIUM, RECLINER}

    static void main(String[] args) {

        int age = 34;
        boolean isMember = true;
        SeatType seatType = SeatType.PREMIUM;

        // 1: Determine base price from age via calculateBasePriceByAge.
        // 2: Possibly subtract a flat member discount via applyMemberDiscount.
        // 3: Add a surcharge depending on seat type via applySeatSurcharge

        // Logic 1: Determine base price by age
        /**
         * Determine the base ticket price according to the passenger's age.
         * Uses mutually-exclusive if / else-if / else branches to select one price.
         *
         * Pricing rules:
         * - age < 3 : free (0)
         * - 3 <= age < 12 : child price (8)
         * - 12 <= age < 60 : adult price (12)
         * - age >= 60 : senior price (9)
         *
         */

        // Logic 2: Apply member discount
        /**
         * Apply a member discount to the current price when applicable.
         * If the purchaser is a member and the current price is greater than zero,
         * subtracts a flat $1 discount. The method never produces a negative price
         * (calling code should still validate if stricter guarantees are required).
         *
         */

        // Logic 3: Apply seat surcharge
        /**
         * Apply a seat-type surcharge to the current price.
         * Surcharges are applied based on the selected SeatType:
         * - REGULAR : $0
         * - PREMIUM : $3
         * - RECLINER: $5
         *
         */

    }
}
