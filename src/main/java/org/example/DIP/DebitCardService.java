package org.example.DIP;

public class DebitCardService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing debit card payment of $" + amount);
    }
}
