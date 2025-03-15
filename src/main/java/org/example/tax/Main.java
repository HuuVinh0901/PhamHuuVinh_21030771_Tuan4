package org.example.tax;

public class Main {
    public static void main(String[] args) {
        Product normalProduct = new Product("Sách", 100, new VATTax());
        Product luxuryProduct = new Product("Đồng hồ Rolex", 1000, new LuxuryTax());
        Product noTaxProduct = new Product("Thực phẩm", 50, new NoTax());

        normalProduct.displayInfo();
        luxuryProduct.displayInfo();
        noTaxProduct.displayInfo();
    }
}

