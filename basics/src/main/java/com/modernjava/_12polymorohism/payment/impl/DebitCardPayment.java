package com.modernjava._12polymorohism.payment.impl;

import com.modernjava._12polymorohism.payment.Payment;

// Implementation of debit card payment
public class DebitCardPayment extends Payment {
    private String debitCardNumber;

    // Constructor to initialize debit card payment with amount and card number
    public DebitCardPayment(double amount, String debitCardNumber) {
        super(amount);
        this.debitCardNumber = debitCardNumber;
    }

    // Override pay() method to process debit card payment
    @Override
    public void pay() {
        System.out.println("Paid $" + amount + " using Debit Card: " + debitCardNumber);
    }
}

