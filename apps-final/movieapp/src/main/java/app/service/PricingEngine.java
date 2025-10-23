package app.service;

import app.domain.SeatType;

public final class PricingEngine {
    private PricingEngine() {}
    public static int calculateTicketPrice(int age, boolean member, SeatType seatType) {
        int price = calculateBasePriceByAge(age);
        price = applyMemberDiscount(price, member);
        price = applySeatSurcharge(price, seatType);
        return ensureMinimumPrice(price);
    }
    public static int calculateBasePriceByAge(int age) { return age < 3 ? 0 : age < 12 ? 8 : age < 60 ? 12 : 9; }
    public static int applyMemberDiscount(int price, boolean member) { return (member && price > 0) ? price - 1 : price; }
    public static int applySeatSurcharge(int price, SeatType seatType) {
        int surcharge = switch (seatType) { case REGULAR -> 0; case PREMIUM -> 3; case RECLINER -> 5; };
        return price + surcharge;
    }
    public static int ensureMinimumPrice(int price) { return Math.max(price, 0); }
    public static int calculateBulkDiscount(int totalPrice, int numberOfTickets) {
        int discount = (numberOfTickets / 5) * 2; return Math.max(totalPrice - discount, 0);
    }
    public static String getAgeCategoryName(int age) { return age < 3 ? "Toddler" : age < 12 ? "Child" : age < 60 ? "Adult" : "Senior"; }
    public static String determineTicketCategory(int age, boolean member, SeatType seatType) {
        String ageCategory = age < 3 ? "FREE" : age < 12 ? "CHILD" : age >= 60 ? "SENIOR" : "ADULT";
        String membershipStatus = member ? "MEMBER" : "REGULAR";
        String seatCategory = switch (seatType) { case REGULAR -> "STANDARD"; case PREMIUM -> "PREMIUM"; case RECLINER -> "LUXURY"; };
        boolean premiumCat = (age >= 12 && age < 60 && member && seatType != SeatType.REGULAR);
        String categoryLevel = premiumCat ? "GOLD" : (member && seatType == SeatType.PREMIUM) ? "SILVER" : "BRONZE";
        return String.format("%s-%s-%s (%s)", ageCategory, membershipStatus, seatCategory, categoryLevel);
    }
}
