package com.modernjava._13abstract.notification;

public record NotificationRequest(NotificationType type, String message, String recipient) {}

