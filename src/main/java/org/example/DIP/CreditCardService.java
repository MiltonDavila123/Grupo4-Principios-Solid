package org.example.DIP;

public class CreditCardService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
