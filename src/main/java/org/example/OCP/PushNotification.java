package org.example.OCP;

public class PushNotification implements Notification{

    @Override
    public void send(String Message) {
        System.out.println("Sending Push: "+Message);
    }
}
