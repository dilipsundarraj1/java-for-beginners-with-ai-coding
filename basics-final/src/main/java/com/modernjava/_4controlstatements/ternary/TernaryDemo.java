package com.modernjava._4controlstatements.ternary;

public class TernaryDemo {

    public static void main(String[] args) {
        int age = 65;
        var label = ticketLabel(65);

        ticketlabelUsingIfElse(age);

    }

    private static void ticketlabelUsingIfElse(int age) {
        String discountLabel2;
        if (age >= 60) {
            discountLabel2 = "Senior Discount";
        } else {
            discountLabel2 = "Regular Price";
        }
    }

    private static String ticketLabel(int age) {
        String discountLabel = (age >= 60) ? "Senior Discount" : "Regular Price";
        System.out.println(discountLabel);
        return discountLabel;
    }
}
