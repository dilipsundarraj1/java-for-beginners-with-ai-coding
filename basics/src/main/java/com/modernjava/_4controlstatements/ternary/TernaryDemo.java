package com.modernjava._4controlstatements.ternary;

public class TernaryDemo {

    static void main(String[] args) {
        int age = 65;
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

}
