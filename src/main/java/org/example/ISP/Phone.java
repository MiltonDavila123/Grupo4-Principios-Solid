package org.example.ISP;

public class Phone implements Switchable, Rechargable{
    @Override
    public void charge() {
        System.out.println("Phone Charging");
    }

    @Override
    public void TurnOn() {
        System.out.println("Phone is turning On");
    }

    @Override
    public void TurnOff() {
        System.out.println("Phone is turning Off");
    }
}
