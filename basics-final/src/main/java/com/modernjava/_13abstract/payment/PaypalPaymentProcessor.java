package com.modernjava._13abstract.payment;

public class PaypalPaymentProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount, String details) {
        System.out.println("Processing PayPal payment of $" + amount + " for account: " + details);
        printReceipt(amount);
    }
}

