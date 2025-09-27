package com.github.olvmat.shoppingsimulatorcli.model;

public class Product implements Comparable<Product> {
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

    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(otherProduct.price, this.price);
    }
}
