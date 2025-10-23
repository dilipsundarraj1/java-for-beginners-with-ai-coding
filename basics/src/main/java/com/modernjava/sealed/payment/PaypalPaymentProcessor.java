package com.modernjava.sealed.payment;

public final class PaypalPaymentProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount, String details) {
        System.out.println("Processing PayPal payment of $" + amount + " for account: " + details);
        printReceipt(amount);
    }
}

