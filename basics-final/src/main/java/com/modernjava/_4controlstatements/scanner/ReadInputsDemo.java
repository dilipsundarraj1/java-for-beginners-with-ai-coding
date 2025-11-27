package com.modernjava._4controlstatements.scanner;

import java.util.Scanner;

public class ReadInputsDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age (0–120): ");
        var age = sc.nextInt();
        System.out.print("Entered Age is : " + age);

        System.out.print("Are you a member? (true/false): ");
        var isMember = sc.nextBoolean();
        System.out.println("Membership status: " + isMember);

        System.out.print("Enter seat type (STANDARD or PREMIUM): ");
        var seatType = sc.next();
        System.out.println("Seat type selected: " + seatType);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
