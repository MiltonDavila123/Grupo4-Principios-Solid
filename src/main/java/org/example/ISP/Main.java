package org.example.ISP;

public class Main {
    public static void main(String[] args) {
        Switchable phone = new Phone();
        Switchable disposableCamera = new DisposableCamera();

        phone.TurnOn();
        ((Rechargable) phone).charge();

        disposableCamera.TurnOn();
    }
}
