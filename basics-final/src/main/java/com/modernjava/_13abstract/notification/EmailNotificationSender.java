package com.modernjava._13abstract.notification;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending EMAIL to " + recipient + ": " + message);
        logNotification(message, recipient);
    }
}
