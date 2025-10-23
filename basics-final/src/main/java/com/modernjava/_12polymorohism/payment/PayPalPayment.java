package com.modernjava._12polymorohism.payment;

public class PayPalPayment extends Payment {
    private String email;
    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }
    @Override
    public void pay() {
        System.out.println("Paid $" + amount + " using PayPal: " + email);
    }
}

