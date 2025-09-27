package com.github.olvmat.shoppingsimulatorcli.model;

public class CreditCard {
    private final String cardholder;
    private double limit;

    public CreditCard(
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
            System.out.println("Insufficient Limit".toUpperCase());
            return false;
        }
        this.limit -= price;
        return true;
    }
}
