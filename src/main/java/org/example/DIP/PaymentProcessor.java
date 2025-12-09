package org.example.DIP;

public class PaymentProcessor {
    private final PaymentService paymentService;


    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void payment(double amount){
        System.out.println("Doing payment: "+amount);
        paymentService.processPayment(amount);
    }


}
