package org.example.OCP;

public class EmailNotification implements Notification{
    @Override
    public void send(String Message) {
        System.out.println("Sending Email: "+Message);
    }
}
