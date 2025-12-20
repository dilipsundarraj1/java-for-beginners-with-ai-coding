package com.modernjava._12polymorohism.payment.impl;

import com.modernjava._12polymorohism.payment.Payment;

// Implementation of crypto payment
public class CryptoPayment  {
    private String walletAddress;

    // Constructor to initialize crypto payment with amount and wallet address
    public CryptoPayment(double amount, String walletAddress) {
        this.walletAddress = walletAddress;
    }

    // Override pay() method to process crypto payment
}

