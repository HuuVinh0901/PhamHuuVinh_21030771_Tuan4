package org.example.payment;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(PaymentStrategy decoratedPayment) {
        super(decoratedPayment);
    }

    public void pay(double amount) {
        double discount = amount * 0.1; // 10% giảm giá
        System.out.println("Áp dụng giảm giá: " + discount);
        super.pay(amount - discount);
    }
}
