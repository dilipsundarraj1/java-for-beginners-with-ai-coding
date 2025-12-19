package com.modernjava._12polymorohism.payment;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(PaymentType.CREDITCARD, 150.0, "1234-5678-9012-3456");
        paymentService.processPayment(PaymentType.PAYPAL, 75.5, "user@example.com");
    }
}
