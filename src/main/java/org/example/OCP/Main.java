package org.example.OCP;

public class Main {
    public static void main(String[] args) {
        NotificationService servicio = new NotificationService();

        servicio.sendNotification(new EmailNotification(), "Hello via Email!");
        servicio.sendNotification(new SMSNotification(), "Hello via SMS!");
        servicio.sendNotification(new PushNotification(), "Hello via Push Notification!");
        servicio.sendNotification(new FaxNotification(), "Hello via Fax!");
    }
}
