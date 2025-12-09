package org.example.ISP;

public class DisposableCamera implements Switchable{
    @Override
    public void TurnOn() {
        System.out.println("Disposable Camera is turning On");
    }

    @Override
    public void TurnOff() {
        System.out.println("Disposable Camera is turning Off");
    }
}
