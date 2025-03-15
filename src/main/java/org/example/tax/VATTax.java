package org.example.tax;

public class VATTax implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.1;
    }
}
