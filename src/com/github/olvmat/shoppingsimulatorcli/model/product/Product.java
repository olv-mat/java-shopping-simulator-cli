package com.github.olvmat.shoppingsimulatorcli.model.product;

public class Product {
    private final String name;
    private final double price;

    public Product(
            String name,
            double price
    ) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.price + ")";
    }
}
