package com.modernjava._13abstract.notification;

public class PushNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending PUSH notification to " + recipient + ": " + message);
        logNotification(message, recipient);
    }
}
