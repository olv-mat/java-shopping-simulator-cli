package com.github.olvmat.shoppingsimulatorcli.model.card;

public class Card {
    private final String cardholder;
    private final double limit;

    public Card(
            String cardholder,
            double limit
    ) {
        this.cardholder = cardholder;
        this.limit = limit;
    }
}
