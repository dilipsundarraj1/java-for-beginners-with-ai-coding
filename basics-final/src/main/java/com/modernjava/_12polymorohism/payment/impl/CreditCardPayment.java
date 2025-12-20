package com.modernjava._12polymorohism.payment.impl;

import com.modernjava._12polymorohism.payment.Payment;

// Implementation of credit card payment
public class CreditCardPayment extends Payment {
    private String cardNumber;

    // Constructor to initialize credit card payment with amount and card number
    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    // Override pay() method to process credit card payment
    @Override
    public void pay() {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}

