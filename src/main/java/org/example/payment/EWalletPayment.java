package org.example.payment;

public class EWalletPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " qua Ví điện tử.");
    }
}
