package com.modernjava._13abstract.notification;

public interface NotificationSender {
    void sendNotification(String message, String recipient);

    default void logNotification(String message,
                                 String recipient) {
        System.out.println("Notification sent to: " +
                recipient + " | Message: " + message);
    }

    static boolean isValidRecipient(String recipient) {
        return recipient != null &&
                !recipient.trim().isEmpty();
    }
}
