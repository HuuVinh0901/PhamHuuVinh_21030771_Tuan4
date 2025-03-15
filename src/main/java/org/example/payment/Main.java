package org.example.payment;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy paypal = new PayPalPayment();

        System.out.println("Thanh toán qua thẻ tín dụng + phí xử lý:");
        PaymentStrategy creditCardWithFee = new ProcessingFeeDecorator(creditCard);
        creditCardWithFee.pay(100);

        System.out.println("\nThanh toán qua PayPal + giảm giá:");
        PaymentStrategy paypalWithDiscount = new DiscountDecorator(paypal);
        paypalWithDiscount.pay(200);

        System.out.println("\nThanh toán qua Ví điện tử + phí xử lý + giảm giá:");
        PaymentStrategy eWalletWithAll = new ProcessingFeeDecorator(new DiscountDecorator(new EWalletPayment()));
        eWalletWithAll.pay(300);
    }
}

