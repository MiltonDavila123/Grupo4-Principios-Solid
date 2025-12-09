package org.example.OCP;

public class SMSNotification implements Notification{

    @Override
    public void send(String Message) {
        System.out.println("Sending SMS: "+Message);
    }
}
