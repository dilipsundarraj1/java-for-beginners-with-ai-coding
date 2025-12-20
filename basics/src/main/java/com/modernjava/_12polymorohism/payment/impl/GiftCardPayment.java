package com.modernjava._12polymorohism.payment.impl;

import com.modernjava._12polymorohism.payment.Payment;

// Implementation of gift card payment
public class GiftCardPayment extends Payment {
    private String giftCardCode;

    // Constructor to initialize gift card payment with amount and gift card code
    public GiftCardPayment(double amount, String giftCardCode) {
        super(amount);
        this.giftCardCode = giftCardCode;
    }

    // Override pay() method to process gift card payment
    @Override
    public void pay() {
        System.out.println("Paid $" + amount + " using Gift Card: " + giftCardCode);
    }
}

