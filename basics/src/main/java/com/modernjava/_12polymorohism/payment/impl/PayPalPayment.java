package com.modernjava._12polymorohism.payment.impl;

import com.modernjava._12polymorohism.payment.Payment;

// Implementation of PayPal payment
public class PayPalPayment extends Payment {
    private String email;

    // Constructor to initialize PayPal payment with amount and email
    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    // Override pay() method to process PayPal payment
    @Override
    public void pay() {
        System.out.println("Paid $" + amount + " using PayPal: " + email);
    }
}

