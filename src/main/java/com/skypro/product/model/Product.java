package com.skypro.product.model;

public class Product {
    private final String barcode;

    public Product(String barcode) {this.barcode = barcode;}

    public String getBarcode() {return barcode;}

    @Override
    public String toString() {return "ШК " + barcode + "";}
}
