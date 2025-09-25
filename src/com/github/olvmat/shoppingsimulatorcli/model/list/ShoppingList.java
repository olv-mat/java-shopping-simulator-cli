package com.github.olvmat.shoppingsimulatorcli.model.list;

import com.github.olvmat.shoppingsimulatorcli.model.product.Product;

import java.util.LinkedList;
import java.util.List;

public class ShoppingList {
    private final List<Product> products = new LinkedList<>();

    public void add(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return List.copyOf(this.products);
    }
}
