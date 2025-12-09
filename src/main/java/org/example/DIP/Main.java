package org.example.DIP;

public class Main {
    public static void main(String[] args) {
        PaymentService creditCardService = new CreditCardService();
        PaymentService debitCardService = new DebitCardService();

        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCardService);
        PaymentProcessor debitCardProcessor = new PaymentProcessor(debitCardService);

        creditCardProcessor.payment(345);
        debitCardProcessor.payment(345);
    }
}
