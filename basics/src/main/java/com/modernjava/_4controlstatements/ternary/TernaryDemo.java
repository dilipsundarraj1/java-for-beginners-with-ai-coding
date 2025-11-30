package com.modernjava._4controlstatements.ternary;

public class TernaryDemo {

    static void main(String[] args) {
        int age = 65;
        var label = ticketlabelUsingIfElse(age);
        System.out.println("label = " + label);

    }

    private static String ticketlabelUsingIfElse(int age) {
        String discountLabel1;
        if (age >= 60) {
            discountLabel1 = "Senior Discount";
        } else {
            discountLabel1 = "Regular Price";
        }

        return discountLabel1;
    }
}
