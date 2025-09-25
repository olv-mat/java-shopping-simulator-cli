package com.github.olvmat.shoppingsimulatorcli.main;

import com.github.olvmat.shoppingsimulatorcli.model.card.Card;
import com.github.olvmat.shoppingsimulatorcli.model.list.ProductList;
import com.github.olvmat.shoppingsimulatorcli.model.list.ShoppingList;
import com.github.olvmat.shoppingsimulatorcli.model.product.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Matheus Oliveira", 10000);
        ProductList productList = new ProductList();
        ShoppingList shoppingList = new ShoppingList();

        System.out.println("Java Shopping Simulator");
        List<Product> products = productList.getProducts();
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d - %s%n", (i + 1), products.get(i));
        }
    }
}
