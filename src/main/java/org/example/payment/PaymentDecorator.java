package org.example.payment;

public class PaymentDecorator implements PaymentStrategy {
    protected PaymentStrategy decoratedPayment;

    public PaymentDecorator(PaymentStrategy decoratedPayment) {
        this.decoratedPayment = decoratedPayment;
    }

    public void pay(double amount) {
        decoratedPayment.pay(amount);
    }
}
