package com.modernjava._13abstract.notification;

public class NotificationSenderService {
    public void send(NotificationType type, String message, String recipient) {
        NotificationSender sender = switch (type) {
            case EMAIL -> new EmailNotificationSender();
            case SMS -> new SmsNotificationSender();
            case PUSH -> new PushNotificationSender();
        };
        sender.sendNotification(message, recipient);
    }

    public void sendV2(NotificationRequest request) {
        NotificationSender sender = switch (request.type()) {
            case EMAIL -> new EmailNotificationSender();
            case SMS -> new SmsNotificationSender();
            case PUSH -> new PushNotificationSender();
        };
        sender.sendNotification(request.message(), request.recipient());
    }
}
