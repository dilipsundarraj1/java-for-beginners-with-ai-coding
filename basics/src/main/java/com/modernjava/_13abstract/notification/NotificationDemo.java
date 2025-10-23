package com.modernjava._13abstract.notification;

public class NotificationDemo {
    public static void main(String[] args) {
        NotificationSenderService service = new NotificationSenderService();
        service.send(NotificationType.EMAIL, "Your order has shipped!", "alice@example.com");
        service.send(NotificationType.SMS, "Your OTP is 123456", "+1234567890");
        service.send(NotificationType.PUSH, "You have a new message!", "user123");
    }
}
