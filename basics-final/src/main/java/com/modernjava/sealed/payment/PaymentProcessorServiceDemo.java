package com.modernjava.sealed.payment;


import com.modernjava._13abstract.payment.PaymentType;

public class PaymentProcessorServiceDemo {
    public static void main(String[] args) {
        var service = new PaymentProcessorService();
        System.out.println("--- Credit Card Payment ---");
        service.process(PaymentType.CREDIT, 100.0, "4111-1111-1111-1111");
        System.out.println("\n--- PayPal Payment ---");
        service.process(PaymentType.PAYPAL, 50.0, "user@example.com");
        System.out.println("\n--- Gift Card Payment ---");
        service.process(PaymentType.GIFTCARD, 25.0, "GIFT-1234-5678");
    }
}

