package com.modernjava._12polymorohism.payment.impl;

import com.modernjava._12polymorohism.payment.Payment;

// Implementation of gift card payment
public class GiftCardPayment {
    private String giftCardCode;

    // Constructor to initialize gift card payment with amount and gift card code
    public GiftCardPayment(double amount, String giftCardCode) {
        this.giftCardCode = giftCardCode;
    }

    // Override pay() method to process gift card payment
}

