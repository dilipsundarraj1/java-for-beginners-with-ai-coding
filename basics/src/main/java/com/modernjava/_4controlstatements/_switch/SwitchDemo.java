package com.modernjava._4controlstatements._switch;

public class SwitchDemo {

    enum SeatType { REGULAR, PREMIUM, RECLINER }

    private enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }


    public static int seatSurchargeUsingIfElse(SeatType seat) {
        if (seat == SeatType.REGULAR) {
            return 0;
        } else if (seat == SeatType.PREMIUM) {
            return 2; // $2.00
        } else if (seat == SeatType.RECLINER) {
            return 5; // $5.00
        } else {
            throw new IllegalArgumentException("Unknown seat type: " + seat);
        }
    }

    static void main() {
        // Test seatSurchargeCentsUsingIfElse (if-else alternative)
        System.out.println("3. seatSurchargeCentsUsingIfElse() - If-Else Alternative:");
        System.out.println("   REGULAR seat: $" + seatSurchargeUsingIfElse(SeatType.REGULAR));
        System.out.println("   PREMIUM seat: $" + seatSurchargeUsingIfElse(SeatType.PREMIUM));
        System.out.println("   RECLINER seat: $" + seatSurchargeUsingIfElse(SeatType.RECLINER));
    }

}
