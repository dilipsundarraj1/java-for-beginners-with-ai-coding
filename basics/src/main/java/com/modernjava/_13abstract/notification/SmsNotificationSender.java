package com.modernjava._13abstract.notification;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
        logNotification(message, recipient);
    }
}
