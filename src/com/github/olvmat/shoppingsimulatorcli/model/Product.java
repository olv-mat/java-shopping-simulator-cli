package com.github.olvmat.shoppingsimulatorcli.model;

public class Product {
    private final String name;
    protected final double price;

    public Product(
            String name,
            double price
    ) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f)", this.name, this.price);
    }
}
