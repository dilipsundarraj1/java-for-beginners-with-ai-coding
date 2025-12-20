package com.modernjava._12polymorohism.payment.impl;

import com.modernjava._12polymorohism.payment.Payment;

public class DebitCardPayment extends Payment {
    private String debitCardNumber;
    public DebitCardPayment(double amount, String debitCardNumber) {
        super(amount);
        this.debitCardNumber = debitCardNumber;
    }
    @Override
    public void pay() {
        System.out.println("Paid $" + amount + " using Debit Card: " + debitCardNumber);
    }
}

