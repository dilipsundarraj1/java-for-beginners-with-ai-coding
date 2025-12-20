package com.modernjava._12polymorohism.payment.impl;

import com.modernjava._12polymorohism.payment.Payment;

// Implementation of debit card payment
public class DebitCardPayment  {
    private String debitCardNumber;

    // Constructor to initialize debit card payment with amount and card number
    public DebitCardPayment(double amount, String debitCardNumber) {

        this.debitCardNumber = debitCardNumber;
    }

    // Override pay() method to process debit card payment
}

