package org.example.payment;

public class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " qua PayPal.");
    }
}
