package org.example.OCP;

public class FaxNotification implements Notification{
    @Override
    public  void send(String Message) {
        System.out.println("Sending Fax: "+Message);

    }
}
