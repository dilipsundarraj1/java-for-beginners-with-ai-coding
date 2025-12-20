package com.modernjava._12polymorohism.payment;

public class PaymentDemo {
    static void main(String[] args) {
        PaymentOrchestratorService paymentOrchestratorService = new PaymentOrchestratorService();
        paymentOrchestratorService.processPayment(PaymentType.CREDITCARD, 150.0, "1234-5678-9012-3456");
        paymentOrchestratorService.processPayment(PaymentType.PAYPAL, 75.5, "user@example.com");
        paymentOrchestratorService.processPayment(PaymentType.GIFTCARD, 50.0, "GIFT-9876-5432");
        paymentOrchestratorService.processPayment(PaymentType.DEBITCARD, 120.0, "4321-8765-2109-6543");
        paymentOrchestratorService.processPayment(PaymentType.CRYPTO, 200.0, "0xABCDEF1234567890");
    }
}
