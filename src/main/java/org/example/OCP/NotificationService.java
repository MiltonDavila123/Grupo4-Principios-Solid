package org.example.OCP;

public class NotificationService {
    public void sendNotification (Notification notification, String Message){
        notification.send(Message);
    }
}
