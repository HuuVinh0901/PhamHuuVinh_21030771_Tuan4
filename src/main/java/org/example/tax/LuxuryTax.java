package org.example.tax;

public class LuxuryTax implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.2;
    }
}
