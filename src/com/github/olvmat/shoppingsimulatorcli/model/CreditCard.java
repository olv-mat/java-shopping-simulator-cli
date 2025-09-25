package com.github.olvmat.shoppingsimulatorcli.model;

public class CreditCard {
    private final String cardholder;
    private final double limit;

    public CreditCard(
            String cardholder,
            double limit
    ) {
        this.cardholder = cardholder;
        this.limit = limit;
    }
}
