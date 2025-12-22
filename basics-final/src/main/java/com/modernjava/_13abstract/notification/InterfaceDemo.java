package com.modernjava._13abstract.notification;

public class InterfaceDemo {

    static void main() {
        NotificationSender emailSender = new EmailNotificationSender();
        emailSender.sendNotification("Hello via Email!", "d@gmail.com");

        NotificationSender smsSender = new SmsNotificationSender();
        smsSender.sendNotification("Hello via SMS!", "123-456-7890");

        NotificationSender pushSender = new PushNotificationSender();
        pushSender.sendNotification("Hello via Push!", "user_device_token");
    }
}
