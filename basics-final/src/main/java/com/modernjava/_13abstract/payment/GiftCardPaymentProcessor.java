package com.modernjava._13abstract.payment;

public class GiftCardPaymentProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount, String details) {
        System.out.println("Processing gift card payment of $" + amount + " for card: " + details);
        printReceipt(amount);
    }
}

