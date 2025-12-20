package com.modernjava._12polymorohism.payment;

public class PaymentOrchestratorService {
    // Use PaymentFactory to create Payment object and process the payment
    public void processPayment(PaymentType type, double amount, String detail) {
        // orchestrate the payment process
        Payment payment = PaymentFactory.createPayment(type, amount, detail);
        payment.pay();
    }
}
