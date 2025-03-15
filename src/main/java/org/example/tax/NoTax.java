package org.example.tax;

public class NoTax implements TaxStrategy {
    public double calculateTax(double price) {
        return 0;
    }
}
