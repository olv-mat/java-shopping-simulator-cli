package com.github.olvmat.shoppingsimulatorcli.main;

import com.github.olvmat.shoppingsimulatorcli.model.card.Card;
import com.github.olvmat.shoppingsimulatorcli.model.list.ProductList;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Matheus Oliveira", 5000);
        ProductList productList = new ProductList();
        System.out.println("Java Shopping Simulator");
    }
}
