package com.modernjava._13abstract.payment.v2;

import com.modernjava._13abstract.notification.NotificationSenderService;
import com.modernjava._13abstract.notification.NotificationType;
import com.modernjava._13abstract.notification.NotificationRequest;
import com.modernjava._13abstract.payment.*;

public class PaymentProcessorServiceV2 {
    private final NotificationSenderService notificationService;

    public PaymentProcessorServiceV2(NotificationSenderService notificationService) {
        this.notificationService = notificationService;
    }

    public void process(PaymentType paymentType, NotificationType notificationType, double amount, String details) {
        PaymentProcessor processor = switch (paymentType) {
            case CREDIT -> new CreditCardPaymentProcessor();
            case PAYPAL -> new PaypalPaymentProcessor();
            case GIFTCARD -> new GiftCardPaymentProcessor();
        };
        processor.processPayment(amount, details);
        String message = "Payment of $" + amount + " processed for " + details;
        // notificationService.send(notificationType, message, details); // Commented out as per instruction
        NotificationRequest request = new NotificationRequest(notificationType, message, details);
        notificationService.sendV2(request);
    }
}
