package com.github.olvmat.shoppingsimulatorcli.model;

public class Card {
    private final String cardholder;
    private double limit;

    public Card(
            String cardholder,
            double limit
    ) {
        this.cardholder = cardholder;
        this.limit = limit;
    }

    public String getCardholder() {
        return this.cardholder;
    }

    public double getLimit() {
        return this.limit;
    }

    public boolean purchase(Product product) {
        double price = product.price;
        if (price > this.limit) {
            System.out.println("Insufficient Limit");
            return false;
        }
        this.limit -= price;
        return true;
    }
}
